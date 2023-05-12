package barbatos_rex1.laprivcore.net;

import java.util.List;

public interface PacketConstructor {

    List<Packet> fragment(Object object, ProtocolOption option);

    PacketPair defragment(List<Packet> packets);
}
