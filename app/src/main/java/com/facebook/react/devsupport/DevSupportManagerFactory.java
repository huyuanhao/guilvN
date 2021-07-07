package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.packagerconnection.RequestHandler;
import com.p118pd.sdk.C9058ooOoOoOO;
import java.util.Map;
import javax.annotation.Nullable;

public class DevSupportManagerFactory {
    public static final String DEVSUPPORT_IMPL_CLASS = "DevSupportManagerImpl";
    public static final String DEVSUPPORT_IMPL_PACKAGE = "com.facebook.react.devsupport";

    public static DevSupportManager create(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper, @Nullable String str, boolean z, int i) {
        return create(context, reactInstanceManagerDevHelper, str, z, null, null, i, null);
    }

    public static DevSupportManager create(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper, @Nullable String str, boolean z, @Nullable RedBoxHandler redBoxHandler, @Nullable DevBundleDownloadListener devBundleDownloadListener, int i, @Nullable Map<String, RequestHandler> map) {
        if (!z) {
            return new DisabledDevSupportManager();
        }
        try {
            return (DevSupportManager) Class.forName(DEVSUPPORT_IMPL_PACKAGE + C9058ooOoOoOO.OooOO0 + DEVSUPPORT_IMPL_CLASS).getConstructor(Context.class, ReactInstanceManagerDevHelper.class, String.class, Boolean.TYPE, RedBoxHandler.class, DevBundleDownloadListener.class, Integer.TYPE, Map.class).newInstance(context, reactInstanceManagerDevHelper, str, true, redBoxHandler, devBundleDownloadListener, Integer.valueOf(i), map);
        } catch (Exception e) {
            throw new RuntimeException("Requested enabled DevSupportManager, but DevSupportManagerImpl class was not found or could not be created", e);
        }
    }
}
