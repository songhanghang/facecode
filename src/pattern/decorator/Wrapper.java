package pattern.decorator;

public class Wrapper implements Component {
    final Component target;

    public Wrapper(Component target) {
        this.target = target;
    }

    @Override
    public void operation() {
        target.operation();
    }
}
