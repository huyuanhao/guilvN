package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.base.C0950R;
import com.google.android.gms.common.C0955R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.p118pd.sdk.C6987o000O0o;
import javax.annotation.concurrent.GuardedBy;

public final class ConnectionErrorMessages {
    @GuardedBy("sCache")
    public static final C6987o000O0o<String, String> zaof = new C6987o000O0o<>();

    public static String getAppName(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String getDefaultNotificationChannelName(Context context) {
        return context.getResources().getString(C0950R.string.common_google_play_services_notification_channel_name);
    }

    @NonNull
    public static String getErrorDialogButtonMessage(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C0950R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(C0950R.string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C0950R.string.common_google_play_services_enable_button);
    }

    @NonNull
    public static String getErrorMessage(Context context, int i) {
        Resources resources = context.getResources();
        String appName = getAppName(context);
        if (i == 1) {
            return resources.getString(C0950R.string.common_google_play_services_install_text, appName);
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C0950R.string.common_google_play_services_enable_text, appName);
            } else if (i == 5) {
                return zaa(context, "common_google_play_services_invalid_account_text", appName);
            } else {
                if (i == 7) {
                    return zaa(context, "common_google_play_services_network_error_text", appName);
                }
                if (i == 9) {
                    return resources.getString(C0950R.string.common_google_play_services_unsupported_text, appName);
                } else if (i == 20) {
                    return zaa(context, "common_google_play_services_restricted_profile_text", appName);
                } else {
                    switch (i) {
                        case 16:
                            return zaa(context, "common_google_play_services_api_unavailable_text", appName);
                        case 17:
                            return zaa(context, "common_google_play_services_sign_in_failed_text", appName);
                        case 18:
                            return resources.getString(C0950R.string.common_google_play_services_updating_text, appName);
                        default:
                            return resources.getString(C0955R.string.common_google_play_services_unknown_issue, appName);
                    }
                }
            }
        } else if (DeviceProperties.isWearableWithoutPlayStore(context)) {
            return resources.getString(C0950R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C0950R.string.common_google_play_services_update_text, appName);
        }
    }

    @NonNull
    public static String getErrorNotificationMessage(Context context, int i) {
        if (i == 6) {
            return zaa(context, "common_google_play_services_resolution_required_text", getAppName(context));
        }
        return getErrorMessage(context, i);
    }

    @NonNull
    public static String getErrorNotificationTitle(Context context, int i) {
        String str;
        if (i == 6) {
            str = zaa(context, "common_google_play_services_resolution_required_title");
        } else {
            str = getErrorTitle(context, i);
        }
        return str == null ? context.getResources().getString(C0950R.string.common_google_play_services_notification_ticker) : str;
    }

    @Nullable
    public static String getErrorTitle(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C0950R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C0950R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C0950R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return zaa(context, "common_google_play_services_invalid_account_title");
            case 7:
                return zaa(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                sb.toString();
                return null;
            case 17:
                return zaa(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return zaa(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String zaa(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zaa = zaa(context, str);
        if (zaa == null) {
            zaa = resources.getString(C0955R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zaa, str2);
    }

    @Nullable
    public static String zaa(Context context, String str) {
        synchronized (zaof) {
            String str2 = zaof.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Missing resource: ".concat(valueOf);
                } else {
                    new String("Missing resource: ");
                }
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    "Got empty resource: ".concat(valueOf2);
                } else {
                    new String("Got empty resource: ");
                }
                return null;
            }
            zaof.put(str, string);
            return string;
        }
    }
}
