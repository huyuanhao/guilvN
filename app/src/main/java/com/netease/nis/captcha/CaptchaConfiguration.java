package com.netease.nis.captcha;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;

public class CaptchaConfiguration {

    /* renamed from: A */
    public final int f2965A;

    /* renamed from: B */
    public final int f2966B;

    /* renamed from: a */
    public final Context f2967a;

    /* renamed from: b */
    public final String f2968b;

    /* renamed from: c */
    public final String f2969c;

    /* renamed from: d */
    public final ModeType f2970d;

    /* renamed from: e */
    public final LangType f2971e;

    /* renamed from: f */
    public final float f2972f;

    /* renamed from: g */
    public final String f2973g;

    /* renamed from: h */
    public final String f2974h;

    /* renamed from: i */
    public final String f2975i;

    /* renamed from: j */
    public final int f2976j;

    /* renamed from: k */
    public final int f2977k;

    /* renamed from: l */
    public final int f2978l;

    /* renamed from: m */
    public final CaptchaListener f2979m;

    /* renamed from: n */
    public final long f2980n;

    /* renamed from: o */
    public final boolean f2981o;

    /* renamed from: p */
    public final boolean f2982p;

    /* renamed from: q */
    public final boolean f2983q;

    /* renamed from: r */
    public final int f2984r;

    /* renamed from: s */
    public final String f2985s;

    /* renamed from: t */
    public final String f2986t;

    /* renamed from: u */
    public final String f2987u;

    /* renamed from: v */
    public final boolean f2988v;

    /* renamed from: w */
    public final String f2989w;

    /* renamed from: x */
    public final String f2990x;

    /* renamed from: y */
    public final String f2991y;

    /* renamed from: z */
    public final String f2992z;

    public static class Builder {
        public String apiServer;
        public float backgroundDimAmount = 0.5f;
        public String captchaId;
        public boolean debug;
        public String errorIconUrl;
        public int failedMaxRetryCount = 3;
        public int height = 0;
        public boolean isHideCloseButton = false;
        public boolean isIpv6;
        public boolean isTouchOutsideDisappear = true;
        public boolean isUsedDefaultFallback = true;
        public LangType langType = LangType.LANG_ZH_CN;
        public CaptchaListener listener;
        public int loadingAnimResId;
        public String loadingText;
        public int loadingTextId;
        public String mWmApiServer;
        public String mWmConfigServer;
        public String mWmStaticServer;
        public ModeType mode = ModeType.MODE_CAPTCHA;
        public String movingIconUrl;
        public String protocol;
        public String startIconUrl;
        public String staticServer;
        public long timeout = TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE;
        public String url = "https://cstaticdun.126.net/api/v2/mobile.v2.10.1.html";
        public int width = 0;
        public int xCoordinate = -1;
        public int yCoordinate = -1;

        public Builder apiServer(String str) {
            this.apiServer = str;
            return this;
        }

        public Builder backgroundDimAmount(float f) {
            this.backgroundDimAmount = f;
            return this;
        }

        public CaptchaConfiguration build(Context context) {
            return new CaptchaConfiguration(context, this);
        }

        public Builder captchaId(String str) {
            this.captchaId = str;
            return this;
        }

        public Builder controlBarImageUrl(String str, String str2, String str3) {
            this.startIconUrl = str;
            this.movingIconUrl = str2;
            this.errorIconUrl = str3;
            return this;
        }

        public Builder debug(boolean z) {
            this.debug = z;
            return this;
        }

        public Builder failedMaxRetryCount(int i) {
            this.failedMaxRetryCount = i;
            return this;
        }

        public Builder hideCloseButton(boolean z) {
            this.isHideCloseButton = z;
            return this;
        }

        public Builder ipv6(boolean z) {
            this.isIpv6 = z;
            return this;
        }

        public Builder languageType(LangType langType2) {
            this.langType = langType2;
            return this;
        }

        public Builder listener(CaptchaListener captchaListener) {
            this.listener = captchaListener;
            return this;
        }

        public Builder loadingAnimResId(int i) {
            this.loadingAnimResId = i;
            return this;
        }

        public Builder loadingText(String str) {
            this.loadingText = str;
            return this;
        }

        public Builder loadingTextId(int i) {
            this.loadingTextId = i;
            return this;
        }

        public Builder mode(ModeType modeType) {
            this.mode = modeType;
            return this;
        }

        public Builder position(int i, int i2) {
            this.xCoordinate = i;
            this.yCoordinate = i2;
            return this;
        }

        @Deprecated
        public Builder position(int i, int i2, int i3, int i4) {
            this.xCoordinate = i;
            this.yCoordinate = i2;
            this.width = i3;
            this.height = i4;
            return this;
        }

        public Builder protocol(String str) {
            if (!str.equals("http") && !str.equals("https")) {
                str = "https";
            }
            this.protocol = str;
            return this;
        }

        public Builder staticServer(String str) {
            this.staticServer = str;
            return this;
        }

        public Builder timeout(long j) {
            this.timeout = j;
            return this;
        }

        public Builder touchOutsideDisappear(boolean z) {
            this.isTouchOutsideDisappear = z;
            return this;
        }

        public Builder url(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.url = str;
            }
            return this;
        }

        public Builder useDefaultFallback(boolean z) {
            this.isUsedDefaultFallback = z;
            return this;
        }

        public Builder wmApiServer(String str) {
            this.mWmApiServer = str;
            return this;
        }

        public Builder wmConfigServer(String str) {
            this.mWmConfigServer = str;
            return this;
        }

        public Builder wmStaticServer(String str) {
            this.mWmStaticServer = str;
            return this;
        }
    }

    public enum LangType {
        LANG_ZH_CN,
        LANG_ZH_TW,
        LANG_EN,
        LANG_JA,
        LANG_KO,
        LANG_TH,
        LANG_VI,
        LANG_FR,
        LANG_AR,
        LANG_RU,
        LANG_DE,
        LANG_IT,
        LANG_HE,
        LANG_HI,
        LANG_ID,
        LANG_MY,
        LANG_LO,
        LANG_MS,
        LANG_PL,
        LANG_PT,
        LANG_ES,
        LANG_TR
    }

    public enum ModeType {
        MODE_CAPTCHA,
        MODE_INTELLIGENT_NO_SENSE
    }

    public CaptchaConfiguration(Context context, Builder builder) {
        this.f2967a = context;
        this.f2968b = builder.captchaId;
        this.f2969c = builder.url;
        this.f2970d = builder.mode;
        this.f2971e = builder.langType;
        this.f2972f = builder.backgroundDimAmount;
        this.f2973g = builder.startIconUrl;
        this.f2974h = builder.movingIconUrl;
        this.f2975i = builder.errorIconUrl;
        this.f2976j = builder.xCoordinate;
        this.f2977k = builder.yCoordinate;
        this.f2978l = builder.width;
        this.f2979m = builder.listener;
        this.f2980n = builder.timeout;
        this.f2981o = builder.isHideCloseButton;
        this.f2982p = builder.isTouchOutsideDisappear;
        this.f2983q = builder.isUsedDefaultFallback;
        this.f2984r = builder.failedMaxRetryCount;
        this.f2987u = builder.protocol;
        this.f2985s = builder.apiServer;
        this.f2986t = builder.staticServer;
        this.f2988v = builder.isIpv6;
        this.f2989w = builder.mWmConfigServer;
        this.f2990x = builder.mWmApiServer;
        this.f2991y = builder.mWmStaticServer;
        this.f2992z = builder.loadingText;
        this.f2965A = builder.loadingTextId;
        this.f2966B = builder.loadingAnimResId;
        C1664d.m2932a(builder.debug);
    }
}
