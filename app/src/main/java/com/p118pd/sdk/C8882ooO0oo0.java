package com.p118pd.sdk;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.netease.nimlib.util.storage.NimStorageType;
import java.io.File;
import java.io.IOException;

/* renamed from: com.pd.sdk.ooO0oo0  reason: case insensitive filesystem */
public class C8882ooO0oo0 {
    public static C8882ooO0oo0 OooO00o = null;
    public static final String OooO0O0 = "NimExternalStorage";
    public static final String OooO0OO = "nim/";
    public static String OooO0Oo = ".nomedia";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f22086OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22087OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22088OooO00o = true;

    public static synchronized C8882ooO0oo0 OooO00o() {
        C8882ooO0oo0 ooo0oo0;
        synchronized (C8882ooO0oo0.class) {
            if (OooO00o == null) {
                OooO00o = new C8882ooO0oo0();
            }
            ooo0oo0 = OooO00o;
        }
        return ooo0oo0;
    }

    private boolean OooO0OO() {
        Context context = this.f22086OooO00o;
        if (context != null && C8873ooO0oOO.OooO00o(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return true;
        }
        return false;
    }

    public String OooO0O0(String str, NimStorageType nimStorageType) {
        return OooO00o(str, nimStorageType, false, false);
    }

    public boolean OooO0O0() {
        if (this.f22087OooO00o.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath())) {
            return Environment.getExternalStorageState().equals("mounted");
        }
        return true;
    }

    public void OooO00o(Context context, String str) {
        this.f22086OooO00o = context;
        boolean OooO0O02 = OooO0O0(str);
        this.f22088OooO00o = OooO0O02;
        if (!OooO0O02) {
            this.f22088OooO00o = OooO0OO();
        }
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                if (file.getParentFile().exists()) {
                    file.mkdir();
                } else {
                    file.mkdirs();
                }
            }
            if (file.exists() && !file.isFile()) {
                this.f22087OooO00o = str;
                if (!str.endsWith(C8932ooOOO0o.OooO0OO)) {
                    this.f22087OooO00o = str + C8932ooOOO0o.OooO0OO;
                }
            }
        }
        if (TextUtils.isEmpty(this.f22087OooO00o)) {
            OooO00o(context);
        }
        m20527OooO00o();
    }

    private boolean OooO0O0(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                File externalCacheDir = this.f22086OooO00o.getExternalCacheDir();
                if (externalCacheDir == null || !str.startsWith(externalCacheDir.getCanonicalPath())) {
                    File externalFilesDir = this.f22086OooO00o.getExternalFilesDir(null);
                    if (externalFilesDir != null && str.startsWith(externalFilesDir.getCanonicalPath())) {
                        Log.i(OooO0O0, "use external files dir!");
                        return true;
                    } else if (str.startsWith(this.f22086OooO00o.getCacheDir().getCanonicalPath()) || str.startsWith(this.f22086OooO00o.getFilesDir().getCanonicalPath())) {
                        Log.i(OooO0O0, "use internal cache dir!");
                        return true;
                    }
                } else {
                    Log.i(OooO0O0, "use external cache dir!");
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Log.i(OooO0O0, "use public storage, path=" + str);
        return false;
    }

    private void OooO00o(Context context) {
        String path = Environment.getExternalStorageDirectory().getPath();
        this.f22087OooO00o = path + C8932ooOOO0o.OooO0OO + context.getPackageName() + C8932ooOOO0o.OooO0OO + OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m20527OooO00o() {
        File file = new File(this.f22087OooO00o);
        if (file.exists() && !file.isDirectory()) {
            file.delete();
        }
        NimStorageType[] values = NimStorageType.values();
        boolean z = true;
        for (NimStorageType nimStorageType : values) {
            z &= m20529OooO00o(this.f22087OooO00o + nimStorageType.getStoragePath());
        }
        if (z) {
            m20528OooO00o(this.f22087OooO00o);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20529OooO00o(String str) {
        File file = new File(str);
        boolean exists = file.exists();
        return !exists ? file.mkdirs() : exists;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m20528OooO00o(String str) {
        File file = new File(str + C8932ooOOO0o.OooO0OO + OooO0Oo);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String OooO00o(String str, NimStorageType nimStorageType, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(OooO00o(nimStorageType));
        if (!z) {
            sb.append(str);
        }
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (z2) {
            return (!file.exists() || ((!z || !file.isDirectory()) && (z || file.isDirectory()))) ? "" : sb2;
        }
        return sb2;
    }

    public String OooO00o(NimStorageType nimStorageType) {
        return this.f22087OooO00o + nimStorageType.getStoragePath();
    }

    public String OooO00o(String str, NimStorageType nimStorageType) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return OooO00o(str, nimStorageType, false, true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m20530OooO00o() {
        return OooO00o(this.f22087OooO00o);
    }

    private long OooO00o(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20531OooO00o() {
        return this.f22087OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20532OooO00o() {
        if (this.f22088OooO00o) {
            return true;
        }
        boolean OooO0OO2 = OooO0OO();
        this.f22088OooO00o = OooO0OO2;
        if (OooO0OO2) {
            Log.i(OooO0O0, "get permission to access storage");
            m20527OooO00o();
        }
        return this.f22088OooO00o;
    }
}
