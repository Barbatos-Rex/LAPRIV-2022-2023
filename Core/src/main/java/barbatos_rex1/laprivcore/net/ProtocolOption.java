package barbatos_rex1.laprivcore.net;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
public enum ProtocolOption {
    COMMTEST(Byte.parseByte("0")),
    DISCONN(Byte.parseByte("1")),
    ACK(Byte.parseByte("2")),
    ERR(Byte.parseByte("3")),
    AUTH(Byte.parseByte("4")),
    SEGMENT(Byte.parseByte("-127"));

    private byte option;





}
