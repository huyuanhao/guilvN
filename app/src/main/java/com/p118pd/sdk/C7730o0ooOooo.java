package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.umeng.message.proguard.C3848l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@RequiresApi(19)
/* renamed from: com.pd.sdk.o0ooOooo  reason: case insensitive filesystem */
public class C7730o0ooOooo implements AbstractC7721o0ooOO0o {
    public static final int OooO00o = 8;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Bitmap.Config[] f20723OooO00o;
    public static final Bitmap.Config[] OooO0O0;
    public static final Bitmap.Config[] OooO0OO = {Bitmap.Config.RGB_565};
    public static final Bitmap.Config[] OooO0Oo = {Bitmap.Config.ARGB_4444};
    public static final Bitmap.Config[] OooO0o0 = {Bitmap.Config.ALPHA_8};

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7713o0ooO0o<OooO0O0, Bitmap> f20724OooO00o = new C7713o0ooO0o<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO f20725OooO00o = new OooO0OO();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f20726OooO00o = new HashMap();

    /* renamed from: com.pd.sdk.o0ooOooo$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.C7730o0ooOooo.OooO00o.OooO00o = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.C7730o0ooOooo.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.p118pd.sdk.C7730o0ooOooo.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.p118pd.sdk.C7730o0ooOooo.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7730o0ooOooo.OooO00o.<clinit>():void");
        }
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.o0ooOooo$OooO0OO */
    public static class OooO0OO extends AbstractC7709o0ooO0O<OooO0O0> {
        public OooO0O0 OooO00o(int i, Bitmap.Config config) {
            OooO0O0 oooO0O0 = (OooO0O0) OooO0O0();
            oooO0O0.OooO00o(i, config);
            return oooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC7709o0ooO0O
        public OooO0O0 OooO00o() {
            return new OooO0O0(this);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f20723OooO00o = configArr;
        OooO0O0 = configArr;
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19383OooO00o(Bitmap bitmap) {
        OooO0O0 OooO00o2 = this.f20725OooO00o.OooO00o(oO0O0O00.OooO00o(bitmap), bitmap.getConfig());
        this.f20724OooO00o.OooO00o(OooO00o2, bitmap);
        NavigableMap<Integer, Integer> OooO00o3 = OooO00o(bitmap.getConfig());
        Integer num = (Integer) OooO00o3.get(Integer.valueOf(OooO00o2.OooO00o));
        Integer valueOf = Integer.valueOf(OooO00o2.OooO00o);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        OooO00o3.put(valueOf, Integer.valueOf(i));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f20724OooO00o);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f20726OooO00o.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f20726OooO00o.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.o0ooOooo$OooO0O0 */
    public static final class OooO0O0 implements AbstractC7729o0ooOoo {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap.Config f20727OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0OO f20728OooO00o;

        public OooO0O0(OooO0OO oooO0OO) {
            this.f20728OooO00o = oooO0OO;
        }

        public void OooO00o(int i, Bitmap.Config config) {
            this.OooO00o = i;
            this.f20727OooO00o = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (this.OooO00o != oooO0O0.OooO00o || !oO0O0O00.OooO0O0(this.f20727OooO00o, oooO0O0.f20727OooO00o)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.OooO00o * 31;
            Bitmap.Config config = this.f20727OooO00o;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C7730o0ooOooo.m19379OooO00o(this.OooO00o, this.f20727OooO00o);
        }

        @VisibleForTesting
        public OooO0O0(OooO0OO oooO0OO, int i, Bitmap.Config config) {
            this(oooO0OO);
            OooO00o(i, config);
        }

        @Override // com.p118pd.sdk.AbstractC7729o0ooOoo
        public void OooO00o() {
            this.f20728OooO00o.OooO00o(this);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    @Nullable
    public Bitmap OooO00o(int i, int i2, Bitmap.Config config) {
        OooO0O0 OooO00o2 = OooO00o(oO0O0O00.OooO00o(i, i2, config), config);
        Bitmap OooO00o3 = this.f20724OooO00o.OooO00o(OooO00o2);
        if (OooO00o3 != null) {
            OooO00o(Integer.valueOf(OooO00o2.OooO00o), OooO00o3);
            OooO00o3.reconfigure(i, i2, OooO00o3.getConfig() != null ? OooO00o3.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return OooO00o3;
    }

    private OooO0O0 OooO00o(int i, Bitmap.Config config) {
        OooO0O0 OooO00o2 = this.f20725OooO00o.OooO00o(i, config);
        Bitmap.Config[] OooO00o3 = m19380OooO00o(config);
        for (Bitmap.Config config2 : OooO00o3) {
            Integer ceilingKey = OooO00o(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return OooO00o2;
                        }
                    } else if (config2.equals(config)) {
                        return OooO00o2;
                    }
                }
                this.f20725OooO00o.OooO00o(OooO00o2);
                return this.f20725OooO00o.OooO00o(ceilingKey.intValue(), config2);
            }
        }
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o
    @Nullable
    public Bitmap OooO00o() {
        Bitmap OooO00o2 = this.f20724OooO00o.OooO00o();
        if (OooO00o2 != null) {
            OooO00o(Integer.valueOf(oO0O0O00.OooO00o(OooO00o2)), OooO00o2);
        }
        return OooO00o2;
    }

    private void OooO00o(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> OooO00o2 = OooO00o(bitmap.getConfig());
        Integer num2 = (Integer) OooO00o2.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m19382OooO00o(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            OooO00o2.remove(num);
        } else {
            OooO00o2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> OooO00o(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f20726OooO00o.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f20726OooO00o.put(config, treeMap);
        return treeMap;
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19382OooO00o(Bitmap bitmap) {
        return m19379OooO00o(oO0O0O00.OooO00o(bitmap), bitmap.getConfig());
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19381OooO00o(int i, int i2, Bitmap.Config config) {
        return m19379OooO00o(oO0O0O00.OooO00o(i, i2, config), config);
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    public int OooO00o(Bitmap bitmap) {
        return oO0O0O00.OooO00o(bitmap);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m19379OooO00o(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + C3848l.f10402t;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Bitmap.Config[] m19380OooO00o(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return OooO0O0;
        }
        int i = OooO00o.OooO00o[config.ordinal()];
        if (i == 1) {
            return f20723OooO00o;
        }
        if (i == 2) {
            return OooO0OO;
        }
        if (i == 3) {
            return OooO0Oo;
        }
        if (i == 4) {
            return OooO0o0;
        }
        return new Bitmap.Config[]{config};
    }
}
