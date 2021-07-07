package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oO000oO  reason: case insensitive filesystem */
public final class C7787oO000oO implements AbstractC7700o0oo0oo0<BitmapDrawable>, AbstractC7695o0oo0o0o {
    public final Resources OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7700o0oo0oo0<Bitmap> f20839OooO00o;

    public C7787oO000oO(@NonNull Resources resources, @NonNull AbstractC7700o0oo0oo0<Bitmap> o0oo0oo0) {
        this.OooO00o = (Resources) C7842oO0O0.OooO00o(resources);
        this.f20839OooO00o = (AbstractC7700o0oo0oo0) C7842oO0O0.OooO00o(o0oo0oo0);
    }

    @Deprecated
    public static C7787oO000oO OooO00o(Context context, Bitmap bitmap) {
        return (C7787oO000oO) OooO00o(context.getResources(), C7875oO0OOo0o.OooO00o(bitmap, ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context).m19238OooO00o()));
    }

    @Override // com.p118pd.sdk.AbstractC7695o0oo0o0o
    public void initialize() {
        AbstractC7700o0oo0oo0<Bitmap> o0oo0oo0 = this.f20839OooO00o;
        if (o0oo0oo0 instanceof AbstractC7695o0oo0o0o) {
            ((AbstractC7695o0oo0o0o) o0oo0oo0).initialize();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
    public void recycle() {
        this.f20839OooO00o.recycle();
    }

    @Deprecated
    public static C7787oO000oO OooO00o(Resources resources, AbstractC7711o0ooO0OO o0ooo0oo, Bitmap bitmap) {
        return (C7787oO000oO) OooO00o(resources, C7875oO0OOo0o.OooO00o(bitmap, o0ooo0oo));
    }

    @Nullable
    public static AbstractC7700o0oo0oo0<BitmapDrawable> OooO00o(@NonNull Resources resources, @Nullable AbstractC7700o0oo0oo0<Bitmap> o0oo0oo0) {
        if (o0oo0oo0 == null) {
            return null;
        }
        return new C7787oO000oO(resources, o0oo0oo0);
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<BitmapDrawable> m19445OooO00o() {
        return BitmapDrawable.class;
    }

    /* Return type fixed from 'android.graphics.drawable.BitmapDrawable' to match base method */
    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<BitmapDrawable> get() {
        return new BitmapDrawable(this.OooO00o, this.f20839OooO00o.get());
    }

    /* Return type fixed from 'int' to match base method */
    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    public Class<BitmapDrawable> OooO00o() {
        return this.f20839OooO00o.OooO00o();
    }
}
