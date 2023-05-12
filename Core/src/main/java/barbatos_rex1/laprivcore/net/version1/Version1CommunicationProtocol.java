package barbatos_rex1.laprivcore.net.version1;

import barbatos_rex1.laprivcore.net.*;
import lombok.SneakyThrows;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Version1CommunicationProtocol implements LAPRIVCommunicationProtocol {

    private static final int TRIES = 3;
    private Socket connection;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private PacketConstructor pc = new Version1PacketConstructor();

    @SneakyThrows
    public Version1CommunicationProtocol(Socket connection) {
        this.connection = connection;
        out = new ObjectOutputStream(connection.getOutputStream());
        in = new ObjectInputStream(connection.getInputStream());
    }

    @Override
    @SneakyThrows
    public synchronized boolean send(Object packet, ProtocolOption option) {
        List<Packet> packets = pc.fragment(packet, option);
        for (Packet p : packets) {
            out.writeObject(p);
        }
        return confirmation();
    }

    @SneakyThrows
    private synchronized boolean confirmation() {
        return ((Packet) in.readObject()).code() == ProtocolOption.ACK;
    }


    @Override
    @SneakyThrows
    public synchronized PacketPair recieve() {
        List<Packet> stream = new ArrayList<>();
        ProtocolOption option;
        do {
            Packet packet = ((Packet) in.readObject());
            option = packet.code();
            stream.add(packet);
        } while (option == ProtocolOption.SEGMENT);
        PacketPair pair = pc.defragment(stream);
        out.writeObject(new Version1Packet(ProtocolOption.ACK, new byte[0]));
        return pair;

    }

    @Override
    public Socket connection() {
        return this.connection;
    }
}
