package pattern.visitor;

public class VisitorFirst implements Visitor {
    @Override
    public void visit(ElementFirst first) {
        System.out.println("VisitorFirst 执行 " );
        first.execute();
    }

    @Override
    public void visit(ElementSecond second) {
        System.out.println("VisitorFirst 执行 " );
        second.execute();
    }
}
