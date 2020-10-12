package context_design;

public class Acitvity extends ContextWrapper {
    public Acitvity(Context context) {
        super(context);
    }

    @Override
    public void start()
    {
        System.out.println("Activity starting...");
        mBase.start();
    }

    @Override
    public String getDescription()
    {
        return mBase.getDescription() + " with an Activity";
    }
}
