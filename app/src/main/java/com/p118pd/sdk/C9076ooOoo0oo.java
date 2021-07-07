package com.p118pd.sdk;

import android.view.MotionEvent;
import com.p118pd.sdk.C9073ooOoo0o;

/* renamed from: com.pd.sdk.ooOoo0oo  reason: case insensitive filesystem */
public class C9076ooOoo0oo extends C9063ooOoOooo<C9076ooOoo0oo> {
    public static final double OooO0OO = 0.08726646259971647d;
    public double OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9073ooOoo0o.OooO00o f22426OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9073ooOoo0o f22427OooO00o;
    public double OooO0O0;

    public C9076ooOoo0oo() {
        OooO0O0(false);
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public void OooO0OO(MotionEvent motionEvent) {
        int OooO0O02 = m20737OooO0O0();
        if (OooO0O02 == 0) {
            this.OooO0O0 = AbstractC8352oOoOOoO0.OooO0O0;
            this.OooO00o = AbstractC8352oOoOOoO0.OooO0O0;
            this.f22427OooO00o = new C9073ooOoo0o(this.f22426OooO00o);
            m20738OooO0O0();
        }
        C9073ooOoo0o ooooo0o = this.f22427OooO00o;
        if (ooooo0o != null) {
            ooooo0o.m20753OooO00o(motionEvent);
        }
        if (motionEvent.getActionMasked() != 1) {
            return;
        }
        if (OooO0O02 == 4) {
            m20744OooO0Oo();
        } else {
            m20746OooO0o0();
        }
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public void m20756OooO0oO() {
        this.f22427OooO00o = null;
        this.OooO0O0 = AbstractC8352oOoOOoO0.OooO0O0;
        this.OooO00o = AbstractC8352oOoOOoO0.OooO0O0;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public float OooO0oo() {
        C9073ooOoo0o ooooo0o = this.f22427OooO00o;
        if (ooooo0o == null) {
            return Float.NaN;
        }
        return ooooo0o.OooO0O0();
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo
    public double OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo
    public double OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public float OooO0oO() {
        C9073ooOoo0o ooooo0o = this.f22427OooO00o;
        if (ooooo0o == null) {
            return Float.NaN;
        }
        return ooooo0o.m20751OooO00o();
    }

    /* renamed from: com.pd.sdk.ooOoo0oo$OooO00o */
    public class OooO00o implements C9073ooOoo0o.OooO00o {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.C9073ooOoo0o.OooO00o, com.p118pd.sdk.C9073ooOoo0o.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m20757OooO00o(C9073ooOoo0o ooooo0o) {
            double d = C9076ooOoo0oo.this.OooO00o;
            C9076ooOoo0oo.this.OooO00o += ooooo0o.m20750OooO00o();
            long OooO00o2 = ooooo0o.m20752OooO00o();
            if (OooO00o2 > 0) {
                C9076ooOoo0oo ooooo0oo = C9076ooOoo0oo.this;
                double d2 = ooooo0oo.OooO00o - d;
                double d3 = (double) OooO00o2;
                Double.isNaN(d3);
                ooooo0oo.OooO0O0 = d2 / d3;
            }
            if (Math.abs(C9076ooOoo0oo.this.OooO00o) < 0.08726646259971647d || C9076ooOoo0oo.this.m20737OooO0O0() != 2) {
                return true;
            }
            C9076ooOoo0oo.this.m20733OooO00o();
            return true;
        }

        @Override // com.p118pd.sdk.C9073ooOoo0o.OooO00o
        public boolean OooO0O0(C9073ooOoo0o ooooo0o) {
            return true;
        }

        @Override // com.p118pd.sdk.C9073ooOoo0o.OooO00o, com.p118pd.sdk.C9073ooOoo0o.OooO00o
        public void OooO00o(C9073ooOoo0o ooooo0o) {
            C9076ooOoo0oo.this.m20744OooO0Oo();
        }
    }
}
