package barbatos_rex1.laprivcore.board.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;

import java.util.List;
import java.util.Optional;

public interface SharedBoardService {
    List<SharedBoardDTO> all();

    Optional<SharedBoardDTO> board(String boardId);

    Optional<SharedBoardDTO> create(SharedBoardDTO board);

    List<SharedBoardDTO> userBoards(String userId);

    List<SharedBoardDTO> accessebleBoards(String userId);

    Optional<SharedBoardDTO> delete(String boardId);

    Optional<SharedBoardDTO> addParticipant(String boardId, String participantId, PermissionLevel permission);
}
