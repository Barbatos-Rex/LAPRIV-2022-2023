package barbatos_rex1.laprivcore.event;

import barbatos_rex1.laprivcore.event.handlers.NullHandler;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Handler{

    private Handler next=new NullHandler();

    void append(Handler next){
        if(this.next instanceof NullHandler){
            this.next=next;
        }
        this.next.append(next);
    }

    protected abstract boolean accepts(Event event);

    protected abstract void handle(Event event);

    public void cascade(Event event){
        if(accepts(event)){
           handle(event);
        }
        cascade(event);
    }

}
