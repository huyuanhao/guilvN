package com.p254ta.utdid2.device;

import android.content.Context;
import android.os.Binder;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.p118pd.sdk.C9684lIl;
import com.p254ta.utdid2.p255a.p256a.C3056b;
import com.p254ta.utdid2.p255a.p256a.C3061d;
import com.p254ta.utdid2.p255a.p256a.C3062e;
import com.p254ta.utdid2.p255a.p256a.C3063f;
import com.p254ta.utdid2.p255a.p256a.C3066g;
import com.p254ta.utdid2.p257b.p258a.C3072c;
import com.umeng.commonsdk.proguard.C3571am;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: com.ta.utdid2.device.c */
public class C3079c {

    /* renamed from: a */
    public static C3079c f6807a;

    /* renamed from: e */
    public static final Object f6808e = new Object();

    /* renamed from: k */
    public static final String f6809k = (".UTSystemConfig" + File.separator + "Global");

    /* renamed from: a */
    public C3072c f6810a = null;

    /* renamed from: a */
    public C3080d f6811a = null;

    /* renamed from: b */
    public C3072c f6812b = null;

    /* renamed from: b */
    public Pattern f6813b = Pattern.compile("[^0-9a-zA-Z=/+]+");

    /* renamed from: h */
    public String f6814h = null;

    /* renamed from: i */
    public String f6815i = "xx_utdid_key";

    /* renamed from: j */
    public String f6816j = "xx_utdid_domain";
    public Context mContext = null;

    public C3079c(Context context) {
        this.mContext = context;
        this.f6812b = new C3072c(context, f6809k, "Alvin2", false, true);
        this.f6810a = new C3072c(context, ".DataStorage", "ContextData", false, true);
        this.f6811a = new C3080d();
        this.f6815i = String.format("K_%d", Integer.valueOf(C3066g.m7132a(this.f6815i)));
        this.f6816j = String.format("D_%d", Integer.valueOf(C3066g.m7132a(this.f6816j)));
    }

    /* renamed from: a */
    public static C3079c m7205a(Context context) {
        if (context != null && f6807a == null) {
            synchronized (f6808e) {
                if (f6807a == null) {
                    C3079c cVar = new C3079c(context);
                    f6807a = cVar;
                    cVar.m7208c();
                }
            }
        }
        return f6807a;
    }

    /* renamed from: b */
    private boolean m7207b(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            return 24 == str.length() && !this.f6813b.matcher(str).find();
        }
    }

    /* renamed from: c */
    private void m7208c() {
        C3072c cVar = this.f6812b;
        if (cVar != null) {
            if (C3066g.m7133a(cVar.getString("UTDID2"))) {
                String string = this.f6812b.getString("UTDID");
                if (!C3066g.m7133a(string)) {
                    m7210f(string);
                }
            }
            boolean z = false;
            boolean z2 = true;
            if (!C3066g.m7133a(this.f6812b.getString("DID"))) {
                this.f6812b.remove("DID");
                z = true;
            }
            if (!C3066g.m7133a(this.f6812b.getString("EI"))) {
                this.f6812b.remove("EI");
                z = true;
            }
            if (!C3066g.m7133a(this.f6812b.getString("SI"))) {
                this.f6812b.remove("SI");
            } else {
                z2 = z;
            }
            if (z2) {
                this.f6812b.commit();
            }
        }
    }

    /* renamed from: f */
    private void m7210f(String str) {
        C3072c cVar;
        if (m7207b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() == 24 && (cVar = this.f6812b) != null) {
                cVar.putString("UTDID2", str);
                this.f6812b.commit();
            }
        }
    }

    /* renamed from: g */
    private void m7213g(String str) {
        C3072c cVar;
        if (str != null && (cVar = this.f6810a) != null && !str.equals(cVar.getString(this.f6815i))) {
            this.f6810a.putString(this.f6815i, str);
            this.f6810a.commit();
        }
    }

    /* renamed from: h */
    private void m7214h(String str) {
        if (m7211f() && m7207b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length()) {
                String str2 = null;
                try {
                    str2 = Settings.System.getString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk");
                } catch (Exception unused) {
                }
                if (!m7207b(str2)) {
                    try {
                        Settings.System.putString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk", str);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private void m7215i(String str) {
        String str2;
        try {
            str2 = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
        } catch (Exception unused) {
            str2 = null;
        }
        if (!str.equals(str2)) {
            try {
                Settings.System.putString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp", str);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: j */
    private void m7216j(String str) {
        if (m7211f() && str != null) {
            m7215i(str);
        }
    }

    public synchronized String getValue() {
        if (this.f6814h != null) {
            return this.f6814h;
        }
        return mo37310h();
    }

    /* renamed from: i */
    public synchronized String mo37311i() {
        String str;
        String str2 = "";
        try {
            str2 = Settings.System.getString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk");
        } catch (Exception unused) {
        }
        if (m7207b(str2)) {
            return str2;
        }
        C3081e eVar = new C3081e();
        boolean z = false;
        try {
            str = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
        } catch (Exception unused2) {
            str = null;
        }
        if (!C3066g.m7133a(str)) {
            String e = eVar.mo37316e(str);
            if (m7207b(e)) {
                m7214h(e);
                return e;
            }
            String d = eVar.mo37315d(str);
            if (m7207b(d)) {
                String c = this.f6811a.mo37312c(d);
                if (!C3066g.m7133a(c)) {
                    m7216j(c);
                    try {
                        str = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
                    } catch (Exception unused3) {
                    }
                }
            }
            String d2 = this.f6811a.mo37314d(str);
            if (m7207b(d2)) {
                this.f6814h = d2;
                m7210f(d2);
                m7213g(str);
                m7214h(this.f6814h);
                return this.f6814h;
            }
        } else {
            z = true;
        }
        String g = m7212g();
        if (m7207b(g)) {
            String c2 = this.f6811a.mo37312c(g);
            if (z) {
                m7216j(c2);
            }
            m7214h(g);
            m7213g(c2);
            this.f6814h = g;
            return g;
        }
        String string = this.f6810a.getString(this.f6815i);
        if (!C3066g.m7133a(string)) {
            String d3 = eVar.mo37315d(string);
            if (!m7207b(d3)) {
                d3 = this.f6811a.mo37314d(string);
            }
            if (m7207b(d3)) {
                String c3 = this.f6811a.mo37312c(d3);
                if (!C3066g.m7133a(d3)) {
                    this.f6814h = d3;
                    if (z) {
                        m7216j(c3);
                    }
                    m7210f(this.f6814h);
                    return this.f6814h;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m7206b(byte[] bArr) throws Exception {
        byte[] bArr2 = {69, 114, 116, -33, 125, ExifInterface.OooOO0o, ExifInterface.OooOOo, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, C3571am.f9202h, -82, ExifInterface.OooO0Oo, 113, 116, -16, -103, 49, -30, 9, -39, PublicSuffixDatabase.EXCEPTION_MARKER, -80, C9684lIl.OooO0O0, -78, -117, 53, 30, -122, 64, -104, 74, ExifInterface.OooOOOo, 106, 85, -38, -93};
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(new SecretKeySpec(C3063f.m7130a(bArr2), instance.getAlgorithm()));
        return C3056b.encodeToString(instance.doFinal(bArr), 2);
    }

    /* renamed from: g */
    private String m7212g() {
        C3072c cVar = this.f6812b;
        if (cVar == null) {
            return null;
        }
        String string = cVar.getString("UTDID2");
        if (C3066g.m7133a(string) || this.f6811a.mo37312c(string) == null) {
            return null;
        }
        return string;
    }

    /* renamed from: f */
    private boolean m7211f() {
        return this.mContext.checkPermission("android.permission.WRITE_SETTINGS", Binder.getCallingPid(), Binder.getCallingUid()) == 0;
    }

    /* renamed from: h */
    public synchronized String mo37310h() {
        String i = mo37311i();
        this.f6814h = i;
        if (!TextUtils.isEmpty(i)) {
            return this.f6814h;
        }
        try {
            byte[] c = m7209c();
            if (c != null) {
                String encodeToString = C3056b.encodeToString(c, 2);
                this.f6814h = encodeToString;
                m7210f(encodeToString);
                String c2 = this.f6811a.mo37313c(c);
                if (c2 != null) {
                    m7216j(c2);
                    m7213g(c2);
                }
                return this.f6814h;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: c */
    private byte[] m7209c() throws Exception {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nextInt = new Random().nextInt();
        byte[] bytes = C3061d.getBytes(currentTimeMillis);
        byte[] bytes2 = C3061d.getBytes(nextInt);
        byteArrayOutputStream.write(bytes, 0, 4);
        byteArrayOutputStream.write(bytes2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = C3062e.m7124a(this.mContext);
        } catch (Exception unused) {
            str = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(C3061d.getBytes(C3066g.m7132a(str)), 0, 4);
        byteArrayOutputStream.write(C3061d.getBytes(C3066g.m7132a(m7206b(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }
}
