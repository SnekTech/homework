package context_design;

public class ContextWrapper extends Context {

    Context mBase;

    public ContextWrapper(Context context)
    {
        mBase = context;
    }

    @Override
    public void start() {
        mBase.start();
    }

    @Override
    public String getDescription() {
        return mBase.getDescription();
    }
}
