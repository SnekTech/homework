package context_design;

public class Main {
    public static void main(String[] args) {
        Context context1 = new ContextImpl();
        context1 = new Acitvity(context1);
        Context context2 = new ContextImpl();
        context2 = new Service(context2);
        testContext(context1, 1);
        testContext(context2, 2);
    }

    public static void testContext(Context context, int i) {
        context.start();
        System.out.println("---------------------------");
        System.out.println("Context" + i + " Description: " + context.getDescription());
        System.out.println("***************************");
    }
}
