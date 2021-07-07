package com.p118pd.sdk;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OooOoO  reason: case insensitive filesystem */
public class C5954OooOoO {
    public long OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Interpolator f17132OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7104o00Oo f17133OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7617o0oOO f17134OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ArrayList<C7115o00Oo0oo> f17135OooO00o = new ArrayList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17136OooO00o;

    public C5954OooOoO OooO00o(C7115o00Oo0oo o00oo0oo) {
        if (!this.f17136OooO00o) {
            this.f17135OooO00o.add(o00oo0oo);
        }
        return this;
    }

    public void OooO0O0() {
        this.f17136OooO00o = false;
    }

    public void OooO0OO() {
        if (!this.f17136OooO00o) {
            Iterator<C7115o00Oo0oo> it = this.f17135OooO00o.iterator();
            while (it.hasNext()) {
                C7115o00Oo0oo next = it.next();
                long j = this.OooO00o;
                if (j >= 0) {
                    next.OooO00o(j);
                }
                Interpolator interpolator = this.f17132OooO00o;
                if (interpolator != null) {
                    next.OooO00o(interpolator);
                }
                if (this.f17134OooO00o != null) {
                    next.OooO00o(this.f17133OooO00o);
                }
                next.m18389OooO0O0();
            }
            this.f17136OooO00o = true;
        }
    }

    public C5954OooOoO OooO00o(C7115o00Oo0oo o00oo0oo, C7115o00Oo0oo o00oo0oo2) {
        this.f17135OooO00o.add(o00oo0oo);
        o00oo0oo2.OooO0O0(o00oo0oo.OooO00o());
        this.f17135OooO00o.add(o00oo0oo2);
        return this;
    }

    /* renamed from: com.pd.sdk.OooOoO$OooO00o */
    public class OooO00o extends C7104o00Oo {
        public int OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f17138OooO00o = false;

        public OooO00o() {
        }

        @Override // com.p118pd.sdk.C7104o00Oo, com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO00o(View view) {
            if (!this.f17138OooO00o) {
                this.f17138OooO00o = true;
                AbstractC7617o0oOO o0ooo = C5954OooOoO.this.f17134OooO00o;
                if (o0ooo != null) {
                    o0ooo.OooO00o(null);
                }
            }
        }

        @Override // com.p118pd.sdk.C7104o00Oo, com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO0OO(View view) {
            int i = this.OooO00o + 1;
            this.OooO00o = i;
            if (i == C5954OooOoO.this.f17135OooO00o.size()) {
                AbstractC7617o0oOO o0ooo = C5954OooOoO.this.f17134OooO00o;
                if (o0ooo != null) {
                    o0ooo.OooO0OO(null);
                }
                OooO00o();
            }
        }

        public void OooO00o() {
            this.OooO00o = 0;
            this.f17138OooO00o = false;
            C5954OooOoO.this.OooO0O0();
        }
    }

    public void OooO00o() {
        if (this.f17136OooO00o) {
            Iterator<C7115o00Oo0oo> it = this.f17135OooO00o.iterator();
            while (it.hasNext()) {
                it.next().m18388OooO00o();
            }
            this.f17136OooO00o = false;
        }
    }

    public C5954OooOoO OooO00o(long j) {
        if (!this.f17136OooO00o) {
            this.OooO00o = j;
        }
        return this;
    }

    public C5954OooOoO OooO00o(Interpolator interpolator) {
        if (!this.f17136OooO00o) {
            this.f17132OooO00o = interpolator;
        }
        return this;
    }

    public C5954OooOoO OooO00o(AbstractC7617o0oOO o0ooo) {
        if (!this.f17136OooO00o) {
            this.f17134OooO00o = o0ooo;
        }
        return this;
    }
}
