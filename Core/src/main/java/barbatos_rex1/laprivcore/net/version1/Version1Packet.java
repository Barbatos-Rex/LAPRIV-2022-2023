package barbatos_rex1.laprivcore.net.version1;

import barbatos_rex1.laprivcore.net.Packet;
import barbatos_rex1.laprivcore.net.ProtocolOption;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Version1Packet implements Packet, Serializable {
    private ProtocolOption code;
    private PositiveByte length1;
    private PositiveByte length2;

    private List<Byte> bytes;

    public Version1Packet(ProtocolOption code, byte[] data) {
        this.code = code;
        this.length1 = PositiveByte.of(data.length % 256);
        this.length2 = PositiveByte.of(data.length / 256);
        this.bytes = new ArrayList<>();
        for (byte byt : data) {
            bytes.add(byt);
        }
    }

    @Override
    public PositiveByte version() {
        return PositiveByte.of(1);
    }

    @Override
    public ProtocolOption code() {
        return code;
    }

    @Override
    public int lenght() {
        return length1.getPositiveByte() + 256 * length2.getPositiveByte();
    }

    @Override
    public PositiveByte length1() {
        return length1;
    }

    @Override
    public PositiveByte length2() {
        return length2;
    }

    @Override
    public List<Byte> data() {
        return bytes;
    }

    @Override
    public Packet ack() {
        return new Version1Packet(ProtocolOption.ACK, new byte[0]);
    }
}
