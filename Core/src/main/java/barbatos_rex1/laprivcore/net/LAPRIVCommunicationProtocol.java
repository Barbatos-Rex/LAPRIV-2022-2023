package barbatos_rex1.laprivcore.net;

public interface LAPRIVCommunicationProtocol {

    boolean send(Packet packet);
    Packet recieve();



}
