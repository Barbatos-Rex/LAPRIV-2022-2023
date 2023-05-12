package barbatos_rex1.laprivcore.net;

import java.net.Socket;

public interface LAPRIVCommunicationProtocol {

    boolean send(Object object, ProtocolOption code);
    PacketPair recieve();

    Socket connection();



}
