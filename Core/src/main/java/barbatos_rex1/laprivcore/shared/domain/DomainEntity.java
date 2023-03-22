package barbatos_rex1.laprivcore.shared.domain;

import java.io.Serializable;

public interface DomainEntity extends Serializable {

    EntityId rawId();

    boolean sameAs(DomainEntity other);

}
