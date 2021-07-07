package com.qiyukf.nim.uikit.provider;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.qiyukf.basesdk.p119a.C1709a;
import java.io.File;

public class UnicornProvider extends FileProvider {
    /* renamed from: a */
    public static Uri m3770a(Context context, File file) {
        return FileProvider.getUriForFile(context, m3771a(context), file);
    }

    /* renamed from: a */
    public static String m3771a(Context context) {
        return context.getPackageName() + ".unicorn.fileprovider";
    }

    /* renamed from: b */
    public static boolean m3772b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return context.getPackageManager().getProviderInfo(new ComponentName(context, UnicornProvider.class), 128) != null;
            } catch (PackageManager.NameNotFoundException e) {
                C1709a.m3015b("UnicornProvider", "useFileProvider is error", e);
            }
        }
        return false;
    }
}
