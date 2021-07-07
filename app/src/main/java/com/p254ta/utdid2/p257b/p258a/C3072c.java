package com.p254ta.utdid2.p257b.p258a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.p254ta.utdid2.p255a.p256a.C3066g;
import com.p254ta.utdid2.p257b.p258a.AbstractC3069b;
import java.io.File;
import java.util.Map;

/* renamed from: com.ta.utdid2.b.a.c */
public class C3072c {

    /* renamed from: a */
    public SharedPreferences.Editor f6774a;

    /* renamed from: a */
    public SharedPreferences f6775a;

    /* renamed from: a */
    public AbstractC3069b.AbstractC3070a f6776a;

    /* renamed from: a */
    public AbstractC3069b f6777a;

    /* renamed from: a */
    public C3073d f6778a;

    /* renamed from: b */
    public String f6779b = "";

    /* renamed from: c */
    public String f6780c = "";

    /* renamed from: f */
    public boolean f6781f = false;

    /* renamed from: g */
    public boolean f6782g = false;

    /* renamed from: h */
    public boolean f6783h = false;

    /* renamed from: i */
    public boolean f6784i;
    public Context mContext;

    /* JADX WARNING: Removed duplicated region for block: B:85:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0181 A[Catch:{ Exception -> 0x018d }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3072c(android.content.Context r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 398
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p254ta.utdid2.p257b.p258a.C3072c.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* renamed from: a */
    private C3073d m7149a(String str) {
        File a = m7150a(str);
        if (a == null) {
            return null;
        }
        C3073d dVar = new C3073d(a.getAbsolutePath());
        this.f6778a = dVar;
        return dVar;
    }

    /* renamed from: b */
    private void m7153b() {
        AbstractC3069b bVar;
        SharedPreferences sharedPreferences;
        if (this.f6774a == null && (sharedPreferences = this.f6775a) != null) {
            this.f6774a = sharedPreferences.edit();
        }
        if (this.f6783h && this.f6776a == null && (bVar = this.f6777a) != null) {
            this.f6776a = bVar.mo37276a();
        }
        m7154c();
    }

    /* renamed from: c */
    private boolean m7154c() {
        AbstractC3069b bVar = this.f6777a;
        if (bVar == null) {
            return false;
        }
        boolean b = bVar.mo37277b();
        if (!b) {
            commit();
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
        if (r6.f6776a.commit() == false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0098 A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean commit() {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p254ta.utdid2.p257b.p258a.C3072c.commit():boolean");
    }

    public String getString(String str) {
        m7154c();
        SharedPreferences sharedPreferences = this.f6775a;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!C3066g.m7133a(string)) {
                return string;
            }
        }
        AbstractC3069b bVar = this.f6777a;
        if (bVar != null) {
            return bVar.getString(str, "");
        }
        return "";
    }

    public void putString(String str, String str2) {
        if (!C3066g.m7133a(str) && !str.equals("t")) {
            m7153b();
            SharedPreferences.Editor editor = this.f6774a;
            if (editor != null) {
                editor.putString(str, str2);
            }
            AbstractC3069b.AbstractC3070a aVar = this.f6776a;
            if (aVar != null) {
                aVar.mo37285a(str, str2);
            }
        }
    }

    public void remove(String str) {
        if (!C3066g.m7133a(str) && !str.equals("t")) {
            m7153b();
            SharedPreferences.Editor editor = this.f6774a;
            if (editor != null) {
                editor.remove(str);
            }
            AbstractC3069b.AbstractC3070a aVar = this.f6776a;
            if (aVar != null) {
                aVar.mo37281a(str);
            }
        }
    }

    /* renamed from: a */
    private File m7150a(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return null;
        }
        File file = new File(String.format("%s%s%s", externalStorageDirectory.getAbsolutePath(), File.separator, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    private void m7151a(SharedPreferences sharedPreferences, AbstractC3069b bVar) {
        AbstractC3069b.AbstractC3070a a;
        if (sharedPreferences != null && bVar != null && (a = bVar.mo37276a()) != null) {
            a.mo37287b();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    a.mo37285a(key, (String) value);
                } else if (value instanceof Integer) {
                    a.mo37283a(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    a.mo37284a(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    a.mo37282a(key, ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    a.mo37286a(key, ((Boolean) value).booleanValue());
                }
            }
            try {
                a.commit();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m7152a(AbstractC3069b bVar, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit;
        if (!(bVar == null || sharedPreferences == null || (edit = sharedPreferences.edit()) == null)) {
            edit.clear();
            for (Map.Entry<String, ?> entry : bVar.getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    edit.putString(key, (String) value);
                } else if (value instanceof Integer) {
                    edit.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    edit.putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    edit.putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    edit.putBoolean(key, ((Boolean) value).booleanValue());
                }
            }
            edit.commit();
        }
    }
}
