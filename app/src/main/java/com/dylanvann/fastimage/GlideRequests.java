package com.dylanvann.fastimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.p118pd.sdk.AbstractC7809oO00Ooo;
import com.p118pd.sdk.AbstractC7814oO00o00;
import com.p118pd.sdk.C7622o0oOOoOO;
import com.p118pd.sdk.C7658o0oOooOO;
import com.p118pd.sdk.C7796oO00OO;
import com.p118pd.sdk.C7824oO00o0oo;
import com.p118pd.sdk.ComponentCallbacks2C7604o0o0Oo0o;
import java.io.File;
import java.net.URL;

public class GlideRequests extends C7658o0oOooOO {
    public GlideRequests(@NonNull ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, @NonNull AbstractC7809oO00Ooo oo00ooo, @NonNull AbstractC7814oO00o00 oo00o00, @NonNull Context context) {
        super(o0o0oo0o, oo00ooo, oo00o00, context);
    }

    @Override // com.p118pd.sdk.C7658o0oOooOO
    public void setRequestOptions(@NonNull C7824oO00o0oo oo00o0oo) {
        if (oo00o0oo instanceof GlideOptions) {
            super.setRequestOptions(oo00o0oo);
        } else {
            super.setRequestOptions(new GlideOptions().apply(oo00o0oo));
        }
    }

    @Override // com.p118pd.sdk.C7658o0oOooOO
    @NonNull
    public GlideRequests applyDefaultRequestOptions(@NonNull C7824oO00o0oo oo00o0oo) {
        return (GlideRequests) super.applyDefaultRequestOptions(oo00o0oo);
    }

    @Override // com.p118pd.sdk.C7658o0oOooOO
    @NonNull
    @CheckResult
    /* renamed from: as */
    public <ResourceType> GlideRequest<ResourceType> m842as(@NonNull Class<ResourceType> cls) {
        return new GlideRequest<>(this.glide, this, cls, this.context);
    }

    @Override // com.p118pd.sdk.C7658o0oOooOO
    @NonNull
    @CheckResult
    public GlideRequest<Bitmap> asBitmap() {
        return (GlideRequest) super.asBitmap();
    }

    @Override // com.p118pd.sdk.C7658o0oOooOO
    @NonNull
    @CheckResult
    public GlideRequest<Drawable> asDrawable() {
        return (GlideRequest) super.asDrawable();
    }

    @Override // com.p118pd.sdk.C7658o0oOooOO
    @NonNull
    @CheckResult
    public GlideRequest<File> asFile() {
        return (GlideRequest) super.asFile();
    }

    @Override // com.p118pd.sdk.C7658o0oOooOO
    @NonNull
    @CheckResult
    public GlideRequest<C7796oO00OO> asGif() {
        return (GlideRequest) super.asGif();
    }

    @Override // com.p118pd.sdk.C7658o0oOooOO
    @NonNull
    @CheckResult
    public GlideRequest<File> download(@Nullable Object obj) {
        return (GlideRequest) super.download(obj);
    }

    @Override // com.p118pd.sdk.C7658o0oOooOO
    @NonNull
    @CheckResult
    public GlideRequest<File> downloadOnly() {
        return (GlideRequest) super.downloadOnly();
    }

    @Override // com.p118pd.sdk.C7658o0oOooOO
    @NonNull
    public GlideRequests setDefaultRequestOptions(@NonNull C7824oO00o0oo oo00o0oo) {
        return (GlideRequests) super.setDefaultRequestOptions(oo00o0oo);
    }

    /* Return type fixed from 'com.dylanvann.fastimage.GlideRequest<android.graphics.drawable.Drawable>' to match base method */
    @Override // com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable Bitmap bitmap) {
        return (GlideRequest) super.load(bitmap);
    }

    /* Return type fixed from 'com.dylanvann.fastimage.GlideRequest<android.graphics.drawable.Drawable>' to match base method */
    @Override // com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable Drawable drawable) {
        return (GlideRequest) super.load(drawable);
    }

    /* Return type fixed from 'com.dylanvann.fastimage.GlideRequest<android.graphics.drawable.Drawable>' to match base method */
    @Override // com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable String str) {
        return (GlideRequest) super.load(str);
    }

    /* Return type fixed from 'com.dylanvann.fastimage.GlideRequest<android.graphics.drawable.Drawable>' to match base method */
    @Override // com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable Uri uri) {
        return (GlideRequest) super.load(uri);
    }

    /* Return type fixed from 'com.dylanvann.fastimage.GlideRequest<android.graphics.drawable.Drawable>' to match base method */
    @Override // com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable File file) {
        return (GlideRequest) super.load(file);
    }

    /* Return type fixed from 'com.dylanvann.fastimage.GlideRequest<android.graphics.drawable.Drawable>' to match base method */
    @Override // com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable @DrawableRes @RawRes Integer num) {
        return (GlideRequest) super.load(num);
    }

    /* Return type fixed from 'com.dylanvann.fastimage.GlideRequest<android.graphics.drawable.Drawable>' to match base method */
    @Override // com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @CheckResult
    @Deprecated
    public C7622o0oOOoOO<Drawable> load(@Nullable URL url) {
        return (GlideRequest) super.load(url);
    }

    /* Return type fixed from 'com.dylanvann.fastimage.GlideRequest<android.graphics.drawable.Drawable>' to match base method */
    @Override // com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable byte[] bArr) {
        return (GlideRequest) super.load(bArr);
    }

    /* Return type fixed from 'com.dylanvann.fastimage.GlideRequest<android.graphics.drawable.Drawable>' to match base method */
    @Override // com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.C7658o0oOooOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable Object obj) {
        return (GlideRequest) super.load(obj);
    }
}
