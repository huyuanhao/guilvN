package com.vivo.push.p282c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.p281b.C4053s;
import com.vivo.push.util.AsyncTaskC4142l;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4147q;

/* renamed from: com.vivo.push.c.s */
public final class RunnableC4091s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InsideNotificationItem f10985a;

    /* renamed from: b */
    public final /* synthetic */ C4053s f10986b;

    /* renamed from: c */
    public final /* synthetic */ C4090r f10987c;

    public RunnableC4091s(C4090r rVar, InsideNotificationItem insideNotificationItem, C4053s sVar) {
        this.f10987c = rVar;
        this.f10985a = insideNotificationItem;
        this.f10986b = sVar;
    }

    public final void run() {
        char c;
        C4090r rVar = this.f10987c;
        if (((AbstractC4064ab) rVar).f10953b.onNotificationMessageArrived(rVar.f11150a, C4147q.m11219a(this.f10985a))) {
            C4146p.m11216d("OnNotificationArrivedTask", "this notification has Intercept");
            return;
        }
        Context context = this.f10987c.f11150a;
        InsideNotificationItem insideNotificationItem = this.f10985a;
        long f = this.f10986b.mo40937f();
        C4090r rVar2 = this.f10987c;
        AsyncTaskC4142l lVar = new AsyncTaskC4142l(context, insideNotificationItem, f, ((AbstractC4064ab) rVar2).f10953b.isAllowNet(rVar2.f11150a));
        boolean isShowBigPicOnMobileNet = this.f10985a.isShowBigPicOnMobileNet();
        String purePicUrl = this.f10985a.getPurePicUrl();
        if (TextUtils.isEmpty(purePicUrl)) {
            purePicUrl = this.f10985a.getCoverUrl();
        }
        if (!TextUtils.isEmpty(purePicUrl)) {
            C4146p.m11214c("OnNotificationArrivedTask", "showCode=" + isShowBigPicOnMobileNet);
            if (!isShowBigPicOnMobileNet) {
                C4146p.m11208a(this.f10987c.f11150a, "mobile net unshow");
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f10987c.f11150a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    int type = activeNetworkInfo.getType();
                    c = type == 1 ? 2 : type == 0 ? (char) 1 : 3;
                } else {
                    c = 0;
                }
                if (c == 1) {
                    purePicUrl = null;
                    this.f10985a.clearCoverUrl();
                    this.f10985a.clearPurePicUrl();
                }
            } else {
                C4146p.m11208a(this.f10987c.f11150a, "mobile net show");
            }
        }
        lVar.execute(this.f10985a.getIconUrl(), purePicUrl);
    }
}
