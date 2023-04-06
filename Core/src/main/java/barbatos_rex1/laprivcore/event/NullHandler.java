package barbatos_rex1.laprivcore.event;

final class NullHandler extends Handler {

    @Override
    protected boolean accepts(Event event) {
        return false;
    }

    @Override
    protected void handle(Event event) {
        //It is intended to be a blanck override. The NullHandler is just a placeholder to remove the possibility of calling a null handler
    }
}
