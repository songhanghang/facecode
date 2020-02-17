package pattern.handle;

public class Handler1 extends Handler {
    @Override
    boolean handle(String event) {
        if (event.equals("Handle1")) {
            return true;
        } else {
            Handler next = getNext();
            if (next != null) {
                return next.handle(event);
            } else {
                return false;
            }
        }
    }
}
