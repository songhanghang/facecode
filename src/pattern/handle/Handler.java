package pattern.handle;

public abstract class Handler {

    private Handler next;

    void setNext(Handler handler) {
        next = handler;
    }

    public Handler getNext() {
        return next;
    }

    abstract boolean handle(String event);
}
