package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Priority;
import com.p118pd.sdk.AbstractC8217oOOoOOO0;
import java.io.File;
import java.net.URL;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.o0oOooOO  reason: case insensitive filesystem */
public class C7658o0oOooOO implements AbstractC7811oO00OooO, AbstractC7610o0o0Ooo0<C7622o0oOOoOO<Drawable>> {
    public static final C7824oO00o0oo DECODE_TYPE_BITMAP = C7824oO00o0oo.decodeTypeOf(Bitmap.class).lock();
    public static final C7824oO00o0oo DECODE_TYPE_GIF = C7824oO00o0oo.decodeTypeOf(C7796oO00OO.class).lock();
    public static final C7824oO00o0oo DOWNLOAD_ONLY_OPTIONS = C7824oO00o0oo.diskCacheStrategyOf(AbstractC7684o0oo0OOo.OooO0OO).priority(Priority.LOW).skipMemoryCache(true);
    public final Runnable addSelfToLifecycle;
    public final AbstractC8217oOOoOOO0 connectivityMonitor;
    public final Context context;
    public final ComponentCallbacks2C7604o0o0Oo0o glide;
    public final AbstractC7809oO00Ooo lifecycle;
    public final Handler mainHandler;
    public C7824oO00o0oo requestOptions;
    public final C7909oO0OooOO requestTracker;
    public final oO0OOO00 targetTracker;
    public final AbstractC7814oO00o00 treeNode;

    /* renamed from: com.pd.sdk.o0oOooOO$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            C7658o0oOooOO o0oooooo = C7658o0oOooOO.this;
            o0oooooo.lifecycle.OooO00o(o0oooooo);
        }
    }

    /* renamed from: com.pd.sdk.o0oOooOO$OooO0O0 */
    public class OooO0O0 implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7833oO00oOo0 f20538OooO00o;

        public OooO0O0(AbstractC7833oO00oOo0 oo00ooo0) {
            this.f20538OooO00o = oo00ooo0;
        }

        public void run() {
            C7658o0oOooOO.this.clear(this.f20538OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o0oOooOO$OooO0OO */
    public static class OooO0OO extends oO0OO00O<View, Object> {
        public OooO0OO(@NonNull View view) {
            super(view);
        }

        @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
        public void onResourceReady(@NonNull Object obj, @Nullable AbstractC7837oO00ooOo<? super Object> oo00oooo) {
        }
    }

    /* renamed from: com.pd.sdk.o0oOooOO$OooO0Oo  reason: case insensitive filesystem */
    public static class C7659OooO0Oo implements AbstractC8217oOOoOOO0.OooO00o {
        public final C7909oO0OooOO OooO00o;

        public C7659OooO0Oo(@NonNull C7909oO0OooOO oo0ooooo) {
            this.OooO00o = oo0ooooo;
        }

        @Override // com.p118pd.sdk.AbstractC8217oOOoOOO0.OooO00o
        public void OooO00o(boolean z) {
            if (z) {
                this.OooO00o.OooO0Oo();
            }
        }
    }

    static {
        C.i(23);
    }

    public C7658o0oOooOO(@NonNull ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, @NonNull AbstractC7809oO00Ooo oo00ooo, @NonNull AbstractC7814oO00o00 oo00o00, @NonNull Context context2) {
        this(o0o0oo0o, oo00ooo, oo00o00, new C7909oO0OooOO(), o0o0oo0o.m19239OooO00o(), context2);
    }

    private void untrackOrDelegate(@NonNull AbstractC7833oO00oOo0<?> oo00ooo0) {
        if (!untrack(oo00ooo0) && !this.glide.OooO00o(oo00ooo0) && oo00ooo0.getRequest() != null) {
            AbstractC7821oO00o0o request = oo00ooo0.getRequest();
            oo00ooo0.setRequest(null);
            request.clear();
        }
    }

    private void updateRequestOptions(@NonNull C7824oO00o0oo oo00o0oo) {
        this.requestOptions = this.requestOptions.apply(oo00o0oo);
    }

    @NonNull
    public C7658o0oOooOO applyDefaultRequestOptions(@NonNull C7824oO00o0oo oo00o0oo) {
        updateRequestOptions(oo00o0oo);
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: as */
    public <ResourceType> C7622o0oOOoOO<ResourceType> mo4921as(@NonNull Class<ResourceType> cls) {
        return new C7622o0oOOoOO<>(this.glide, this, cls, this.context);
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Bitmap> asBitmap() {
        return mo4921as(Bitmap.class).apply(DECODE_TYPE_BITMAP);
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> asDrawable() {
        return mo4921as(Drawable.class);
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<File> asFile() {
        return mo4921as(File.class).apply(C7824oO00o0oo.skipMemoryCacheOf(true));
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<C7796oO00OO> asGif() {
        return mo4921as(C7796oO00OO.class).apply(DECODE_TYPE_GIF);
    }

    public void clear(@NonNull View view) {
        clear(new OooO0OO(view));
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<File> download(@Nullable Object obj) {
        return downloadOnly().load(obj);
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<File> downloadOnly() {
        return mo4921as(File.class).apply(DOWNLOAD_ONLY_OPTIONS);
    }

    public native C7824oO00o0oo getDefaultRequestOptions();

    @NonNull
    public <T> AbstractC7623o0oOOoOo<?, T> getDefaultTransitionOptions(Class<T> cls) {
        return this.glide.m19236OooO00o().OooO00o(cls);
    }

    public native boolean isPaused();

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onDestroy();

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStart();

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStop();

    public native void pauseAllRequests();

    public native void pauseRequests();

    public native void pauseRequestsRecursive();

    public native void resumeRequests();

    public native void resumeRequestsRecursive();

    @NonNull
    public C7658o0oOooOO setDefaultRequestOptions(@NonNull C7824oO00o0oo oo00o0oo) {
        setRequestOptions(oo00o0oo);
        return this;
    }

    public void setRequestOptions(@NonNull C7824oO00o0oo oo00o0oo) {
        this.requestOptions = oo00o0oo.clone().autoClone();
    }

    public native String toString();

    public void track(@NonNull AbstractC7833oO00oOo0<?> oo00ooo0, @NonNull AbstractC7821oO00o0o oo00o0o) {
        this.targetTracker.OooO00o(oo00ooo0);
        this.requestTracker.OooO0O0(oo00o0o);
    }

    public boolean untrack(@NonNull AbstractC7833oO00oOo0<?> oo00ooo0) {
        AbstractC7821oO00o0o request = oo00ooo0.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.requestTracker.m19592OooO00o(request)) {
            return false;
        }
        this.targetTracker.OooO0O0(oo00ooo0);
        oo00ooo0.setRequest(null);
        return true;
    }

    public void clear(@Nullable AbstractC7833oO00oOo0<?> oo00ooo0) {
        if (oo00ooo0 != null) {
            if (oO0O0O00.m19528OooO0O0()) {
                untrackOrDelegate(oo00ooo0);
            } else {
                this.mainHandler.post(new OooO0O0(oo00ooo0));
            }
        }
    }

    public C7658o0oOooOO(ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, AbstractC7809oO00Ooo oo00ooo, AbstractC7814oO00o00 oo00o00, C7909oO0OooOO oo0ooooo, AbstractC7807oO00OoOO oo00oooo, Context context2) {
        this.targetTracker = new oO0OOO00();
        this.addSelfToLifecycle = new OooO00o();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.glide = o0o0oo0o;
        this.lifecycle = oo00ooo;
        this.treeNode = oo00o00;
        this.requestTracker = oo0ooooo;
        this.context = context2;
        this.connectivityMonitor = oo00oooo.OooO00o(context2.getApplicationContext(), new C7659OooO0Oo(oo0ooooo));
        if (oO0O0O00.m19525OooO00o()) {
            this.mainHandler.post(this.addSelfToLifecycle);
        } else {
            oo00ooo.OooO00o(this);
        }
        oo00ooo.OooO00o(this.connectivityMonitor);
        setRequestOptions(o0o0oo0o.m19236OooO00o().m19246OooO00o());
        o0o0oo0o.OooO00o(this);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable Bitmap bitmap) {
        return asDrawable().load(bitmap);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable Drawable drawable) {
        return asDrawable().load(drawable);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable String str) {
        return asDrawable().load(str);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable Uri uri) {
        return asDrawable().load(uri);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable File file) {
        return asDrawable().load(file);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable @DrawableRes @RawRes Integer num) {
        return asDrawable().load(num);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @CheckResult
    @Deprecated
    public C7622o0oOOoOO<Drawable> load(@Nullable URL url) {
        return asDrawable().load(url);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable byte[] bArr) {
        return asDrawable().load(bArr);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<Drawable> load(@Nullable Object obj) {
        return asDrawable().load(obj);
    }
}
