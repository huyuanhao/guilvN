package com.qiyukf.unicorn.p244ui.p247c;

import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.customization.title_bar.TitleBarConfig;

/* renamed from: com.qiyukf.unicorn.ui.c.b */
public final class C2842b {

    /* renamed from: a */
    public int f6030a;

    /* renamed from: b */
    public int f6031b;

    /* renamed from: c */
    public int f6032c;

    /* renamed from: d */
    public String f6033d;

    /* renamed from: e */
    public boolean f6034e;

    /* renamed from: f */
    public String f6035f;

    /* renamed from: g */
    public String f6036g;

    /* renamed from: h */
    public String f6037h;

    /* renamed from: com.qiyukf.unicorn.ui.c.b$1 */
    public static /* synthetic */ class C28431 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6038a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        static {
            /*
                int[] r0 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.m6606a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.qiyukf.unicorn.p244ui.p247c.C2842b.C28431.f6038a = r0
                r1 = 1
                int r2 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.f6040b     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = com.qiyukf.unicorn.p244ui.p247c.C2842b.C28431.f6038a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.f6041c     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = com.qiyukf.unicorn.p244ui.p247c.C2842b.C28431.f6038a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.f6042d     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = com.qiyukf.unicorn.p244ui.p247c.C2842b.C28431.f6038a     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.f6043e     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2 - r1
                r1 = 4
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.p247c.C2842b.C28431.<clinit>():void");
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.qiyukf.unicorn.ui.c.b$a */
    public static final class EnumC2844a extends Enum<EnumC2844a> {

        /* renamed from: a */
        public static final int f6039a = 1;

        /* renamed from: b */
        public static final int f6040b = 2;

        /* renamed from: c */
        public static final int f6041c = 3;

        /* renamed from: d */
        public static final int f6042d = 4;

        /* renamed from: e */
        public static final int f6043e = 5;

        /* renamed from: f */
        public static final int f6044f = 6;

        /* renamed from: g */
        public static final int f6045g = 7;

        /* renamed from: h */
        public static final /* synthetic */ int[] f6046h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: a */
        public static int[] m6606a() {
            return (int[]) f6046h.clone();
        }
    }

    public C2842b(int i) {
        this(i, null, true, null);
    }

    public C2842b(int i, String str, boolean z, String str2) {
        this(i, str, z, null, str2);
    }

    public C2842b(int i, String str, boolean z, String str2, String str3) {
        this.f6030a = i;
        this.f6033d = str;
        this.f6034e = z;
        this.f6036g = str2;
        this.f6035f = str3;
    }

    public C2842b(int i, boolean z) {
        this(i, null, z, null);
    }

    /* renamed from: a */
    public final void mo36671a() {
        int i;
        TitleBarConfig titleBarConfig = C2452d.m5373e().titleBarConfig;
        int i2 = C28431.f6038a[this.f6030a - 1];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (titleBarConfig == null || (i = titleBarConfig.titleBarRightQuitBtnBack) == 0) {
                            this.f6031b = C2364R.C2366drawable.ysf_ic_menu_close_dark_selector;
                            this.f6032c = C2364R.C2366drawable.ysf_ic_menu_close_light_selector;
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (titleBarConfig == null || (i = titleBarConfig.titleBarRightEvaluatorBtnBack) == 0) {
                    this.f6031b = C2364R.C2366drawable.ysf_evaluation_star_level_list_dark;
                    i = C2364R.C2366drawable.ysf_evaluation_star_level_list_light;
                }
            } else if (titleBarConfig == null || (i = titleBarConfig.titleBarRightHumanBtnBack) == 0) {
                this.f6031b = C2364R.C2366drawable.ysf_human_service_dark1;
                i = C2364R.C2366drawable.ysf_human_service_light;
            }
            this.f6031b = i;
        } else {
            this.f6031b = C2364R.C2366drawable.ysf_default_shop_logo_dark1;
            i = C2364R.C2366drawable.ysf_default_shop_logo_light;
        }
        this.f6032c = i;
    }

    /* renamed from: a */
    public final void mo36672a(String str) {
        this.f6037h = str;
    }

    /* renamed from: b */
    public final int mo36673b() {
        return this.f6030a;
    }

    /* renamed from: c */
    public final String mo36674c() {
        return this.f6033d;
    }

    /* renamed from: d */
    public final int mo36675d() {
        return this.f6031b;
    }

    /* renamed from: e */
    public final int mo36676e() {
        return this.f6032c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2842b)) {
            return false;
        }
        C2842b bVar = (C2842b) obj;
        return this.f6030a == bVar.f6030a && this.f6034e == bVar.f6034e;
    }

    /* renamed from: f */
    public final boolean mo36678f() {
        return this.f6034e;
    }

    /* renamed from: g */
    public final String mo36679g() {
        return this.f6036g;
    }

    /* renamed from: h */
    public final String mo36680h() {
        return this.f6035f;
    }

    /* renamed from: i */
    public final String mo36681i() {
        return this.f6037h;
    }
}
