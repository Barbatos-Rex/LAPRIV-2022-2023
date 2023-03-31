package barbatos_rex1.laprivcore.personal_info;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class TaxNumber {

    private String taxNumber;

    public static TaxNumber from(String taxNumber) {
        return new TaxNumber(taxNumber);
    }


}
