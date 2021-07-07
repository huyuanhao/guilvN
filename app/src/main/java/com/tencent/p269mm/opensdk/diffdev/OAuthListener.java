package com.tencent.p269mm.opensdk.diffdev;

/* renamed from: com.tencent.mm.opensdk.diffdev.OAuthListener */
public interface OAuthListener {
    void onAuthFinish(OAuthErrCode oAuthErrCode, String str);

    void onAuthGotQrcode(String str, byte[] bArr);

    void onQrcodeScanned();
}
