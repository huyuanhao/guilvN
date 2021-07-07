package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;

public final class zznk {
    public static final GmsLogger zzaoz = new GmsLogger("CommonUtils", "");

    public static String zza(@NonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("Exception thrown when trying to get app version ");
            sb.append(valueOf);
            gmsLogger.mo10803e("CommonUtils", sb.toString());
            return "";
        }
    }

    @NonNull
    public static String zza(@NonNull Locale locale) {
        if (PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
