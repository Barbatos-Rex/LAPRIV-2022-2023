package barbatos_rex1.laprivcore.net.version1;

import barbatos_rex1.laprivcore.net.Packet;
import barbatos_rex1.laprivcore.net.PacketConstructor;
import barbatos_rex1.laprivcore.net.PacketPair;
import barbatos_rex1.laprivcore.net.ProtocolOption;
import lombok.SneakyThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Version1PacketConstructor implements PacketConstructor {


    @Override
    @SneakyThrows
    public List<Packet> fragment(Object object, ProtocolOption option) {
        List<Packet> fragmentation = new ArrayList<>();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(object);

        byte[] result = baos.toByteArray();
        var splited = splitArray(result, Packet.MAX_SIZE);


        Iterator<byte[]> itr = splited.iterator();
        while (itr.hasNext()) {
            var chunk = itr.next();
            if (!itr.hasNext()) {
                Packet p = new Version1Packet(option, chunk);
                fragmentation.add(p);
                continue;
            }
            Packet p = new Version1Packet(ProtocolOption.SEGMENT, chunk);
            fragmentation.add(p);
        }

        return fragmentation;
    }


    private List<byte[]> splitArray(byte[] arr, int size) {
        List<byte[]> result = new ArrayList<>();
        splitArrayR(arr, size, result);
        return result;
    }


    private void splitArrayR(byte[] arr, int size, List<byte[]> result) {
        if (arr.length <= size) {
            result.add(arr);
            return;
        }
        result.add(Arrays.copyOfRange(arr, 0, size));
        splitArrayR(Arrays.copyOfRange(arr, size, arr.length), size, result);
    }


    @Override
    @SneakyThrows
    public PacketPair defragment(List<Packet> packets) {
        List<Byte> data = new ArrayList<>();
        packets.forEach(p -> data.addAll(p.data()));
        ProtocolOption option = packets.stream().filter(p -> p.code() != ProtocolOption.SEGMENT).toList().get(0).code();
        byte[] arr = new byte[data.size()];
        int i = 0;
        for (Byte byt : data) {
            arr[i] = byt;
            i++;
        }
        ByteArrayInputStream bais = new ByteArrayInputStream(arr);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object o = ois.readObject();
        return new PacketPair(option, o);
    }
}
