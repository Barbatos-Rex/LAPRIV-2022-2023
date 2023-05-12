package barbatos_rex1.laprivcore.net.version1;

import barbatos_rex1.laprivcore.shared.utils.Validations;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PositiveByte implements Serializable {
    private int positiveByte;

    public static PositiveByte of(int positiveByte){
        Validations.isTrue(positiveByte>=0 && positiveByte<=255);
        return new PositiveByte(positiveByte);
    }

    
    
    
}
