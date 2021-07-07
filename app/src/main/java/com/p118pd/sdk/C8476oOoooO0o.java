package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.pd.sdk.oOoooO0o  reason: case insensitive filesystem */
public class C8476oOoooO0o {
    public static C8476oOoooO0o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21600OooO00o;

    /* renamed from: com.pd.sdk.oOoooO0o$OooO0O0 */
    public static class OooO0O0 extends AbstractC8477oOoooOO0 {
        public String OooO00o;
        public String OooO0O0;

        public OooO0O0(String str, String str2) {
            this.OooO00o = str;
            this.OooO0O0 = str2;
        }

        @Override // com.p118pd.sdk.AbstractC8477oOoooOO0, com.p118pd.sdk.AbstractC8477oOoooOO0
        public int OooO00o() {
            int i = 0;
            int i2 = (AbstractC8452oOooOoO.m20093OooO0Oo(this.OooO00o, this.OooO0O0) ? 4 : 0) | 0;
            if (AbstractC8452oOooOoO.m20092OooO0OO(this.OooO00o, this.OooO0O0)) {
                i = 2;
            }
            return i2 | i | (AbstractC8452oOooOoO.OooO0o(this.OooO00o, this.OooO0O0) ? 1 : 0);
        }

        @Override // com.p118pd.sdk.AbstractC8477oOoooOO0, com.p118pd.sdk.AbstractC8477oOoooOO0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m20140OooO00o() {
            return AbstractC8452oOooOoO.OooO0O0(this.OooO00o, this.OooO0O0);
        }

        @Override // com.p118pd.sdk.AbstractC8477oOoooOO0
        public String OooO00o(String str) {
            return C8586oo0O00.OooO00o(str);
        }

        @Override // com.p118pd.sdk.AbstractC8477oOoooOO0
        public String OooO0O0() {
            return AbstractC8452oOooOoO.m20089OooO00o(this.OooO00o, this.OooO0O0);
        }

        @Override // com.p118pd.sdk.AbstractC8477oOoooOO0
        public String OooO0OO() {
            return AbstractC8452oOooOoO.OooO0Oo(this.OooO00o, this.OooO0O0);
        }
    }

    /* renamed from: com.pd.sdk.oOoooO0o$OooO0OO */
    public static class OooO0OO extends AbstractC8477oOoooOO0 {
        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.AbstractC8477oOoooOO0, com.p118pd.sdk.AbstractC8477oOoooOO0
        public int OooO00o() {
            int i = 0;
            int i2 = (AbstractC8456oOooOoo0.m20109OooO0O0() ? 4 : 0) | 0;
            if (AbstractC8456oOooOoo0.m20106OooO00o()) {
                i = 2;
            }
            return i2 | i | (AbstractC8456oOooOoo0.m20111OooO0OO() ? 1 : 0);
        }

        @Override // com.p118pd.sdk.AbstractC8477oOoooOO0, com.p118pd.sdk.AbstractC8477oOoooOO0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m20141OooO00o() {
            return AbstractC8456oOooOoo0.OooO0oO();
        }

        @Override // com.p118pd.sdk.AbstractC8477oOoooOO0
        public String OooO00o(String str) {
            return str;
        }

        @Override // com.p118pd.sdk.AbstractC8477oOoooOO0
        public String OooO0O0() {
            return AbstractC8456oOooOoo0.OooO0o();
        }

        @Override // com.p118pd.sdk.AbstractC8477oOoooOO0
        public String OooO0OO() {
            return AbstractC8456oOooOoo0.OooO0oo();
        }
    }

    public static C8476oOoooO0o OooO00o() {
        C8476oOoooO0o oooooo0o;
        synchronized (C8476oOoooO0o.class) {
            if (OooO00o == null) {
                OooO00o = new C8476oOoooO0o();
            }
            oooooo0o = OooO00o;
        }
        return oooooo0o;
    }

    public Pair<String, String> OooO00o(String str, String str2) {
        if (!AbstractC8452oOooOoO.m20091OooO0O0(str, str2)) {
            return new Pair<>("", "");
        }
        String OooOO0o = C8480oOooooO0.OooO00o().m20150OooO00o().OooOO0o();
        String OooOOO0 = C8480oOooooO0.OooO00o().m20150OooO00o().OooOOO0();
        if (!TextUtils.isEmpty(OooOO0o) && !TextUtils.isEmpty(OooOOO0)) {
            return new Pair<>(OooOO0o, OooOOO0);
        }
        Pair<String, String> OooO00o2 = AbstractC8475oOoooO0O.OooO00o(this.f21600OooO00o);
        C8480oOooooO0.OooO00o().m20150OooO00o().OooOO0o((String) OooO00o2.first);
        C8480oOooooO0.OooO00o().m20150OooO00o().OooOOO0((String) OooO00o2.second);
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8473oOoooO0 m20135OooO00o() {
        return new OooO0OO().m20143OooO00o(this.f21600OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8473oOoooO0 m20136OooO00o(String str, String str2) {
        return new OooO0O0(str, str2).m20143OooO00o(this.f21600OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20137OooO00o() {
        return m20135OooO00o().m20133OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20138OooO00o(String str, String str2) {
        return AbstractC8478oOoooo.OooO0O0(str, str2);
    }

    public void OooO00o(Context context) {
        if (this.f21600OooO00o == null) {
            this.f21600OooO00o = context;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20139OooO00o(String str, String str2) {
        return AbstractC8478oOoooo.m20145OooO00o(str, str2);
    }

    public String OooO0O0() {
        String OooO0oO = AbstractC8453oOooOoOO.OooO0oO();
        if (!TextUtils.isEmpty(OooO0oO)) {
            return OooO0oO;
        }
        String OooO0OO2 = C8561oo00o0o0.OooO0OO(this.f21600OooO00o);
        AbstractC8453oOooOoOO.OooO0OO(OooO0OO2);
        return OooO0OO2;
    }

    public String OooO0O0(String str, String str2) {
        return AbstractC8478oOoooo.OooO00o(this.f21600OooO00o, str, str2);
    }

    public String OooO0OO() {
        String OooO0o0 = AbstractC8453oOooOoOO.OooO0o0();
        if (!TextUtils.isEmpty(OooO0o0)) {
            return OooO0o0;
        }
        String packageName = this.f21600OooO00o.getPackageName();
        AbstractC8453oOooOoOO.OooO0O0(packageName);
        return packageName;
    }

    public String OooO0OO(String str, String str2) {
        return AbstractC8478oOoooo.OooO0O0(this.f21600OooO00o, str, str2);
    }

    public String OooO0Oo() {
        return AbstractC8453oOooOoOO.OooO0o();
    }

    public String OooO0Oo(String str, String str2) {
        return AbstractC8478oOoooo.OooO00o(str, str2);
    }
}
