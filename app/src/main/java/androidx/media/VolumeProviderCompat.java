package androidx.media;

import android.os.Build;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.C7241o00ooo0o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class VolumeProviderCompat {
    public static final int OooO0Oo = 0;
    public static final int OooO0o = 2;
    public static final int OooO0o0 = 1;
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f14477OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f14478OooO00o;
    public final int OooO0O0;
    public int OooO0OO;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ControlType {
    }

    public class OooO00o implements C7241o00ooo0o.OooO0O0 {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.C7241o00ooo0o.OooO0O0
        public void OooO00o(int i) {
            VolumeProviderCompat.this.OooO0O0(i);
        }

        @Override // com.p118pd.sdk.C7241o00ooo0o.OooO0O0
        public void OooO0O0(int i) {
            VolumeProviderCompat.this.OooO00o(i);
        }
    }

    public static abstract class OooO0O0 {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    public VolumeProviderCompat(int i, int i2, int i3) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = i3;
    }

    public final int OooO00o() {
        return this.OooO0OO;
    }

    public void OooO00o(int i) {
    }

    public final int OooO0O0() {
        return this.OooO0O0;
    }

    public void OooO0O0(int i) {
    }

    public final int OooO0OO() {
        return this.OooO00o;
    }

    public void OooO00o(OooO0O0 oooO0O0) {
        this.f14477OooO00o = oooO0O0;
    }

    public final void OooO0OO(int i) {
        this.OooO0OO = i;
        Object OooO00o2 = m14692OooO00o();
        if (OooO00o2 != null && Build.VERSION.SDK_INT >= 21) {
            C7241o00ooo0o.OooO00o(OooO00o2, i);
        }
        OooO0O0 oooO0O0 = this.f14477OooO00o;
        if (oooO0O0 != null) {
            oooO0O0.onVolumeChanged(this);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m14692OooO00o() {
        if (this.f14478OooO00o == null && Build.VERSION.SDK_INT >= 21) {
            this.f14478OooO00o = C7241o00ooo0o.OooO00o(this.OooO00o, this.OooO0O0, this.OooO0OO, new OooO00o());
        }
        return this.f14478OooO00o;
    }
}
