package barbatos_rex1.laprivcore.personal_info.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Profile {


    @OneToOne(orphanRemoval = true)
    @MapsId
    @Id
    private User id;

    private BirthDate birthDate;

    private TaxNumber taxNumber;

//    @OneToOne
//    private Calendar calendar;

}
