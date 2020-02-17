package pattern.command;

public class Client {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void sendCommand() {
        command.execute();
    }
}
