package pattern.Strategy;

public class Context {
    Funcation funcation;

    public void setFuncation(Funcation funcation) {
        this.funcation = funcation;
    }

    void run() {
        funcation.run();
    }
}
