package barbatos_rex1.laprivcore.event.handlers;

import barbatos_rex1.laprivcore.event.Event;
import barbatos_rex1.laprivcore.event.Handler;

public class NullHandler extends Handler {
    @Override
    public boolean accepts(Event event) {
        return false;
    }

    @Override
    public void handle(Event event) {
    }
}
