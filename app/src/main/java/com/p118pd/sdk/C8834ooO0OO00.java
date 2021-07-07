package com.p118pd.sdk;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.cameraview.AutoFocusManager;
import com.netease.nimlib.notifier.NotificationTag;
import com.netease.nimlib.notifier.support26.NotificationCompat;
import com.umeng.message.entity.UMessage;
import com.umeng.socialize.net.dplus.CommonNetImpl;

/* renamed from: com.pd.sdk.ooO0OO00  reason: case insensitive filesystem */
public class C8834ooO0OO00 {
    public static final int OooO0O0 = 1000;
    public int OooO00o = 1000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f22029OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public NotificationManager f22030OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f22031OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f22032OooO00o;

    public C8834ooO0OO00() {
        Context OooO00o2 = C8769oo0ooOOO.OooO00o();
        this.f22031OooO00o = OooO00o2;
        this.f22030OooO00o = (NotificationManager) OooO00o2.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
        C9003ooOo000O.m20667OooO00o(this.f22031OooO00o);
    }

    private boolean OooO0O0() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f22029OooO00o < AutoFocusManager.AUTO_FOCUS_INTERVAL_MS) {
            return true;
        }
        this.f22029OooO00o = elapsedRealtime;
        return false;
    }

    public void OooO00o(String str, String str2, String str3, long j) {
        if (m20460OooO00o()) {
            NotificationCompat.C5148OooO0Oo oooO0Oo = new NotificationCompat.C5148OooO0Oo(this.f22031OooO00o, C9003ooOo000O.OooO00o(this.f22031OooO00o));
            oooO0Oo.OooO0OO((CharSequence) str2).OooO0O0((CharSequence) str3).OooO00o(true).OooO00o(m20461OooO00o()).OooO0oO(OooO00o()).OooO0OO(j).OooO00o(m20459OooO00o());
            OooO00o(oooO0Oo);
            Notification OooO00o2 = oooO0Oo.m15158OooO00o();
            NotificationManager notificationManager = this.f22030OooO00o;
            String tag = NotificationTag.MESSAGE.tag();
            int i = this.OooO00o;
            this.OooO00o = i + 1;
            notificationManager.notify(tag, i, OooO00o2);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public PendingIntent m20461OooO00o() {
        Intent intent = new Intent();
        C8833ooO0OO0.OooO00o(intent);
        intent.setComponent(this.f22031OooO00o.getPackageManager().getLaunchIntentForPackage(this.f22031OooO00o.getPackageName()).getComponent());
        intent.addFlags(603979776);
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(CommonNetImpl.FLAG_AUTH);
        return PendingIntent.getActivity(this.f22031OooO00o, NotificationTag.MESSAGE.mo17417id(), intent, CommonNetImpl.FLAG_AUTH);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20462OooO00o() {
        this.f22030OooO00o.cancelAll();
        this.OooO00o = 1000;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20460OooO00o() {
        return C8771oo0ooOo.OooO0O0();
    }

    private void OooO00o(NotificationCompat.C5148OooO0Oo oooO0Oo) {
        oooO0Oo.OooO0OO(7);
    }

    private int OooO00o() {
        return this.f22031OooO00o.getApplicationInfo().icon;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Bitmap m20459OooO00o() {
        Bitmap bitmap = this.f22032OooO00o;
        if (bitmap != null) {
            return bitmap;
        }
        Drawable loadIcon = this.f22031OooO00o.getApplicationInfo().loadIcon(this.f22031OooO00o.getPackageManager());
        if (loadIcon == null || !(loadIcon instanceof BitmapDrawable)) {
            return null;
        }
        Bitmap bitmap2 = ((BitmapDrawable) loadIcon).getBitmap();
        this.f22032OooO00o = bitmap2;
        return bitmap2;
    }
}
