package pattern.visitor;

public interface Visitor {
    void visit(ElementFirst first);
    void visit(ElementSecond second);
}
