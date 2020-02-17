package pattern.composite;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private final List<Component> list = new ArrayList<>();

    // Root
    public Composite() {

    }

    public Composite(@NotNull Composite parent) {
        parent.add(this);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void execute() {
        for (Component component: list) {
            component.execute();
        }
    }
}
