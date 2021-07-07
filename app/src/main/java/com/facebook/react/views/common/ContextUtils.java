package com.facebook.react.views.common;

import android.content.Context;
import android.content.ContextWrapper;
import javax.annotation.Nullable;

public class ContextUtils {
    @Nullable
    public static <T> T findContextOfType(@Nullable Context context, Class<? extends T> cls) {
        Context baseContext;
        while (!cls.isInstance(context)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = (T) baseContext;
        }
        return (T) context;
    }
}
