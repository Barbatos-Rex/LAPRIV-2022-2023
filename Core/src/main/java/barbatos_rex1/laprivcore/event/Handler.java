package barbatos_rex1.laprivcore.event;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Handler {

    private Handler next = null;


    void append(Handler next) {
        if (this.next == null) {
            this.next = next;
            return;
        }
        this.next.append(next);
    }

    protected abstract boolean accepts(Event event);

    protected abstract void handle(Event event);

    public void cascade(Event event) {
        if (accepts(event)) {
            handle(event);
        }
        cascade(event);
    }

}
