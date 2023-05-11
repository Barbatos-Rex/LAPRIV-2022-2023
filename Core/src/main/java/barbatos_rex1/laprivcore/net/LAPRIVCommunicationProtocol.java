package barbatos_rex1.laprivcore.net;

import java.net.Socket;

public interface LAPRIVCommunicationProtocol {

    boolean send(Packet packet);
    Packet recieve();

    Socket connection();



}
