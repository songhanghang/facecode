package pattern.state;

public class State2 implements State {
    @Override
    public void handle(Context context) {
        if ("2".equals("2")) {
            context.setState(new State1());
        }
    }
}
