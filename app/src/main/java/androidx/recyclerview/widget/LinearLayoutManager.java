package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.p118pd.sdk.AbstractC7278o0O00OoO;
import com.p118pd.sdk.C7265o0O000oo;
import com.p118pd.sdk.C7273o0O00O0o;
import com.p118pd.sdk.C7283o0O00o0O;
import com.umeng.socialize.common.SocializeConstants;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.OooOOO0 implements C7265o0O000oo.OooOO0, RecyclerView.OooOo.OooO0O0 {
    public static final float OooO00o = 0.33333334f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f14494OooO00o = "LinearLayoutManager";
    public static final int OooOO0 = 0;
    public static final int OooOO0O = 1;
    public static final int OooOO0o = Integer.MIN_VALUE;
    public static final boolean OooOOO0 = false;
    public int OooO;

    /* renamed from: OooO  reason: collision with other field name */
    public boolean f14495OooO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f14496OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f14497OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0OO f14498OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SavedState f14499OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7278o0O00OoO f14500OooO00o;
    public int OooO0o;
    public int OooO0oO;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public boolean f14501OooO0oO;
    public int OooO0oo;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public boolean f14502OooO0oo;

    /* renamed from: OooOO0  reason: collision with other field name */
    public boolean f14503OooOO0;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public boolean f14504OooOO0O;

    /* renamed from: OooOO0o  reason: collision with other field name */
    public boolean f14505OooOO0o;

    public static class OooO0O0 {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14509OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;

        public void OooO00o() {
            this.OooO00o = 0;
            this.f14509OooO00o = false;
            this.OooO0O0 = false;
            this.OooO0OO = false;
        }
    }

    public static class OooO0OO {
        public static final int OooO = -1;
        public static final String OooO00o = "LLM#LayoutState";
        public static final int OooOO0 = 1;
        public static final int OooOO0O = Integer.MIN_VALUE;
        public static final int OooOO0o = -1;
        public static final int OooOOO = Integer.MIN_VALUE;
        public static final int OooOOO0 = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f14510OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<RecyclerView.AbstractC5079OooOoo0> f14511OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14512OooO00o = true;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f14513OooO0O0 = false;
        public int OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f14514OooO0OO;
        public int OooO0Oo;
        public int OooO0o;
        public int OooO0o0;
        public int OooO0oO = 0;
        public int OooO0oo;

        public boolean OooO00o(RecyclerView.C5077OooOoO0 oooOoO0) {
            int i = this.OooO0OO;
            return i >= 0 && i < oooOoO0.OooO00o();
        }

        public void OooO0O0() {
            String str = "avail:" + this.OooO0O0 + ", ind:" + this.OooO0OO + ", dir:" + this.OooO0Oo + ", offset:" + this.f14510OooO00o + ", layoutDir:" + this.OooO0o0;
        }

        public View OooO00o(RecyclerView.OooOo00 oooOo00) {
            if (this.f14511OooO00o != null) {
                return OooO00o();
            }
            View OooO0O02 = oooOo00.OooO0O0(this.OooO0OO);
            this.OooO0OO += this.OooO0Oo;
            return OooO0O02;
        }

        private View OooO00o() {
            int size = this.f14511OooO00o.size();
            for (int i = 0; i < size; i++) {
                View view = this.f14511OooO00o.get(i).f14626OooO00o;
                RecyclerView.OooOOO oooOOO = (RecyclerView.OooOOO) view.getLayoutParams();
                if (!oooOOO.m14764OooO0O0() && this.OooO0OO == oooOOO.OooO0O0()) {
                    m14711OooO00o(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14710OooO00o() {
            m14711OooO00o((View) null);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14711OooO00o(View view) {
            View OooO00o2 = OooO00o(view);
            if (OooO00o2 == null) {
                this.OooO0OO = -1;
            } else {
                this.OooO0OO = ((RecyclerView.OooOOO) OooO00o2.getLayoutParams()).OooO0O0();
            }
        }

        public View OooO00o(View view) {
            int OooO0O02;
            int size = this.f14511OooO00o.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f14511OooO00o.get(i2).f14626OooO00o;
                RecyclerView.OooOOO oooOOO = (RecyclerView.OooOOO) view3.getLayoutParams();
                if (view3 != view && !oooOOO.m14764OooO0O0() && (OooO0O02 = (oooOOO.OooO0O0() - this.OooO0OO) * this.OooO0Oo) >= 0 && OooO0O02 < i) {
                    view2 = view3;
                    if (OooO0O02 == 0) {
                        break;
                    }
                    i = OooO0O02;
                }
            }
            return view2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public boolean OooO0O0;
        public int o00oO0O;
        public int o0ooOO0;

        public static class OooO00o implements Parcelable.Creator<SavedState> {
            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: OooO00o */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14712OooO00o() {
            return this.o00oO0O >= 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.o00oO0O);
            parcel.writeInt(this.o0ooOO0);
            parcel.writeInt(this.OooO0O0 ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.o00oO0O = parcel.readInt();
            this.o0ooOO0 = parcel.readInt();
            this.OooO0O0 = parcel.readInt() != 1 ? false : true;
        }

        public void OooO00o() {
            this.o00oO0O = -1;
        }

        public SavedState(SavedState savedState) {
            this.o00oO0O = savedState.o00oO0O;
            this.o0ooOO0 = savedState.o0ooOO0;
            this.OooO0O0 = savedState.OooO0O0;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int OooO(RecyclerView.C5077OooOoO0 oooOoO0) {
        if (OooO0O0() == 0) {
            return 0;
        }
        OooO0o0();
        return C7283o0O00o0O.OooO00o(oooOoO0, this.f14500OooO00o, OooO0O0(!this.f14504OooOO0O, true), OooO00o(!this.f14504OooOO0O, true), this, this.f14504OooOO0O, this.f14495OooO);
    }

    private void OooO0o(int i, int i2) {
        this.f14498OooO00o.OooO0O0 = this.f14500OooO00o.OooO0O0() - i2;
        this.f14498OooO00o.OooO0Oo = this.f14495OooO ? -1 : 1;
        OooO0OO oooO0OO = this.f14498OooO00o;
        oooO0OO.OooO0OO = i;
        oooO0OO.OooO0o0 = 1;
        oooO0OO.f14510OooO00o = i2;
        oooO0OO.OooO0o = Integer.MIN_VALUE;
    }

    private int OooOO0(RecyclerView.C5077OooOoO0 oooOoO0) {
        if (OooO0O0() == 0) {
            return 0;
        }
        OooO0o0();
        return C7283o0O00o0O.OooO0O0(oooOoO0, this.f14500OooO00o, OooO0O0(!this.f14504OooOO0O, true), OooO00o(!this.f14504OooOO0O, true), this, this.f14504OooOO0O);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public RecyclerView.OooOOO m14701OooO00o() {
        return new RecyclerView.OooOOO(-2, -2);
    }

    public void OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, OooO00o oooO00o, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO0O0(RecyclerView recyclerView, RecyclerView.OooOo00 oooOo00) {
        super.OooO0O0(recyclerView, oooOo00);
        if (this.f14505OooOO0o) {
            OooO0O0(oooOo00);
            oooOo00.m14828OooO00o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0OO(RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooOO0(oooOoO0);
    }

    public void OooO0Oo(boolean z) {
        this.f14505OooOO0o = z;
    }

    public void OooO0o0(boolean z) {
        OooO0O0((String) null);
        if (z != this.f14502OooO0oo) {
            this.f14502OooO0oo = z;
            m14784OooO0O0();
        }
    }

    public void OooO0oO(boolean z) {
        OooO0O0((String) null);
        if (this.f14503OooOO0 != z) {
            this.f14503OooOO0 = z;
            m14784OooO0O0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public boolean m14706OooO0oO() {
        return true;
    }

    public void OooO0oo(int i) {
        if (i == 0 || i == 1) {
            OooO0O0((String) null);
            if (i != this.OooO0o || this.f14500OooO00o == null) {
                AbstractC7278o0O00OoO OooO00o2 = AbstractC7278o0O00OoO.OooO00o(this, i);
                this.f14500OooO00o = OooO00o2;
                this.f14496OooO00o.f14506OooO00o = OooO00o2;
                this.OooO0o = i;
                m14784OooO0O0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    public boolean OooOO0o() {
        return (OooO0Oo() == 1073741824 || OooOOOo() == 1073741824 || !m14793OooO0Oo()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public boolean OooOOO() {
        return this.f14505OooOO0o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    public boolean OooOOO0() {
        return this.f14499OooO00o == null && this.f14501OooO0oO == this.f14503OooOO0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public boolean OooOOOO() {
        return this.f14502OooO0oo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public boolean OooOOOo() {
        return this.f14503OooOO0;
    }

    /* renamed from: OooOOo  reason: collision with other method in class */
    public boolean m14707OooOOo() {
        return this.f14504OooOO0O;
    }

    /* renamed from: OooOOo0  reason: collision with other method in class */
    public boolean m14708OooOOo0() {
        return OooO0o() == 1;
    }

    /* renamed from: OooOOoo  reason: collision with other method in class */
    public boolean m14709OooOOoo() {
        return this.f14500OooO00o.OooO0Oo() == 0 && this.f14500OooO00o.OooO00o() == 0;
    }

    public int OooOo0() {
        return this.OooO;
    }

    public int OooOo00() {
        View OooO00o2 = OooO00o(OooO0O0() - 1, -1, false, true);
        if (OooO00o2 == null) {
            return -1;
        }
        return OooOO0(OooO00o2);
    }

    public int OooOo0O() {
        return this.OooO0o;
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.OooO0o = 1;
        this.f14502OooO0oo = false;
        this.f14495OooO = false;
        this.f14503OooOO0 = false;
        this.f14504OooOO0O = true;
        this.OooO0oO = -1;
        this.OooO0oo = Integer.MIN_VALUE;
        this.f14499OooO00o = null;
        this.f14496OooO00o = new OooO00o();
        this.f14497OooO00o = new OooO0O0();
        this.OooO = 2;
        OooO0oo(i);
        OooO0o0(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(AccessibilityEvent accessibilityEvent) {
        super.OooO00o(accessibilityEvent);
        if (OooO0O0() > 0) {
            accessibilityEvent.setFromIndex(OooOOo());
            accessibilityEvent.setToIndex(OooOo00());
        }
    }

    public int OooO0OO(int i, RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (OooO0O0() == 0 || i == 0) {
            return 0;
        }
        this.f14498OooO00o.f14512OooO00o = true;
        OooO0o0();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        OooO00o(i2, abs, true, oooOoO0);
        OooO0OO oooO0OO = this.f14498OooO00o;
        int OooO00o2 = oooO0OO.OooO0o + OooO00o(oooOo00, oooO0OO, oooOoO0, false);
        if (OooO00o2 < 0) {
            return 0;
        }
        if (abs > OooO00o2) {
            i = i2 * OooO00o2;
        }
        this.f14500OooO00o.OooO00o(-i);
        this.f14498OooO00o.OooO0oo = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0Oo(RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO0oo(oooOoO0);
    }

    public int OooOOo() {
        View OooO00o2 = OooO00o(0, OooO0O0(), false, true);
        if (OooO00o2 == null) {
            return -1;
        }
        return OooOO0(OooO00o2);
    }

    public int OooOOo0() {
        View OooO00o2 = OooO00o(0, OooO0O0(), true, false);
        if (OooO00o2 == null) {
            return -1;
        }
        return OooOO0(OooO00o2);
    }

    public static class OooO00o {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC7278o0O00OoO f14506OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14507OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f14508OooO0O0;

        public OooO00o() {
            OooO0O0();
        }

        public void OooO00o() {
            int i;
            if (this.f14507OooO00o) {
                i = this.f14506OooO00o.OooO0O0();
            } else {
                i = this.f14506OooO00o.OooO0o();
            }
            this.OooO0O0 = i;
        }

        public void OooO0O0() {
            this.OooO00o = -1;
            this.OooO0O0 = Integer.MIN_VALUE;
            this.f14507OooO00o = false;
            this.f14508OooO0O0 = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.OooO00o + ", mCoordinate=" + this.OooO0O0 + ", mLayoutFromEnd=" + this.f14507OooO00o + ", mValid=" + this.f14508OooO0O0 + '}';
        }

        public boolean OooO00o(View view, RecyclerView.C5077OooOoO0 oooOoO0) {
            RecyclerView.OooOOO oooOOO = (RecyclerView.OooOOO) view.getLayoutParams();
            return !oooOOO.m14764OooO0O0() && oooOOO.OooO0O0() >= 0 && oooOOO.OooO0O0() < oooOoO0.OooO00o();
        }

        public void OooO0O0(View view, int i) {
            int OooO0oo = this.f14506OooO00o.OooO0oo();
            if (OooO0oo >= 0) {
                OooO00o(view, i);
                return;
            }
            this.OooO00o = i;
            if (this.f14507OooO00o) {
                int OooO0O02 = (this.f14506OooO00o.OooO0O0() - OooO0oo) - this.f14506OooO00o.OooO00o(view);
                this.OooO0O0 = this.f14506OooO00o.OooO0O0() - OooO0O02;
                if (OooO0O02 > 0) {
                    int OooO0O03 = this.OooO0O0 - this.f14506OooO00o.OooO0O0(view);
                    int OooO0o = this.f14506OooO00o.OooO0o();
                    int min = OooO0O03 - (OooO0o + Math.min(this.f14506OooO00o.OooO0Oo(view) - OooO0o, 0));
                    if (min < 0) {
                        this.OooO0O0 += Math.min(OooO0O02, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int OooO0Oo = this.f14506OooO00o.OooO0Oo(view);
            int OooO0o2 = OooO0Oo - this.f14506OooO00o.OooO0o();
            this.OooO0O0 = OooO0Oo;
            if (OooO0o2 > 0) {
                int OooO0O04 = (this.f14506OooO00o.OooO0O0() - Math.min(0, (this.f14506OooO00o.OooO0O0() - OooO0oo) - this.f14506OooO00o.OooO00o(view))) - (OooO0Oo + this.f14506OooO00o.OooO0O0(view));
                if (OooO0O04 < 0) {
                    this.OooO0O0 -= Math.min(OooO0o2, -OooO0O04);
                }
            }
        }

        public void OooO00o(View view, int i) {
            if (this.f14507OooO00o) {
                this.OooO0O0 = this.f14506OooO00o.OooO00o(view) + this.f14506OooO00o.OooO0oo();
            } else {
                this.OooO0O0 = this.f14506OooO00o.OooO0Oo(view);
            }
            this.OooO00o = i;
        }
    }

    private View OooO0Oo(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO00o(oooOo00, oooOoO0, OooO0O0() - 1, -1, oooOoO0.OooO00o());
    }

    public int OooOOoo() {
        View OooO00o2 = OooO00o(OooO0O0() - 1, -1, true, false);
        if (OooO00o2 == null) {
            return -1;
        }
        return OooOO0(OooO00o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14705OooO0O0() {
        return this.OooO0o == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO0o0() {
        if (this.f14498OooO00o == null) {
            this.f14498OooO00o = m14700OooO00o();
        }
    }

    public int OooO0oO(RecyclerView.C5077OooOoO0 oooOoO0) {
        if (oooOoO0.m14836OooO0O0()) {
            return this.f14500OooO00o.OooO0oO();
        }
        return 0;
    }

    private void OooO0O0(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, int i, int i2) {
        if (oooOoO0.OooO0o0() && OooO0O0() != 0 && !oooOoO0.m14838OooO0Oo() && OooOOO0()) {
            List<RecyclerView.AbstractC5079OooOoo0> OooO00o2 = oooOo00.m14827OooO00o();
            int size = OooO00o2.size();
            int OooOO02 = OooOO0(OooO0O0(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.AbstractC5079OooOoo0 oooOoo0 = OooO00o2.get(i5);
                if (!oooOoo0.m14852OooO0o()) {
                    char c = 1;
                    if ((oooOoo0.OooO0OO() < OooOO02) != this.f14495OooO) {
                        c = 65535;
                    }
                    if (c == 65535) {
                        i3 += this.f14500OooO00o.OooO0O0(oooOoo0.f14626OooO00o);
                    } else {
                        i4 += this.f14500OooO00o.OooO0O0(oooOoo0.f14626OooO00o);
                    }
                }
            }
            this.f14498OooO00o.f14511OooO00o = OooO00o2;
            if (i3 > 0) {
                OooO0oO(OooOO0(OooO0OO()), i);
                OooO0OO oooO0OO = this.f14498OooO00o;
                oooO0OO.OooO0oO = i3;
                oooO0OO.OooO0O0 = 0;
                oooO0OO.m14710OooO00o();
                OooO00o(oooOo00, this.f14498OooO00o, oooOoO0, false);
            }
            if (i4 > 0) {
                OooO0o(OooOO0(OooO0O0()), i2);
                OooO0OO oooO0OO2 = this.f14498OooO00o;
                oooO0OO2.OooO0oO = i4;
                oooO0OO2.OooO0O0 = 0;
                oooO0OO2.m14710OooO00o();
                OooO00o(oooOo00, this.f14498OooO00o, oooOoO0, false);
            }
            this.f14498OooO00o.f14511OooO00o = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    public Parcelable OooO00o() {
        if (this.f14499OooO00o != null) {
            return new SavedState(this.f14499OooO00o);
        }
        SavedState savedState = new SavedState();
        if (OooO0O0() > 0) {
            OooO0o0();
            boolean z = this.f14501OooO0oO ^ this.f14495OooO;
            savedState.OooO0O0 = z;
            if (z) {
                View OooO0O02 = OooO0O0();
                savedState.o0ooOO0 = this.f14500OooO00o.OooO0O0() - this.f14500OooO00o.OooO00o(OooO0O02);
                savedState.o00oO0O = OooOO0(OooO0O02);
            } else {
                View OooO0OO2 = OooO0OO();
                savedState.o00oO0O = OooOO0(OooO0OO2);
                savedState.o0ooOO0 = this.f14500OooO00o.OooO0Oo(OooO0OO2) - this.f14500OooO00o.OooO0o();
            }
        } else {
            savedState.OooO00o();
        }
        return savedState;
    }

    private void OooO0oO(int i, int i2) {
        this.f14498OooO00o.OooO0O0 = i2 - this.f14500OooO00o.OooO0o();
        OooO0OO oooO0OO = this.f14498OooO00o;
        oooO0OO.OooO0OO = i;
        oooO0OO.OooO0Oo = this.f14495OooO ? 1 : -1;
        OooO0OO oooO0OO2 = this.f14498OooO00o;
        oooO0OO2.OooO0o0 = -1;
        oooO0OO2.f14510OooO00o = i2;
        oooO0OO2.OooO0o = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO0o(int i) {
        this.OooO0oO = i;
        this.OooO0oo = Integer.MIN_VALUE;
        SavedState savedState = this.f14499OooO00o;
        if (savedState != null) {
            savedState.OooO00o();
        }
        m14784OooO0O0();
    }

    public void OooO0o0(int i, int i2) {
        this.OooO0oO = i;
        this.OooO0oo = i2;
        SavedState savedState = this.f14499OooO00o;
        if (savedState != null) {
            savedState.OooO00o();
        }
        m14784OooO0O0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    private void OooO0oo() {
        if (this.OooO0o == 1 || !m14708OooOOo0()) {
            this.f14495OooO = this.f14502OooO0oo;
        } else {
            this.f14495OooO = !this.f14502OooO0oo;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    private View OooO0OO() {
        return OooO0O0(this.f14495OooO ? OooO0O0() - 1 : 0);
    }

    private int OooO0oo(RecyclerView.C5077OooOoO0 oooOoO0) {
        if (OooO0O0() == 0) {
            return 0;
        }
        OooO0o0();
        return C7283o0O00o0O.OooO00o(oooOoO0, this.f14500OooO00o, OooO0O0(!this.f14504OooOO0O, true), OooO00o(!this.f14504OooOO0O, true), this, this.f14504OooOO0O);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    private View OooO0OO(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO00o(OooO0O0() - 1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0o(RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooOO0(oooOoO0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0o0(RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO(oooOoO0);
    }

    private View OooO0o0(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (this.f14495OooO) {
            return OooO00o(oooOo00, oooOoO0);
        }
        return OooO0OO(oooOo00, oooOoO0);
    }

    public void OooO0o(boolean z) {
        this.f14504OooOO0O = z;
    }

    public void OooO0oO(int i) {
        this.OooO = i;
    }

    private View OooO0o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (this.f14495OooO) {
            return OooO0OO(oooOo00, oooOoO0);
        }
        return OooO00o(oooOo00, oooOoO0);
    }

    private View OooO0oO(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (this.f14495OooO) {
            return OooO0O0(oooOo00, oooOoO0);
        }
        return OooO0Oo(oooOo00, oooOoO0);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.OooO0o = 1;
        this.f14502OooO0oo = false;
        this.f14495OooO = false;
        this.f14503OooOO0 = false;
        this.f14504OooOO0O = true;
        this.OooO0oO = -1;
        this.OooO0oo = Integer.MIN_VALUE;
        this.f14499OooO00o = null;
        this.f14496OooO00o = new OooO00o();
        this.f14497OooO00o = new OooO0O0();
        this.OooO = 2;
        RecyclerView.OooOOO0.C5068OooO0Oo OooO00o2 = RecyclerView.OooOOO0.OooO00o(context, attributeSet, i, i2);
        OooO0oo(OooO00o2.OooO00o);
        OooO0o0(OooO00o2.f14596OooO00o);
        OooO0oO(OooO00o2.f14597OooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    private void OooO0oO() {
        for (int i = 0; i < OooO0O0(); i++) {
            View OooO0O02 = OooO0O0(i);
            String str = "item " + OooOO0(OooO0O02) + ", coord:" + this.f14500OooO00o.OooO0Oo(OooO0O02);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO0o() {
        String str = "validating child count " + OooO0O0();
        boolean z = true;
        if (OooO0O0() >= 1) {
            int OooOO02 = OooOO0(OooO0O0(0));
            int OooO0Oo = this.f14500OooO00o.OooO0Oo(OooO0O0(0));
            if (this.f14495OooO) {
                for (int i = 1; i < OooO0O0(); i++) {
                    View OooO0O02 = OooO0O0(i);
                    int OooOO03 = OooOO0(OooO0O02);
                    int OooO0Oo2 = this.f14500OooO00o.OooO0Oo(OooO0O02);
                    if (OooOO03 < OooOO02) {
                        OooO0oO();
                        StringBuilder sb = new StringBuilder();
                        sb.append("detected invalid position. loc invalid? ");
                        if (OooO0Oo2 >= OooO0Oo) {
                            z = false;
                        }
                        sb.append(z);
                        throw new RuntimeException(sb.toString());
                    } else if (OooO0Oo2 > OooO0Oo) {
                        OooO0oO();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            for (int i2 = 1; i2 < OooO0O0(); i2++) {
                View OooO0O03 = OooO0O0(i2);
                int OooOO04 = OooOO0(OooO0O03);
                int OooO0Oo3 = this.f14500OooO00o.OooO0Oo(OooO0O03);
                if (OooOO04 < OooOO02) {
                    OooO0oO();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    if (OooO0Oo3 >= OooO0Oo) {
                        z = false;
                    }
                    sb2.append(z);
                    throw new RuntimeException(sb2.toString());
                } else if (OooO0Oo3 < OooO0Oo) {
                    OooO0oO();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    private View OooO0oo(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (this.f14495OooO) {
            return OooO0Oo(oooOo00, oooOoO0);
        }
        return OooO0O0(oooOo00, oooOoO0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f14499OooO00o = (SavedState) parcelable;
            m14784OooO0O0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14704OooO00o() {
        return this.OooO0o == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m14699OooO00o(int i) {
        int OooO0O02 = OooO0O0();
        if (OooO0O02 == 0) {
            return null;
        }
        int OooOO02 = i - OooOO0(OooO0O0(0));
        if (OooOO02 >= 0 && OooOO02 < OooO0O02) {
            View OooO0O03 = OooO0O0(OooOO02);
            if (OooOO0(OooO0O03) == i) {
                return OooO0O03;
            }
        }
        return super.OooO00o(i);
    }

    private int OooO0O0(int i, RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, boolean z) {
        int OooO0o2;
        int OooO0o3 = i - this.f14500OooO00o.OooO0o();
        if (OooO0o3 <= 0) {
            return 0;
        }
        int i2 = -OooO0OO(OooO0o3, oooOo00, oooOoO0);
        int i3 = i + i2;
        if (!z || (OooO0o2 = i3 - this.f14500OooO00o.OooO0o()) <= 0) {
            return i2;
        }
        this.f14500OooO00o.OooO00o(-OooO0o2);
        return i2 - OooO0o2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(RecyclerView recyclerView, RecyclerView.C5077OooOoO0 oooOoO0, int i) {
        C7273o0O00O0o o0o00o0o = new C7273o0O00O0o(recyclerView.getContext());
        o0o00o0o.OooO0O0(i);
        OooO0O0(o0o00o0o);
    }

    private void OooO0O0(OooO00o oooO00o) {
        OooO0oO(oooO00o.OooO00o, oooO00o.OooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public PointF m14698OooO00o(int i) {
        if (OooO0O0() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < OooOO0(OooO0O0(0))) {
            z = true;
        }
        if (z != this.f14495OooO) {
            i2 = -1;
        }
        if (this.OooO0o == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0O0(int i, RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (this.OooO0o == 0) {
            return 0;
        }
        return OooO0OO(i, oooOo00, oooOoO0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0O0(RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO(oooOoO0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO0O0(String str) {
        if (this.f14499OooO00o == null) {
            super.OooO0O0(str);
        }
    }

    private void OooO0O0(RecyclerView.OooOo00 oooOo00, int i) {
        if (i >= 0) {
            int OooO0O02 = OooO0O0();
            if (this.f14495OooO) {
                int i2 = OooO0O02 - 1;
                for (int i3 = i2; i3 >= 0; i3--) {
                    View OooO0O03 = OooO0O0(i3);
                    if (this.f14500OooO00o.OooO00o(OooO0O03) > i || this.f14500OooO00o.OooO0o0(OooO0O03) > i) {
                        OooO00o(oooOo00, i2, i3);
                        return;
                    }
                }
                return;
            }
            for (int i4 = 0; i4 < OooO0O02; i4++) {
                View OooO0O04 = OooO0O0(i4);
                if (this.f14500OooO00o.OooO00o(OooO0O04) > i || this.f14500OooO00o.OooO0o0(OooO0O04) > i) {
                    OooO00o(oooOo00, 0, i4);
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14702OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View OooO00o2;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.f14499OooO00o == null && this.OooO0oO == -1) && oooOoO0.OooO00o() == 0) {
            OooO0O0(oooOo00);
            return;
        }
        SavedState savedState = this.f14499OooO00o;
        if (savedState != null && savedState.m14712OooO00o()) {
            this.OooO0oO = this.f14499OooO00o.o00oO0O;
        }
        OooO0o0();
        this.f14498OooO00o.f14512OooO00o = false;
        OooO0oo();
        View OooO00o3 = m14770OooO00o();
        if (!this.f14496OooO00o.f14508OooO0O0 || this.OooO0oO != -1 || this.f14499OooO00o != null) {
            this.f14496OooO00o.OooO0O0();
            OooO00o oooO00o = this.f14496OooO00o;
            oooO00o.f14507OooO00o = this.f14495OooO ^ this.f14503OooOO0;
            OooO00o(oooOo00, oooOoO0, oooO00o);
            this.f14496OooO00o.f14508OooO0O0 = true;
        } else if (OooO00o3 != null && (this.f14500OooO00o.OooO0Oo(OooO00o3) >= this.f14500OooO00o.OooO0O0() || this.f14500OooO00o.OooO00o(OooO00o3) <= this.f14500OooO00o.OooO0o())) {
            this.f14496OooO00o.OooO0O0(OooO00o3, OooOO0(OooO00o3));
        }
        int OooO0oO2 = OooO0oO(oooOoO0);
        if (this.f14498OooO00o.OooO0oo >= 0) {
            i = OooO0oO2;
            OooO0oO2 = 0;
        } else {
            i = 0;
        }
        int OooO0o2 = OooO0oO2 + this.f14500OooO00o.OooO0o();
        int OooO0OO2 = i + this.f14500OooO00o.OooO0OO();
        if (!(!oooOoO0.m14838OooO0Oo() || (i7 = this.OooO0oO) == -1 || this.OooO0oo == Integer.MIN_VALUE || (OooO00o2 = m14699OooO00o(i7)) == null)) {
            if (this.f14495OooO) {
                i8 = this.f14500OooO00o.OooO0O0() - this.f14500OooO00o.OooO00o(OooO00o2);
                i9 = this.OooO0oo;
            } else {
                i9 = this.f14500OooO00o.OooO0Oo(OooO00o2) - this.f14500OooO00o.OooO0o();
                i8 = this.OooO0oo;
            }
            int i11 = i8 - i9;
            if (i11 > 0) {
                OooO0o2 += i11;
            } else {
                OooO0OO2 -= i11;
            }
        }
        if (!this.f14496OooO00o.f14507OooO00o ? !this.f14495OooO : this.f14495OooO) {
            i10 = 1;
        }
        OooO00o(oooOo00, oooOoO0, this.f14496OooO00o, i10);
        OooO00o(oooOo00);
        this.f14498OooO00o.f14514OooO0OO = m14709OooOOoo();
        this.f14498OooO00o.f14513OooO0O0 = oooOoO0.m14838OooO0Oo();
        OooO00o oooO00o2 = this.f14496OooO00o;
        if (oooO00o2.f14507OooO00o) {
            OooO0O0(oooO00o2);
            OooO0OO oooO0OO = this.f14498OooO00o;
            oooO0OO.OooO0oO = OooO0o2;
            OooO00o(oooOo00, oooO0OO, oooOoO0, false);
            OooO0OO oooO0OO2 = this.f14498OooO00o;
            i3 = oooO0OO2.f14510OooO00o;
            int i12 = oooO0OO2.OooO0OO;
            int i13 = oooO0OO2.OooO0O0;
            if (i13 > 0) {
                OooO0OO2 += i13;
            }
            OooO00o(this.f14496OooO00o);
            OooO0OO oooO0OO3 = this.f14498OooO00o;
            oooO0OO3.OooO0oO = OooO0OO2;
            oooO0OO3.OooO0OO += oooO0OO3.OooO0Oo;
            OooO00o(oooOo00, oooO0OO3, oooOoO0, false);
            OooO0OO oooO0OO4 = this.f14498OooO00o;
            i2 = oooO0OO4.f14510OooO00o;
            int i14 = oooO0OO4.OooO0O0;
            if (i14 > 0) {
                OooO0oO(i12, i3);
                OooO0OO oooO0OO5 = this.f14498OooO00o;
                oooO0OO5.OooO0oO = i14;
                OooO00o(oooOo00, oooO0OO5, oooOoO0, false);
                i3 = this.f14498OooO00o.f14510OooO00o;
            }
        } else {
            OooO00o(oooO00o2);
            OooO0OO oooO0OO6 = this.f14498OooO00o;
            oooO0OO6.OooO0oO = OooO0OO2;
            OooO00o(oooOo00, oooO0OO6, oooOoO0, false);
            OooO0OO oooO0OO7 = this.f14498OooO00o;
            i2 = oooO0OO7.f14510OooO00o;
            int i15 = oooO0OO7.OooO0OO;
            int i16 = oooO0OO7.OooO0O0;
            if (i16 > 0) {
                OooO0o2 += i16;
            }
            OooO0O0(this.f14496OooO00o);
            OooO0OO oooO0OO8 = this.f14498OooO00o;
            oooO0OO8.OooO0oO = OooO0o2;
            oooO0OO8.OooO0OO += oooO0OO8.OooO0Oo;
            OooO00o(oooOo00, oooO0OO8, oooOoO0, false);
            OooO0OO oooO0OO9 = this.f14498OooO00o;
            i3 = oooO0OO9.f14510OooO00o;
            int i17 = oooO0OO9.OooO0O0;
            if (i17 > 0) {
                OooO0o(i15, i2);
                OooO0OO oooO0OO10 = this.f14498OooO00o;
                oooO0OO10.OooO0oO = i17;
                OooO00o(oooOo00, oooO0OO10, oooOoO0, false);
                i2 = this.f14498OooO00o.f14510OooO00o;
            }
        }
        if (OooO0O0() > 0) {
            if (this.f14495OooO ^ this.f14503OooOO0) {
                int OooO00o4 = OooO00o(i2, oooOo00, oooOoO0, true);
                i5 = i3 + OooO00o4;
                i4 = i2 + OooO00o4;
                i6 = OooO0O0(i5, oooOo00, oooOoO0, false);
            } else {
                int OooO0O02 = OooO0O0(i3, oooOo00, oooOoO0, true);
                i5 = i3 + OooO0O02;
                i4 = i2 + OooO0O02;
                i6 = OooO00o(i4, oooOo00, oooOoO0, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        OooO0O0(oooOo00, oooOoO0, i3, i2);
        if (!oooOoO0.m14838OooO0Oo()) {
            this.f14500OooO00o.m18772OooO00o();
        } else {
            this.f14496OooO00o.OooO0O0();
        }
        this.f14501OooO0oO = this.f14503OooOO0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    private View OooO0O0() {
        return OooO0O0(this.f14495OooO ? 0 : OooO0O0() - 1);
    }

    private View OooO0O0(boolean z, boolean z2) {
        if (this.f14495OooO) {
            return OooO00o(OooO0O0() - 1, -1, z, z2);
        }
        return OooO00o(0, OooO0O0(), z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    private View OooO0O0(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO00o(oooOo00, oooOoO0, 0, OooO0O0(), oooOoO0.OooO00o());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14703OooO00o(RecyclerView.C5077OooOoO0 oooOoO0) {
        super.m14778OooO00o(oooOoO0);
        this.f14499OooO00o = null;
        this.OooO0oO = -1;
        this.OooO0oo = Integer.MIN_VALUE;
        this.f14496OooO00o.OooO0O0();
    }

    private void OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, OooO00o oooO00o) {
        if (!OooO00o(oooOoO0, oooO00o) && !m14697OooO00o(oooOo00, oooOoO0, oooO00o)) {
            oooO00o.OooO00o();
            oooO00o.OooO00o = this.f14503OooOO0 ? oooOoO0.OooO00o() - 1 : 0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m14697OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, OooO00o oooO00o) {
        View view;
        int i;
        boolean z = false;
        if (OooO0O0() == 0) {
            return false;
        }
        View OooO00o2 = m14770OooO00o();
        if (OooO00o2 != null && oooO00o.OooO00o(OooO00o2, oooOoO0)) {
            oooO00o.OooO0O0(OooO00o2, OooOO0(OooO00o2));
            return true;
        } else if (this.f14501OooO0oO != this.f14503OooOO0) {
            return false;
        } else {
            if (oooO00o.f14507OooO00o) {
                view = OooO0oO(oooOo00, oooOoO0);
            } else {
                view = OooO0oo(oooOo00, oooOoO0);
            }
            if (view == null) {
                return false;
            }
            oooO00o.OooO00o(view, OooOO0(view));
            if (!oooOoO0.m14838OooO0Oo() && OooOOO0()) {
                if (this.f14500OooO00o.OooO0Oo(view) >= this.f14500OooO00o.OooO0O0() || this.f14500OooO00o.OooO00o(view) < this.f14500OooO00o.OooO0o()) {
                    z = true;
                }
                if (z) {
                    if (oooO00o.f14507OooO00o) {
                        i = this.f14500OooO00o.OooO0O0();
                    } else {
                        i = this.f14500OooO00o.OooO0o();
                    }
                    oooO00o.OooO0O0 = i;
                }
            }
            return true;
        }
    }

    private boolean OooO00o(RecyclerView.C5077OooOoO0 oooOoO0, OooO00o oooO00o) {
        int i;
        int i2;
        boolean z = false;
        if (!oooOoO0.m14838OooO0Oo() && (i = this.OooO0oO) != -1) {
            if (i < 0 || i >= oooOoO0.OooO00o()) {
                this.OooO0oO = -1;
                this.OooO0oo = Integer.MIN_VALUE;
            } else {
                oooO00o.OooO00o = this.OooO0oO;
                SavedState savedState = this.f14499OooO00o;
                if (savedState != null && savedState.m14712OooO00o()) {
                    boolean z2 = this.f14499OooO00o.OooO0O0;
                    oooO00o.f14507OooO00o = z2;
                    if (z2) {
                        oooO00o.OooO0O0 = this.f14500OooO00o.OooO0O0() - this.f14499OooO00o.o0ooOO0;
                    } else {
                        oooO00o.OooO0O0 = this.f14500OooO00o.OooO0o() + this.f14499OooO00o.o0ooOO0;
                    }
                    return true;
                } else if (this.OooO0oo == Integer.MIN_VALUE) {
                    View OooO00o2 = m14699OooO00o(this.OooO0oO);
                    if (OooO00o2 == null) {
                        if (OooO0O0() > 0) {
                            if ((this.OooO0oO < OooOO0(OooO0O0(0))) == this.f14495OooO) {
                                z = true;
                            }
                            oooO00o.f14507OooO00o = z;
                        }
                        oooO00o.OooO00o();
                    } else if (this.f14500OooO00o.OooO0O0(OooO00o2) > this.f14500OooO00o.OooO0oO()) {
                        oooO00o.OooO00o();
                        return true;
                    } else if (this.f14500OooO00o.OooO0Oo(OooO00o2) - this.f14500OooO00o.OooO0o() < 0) {
                        oooO00o.OooO0O0 = this.f14500OooO00o.OooO0o();
                        oooO00o.f14507OooO00o = false;
                        return true;
                    } else if (this.f14500OooO00o.OooO0O0() - this.f14500OooO00o.OooO00o(OooO00o2) < 0) {
                        oooO00o.OooO0O0 = this.f14500OooO00o.OooO0O0();
                        oooO00o.f14507OooO00o = true;
                        return true;
                    } else {
                        if (oooO00o.f14507OooO00o) {
                            i2 = this.f14500OooO00o.OooO00o(OooO00o2) + this.f14500OooO00o.OooO0oo();
                        } else {
                            i2 = this.f14500OooO00o.OooO0Oo(OooO00o2);
                        }
                        oooO00o.OooO0O0 = i2;
                    }
                    return true;
                } else {
                    boolean z3 = this.f14495OooO;
                    oooO00o.f14507OooO00o = z3;
                    if (z3) {
                        oooO00o.OooO0O0 = this.f14500OooO00o.OooO0O0() - this.OooO0oo;
                    } else {
                        oooO00o.OooO0O0 = this.f14500OooO00o.OooO0o() + this.OooO0oo;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private int OooO00o(int i, RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, boolean z) {
        int OooO0O02;
        int OooO0O03 = this.f14500OooO00o.OooO0O0() - i;
        if (OooO0O03 <= 0) {
            return 0;
        }
        int i2 = -OooO0OO(-OooO0O03, oooOo00, oooOoO0);
        int i3 = i + i2;
        if (!z || (OooO0O02 = this.f14500OooO00o.OooO0O0() - i3) <= 0) {
            return i2;
        }
        this.f14500OooO00o.OooO00o(OooO0O02);
        return OooO0O02 + i2;
    }

    private void OooO00o(OooO00o oooO00o) {
        OooO0o(oooO00o.OooO00o, oooO00o.OooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO0OO m14700OooO00o() {
        return new OooO0OO();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO00o(int i, RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (this.OooO0o == 1) {
            return 0;
        }
        return OooO0OO(i, oooOo00, oooOoO0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO00o(RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO0oo(oooOoO0);
    }

    private void OooO00o(int i, int i2, boolean z, RecyclerView.C5077OooOoO0 oooOoO0) {
        int i3;
        this.f14498OooO00o.f14514OooO0OO = m14709OooOOoo();
        this.f14498OooO00o.OooO0oO = OooO0oO(oooOoO0);
        OooO0OO oooO0OO = this.f14498OooO00o;
        oooO0OO.OooO0o0 = i;
        int i4 = -1;
        if (i == 1) {
            oooO0OO.OooO0oO += this.f14500OooO00o.OooO0OO();
            View OooO0O02 = OooO0O0();
            OooO0OO oooO0OO2 = this.f14498OooO00o;
            if (!this.f14495OooO) {
                i4 = 1;
            }
            oooO0OO2.OooO0Oo = i4;
            OooO0OO oooO0OO3 = this.f14498OooO00o;
            int OooOO02 = OooOO0(OooO0O02);
            OooO0OO oooO0OO4 = this.f14498OooO00o;
            oooO0OO3.OooO0OO = OooOO02 + oooO0OO4.OooO0Oo;
            oooO0OO4.f14510OooO00o = this.f14500OooO00o.OooO00o(OooO0O02);
            i3 = this.f14500OooO00o.OooO00o(OooO0O02) - this.f14500OooO00o.OooO0O0();
        } else {
            View OooO0OO2 = OooO0OO();
            this.f14498OooO00o.OooO0oO += this.f14500OooO00o.OooO0o();
            OooO0OO oooO0OO5 = this.f14498OooO00o;
            if (this.f14495OooO) {
                i4 = 1;
            }
            oooO0OO5.OooO0Oo = i4;
            OooO0OO oooO0OO6 = this.f14498OooO00o;
            int OooOO03 = OooOO0(OooO0OO2);
            OooO0OO oooO0OO7 = this.f14498OooO00o;
            oooO0OO6.OooO0OO = OooOO03 + oooO0OO7.OooO0Oo;
            oooO0OO7.f14510OooO00o = this.f14500OooO00o.OooO0Oo(OooO0OO2);
            i3 = (-this.f14500OooO00o.OooO0Oo(OooO0OO2)) + this.f14500OooO00o.OooO0o();
        }
        OooO0OO oooO0OO8 = this.f14498OooO00o;
        oooO0OO8.OooO0O0 = i2;
        if (z) {
            oooO0OO8.OooO0O0 = i2 - i3;
        }
        this.f14498OooO00o.OooO0o = i3;
    }

    public void OooO00o(RecyclerView.C5077OooOoO0 oooOoO0, OooO0OO oooO0OO, RecyclerView.OooOOO0.OooO0OO oooO0OO2) {
        int i = oooO0OO.OooO0OO;
        if (i >= 0 && i < oooOoO0.OooO00o()) {
            oooO0OO2.OooO00o(i, Math.max(0, oooO0OO.OooO0o));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(int i, RecyclerView.OooOOO0.OooO0OO oooO0OO) {
        boolean z;
        int i2;
        SavedState savedState = this.f14499OooO00o;
        int i3 = -1;
        if (savedState == null || !savedState.m14712OooO00o()) {
            OooO0oo();
            z = this.f14495OooO;
            i2 = this.OooO0oO;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f14499OooO00o;
            z = savedState2.OooO0O0;
            i2 = savedState2.o00oO0O;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.OooO && i2 >= 0 && i2 < i; i4++) {
            oooO0OO.OooO00o(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(int i, int i2, RecyclerView.C5077OooOoO0 oooOoO0, RecyclerView.OooOOO0.OooO0OO oooO0OO) {
        if (this.OooO0o != 0) {
            i = i2;
        }
        if (OooO0O0() != 0 && i != 0) {
            OooO0o0();
            OooO00o(i > 0 ? 1 : -1, Math.abs(i), true, oooOoO0);
            OooO00o(oooOoO0, this.f14498OooO00o, oooO0OO);
        }
    }

    private void OooO00o(RecyclerView.OooOo00 oooOo00, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    OooO0O0(i3, oooOo00);
                }
                return;
            }
            while (i > i2) {
                OooO0O0(i, oooOo00);
                i--;
            }
        }
    }

    private void OooO00o(RecyclerView.OooOo00 oooOo00, int i) {
        int OooO0O02 = OooO0O0();
        if (i >= 0) {
            int OooO00o2 = this.f14500OooO00o.OooO00o() - i;
            if (this.f14495OooO) {
                for (int i2 = 0; i2 < OooO0O02; i2++) {
                    View OooO0O03 = OooO0O0(i2);
                    if (this.f14500OooO00o.OooO0Oo(OooO0O03) < OooO00o2 || this.f14500OooO00o.OooO0o(OooO0O03) < OooO00o2) {
                        OooO00o(oooOo00, 0, i2);
                        return;
                    }
                }
                return;
            }
            int i3 = OooO0O02 - 1;
            for (int i4 = i3; i4 >= 0; i4--) {
                View OooO0O04 = OooO0O0(i4);
                if (this.f14500OooO00o.OooO0Oo(OooO0O04) < OooO00o2 || this.f14500OooO00o.OooO0o(OooO0O04) < OooO00o2) {
                    OooO00o(oooOo00, i3, i4);
                    return;
                }
            }
        }
    }

    private void OooO00o(RecyclerView.OooOo00 oooOo00, OooO0OO oooO0OO) {
        if (oooO0OO.f14512OooO00o && !oooO0OO.f14514OooO0OO) {
            if (oooO0OO.OooO0o0 == -1) {
                OooO00o(oooOo00, oooO0OO.OooO0o);
            } else {
                OooO0O0(oooOo00, oooO0OO.OooO0o);
            }
        }
    }

    public int OooO00o(RecyclerView.OooOo00 oooOo00, OooO0OO oooO0OO, RecyclerView.C5077OooOoO0 oooOoO0, boolean z) {
        int i = oooO0OO.OooO0O0;
        int i2 = oooO0OO.OooO0o;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                oooO0OO.OooO0o = i2 + i;
            }
            OooO00o(oooOo00, oooO0OO);
        }
        int i3 = oooO0OO.OooO0O0 + oooO0OO.OooO0oO;
        OooO0O0 oooO0O0 = this.f14497OooO00o;
        while (true) {
            if ((!oooO0OO.f14514OooO0OO && i3 <= 0) || !oooO0OO.OooO00o(oooOoO0)) {
                break;
            }
            oooO0O0.OooO00o();
            OooO00o(oooOo00, oooOoO0, oooO0OO, oooO0O0);
            if (!oooO0O0.f14509OooO00o) {
                oooO0OO.f14510OooO00o += oooO0O0.OooO00o * oooO0OO.OooO0o0;
                if (!oooO0O0.OooO0O0 || this.f14498OooO00o.f14511OooO00o != null || !oooOoO0.m14838OooO0Oo()) {
                    int i4 = oooO0OO.OooO0O0;
                    int i5 = oooO0O0.OooO00o;
                    oooO0OO.OooO0O0 = i4 - i5;
                    i3 -= i5;
                }
                int i6 = oooO0OO.OooO0o;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + oooO0O0.OooO00o;
                    oooO0OO.OooO0o = i7;
                    int i8 = oooO0OO.OooO0O0;
                    if (i8 < 0) {
                        oooO0OO.OooO0o = i7 + i8;
                    }
                    OooO00o(oooOo00, oooO0OO);
                }
                if (z && oooO0O0.OooO0OO) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - oooO0OO.OooO0O0;
    }

    public void OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, OooO0OO oooO0OO, OooO0O0 oooO0O0) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View OooO00o2 = oooO0OO.OooO00o(oooOo00);
        if (OooO00o2 == null) {
            oooO0O0.f14509OooO00o = true;
            return;
        }
        RecyclerView.OooOOO oooOOO = (RecyclerView.OooOOO) OooO00o2.getLayoutParams();
        if (oooO0OO.f14511OooO00o == null) {
            if (this.f14495OooO == (oooO0OO.OooO0o0 == -1)) {
                m14786OooO0O0(OooO00o2);
            } else {
                OooO0O0(OooO00o2, 0);
            }
        } else {
            if (this.f14495OooO == (oooO0OO.OooO0o0 == -1)) {
                m14775OooO00o(OooO00o2);
            } else {
                m14776OooO00o(OooO00o2, 0);
            }
        }
        OooO0O0(OooO00o2, 0, 0);
        oooO0O0.OooO00o = this.f14500OooO00o.OooO0O0(OooO00o2);
        if (this.OooO0o == 1) {
            if (m14708OooOOo0()) {
                i5 = OooOOOO() - OooOO0o();
                i4 = i5 - this.f14500OooO00o.OooO0OO(OooO00o2);
            } else {
                i4 = OooOO0O();
                i5 = this.f14500OooO00o.OooO0OO(OooO00o2) + i4;
            }
            if (oooO0OO.OooO0o0 == -1) {
                int i6 = oooO0OO.f14510OooO00o;
                i = i6;
                i2 = i5;
                i3 = i6 - oooO0O0.OooO00o;
            } else {
                int i7 = oooO0OO.f14510OooO00o;
                i3 = i7;
                i2 = i5;
                i = oooO0O0.OooO00o + i7;
            }
        } else {
            int OooOOO = OooOOO();
            int OooO0OO2 = this.f14500OooO00o.OooO0OO(OooO00o2) + OooOOO;
            if (oooO0OO.OooO0o0 == -1) {
                int i8 = oooO0OO.f14510OooO00o;
                i2 = i8;
                i3 = OooOOO;
                i = OooO0OO2;
                i4 = i8 - oooO0O0.OooO00o;
            } else {
                int i9 = oooO0OO.f14510OooO00o;
                i3 = OooOOO;
                i2 = oooO0O0.OooO00o + i9;
                i = OooO0OO2;
                i4 = i9;
            }
        }
        OooO0O0(OooO00o2, i4, i3, i2, i);
        if (oooOOO.m14764OooO0O0() || oooOOO.m14763OooO00o()) {
            oooO0O0.OooO0O0 = true;
        }
        oooO0O0.OooO0OO = OooO00o2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOo.OooO0O0
    public int OooO00o(int i) {
        if (i == 1) {
            return (this.OooO0o != 1 && m14708OooOOo0()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.OooO0o != 1 && m14708OooOOo0()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.OooO0o == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.OooO0o == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.OooO0o == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.OooO0o == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    private View OooO00o(boolean z, boolean z2) {
        if (this.f14495OooO) {
            return OooO00o(0, OooO0O0(), z, z2);
        }
        return OooO00o(OooO0O0() - 1, -1, z, z2);
    }

    public View OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, int i, int i2, int i3) {
        OooO0o0();
        int OooO0o2 = this.f14500OooO00o.OooO0o();
        int OooO0O02 = this.f14500OooO00o.OooO0O0();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View OooO0O03 = OooO0O0(i);
            int OooOO02 = OooOO0(OooO0O03);
            if (OooOO02 >= 0 && OooOO02 < i3) {
                if (((RecyclerView.OooOOO) OooO0O03.getLayoutParams()).m14764OooO0O0()) {
                    if (view2 == null) {
                        view2 = OooO0O03;
                    }
                } else if (this.f14500OooO00o.OooO0Oo(OooO0O03) < OooO0O02 && this.f14500OooO00o.OooO00o(OooO0O03) >= OooO0o2) {
                    return OooO0O03;
                } else {
                    if (view == null) {
                        view = OooO0O03;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    private View OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO00o(0, OooO0O0());
    }

    public View OooO00o(int i, int i2, boolean z, boolean z2) {
        OooO0o0();
        int i3 = MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP;
        int i4 = z ? SocializeConstants.AUTH_EVENT : MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP;
        if (!z2) {
            i3 = 0;
        }
        if (this.OooO0o == 0) {
            return ((RecyclerView.OooOOO0) this).f14587OooO00o.OooO00o(i, i2, i4, i3);
        }
        return ((RecyclerView.OooOOO0) this).f14591OooO0O0.OooO00o(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public View OooO00o(int i, int i2) {
        int i3;
        int i4;
        OooO0o0();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return OooO0O0(i);
        }
        if (this.f14500OooO00o.OooO0Oo(OooO0O0(i)) < this.f14500OooO00o.OooO0o()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.OooO0o == 0) {
            return ((RecyclerView.OooOOO0) this).f14587OooO00o.OooO00o(i, i2, i4, i3);
        }
        return ((RecyclerView.OooOOO0) this).f14591OooO0O0.OooO00o(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public View OooO00o(View view, int i, RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        int OooO00o2;
        View view2;
        View view3;
        OooO0oo();
        if (OooO0O0() == 0 || (OooO00o2 = OooO00o(i)) == Integer.MIN_VALUE) {
            return null;
        }
        OooO0o0();
        OooO0o0();
        OooO00o(OooO00o2, (int) (((float) this.f14500OooO00o.OooO0oO()) * 0.33333334f), false, oooOoO0);
        OooO0OO oooO0OO = this.f14498OooO00o;
        oooO0OO.OooO0o = Integer.MIN_VALUE;
        oooO0OO.f14512OooO00o = false;
        OooO00o(oooOo00, oooO0OO, oooOoO0, true);
        if (OooO00o2 == -1) {
            view2 = OooO0o(oooOo00, oooOoO0);
        } else {
            view2 = OooO0o0(oooOo00, oooOoO0);
        }
        if (OooO00o2 == -1) {
            view3 = OooO0OO();
        } else {
            view3 = OooO0O0();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    @Override // com.p118pd.sdk.C7265o0O000oo.OooOO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(@NonNull View view, @NonNull View view2, int i, int i2) {
        OooO0O0("Cannot drop a view during a scroll or layout calculation");
        OooO0o0();
        OooO0oo();
        int OooOO02 = OooOO0(view);
        int OooOO03 = OooOO0(view2);
        char c = OooOO02 < OooOO03 ? (char) 1 : 65535;
        if (this.f14495OooO) {
            if (c == 1) {
                OooO0o0(OooOO03, this.f14500OooO00o.OooO0O0() - (this.f14500OooO00o.OooO0Oo(view2) + this.f14500OooO00o.OooO0O0(view)));
            } else {
                OooO0o0(OooOO03, this.f14500OooO00o.OooO0O0() - this.f14500OooO00o.OooO00o(view2));
            }
        } else if (c == 65535) {
            OooO0o0(OooOO03, this.f14500OooO00o.OooO0Oo(view2));
        } else {
            OooO0o0(OooOO03, this.f14500OooO00o.OooO00o(view2) - this.f14500OooO00o.OooO0O0(view));
        }
    }
}
