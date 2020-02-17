package pattern.visitor;

public interface Element {
    void accept(Visitor visitor);
    void execute();
}
