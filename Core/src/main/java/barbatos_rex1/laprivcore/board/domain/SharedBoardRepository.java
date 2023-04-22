package barbatos_rex1.laprivcore.board.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface SharedBoardRepository extends JpaRepository<SharedBoard, StringId> {


    @Query("SELECT bs.postsStates FROM BoardStateMemento bs WHERE bs.id=?1")
    Set<Post> mementoPosts(Long mementoId);

    @Query("SELECT sb from SharedBoard sb WHERE sb.owner.user.id=?1")
    List<SharedBoard> findSharedBoardByOwner(StringId ownerId);

    @Query("SELECT sb FROM SharedBoard sb LEFT JOIN BoardParticipant bp WHERE sb.owner.id=?1 OR bp.user.id=?1")
    List<SharedBoard> findAccessibleSharedBoardsByUser(StringId userId);

}
