package barbatos_rex1.laprivcore.net;

import java.util.List;

public interface Packet {
    PositiveByte version();
    ProtocolOption code();
    int lenght();
    PositiveByte length1();
    PositiveByte length2();
    List<Byte> data();

    boolean appendObject(Object object);

    Packet ack();
}
