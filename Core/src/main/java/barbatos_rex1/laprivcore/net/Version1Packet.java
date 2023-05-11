package barbatos_rex1.laprivcore.net;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Version1Packet implements Packet {
    private ProtocolOption code;
    private PositiveByte length1;
    private PositiveByte length2;

    private List<Byte> bytes;
    private static final int MAX_INT = 256 * 256 + 255;

    public Version1Packet(ProtocolOption code) {
        this.code = code;
        this.length1 = PositiveByte.of(0);
        this.length2 = PositiveByte.of(0);
        this.bytes = new ArrayList<>();
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
    @SneakyThrows
    public boolean appendObject(Object object) {
        List<Byte> tmp = new ArrayList<>();
        ByteArrayOutputStream bros = new ByteArrayOutputStream();
        ObjectOutputStream osw = new ObjectOutputStream(bros);
        osw.writeObject(object);
        var arr = bros.toByteArray();
        for (byte b : arr) {
            tmp.add(b);
        }
        if (tmp.size() >= MAX_INT) {
            return false;
        }
        this.bytes = tmp;
        return true;
    }

    @Override
    public Packet ack() {
        return new Version1Packet(ProtocolOption.ACK);
    }
}
