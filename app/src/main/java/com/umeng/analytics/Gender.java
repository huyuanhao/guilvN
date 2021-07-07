package com.umeng.analytics;

import java.util.Locale;

public enum Gender {
    Male(1) {
        public String toString() {
            return String.format(Locale.US, "Male:%d", Integer.valueOf(this.value));
        }
    },
    Female(2) {
        public String toString() {
            return String.format(Locale.US, "Female:%d", Integer.valueOf(this.value));
        }
    },
    Unknown(0) {
        public String toString() {
            return String.format(Locale.US, "Unknown:%d", Integer.valueOf(this.value));
        }
    };
    
    public int value;

    /* renamed from: com.umeng.analytics.Gender$4 */
    public static /* synthetic */ class C34054 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8363a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.umeng.analytics.Gender[] r0 = com.umeng.analytics.Gender.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.umeng.analytics.Gender.C34054.f8363a = r0
                com.umeng.analytics.Gender r1 = com.umeng.analytics.Gender.Male     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.umeng.analytics.Gender.C34054.f8363a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.umeng.analytics.Gender r1 = com.umeng.analytics.Gender.Female     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.umeng.analytics.Gender.C34054.f8363a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.umeng.analytics.Gender r1 = com.umeng.analytics.Gender.Unknown     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.Gender.C34054.<clinit>():void");
        }
    }

    public static Gender getGender(int i) {
        if (i == 1) {
            return Male;
        }
        if (i != 2) {
            return Unknown;
        }
        return Female;
    }

    public static com.umeng.commonsdk.statistics.proto.Gender transGender(Gender gender) {
        int i = C34054.f8363a[gender.ordinal()];
        if (i == 1) {
            return com.umeng.commonsdk.statistics.proto.Gender.MALE;
        }
        if (i != 2) {
            return com.umeng.commonsdk.statistics.proto.Gender.UNKNOWN;
        }
        return com.umeng.commonsdk.statistics.proto.Gender.FEMALE;
    }

    public int value() {
        return this.value;
    }

    /* access modifiers changed from: public */
    Gender(int i) {
        this.value = i;
    }
}
