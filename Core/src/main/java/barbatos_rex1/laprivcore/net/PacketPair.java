package barbatos_rex1.laprivcore.net;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class PacketPair {
    private ProtocolOption option;
    private Object object;


}
