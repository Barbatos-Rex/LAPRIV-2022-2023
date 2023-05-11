package barbatos_rex1.laprivcore.net;

import lombok.SneakyThrows;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

@Component
@Order(10)
public class Version1CommunicationProtocol implements LAPRIVCommunicationProtocol {

    private Socket connection;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    @SneakyThrows
    public Version1CommunicationProtocol(Socket connection) {
        this.connection = connection;
        out = new ObjectOutputStream(connection.getOutputStream());
        in = new ObjectInputStream(connection.getInputStream());
    }

    @Override
    @SneakyThrows
    public synchronized boolean send(Packet packet) {
        out.writeObject(packet);
        Packet response = ((Packet) in.readObject());
        if(response.code()!=ProtocolOption.ACK){
            return true;
        }
        return send(packet);
    }

    @Override
    @SneakyThrows
    public synchronized Packet recieve() {
        Packet packet = ((Packet) in.readObject());
        send(packet.ack());
        return packet;
    }

    @Override
    public Socket connection() {
        return this.connection;
    }
}
