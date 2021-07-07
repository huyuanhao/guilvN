package com.p118pd.sdk;

import com.alipay.sdk.app.AlipayResultActivity;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.pd.sdk.o0Ooo0Oo  reason: case insensitive filesystem */
public class C7521o0Ooo0Oo implements AlipayResultActivity.OooO00o {
    public final /* synthetic */ C7533o0OoooO0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ CountDownLatch f20368OooO00o;

    public C7521o0Ooo0Oo(C7533o0OoooO0 o0ooooo0, CountDownLatch countDownLatch) {
        this.OooO00o = o0ooooo0;
        this.f20368OooO00o = countDownLatch;
    }

    @Override // com.alipay.sdk.app.AlipayResultActivity.OooO00o
    public void OooO00o(int i, String str, String str2) {
        this.OooO00o.f20398OooO00o = C7479o0OoO000.OooO00o(i, str, str2);
        this.f20368OooO00o.countDown();
    }
}
