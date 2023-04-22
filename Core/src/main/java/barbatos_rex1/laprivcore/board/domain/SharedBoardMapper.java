package barbatos_rex1.laprivcore.board.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.shared.domain.value_objects.Title;
import barbatos_rex1.laprivcore.user.domain.UserMapper;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@AllArgsConstructor
public class SharedBoardMapper {
    private UserMapper userMapper;
   private SharedBoardRepository sharedBoardRepository;

    private BoardAlterationDTO toDTO(BoardAlteration domain) {
        BoardParticipantDTO dto = new BoardParticipantDTO(domain.getActor().getId(), userMapper.toDTO(domain.getActor().getUser()), domain.getActor().getAccessLevel());
        return new BoardAlterationDTO(domain.getId(), dto, domain.getAlteration().getAlteration());
    }

    private BoardMementoDTO toDTO(BoardStateMemento domain) {
        if (domain == null) {
            return null;
        }

        var logDTO = new BoardLogDTO();
        logDTO.id = domain.getStateLog().getId();
        Map<Date, BoardAlterationDTO> map = new HashMap<>();
        domain.getStateLog().getLog().entrySet().stream().forEach(e -> map.put(e.getKey().getStamp(), toDTO(e.getValue())));
        logDTO.alterations = map;
        return new BoardMementoDTO(domain.getId(), toDTO(domain.getPreviousState()), logDTO);
    }

    public SharedBoardDTO toDTO(SharedBoard domain) {
        SharedBoardDTO dto = new SharedBoardDTO();
        dto.id = domain.getId().getId();
        dto.boardName = domain.getBoardName().getTitle();

        dto.owner = new BoardParticipantDTO();
        dto.owner.id = domain.getOwner().getId();
        dto.owner.permission = domain.getOwner().getAccessLevel();
        dto.owner.user = userMapper.toDTO(domain.getOwner().getUser());

        dto.participants = domain.getBoardParticipants().stream().
                map(p -> new BoardParticipantDTO(p.getId(),
                        userMapper.toDTO(p.getUser()), p.getAccessLevel()))
                .toList();

        dto.memento = toDTO(domain.getMemento());
        dto.collumns = domain.getColList().stream().map(c -> toDTO(c)).toList();
        dto.rows = domain.getBoardRowList().stream().map(r -> toDTO(r)).toList();
        dto.posts = new HashSet<>(domain.getPosts().stream().map(p -> toDTO(p)).toList());
        return dto;
    }

    private PostDTO toDTO(Post domain) {
        PostDTO post = new PostDTO();
        post.id = domain.getId();
        post.row = toDTO(domain.getBoardRow());
        post.collumn = toDTO(domain.getBoardBoardColumn());
        post.content=domain.getPostContent().getContent();
        post.stamp=domain.getStamp().getStamp();
        return post;
    }

    private RowDTO toDTO(BoardRow domain) {
        return new RowDTO(domain.getId(), domain.getTitle().getTitle(), domain.getNumber().getIndex());
    }

    private CollumnDTO toDTO(BoardColumn domain) {
        return new CollumnDTO(domain.getId(), domain.getTitle().getTitle(), domain.getNumber().getIndex());
    }

    @SneakyThrows
    public SharedBoard toDomain(SharedBoardDTO dto) {
        SharedBoard.SharedBoardBuilder builder = SharedBoard.builder();

        return builder.id(StringId.from(dto.id)).boardName(Title.from(dto.boardName)).memento(toDomain(dto.memento)).
                colList(dto.collumns.stream().map(this::toDomain).toList())
                .boardRowList(dto.rows.stream().map(this::toDomain).toList())
                .posts(new HashSet<>(dto.posts.stream().map(p -> toDomain(p)).toList())).build();
    }

    private Post toDomain(PostDTO dto) {
        return Post.builder().id(dto.id)
                .boardRow(toDomain(dto.row)).
                boardBoardColumn(toDomain(dto.collumn)).
                postContent(PostContent.from(dto.content)).stamp(TimeStamp.from(dto.stamp))
                .build();
    }

    @SneakyThrows
    private BoardRow toDomain(RowDTO dto) {
        return BoardRow.builder().id(dto.id).title(Title.from(dto.title)).number(Index.from(dto.index)).build();
    }

    @SneakyThrows
    private BoardColumn toDomain(CollumnDTO dto) {
        return BoardColumn.builder().id(dto.id).title(Title.from(dto.title)).number(Index.from(dto.index)).build();
    }

    private BoardStateMemento toDomain(BoardMementoDTO dto) {
        if (dto == null) {
            return null;
        }
        BoardStateMemento.BoardStateMementoBuilder builder = BoardStateMemento.builder();
        Set<Post> posts = sharedBoardRepository.mementoPosts(dto.id);
        if (posts==null){
            posts=new HashSet<>();
        }
        return builder.id(dto.id).nextState(null).previousState(toDomain(dto.previousState))
                .postsStates(posts).stateLog(toDomain(dto.log)).build();
    }

    private BoardLog toDomain(BoardLogDTO dto) {
        Map<TimeStamp, BoardAlteration> map = new HashMap<>();
        dto.alterations.entrySet().forEach(e -> map.put(TimeStamp.from(e.getKey()),toDomain(e.getValue())));
        return BoardLog.builder().id(dto.id).log(map).build();
    }

    private BoardAlteration toDomain(BoardAlterationDTO dto) {
        return BoardAlteration.builder().id(dto.id).alteration(Alteration.from(dto.alteration))
                .actor(toDomain(dto.actor)).build();
    }

    public BoardParticipant toDomain(BoardParticipantDTO dto) {
        return BoardParticipant.builder().accessLevel(dto.permission)
                .id(dto.id).user(userMapper.toDomain(dto.user).getProxi()).build();
    }
}
