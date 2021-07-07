package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.p118pd.sdk.AbstractC7278o0O00OoO;
import com.p118pd.sdk.C7120o00OoOO;
import com.p118pd.sdk.C7273o0O00O0o;
import com.p118pd.sdk.C7283o0O00o0O;
import com.p118pd.sdk.C7480o0OoO00O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.OooOOO0 implements RecyclerView.OooOo.OooO0O0 {
    public static final float OooO00o = 0.33333334f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f14636OooO00o = "StaggeredGridLManager";
    public static final int OooOOO = 1;
    public static final int OooOOO0 = 0;

    /* renamed from: OooOOO0  reason: collision with other field name */
    public static final boolean f14637OooOOO0 = false;
    public static final int OooOOOO = 0;
    @Deprecated
    public static final int OooOOOo = 1;
    public static final int OooOOo = Integer.MIN_VALUE;
    public static final int OooOOo0 = 2;
    public int OooO = -1;

    /* renamed from: OooO  reason: collision with other field name */
    public boolean f14638OooO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Rect f14639OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public LazySpanLookup f14640OooO00o = new LazySpanLookup();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f14641OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public SavedState f14642OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7278o0O00OoO f14643OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7480o0OoO00O f14644OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f14645OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public BitSet f14646OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f14647OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5080OooO0Oo[] f14648OooO00o;
    @NonNull
    public AbstractC7278o0O00OoO OooO0O0;
    public int OooO0o = -1;
    public int OooO0oO;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public boolean f14649OooO0oO = false;
    public int OooO0oo;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public boolean f14650OooO0oo = false;
    public int OooOO0 = Integer.MIN_VALUE;

    /* renamed from: OooOO0  reason: collision with other field name */
    public boolean f14651OooOO0;
    public int OooOO0O = 2;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public boolean f14652OooOO0O = false;
    public int OooOO0o;

    /* renamed from: OooOO0o  reason: collision with other field name */
    public boolean f14653OooOO0o = true;

    public static class LazySpanLookup {
        public static final int OooO00o = 10;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<FullSpanItem> f14654OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f14655OooO00o;

        private int OooO0o0(int i) {
            if (this.f14654OooO00o == null) {
                return -1;
            }
            FullSpanItem OooO00o2 = m14876OooO00o(i);
            if (OooO00o2 != null) {
                this.f14654OooO00o.remove(OooO00o2);
            }
            int size = this.f14654OooO00o.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f14654OooO00o.get(i2).o00oO0O >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f14654OooO00o.remove(i2);
            return this.f14654OooO00o.get(i2).o00oO0O;
        }

        public int OooO00o(int i) {
            List<FullSpanItem> list = this.f14654OooO00o;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f14654OooO00o.get(size).o00oO0O >= i) {
                        this.f14654OooO00o.remove(size);
                    }
                }
            }
            return OooO0OO(i);
        }

        public int OooO0O0(int i) {
            int[] iArr = this.f14655OooO00o;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        public int OooO0OO(int i) {
            int[] iArr = this.f14655OooO00o;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int OooO0o0 = OooO0o0(i);
            if (OooO0o0 == -1) {
                int[] iArr2 = this.f14655OooO00o;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f14655OooO00o.length;
            }
            int i2 = OooO0o0 + 1;
            Arrays.fill(this.f14655OooO00o, i, i2, -1);
            return i2;
        }

        public int OooO0Oo(int i) {
            int length = this.f14655OooO00o.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        private void OooO0Oo(int i, int i2) {
            List<FullSpanItem> list = this.f14654OooO00o;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f14654OooO00o.get(size);
                    int i4 = fullSpanItem.o00oO0O;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f14654OooO00o.remove(size);
                        } else {
                            fullSpanItem.o00oO0O = i4 - i2;
                        }
                    }
                }
            }
        }

        public void OooO0O0(int i, int i2) {
            int[] iArr = this.f14655OooO00o;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m14877OooO00o(i3);
                int[] iArr2 = this.f14655OooO00o;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f14655OooO00o;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                OooO0Oo(i, i2);
            }
        }

        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new OooO00o();
            public int[] OooO00o;
            public boolean OooO0O0;
            public int o00oO0O;
            public int o0ooOO0;

            public static class OooO00o implements Parcelable.Creator<FullSpanItem> {
                /* renamed from: OooO00o */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* renamed from: OooO00o */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.o00oO0O = parcel.readInt();
                this.o0ooOO0 = parcel.readInt();
                this.OooO0O0 = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.OooO00o = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int OooO00o(int i) {
                int[] iArr = this.OooO00o;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.o00oO0O + ", mGapDir=" + this.o0ooOO0 + ", mHasUnwantedGapAfter=" + this.OooO0O0 + ", mGapPerSpan=" + Arrays.toString(this.OooO00o) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.o00oO0O);
                parcel.writeInt(this.o0ooOO0);
                parcel.writeInt(this.OooO0O0 ? 1 : 0);
                int[] iArr = this.OooO00o;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.OooO00o);
            }

            public FullSpanItem() {
            }
        }

        private void OooO0OO(int i, int i2) {
            List<FullSpanItem> list = this.f14654OooO00o;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f14654OooO00o.get(size);
                    int i3 = fullSpanItem.o00oO0O;
                    if (i3 >= i) {
                        fullSpanItem.o00oO0O = i3 + i2;
                    }
                }
            }
        }

        public void OooO00o(int i, C5080OooO0Oo oooO0Oo) {
            m14877OooO00o(i);
            this.f14655OooO00o[i] = oooO0Oo.OooO0Oo;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14877OooO00o(int i) {
            int[] iArr = this.f14655OooO00o;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f14655OooO00o = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[OooO0Oo(i)];
                this.f14655OooO00o = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f14655OooO00o;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public void OooO00o() {
            int[] iArr = this.f14655OooO00o;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f14654OooO00o = null;
        }

        public void OooO00o(int i, int i2) {
            int[] iArr = this.f14655OooO00o;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m14877OooO00o(i3);
                int[] iArr2 = this.f14655OooO00o;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f14655OooO00o, i, i3, -1);
                OooO0OO(i, i2);
            }
        }

        public void OooO00o(FullSpanItem fullSpanItem) {
            if (this.f14654OooO00o == null) {
                this.f14654OooO00o = new ArrayList();
            }
            int size = this.f14654OooO00o.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f14654OooO00o.get(i);
                if (fullSpanItem2.o00oO0O == fullSpanItem.o00oO0O) {
                    this.f14654OooO00o.remove(i);
                }
                if (fullSpanItem2.o00oO0O >= fullSpanItem.o00oO0O) {
                    this.f14654OooO00o.add(i, fullSpanItem);
                    return;
                }
            }
            this.f14654OooO00o.add(fullSpanItem);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public FullSpanItem m14876OooO00o(int i) {
            List<FullSpanItem> list = this.f14654OooO00o;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f14654OooO00o.get(size);
                if (fullSpanItem.o00oO0O == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem OooO00o(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f14654OooO00o;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f14654OooO00o.get(i4);
                int i5 = fullSpanItem.o00oO0O;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.o0ooOO0 == i3 || (z && fullSpanItem.OooO0O0))) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.OooOOOo();
        }
    }

    public static class OooO0OO extends RecyclerView.OooOOO {
        public static final int OooO00o = -1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5080OooO0Oo f14660OooO00o;
        public boolean OooO0OO;

        public OooO0OO(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void OooO00o(boolean z) {
            this.OooO0OO = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final int OooO0Oo() {
            C5080OooO0Oo oooO0Oo = this.f14660OooO00o;
            if (oooO0Oo == null) {
                return -1;
            }
            return oooO0Oo.OooO0Oo;
        }

        public boolean OooO0o0() {
            return this.OooO0OO;
        }

        public OooO0OO(int i, int i2) {
            super(i, i2);
        }

        public OooO0OO(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public OooO0OO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public OooO0OO(RecyclerView.OooOOO oooOOO) {
            super(oooOOO);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public List<LazySpanLookup.FullSpanItem> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f14663OooO00o;
        public boolean OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public int[] f14664OooO0O0;
        public boolean OooO0OO;
        public boolean OooO0Oo;
        public int o00oO0O;
        public int o0ooOO0;
        public int o0ooOOo;
        public int o0ooOoO;

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

        public void OooO00o() {
            this.f14663OooO00o = null;
            this.o0ooOOo = 0;
            this.o00oO0O = -1;
            this.o0ooOO0 = -1;
        }

        public void OooO0O0() {
            this.f14663OooO00o = null;
            this.o0ooOOo = 0;
            this.o0ooOoO = 0;
            this.f14664OooO0O0 = null;
            this.OooO00o = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.o00oO0O);
            parcel.writeInt(this.o0ooOO0);
            parcel.writeInt(this.o0ooOOo);
            if (this.o0ooOOo > 0) {
                parcel.writeIntArray(this.f14663OooO00o);
            }
            parcel.writeInt(this.o0ooOoO);
            if (this.o0ooOoO > 0) {
                parcel.writeIntArray(this.f14664OooO0O0);
            }
            parcel.writeInt(this.OooO0O0 ? 1 : 0);
            parcel.writeInt(this.OooO0OO ? 1 : 0);
            parcel.writeInt(this.OooO0Oo ? 1 : 0);
            parcel.writeList(this.OooO00o);
        }

        public SavedState(Parcel parcel) {
            this.o00oO0O = parcel.readInt();
            this.o0ooOO0 = parcel.readInt();
            int readInt = parcel.readInt();
            this.o0ooOOo = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f14663OooO00o = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.o0ooOoO = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f14664OooO0O0 = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.OooO0O0 = parcel.readInt() == 1;
            this.OooO0OO = parcel.readInt() == 1;
            this.OooO0Oo = parcel.readInt() == 1 ? true : z;
            this.OooO00o = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.o0ooOOo = savedState.o0ooOOo;
            this.o00oO0O = savedState.o00oO0O;
            this.o0ooOO0 = savedState.o0ooOO0;
            this.f14663OooO00o = savedState.f14663OooO00o;
            this.o0ooOoO = savedState.o0ooOoO;
            this.f14664OooO0O0 = savedState.f14664OooO0O0;
            this.OooO0O0 = savedState.OooO0O0;
            this.OooO0OO = savedState.OooO0OO;
            this.OooO0Oo = savedState.OooO0Oo;
            this.OooO00o = savedState.OooO00o;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.OooOOO0.C5068OooO0Oo OooO00o2 = RecyclerView.OooOOO0.OooO00o(context, attributeSet, i, i2);
        m14873OooO0oo(OooO00o2.OooO00o);
        OooO(OooO00o2.OooO0O0);
        OooO0Oo(OooO00o2.f14596OooO00o);
        this.f14644OooO00o = new C7480o0OoO00O();
        OooO0o();
    }

    private boolean OooO00o(C5080OooO0Oo oooO0Oo) {
        if (this.f14650OooO0oo) {
            if (oooO0Oo.OooO0oo() < this.f14643OooO00o.OooO0O0()) {
                ArrayList<View> arrayList = oooO0Oo.f14662OooO00o;
                return !oooO0Oo.OooO00o(arrayList.get(arrayList.size() - 1)).OooO0OO;
            }
        } else if (oooO0Oo.OooO() > this.f14643OooO00o.OooO0o()) {
            return !oooO0Oo.OooO00o(oooO0Oo.f14662OooO00o.get(0)).OooO0OO;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (OooOOOo() != false) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0OO(androidx.recyclerview.widget.RecyclerView.OooOo00 r9, androidx.recyclerview.widget.RecyclerView.C5077OooOoO0 r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 379
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.OooO0OO(androidx.recyclerview.widget.RecyclerView$OooOo00, androidx.recyclerview.widget.RecyclerView$OooOoO0, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    private void OooO0o() {
        this.f14643OooO00o = AbstractC7278o0O00OoO.OooO00o(this, this.OooO0oO);
        this.OooO0O0 = AbstractC7278o0O00OoO.OooO00o(this, 1 - this.OooO0oO);
    }

    private void OooOO0O(int i) {
        C7480o0OoO00O o0ooo00o = this.f14644OooO00o;
        o0ooo00o.OooO0Oo = i;
        int i2 = 1;
        if (this.f14650OooO0oo != (i == -1)) {
            i2 = -1;
        }
        o0ooo00o.OooO0OO = i2;
    }

    public void OooO(int i) {
        OooO0O0((String) null);
        if (i != this.OooO0o) {
            OooO0o0();
            this.OooO0o = i;
            this.f14646OooO00o = new BitSet(this.OooO0o);
            this.f14648OooO00o = new C5080OooO0Oo[this.OooO0o];
            for (int i2 = 0; i2 < this.OooO0o; i2++) {
                this.f14648OooO00o[i2] = new C5080OooO0Oo(i2);
            }
            m14784OooO0O0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO0O0(RecyclerView recyclerView, RecyclerView.OooOo00 oooOo00) {
        super.OooO0O0(recyclerView, oooOo00);
        m14783OooO00o(this.f14645OooO00o);
        for (int i = 0; i < this.OooO0o; i++) {
            this.f14648OooO00o[i].m14883OooO0OO();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public void m14869OooO0Oo(int i) {
        if (i == 0) {
            OooOOOo();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO0o0() {
        this.f14640OooO00o.OooO00o();
        m14784OooO0O0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public boolean m14872OooO0oO() {
        return this.OooOO0O != 0;
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public void m14873OooO0oo(int i) {
        if (i == 0 || i == 1) {
            OooO0O0((String) null);
            if (i != this.OooO0oO) {
                this.OooO0oO = i;
                AbstractC7278o0O00OoO o0o00ooo = this.f14643OooO00o;
                this.f14643OooO00o = this.OooO0O0;
                this.OooO0O0 = o0o00ooo;
                m14784OooO0O0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void OooOO0(int i) {
        this.OooO0oo = i / this.OooO0o;
        this.OooOO0o = View.MeasureSpec.makeMeasureSpec(i, this.OooO0O0.OooO0Oo());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public boolean OooOOO() {
        int OooO00o2 = this.f14648OooO00o[0].OooO00o(Integer.MIN_VALUE);
        for (int i = 1; i < this.OooO0o; i++) {
            if (this.f14648OooO00o[i].OooO00o(Integer.MIN_VALUE) != OooO00o2) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    public boolean OooOOO0() {
        return this.f14642OooO00o == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public boolean OooOOOO() {
        int OooO0O02 = this.f14648OooO00o[0].OooO0O0(Integer.MIN_VALUE);
        for (int i = 1; i < this.OooO0o; i++) {
            if (this.f14648OooO00o[i].OooO0O0(Integer.MIN_VALUE) != OooO0O02) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public boolean OooOOOo() {
        int i;
        int i2;
        if (OooO0O0() == 0 || this.OooOO0O == 0 || !m14795OooO0o()) {
            return false;
        }
        if (this.f14650OooO0oo) {
            i2 = OooOo00();
            i = OooOOo();
        } else {
            i2 = OooOOo();
            i = OooOo00();
        }
        if (i2 == 0 && OooO0O0() != null) {
            this.f14640OooO00o.OooO00o();
            m14788OooO0OO();
            m14784OooO0O0();
            return true;
        } else if (!this.f14652OooOO0O) {
            return false;
        } else {
            int i3 = this.f14650OooO0oo ? -1 : 1;
            int i4 = i + 1;
            LazySpanLookup.FullSpanItem OooO00o2 = this.f14640OooO00o.OooO00o(i2, i4, i3, true);
            if (OooO00o2 == null) {
                this.f14652OooOO0O = false;
                this.f14640OooO00o.OooO00o(i4);
                return false;
            }
            LazySpanLookup.FullSpanItem OooO00o3 = this.f14640OooO00o.OooO00o(i2, OooO00o2.o00oO0O, i3 * -1, true);
            if (OooO00o3 == null) {
                this.f14640OooO00o.OooO00o(OooO00o2.o00oO0O);
            } else {
                this.f14640OooO00o.OooO00o(OooO00o3.o00oO0O + 1);
            }
            m14788OooO0OO();
            m14784OooO0O0();
            return true;
        }
    }

    /* renamed from: OooOOo  reason: collision with other method in class */
    public boolean m14874OooOOo() {
        return OooO0o() == 1;
    }

    /* renamed from: OooOOo0  reason: collision with other method in class */
    public boolean m14875OooOOo0() {
        return this.f14649OooO0oO;
    }

    public int OooOOoo() {
        return this.OooOO0O;
    }

    public int OooOo0() {
        return this.OooO0oO;
    }

    public int OooOo00() {
        int OooO0O02 = OooO0O0();
        if (OooO0O02 == 0) {
            return 0;
        }
        return OooOO0(OooO0O0(OooO0O02 - 1));
    }

    public int OooOo0O() {
        return this.OooO0o;
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$OooO0Oo  reason: case insensitive filesystem */
    public class C5080OooO0Oo {
        public static final int OooO0o0 = Integer.MIN_VALUE;
        public int OooO00o = Integer.MIN_VALUE;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ArrayList<View> f14662OooO00o = new ArrayList<>();
        public int OooO0O0 = Integer.MIN_VALUE;
        public int OooO0OO = 0;
        public final int OooO0Oo;

        public C5080OooO0Oo(int i) {
            this.OooO0Oo = i;
        }

        public int OooO() {
            int i = this.OooO00o;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m14881OooO0O0();
            return this.OooO00o;
        }

        public int OooO00o(int i) {
            int i2 = this.OooO0O0;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f14662OooO00o.size() == 0) {
                return i;
            }
            m14878OooO00o();
            return this.OooO0O0;
        }

        public int OooO0O0(int i) {
            int i2 = this.OooO00o;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f14662OooO00o.size() == 0) {
                return i;
            }
            m14881OooO0O0();
            return this.OooO00o;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public void m14883OooO0OO() {
            this.f14662OooO00o.clear();
            m14884OooO0Oo();
            this.OooO0OO = 0;
        }

        /* renamed from: OooO0Oo  reason: collision with other method in class */
        public void m14884OooO0Oo() {
            this.OooO00o = Integer.MIN_VALUE;
            this.OooO0O0 = Integer.MIN_VALUE;
        }

        /* renamed from: OooO0o  reason: collision with other method in class */
        public void m14885OooO0o() {
            View remove = this.f14662OooO00o.remove(0);
            OooO0OO OooO00o2 = OooO00o(remove);
            OooO00o2.f14660OooO00o = null;
            if (this.f14662OooO00o.size() == 0) {
                this.OooO0O0 = Integer.MIN_VALUE;
            }
            if (OooO00o2.m14764OooO0O0() || OooO00o2.m14763OooO00o()) {
                this.OooO0OO -= StaggeredGridLayoutManager.this.f14643OooO00o.OooO0O0(remove);
            }
            this.OooO00o = Integer.MIN_VALUE;
        }

        /* renamed from: OooO0o0  reason: collision with other method in class */
        public void m14886OooO0o0() {
            int size = this.f14662OooO00o.size();
            View remove = this.f14662OooO00o.remove(size - 1);
            OooO0OO OooO00o2 = OooO00o(remove);
            OooO00o2.f14660OooO00o = null;
            if (OooO00o2.m14764OooO0O0() || OooO00o2.m14763OooO00o()) {
                this.OooO0OO -= StaggeredGridLayoutManager.this.f14643OooO00o.OooO0O0(remove);
            }
            if (size == 1) {
                this.OooO00o = Integer.MIN_VALUE;
            }
            this.OooO0O0 = Integer.MIN_VALUE;
        }

        public int OooO0oO() {
            return this.OooO0OO;
        }

        public int OooO0oo() {
            int i = this.OooO0O0;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m14878OooO00o();
            return this.OooO0O0;
        }

        public int OooO0Oo() {
            if (StaggeredGridLayoutManager.this.f14649OooO0oO) {
                return OooO0O0(0, this.f14662OooO00o.size(), true);
            }
            return OooO0O0(this.f14662OooO00o.size() - 1, -1, true);
        }

        public int OooO0OO() {
            if (StaggeredGridLayoutManager.this.f14649OooO0oO) {
                return OooO0O0(this.f14662OooO00o.size() - 1, -1, false);
            }
            return OooO0O0(0, this.f14662OooO00o.size(), false);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14878OooO00o() {
            LazySpanLookup.FullSpanItem OooO00o2;
            ArrayList<View> arrayList = this.f14662OooO00o;
            View view = arrayList.get(arrayList.size() - 1);
            OooO0OO OooO00o3 = OooO00o(view);
            this.OooO0O0 = StaggeredGridLayoutManager.this.f14643OooO00o.OooO00o(view);
            if (OooO00o3.OooO0OO && (OooO00o2 = StaggeredGridLayoutManager.this.f14640OooO00o.m14876OooO00o(OooO00o3.OooO0O0())) != null && OooO00o2.o0ooOO0 == 1) {
                this.OooO0O0 += OooO00o2.OooO00o(this.OooO0Oo);
            }
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m14881OooO0O0() {
            LazySpanLookup.FullSpanItem OooO00o2;
            View view = this.f14662OooO00o.get(0);
            OooO0OO OooO00o3 = OooO00o(view);
            this.OooO00o = StaggeredGridLayoutManager.this.f14643OooO00o.OooO0Oo(view);
            if (OooO00o3.OooO0OO && (OooO00o2 = StaggeredGridLayoutManager.this.f14640OooO00o.m14876OooO00o(OooO00o3.OooO0O0())) != null && OooO00o2.o0ooOO0 == -1) {
                this.OooO00o -= OooO00o2.OooO00o(this.OooO0Oo);
            }
        }

        public int OooO0o() {
            if (StaggeredGridLayoutManager.this.f14649OooO0oO) {
                return OooO0O0(0, this.f14662OooO00o.size(), false);
            }
            return OooO0O0(this.f14662OooO00o.size() - 1, -1, false);
        }

        public int OooO0o0() {
            if (StaggeredGridLayoutManager.this.f14649OooO0oO) {
                return OooO00o(0, this.f14662OooO00o.size(), true);
            }
            return OooO00o(this.f14662OooO00o.size() - 1, -1, true);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14880OooO00o(View view) {
            OooO0OO OooO00o2 = OooO00o(view);
            OooO00o2.f14660OooO00o = this;
            this.f14662OooO00o.add(view);
            this.OooO0O0 = Integer.MIN_VALUE;
            if (this.f14662OooO00o.size() == 1) {
                this.OooO00o = Integer.MIN_VALUE;
            }
            if (OooO00o2.m14764OooO0O0() || OooO00o2.m14763OooO00o()) {
                this.OooO0OO += StaggeredGridLayoutManager.this.f14643OooO00o.OooO0O0(view);
            }
        }

        public void OooO0O0(View view) {
            OooO0OO OooO00o2 = OooO00o(view);
            OooO00o2.f14660OooO00o = this;
            this.f14662OooO00o.add(0, view);
            this.OooO00o = Integer.MIN_VALUE;
            if (this.f14662OooO00o.size() == 1) {
                this.OooO0O0 = Integer.MIN_VALUE;
            }
            if (OooO00o2.m14764OooO0O0() || OooO00o2.m14763OooO00o()) {
                this.OooO0OO += StaggeredGridLayoutManager.this.f14643OooO00o.OooO0O0(view);
            }
        }

        public void OooO00o(boolean z, int i) {
            int i2;
            if (z) {
                i2 = OooO00o(Integer.MIN_VALUE);
            } else {
                i2 = OooO0O0(Integer.MIN_VALUE);
            }
            m14883OooO0OO();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.f14643OooO00o.OooO0O0()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.f14643OooO00o.OooO0o()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.OooO0O0 = i2;
                    this.OooO00o = i2;
                }
            }
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m14882OooO0O0(int i) {
            this.OooO00o = i;
            this.OooO0O0 = i;
        }

        public int OooO0O0() {
            if (StaggeredGridLayoutManager.this.f14649OooO0oO) {
                return OooO00o(this.f14662OooO00o.size() - 1, -1, true);
            }
            return OooO00o(0, this.f14662OooO00o.size(), true);
        }

        public int OooO0O0(int i, int i2, boolean z) {
            return OooO00o(i, i2, z, true, false);
        }

        public OooO0OO OooO00o(View view) {
            return (OooO0OO) view.getLayoutParams();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14879OooO00o(int i) {
            int i2 = this.OooO00o;
            if (i2 != Integer.MIN_VALUE) {
                this.OooO00o = i2 + i;
            }
            int i3 = this.OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                this.OooO0O0 = i3 + i;
            }
        }

        public int OooO00o() {
            if (StaggeredGridLayoutManager.this.f14649OooO0oO) {
                return OooO0O0(this.f14662OooO00o.size() - 1, -1, true);
            }
            return OooO0O0(0, this.f14662OooO00o.size(), true);
        }

        public int OooO00o(int i, int i2, boolean z, boolean z2, boolean z3) {
            int OooO0o = StaggeredGridLayoutManager.this.f14643OooO00o.OooO0o();
            int OooO0O02 = StaggeredGridLayoutManager.this.f14643OooO00o.OooO0O0();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f14662OooO00o.get(i);
                int OooO0Oo2 = StaggeredGridLayoutManager.this.f14643OooO00o.OooO0Oo(view);
                int OooO00o2 = StaggeredGridLayoutManager.this.f14643OooO00o.OooO00o(view);
                boolean z4 = false;
                boolean z5 = !z3 ? OooO0Oo2 < OooO0O02 : OooO0Oo2 <= OooO0O02;
                if (!z3 ? OooO00o2 > OooO0o : OooO00o2 >= OooO0o) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.OooOO0(view);
                        }
                        if (OooO0Oo2 < OooO0o || OooO00o2 > OooO0O02) {
                            return StaggeredGridLayoutManager.this.OooOO0(view);
                        }
                    } else if (OooO0Oo2 >= OooO0o && OooO00o2 <= OooO0O02) {
                        return StaggeredGridLayoutManager.this.OooOO0(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        public int OooO00o(int i, int i2, boolean z) {
            return OooO00o(i, i2, false, false, z);
        }

        public View OooO00o(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f14662OooO00o.size() - 1;
                while (size >= 0) {
                    View view2 = this.f14662OooO00o.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f14649OooO0oO && staggeredGridLayoutManager.OooOO0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f14649OooO0oO && staggeredGridLayoutManager2.OooOO0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f14662OooO00o.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f14662OooO00o.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f14649OooO0oO && staggeredGridLayoutManager3.OooOO0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f14649OooO0oO && staggeredGridLayoutManager4.OooOO0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }
    }

    public void OooO0Oo(boolean z) {
        OooO0O0((String) null);
        SavedState savedState = this.f14642OooO00o;
        if (!(savedState == null || savedState.OooO0O0 == z)) {
            savedState.OooO0O0 = z;
        }
        this.f14649OooO0oO = z;
        m14784OooO0O0();
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public void m14871OooO0oO(int i) {
        OooO0O0((String) null);
        if (i != this.OooOO0O) {
            if (i == 0 || i == 2) {
                this.OooOO0O = i;
                m14784OooO0O0();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
    }

    public int OooOOo() {
        if (OooO0O0() == 0) {
            return 0;
        }
        return OooOO0(OooO0O0(0));
    }

    public int OooOOo0() {
        View view;
        if (this.f14650OooO0oo) {
            view = OooO00o(true);
        } else {
            view = OooO0O0(true);
        }
        if (view == null) {
            return -1;
        }
        return OooOO0(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    private void OooOO0O(View view) {
        for (int i = this.OooO0o - 1; i >= 0; i--) {
            this.f14648OooO00o[i].OooO0O0(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0o0(RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO0oo(oooOoO0);
    }

    public class OooO0O0 {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14657OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f14658OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f14659OooO0O0;
        public boolean OooO0OO;

        public OooO0O0() {
            OooO0O0();
        }

        public void OooO00o(C5080OooO0Oo[] oooO0OoArr) {
            int length = oooO0OoArr.length;
            int[] iArr = this.f14658OooO00o;
            if (iArr == null || iArr.length < length) {
                this.f14658OooO00o = new int[StaggeredGridLayoutManager.this.f14648OooO00o.length];
            }
            for (int i = 0; i < length; i++) {
                this.f14658OooO00o[i] = oooO0OoArr[i].OooO0O0(Integer.MIN_VALUE);
            }
        }

        public void OooO0O0() {
            this.OooO00o = -1;
            this.OooO0O0 = Integer.MIN_VALUE;
            this.f14657OooO00o = false;
            this.f14659OooO0O0 = false;
            this.OooO0OO = false;
            int[] iArr = this.f14658OooO00o;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void OooO00o() {
            int i;
            if (this.f14657OooO00o) {
                i = StaggeredGridLayoutManager.this.f14643OooO00o.OooO0O0();
            } else {
                i = StaggeredGridLayoutManager.this.f14643OooO00o.OooO0o();
            }
            this.OooO0O0 = i;
        }

        public void OooO00o(int i) {
            if (this.f14657OooO00o) {
                this.OooO0O0 = StaggeredGridLayoutManager.this.f14643OooO00o.OooO0O0() - i;
            } else {
                this.OooO0O0 = StaggeredGridLayoutManager.this.f14643OooO00o.OooO0o() + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    private int OooO0o0(int i) {
        int OooO00o2 = this.f14648OooO00o[0].OooO00o(i);
        for (int i2 = 1; i2 < this.OooO0o; i2++) {
            int OooO00o3 = this.f14648OooO00o[i2].OooO00o(i);
            if (OooO00o3 > OooO00o2) {
                OooO00o2 = OooO00o3;
            }
        }
        return OooO00o2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0o(RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO(oooOoO0);
    }

    private void OooO0o(int i, int i2) {
        for (int i3 = 0; i3 < this.OooO0o; i3++) {
            if (!this.f14648OooO00o[i3].f14662OooO00o.isEmpty()) {
                OooO00o(this.f14648OooO00o[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    private void OooOO0(View view) {
        for (int i = this.OooO0o - 1; i >= 0; i--) {
            this.f14648OooO00o[i].m14880OooO00o(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View OooO0O0() {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.OooO0O0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    private void OooO0oO() {
        if (this.OooO0O0.OooO0Oo() != 1073741824) {
            float f = 0.0f;
            int OooO0O02 = OooO0O0();
            for (int i = 0; i < OooO0O02; i++) {
                View OooO0O03 = OooO0O0(i);
                float OooO0O04 = (float) this.OooO0O0.OooO0O0(OooO0O03);
                if (OooO0O04 >= f) {
                    if (((OooO0OO) OooO0O03.getLayoutParams()).OooO0o0()) {
                        OooO0O04 = (OooO0O04 * 1.0f) / ((float) this.OooO0o);
                    }
                    f = Math.max(f, OooO0O04);
                }
            }
            int i2 = this.OooO0oo;
            int round = Math.round(f * ((float) this.OooO0o));
            if (this.OooO0O0.OooO0Oo() == Integer.MIN_VALUE) {
                round = Math.min(round, this.OooO0O0.OooO0oO());
            }
            OooOO0(round);
            if (this.OooO0oo != i2) {
                for (int i3 = 0; i3 < OooO0O02; i3++) {
                    View OooO0O05 = OooO0O0(i3);
                    OooO0OO oooO0OO = (OooO0OO) OooO0O05.getLayoutParams();
                    if (!oooO0OO.OooO0OO) {
                        if (!m14874OooOOo() || this.OooO0oO != 1) {
                            int i4 = oooO0OO.f14660OooO00o.OooO0Oo;
                            int i5 = this.OooO0oo * i4;
                            int i6 = i4 * i2;
                            if (this.OooO0oO == 1) {
                                OooO0O05.offsetLeftAndRight(i5 - i6);
                            } else {
                                OooO0O05.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.OooO0o;
                            int i8 = oooO0OO.f14660OooO00o.OooO0Oo;
                            OooO0O05.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.OooO0oo) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    public int[] OooO0Oo(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.OooO0o];
        } else if (iArr.length < this.OooO0o) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.OooO0o + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.OooO0o; i++) {
            iArr[i] = this.f14648OooO00o[i].OooO0o();
        }
        return iArr;
    }

    public void OooO0o0(int i, int i2) {
        SavedState savedState = this.f14642OooO00o;
        if (savedState != null) {
            savedState.OooO00o();
        }
        this.OooO = i;
        this.OooOO0 = i2;
        m14784OooO0O0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    private int OooO0o(int i) {
        int OooO0O02 = this.f14648OooO00o[0].OooO0O0(i);
        for (int i2 = 1; i2 < this.OooO0o; i2++) {
            int OooO0O03 = this.f14648OooO00o[i2].OooO0O0(i);
            if (OooO0O03 > OooO0O02) {
                OooO0O02 = OooO0O03;
            }
        }
        return OooO0O02;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    private void OooO0oo() {
        if (this.OooO0oO == 1 || !m14874OooOOo()) {
            this.f14650OooO0oo = this.f14649OooO0oO;
        } else {
            this.f14650OooO0oo = !this.f14649OooO0oO;
        }
    }

    private int OooO(RecyclerView.C5077OooOoO0 oooOoO0) {
        if (OooO0O0() == 0) {
            return 0;
        }
        return C7283o0O00o0O.OooO0O0(oooOoO0, this.f14643OooO00o, OooO0O0(!this.f14653OooOO0o), OooO00o(!this.f14653OooOO0o), this, this.f14653OooOO0o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int OooOO0O2 = OooOO0O() + OooOO0o();
        int OooOOO2 = OooOOO() + OooO();
        if (this.OooO0oO == 1) {
            i4 = RecyclerView.OooOOO0.OooO00o(i2, rect.height() + OooOOO2, OooO0oO());
            i3 = RecyclerView.OooOOO0.OooO00o(i, (this.OooO0oo * this.OooO0o) + OooOO0O2, OooO0oo());
        } else {
            i3 = RecyclerView.OooOOO0.OooO00o(i, rect.width() + OooOO0O2, OooO0oo());
            i4 = RecyclerView.OooOOO0.OooO00o(i2, (this.OooO0oo * this.OooO0o) + OooOOO2, OooO0oO());
        }
        OooO0OO(i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO0o  reason: collision with other method in class */
    public void m14870OooO0o(int i) {
        SavedState savedState = this.f14642OooO00o;
        if (!(savedState == null || savedState.o00oO0O == i)) {
            savedState.OooO00o();
        }
        this.OooO = i;
        this.OooOO0 = Integer.MIN_VALUE;
        m14784OooO0O0();
    }

    private int OooO0oo(RecyclerView.C5077OooOoO0 oooOoO0) {
        if (OooO0O0() == 0) {
            return 0;
        }
        return C7283o0O00o0O.OooO00o(oooOoO0, this.f14643OooO00o, OooO0O0(!this.f14653OooOO0o), OooO00o(!this.f14653OooOO0o), this, this.f14653OooOO0o, this.f14650OooO0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0Oo(RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO0oO(oooOoO0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO0Oo(RecyclerView recyclerView) {
        this.f14640OooO00o.OooO00o();
        m14784OooO0O0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    private int OooO0Oo(int i) {
        for (int OooO0O02 = OooO0O0() - 1; OooO0O02 >= 0; OooO0O02--) {
            int OooOO02 = OooOO0(OooO0O0(OooO0O02));
            if (OooOO02 >= 0 && OooOO02 < i) {
                return OooOO02;
            }
        }
        return 0;
    }

    private int OooO0oo(int i) {
        int OooO0O02 = this.f14648OooO00o[0].OooO0O0(i);
        for (int i2 = 1; i2 < this.OooO0o; i2++) {
            int OooO0O03 = this.f14648OooO00o[i2].OooO0O0(i);
            if (OooO0O03 < OooO0O02) {
                OooO0O02 = OooO0O03;
            }
        }
        return OooO0O02;
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.OooO0oO = i2;
        OooO(i);
        this.f14644OooO00o = new C7480o0OoO00O();
        OooO0o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14862OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        OooO0OO(oooOo00, oooOoO0, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14863OooO00o(RecyclerView.C5077OooOoO0 oooOoO0) {
        super.m14778OooO00o(oooOoO0);
        this.OooO = -1;
        this.OooOO0 = Integer.MIN_VALUE;
        this.f14642OooO00o = null;
        this.f14641OooO00o.OooO0O0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO0O0(String str) {
        if (this.f14642OooO00o == null) {
            super.OooO0O0(str);
        }
    }

    private boolean OooO0O0(RecyclerView.C5077OooOoO0 oooOoO0, OooO0O0 oooO0O0) {
        int i;
        if (this.f14638OooO) {
            i = OooO0Oo(oooOoO0.OooO00o());
        } else {
            i = OooO0OO(oooOoO0.OooO00o());
        }
        oooO0O0.OooO00o = i;
        oooO0O0.OooO0O0 = Integer.MIN_VALUE;
        return true;
    }

    private void OooO00o(OooO0O0 oooO0O0) {
        int i;
        SavedState savedState = this.f14642OooO00o;
        int i2 = savedState.o0ooOOo;
        if (i2 > 0) {
            if (i2 == this.OooO0o) {
                for (int i3 = 0; i3 < this.OooO0o; i3++) {
                    this.f14648OooO00o[i3].m14883OooO0OO();
                    SavedState savedState2 = this.f14642OooO00o;
                    int i4 = savedState2.f14663OooO00o[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (savedState2.OooO0OO) {
                            i = this.f14643OooO00o.OooO0O0();
                        } else {
                            i = this.f14643OooO00o.OooO0o();
                        }
                        i4 += i;
                    }
                    this.f14648OooO00o[i3].m14882OooO0O0(i4);
                }
            } else {
                savedState.OooO0O0();
                SavedState savedState3 = this.f14642OooO00o;
                savedState3.o00oO0O = savedState3.o0ooOO0;
            }
        }
        SavedState savedState4 = this.f14642OooO00o;
        this.f14651OooOO0 = savedState4.OooO0Oo;
        OooO0Oo(savedState4.OooO0O0);
        OooO0oo();
        SavedState savedState5 = this.f14642OooO00o;
        int i5 = savedState5.o00oO0O;
        if (i5 != -1) {
            this.OooO = i5;
            oooO0O0.f14657OooO00o = savedState5.OooO0OO;
        } else {
            oooO0O0.f14657OooO00o = this.f14650OooO0oo;
        }
        SavedState savedState6 = this.f14642OooO00o;
        if (savedState6.o0ooOoO > 1) {
            LazySpanLookup lazySpanLookup = this.f14640OooO00o;
            lazySpanLookup.f14655OooO00o = savedState6.f14664OooO0O0;
            lazySpanLookup.f14654OooO00o = savedState6.OooO00o;
        }
    }

    private int OooO0oO(RecyclerView.C5077OooOoO0 oooOoO0) {
        if (OooO0O0() == 0) {
            return 0;
        }
        return C7283o0O00o0O.OooO00o(oooOoO0, this.f14643OooO00o, OooO0O0(!this.f14653OooOO0o), OooO00o(!this.f14653OooOO0o), this, this.f14653OooOO0o);
    }

    public int[] OooO0O0(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.OooO0o];
        } else if (iArr.length < this.OooO0o) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.OooO0o + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.OooO0o; i++) {
            iArr[i] = this.f14648OooO00o[i].OooO0OO();
        }
        return iArr;
    }

    private int OooO0oO(int i) {
        int OooO00o2 = this.f14648OooO00o[0].OooO00o(i);
        for (int i2 = 1; i2 < this.OooO0o; i2++) {
            int OooO00o3 = this.f14648OooO00o[i2].OooO00o(i);
            if (OooO00o3 < OooO00o2) {
                OooO00o2 = OooO00o3;
            }
        }
        return OooO00o2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0O0(RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO0oo(oooOoO0);
    }

    private int OooO0O0(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0O0(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (this.OooO0oO == 0) {
            return this.OooO0o;
        }
        return super.OooO0O0(oooOo00, oooOoO0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public View OooO0O0(boolean z) {
        int OooO0o2 = this.f14643OooO00o.OooO0o();
        int OooO0O02 = this.f14643OooO00o.OooO0O0();
        int OooO0O03 = OooO0O0();
        View view = null;
        for (int i = 0; i < OooO0O03; i++) {
            View OooO0O04 = OooO0O0(i);
            int OooO0Oo = this.f14643OooO00o.OooO0Oo(OooO0O04);
            if (this.f14643OooO00o.OooO00o(OooO0O04) > OooO0o2 && OooO0Oo < OooO0O02) {
                if (OooO0Oo >= OooO0o2 || !z) {
                    return OooO0O04;
                }
                if (view == null) {
                    view = OooO0O04;
                }
            }
        }
        return view;
    }

    private void OooO0O0(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, boolean z) {
        int OooO0o2;
        int OooO0oo2 = OooO0oo(Integer.MAX_VALUE);
        if (OooO0oo2 != Integer.MAX_VALUE && (OooO0o2 = OooO0oo2 - this.f14643OooO00o.OooO0o()) > 0) {
            int OooO0OO2 = OooO0o2 - OooO0OO(OooO0o2, oooOo00, oooOoO0);
            if (z && OooO0OO2 > 0) {
                this.f14643OooO00o.OooO00o(-OooO0OO2);
            }
        }
    }

    public void OooO00o(RecyclerView.C5077OooOoO0 oooOoO0, OooO0O0 oooO0O0) {
        if (!m14865OooO00o(oooOoO0, oooO0O0) && !OooO0O0(oooOoO0, oooO0O0)) {
            oooO0O0.OooO00o();
            oooO0O0.OooO00o = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0O0(int r5, androidx.recyclerview.widget.RecyclerView.C5077OooOoO0 r6) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.OooO0O0(int, androidx.recyclerview.widget.RecyclerView$OooOoO0):void");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14865OooO00o(RecyclerView.C5077OooOoO0 oooOoO0, OooO0O0 oooO0O0) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!oooOoO0.m14838OooO0Oo() && (i = this.OooO) != -1) {
            if (i < 0 || i >= oooOoO0.OooO00o()) {
                this.OooO = -1;
                this.OooOO0 = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.f14642OooO00o;
                if (savedState == null || savedState.o00oO0O == -1 || savedState.o0ooOOo < 1) {
                    View OooO00o2 = OooO00o(this.OooO);
                    if (OooO00o2 != null) {
                        if (this.f14650OooO0oo) {
                            i2 = OooOo00();
                        } else {
                            i2 = OooOOo();
                        }
                        oooO0O0.OooO00o = i2;
                        if (this.OooOO0 != Integer.MIN_VALUE) {
                            if (oooO0O0.f14657OooO00o) {
                                oooO0O0.OooO0O0 = (this.f14643OooO00o.OooO0O0() - this.OooOO0) - this.f14643OooO00o.OooO00o(OooO00o2);
                            } else {
                                oooO0O0.OooO0O0 = (this.f14643OooO00o.OooO0o() + this.OooOO0) - this.f14643OooO00o.OooO0Oo(OooO00o2);
                            }
                            return true;
                        } else if (this.f14643OooO00o.OooO0O0(OooO00o2) > this.f14643OooO00o.OooO0oO()) {
                            if (oooO0O0.f14657OooO00o) {
                                i3 = this.f14643OooO00o.OooO0O0();
                            } else {
                                i3 = this.f14643OooO00o.OooO0o();
                            }
                            oooO0O0.OooO0O0 = i3;
                            return true;
                        } else {
                            int OooO0Oo = this.f14643OooO00o.OooO0Oo(OooO00o2) - this.f14643OooO00o.OooO0o();
                            if (OooO0Oo < 0) {
                                oooO0O0.OooO0O0 = -OooO0Oo;
                                return true;
                            }
                            int OooO0O02 = this.f14643OooO00o.OooO0O0() - this.f14643OooO00o.OooO00o(OooO00o2);
                            if (OooO0O02 < 0) {
                                oooO0O0.OooO0O0 = OooO0O02;
                                return true;
                            }
                            oooO0O0.OooO0O0 = Integer.MIN_VALUE;
                        }
                    } else {
                        int i4 = this.OooO;
                        oooO0O0.OooO00o = i4;
                        int i5 = this.OooOO0;
                        if (i5 == Integer.MIN_VALUE) {
                            if (OooO00o(i4) == 1) {
                                z = true;
                            }
                            oooO0O0.f14657OooO00o = z;
                            oooO0O0.OooO00o();
                        } else {
                            oooO0O0.OooO00o(i5);
                        }
                        oooO0O0.f14659OooO0O0 = true;
                    }
                } else {
                    oooO0O0.OooO0O0 = Integer.MIN_VALUE;
                    oooO0O0.OooO00o = this.OooO;
                }
                return true;
            }
        }
        return false;
    }

    public int[] OooO0OO(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.OooO0o];
        } else if (iArr.length < this.OooO0o) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.OooO0o + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.OooO0o; i++) {
            iArr[i] = this.f14648OooO00o[i].OooO0Oo();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m14866OooO0O0(int i) {
        super.m14785OooO0O0(i);
        for (int i2 = 0; i2 < this.OooO0o; i2++) {
            this.f14648OooO00o[i2].m14879OooO00o(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO0O0(RecyclerView recyclerView, int i, int i2) {
        OooO00o(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO0O0  reason: collision with other method in class */
    private LazySpanLookup.FullSpanItem m14859OooO0O0(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.OooO00o = new int[this.OooO0o];
        for (int i2 = 0; i2 < this.OooO0o; i2++) {
            fullSpanItem.OooO00o[i2] = this.f14648OooO00o[i2].OooO0O0(i) - i;
        }
        return fullSpanItem;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0OO(RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO(oooOoO0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m14868OooO0OO(int i) {
        super.OooO0OO(i);
        for (int i2 = 0; i2 < this.OooO0o; i2++) {
            this.f14648OooO00o[i2].m14879OooO00o(i);
        }
    }

    private void OooO0O0(RecyclerView.OooOo00 oooOo00, int i) {
        while (OooO0O0() > 0) {
            View OooO0O02 = OooO0O0(0);
            if (this.f14643OooO00o.OooO00o(OooO0O02) <= i && this.f14643OooO00o.OooO0o0(OooO0O02) <= i) {
                OooO0OO oooO0OO = (OooO0OO) OooO0O02.getLayoutParams();
                if (oooO0OO.OooO0OO) {
                    for (int i2 = 0; i2 < this.OooO0o; i2++) {
                        if (this.f14648OooO00o[i2].f14662OooO00o.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.OooO0o; i3++) {
                        this.f14648OooO00o[i3].m14885OooO0o();
                    }
                } else if (oooO0OO.f14660OooO00o.f14662OooO00o.size() != 1) {
                    oooO0OO.f14660OooO00o.m14885OooO0o();
                } else {
                    return;
                }
                OooO0O0(OooO0O02, oooOo00);
            } else {
                return;
            }
        }
    }

    public int OooO0OO(int i, RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (OooO0O0() == 0 || i == 0) {
            return 0;
        }
        OooO00o(i, oooOoO0);
        int OooO00o2 = OooO00o(oooOo00, this.f14644OooO00o, oooOoO0);
        if (this.f14644OooO00o.f20302OooO00o >= OooO00o2) {
            i = i < 0 ? -OooO00o2 : OooO00o2;
        }
        this.f14643OooO00o.OooO00o(-i);
        this.f14638OooO = this.f14650OooO0oo;
        C7480o0OoO00O o0ooo00o = this.f14644OooO00o;
        o0ooo00o.f20302OooO00o = 0;
        OooO00o(oooOo00, o0ooo00o);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    private int OooO0OO(int i) {
        int OooO0O02 = OooO0O0();
        for (int i2 = 0; i2 < OooO0O02; i2++) {
            int OooOO02 = OooOO0(OooO0O0(i2));
            if (OooOO02 >= 0 && OooOO02 < i) {
                return OooOO02;
            }
        }
        return 0;
    }

    public int[] OooO00o(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.OooO0o];
        } else if (iArr.length < this.OooO0o) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.OooO0o + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.OooO0o; i++) {
            iArr[i] = this.f14648OooO00o[i].OooO00o();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14867OooO0O0() {
        return this.OooO0oO == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0O0(int i, RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO0OO(i, oooOo00, oooOoO0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    private int OooO0O0(int i) {
        if (i == 1) {
            return (this.OooO0oO != 1 && m14874OooOOo()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.OooO0oO != 1 && m14874OooOOo()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.OooO0oO == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.OooO0oO == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.OooO0oO == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.OooO0oO == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO00o(RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO0oO(oooOoO0);
    }

    private void OooO00o(View view, OooO0OO oooO0OO, boolean z) {
        if (oooO0OO.OooO0OO) {
            if (this.OooO0oO == 1) {
                OooO00o(view, this.OooOO0o, RecyclerView.OooOOO0.OooO00o(OooO0OO(), OooO0Oo(), OooOOO() + OooO(), ((ViewGroup.MarginLayoutParams) oooO0OO).height, true), z);
            } else {
                OooO00o(view, RecyclerView.OooOOO0.OooO00o(OooOOOO(), OooOOOo(), OooOO0O() + OooOO0o(), ((ViewGroup.MarginLayoutParams) oooO0OO).width, true), this.OooOO0o, z);
            }
        } else if (this.OooO0oO == 1) {
            OooO00o(view, RecyclerView.OooOOO0.OooO00o(this.OooO0oo, OooOOOo(), 0, ((ViewGroup.MarginLayoutParams) oooO0OO).width, false), RecyclerView.OooOOO0.OooO00o(OooO0OO(), OooO0Oo(), OooOOO() + OooO(), ((ViewGroup.MarginLayoutParams) oooO0OO).height, true), z);
        } else {
            OooO00o(view, RecyclerView.OooOOO0.OooO00o(OooOOOO(), OooOOOo(), OooOO0O() + OooOO0o(), ((ViewGroup.MarginLayoutParams) oooO0OO).width, true), RecyclerView.OooOOO0.OooO00o(this.OooO0oo, OooO0Oo(), 0, ((ViewGroup.MarginLayoutParams) oooO0OO).height, false), z);
        }
    }

    private void OooO00o(View view, int i, int i2, boolean z) {
        boolean z2;
        OooO00o(view, this.f14639OooO00o);
        OooO0OO oooO0OO = (OooO0OO) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) oooO0OO).leftMargin;
        Rect rect = this.f14639OooO00o;
        int OooO0O02 = OooO0O0(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) oooO0OO).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) oooO0OO).topMargin;
        Rect rect2 = this.f14639OooO00o;
        int OooO0O03 = OooO0O0(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) oooO0OO).bottomMargin + rect2.bottom);
        if (z) {
            z2 = OooO0O0(view, OooO0O02, OooO0O03, oooO0OO);
        } else {
            z2 = OooO00o(view, OooO0O02, OooO0O03, oooO0OO);
        }
        if (z2) {
            view.measure(OooO0O02, OooO0O03);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f14642OooO00o = (SavedState) parcelable;
            m14784OooO0O0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    public Parcelable OooO00o() {
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (this.f14642OooO00o != null) {
            return new SavedState(this.f14642OooO00o);
        }
        SavedState savedState = new SavedState();
        savedState.OooO0O0 = this.f14649OooO0oO;
        savedState.OooO0OO = this.f14638OooO;
        savedState.OooO0Oo = this.f14651OooOO0;
        LazySpanLookup lazySpanLookup = this.f14640OooO00o;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f14655OooO00o) == null) {
            savedState.o0ooOoO = 0;
        } else {
            savedState.f14664OooO0O0 = iArr;
            savedState.o0ooOoO = iArr.length;
            savedState.OooO00o = lazySpanLookup.f14654OooO00o;
        }
        if (OooO0O0() > 0) {
            if (this.f14638OooO) {
                i = OooOo00();
            } else {
                i = OooOOo();
            }
            savedState.o00oO0O = i;
            savedState.o0ooOO0 = OooOOo0();
            int i4 = this.OooO0o;
            savedState.o0ooOOo = i4;
            savedState.f14663OooO00o = new int[i4];
            for (int i5 = 0; i5 < this.OooO0o; i5++) {
                if (this.f14638OooO) {
                    i2 = this.f14648OooO00o[i5].OooO00o(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f14643OooO00o.OooO0O0();
                    } else {
                        savedState.f14663OooO00o[i5] = i2;
                    }
                } else {
                    i2 = this.f14648OooO00o[i5].OooO0O0(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f14643OooO00o.OooO0o();
                    } else {
                        savedState.f14663OooO00o[i5] = i2;
                    }
                }
                i2 -= i3;
                savedState.f14663OooO00o[i5] = i2;
            }
        } else {
            savedState.o00oO0O = -1;
            savedState.o0ooOO0 = -1;
            savedState.o0ooOOo = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, View view, C7120o00OoOO o00oooo) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof OooO0OO)) {
            super.OooO00o(view, o00oooo);
            return;
        }
        OooO0OO oooO0OO = (OooO0OO) layoutParams;
        if (this.OooO0oO == 0) {
            o00oooo.OooO0O0(C7120o00OoOO.OooO0OO.OooO00o(oooO0OO.OooO0Oo(), oooO0OO.OooO0OO ? this.OooO0o : 1, -1, -1, oooO0OO.OooO0OO, false));
        } else {
            o00oooo.OooO0O0(C7120o00OoOO.OooO0OO.OooO00o(-1, -1, oooO0OO.OooO0Oo(), oooO0OO.OooO0OO ? this.OooO0o : 1, oooO0OO.OooO0OO, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(AccessibilityEvent accessibilityEvent) {
        super.OooO00o(accessibilityEvent);
        if (OooO0O0() > 0) {
            View OooO0O02 = OooO0O0(false);
            View OooO00o2 = OooO00o(false);
            if (OooO0O02 != null && OooO00o2 != null) {
                int OooOO02 = OooOO0(OooO0O02);
                int OooOO03 = OooOO0(OooO00o2);
                if (OooOO02 < OooOO03) {
                    accessibilityEvent.setFromIndex(OooOO02);
                    accessibilityEvent.setToIndex(OooOO03);
                    return;
                }
                accessibilityEvent.setFromIndex(OooOO03);
                accessibilityEvent.setToIndex(OooOO02);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (this.OooO0oO == 1) {
            return this.OooO0o;
        }
        return super.OooO00o(oooOo00, oooOoO0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public View OooO00o(boolean z) {
        int OooO0o2 = this.f14643OooO00o.OooO0o();
        int OooO0O02 = this.f14643OooO00o.OooO0O0();
        View view = null;
        for (int OooO0O03 = OooO0O0() - 1; OooO0O03 >= 0; OooO0O03--) {
            View OooO0O04 = OooO0O0(OooO0O03);
            int OooO0Oo = this.f14643OooO00o.OooO0Oo(OooO0O04);
            int OooO00o2 = this.f14643OooO00o.OooO00o(OooO0O04);
            if (OooO00o2 > OooO0o2 && OooO0Oo < OooO0O02) {
                if (OooO00o2 <= OooO0O02 || !z) {
                    return OooO0O04;
                }
                if (view == null) {
                    view = OooO0O04;
                }
            }
        }
        return view;
    }

    private void OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, boolean z) {
        int OooO0O02;
        int OooO0o0 = OooO0o0(Integer.MIN_VALUE);
        if (OooO0o0 != Integer.MIN_VALUE && (OooO0O02 = this.f14643OooO00o.OooO0O0() - OooO0o0) > 0) {
            int i = OooO0O02 - (-OooO0OO(-OooO0O02, oooOo00, oooOoO0));
            if (z && i > 0) {
                this.f14643OooO00o.OooO00o(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(RecyclerView recyclerView, int i, int i2) {
        OooO00o(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(RecyclerView recyclerView, int i, int i2, int i3) {
        OooO00o(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(RecyclerView recyclerView, int i, int i2, Object obj) {
        OooO00o(i, i2, 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f14650OooO0oo
            if (r0 == 0) goto L_0x0009
            int r0 = r6.OooOo00()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.OooOOo()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f14640OooO00o
            r4.OooO0OO(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f14640OooO00o
            r9.OooO0O0(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f14640OooO00o
            r7.OooO00o(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f14640OooO00o
            r9.OooO0O0(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f14640OooO00o
            r9.OooO00o(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f14650OooO0oo
            if (r7 == 0) goto L_0x004d
            int r7 = r6.OooOOo()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.OooOo00()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.m14784OooO0O0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.OooO00o(int, int, int):void");
    }

    private int OooO00o(RecyclerView.OooOo00 oooOo00, C7480o0OoO00O o0ooo00o, RecyclerView.C5077OooOoO0 oooOoO0) {
        int i;
        int i2;
        int i3;
        C5080OooO0Oo oooO0Oo;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int i12;
        boolean z2 = false;
        this.f14646OooO00o.set(0, this.OooO0o, true);
        if (this.f14644OooO00o.f20305OooO0OO) {
            i = o0ooo00o.OooO0Oo == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (o0ooo00o.OooO0Oo == 1) {
                i12 = o0ooo00o.OooO0o + o0ooo00o.f20302OooO00o;
            } else {
                i12 = o0ooo00o.OooO0o0 - o0ooo00o.f20302OooO00o;
            }
            i = i12;
        }
        OooO0o(o0ooo00o.OooO0Oo, i);
        if (this.f14650OooO0oo) {
            i2 = this.f14643OooO00o.OooO0O0();
        } else {
            i2 = this.f14643OooO00o.OooO0o();
        }
        boolean z3 = false;
        while (o0ooo00o.OooO00o(oooOoO0) && (this.f14644OooO00o.f20305OooO0OO || !this.f14646OooO00o.isEmpty())) {
            View OooO00o2 = o0ooo00o.OooO00o(oooOo00);
            OooO0OO oooO0OO = (OooO0OO) OooO00o2.getLayoutParams();
            int OooO0O02 = oooO0OO.OooO0O0();
            int OooO0O03 = this.f14640OooO00o.OooO0O0(OooO0O02);
            boolean z4 = OooO0O03 == -1;
            if (z4) {
                if (oooO0OO.OooO0OO) {
                    C5080OooO0Oo[] oooO0OoArr = this.f14648OooO00o;
                    char c = z2 ? 1 : 0;
                    char c2 = z2 ? 1 : 0;
                    char c3 = z2 ? 1 : 0;
                    oooO0Oo = oooO0OoArr[c];
                } else {
                    oooO0Oo = OooO00o(o0ooo00o);
                }
                this.f14640OooO00o.OooO00o(OooO0O02, oooO0Oo);
            } else {
                oooO0Oo = this.f14648OooO00o[OooO0O03];
            }
            oooO0OO.f14660OooO00o = oooO0Oo;
            if (o0ooo00o.OooO0Oo == 1) {
                m14786OooO0O0(OooO00o2);
            } else {
                int i13 = z2 ? 1 : 0;
                int i14 = z2 ? 1 : 0;
                int i15 = z2 ? 1 : 0;
                OooO0O0(OooO00o2, i13);
            }
            OooO00o(OooO00o2, oooO0OO, z2);
            if (o0ooo00o.OooO0Oo == 1) {
                if (oooO0OO.OooO0OO) {
                    i11 = OooO0o0(i2);
                } else {
                    i11 = oooO0Oo.OooO00o(i2);
                }
                int OooO0O04 = this.f14643OooO00o.OooO0O0(OooO00o2) + i11;
                if (z4 && oooO0OO.OooO0OO) {
                    LazySpanLookup.FullSpanItem OooO00o3 = m14857OooO00o(i11);
                    OooO00o3.o0ooOO0 = -1;
                    OooO00o3.o00oO0O = OooO0O02;
                    this.f14640OooO00o.OooO00o(OooO00o3);
                }
                i4 = OooO0O04;
                i5 = i11;
            } else {
                if (oooO0OO.OooO0OO) {
                    i10 = OooO0oo(i2);
                } else {
                    i10 = oooO0Oo.OooO0O0(i2);
                }
                i5 = i10 - this.f14643OooO00o.OooO0O0(OooO00o2);
                if (z4 && oooO0OO.OooO0OO) {
                    LazySpanLookup.FullSpanItem OooO0O05 = m14859OooO0O0(i10);
                    OooO0O05.o0ooOO0 = 1;
                    OooO0O05.o00oO0O = OooO0O02;
                    this.f14640OooO00o.OooO00o(OooO0O05);
                }
                i4 = i10;
            }
            if (oooO0OO.OooO0OO && o0ooo00o.OooO0OO == -1) {
                if (z4) {
                    this.f14652OooOO0O = true;
                } else {
                    if (o0ooo00o.OooO0Oo == 1) {
                        z = OooOOO();
                    } else {
                        z = OooOOOO();
                    }
                    if (!z) {
                        LazySpanLookup.FullSpanItem OooO00o4 = this.f14640OooO00o.m14876OooO00o(OooO0O02);
                        if (OooO00o4 != null) {
                            OooO00o4.OooO0O0 = true;
                        }
                        this.f14652OooOO0O = true;
                    }
                }
            }
            OooO00o(OooO00o2, oooO0OO, o0ooo00o);
            if (!m14874OooOOo() || this.OooO0oO != 1) {
                if (oooO0OO.OooO0OO) {
                    i8 = this.OooO0O0.OooO0o();
                } else {
                    i8 = (oooO0Oo.OooO0Oo * this.OooO0oo) + this.OooO0O0.OooO0o();
                }
                i7 = i8;
                i6 = this.OooO0O0.OooO0O0(OooO00o2) + i8;
            } else {
                if (oooO0OO.OooO0OO) {
                    i9 = this.OooO0O0.OooO0O0();
                } else {
                    i9 = this.OooO0O0.OooO0O0() - (((this.OooO0o - 1) - oooO0Oo.OooO0Oo) * this.OooO0oo);
                }
                i6 = i9;
                i7 = i9 - this.OooO0O0.OooO0O0(OooO00o2);
            }
            if (this.OooO0oO == 1) {
                OooO0O0(OooO00o2, i7, i5, i6, i4);
            } else {
                OooO0O0(OooO00o2, i5, i7, i4, i6);
            }
            if (oooO0OO.OooO0OO) {
                OooO0o(this.f14644OooO00o.OooO0Oo, i);
            } else {
                OooO00o(oooO0Oo, this.f14644OooO00o.OooO0Oo, i);
            }
            OooO00o(oooOo00, this.f14644OooO00o);
            if (this.f14644OooO00o.f20304OooO0O0 && OooO00o2.hasFocusable()) {
                if (oooO0OO.OooO0OO) {
                    this.f14646OooO00o.clear();
                } else {
                    this.f14646OooO00o.set(oooO0Oo.OooO0Oo, false);
                    z3 = true;
                    z2 = false;
                }
            }
            z3 = true;
            z2 = false;
        }
        if (!z3) {
            OooO00o(oooOo00, this.f14644OooO00o);
        }
        if (this.f14644OooO00o.OooO0Oo == -1) {
            i3 = this.f14643OooO00o.OooO0o() - OooO0oo(this.f14643OooO00o.OooO0o());
        } else {
            i3 = OooO0o0(this.f14643OooO00o.OooO0O0()) - this.f14643OooO00o.OooO0O0();
        }
        if (i3 > 0) {
            return Math.min(o0ooo00o.f20302OooO00o, i3);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    private LazySpanLookup.FullSpanItem m14857OooO00o(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.OooO00o = new int[this.OooO0o];
        for (int i2 = 0; i2 < this.OooO0o; i2++) {
            fullSpanItem.OooO00o[i2] = i - this.f14648OooO00o[i2].OooO00o(i);
        }
        return fullSpanItem;
    }

    private void OooO00o(View view, OooO0OO oooO0OO, C7480o0OoO00O o0ooo00o) {
        if (o0ooo00o.OooO0Oo == 1) {
            if (oooO0OO.OooO0OO) {
                OooOO0(view);
            } else {
                oooO0OO.f14660OooO00o.m14880OooO00o(view);
            }
        } else if (oooO0OO.OooO0OO) {
            OooOO0O(view);
        } else {
            oooO0OO.f14660OooO00o.OooO0O0(view);
        }
    }

    private void OooO00o(RecyclerView.OooOo00 oooOo00, C7480o0OoO00O o0ooo00o) {
        int i;
        int i2;
        if (o0ooo00o.f20303OooO00o && !o0ooo00o.f20305OooO0OO) {
            if (o0ooo00o.f20302OooO00o == 0) {
                if (o0ooo00o.OooO0Oo == -1) {
                    OooO00o(oooOo00, o0ooo00o.OooO0o);
                } else {
                    OooO0O0(oooOo00, o0ooo00o.OooO0o0);
                }
            } else if (o0ooo00o.OooO0Oo == -1) {
                int i3 = o0ooo00o.OooO0o0;
                int OooO0o2 = i3 - OooO0o(i3);
                if (OooO0o2 < 0) {
                    i2 = o0ooo00o.OooO0o;
                } else {
                    i2 = o0ooo00o.OooO0o - Math.min(OooO0o2, o0ooo00o.f20302OooO00o);
                }
                OooO00o(oooOo00, i2);
            } else {
                int OooO0oO2 = OooO0oO(o0ooo00o.OooO0o) - o0ooo00o.OooO0o;
                if (OooO0oO2 < 0) {
                    i = o0ooo00o.OooO0o0;
                } else {
                    i = Math.min(OooO0oO2, o0ooo00o.f20302OooO00o) + o0ooo00o.OooO0o0;
                }
                OooO0O0(oooOo00, i);
            }
        }
    }

    private void OooO00o(C5080OooO0Oo oooO0Oo, int i, int i2) {
        int OooO0oO2 = oooO0Oo.OooO0oO();
        if (i == -1) {
            if (oooO0Oo.OooO() + OooO0oO2 <= i2) {
                this.f14646OooO00o.set(oooO0Oo.OooO0Oo, false);
            }
        } else if (oooO0Oo.OooO0oo() - OooO0oO2 >= i2) {
            this.f14646OooO00o.set(oooO0Oo.OooO0Oo, false);
        }
    }

    private void OooO00o(RecyclerView.OooOo00 oooOo00, int i) {
        for (int OooO0O02 = OooO0O0() - 1; OooO0O02 >= 0; OooO0O02--) {
            View OooO0O03 = OooO0O0(OooO0O02);
            if (this.f14643OooO00o.OooO0Oo(OooO0O03) >= i && this.f14643OooO00o.OooO0o(OooO0O03) >= i) {
                OooO0OO oooO0OO = (OooO0OO) OooO0O03.getLayoutParams();
                if (oooO0OO.OooO0OO) {
                    for (int i2 = 0; i2 < this.OooO0o; i2++) {
                        if (this.f14648OooO00o[i2].f14662OooO00o.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.OooO0o; i3++) {
                        this.f14648OooO00o[i3].m14886OooO0o0();
                    }
                } else if (oooO0OO.f14660OooO00o.f14662OooO00o.size() != 1) {
                    oooO0OO.f14660OooO00o.m14886OooO0o0();
                } else {
                    return;
                }
                OooO0O0(OooO0O03, oooOo00);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m14858OooO00o(int i) {
        if (this.OooO0oO == 0) {
            if ((i == -1) != this.f14650OooO0oo) {
                return true;
            }
            return false;
        }
        if (((i == -1) == this.f14650OooO0oo) == m14874OooOOo()) {
            return true;
        }
        return false;
    }

    private C5080OooO0Oo OooO00o(C7480o0OoO00O o0ooo00o) {
        int i;
        int i2;
        int i3 = -1;
        if (m14858OooO00o(o0ooo00o.OooO0Oo)) {
            i2 = this.OooO0o - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.OooO0o;
            i = 1;
        }
        C5080OooO0Oo oooO0Oo = null;
        if (o0ooo00o.OooO0Oo == 1) {
            int i4 = Integer.MAX_VALUE;
            int OooO0o2 = this.f14643OooO00o.OooO0o();
            while (i2 != i3) {
                C5080OooO0Oo oooO0Oo2 = this.f14648OooO00o[i2];
                int OooO00o2 = oooO0Oo2.OooO00o(OooO0o2);
                if (OooO00o2 < i4) {
                    oooO0Oo = oooO0Oo2;
                    i4 = OooO00o2;
                }
                i2 += i;
            }
            return oooO0Oo;
        }
        int i5 = Integer.MIN_VALUE;
        int OooO0O02 = this.f14643OooO00o.OooO0O0();
        while (i2 != i3) {
            C5080OooO0Oo oooO0Oo3 = this.f14648OooO00o[i2];
            int OooO0O03 = oooO0Oo3.OooO0O0(OooO0O02);
            if (OooO0O03 > i5) {
                oooO0Oo = oooO0Oo3;
                i5 = OooO0O03;
            }
            i2 += i;
        }
        return oooO0Oo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14864OooO00o() {
        return this.OooO0oO == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO00o(int i, RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        return OooO0OO(i, oooOo00, oooOoO0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOo.OooO0O0
    private int OooO00o(int i) {
        if (OooO0O0() != 0) {
            if ((i < OooOOo()) != this.f14650OooO0oo) {
                return -1;
            }
            return 1;
        } else if (this.f14650OooO0oo) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public PointF m14860OooO00o(int i) {
        int OooO00o2 = OooO00o(i);
        PointF pointF = new PointF();
        if (OooO00o2 == 0) {
            return null;
        }
        if (this.OooO0oO == 0) {
            pointF.x = (float) OooO00o2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) OooO00o2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(RecyclerView recyclerView, RecyclerView.C5077OooOoO0 oooOoO0, int i) {
        C7273o0O00O0o o0o00o0o = new C7273o0O00O0o(recyclerView.getContext());
        o0o00o0o.OooO0O0(i);
        OooO0O0(o0o00o0o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void OooO00o(int i, int i2, RecyclerView.C5077OooOoO0 oooOoO0, RecyclerView.OooOOO0.OooO0OO oooO0OO) {
        int i3;
        int i4;
        if (this.OooO0oO != 0) {
            i = i2;
        }
        if (!(OooO0O0() == 0 || i == 0)) {
            OooO00o(i, oooOoO0);
            int[] iArr = this.f14647OooO00o;
            if (iArr == null || iArr.length < this.OooO0o) {
                this.f14647OooO00o = new int[this.OooO0o];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.OooO0o; i6++) {
                C7480o0OoO00O o0ooo00o = this.f14644OooO00o;
                if (o0ooo00o.OooO0OO == -1) {
                    i4 = o0ooo00o.OooO0o0;
                    i3 = this.f14648OooO00o[i6].OooO0O0(i4);
                } else {
                    i4 = this.f14648OooO00o[i6].OooO00o(o0ooo00o.OooO0o);
                    i3 = this.f14644OooO00o.OooO0o;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f14647OooO00o[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f14647OooO00o, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f14644OooO00o.OooO00o(oooOoO0); i8++) {
                oooO0OO.OooO00o(this.f14644OooO00o.OooO0O0, this.f14647OooO00o[i8]);
                C7480o0OoO00O o0ooo00o2 = this.f14644OooO00o;
                o0ooo00o2.OooO0O0 += o0ooo00o2.OooO0OO;
            }
        }
    }

    public void OooO00o(int i, RecyclerView.C5077OooOoO0 oooOoO0) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = OooOo00();
            i2 = 1;
        } else {
            i3 = OooOOo();
            i2 = -1;
        }
        this.f14644OooO00o.f20303OooO00o = true;
        OooO0O0(i3, oooOoO0);
        OooOO0O(i2);
        C7480o0OoO00O o0ooo00o = this.f14644OooO00o;
        o0ooo00o.OooO0O0 = i3 + o0ooo00o.OooO0OO;
        o0ooo00o.f20302OooO00o = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public RecyclerView.OooOOO m14861OooO00o() {
        if (this.OooO0oO == 0) {
            return new OooO0OO(-2, -1);
        }
        return new OooO0OO(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public RecyclerView.OooOOO OooO00o(Context context, AttributeSet attributeSet) {
        return new OooO0OO(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public RecyclerView.OooOOO OooO00o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new OooO0OO((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new OooO0OO(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public boolean OooO00o(RecyclerView.OooOOO oooOOO) {
        return oooOOO instanceof OooO0OO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    @Nullable
    public View OooO00o(View view, int i, RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        View OooO00o2;
        int i2;
        int i3;
        int i4;
        int i5;
        View OooO00o3;
        if (OooO0O0() == 0 || (OooO00o2 = m14771OooO00o(view)) == null) {
            return null;
        }
        OooO0oo();
        int OooO0O02 = OooO0O0(i);
        if (OooO0O02 == Integer.MIN_VALUE) {
            return null;
        }
        OooO0OO oooO0OO = (OooO0OO) OooO00o2.getLayoutParams();
        boolean z = oooO0OO.OooO0OO;
        C5080OooO0Oo oooO0Oo = oooO0OO.f14660OooO00o;
        if (OooO0O02 == 1) {
            i2 = OooOo00();
        } else {
            i2 = OooOOo();
        }
        OooO0O0(i2, oooOoO0);
        OooOO0O(OooO0O02);
        C7480o0OoO00O o0ooo00o = this.f14644OooO00o;
        o0ooo00o.OooO0O0 = o0ooo00o.OooO0OO + i2;
        o0ooo00o.f20302OooO00o = (int) (((float) this.f14643OooO00o.OooO0oO()) * 0.33333334f);
        C7480o0OoO00O o0ooo00o2 = this.f14644OooO00o;
        o0ooo00o2.f20304OooO0O0 = true;
        o0ooo00o2.f20303OooO00o = false;
        OooO00o(oooOo00, o0ooo00o2, oooOoO0);
        this.f14638OooO = this.f14650OooO0oo;
        if (!(z || (OooO00o3 = oooO0Oo.OooO00o(i2, OooO0O02)) == null || OooO00o3 == OooO00o2)) {
            return OooO00o3;
        }
        if (m14858OooO00o(OooO0O02)) {
            for (int i6 = this.OooO0o - 1; i6 >= 0; i6--) {
                View OooO00o4 = this.f14648OooO00o[i6].OooO00o(i2, OooO0O02);
                if (!(OooO00o4 == null || OooO00o4 == OooO00o2)) {
                    return OooO00o4;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.OooO0o; i7++) {
                View OooO00o5 = this.f14648OooO00o[i7].OooO00o(i2, OooO0O02);
                if (!(OooO00o5 == null || OooO00o5 == OooO00o2)) {
                    return OooO00o5;
                }
            }
        }
        boolean z2 = (this.f14649OooO0oO ^ true) == (OooO0O02 == -1);
        if (!z) {
            if (z2) {
                i5 = oooO0Oo.OooO0O0();
            } else {
                i5 = oooO0Oo.OooO0o0();
            }
            View OooO00o6 = OooO00o(i5);
            if (!(OooO00o6 == null || OooO00o6 == OooO00o2)) {
                return OooO00o6;
            }
        }
        if (m14858OooO00o(OooO0O02)) {
            for (int i8 = this.OooO0o - 1; i8 >= 0; i8--) {
                if (i8 != oooO0Oo.OooO0Oo) {
                    if (z2) {
                        i4 = this.f14648OooO00o[i8].OooO0O0();
                    } else {
                        i4 = this.f14648OooO00o[i8].OooO0o0();
                    }
                    View OooO00o7 = OooO00o(i4);
                    if (!(OooO00o7 == null || OooO00o7 == OooO00o2)) {
                        return OooO00o7;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.OooO0o; i9++) {
                if (z2) {
                    i3 = this.f14648OooO00o[i9].OooO0O0();
                } else {
                    i3 = this.f14648OooO00o[i9].OooO0o0();
                }
                View OooO00o8 = OooO00o(i3);
                if (!(OooO00o8 == null || OooO00o8 == OooO00o2)) {
                    return OooO00o8;
                }
            }
        }
        return null;
    }
}
