package pattern.record;

public class User {
    String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Record save() {
        return new Record(state);
    }

    public void restore(Record record) {
        setState(record.getState());
    }
}
