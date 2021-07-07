package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.p029c.EnumC1096b;

/* renamed from: com.pd.sdk.oOoooOO0  reason: case insensitive filesystem */
public abstract class AbstractC8477oOoooOO0 {
    private C8473oOoooO0 OooO00o(int i, Context context) {
        String str;
        if ((i & 4) != 0 && (i & 1) != 0) {
            return new C8473oOoooO0(EnumC1096b.UDID, OooO00o(OooO00o(context)));
        }
        if ((i & 1) != 0) {
            str = OooO00o(context);
            if (!TextUtils.isEmpty(str)) {
                return new C8473oOoooO0(EnumC1096b.SN, str);
            }
        } else {
            str = "";
        }
        if ((i & 2) == 0) {
            return new C8473oOoooO0(EnumC1096b.EMPTY, str);
        }
        return new C8473oOoooO0(EnumC1096b.IMEI, OooO0O0(context));
    }

    private String OooO00o(Context context) {
        C8483oOooooo OooO00o = C8480oOooooO0.OooO00o().m20150OooO00o();
        if (TextUtils.isEmpty(OooO00o.m20163OooO00o())) {
            OooO00o.OooO00o(AbstractC8475oOoooO0O.OooO0o0(context));
        }
        return OooO00o.m20163OooO00o();
    }

    private boolean OooO00o() {
        C8483oOooooo OooO00o = C8480oOooooO0.OooO00o().m20150OooO00o();
        if (TextUtils.isEmpty(OooO00o.OooO0OO())) {
            OooO00o.OooO0OO(AbstractC8475oOoooO0O.OooO0O0());
        }
        return !TextUtils.isEmpty(OooO00o.OooO0OO());
    }

    private C8473oOoooO0 OooO0O0(int i, Context context) {
        String str;
        if (i != 0) {
            str = OooO0Oo();
            if (!TextUtils.isEmpty(str)) {
                return new C8473oOoooO0(EnumC1096b.UDID, str);
            }
        } else {
            str = "";
        }
        if ((i & 2) != 0) {
            str = OooO0O0(context);
            if (!TextUtils.isEmpty(str)) {
                return new C8473oOoooO0(EnumC1096b.IMEI, str);
            }
        }
        if ((i & 1) == 0) {
            return new C8473oOoooO0(EnumC1096b.EMPTY, str);
        }
        return new C8473oOoooO0(EnumC1096b.SN, OooO00o(context));
    }

    private String OooO0O0(Context context) {
        C8483oOooooo OooO00o = C8480oOooooO0.OooO00o().m20150OooO00o();
        if (TextUtils.isEmpty(OooO00o.OooO0Oo())) {
            OooO00o.OooO0Oo(AbstractC8475oOoooO0O.OooO0OO(context));
        }
        return OooO00o.OooO0Oo();
    }

    private String OooO0Oo() {
        C8483oOooooo OooO00o = C8480oOooooO0.OooO00o().m20150OooO00o();
        if (TextUtils.isEmpty(OooO00o.OooO0o0())) {
            OooO00o.OooO0o0(AbstractC8475oOoooO0O.OooO00o());
        }
        return OooO00o.OooO0o0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract int m20142OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8473oOoooO0 m20143OooO00o(Context context) {
        C8473oOoooO0 oooooo0;
        String OooO00o = m20144OooO00o();
        if (!TextUtils.isEmpty(OooO00o)) {
            return new C8473oOoooO0(EnumC1096b.UDID, OooO00o);
        }
        String OooO0O0 = OooO0O0();
        if (!TextUtils.isEmpty(OooO0O0)) {
            return new C8473oOoooO0(EnumC1096b.IMEI, OooO0O0);
        }
        boolean OooO00o2 = OooO00o();
        String OooO0OO = OooO0OO();
        if (TextUtils.isEmpty(OooO0OO)) {
            return OooO00o2 ? OooO0O0(m20142OooO00o(), context) : OooO00o(m20142OooO00o(), context);
        }
        if (OooO00o2) {
            EnumC1096b bVar = EnumC1096b.SN;
            return oooooo0;
        }
        oooooo0 = new C8473oOoooO0(EnumC1096b.UDID, OooO00o(OooO0OO));
        return oooooo0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract String m20144OooO00o();

    public abstract String OooO00o(String str);

    public abstract String OooO0O0();

    public abstract String OooO0OO();
}
