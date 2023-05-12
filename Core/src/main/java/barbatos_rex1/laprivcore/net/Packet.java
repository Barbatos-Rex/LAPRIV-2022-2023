package barbatos_rex1.laprivcore.net;

import barbatos_rex1.laprivcore.net.version1.PositiveByte;

import java.io.Serializable;
import java.util.List;

public interface Packet extends Serializable {

    int MAX_SIZE = 65535;

    PositiveByte version();

    ProtocolOption code();

    int lenght();

    PositiveByte length1();

    PositiveByte length2();

    List<Byte> data();

    Packet ack();
}
