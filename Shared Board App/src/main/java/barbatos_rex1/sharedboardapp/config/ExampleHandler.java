package barbatos_rex1.sharedboardapp.config;

import barbatos_rex1.laprivcore.event.Event;
import barbatos_rex1.laprivcore.event.Handler;

public class ExampleHandler extends Handler {
    @Override
    protected boolean accepts(Event event) {
        return false;
    }

    @Override
    protected void handle(Event event) {

    }
}
