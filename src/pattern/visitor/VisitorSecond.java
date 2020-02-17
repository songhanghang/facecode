package pattern.visitor;

public class VisitorSecond implements Visitor {
    @Override
    public void visit(ElementFirst first) {

        System.out.println("ElementFirst 执行 " );
        first.execute();
    }

    @Override
    public void visit(ElementSecond second) {
        System.out.println("VisitorSecond 执行 " );
        second.execute();
    }
}
