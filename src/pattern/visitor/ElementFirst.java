package pattern.visitor;

public class ElementFirst implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void execute() {

    }
}
