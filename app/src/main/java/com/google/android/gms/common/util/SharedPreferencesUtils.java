package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p118pd.sdk.C5982OoooOoO;
import java.io.File;

@KeepForSdk
public class SharedPreferencesUtils {
    @KeepForSdk
    @Deprecated
    public static void publishWorldReadableSharedPreferences(Context context, SharedPreferences.Editor editor, String str) {
        File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.setExecutable(true, false);
        }
        file.setExecutable(true, false);
        editor.commit();
        new File(file, String.valueOf(str).concat(C5982OoooOoO.OooO)).setReadable(true, false);
    }
}
