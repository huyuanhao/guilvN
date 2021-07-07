package com.p118pd.sdk;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p269mm.opensdk.modelpay.PayReq;
import com.tencent.p269mm.opensdk.openapi.IWXAPI;
import com.tencent.p269mm.opensdk.openapi.WXAPIFactory;

/* renamed from: com.pd.sdk.oOoOoOo0  reason: case insensitive filesystem */
public class C8380oOoOoOo0 {
    public IWXAPI OooO00o;

    /* renamed from: com.pd.sdk.oOoOoOo0$OooO00o */
    public static class OooO00o {
        public static final C8380oOoOoOo0 OooO00o = new C8380oOoOoOo0();
    }

    public static C8380oOoOoOo0 OooO00o() {
        return OooO00o.OooO00o;
    }

    public void OooO00o(Context context) {
        this.OooO00o = WXAPIFactory.createWXAPI(context, null);
        this.OooO00o.registerApp(C8742oo0oOo00.m20365OooO00o(context, o0OOOOO.OooO00o(new byte[]{100, 115, ExifInterface.OooO00o, 104, 125, ExifInterface.OooO00o, 108, 119, 51, 96, 107, 39, 124, 120, C8027oOO00oo.OooO0OO, 121, 115}, "36c04d")));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20062OooO00o() {
        return this.OooO00o.isWXAppInstalled();
    }

    public void OooO00o(C8377oOoOoOO0 ooooooo0) {
        PayReq payReq = new PayReq();
        payReq.appId = ooooooo0.OooO00o();
        payReq.partnerId = ooooooo0.OooO0Oo();
        payReq.prepayId = ooooooo0.OooO0o0();
        payReq.packageValue = ooooooo0.OooO0OO();
        payReq.nonceStr = ooooooo0.OooO0O0();
        payReq.timeStamp = ooooooo0.OooO0oO();
        payReq.sign = ooooooo0.OooO0o();
        this.OooO00o.sendReq(payReq);
    }
}
