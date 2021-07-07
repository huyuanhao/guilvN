package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.umeng.commonsdk.statistics.common.d */
public final class C3667d {

    /* renamed from: a */
    public static C3667d f9592a = null;

    /* renamed from: b */
    public static Context f9593b = null;

    /* renamed from: c */
    public static String f9594c = null;

    /* renamed from: e */
    public static final String f9595e = "mobclick_agent_user_";

    /* renamed from: f */
    public static final String f9596f = "mobclick_agent_header_";

    /* renamed from: g */
    public static final String f9597g = "mobclick_agent_cached_";

    /* renamed from: d */
    public C3668a f9598d;

    /* renamed from: com.umeng.commonsdk.statistics.common.d$a */
    public static class C3668a {

        /* renamed from: a */
        public final int f9599a;

        /* renamed from: b */
        public File f9600b;

        /* renamed from: c */
        public FilenameFilter f9601c;

        public C3668a(Context context) {
            this(context, ".um");
        }

        /* renamed from: a */
        public boolean mo39206a() {
            File[] listFiles = this.f9600b.listFiles();
            return listFiles != null && listFiles.length > 0;
        }

        /* renamed from: b */
        public void mo39207b() {
            File[] listFiles = this.f9600b.listFiles(this.f9601c);
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
        }

        /* renamed from: c */
        public int mo39208c() {
            File[] listFiles = this.f9600b.listFiles(this.f9601c);
            if (listFiles == null || listFiles.length <= 0) {
                return 0;
            }
            return listFiles.length;
        }

        public C3668a(Context context, String str) {
            this.f9599a = 10;
            this.f9601c = new FilenameFilter() {
                /* class com.umeng.commonsdk.statistics.common.C3667d.C3668a.C36691 */

                public boolean accept(File file, String str) {
                    return str.startsWith("um");
                }
            };
            File file = new File(context.getFilesDir(), str);
            this.f9600b = file;
            if (!file.exists() || !this.f9600b.isDirectory()) {
                this.f9600b.mkdir();
            }
        }

        /* renamed from: a */
        public void mo39204a(AbstractC3670b bVar) {
            File file;
            File[] listFiles = this.f9600b.listFiles(this.f9601c);
            if (listFiles != null && listFiles.length >= 10) {
                Arrays.sort(listFiles);
                int length = listFiles.length - 10;
                for (int i = 0; i < length; i++) {
                    listFiles[i].delete();
                }
            }
            if (listFiles != null && listFiles.length > 0) {
                bVar.mo39210a(this.f9600b);
                int length2 = listFiles.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    try {
                        if (bVar.mo39211b(listFiles[i2])) {
                            file = listFiles[i2];
                            file.delete();
                        }
                    } catch (Throwable unused) {
                        file = listFiles[i2];
                    }
                }
                bVar.mo39212c(this.f9600b);
            }
        }

        /* renamed from: a */
        public void mo39205a(byte[] bArr) {
            if (bArr != null && bArr.length != 0) {
                try {
                    HelperUtils.writeFile(new File(this.f9600b, String.format(Locale.US, "um_cache_%d.env", Long.valueOf(System.currentTimeMillis()))), bArr);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.common.d$b */
    public interface AbstractC3670b {
        /* renamed from: a */
        void mo39210a(File file);

        /* renamed from: b */
        boolean mo39211b(File file);

        /* renamed from: c */
        void mo39212c(File file);
    }

    public C3667d(Context context) {
        this.f9598d = new C3668a(context);
    }

    /* renamed from: a */
    public static synchronized C3667d m9861a(Context context) {
        C3667d dVar;
        synchronized (C3667d.class) {
            f9593b = context.getApplicationContext();
            f9594c = context.getPackageName();
            if (f9592a == null) {
                f9592a = new C3667d(context);
            }
            dVar = f9592a;
        }
        return dVar;
    }

    /* renamed from: f */
    private SharedPreferences m9862f() {
        Context context = f9593b;
        return context.getSharedPreferences("mobclick_agent_user_" + f9594c, 0);
    }

    /* renamed from: b */
    public String mo39200b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f9593b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo39201c() {
        return UMFrUtils.envelopeFileNumber(f9593b) > 0;
    }

    /* renamed from: d */
    public String[] mo39202d() {
        try {
            SharedPreferences f = m9862f();
            String string = f.getString("au_p", null);
            String string2 = f.getString("au_u", null);
            if (!(string == null || string2 == null)) {
                return new String[]{string, string2};
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: e */
    public void mo39203e() {
        m9862f().edit().remove("au_p").remove("au_u").commit();
    }

    /* renamed from: a */
    public void mo39197a(int i) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f9593b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i).commit();
        }
    }

    /* renamed from: a */
    public int mo39196a() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f9593b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    /* renamed from: a */
    public void mo39198a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f9593b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* renamed from: a */
    public void mo39199a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor edit = m9862f().edit();
            edit.putString("au_p", str);
            edit.putString("au_u", str2);
            edit.commit();
        }
    }
}
