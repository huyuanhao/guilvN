package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.facebook.react.views.text.FontMetricsUtil;

/* renamed from: com.pd.sdk.o0ooO00o  reason: case insensitive filesystem */
public class C7708o0ooO00o implements AbstractC7721o0ooOO0o {
    public final OooO0O0 OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7713o0ooO0o<OooO00o, Bitmap> f20671OooO00o = new C7713o0ooO0o<>();

    @VisibleForTesting
    /* renamed from: com.pd.sdk.o0ooO00o$OooO0O0 */
    public static class OooO0O0 extends AbstractC7709o0ooO0O<OooO00o> {
        public OooO00o OooO00o(int i, int i2, Bitmap.Config config) {
            OooO00o oooO00o = (OooO00o) OooO0O0();
            oooO00o.OooO00o(i, i2, config);
            return oooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC7709o0ooO0O
        public OooO00o OooO00o() {
            return new OooO00o(this);
        }
    }

    public static String OooO0O0(Bitmap bitmap) {
        return OooO0O0(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19348OooO00o(Bitmap bitmap) {
        this.f20671OooO00o.OooO00o(this.OooO00o.OooO00o(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f20671OooO00o;
    }

    public static String OooO0O0(int i, int i2, Bitmap.Config config) {
        return "[" + i + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i2 + "], " + config;
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.o0ooO00o$OooO00o */
    public static class OooO00o implements AbstractC7729o0ooOoo {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap.Config f20672OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0O0 f20673OooO00o;
        public int OooO0O0;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f20673OooO00o = oooO0O0;
        }

        public void OooO00o(int i, int i2, Bitmap.Config config) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.f20672OooO00o = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            if (this.OooO00o == oooO00o.OooO00o && this.OooO0O0 == oooO00o.OooO0O0 && this.f20672OooO00o == oooO00o.f20672OooO00o) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.OooO00o * 31) + this.OooO0O0) * 31;
            Bitmap.Config config = this.f20672OooO00o;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C7708o0ooO00o.OooO0O0(this.OooO00o, this.OooO0O0, this.f20672OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC7729o0ooOoo
        public void OooO00o() {
            this.f20673OooO00o.OooO00o(this);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    public Bitmap OooO00o(int i, int i2, Bitmap.Config config) {
        return this.f20671OooO00o.OooO00o(this.OooO00o.OooO00o(i, i2, config));
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o
    public Bitmap OooO00o() {
        return this.f20671OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19347OooO00o(Bitmap bitmap) {
        return OooO0O0(bitmap);
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19346OooO00o(int i, int i2, Bitmap.Config config) {
        return OooO0O0(i, i2, config);
    }

    @Override // com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o, com.p118pd.sdk.AbstractC7721o0ooOO0o
    public int OooO00o(Bitmap bitmap) {
        return oO0O0O00.OooO00o(bitmap);
    }
}
