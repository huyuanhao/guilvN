package com.p118pd.sdk;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.util.Map;

/* renamed from: com.pd.sdk.oO00o0oo  reason: case insensitive filesystem */
public class C7824oO00o0oo implements Cloneable {
    public static final int DISK_CACHE_STRATEGY = 4;
    public static final int ERROR_ID = 32;
    public static final int ERROR_PLACEHOLDER = 16;
    public static final int FALLBACK = 8192;
    public static final int FALLBACK_ID = 16384;
    public static final int IS_CACHEABLE = 256;
    public static final int ONLY_RETRIEVE_FROM_CACHE = 524288;
    public static final int OVERRIDE = 512;
    public static final int PLACEHOLDER = 64;
    public static final int PLACEHOLDER_ID = 128;
    public static final int PRIORITY = 8;
    public static final int RESOURCE_CLASS = 4096;
    public static final int SIGNATURE = 1024;
    public static final int SIZE_MULTIPLIER = 2;
    public static final int THEME = 32768;
    public static final int TRANSFORMATION = 2048;
    public static final int TRANSFORMATION_ALLOWED = 65536;
    public static final int TRANSFORMATION_REQUIRED = 131072;
    public static final int UNSET = -1;
    public static final int USE_ANIMATION_POOL = 1048576;
    public static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 262144;
    @Nullable
    public static C7824oO00o0oo centerCropOptions;
    @Nullable
    public static C7824oO00o0oo centerInsideOptions;
    @Nullable
    public static C7824oO00o0oo circleCropOptions;
    @Nullable
    public static C7824oO00o0oo fitCenterOptions;
    @Nullable
    public static C7824oO00o0oo noAnimationOptions;
    @Nullable
    public static C7824oO00o0oo noTransformOptions;
    @Nullable
    public static C7824oO00o0oo skipMemoryCacheFalseOptions;
    @Nullable
    public static C7824oO00o0oo skipMemoryCacheTrueOptions;
    @NonNull
    public AbstractC7684o0oo0OOo diskCacheStrategy = AbstractC7684o0oo0OOo.OooO0o0;
    public int errorId;
    @Nullable
    public Drawable errorPlaceholder;
    @Nullable
    public Drawable fallbackDrawable;
    public int fallbackId;
    public int fields;
    public boolean isAutoCloneEnabled;
    public boolean isCacheable = true;
    public boolean isLocked;
    public boolean isScaleOnlyOrNoTransform = true;
    public boolean isTransformationAllowed = true;
    public boolean isTransformationRequired;
    public boolean onlyRetrieveFromCache;
    @NonNull
    public C7648o0oOoOo options = new C7648o0oOoOo();
    public int overrideHeight = -1;
    public int overrideWidth = -1;
    @Nullable
    public Drawable placeholderDrawable;
    public int placeholderId;
    @NonNull
    public Priority priority = Priority.NORMAL;
    @NonNull
    public Class<?> resourceClass = Object.class;
    @NonNull
    public AbstractC7644o0oOoOO signature = C7767oO0.OooO00o();
    public float sizeMultiplier = 1.0f;
    @Nullable
    public Resources.Theme theme;
    @NonNull
    public Map<Class<?>, AbstractC7655o0oOoo0O<?>> transformations = new oO0O000o();
    public boolean useAnimationPool;
    public boolean useUnlimitedSourceGeneratorsPool;

    @NonNull
    @CheckResult
    public static C7824oO00o0oo bitmapTransform(@NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        return new C7824oO00o0oo().transform(o0oooo0o);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo centerCropTransform() {
        if (centerCropOptions == null) {
            centerCropOptions = new C7824oO00o0oo().centerCrop().autoClone();
        }
        return centerCropOptions;
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo centerInsideTransform() {
        if (centerInsideOptions == null) {
            centerInsideOptions = new C7824oO00o0oo().centerInside().autoClone();
        }
        return centerInsideOptions;
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = new C7824oO00o0oo().circleCrop().autoClone();
        }
        return circleCropOptions;
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo decodeTypeOf(@NonNull Class<?> cls) {
        return new C7824oO00o0oo().decode(cls);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo diskCacheStrategyOf(@NonNull AbstractC7684o0oo0OOo o0oo0ooo) {
        return new C7824oO00o0oo().diskCacheStrategy(o0oo0ooo);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo downsampleOf(@NonNull DownsampleStrategy downsampleStrategy) {
        return new C7824oO00o0oo().downsample(downsampleStrategy);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo encodeFormatOf(@NonNull Bitmap.CompressFormat compressFormat) {
        return new C7824oO00o0oo().encodeFormat(compressFormat);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo encodeQualityOf(@IntRange(from = 0, mo605to = 100) int i) {
        return new C7824oO00o0oo().encodeQuality(i);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo errorOf(@Nullable Drawable drawable) {
        return new C7824oO00o0oo().error(drawable);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo fitCenterTransform() {
        if (fitCenterOptions == null) {
            fitCenterOptions = new C7824oO00o0oo().fitCenter().autoClone();
        }
        return fitCenterOptions;
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo formatOf(@NonNull DecodeFormat decodeFormat) {
        return new C7824oO00o0oo().format(decodeFormat);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo frameOf(@IntRange(from = 0) long j) {
        return new C7824oO00o0oo().frame(j);
    }

    private boolean isSet(int i) {
        return isSet(this.fields, i);
    }

    public static boolean isSet(int i, int i2) {
        return (i & i2) != 0;
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo noAnimation() {
        if (noAnimationOptions == null) {
            noAnimationOptions = new C7824oO00o0oo().dontAnimate().autoClone();
        }
        return noAnimationOptions;
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo noTransformation() {
        if (noTransformOptions == null) {
            noTransformOptions = new C7824oO00o0oo().dontTransform().autoClone();
        }
        return noTransformOptions;
    }

    @NonNull
    @CheckResult
    public static <T> C7824oO00o0oo option(@NonNull C7647o0oOoOOo<T> o0oooooo, @NonNull T t) {
        return new C7824oO00o0oo().set(o0oooooo, t);
    }

    @NonNull
    private C7824oO00o0oo optionalScaleOnlyTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        return scaleOnlyTransform(downsampleStrategy, o0oooo0o, false);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo overrideOf(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        return new C7824oO00o0oo().override(i, i2);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo placeholderOf(@Nullable Drawable drawable) {
        return new C7824oO00o0oo().placeholder(drawable);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo priorityOf(@NonNull Priority priority2) {
        return new C7824oO00o0oo().priority(priority2);
    }

    @NonNull
    private C7824oO00o0oo scaleOnlyTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        return scaleOnlyTransform(downsampleStrategy, o0oooo0o, true);
    }

    @NonNull
    private C7824oO00o0oo selfOrThrowIfLocked() {
        if (!this.isLocked) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo signatureOf(@NonNull AbstractC7644o0oOoOO o0ooooo) {
        return new C7824oO00o0oo().signature(o0ooooo);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo sizeMultiplierOf(@FloatRange(from = 0.0d, mo599to = 1.0d) float f) {
        return new C7824oO00o0oo().sizeMultiplier(f);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo skipMemoryCacheOf(boolean z) {
        if (z) {
            if (skipMemoryCacheTrueOptions == null) {
                skipMemoryCacheTrueOptions = new C7824oO00o0oo().skipMemoryCache(true).autoClone();
            }
            return skipMemoryCacheTrueOptions;
        }
        if (skipMemoryCacheFalseOptions == null) {
            skipMemoryCacheFalseOptions = new C7824oO00o0oo().skipMemoryCache(false).autoClone();
        }
        return skipMemoryCacheFalseOptions;
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo timeoutOf(@IntRange(from = 0) int i) {
        return new C7824oO00o0oo().timeout(i);
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo apply(@NonNull C7824oO00o0oo oo00o0oo) {
        if (this.isAutoCloneEnabled) {
            return clone().apply(oo00o0oo);
        }
        if (isSet(oo00o0oo.fields, 2)) {
            this.sizeMultiplier = oo00o0oo.sizeMultiplier;
        }
        if (isSet(oo00o0oo.fields, 262144)) {
            this.useUnlimitedSourceGeneratorsPool = oo00o0oo.useUnlimitedSourceGeneratorsPool;
        }
        if (isSet(oo00o0oo.fields, 1048576)) {
            this.useAnimationPool = oo00o0oo.useAnimationPool;
        }
        if (isSet(oo00o0oo.fields, 4)) {
            this.diskCacheStrategy = oo00o0oo.diskCacheStrategy;
        }
        if (isSet(oo00o0oo.fields, 8)) {
            this.priority = oo00o0oo.priority;
        }
        if (isSet(oo00o0oo.fields, 16)) {
            this.errorPlaceholder = oo00o0oo.errorPlaceholder;
            this.errorId = 0;
            this.fields &= -33;
        }
        if (isSet(oo00o0oo.fields, 32)) {
            this.errorId = oo00o0oo.errorId;
            this.errorPlaceholder = null;
            this.fields &= -17;
        }
        if (isSet(oo00o0oo.fields, 64)) {
            this.placeholderDrawable = oo00o0oo.placeholderDrawable;
            this.placeholderId = 0;
            this.fields &= -129;
        }
        if (isSet(oo00o0oo.fields, 128)) {
            this.placeholderId = oo00o0oo.placeholderId;
            this.placeholderDrawable = null;
            this.fields &= -65;
        }
        if (isSet(oo00o0oo.fields, 256)) {
            this.isCacheable = oo00o0oo.isCacheable;
        }
        if (isSet(oo00o0oo.fields, 512)) {
            this.overrideWidth = oo00o0oo.overrideWidth;
            this.overrideHeight = oo00o0oo.overrideHeight;
        }
        if (isSet(oo00o0oo.fields, 1024)) {
            this.signature = oo00o0oo.signature;
        }
        if (isSet(oo00o0oo.fields, 4096)) {
            this.resourceClass = oo00o0oo.resourceClass;
        }
        if (isSet(oo00o0oo.fields, 8192)) {
            this.fallbackDrawable = oo00o0oo.fallbackDrawable;
            this.fallbackId = 0;
            this.fields &= -16385;
        }
        if (isSet(oo00o0oo.fields, 16384)) {
            this.fallbackId = oo00o0oo.fallbackId;
            this.fallbackDrawable = null;
            this.fields &= -8193;
        }
        if (isSet(oo00o0oo.fields, 32768)) {
            this.theme = oo00o0oo.theme;
        }
        if (isSet(oo00o0oo.fields, 65536)) {
            this.isTransformationAllowed = oo00o0oo.isTransformationAllowed;
        }
        if (isSet(oo00o0oo.fields, 131072)) {
            this.isTransformationRequired = oo00o0oo.isTransformationRequired;
        }
        if (isSet(oo00o0oo.fields, 2048)) {
            this.transformations.putAll(oo00o0oo.transformations);
            this.isScaleOnlyOrNoTransform = oo00o0oo.isScaleOnlyOrNoTransform;
        }
        if (isSet(oo00o0oo.fields, 524288)) {
            this.onlyRetrieveFromCache = oo00o0oo.onlyRetrieveFromCache;
        }
        if (!this.isTransformationAllowed) {
            this.transformations.clear();
            int i = this.fields & -2049;
            this.fields = i;
            this.isTransformationRequired = false;
            this.fields = i & -131073;
            this.isScaleOnlyOrNoTransform = true;
        }
        this.fields |= oo00o0oo.fields;
        this.options.OooO00o(oo00o0oo.options);
        return selfOrThrowIfLocked();
    }

    @NonNull
    public C7824oO00o0oo autoClone() {
        if (!this.isLocked || this.isAutoCloneEnabled) {
            this.isAutoCloneEnabled = true;
            return lock();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo centerCrop() {
        return transform(DownsampleStrategy.OooO0O0, new C7880oO0OOoo0());
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo centerInside() {
        return scaleOnlyTransform(DownsampleStrategy.OooO0o0, new C7780oO000OoO());
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo circleCrop() {
        return transform(DownsampleStrategy.OooO0o0, new C7874oO0OOo0O());
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo decode(@NonNull Class<?> cls) {
        if (this.isAutoCloneEnabled) {
            return clone().decode(cls);
        }
        this.resourceClass = (Class) C7842oO0O0.OooO00o(cls);
        this.fields |= 4096;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo disallowHardwareConfig() {
        return set(C7785oO000o00.OooO0Oo, false);
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo diskCacheStrategy(@NonNull AbstractC7684o0oo0OOo o0oo0ooo) {
        if (this.isAutoCloneEnabled) {
            return clone().diskCacheStrategy(o0oo0ooo);
        }
        this.diskCacheStrategy = (AbstractC7684o0oo0OOo) C7842oO0O0.OooO00o(o0oo0ooo);
        this.fields |= 4;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo dontAnimate() {
        return set(C7958oO0oOOO0.OooO0O0, true);
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo dontTransform() {
        if (this.isAutoCloneEnabled) {
            return clone().dontTransform();
        }
        this.transformations.clear();
        int i = this.fields & -2049;
        this.fields = i;
        this.isTransformationRequired = false;
        int i2 = i & -131073;
        this.fields = i2;
        this.isTransformationAllowed = false;
        this.fields = i2 | 65536;
        this.isScaleOnlyOrNoTransform = true;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo downsample(@NonNull DownsampleStrategy downsampleStrategy) {
        return set(DownsampleStrategy.f14839OooO00o, C7842oO0O0.OooO00o(downsampleStrategy));
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return set(C8949ooOOOOoo.OooO0O0, C7842oO0O0.OooO00o(compressFormat));
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo encodeQuality(@IntRange(from = 0, mo605to = 100) int i) {
        return set(C8949ooOOOOoo.OooO00o, Integer.valueOf(i));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7824oO00o0oo)) {
            return false;
        }
        C7824oO00o0oo oo00o0oo = (C7824oO00o0oo) obj;
        if (Float.compare(oo00o0oo.sizeMultiplier, this.sizeMultiplier) == 0 && this.errorId == oo00o0oo.errorId && oO0O0O00.OooO0O0(this.errorPlaceholder, oo00o0oo.errorPlaceholder) && this.placeholderId == oo00o0oo.placeholderId && oO0O0O00.OooO0O0(this.placeholderDrawable, oo00o0oo.placeholderDrawable) && this.fallbackId == oo00o0oo.fallbackId && oO0O0O00.OooO0O0(this.fallbackDrawable, oo00o0oo.fallbackDrawable) && this.isCacheable == oo00o0oo.isCacheable && this.overrideHeight == oo00o0oo.overrideHeight && this.overrideWidth == oo00o0oo.overrideWidth && this.isTransformationRequired == oo00o0oo.isTransformationRequired && this.isTransformationAllowed == oo00o0oo.isTransformationAllowed && this.useUnlimitedSourceGeneratorsPool == oo00o0oo.useUnlimitedSourceGeneratorsPool && this.onlyRetrieveFromCache == oo00o0oo.onlyRetrieveFromCache && this.diskCacheStrategy.equals(oo00o0oo.diskCacheStrategy) && this.priority == oo00o0oo.priority && this.options.equals(oo00o0oo.options) && this.transformations.equals(oo00o0oo.transformations) && this.resourceClass.equals(oo00o0oo.resourceClass) && oO0O0O00.OooO0O0(this.signature, oo00o0oo.signature) && oO0O0O00.OooO0O0(this.theme, oo00o0oo.theme)) {
            return true;
        }
        return false;
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo error(@Nullable Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return clone().error(drawable);
        }
        this.errorPlaceholder = drawable;
        int i = this.fields | 16;
        this.fields = i;
        this.errorId = 0;
        this.fields = i & -33;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo fallback(@Nullable Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return clone().fallback(drawable);
        }
        this.fallbackDrawable = drawable;
        int i = this.fields | 8192;
        this.fields = i;
        this.fallbackId = 0;
        this.fields = i & -16385;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo fitCenter() {
        return scaleOnlyTransform(DownsampleStrategy.OooO00o, new C7783oO000o());
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo format(@NonNull DecodeFormat decodeFormat) {
        C7842oO0O0.OooO00o(decodeFormat);
        return set(C7785oO000o00.f20825OooO00o, decodeFormat).set(C7958oO0oOOO0.OooO00o, decodeFormat);
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo frame(@IntRange(from = 0) long j) {
        return set(C7888oO0Oo0Oo.f20956OooO00o, Long.valueOf(j));
    }

    @NonNull
    public final AbstractC7684o0oo0OOo getDiskCacheStrategy() {
        return this.diskCacheStrategy;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    @Nullable
    public final Drawable getErrorPlaceholder() {
        return this.errorPlaceholder;
    }

    @Nullable
    public final Drawable getFallbackDrawable() {
        return this.fallbackDrawable;
    }

    public final int getFallbackId() {
        return this.fallbackId;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    @NonNull
    public final C7648o0oOoOo getOptions() {
        return this.options;
    }

    public final int getOverrideHeight() {
        return this.overrideHeight;
    }

    public final int getOverrideWidth() {
        return this.overrideWidth;
    }

    @Nullable
    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    public final int getPlaceholderId() {
        return this.placeholderId;
    }

    @NonNull
    public final Priority getPriority() {
        return this.priority;
    }

    @NonNull
    public final Class<?> getResourceClass() {
        return this.resourceClass;
    }

    @NonNull
    public final AbstractC7644o0oOoOO getSignature() {
        return this.signature;
    }

    public final float getSizeMultiplier() {
        return this.sizeMultiplier;
    }

    @Nullable
    public final Resources.Theme getTheme() {
        return this.theme;
    }

    @NonNull
    public final Map<Class<?>, AbstractC7655o0oOoo0O<?>> getTransformations() {
        return this.transformations;
    }

    public final boolean getUseAnimationPool() {
        return this.useAnimationPool;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.useUnlimitedSourceGeneratorsPool;
    }

    public int hashCode() {
        return oO0O0O00.OooO00o(this.theme, oO0O0O00.OooO00o(this.signature, oO0O0O00.OooO00o(this.resourceClass, oO0O0O00.OooO00o(this.transformations, oO0O0O00.OooO00o(this.options, oO0O0O00.OooO00o(this.priority, oO0O0O00.OooO00o(this.diskCacheStrategy, oO0O0O00.OooO00o(this.onlyRetrieveFromCache, oO0O0O00.OooO00o(this.useUnlimitedSourceGeneratorsPool, oO0O0O00.OooO00o(this.isTransformationAllowed, oO0O0O00.OooO00o(this.isTransformationRequired, oO0O0O00.OooO00o(this.overrideWidth, oO0O0O00.OooO00o(this.overrideHeight, oO0O0O00.OooO00o(this.isCacheable, oO0O0O00.OooO00o(this.fallbackDrawable, oO0O0O00.OooO00o(this.fallbackId, oO0O0O00.OooO00o(this.placeholderDrawable, oO0O0O00.OooO00o(this.placeholderId, oO0O0O00.OooO00o(this.errorPlaceholder, oO0O0O00.OooO00o(this.errorId, oO0O0O00.OooO00o(this.sizeMultiplier)))))))))))))))))))));
    }

    public boolean isAutoCloneEnabled() {
        return this.isAutoCloneEnabled;
    }

    public final boolean isDiskCacheStrategySet() {
        return isSet(4);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final boolean isMemoryCacheable() {
        return this.isCacheable;
    }

    public final boolean isPrioritySet() {
        return isSet(8);
    }

    public boolean isScaleOnlyOrNoTransform() {
        return this.isScaleOnlyOrNoTransform;
    }

    public final boolean isSkipMemoryCacheSet() {
        return isSet(256);
    }

    public final boolean isTransformationAllowed() {
        return this.isTransformationAllowed;
    }

    public final boolean isTransformationRequired() {
        return this.isTransformationRequired;
    }

    public final boolean isTransformationSet() {
        return isSet(2048);
    }

    public final boolean isValidOverride() {
        return oO0O0O00.m19527OooO00o(this.overrideWidth, this.overrideHeight);
    }

    @NonNull
    public C7824oO00o0oo lock() {
        this.isLocked = true;
        return this;
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo onlyRetrieveFromCache(boolean z) {
        if (this.isAutoCloneEnabled) {
            return clone().onlyRetrieveFromCache(z);
        }
        this.onlyRetrieveFromCache = z;
        this.fields |= 524288;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo optionalCenterCrop() {
        return optionalTransform(DownsampleStrategy.OooO0O0, new C7880oO0OOoo0());
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo optionalCenterInside() {
        return optionalScaleOnlyTransform(DownsampleStrategy.OooO0o0, new C7780oO000OoO());
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo optionalCircleCrop() {
        return optionalTransform(DownsampleStrategy.OooO0O0, new C7874oO0OOo0O());
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo optionalFitCenter() {
        return optionalScaleOnlyTransform(DownsampleStrategy.OooO00o, new C7783oO000o());
    }

    @NonNull
    public final C7824oO00o0oo optionalTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        if (this.isAutoCloneEnabled) {
            return clone().optionalTransform(downsampleStrategy, o0oooo0o);
        }
        downsample(downsampleStrategy);
        return transform(o0oooo0o, false);
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo override(int i, int i2) {
        if (this.isAutoCloneEnabled) {
            return clone().override(i, i2);
        }
        this.overrideWidth = i;
        this.overrideHeight = i2;
        this.fields |= 512;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo placeholder(@Nullable Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return clone().placeholder(drawable);
        }
        this.placeholderDrawable = drawable;
        int i = this.fields | 64;
        this.fields = i;
        this.placeholderId = 0;
        this.fields = i & -129;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo priority(@NonNull Priority priority2) {
        if (this.isAutoCloneEnabled) {
            return clone().priority(priority2);
        }
        this.priority = (Priority) C7842oO0O0.OooO00o(priority2);
        this.fields |= 8;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public <T> C7824oO00o0oo set(@NonNull C7647o0oOoOOo<T> o0oooooo, @NonNull T t) {
        if (this.isAutoCloneEnabled) {
            return clone().set(o0oooooo, t);
        }
        C7842oO0O0.OooO00o(o0oooooo);
        C7842oO0O0.OooO00o((Object) t);
        this.options.OooO00o(o0oooooo, t);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo signature(@NonNull AbstractC7644o0oOoOO o0ooooo) {
        if (this.isAutoCloneEnabled) {
            return clone().signature(o0ooooo);
        }
        this.signature = (AbstractC7644o0oOoOO) C7842oO0O0.OooO00o(o0ooooo);
        this.fields |= 1024;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo sizeMultiplier(@FloatRange(from = 0.0d, mo599to = 1.0d) float f) {
        if (this.isAutoCloneEnabled) {
            return clone().sizeMultiplier(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.sizeMultiplier = f;
        this.fields |= 2;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo skipMemoryCache(boolean z) {
        if (this.isAutoCloneEnabled) {
            return clone().skipMemoryCache(true);
        }
        this.isCacheable = !z;
        this.fields |= 256;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo theme(@Nullable Resources.Theme theme2) {
        if (this.isAutoCloneEnabled) {
            return clone().theme(theme2);
        }
        this.theme = theme2;
        this.fields |= 32768;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo timeout(@IntRange(from = 0) int i) {
        return set(C7931oO0o0o.OooO00o, Integer.valueOf(i));
    }

    @NonNull
    @CheckResult
    public final C7824oO00o0oo transform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        if (this.isAutoCloneEnabled) {
            return clone().transform(downsampleStrategy, o0oooo0o);
        }
        downsample(downsampleStrategy);
        return transform(o0oooo0o);
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo transforms(@NonNull AbstractC7655o0oOoo0O<Bitmap>... o0oooo0oArr) {
        return transform((AbstractC7655o0oOoo0O<Bitmap>) new C7646o0oOoOOO(o0oooo0oArr), true);
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo useAnimationPool(boolean z) {
        if (this.isAutoCloneEnabled) {
            return clone().useAnimationPool(z);
        }
        this.useAnimationPool = z;
        this.fields |= 1048576;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo useUnlimitedSourceGeneratorsPool(boolean z) {
        if (this.isAutoCloneEnabled) {
            return clone().useUnlimitedSourceGeneratorsPool(z);
        }
        this.useUnlimitedSourceGeneratorsPool = z;
        this.fields |= 262144;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo errorOf(@DrawableRes int i) {
        return new C7824oO00o0oo().error(i);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo overrideOf(@IntRange(from = 0) int i) {
        return overrideOf(i, i);
    }

    @NonNull
    @CheckResult
    public static C7824oO00o0oo placeholderOf(@DrawableRes int i) {
        return new C7824oO00o0oo().placeholder(i);
    }

    @NonNull
    private C7824oO00o0oo scaleOnlyTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o, boolean z) {
        C7824oO00o0oo transform = z ? transform(downsampleStrategy, o0oooo0o) : optionalTransform(downsampleStrategy, o0oooo0o);
        transform.isScaleOnlyOrNoTransform = true;
        return transform;
    }

    @Override // java.lang.Object
    @CheckResult
    public C7824oO00o0oo clone() {
        try {
            C7824oO00o0oo oo00o0oo = (C7824oO00o0oo) super.clone();
            C7648o0oOoOo o0ooooo = new C7648o0oOoOo();
            oo00o0oo.options = o0ooooo;
            o0ooooo.OooO00o(this.options);
            oO0O000o oo0o000o = new oO0O000o();
            oo00o0oo.transformations = oo0o000o;
            oo0o000o.putAll(this.transformations);
            oo00o0oo.isLocked = false;
            oo00o0oo.isAutoCloneEnabled = false;
            return oo00o0oo;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo optionalTransform(@NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        return transform(o0oooo0o, false);
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo transform(@NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        return transform(o0oooo0o, true);
    }

    @NonNull
    private C7824oO00o0oo transform(@NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o, boolean z) {
        if (this.isAutoCloneEnabled) {
            return clone().transform(o0oooo0o, z);
        }
        C8945ooOOOOOo oooooooo = new C8945ooOOOOOo(o0oooo0o, z);
        transform(Bitmap.class, o0oooo0o, z);
        transform(Drawable.class, oooooooo, z);
        transform(BitmapDrawable.class, oooooooo.OooO00o(), z);
        transform(C7796oO00OO.class, new C8293oOo00Oo0(o0oooo0o), z);
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public <T> C7824oO00o0oo optionalTransform(@NonNull Class<T> cls, @NonNull AbstractC7655o0oOoo0O<T> o0oooo0o) {
        return transform(cls, o0oooo0o, false);
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo override(int i) {
        return override(i, i);
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo error(@DrawableRes int i) {
        if (this.isAutoCloneEnabled) {
            return clone().error(i);
        }
        this.errorId = i;
        int i2 = this.fields | 32;
        this.fields = i2;
        this.errorPlaceholder = null;
        this.fields = i2 & -17;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo fallback(@DrawableRes int i) {
        if (this.isAutoCloneEnabled) {
            return clone().fallback(i);
        }
        this.fallbackId = i;
        int i2 = this.fields | 16384;
        this.fields = i2;
        this.fallbackDrawable = null;
        this.fields = i2 & -8193;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public C7824oO00o0oo placeholder(@DrawableRes int i) {
        if (this.isAutoCloneEnabled) {
            return clone().placeholder(i);
        }
        this.placeholderId = i;
        int i2 = this.fields | 128;
        this.fields = i2;
        this.placeholderDrawable = null;
        this.fields = i2 & -65;
        return selfOrThrowIfLocked();
    }

    @NonNull
    private <T> C7824oO00o0oo transform(@NonNull Class<T> cls, @NonNull AbstractC7655o0oOoo0O<T> o0oooo0o, boolean z) {
        if (this.isAutoCloneEnabled) {
            return clone().transform(cls, o0oooo0o, z);
        }
        C7842oO0O0.OooO00o(cls);
        C7842oO0O0.OooO00o(o0oooo0o);
        this.transformations.put(cls, o0oooo0o);
        int i = this.fields | 2048;
        this.fields = i;
        this.isTransformationAllowed = true;
        int i2 = i | 65536;
        this.fields = i2;
        this.isScaleOnlyOrNoTransform = false;
        if (z) {
            this.fields = i2 | 131072;
            this.isTransformationRequired = true;
        }
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public <T> C7824oO00o0oo transform(@NonNull Class<T> cls, @NonNull AbstractC7655o0oOoo0O<T> o0oooo0o) {
        return transform(cls, o0oooo0o, true);
    }
}
