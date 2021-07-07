package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class YogaValue {
    public static final YogaValue AUTO = new YogaValue(Float.NaN, YogaUnit.AUTO);
    public static final YogaValue UNDEFINED = new YogaValue(Float.NaN, YogaUnit.UNDEFINED);
    public static final YogaValue ZERO = new YogaValue(0.0f, YogaUnit.POINT);
    public final YogaUnit unit;
    public final float value;

    /* renamed from: com.facebook.yoga.YogaValue$1 */
    public static /* synthetic */ class C09051 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaUnit;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.yoga.YogaUnit[] r0 = com.facebook.yoga.YogaUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.yoga.YogaValue.C09051.$SwitchMap$com$facebook$yoga$YogaUnit = r0
                com.facebook.yoga.YogaUnit r1 = com.facebook.yoga.YogaUnit.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.yoga.YogaValue.C09051.$SwitchMap$com$facebook$yoga$YogaUnit     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.YogaUnit r1 = com.facebook.yoga.YogaUnit.POINT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.yoga.YogaValue.C09051.$SwitchMap$com$facebook$yoga$YogaUnit     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.yoga.YogaUnit r1 = com.facebook.yoga.YogaUnit.PERCENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.facebook.yoga.YogaValue.C09051.$SwitchMap$com$facebook$yoga$YogaUnit     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.yoga.YogaUnit r1 = com.facebook.yoga.YogaUnit.AUTO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaValue.C09051.<clinit>():void");
        }
    }

    public YogaValue(float f, YogaUnit yogaUnit) {
        this.value = f;
        this.unit = yogaUnit;
    }

    public static YogaValue parse(String str) {
        if (str == null) {
            return null;
        }
        if ("undefined".equals(str)) {
            return UNDEFINED;
        }
        if ("auto".equals(str)) {
            return AUTO;
        }
        if (str.endsWith("%")) {
            return new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), YogaUnit.PERCENT);
        }
        return new YogaValue(Float.parseFloat(str), YogaUnit.POINT);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        YogaUnit yogaUnit = this.unit;
        if (yogaUnit != yogaValue.unit) {
            return false;
        }
        if (yogaUnit == YogaUnit.UNDEFINED || yogaUnit == YogaUnit.AUTO || Float.compare(this.value, yogaValue.value) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value) + this.unit.intValue();
    }

    public String toString() {
        int i = C09051.$SwitchMap$com$facebook$yoga$YogaUnit[this.unit.ordinal()];
        if (i == 1) {
            return "undefined";
        }
        if (i == 2) {
            return Float.toString(this.value);
        }
        if (i == 3) {
            return this.value + "%";
        } else if (i == 4) {
            return "auto";
        } else {
            throw new IllegalStateException();
        }
    }

    @DoNotStrip
    public YogaValue(float f, int i) {
        this(f, YogaUnit.fromInt(i));
    }
}
