package pattern.visitor;

public class ElementSecond implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void execute() {

    }
}
