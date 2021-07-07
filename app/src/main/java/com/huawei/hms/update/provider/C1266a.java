package com.huawei.hms.update.provider;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.p037c.C1131a;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.File;
import java.io.IOException;

/* renamed from: com.huawei.hms.update.provider.a */
public class C1266a {

    /* renamed from: a */
    public Context f1413a;

    /* renamed from: b */
    public String f1414b;

    /* renamed from: a */
    public static String m1516a(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static File m1517b(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalFile();
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private String m1519c(String str) {
        int indexOf;
        String a;
        String a2 = m1515a();
        if (a2 != null && (indexOf = str.indexOf(47, 1)) >= 0 && "ContentUriHelper".equals(Uri.decode(str.substring(1, indexOf))) && (a = m1516a(new File(a2, Uri.decode(str.substring(indexOf + 1))))) != null && a.startsWith(a2)) {
            return a;
        }
        return null;
    }

    /* renamed from: b */
    private String m1518b(String str) {
        int i;
        String a = m1515a();
        if (a == null || !str.startsWith(a)) {
            return null;
        }
        if (a.endsWith(C8932ooOOO0o.OooO0OO)) {
            i = a.length();
        } else {
            i = a.length() + 1;
        }
        return Uri.encode("ContentUriHelper") + '/' + str.substring(i);
    }

    /* renamed from: a */
    public void mo15829a(Context context) {
        C1131a.m1062a(context, "context nust not be null.");
        this.f1413a = context;
    }

    /* renamed from: a */
    public File mo15828a(String str) {
        String a = m1515a();
        if (a == null) {
            return null;
        }
        return m1517b(new File(a, str));
    }

    /* renamed from: a */
    private String m1515a() {
        String str;
        Context context = (Context) C1131a.m1063b(this.f1413a, "mContext is null, call setContext first.");
        synchronized (this) {
            if (this.f1414b == null) {
                if (context.getExternalCacheDir() != null) {
                    this.f1414b = m1516a(context.getExternalCacheDir());
                } else {
                    this.f1414b = m1516a(context.getFilesDir());
                }
            }
            str = this.f1414b;
        }
        return str;
    }

    /* renamed from: a */
    public Uri mo15826a(File file, String str) {
        String b;
        String a = m1516a(file);
        if (a == null || (b = m1518b(a)) == null) {
            return null;
        }
        return new Uri.Builder().scheme("content").authority(str).encodedPath(b).build();
    }

    /* renamed from: a */
    public File mo15827a(Uri uri) {
        String c;
        String encodedPath = uri.getEncodedPath();
        if (encodedPath == null || (c = m1519c(encodedPath)) == null) {
            return null;
        }
        return m1517b(new File(c));
    }
}
