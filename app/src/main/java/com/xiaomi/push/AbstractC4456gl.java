package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.xiaomi.mipush.sdk.Constants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.xiaomi.push.gl */
public abstract class AbstractC4456gl {

    /* renamed from: a */
    public static long f12043a = 0;

    /* renamed from: a */
    public static final String f12044a = Locale.getDefault().getLanguage().toLowerCase();

    /* renamed from: a */
    public static final DateFormat f12045a;

    /* renamed from: b */
    public static String f12046b = null;

    /* renamed from: c */
    public static String f12047c = (C4470gw.m12830a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER);

    /* renamed from: a */
    public C4462gp f12048a = null;

    /* renamed from: a */
    public List<C4452gi> f12049a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final Map<String, Object> f12050a = new HashMap();

    /* renamed from: d */
    public String f12051d = f12046b;

    /* renamed from: e */
    public String f12052e = null;

    /* renamed from: f */
    public String f12053f = null;

    /* renamed from: g */
    public String f12054g = null;

    /* renamed from: h */
    public String f12055h = null;

    /* renamed from: i */
    public String f12056i = null;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f12045a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(ISO8601Utils.UTC_ID));
    }

    public AbstractC4456gl() {
    }

    public AbstractC4456gl(Bundle bundle) {
        this.f12053f = bundle.getString("ext_to");
        this.f12054g = bundle.getString("ext_from");
        this.f12055h = bundle.getString("ext_chid");
        this.f12052e = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f12049a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                C4452gi a = C4452gi.m12737a((Bundle) parcelable);
                if (a != null) {
                    this.f12049a.add(a);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f12048a = new C4462gp(bundle2);
        }
    }

    /* renamed from: i */
    public static synchronized String m12777i() {
        String sb;
        synchronized (AbstractC4456gl.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f12047c);
            long j = f12043a;
            f12043a = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: q */
    public static String m12778q() {
        return f12044a;
    }

    /* renamed from: a */
    public Bundle mo41938a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f12051d)) {
            bundle.putString("ext_ns", this.f12051d);
        }
        if (!TextUtils.isEmpty(this.f12054g)) {
            bundle.putString("ext_from", this.f12054g);
        }
        if (!TextUtils.isEmpty(this.f12053f)) {
            bundle.putString("ext_to", this.f12053f);
        }
        if (!TextUtils.isEmpty(this.f12052e)) {
            bundle.putString("ext_pkt_id", this.f12052e);
        }
        if (!TextUtils.isEmpty(this.f12055h)) {
            bundle.putString("ext_chid", this.f12055h);
        }
        C4462gp gpVar = this.f12048a;
        if (gpVar != null) {
            bundle.putBundle("ext_ERROR", gpVar.mo41982a());
        }
        List<C4452gi> list = this.f12049a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            for (C4452gi giVar : this.f12049a) {
                Bundle a = giVar.mo41932a();
                if (a != null) {
                    bundleArr[i] = a;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* renamed from: a */
    public C4452gi mo41943a(String str) {
        return mo41944a(str, null);
    }

    /* renamed from: a */
    public C4452gi mo41944a(String str, String str2) {
        for (C4452gi giVar : this.f12049a) {
            if ((str2 == null || str2.equals(giVar.mo41934b())) && str.equals(giVar.m12742a())) {
                return giVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C4462gp m12782a() {
        return this.f12048a;
    }

    /* renamed from: a */
    public synchronized Object m12783a(String str) {
        if (this.f12050a == null) {
            return null;
        }
        return this.f12050a.get(str);
    }

    /* renamed from: a */
    public abstract String m12784a();

    /* renamed from: a */
    public synchronized Collection<C4452gi> m12785a() {
        if (this.f12049a == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(this.f12049a));
    }

    /* renamed from: a */
    public void mo41964a(C4452gi giVar) {
        this.f12049a.add(giVar);
    }

    /* renamed from: a */
    public void mo41965a(C4462gp gpVar) {
        this.f12048a = gpVar;
    }

    /* renamed from: b */
    public synchronized Collection<String> mo41941b() {
        if (this.f12050a == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.f12050a.keySet()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC4456gl glVar = (AbstractC4456gl) obj;
        C4462gp gpVar = this.f12048a;
        if (gpVar == null ? glVar.f12048a != null : !gpVar.equals(glVar.f12048a)) {
            return false;
        }
        String str = this.f12054g;
        if (str == null ? glVar.f12054g != null : !str.equals(glVar.f12054g)) {
            return false;
        }
        if (!this.f12049a.equals(glVar.f12049a)) {
            return false;
        }
        String str2 = this.f12052e;
        if (str2 == null ? glVar.f12052e != null : !str2.equals(glVar.f12052e)) {
            return false;
        }
        String str3 = this.f12055h;
        if (str3 == null ? glVar.f12055h != null : !str3.equals(glVar.f12055h)) {
            return false;
        }
        Map<String, Object> map = this.f12050a;
        if (map == null ? glVar.f12050a != null : !map.equals(glVar.f12050a)) {
            return false;
        }
        String str4 = this.f12053f;
        if (str4 == null ? glVar.f12053f != null : !str4.equals(glVar.f12053f)) {
            return false;
        }
        String str5 = this.f12051d;
        String str6 = glVar.f12051d;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 == null) {
            return true;
        }
    }

    public int hashCode() {
        String str = this.f12051d;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f12052e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12053f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f12054g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f12055h;
        int hashCode5 = (((((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f12049a.hashCode()) * 31) + this.f12050a.hashCode()) * 31;
        C4462gp gpVar = this.f12048a;
        if (gpVar != null) {
            i = gpVar.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: j */
    public String mo41966j() {
        if ("ID_NOT_AVAILABLE".equals(this.f12052e)) {
            return null;
        }
        if (this.f12052e == null) {
            this.f12052e = m12777i();
        }
        return this.f12052e;
    }

    /* renamed from: k */
    public String mo41967k() {
        return this.f12055h;
    }

    /* renamed from: k */
    public void mo41968k(String str) {
        this.f12052e = str;
    }

    /* renamed from: l */
    public String mo41969l() {
        return this.f12053f;
    }

    /* renamed from: l */
    public void mo41970l(String str) {
        this.f12055h = str;
    }

    /* renamed from: m */
    public String mo41971m() {
        return this.f12054g;
    }

    /* renamed from: m */
    public void mo41972m(String str) {
        this.f12053f = str;
    }

    /* renamed from: n */
    public String mo41973n() {
        return this.f12056i;
    }

    /* renamed from: n */
    public void mo41974n(String str) {
        this.f12054g = str;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107 A[SYNTHETIC, Splitter:B:55:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011a A[SYNTHETIC, Splitter:B:64:0x011a] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0121 A[SYNTHETIC, Splitter:B:68:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x010f A[SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String mo41975o() {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.AbstractC4456gl.mo41975o():java.lang.String");
    }

    /* renamed from: o */
    public void mo41976o(String str) {
        this.f12056i = str;
    }

    /* renamed from: p */
    public String mo41977p() {
        return this.f12051d;
    }
}
