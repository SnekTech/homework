package context_design;

public abstract class ContextWrapper extends Context {

    Context mBase;

    public ContextWrapper(Context context)
    {
        mBase = context;
    }

    @Override
    public abstract void start();

    @Override
    public abstract String getDescription();
}
