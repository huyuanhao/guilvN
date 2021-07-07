package androidx.recyclerview.widget;

import android.view.View;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ViewBoundsCheck {
    public static final int OooO = 16;
    public static final int OooO00o = 1;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 4;
    public static final int OooO0Oo = 0;
    public static final int OooO0o = 2;
    public static final int OooO0o0 = 1;
    public static final int OooO0oO = 4;
    public static final int OooO0oo = 4;
    public static final int OooOO0 = 32;
    public static final int OooOO0O = 64;
    public static final int OooOO0o = 8;
    public static final int OooOOO = 512;
    public static final int OooOOO0 = 256;
    public static final int OooOOOO = 1024;
    public static final int OooOOOo = 12;
    public static final int OooOOo = 8192;
    public static final int OooOOo0 = 4096;
    public static final int OooOOoo = 16384;
    public static final int OooOo00 = 7;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f14665OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f14666OooO00o;

    public interface OooO0O0 {
        int OooO00o();

        int OooO00o(View view);

        /* renamed from: OooO00o  reason: collision with other method in class */
        View m14889OooO00o();

        View OooO00o(int i);

        int OooO0O0();

        int OooO0O0(View view);

        int getChildCount();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    public ViewBoundsCheck(OooO0O0 oooO0O0) {
        this.f14666OooO00o = oooO0O0;
    }

    public View OooO00o(int i, int i2, int i3, int i4) {
        int OooO00o2 = this.f14666OooO00o.OooO00o();
        int OooO0O02 = this.f14666OooO00o.OooO0O0();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View OooO00o3 = this.f14666OooO00o.OooO00o(i);
            this.f14665OooO00o.OooO00o(OooO00o2, OooO0O02, this.f14666OooO00o.OooO0O0(OooO00o3), this.f14666OooO00o.OooO00o(OooO00o3));
            if (i3 != 0) {
                this.f14665OooO00o.OooO00o();
                this.f14665OooO00o.OooO00o(i3);
                if (this.f14665OooO00o.m14888OooO00o()) {
                    return OooO00o3;
                }
            }
            if (i4 != 0) {
                this.f14665OooO00o.OooO00o();
                this.f14665OooO00o.OooO00o(i4);
                if (this.f14665OooO00o.m14888OooO00o()) {
                    view = OooO00o3;
                }
            }
            i += i5;
        }
        return view;
    }

    public static class OooO00o {
        public int OooO00o = 0;
        public int OooO0O0;
        public int OooO0OO;
        public int OooO0Oo;
        public int OooO0o0;

        public int OooO00o(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        public void OooO00o(int i, int i2, int i3, int i4) {
            this.OooO0O0 = i;
            this.OooO0OO = i2;
            this.OooO0Oo = i3;
            this.OooO0o0 = i4;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14887OooO00o(int i, int i2) {
            this.OooO00o = (i & i2) | (this.OooO00o & (i2 ^ -1));
        }

        public void OooO00o(int i) {
            this.OooO00o = i | this.OooO00o;
        }

        public void OooO00o() {
            this.OooO00o = 0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14888OooO00o() {
            int i = this.OooO00o;
            if ((i & 7) != 0 && (i & (OooO00o(this.OooO0Oo, this.OooO0O0) << 0)) == 0) {
                return false;
            }
            int i2 = this.OooO00o;
            if ((i2 & 112) != 0 && (i2 & (OooO00o(this.OooO0Oo, this.OooO0OO) << 4)) == 0) {
                return false;
            }
            int i3 = this.OooO00o;
            if ((i3 & 1792) != 0 && (i3 & (OooO00o(this.OooO0o0, this.OooO0O0) << 8)) == 0) {
                return false;
            }
            int i4 = this.OooO00o;
            if ((i4 & UMModuleRegister.SHARE_EVENT_VALUE_HIGH) == 0 || (i4 & (OooO00o(this.OooO0o0, this.OooO0OO) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean OooO00o(View view, int i) {
        this.f14665OooO00o.OooO00o(this.f14666OooO00o.OooO00o(), this.f14666OooO00o.OooO0O0(), this.f14666OooO00o.OooO0O0(view), this.f14666OooO00o.OooO00o(view));
        if (i == 0) {
            return false;
        }
        this.f14665OooO00o.OooO00o();
        this.f14665OooO00o.OooO00o(i);
        return this.f14665OooO00o.m14888OooO00o();
    }
}
