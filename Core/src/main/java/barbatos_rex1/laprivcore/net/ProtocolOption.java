package barbatos_rex1.laprivcore.net;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
public enum ProtocolOption {
    POST(Byte.parseByte("0")),
    DELETE(Byte.parseByte("1")),
    MEMENTO_BACK(Byte.parseByte("2")),
    MEMENTO_FOWARD(Byte.parseByte("3")),
    MOVE_POST(Byte.parseByte("4"));

    private byte option;





}
