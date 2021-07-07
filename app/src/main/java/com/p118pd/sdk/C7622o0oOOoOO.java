package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.SingleRequest;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.o0oOOoOO  reason: case insensitive filesystem */
public class C7622o0oOOoOO<TranscodeType> implements Cloneable, AbstractC7610o0o0Ooo0<C7622o0oOOoOO<TranscodeType>> {
    public static final C7824oO00o0oo DOWNLOAD_ONLY_OPTIONS = new C7824oO00o0oo().diskCacheStrategy(AbstractC7684o0oo0OOo.OooO0OO).priority(Priority.LOW).skipMemoryCache(true);
    public final Context context;
    public final C7824oO00o0oo defaultRequestOptions;
    @Nullable
    public C7622o0oOOoOO<TranscodeType> errorBuilder;
    public final ComponentCallbacks2C7604o0o0Oo0o glide;
    public final C7607o0o0OoOO glideContext;
    public boolean isDefaultTransitionOptionsSet;
    public boolean isModelSet;
    public boolean isThumbnailBuilt;
    @Nullable
    public Object model;
    @Nullable
    public List<oO0OOO0O<TranscodeType>> requestListeners;
    public final C7658o0oOooOO requestManager;
    @NonNull
    public C7824oO00o0oo requestOptions;
    @Nullable
    public Float thumbSizeMultiplier;
    @Nullable
    public C7622o0oOOoOO<TranscodeType> thumbnailBuilder;
    public final Class<TranscodeType> transcodeClass;
    @NonNull
    public AbstractC7623o0oOOoOo<?, ? super TranscodeType> transitionOptions;

    /* renamed from: com.pd.sdk.o0oOOoOO$OooO00o */
    public class OooO00o implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ RunnableC7823oO00o0oO f20468OooO00o;

        public OooO00o(RunnableC7823oO00o0oO oo00o0oo) {
            this.f20468OooO00o = oo00o0oo;
        }

        public void run() {
            if (!this.f20468OooO00o.isCancelled()) {
                C7622o0oOOoOO o0oooooo = C7622o0oOOoOO.this;
                RunnableC7823oO00o0oO oo00o0oo = this.f20468OooO00o;
                o0oooooo.into(oo00o0oo, oo00o0oo);
            }
        }
    }

    /* renamed from: com.pd.sdk.o0oOOoOO$OooO0O0 */
    public static /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] OooO00o;
        public static final /* synthetic */ int[] OooO0O0;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
            // Method dump skipped, instructions count: 144
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7622o0oOOoOO.OooO0O0.<clinit>():void");
        }
    }

    public C7622o0oOOoOO(ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, C7658o0oOooOO o0oooooo, Class<TranscodeType> cls, Context context2) {
        this.isDefaultTransitionOptionsSet = true;
        this.glide = o0o0oo0o;
        this.requestManager = o0oooooo;
        this.transcodeClass = cls;
        this.defaultRequestOptions = o0oooooo.getDefaultRequestOptions();
        this.context = context2;
        this.transitionOptions = o0oooooo.getDefaultTransitionOptions(cls);
        this.requestOptions = this.defaultRequestOptions;
        this.glideContext = o0o0oo0o.m19236OooO00o();
    }

    private AbstractC7821oO00o0o buildRequest(AbstractC7833oO00oOo0<TranscodeType> oo00ooo0, @Nullable oO0OOO0O<TranscodeType> oo0ooo0o, C7824oO00o0oo oo00o0oo) {
        return buildRequestRecursive(oo00ooo0, oo0ooo0o, null, this.transitionOptions, oo00o0oo.getPriority(), oo00o0oo.getOverrideWidth(), oo00o0oo.getOverrideHeight(), oo00o0oo);
    }

    private AbstractC7821oO00o0o buildRequestRecursive(AbstractC7833oO00oOo0<TranscodeType> oo00ooo0, @Nullable oO0OOO0O<TranscodeType> oo0ooo0o, @Nullable AbstractC7868oO0OOOo0 oo0oooo0, AbstractC7623o0oOOoOo<?, ? super TranscodeType> o0oooooo, Priority priority, int i, int i2, C7824oO00o0oo oo00o0oo) {
        C7865oO0OOO0o oo0ooo0o2;
        C7865oO0OOO0o oo0ooo0o3;
        if (this.errorBuilder != null) {
            oo0ooo0o3 = new C7865oO0OOO0o(oo0oooo0);
            oo0ooo0o2 = oo0ooo0o3;
        } else {
            oo0ooo0o2 = null;
            oo0ooo0o3 = oo0oooo0;
        }
        AbstractC7821oO00o0o buildThumbnailRequestRecursive = buildThumbnailRequestRecursive(oo00ooo0, oo0ooo0o, oo0ooo0o3, o0oooooo, priority, i, i2, oo00o0oo);
        if (oo0ooo0o2 == null) {
            return buildThumbnailRequestRecursive;
        }
        int overrideWidth = this.errorBuilder.requestOptions.getOverrideWidth();
        int overrideHeight = this.errorBuilder.requestOptions.getOverrideHeight();
        if (oO0O0O00.m19527OooO00o(i, i2) && !this.errorBuilder.requestOptions.isValidOverride()) {
            overrideWidth = oo00o0oo.getOverrideWidth();
            overrideHeight = oo00o0oo.getOverrideHeight();
        }
        C7622o0oOOoOO<TranscodeType> o0oooooo2 = this.errorBuilder;
        oo0ooo0o2.OooO00o(buildThumbnailRequestRecursive, o0oooooo2.buildRequestRecursive(oo00ooo0, oo0ooo0o, oo0ooo0o2, o0oooooo2.transitionOptions, o0oooooo2.requestOptions.getPriority(), overrideWidth, overrideHeight, this.errorBuilder.requestOptions));
        return oo0ooo0o2;
    }

    private AbstractC7821oO00o0o buildThumbnailRequestRecursive(AbstractC7833oO00oOo0<TranscodeType> oo00ooo0, oO0OOO0O<TranscodeType> oo0ooo0o, @Nullable AbstractC7868oO0OOOo0 oo0oooo0, AbstractC7623o0oOOoOo<?, ? super TranscodeType> o0oooooo, Priority priority, int i, int i2, C7824oO00o0oo oo00o0oo) {
        C7622o0oOOoOO<TranscodeType> o0oooooo2 = this.thumbnailBuilder;
        if (o0oooooo2 != null) {
            if (!this.isThumbnailBuilt) {
                AbstractC7623o0oOOoOo<?, ? super TranscodeType> o0oooooo3 = o0oooooo2.isDefaultTransitionOptionsSet ? o0oooooo : o0oooooo2.transitionOptions;
                Priority priority2 = this.thumbnailBuilder.requestOptions.isPrioritySet() ? this.thumbnailBuilder.requestOptions.getPriority() : getThumbnailPriority(priority);
                int overrideWidth = this.thumbnailBuilder.requestOptions.getOverrideWidth();
                int overrideHeight = this.thumbnailBuilder.requestOptions.getOverrideHeight();
                if (oO0O0O00.m19527OooO00o(i, i2) && !this.thumbnailBuilder.requestOptions.isValidOverride()) {
                    overrideWidth = oo00o0oo.getOverrideWidth();
                    overrideHeight = oo00o0oo.getOverrideHeight();
                }
                C7863oO0OO0oO oo0oo0oo = new C7863oO0OO0oO(oo0oooo0);
                AbstractC7821oO00o0o obtainRequest = obtainRequest(oo00ooo0, oo0ooo0o, oo00o0oo, oo0oo0oo, o0oooooo, priority, i, i2);
                this.isThumbnailBuilt = true;
                C7622o0oOOoOO<TranscodeType> o0oooooo4 = this.thumbnailBuilder;
                AbstractC7821oO00o0o buildRequestRecursive = o0oooooo4.buildRequestRecursive(oo00ooo0, oo0ooo0o, oo0oo0oo, o0oooooo3, priority2, overrideWidth, overrideHeight, o0oooooo4.requestOptions);
                this.isThumbnailBuilt = false;
                oo0oo0oo.OooO00o(obtainRequest, buildRequestRecursive);
                return oo0oo0oo;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.thumbSizeMultiplier == null) {
            return obtainRequest(oo00ooo0, oo0ooo0o, oo00o0oo, oo0oooo0, o0oooooo, priority, i, i2);
        } else {
            C7863oO0OO0oO oo0oo0oo2 = new C7863oO0OO0oO(oo0oooo0);
            oo0oo0oo2.OooO00o(obtainRequest(oo00ooo0, oo0ooo0o, oo00o0oo, oo0oo0oo2, o0oooooo, priority, i, i2), obtainRequest(oo00ooo0, oo0ooo0o, oo00o0oo.clone().sizeMultiplier(this.thumbSizeMultiplier.floatValue()), oo0oo0oo2, o0oooooo, getThumbnailPriority(priority), i, i2));
            return oo0oo0oo2;
        }
    }

    @NonNull
    private Priority getThumbnailPriority(@NonNull Priority priority) {
        int i = OooO0O0.OooO0O0[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + this.requestOptions.getPriority());
    }

    private boolean isSkipMemoryCacheWithCompletePreviousRequest(C7824oO00o0oo oo00o0oo, AbstractC7821oO00o0o oo00o0o) {
        return !oo00o0oo.isMemoryCacheable() && oo00o0o.OooO00o();
    }

    @NonNull
    private C7622o0oOOoOO<TranscodeType> loadGeneric(@Nullable Object obj) {
        this.model = obj;
        this.isModelSet = true;
        return this;
    }

    private AbstractC7821oO00o0o obtainRequest(AbstractC7833oO00oOo0<TranscodeType> oo00ooo0, oO0OOO0O<TranscodeType> oo0ooo0o, C7824oO00o0oo oo00o0oo, AbstractC7868oO0OOOo0 oo0oooo0, AbstractC7623o0oOOoOo<?, ? super TranscodeType> o0oooooo, Priority priority, int i, int i2) {
        Context context2 = this.context;
        C7607o0o0OoOO o0o0oooo = this.glideContext;
        return SingleRequest.OooO00o(context2, o0o0oooo, this.model, (Class) this.transcodeClass, oo00o0oo, i, i2, priority, (AbstractC7833oO00oOo0) oo00ooo0, (oO0OOO0O) oo0ooo0o, (List) this.requestListeners, oo0oooo0, o0o0oooo.m19244OooO00o(), (AbstractC8274oOo0000O) o0oooooo.m19258OooO00o());
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> addListener(@Nullable oO0OOO0O<TranscodeType> oo0ooo0o) {
        if (oo0ooo0o != null) {
            if (this.requestListeners == null) {
                this.requestListeners = new ArrayList();
            }
            this.requestListeners.add(oo0ooo0o);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> apply(@NonNull C7824oO00o0oo oo00o0oo) {
        C7842oO0O0.OooO00o(oo00o0oo);
        this.requestOptions = getMutableOptions().apply(oo00o0oo);
        return this;
    }

    @CheckResult
    @Deprecated
    public <Y extends AbstractC7833oO00oOo0<File>> Y downloadOnly(@NonNull Y y) {
        return (Y) getDownloadOnlyRequest().into(y);
    }

    @NonNull
    public C7622o0oOOoOO<TranscodeType> error(@Nullable C7622o0oOOoOO<TranscodeType> o0oooooo) {
        this.errorBuilder = o0oooooo;
        return this;
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<File> getDownloadOnlyRequest() {
        return new C7622o0oOOoOO(File.class, this).apply(DOWNLOAD_ONLY_OPTIONS);
    }

    @NonNull
    public C7824oO00o0oo getMutableOptions() {
        C7824oO00o0oo oo00o0oo = this.defaultRequestOptions;
        C7824oO00o0oo oo00o0oo2 = this.requestOptions;
        return oo00o0oo == oo00o0oo2 ? oo00o0oo2.clone() : oo00o0oo2;
    }

    @NonNull
    public <Y extends AbstractC7833oO00oOo0<TranscodeType>> Y into(@NonNull Y y) {
        return (Y) into(y, (oO0OOO0O) null);
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> listener(@Nullable oO0OOO0O<TranscodeType> oo0ooo0o) {
        this.requestListeners = null;
        return addListener(oo0ooo0o);
    }

    @NonNull
    public AbstractC7833oO00oOo0<TranscodeType> preload(int i, int i2) {
        return into(C7861oO0OO00o.OooO00o(this.requestManager, i, i2));
    }

    @NonNull
    public AbstractFutureC7822oO00o0o0<TranscodeType> submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> thumbnail(@Nullable C7622o0oOOoOO<TranscodeType> o0oooooo) {
        this.thumbnailBuilder = o0oooooo;
        return this;
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> transition(@NonNull AbstractC7623o0oOOoOo<?, ? super TranscodeType> o0oooooo) {
        this.transitionOptions = (AbstractC7623o0oOOoOo) C7842oO0O0.OooO00o(o0oooooo);
        this.isDefaultTransitionOptionsSet = false;
        return this;
    }

    @Override // java.lang.Object
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> clone() {
        try {
            C7622o0oOOoOO<TranscodeType> o0oooooo = (C7622o0oOOoOO) super.clone();
            o0oooooo.requestOptions = o0oooooo.requestOptions.clone();
            o0oooooo.transitionOptions = o0oooooo.transitionOptions.clone();
            return o0oooooo;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @CheckResult
    @Deprecated
    public AbstractFutureC7822oO00o0o0<File> downloadOnly(int i, int i2) {
        return getDownloadOnlyRequest().submit(i, i2);
    }

    @NonNull
    public <Y extends AbstractC7833oO00oOo0<TranscodeType>> Y into(@NonNull Y y, @Nullable oO0OOO0O<TranscodeType> oo0ooo0o) {
        return (Y) into(y, oo0ooo0o, getMutableOptions());
    }

    @NonNull
    public AbstractFutureC7822oO00o0o0<TranscodeType> submit(int i, int i2) {
        RunnableC7823oO00o0oO oo00o0oo = new RunnableC7823oO00o0oO(this.glideContext.m19242OooO00o(), i, i2);
        if (oO0O0O00.m19525OooO00o()) {
            this.glideContext.m19242OooO00o().post(new OooO00o(oo00o0oo));
        } else {
            into(oo00o0oo, oo00o0oo);
        }
        return oo00o0oo;
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> thumbnail(@Nullable C7622o0oOOoOO<TranscodeType>... o0ooooooArr) {
        C7622o0oOOoOO<TranscodeType> o0oooooo = null;
        if (o0ooooooArr == null || o0ooooooArr.length == 0) {
            return thumbnail((C7622o0oOOoOO) null);
        }
        for (int length = o0ooooooArr.length - 1; length >= 0; length--) {
            C7622o0oOOoOO<TranscodeType> o0oooooo2 = o0ooooooArr[length];
            if (o0oooooo2 != null) {
                if (o0oooooo == null) {
                    o0oooooo = o0oooooo2;
                } else {
                    o0oooooo = o0oooooo2.thumbnail(o0oooooo);
                }
            }
        }
        return thumbnail(o0oooooo);
    }

    private <Y extends AbstractC7833oO00oOo0<TranscodeType>> Y into(@NonNull Y y, @Nullable oO0OOO0O<TranscodeType> oo0ooo0o, @NonNull C7824oO00o0oo oo00o0oo) {
        oO0O0O00.OooO0O0();
        C7842oO0O0.OooO00o(y);
        if (this.isModelSet) {
            C7824oO00o0oo autoClone = oo00o0oo.autoClone();
            AbstractC7821oO00o0o buildRequest = buildRequest(y, oo0ooo0o, autoClone);
            AbstractC7821oO00o0o request = y.getRequest();
            if (!buildRequest.OooO0Oo(request) || isSkipMemoryCacheWithCompletePreviousRequest(autoClone, request)) {
                this.requestManager.clear((AbstractC7833oO00oOo0<?>) y);
                y.setRequest(buildRequest);
                this.requestManager.track(y, buildRequest);
                return y;
            }
            buildRequest.recycle();
            if (!((AbstractC7821oO00o0o) C7842oO0O0.OooO00o(request)).isRunning()) {
                request.begin();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @NonNull
    public AbstractC7833oO00oOo0<TranscodeType> preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> thumbnail(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.thumbSizeMultiplier = Float.valueOf(f);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> load(@Nullable Object obj) {
        return loadGeneric(obj);
    }

    public C7622o0oOOoOO(Class<TranscodeType> cls, C7622o0oOOoOO<?> o0oooooo) {
        this(o0oooooo.glide, o0oooooo.requestManager, cls, o0oooooo.context);
        this.model = o0oooooo.model;
        this.isModelSet = o0oooooo.isModelSet;
        this.requestOptions = o0oooooo.requestOptions;
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> load(@Nullable Bitmap bitmap) {
        return loadGeneric(bitmap).apply(C7824oO00o0oo.diskCacheStrategyOf(AbstractC7684o0oo0OOo.OooO0O0));
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> load(@Nullable Drawable drawable) {
        return loadGeneric(drawable).apply(C7824oO00o0oo.diskCacheStrategyOf(AbstractC7684o0oo0OOo.OooO0O0));
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> load(@Nullable String str) {
        return loadGeneric(str);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> load(@Nullable Uri uri) {
        return loadGeneric(uri);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> load(@Nullable File file) {
        return loadGeneric(file);
    }

    @NonNull
    public oO0OO00O<ImageView, TranscodeType> into(@NonNull ImageView imageView) {
        oO0O0O00.OooO0O0();
        C7842oO0O0.OooO00o(imageView);
        C7824oO00o0oo oo00o0oo = this.requestOptions;
        if (!oo00o0oo.isTransformationSet() && oo00o0oo.isTransformationAllowed() && imageView.getScaleType() != null) {
            switch (OooO0O0.OooO00o[imageView.getScaleType().ordinal()]) {
                case 1:
                    oo00o0oo = oo00o0oo.clone().optionalCenterCrop();
                    break;
                case 2:
                    oo00o0oo = oo00o0oo.clone().optionalCenterInside();
                    break;
                case 3:
                case 4:
                case 5:
                    oo00o0oo = oo00o0oo.clone().optionalFitCenter();
                    break;
                case 6:
                    oo00o0oo = oo00o0oo.clone().optionalCenterInside();
                    break;
            }
        }
        return (oO0OO00O) into(this.glideContext.OooO00o(imageView, this.transcodeClass), null, oo00o0oo);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> load(@Nullable @DrawableRes @RawRes Integer num) {
        return loadGeneric(num).apply(C7824oO00o0oo.signatureOf(C7840oO00oooo.m19515OooO00o(this.context)));
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @CheckResult
    @Deprecated
    public C7622o0oOOoOO<TranscodeType> load(@Nullable URL url) {
        return loadGeneric(url);
    }

    @Override // com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public C7622o0oOOoOO<TranscodeType> load(@Nullable byte[] bArr) {
        C7622o0oOOoOO<TranscodeType> loadGeneric = loadGeneric(bArr);
        if (!loadGeneric.requestOptions.isDiskCacheStrategySet()) {
            loadGeneric = loadGeneric.apply(C7824oO00o0oo.diskCacheStrategyOf(AbstractC7684o0oo0OOo.OooO0O0));
        }
        return !loadGeneric.requestOptions.isSkipMemoryCacheSet() ? loadGeneric.apply(C7824oO00o0oo.skipMemoryCacheOf(true)) : loadGeneric;
    }

    @Deprecated
    public AbstractFutureC7822oO00o0o0<TranscodeType> into(int i, int i2) {
        return submit(i, i2);
    }
}
