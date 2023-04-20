package barbatos_rex1.laprivcore.personal_info.domain;

import java.util.List;
import java.util.Optional;

public interface ProfileService {

    List<ProfileDTO> all();

    List<ProfileDTO> teachers();

    List<ProfileDTO> students();

    List<ProfileDTO> managers();

    Optional<ProfileDTO> profileOfUser(String userId);

    Optional<ProfileDTO> create(ProfileDTO profile);

    Optional<ProfileDTO> delete(String userId);

    Optional<ProfileDTO> patch(ProfileDTO profile);

}
