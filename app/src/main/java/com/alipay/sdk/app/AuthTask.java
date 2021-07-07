package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.protocol.EnumC0406a;
import com.p118pd.sdk.C7467o0Oo0o0O;
import com.p118pd.sdk.C7476o0OoO;
import com.p118pd.sdk.C7477o0OoO0;
import com.p118pd.sdk.C7479o0OoO000;
import com.p118pd.sdk.C7482o0OoO0OO;
import com.p118pd.sdk.C7485o0OoO0o0;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.p118pd.sdk.C7502o0OoOo0o;
import com.p118pd.sdk.C7512o0OoOooO;
import com.p118pd.sdk.C7513o0Ooo;
import com.p118pd.sdk.C7515o0Ooo00;
import com.p118pd.sdk.C7516o0Ooo000;
import com.p118pd.sdk.C7528o0OooOoo;
import com.p118pd.sdk.C7531o0Oooo0o;
import com.p118pd.sdk.C7533o0OoooO0;
import com.p118pd.sdk.C7534o0OoooOO;
import com.p118pd.sdk.C7620o0oOOOoo;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AuthTask {
    public static final Object OooO00o = C7533o0OoooO0.class;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Activity f14763OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7534o0OoooOO f14764OooO00o;

    public AuthTask(Activity activity) {
        this.f14763OooO00o = activity;
        C7515o0Ooo00.OooO00o().OooO00o(this.f14763OooO00o, C7476o0OoO.OooO00o());
        C7477o0OoO0.OooO00o(activity);
        this.f14764OooO00o = new C7534o0OoooOO(activity, C7534o0OoooOO.OooO0Oo);
    }

    /* access modifiers changed from: private */
    public void OooO0O0() {
        C7534o0OoooOO o0oooooo = this.f14764OooO00o;
        if (o0oooooo != null) {
            o0oooooo.OooO0O0();
        }
    }

    public synchronized String auth(String str, boolean z) {
        String OooO0O0;
        Activity activity;
        if (z) {
            m14974OooO00o();
        }
        C7515o0Ooo00.OooO00o().OooO00o(this.f14763OooO00o, C7476o0OoO.OooO00o());
        OooO0O0 = C7479o0OoO000.OooO0O0();
        C7528o0OooOoo.OooO00o("");
        try {
            OooO0O0 = OooO00o(this.f14763OooO00o, str);
            C7486o0OoO0oO.OooO00o().OooO00o(this.f14763OooO00o);
            OooO0O0();
            activity = this.f14763OooO00o;
        } catch (Exception e) {
            C7620o0oOOOoo.m19257OooO00o((Throwable) e);
            C7486o0OoO0oO.OooO00o().OooO00o(this.f14763OooO00o);
            OooO0O0();
            activity = this.f14763OooO00o;
        } catch (Throwable th) {
            C7486o0OoO0oO.OooO00o().OooO00o(this.f14763OooO00o);
            OooO0O0();
            C7477o0OoO0.OooO0O0(this.f14763OooO00o, str);
            throw th;
        }
        C7477o0OoO0.OooO0O0(activity, str);
        return OooO0O0;
    }

    public synchronized Map<String, String> authV2(String str, boolean z) {
        return C7513o0Ooo.OooO00o(auth(str, z));
    }

    private C7533o0OoooO0.OooO00o OooO00o() {
        return new C7467o0Oo0o0O(this);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m14974OooO00o() {
        C7534o0OoooOO o0oooooo = this.f14764OooO00o;
        if (o0oooooo != null) {
            o0oooooo.m19201OooO00o();
        }
    }

    private String OooO0O0(Activity activity, String str) {
        EnumC0405k kVar;
        m14974OooO00o();
        try {
            List<C7512o0OoOooO> OooO00o2 = C7512o0OoOooO.OooO00o(new C7502o0OoOo0o().OooO00o(activity, str).m19120OooO00o().optJSONObject(C7485o0OoO0o0.OooO0OO).optJSONObject(C7485o0OoO0o0.OooO0Oo));
            OooO0O0();
            for (int i = 0; i < OooO00o2.size(); i++) {
                if (OooO00o2.get(i).OooO00o() == EnumC0406a.WapPay) {
                    String OooO00o3 = OooO00o(OooO00o2.get(i));
                    OooO0O0();
                    return OooO00o3;
                }
            }
        } catch (IOException e) {
            EnumC0405k b = EnumC0405k.m832b(EnumC0405k.NETWORK_ERROR.mo4240a());
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0O, e);
            OooO0O0();
            kVar = b;
        } catch (Throwable th) {
            OooO0O0();
            throw th;
        }
        OooO0O0();
        kVar = null;
        if (kVar == null) {
            kVar = EnumC0405k.m832b(EnumC0405k.FAILED.mo4240a());
        }
        return C7479o0OoO000.OooO00o(kVar.mo4240a(), kVar.mo4243b(), "");
    }

    private String OooO00o(Activity activity, String str) {
        String OooO00o2 = new C7516o0Ooo000(this.f14763OooO00o).m19159OooO00o(str);
        List<C7486o0OoO0oO.OooO00o> OooO00o3 = C7486o0OoO0oO.OooO00o().m19113OooO00o();
        if (!C7486o0OoO0oO.OooO00o().f20323OooO0OO || OooO00o3 == null) {
            OooO00o3 = C7528o0OooOoo.f20379OooO00o;
        }
        if (C7531o0Oooo0o.m19197OooO00o((Context) this.f14763OooO00o, OooO00o3)) {
            String OooO00o4 = new C7533o0OoooO0(activity, OooO00o()).OooO00o(OooO00o2);
            if (!TextUtils.equals(OooO00o4, C7533o0OoooO0.OooO0O0) && !TextUtils.equals(OooO00o4, C7533o0OoooO0.OooO0OO)) {
                return TextUtils.isEmpty(OooO00o4) ? C7479o0OoO000.OooO0O0() : OooO00o4;
            }
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OoooOo0, "");
            return OooO0O0(activity, OooO00o2);
        }
        C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OoooOoO, "");
        return OooO0O0(activity, OooO00o2);
    }

    private String OooO00o(C7512o0OoOooO o0oooooo) {
        String[] OooO00o2 = o0oooooo.m19154OooO00o();
        Bundle bundle = new Bundle();
        bundle.putString("url", OooO00o2[0]);
        Intent intent = new Intent(this.f14763OooO00o, H5AuthActivity.class);
        intent.putExtras(bundle);
        this.f14763OooO00o.startActivity(intent);
        synchronized (OooO00o) {
            try {
                OooO00o.wait();
            } catch (InterruptedException unused) {
                return C7479o0OoO000.OooO0O0();
            }
        }
        String OooO00o3 = C7479o0OoO000.OooO00o();
        return TextUtils.isEmpty(OooO00o3) ? C7479o0OoO000.OooO0O0() : OooO00o3;
    }
}
