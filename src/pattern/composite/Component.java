package pattern.composite;

public interface Component {
   void add(Component component);
   void remove(Component component);
   void execute();
}
