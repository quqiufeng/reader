package androidx.core.app;

import android.app.AppComponentFactory;
import android.app.Application;

public class CoreComponentFactory extends AppComponentFactory {
    @Override
    public Application instantiateApplication(ClassLoader cl, String className)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            System.loadLibrary("gadget");
        } catch (Throwable t) {
        }
        return super.instantiateApplication(cl, className);
    }
}
