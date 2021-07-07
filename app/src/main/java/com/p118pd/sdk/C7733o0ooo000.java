package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.bitmap_recycle.PrettyPrintTreeMap;
import java.util.NavigableMap;

@RequiresApi(19)
/* renamed from: com.pd.sdk.o0ooo000  reason: case insensitive filesystem */
public final class C7733o0ooo000 implements AbstractC7721o0ooOO0o {
    public static final int OooO00o = 8;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7713o0ooO0o<OooO00o, Bitmap> f20732OooO00o = new C7713o0ooO0o<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f20733OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final NavigableMap<Integer, Integer> f20734OooO00o = new PrettyPrintTreeMap();

    @VisibleForTesting
    /* renamed from: com.pd.sdk.o0ooo000$OooO00o */
    public static final class OooO00o implements AbstractC7729o0ooOoo {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0O0 f20735OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f20735OooO00o = oooO0O0;
        }

        public void OooO00o(int i) {
            this.OooO00o = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OooO00o) || this.OooO00o != ((OooO00o) obj).OooO00o) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.OooO00o;
        }

        public String toString() {
            return C7733o0ooo000.OooO00o(this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC7729o0ooOoo
        public void OooO00o() {
            this.f20735OooO00o.OooO00o(this);
        }
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.o0ooo000$OooO0O0 */
    public static class OooO0O0 extends AbstractC7709o0ooO0O<OooO00o> {
        public OooO00o OooO00o(int i) {
            OooO00o oooO00o = (OooO00o) super.OooO0O0();
            oooO00o.OooO00o(i);
            return oooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC7709o0ooO0O
        public OooO00o OooO00o() {
            return new OooO00o(this);
        }
    }

    public static String OooO0O0(Bitmap bitmap) {
        return OooO00o(oO0O0O00.OooO00o(bitmap));
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19386OooO00o(Bitmap bitmap) {
        OooO00o OooO00o2 = this.f20733OooO00o.OooO00o(oO0O0O00.OooO00o(bitmap));
        this.f20732OooO00o.OooO00o(OooO00o2, bitmap);
        Integer num = (Integer) this.f20734OooO00o.get(Integer.valueOf(OooO00o2.OooO00o));
        NavigableMap<Integer, Integer> navigableMap = this.f20734OooO00o;
        Integer valueOf = Integer.valueOf(OooO00o2.OooO00o);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        navigableMap.put(valueOf, Integer.valueOf(i));
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f20732OooO00o + "\n  SortedSizes" + this.f20734OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    @Nullable
    public Bitmap OooO00o(int i, int i2, Bitmap.Config config) {
        int OooO00o2 = oO0O0O00.OooO00o(i, i2, config);
        OooO00o OooO00o3 = this.f20733OooO00o.OooO00o(OooO00o2);
        Integer ceilingKey = this.f20734OooO00o.ceilingKey(Integer.valueOf(OooO00o2));
        if (!(ceilingKey == null || ceilingKey.intValue() == OooO00o2 || ceilingKey.intValue() > OooO00o2 * 8)) {
            this.f20733OooO00o.OooO00o(OooO00o3);
            OooO00o3 = this.f20733OooO00o.OooO00o(ceilingKey.intValue());
        }
        Bitmap OooO00o4 = this.f20732OooO00o.OooO00o(OooO00o3);
        if (OooO00o4 != null) {
            OooO00o4.reconfigure(i, i2, config);
            OooO00o(ceilingKey);
        }
        return OooO00o4;
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o
    @Nullable
    public Bitmap OooO00o() {
        Bitmap OooO00o2 = this.f20732OooO00o.OooO00o();
        if (OooO00o2 != null) {
            OooO00o(Integer.valueOf(oO0O0O00.OooO00o(OooO00o2)));
        }
        return OooO00o2;
    }

    private void OooO00o(Integer num) {
        Integer num2 = (Integer) this.f20734OooO00o.get(num);
        if (num2.intValue() == 1) {
            this.f20734OooO00o.remove(num);
        } else {
            this.f20734OooO00o.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19385OooO00o(Bitmap bitmap) {
        return OooO0O0(bitmap);
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19384OooO00o(int i, int i2, Bitmap.Config config) {
        return OooO00o(oO0O0O00.OooO00o(i, i2, config));
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    public int OooO00o(Bitmap bitmap) {
        return oO0O0O00.OooO00o(bitmap);
    }

    public static String OooO00o(int i) {
        return "[" + i + "]";
    }
}
