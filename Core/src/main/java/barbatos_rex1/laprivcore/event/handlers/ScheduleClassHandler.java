package barbatos_rex1.laprivcore.event.handlers;

import barbatos_rex1.laprivcore.event.Event;
import barbatos_rex1.laprivcore.event.Handler;
import barbatos_rex1.laprivcore.event.event.ScheduleClassEvent;
import barbatos_rex1.laprivcore.personal_info.domain.ProfileService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ScheduleClassHandler extends Handler {


    private ProfileService service;

    @Override
    protected boolean accepts(Event event) {
        return event instanceof ScheduleClassEvent;
    }

    @Override
    protected void handle(Event event) {
        var scheduleEvent = ((ScheduleClassEvent) event);

//        service.scheduleMeeting();
    }
}
