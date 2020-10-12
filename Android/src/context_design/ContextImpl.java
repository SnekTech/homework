package context_design;

public class ContextImpl extends Context {
    @Override
    public void start() {
        System.out.println("Context starting...");
    }

    @Override
    public String getDescription() {
        return "A context";
    }
}
