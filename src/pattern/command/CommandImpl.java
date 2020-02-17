package pattern.command;

public class CommandImpl implements Command{
    private Server server;

    CommandImpl() {
        server = new Server();
    }

    @Override
    public void execute() {
        server.action();
    }
}
