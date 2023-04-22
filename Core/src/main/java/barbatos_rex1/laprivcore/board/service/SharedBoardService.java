package barbatos_rex1.laprivcore.board.service;

import barbatos_rex1.laprivcore.board.domain.*;
import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import barbatos_rex1.laprivcore.user.domain.User;
import barbatos_rex1.laprivcore.user.domain.UserDTO;
import barbatos_rex1.laprivcore.user.domain.UserRepository;
import barbatos_rex1.laprivcore.user.domain.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SharedBoardService implements barbatos_rex1.laprivcore.board.domain.SharedBoardService {
    private SharedBoardRepository repo;
    private SharedBoardMapper mapper;
    private UserService userRepo;


    @Override
    public List<SharedBoardDTO> all() {
        return repo.findAll().stream().map(mapper::toDTO).toList();
    }

    @Override
    public Optional<SharedBoardDTO> board(String boardId) {
        Optional<SharedBoard> opt = repo.findById(StringId.from(boardId));
        if (opt.isEmpty()){
            return Optional.empty();
        }
        return opt.map(mapper::toDTO);
    }

    @Override
    public Optional<SharedBoardDTO> create(SharedBoardDTO board) {
        SharedBoard sb = mapper.toDomain(board);
        sb = repo.save(sb);
        if (sb == null) {
            return Optional.empty();
        }
        return Optional.of(mapper.toDTO(sb));
    }

    @Override
    public List<SharedBoardDTO> userBoards(String userId) {
        return repo.findSharedBoardByOwner(StringId.from(userId)).stream().map(mapper::toDTO).toList();
    }

    @Override
    public List<SharedBoardDTO> accessebleBoards(String userId) {
        return repo.findAccessibleSharedBoardsByUser(StringId.from(userId)).stream().map(mapper::toDTO).toList();
    }

    @Override
    public Optional<SharedBoardDTO> delete(String boardId) {
        Optional<SharedBoard> opt = repo.findById(StringId.from(boardId));
        if (opt.isEmpty()){
            return Optional.empty();
        }
        repo.delete(opt.get());
        return opt.map(mapper::toDTO);
    }

    @Override
    public Optional<SharedBoardDTO> addParticipant(String boardId, String participantId, PermissionLevel permission) {
        Optional<SharedBoard> opt = repo.findById(StringId.from(boardId));
        Optional<UserDTO> u = userRepo.user(participantId);
        if (opt.isEmpty()||u.isEmpty()){
            return Optional.empty();
        }
        BoardParticipantDTO dto = new BoardParticipantDTO(null,u.get(),permission);

        opt.get().getBoardParticipants().add(mapper.toDomain(dto));
        return opt.map(mapper::toDTO);
    }
}
