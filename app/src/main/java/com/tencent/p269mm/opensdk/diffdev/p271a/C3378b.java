package com.tencent.p269mm.opensdk.diffdev.p271a;

import com.tencent.p269mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p269mm.opensdk.diffdev.OAuthListener;
import com.tencent.p269mm.opensdk.utils.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.opensdk.diffdev.a.b */
public final class C3378b implements OAuthListener {

    /* renamed from: f */
    public final /* synthetic */ C3377a f8318f;

    public C3378b(C3377a aVar) {
        this.f8318f = aVar;
    }

    @Override // com.tencent.p269mm.opensdk.diffdev.OAuthListener
    public final void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
        Log.m8650d("MicroMsg.SDK.ListenerWrapper", String.format("onAuthFinish, errCode = %s, authCode = %s", oAuthErrCode.toString(), str));
        this.f8318f.f8316d = null;
        ArrayList<OAuthListener> arrayList = new ArrayList();
        arrayList.addAll(this.f8318f.f8315c);
        for (OAuthListener oAuthListener : arrayList) {
            oAuthListener.onAuthFinish(oAuthErrCode, str);
        }
    }

    @Override // com.tencent.p269mm.opensdk.diffdev.OAuthListener
    public final void onAuthGotQrcode(String str, byte[] bArr) {
        Log.m8650d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = " + str);
        ArrayList<OAuthListener> arrayList = new ArrayList();
        arrayList.addAll(this.f8318f.f8315c);
        for (OAuthListener oAuthListener : arrayList) {
            oAuthListener.onAuthGotQrcode(str, bArr);
        }
    }

    @Override // com.tencent.p269mm.opensdk.diffdev.OAuthListener
    public final void onQrcodeScanned() {
        Log.m8650d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
        if (this.f8318f.handler != null) {
            this.f8318f.handler.post(new RunnableC3379c(this));
        }
    }
}
