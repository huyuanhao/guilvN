package com.jinhui365.util.fileUtil;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.annotation.Keep;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C8741oo0oOo0;
import java.io.File;

@Keep
public class DiskFileUtil {
    public static File OooO(Context context, String str) {
        File OooO0o0 = OooO0o0(context, str);
        if (OooO0o0 != null) {
            return OooO0o0;
        }
        return OooO0Oo(context, str);
    }

    public static boolean OooO00o(Context context) {
        return C7009o000OoOo.OooO00o(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static boolean OooO0O0() {
        return Build.VERSION.SDK_INT < 19;
    }

    public static File OooO0OO(Context context, String str) {
        File file = null;
        if (!OooO00o()) {
            return null;
        }
        if (OooO00o(context) || !OooO0O0()) {
            file = OooO00o(str, context.getExternalCacheDir());
            if (file == null) {
                return file;
            }
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return file;
    }

    public static File OooO0Oo(Context context, String str) {
        File file = null;
        if (!OooO00o()) {
            return null;
        }
        if (OooO00o(context) || !OooO0O0()) {
            file = context.getExternalFilesDir(str);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return file;
    }

    public static File OooO0o(Context context, String str) {
        File OooO0o0 = OooO0o0(context, str);
        if (OooO0o0 != null) {
            return OooO0o0;
        }
        File OooO0Oo = OooO0Oo(context, str);
        if (OooO0Oo != null) {
            return OooO0Oo;
        }
        return OooO0oo(context, str);
    }

    public static File OooO0o0(Context context, String str) {
        if (!OooO00o() || !OooO00o(context)) {
            return null;
        }
        File OooO00o = OooO00o(str, Environment.getExternalStorageDirectory());
        if (OooO00o == null || OooO00o.exists()) {
            return OooO00o;
        }
        OooO00o.mkdirs();
        return OooO00o;
    }

    public static File OooO0oO(Context context, String str) {
        File OooO00o = OooO00o(str, context.getCacheDir());
        if (OooO00o != null && !OooO00o.exists()) {
            OooO00o.mkdirs();
        }
        return OooO00o;
    }

    public static File OooO0oo(Context context, String str) {
        File OooO00o = OooO00o(str, context.getFilesDir());
        if (OooO00o != null && !OooO00o.exists()) {
            OooO00o.mkdirs();
        }
        return OooO00o;
    }

    public static boolean OooO00o() {
        return "mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable();
    }

    public static File OooO0O0(Context context, String str) {
        File OooO0Oo = OooO0Oo(context, str);
        if (OooO0Oo != null) {
            return OooO0Oo;
        }
        return OooO0oo(context, str);
    }

    public static File OooO00o(String str, File file) {
        if (!C8741oo0oOo0.OooO0Oo(str)) {
            return file;
        }
        return new File(file, File.separator + str);
    }

    public static File OooO00o(Context context, String str) {
        File OooO0OO = OooO0OO(context, str);
        if (OooO0OO != null) {
            return OooO0OO;
        }
        return OooO0oO(context, str);
    }
}
