package barbatos_rex1.laprivcore.personal_info;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Profile {

    @EmbeddedId
    private StringId id;


    private BirthDate birthDate;

    private TaxNumber taxNumber;

//    @OneToOne
//    private Calendar calendar;








}