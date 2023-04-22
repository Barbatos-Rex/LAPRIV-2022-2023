package barbatos_rex1.laprivcore.board.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    public long id;
    public RowDTO row;
    public CollumnDTO collumn;
    public String content;
    public Date stamp;
}
