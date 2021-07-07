package com.p118pd.sdk;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.umeng.message.entity.UMessage;

/* renamed from: com.pd.sdk.oO00oOO  reason: case insensitive filesystem */
public class C7829oO00oOO extends AbstractC7831oO00oOOo<Bitmap> {
    public final Notification OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f20880OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RemoteViews f20881OooO00o;
    public final int o00oO0O;
    public final int o0ooOO0;
    public final String o0ooOOo;

    public C7829oO00oOO(Context context, int i, RemoteViews remoteViews, Notification notification, int i2) {
        this(context, i, remoteViews, notification, i2, null);
    }

    private void OooO00o() {
        ((NotificationManager) C7842oO0O0.OooO00o((NotificationManager) this.f20880OooO00o.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION))).notify(this.o0ooOOo, this.o00oO0O, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable AbstractC7837oO00ooOo oo00oooo) {
        onResourceReady((Bitmap) obj, (AbstractC7837oO00ooOo<? super Bitmap>) oo00oooo);
    }

    public C7829oO00oOO(Context context, int i, RemoteViews remoteViews, Notification notification, int i2, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, notification, i2, str);
    }

    public void onResourceReady(@NonNull Bitmap bitmap, @Nullable AbstractC7837oO00ooOo<? super Bitmap> oo00oooo) {
        this.f20881OooO00o.setImageViewBitmap(this.o0ooOO0, bitmap);
        OooO00o();
    }

    public C7829oO00oOO(Context context, int i, int i2, int i3, RemoteViews remoteViews, Notification notification, int i4, String str) {
        super(i, i2);
        this.f20880OooO00o = (Context) C7842oO0O0.OooO00o(context, "Context must not be null!");
        this.OooO00o = (Notification) C7842oO0O0.OooO00o(notification, "Notification object can not be null!");
        this.f20881OooO00o = (RemoteViews) C7842oO0O0.OooO00o(remoteViews, "RemoteViews object can not be null!");
        this.o0ooOO0 = i3;
        this.o00oO0O = i4;
        this.o0ooOOo = str;
    }
}
