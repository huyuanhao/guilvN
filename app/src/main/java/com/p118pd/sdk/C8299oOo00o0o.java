package com.p118pd.sdk;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oOo00o0o  reason: case insensitive filesystem */
public class C8299oOo00o0o extends AbstractC7831oO00oOOo<Bitmap> {
    public final ComponentName OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f21385OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RemoteViews f21386OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f21387OooO00o;
    public final int o00oO0O;

    public C8299oOo00o0o(Context context, int i, int i2, int i3, RemoteViews remoteViews, int... iArr) {
        super(i, i2);
        if (iArr.length != 0) {
            this.f21385OooO00o = (Context) C7842oO0O0.OooO00o(context, "Context can not be null!");
            this.f21386OooO00o = (RemoteViews) C7842oO0O0.OooO00o(remoteViews, "RemoteViews object can not be null!");
            this.f21387OooO00o = (int[]) C7842oO0O0.OooO00o(iArr, "WidgetIds can not be null!");
            this.o00oO0O = i3;
            this.OooO00o = null;
            return;
        }
        throw new IllegalArgumentException("WidgetIds must have length > 0");
    }

    private void OooO00o() {
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f21385OooO00o);
        ComponentName componentName = this.OooO00o;
        if (componentName != null) {
            instance.updateAppWidget(componentName, this.f21386OooO00o);
        } else {
            instance.updateAppWidget(this.f21387OooO00o, this.f21386OooO00o);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable AbstractC7837oO00ooOo oo00oooo) {
        onResourceReady((Bitmap) obj, (AbstractC7837oO00ooOo<? super Bitmap>) oo00oooo);
    }

    public void onResourceReady(@NonNull Bitmap bitmap, @Nullable AbstractC7837oO00ooOo<? super Bitmap> oo00oooo) {
        this.f21386OooO00o.setImageViewBitmap(this.o00oO0O, bitmap);
        OooO00o();
    }

    public C8299oOo00o0o(Context context, int i, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, iArr);
    }

    public C8299oOo00o0o(Context context, int i, int i2, int i3, RemoteViews remoteViews, ComponentName componentName) {
        super(i, i2);
        this.f21385OooO00o = (Context) C7842oO0O0.OooO00o(context, "Context can not be null!");
        this.f21386OooO00o = (RemoteViews) C7842oO0O0.OooO00o(remoteViews, "RemoteViews object can not be null!");
        this.OooO00o = (ComponentName) C7842oO0O0.OooO00o(componentName, "ComponentName can not be null!");
        this.o00oO0O = i3;
        this.f21387OooO00o = null;
    }

    public C8299oOo00o0o(Context context, int i, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, componentName);
    }
}
