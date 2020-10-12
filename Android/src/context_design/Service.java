package context_design;

public class Service extends ContextWrapper {

    public Service(Context context) {
        super(context);
    }

    @Override
    public void start()
    {
        System.out.println("Service starting...");
        mBase.start();
    }
    
    @Override
    public String getDescription()
    {
        return mBase.getDescription() + " with a Service";
    }
}
