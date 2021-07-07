package com.facebook.react.views.imagehelper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class ResourceDrawableIdHelper {
    public static final String LOCAL_RESOURCE_SCHEME = "res";
    public static volatile ResourceDrawableIdHelper sResourceDrawableIdHelper;
    public Map<String, Integer> mResourceDrawableIdMap = new HashMap();

    public static ResourceDrawableIdHelper getInstance() {
        if (sResourceDrawableIdHelper == null) {
            synchronized (ResourceDrawableIdHelper.class) {
                if (sResourceDrawableIdHelper == null) {
                    sResourceDrawableIdHelper = new ResourceDrawableIdHelper();
                }
            }
        }
        return sResourceDrawableIdHelper;
    }

    public synchronized void clear() {
        this.mResourceDrawableIdMap.clear();
    }

    @Nullable
    public Drawable getResourceDrawable(Context context, @Nullable String str) {
        int resourceDrawableId = getResourceDrawableId(context, str);
        if (resourceDrawableId > 0) {
            return context.getResources().getDrawable(resourceDrawableId);
        }
        return null;
    }

    public int getResourceDrawableId(Context context, @Nullable String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "_");
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.mResourceDrawableIdMap.containsKey(replace)) {
                    return this.mResourceDrawableIdMap.get(replace).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                this.mResourceDrawableIdMap.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }

    public Uri getResourceDrawableUri(Context context, @Nullable String str) {
        int resourceDrawableId = getResourceDrawableId(context, str);
        return resourceDrawableId > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(resourceDrawableId)).build() : Uri.EMPTY;
    }
}
