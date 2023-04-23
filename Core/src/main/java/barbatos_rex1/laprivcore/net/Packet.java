package barbatos_rex1.laprivcore.net;

public interface Packet {
    byte id();
    ProtocolOption code();
    int lenght();
}
