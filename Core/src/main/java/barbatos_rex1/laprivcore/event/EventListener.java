package barbatos_rex1.laprivcore.event;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class EventListener {
    @SuppressWarnings("java:S3014")
    ThreadGroup eventThreadGroup = new ThreadGroup("LAPRIV Event Listener");
    private Handler chain = new NullHandler();

    public void addListener(Handler handler) {
        chain.append(handler);
    }

    public void registerEvent(Event event) {
        EventCoordinator coordinator = new EventCoordinator(event, chain);
        StringBuilder sb = new StringBuilder(event.getDescription());
        sb.append(" id:").append(event.getId());
        Thread eventThread = new Thread(eventThreadGroup, coordinator, sb.toString());
        eventThread.start();
    }

    public int activeThreads() {
        return eventThreadGroup.activeCount();
    }
    @AllArgsConstructor
    private class EventCoordinator implements Runnable {
        private Event event;
        private Handler chain;

        @Override
        public void run() {
            chain.cascade(event);
        }
    }


}
