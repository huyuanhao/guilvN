package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p118pd.sdk.C7120o00OoOO;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    public static final String OooO0O0 = "GridLayoutManager";
    public static final int OooOOO = -1;
    public static final boolean OooOOOO = false;
    public final Rect OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SparseIntArray f14487OooO00o = new SparseIntArray();

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0OO f14488OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f14489OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View[] f14490OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final SparseIntArray f14491OooO0O0 = new SparseIntArray();

    /* renamed from: OooOOO  reason: collision with other field name */
    public boolean f14492OooOOO = false;
    public int OooOOO0 = -1;

    public static final class OooO00o extends OooO0OO {
        @Override // androidx.recyclerview.widget.GridLayoutManager.OooO0OO
        public int OooO0O0(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.OooO0OO
        public int OooO0OO(int i, int i2) {
            return i % i2;
        }
    }

    public static abstract class OooO0OO {
        public final SparseIntArray OooO00o = new SparseIntArray();

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14493OooO00o = false;

        public void OooO00o(boolean z) {
            this.f14493OooO00o = z;
        }

        public abstract int OooO0O0(int i);

        public int OooO0O0(int i, int i2) {
            int OooO0O0 = OooO0O0(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int OooO0O02 = OooO0O0(i5);
                i3 += OooO0O02;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = OooO0O02;
                }
            }
            return i3 + OooO0O0 > i2 ? i4 + 1 : i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int OooO0OO(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.OooO0O0(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f14493OooO00o
                if (r2 == 0) goto L_0x0026
                android.util.SparseIntArray r2 = r5.OooO00o
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0026
                int r2 = r5.OooO00o(r6)
                if (r2 < 0) goto L_0x0026
                android.util.SparseIntArray r3 = r5.OooO00o
                int r3 = r3.get(r2)
                int r4 = r5.OooO0O0(r2)
                int r3 = r3 + r4
                goto L_0x0036
            L_0x0026:
                r2 = 0
                r3 = 0
            L_0x0028:
                if (r2 >= r6) goto L_0x0039
                int r4 = r5.OooO0O0(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x0033
                r3 = 0
                goto L_0x0036
            L_0x0033:
                if (r3 <= r7) goto L_0x0036
                r3 = r4
            L_0x0036:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x0039:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x003d
                return r3
            L_0x003d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.OooO0OO.OooO0OO(int, int):int");
        }

        public void OooO00o() {
            this.OooO00o.clear();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14696OooO00o() {
            return this.f14493OooO00o;
        }

        public int OooO00o(int i, int i2) {
            if (!this.f14493OooO00o) {
                return OooO0OO(i, i2);
            }
            int i3 = this.OooO00o.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int OooO0OO = OooO0OO(i, i2);
            this.OooO00o.put(i, OooO0OO);
            return OooO0OO;
        }

        public int OooO00o(int i) {
            int size = this.OooO00o.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.OooO00o.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= this.OooO00o.size()) {
                return -1;
            }
            return this.OooO00o.keyAt(i4);
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        OooO(RecyclerView.OooOOO0.OooO00o(context, attributeSet, i, i2).OooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    private void OooO() {
        int OooO0O02 = OooO0O0();
        for (int i = 0; i < OooO0O02; i++) {
            OooO0O0 oooO0O0 = (OooO0O0) OooO0O0(i).getLayoutParams();
            int OooO0O03 = oooO0O0.OooO0O0();
            this.f14487OooO00o.put(OooO0O03, oooO0O0.OooO0o0());
            this.f14491OooO0O0.put(OooO0O03, oooO0O0.OooO0Oo());
        }
    }

    private int OooO0OO(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, int i) {
        if (!oooOoO0.m14838OooO0Oo()) {
            return this.f14488OooO00o.OooO0O0(i);
        }
        int i2 = this.f14487OooO00o.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int OooO00o2 = oooOo00.OooO00o(i);
        if (OooO00o2 != -1) {
            return this.f14488OooO00o.OooO0O0(OooO00o2);
        }
        String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i;
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    private void OooOO0() {
        this.f14487OooO00o.clear();
        this.f14491OooO0O0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0
    private void OooOO0O() {
        View[] viewArr = this.f14490OooO00o;
        if (viewArr == null || viewArr.length != this.OooOOO0) {
            this.f14490OooO00o = new View[this.OooOOO0];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.LinearLayoutManager
    private void OooOO0o() {
        int i;
        int i2;
        if (OooOo0O() == 1) {
            i2 = OooOOOO() - OooOO0o();
            i = OooOO0O();
        } else {
            i2 = OooO0OO() - OooO();
            i = OooOOO();
        }
        OooOO0(i2 - i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.LinearLayoutManager
    public int OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (((LinearLayoutManager) this).OooO0o == 1) {
            return this.OooOOO0;
        }
        if (oooOoO0.OooO00o() < 1) {
            return 0;
        }
        return OooO00o(oooOo00, oooOoO0, oooOoO0.OooO00o() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public int OooO0O0(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (((LinearLayoutManager) this).OooO0o == 0) {
            return this.OooOOO0;
        }
        if (oooOoO0.OooO00o() < 1) {
            return 0;
        }
        return OooO00o(oooOo00, oooOoO0, oooOoO0.OooO00o() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO0Oo(RecyclerView recyclerView) {
        this.f14488OooO00o.OooO00o();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void OooO0oO(boolean z) {
        if (!z) {
            super.OooO0oO(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.LinearLayoutManager
    public boolean OooOOO0() {
        return ((LinearLayoutManager) this).f14499OooO00o == null && !this.f14492OooOOO;
    }

    public int OooOo0o() {
        return this.OooOOO0;
    }

    public static class OooO0O0 extends RecyclerView.OooOOO {
        public static final int OooO0OO = -1;
        public int OooO00o = -1;
        public int OooO0O0 = 0;

        public OooO0O0(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public int OooO0Oo() {
            return this.OooO00o;
        }

        public int OooO0o0() {
            return this.OooO0O0;
        }

        public OooO0O0(int i, int i2) {
            super(i, i2);
        }

        public OooO0O0(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public OooO0O0(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public OooO0O0(RecyclerView.OooOOO oooOOO) {
            super(oooOOO);
        }
    }

    private void OooOO0(int i) {
        this.f14489OooO00o = OooO00o(this.f14489OooO00o, this.OooOOO0, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, View view, C7120o00OoOO o00oooo) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof OooO0O0)) {
            super.OooO00o(view, o00oooo);
            return;
        }
        OooO0O0 oooO0O0 = (OooO0O0) layoutParams;
        int OooO00o2 = OooO00o(oooOo00, oooOoO0, oooO0O0.OooO0O0());
        if (((LinearLayoutManager) this).OooO0o == 0) {
            o00oooo.OooO0O0(C7120o00OoOO.OooO0OO.OooO00o(oooO0O0.OooO0Oo(), oooO0O0.OooO0o0(), OooO00o2, 1, this.OooOOO0 > 1 && oooO0O0.OooO0o0() == this.OooOOO0, false));
        } else {
            o00oooo.OooO0O0(C7120o00OoOO.OooO0OO.OooO00o(OooO00o2, 1, oooO0O0.OooO0Oo(), oooO0O0.OooO0o0(), this.OooOOO0 > 1 && oooO0O0.OooO0o0() == this.OooOOO0, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO0O0(RecyclerView recyclerView, int i, int i2) {
        this.f14488OooO00o.OooO00o();
    }

    public void OooO(int i) {
        if (i != this.OooOOO0) {
            this.f14492OooOOO = true;
            if (i >= 1) {
                this.OooOOO0 = i;
                this.f14488OooO00o.OooO00o();
                m14784OooO0O0();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.LinearLayoutManager
    public int OooO0O0(int i, RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        OooOO0o();
        OooOO0O();
        return super.OooO0O0(i, oooOo00, oooOoO0);
    }

    private void OooO0O0(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, LinearLayoutManager.OooO00o oooO00o, int i) {
        boolean z = i == 1;
        int OooO0O02 = OooO0O0(oooOo00, oooOoO0, oooO00o.OooO00o);
        if (z) {
            while (OooO0O02 > 0) {
                int i2 = oooO00o.OooO00o;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    oooO00o.OooO00o = i3;
                    OooO0O02 = OooO0O0(oooOo00, oooOoO0, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int OooO00o2 = oooOoO0.OooO00o() - 1;
        int i4 = oooO00o.OooO00o;
        while (i4 < OooO00o2) {
            int i5 = i4 + 1;
            int OooO0O03 = OooO0O0(oooOo00, oooOoO0, i5);
            if (OooO0O03 <= OooO0O02) {
                break;
            }
            i4 = i5;
            OooO0O02 = OooO0O03;
        }
        oooO00o.OooO00o = i4;
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        OooO(i);
    }

    private int OooO0O0(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, int i) {
        if (!oooOoO0.m14838OooO0Oo()) {
            return this.f14488OooO00o.OooO00o(i, this.OooOOO0);
        }
        int i2 = this.f14491OooO0O0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int OooO00o2 = oooOo00.OooO00o(i);
        if (OooO00o2 != -1) {
            return this.f14488OooO00o.OooO00o(OooO00o2, this.OooOOO0);
        }
        String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i;
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14695OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (oooOoO0.m14838OooO0Oo()) {
            OooO();
        }
        super.m14702OooO00o(oooOo00, oooOoO0);
        OooOO0();
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        OooO(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void OooO00o(RecyclerView.C5077OooOoO0 oooOoO0) {
        super.m14703OooO00o(oooOoO0);
        this.f14492OooOOO = false;
    }

    private void OooO0O0(View view, int i, boolean z) {
        int i2;
        int i3;
        OooO0O0 oooO0O0 = (OooO0O0) view.getLayoutParams();
        Rect rect = ((RecyclerView.OooOOO) oooO0O0).OooO00o;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) oooO0O0).topMargin + ((ViewGroup.MarginLayoutParams) oooO0O0).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) oooO0O0).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0O0).rightMargin;
        int OooO00o2 = OooO00o(oooO0O0.OooO00o, oooO0O0.OooO0O0);
        if (((LinearLayoutManager) this).OooO0o == 1) {
            i2 = RecyclerView.OooOOO0.OooO00o(OooO00o2, i, i5, ((ViewGroup.MarginLayoutParams) oooO0O0).width, false);
            i3 = RecyclerView.OooOOO0.OooO00o(((LinearLayoutManager) this).f14500OooO00o.OooO0oO(), OooO0Oo(), i4, ((ViewGroup.MarginLayoutParams) oooO0O0).height, true);
        } else {
            int OooO00o3 = RecyclerView.OooOOO0.OooO00o(OooO00o2, i, i4, ((ViewGroup.MarginLayoutParams) oooO0O0).height, false);
            int OooO00o4 = RecyclerView.OooOOO0.OooO00o(((LinearLayoutManager) this).f14500OooO00o.OooO0oO(), OooOOOo(), i5, ((ViewGroup.MarginLayoutParams) oooO0O0).width, true);
            i3 = OooO00o3;
            i2 = OooO00o4;
        }
        OooO00o(view, i2, i3, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(RecyclerView recyclerView, int i, int i2) {
        this.f14488OooO00o.OooO00o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f14488OooO00o.OooO00o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f14488OooO00o.OooO00o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: OooO00o  reason: collision with other method in class */
    public RecyclerView.OooOOO m14694OooO00o() {
        if (((LinearLayoutManager) this).OooO0o == 0) {
            return new OooO0O0(-2, -1);
        }
        return new OooO0O0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public RecyclerView.OooOOO OooO00o(Context context, AttributeSet attributeSet) {
        return new OooO0O0(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public RecyclerView.OooOOO OooO00o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new OooO0O0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new OooO0O0(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public boolean OooO00o(RecyclerView.OooOOO oooOOO) {
        return oooOOO instanceof OooO0O0;
    }

    public void OooO00o(OooO0OO oooO0OO) {
        this.f14488OooO00o = oooO0OO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public OooO0OO OooO00o() {
        return this.f14488OooO00o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0
    public void OooO00o(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f14489OooO00o == null) {
            super.OooO00o(rect, i, i2);
        }
        int OooOO0O = OooOO0O() + OooOO0o();
        int OooOOO2 = OooOOO() + OooO();
        if (((LinearLayoutManager) this).OooO0o == 1) {
            i4 = RecyclerView.OooOOO0.OooO00o(i2, rect.height() + OooOOO2, OooO0oO());
            int[] iArr = this.f14489OooO00o;
            i3 = RecyclerView.OooOOO0.OooO00o(i, iArr[iArr.length - 1] + OooOO0O, OooO0oo());
        } else {
            i3 = RecyclerView.OooOOO0.OooO00o(i, rect.width() + OooOO0O, OooO0oo());
            int[] iArr2 = this.f14489OooO00o;
            i4 = RecyclerView.OooOOO0.OooO00o(i2, iArr2[iArr2.length - 1] + OooOOO2, OooO0oO());
        }
        OooO0OO(i3, i4);
    }

    public static int[] OooO00o(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.LinearLayoutManager
    public int OooO00o(int i, int i2) {
        if (((LinearLayoutManager) this).OooO0o != 1 || !m14708OooOOo0()) {
            int[] iArr = this.f14489OooO00o;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f14489OooO00o;
        int i3 = this.OooOOO0;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, LinearLayoutManager.OooO00o oooO00o, int i) {
        super.OooO00o(oooOo00, oooOoO0, oooO00o, i);
        OooOO0o();
        if (oooOoO0.OooO00o() > 0 && !oooOoO0.m14838OooO0Oo()) {
            OooO0O0(oooOo00, oooOoO0, oooO00o, i);
        }
        OooOO0O();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.LinearLayoutManager
    public int OooO00o(int i, RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0) {
        OooOO0o();
        OooOO0O();
        return super.OooO00o(i, oooOo00, oooOoO0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, int i, int i2, int i3) {
        OooO0o0();
        int OooO0o = ((LinearLayoutManager) this).f14500OooO00o.OooO0o();
        int OooO0O02 = ((LinearLayoutManager) this).f14500OooO00o.OooO0O0();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View OooO0O03 = OooO0O0(i);
            int OooOO0 = OooOO0(OooO0O03);
            if (OooOO0 >= 0 && OooOO0 < i3 && OooO0O0(oooOo00, oooOoO0, OooOO0) == 0) {
                if (((RecyclerView.OooOOO) OooO0O03.getLayoutParams()).m14764OooO0O0()) {
                    if (view2 == null) {
                        view2 = OooO0O03;
                    }
                } else if (((LinearLayoutManager) this).f14500OooO00o.OooO0Oo(OooO0O03) < OooO0O02 && ((LinearLayoutManager) this).f14500OooO00o.OooO00o(OooO0O03) >= OooO0o) {
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

    private int OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, int i) {
        if (!oooOoO0.m14838OooO0Oo()) {
            return this.f14488OooO00o.OooO0O0(i, this.OooOOO0);
        }
        int OooO00o2 = oooOo00.OooO00o(i);
        if (OooO00o2 != -1) {
            return this.f14488OooO00o.OooO0O0(OooO00o2, this.OooOOO0);
        }
        String str = "Cannot find span size for pre layout position. " + i;
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void OooO00o(RecyclerView.C5077OooOoO0 oooOoO0, LinearLayoutManager.OooO0OO oooO0OO, RecyclerView.OooOOO0.OooO0OO oooO0OO2) {
        int i = this.OooOOO0;
        for (int i2 = 0; i2 < this.OooOOO0 && oooO0OO.OooO00o(oooOoO0) && i > 0; i2++) {
            int i3 = oooO0OO.OooO0OO;
            oooO0OO2.OooO00o(i3, Math.max(0, oooO0OO.OooO0o));
            i -= this.f14488OooO00o.OooO0O0(i3);
            oooO0OO.OooO0OO += oooO0OO.OooO0Oo;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, LinearLayoutManager.OooO0OO oooO0OO, LinearLayoutManager.OooO0O0 oooO0O0) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        View OooO00o2;
        int OooO0o0 = ((LinearLayoutManager) this).f14500OooO00o.OooO0o0();
        boolean z2 = OooO0o0 != 1073741824;
        int i11 = OooO0O0() > 0 ? this.f14489OooO00o[this.OooOOO0] : 0;
        if (z2) {
            OooOO0o();
        }
        boolean z3 = oooO0OO.OooO0Oo == 1;
        int i12 = this.OooOOO0;
        if (!z3) {
            i12 = OooO0O0(oooOo00, oooOoO0, oooO0OO.OooO0OO) + OooO0OO(oooOo00, oooOoO0, oooO0OO.OooO0OO);
        }
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.OooOOO0 && oooO0OO.OooO00o(oooOoO0) && i12 > 0) {
            int i15 = oooO0OO.OooO0OO;
            int OooO0OO2 = OooO0OO(oooOo00, oooOoO0, i15);
            if (OooO0OO2 <= this.OooOOO0) {
                i12 -= OooO0OO2;
                if (i12 < 0 || (OooO00o2 = oooO0OO.OooO00o(oooOo00)) == null) {
                    break;
                }
                i13 += OooO0OO2;
                this.f14490OooO00o[i14] = OooO00o2;
                i14++;
            } else {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + OooO0OO2 + " spans but GridLayoutManager has only " + this.OooOOO0 + " spans.");
            }
        }
        if (i14 == 0) {
            oooO0O0.f14509OooO00o = true;
            return;
        }
        float f = 0.0f;
        OooO00o(oooOo00, oooOoO0, i14, i13, z3);
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.f14490OooO00o[i17];
            if (oooO0OO.f14511OooO00o != null) {
                z = false;
                if (z3) {
                    m14775OooO00o(view);
                } else {
                    m14776OooO00o(view, 0);
                }
            } else if (z3) {
                m14786OooO0O0(view);
                z = false;
            } else {
                z = false;
                OooO0O0(view, 0);
            }
            OooO00o(view, this.OooO00o);
            OooO0O0(view, OooO0o0, z);
            int OooO0O02 = ((LinearLayoutManager) this).f14500OooO00o.OooO0O0(view);
            if (OooO0O02 > i16) {
                i16 = OooO0O02;
            }
            float OooO0OO3 = (((float) ((LinearLayoutManager) this).f14500OooO00o.OooO0OO(view)) * 1.0f) / ((float) ((OooO0O0) view.getLayoutParams()).OooO0O0);
            if (OooO0OO3 > f) {
                f = OooO0OO3;
            }
        }
        if (z2) {
            OooO00o(f, i11);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f14490OooO00o[i18];
                OooO0O0(view2, 1073741824, true);
                int OooO0O03 = ((LinearLayoutManager) this).f14500OooO00o.OooO0O0(view2);
                if (OooO0O03 > i16) {
                    i16 = OooO0O03;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f14490OooO00o[i19];
            if (((LinearLayoutManager) this).f14500OooO00o.OooO0O0(view3) != i16) {
                OooO0O0 oooO0O02 = (OooO0O0) view3.getLayoutParams();
                Rect rect = ((RecyclerView.OooOOO) oooO0O02).OooO00o;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) oooO0O02).topMargin + ((ViewGroup.MarginLayoutParams) oooO0O02).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) oooO0O02).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0O02).rightMargin;
                int OooO00o3 = OooO00o(oooO0O02.OooO00o, oooO0O02.OooO0O0);
                if (((LinearLayoutManager) this).OooO0o == 1) {
                    i10 = RecyclerView.OooOOO0.OooO00o(OooO00o3, 1073741824, i21, ((ViewGroup.MarginLayoutParams) oooO0O02).width, false);
                    i9 = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    i9 = RecyclerView.OooOOO0.OooO00o(OooO00o3, 1073741824, i20, ((ViewGroup.MarginLayoutParams) oooO0O02).height, false);
                    i10 = makeMeasureSpec;
                }
                OooO00o(view3, i10, i9, true);
            }
        }
        int i22 = 0;
        oooO0O0.OooO00o = i16;
        if (((LinearLayoutManager) this).OooO0o != 1) {
            if (oooO0OO.OooO0o0 == -1) {
                int i23 = oooO0OO.f14510OooO00o;
                i3 = i23 - i16;
                i2 = i23;
            } else {
                int i24 = oooO0OO.f14510OooO00o;
                i2 = i24 + i16;
                i3 = i24;
            }
            i4 = 0;
            i = 0;
        } else if (oooO0OO.OooO0o0 == -1) {
            int i25 = oooO0OO.f14510OooO00o;
            int i26 = i25 - i16;
            i3 = 0;
            i2 = 0;
            i = i26;
            i4 = i25;
        } else {
            i = oooO0OO.f14510OooO00o;
            i4 = i + i16;
            i3 = 0;
            i2 = 0;
        }
        while (i22 < i14) {
            View view4 = this.f14490OooO00o[i22];
            OooO0O0 oooO0O03 = (OooO0O0) view4.getLayoutParams();
            if (((LinearLayoutManager) this).OooO0o == 1) {
                if (m14708OooOOo0()) {
                    int OooOO0O = OooOO0O() + this.f14489OooO00o[this.OooOOO0 - oooO0O03.OooO00o];
                    i8 = i4;
                    i6 = OooOO0O;
                    i7 = OooOO0O - ((LinearLayoutManager) this).f14500OooO00o.OooO0OO(view4);
                } else {
                    int OooOO0O2 = OooOO0O() + this.f14489OooO00o[oooO0O03.OooO00o];
                    i8 = i4;
                    i7 = OooOO0O2;
                    i6 = ((LinearLayoutManager) this).f14500OooO00o.OooO0OO(view4) + OooOO0O2;
                }
                i5 = i;
            } else {
                int OooOOO2 = OooOOO() + this.f14489OooO00o[oooO0O03.OooO00o];
                i5 = OooOOO2;
                i7 = i3;
                i6 = i2;
                i8 = ((LinearLayoutManager) this).f14500OooO00o.OooO0OO(view4) + OooOOO2;
            }
            OooO0O0(view4, i7, i5, i6, i8);
            if (oooO0O03.m14764OooO0O0() || oooO0O03.m14763OooO00o()) {
                oooO0O0.OooO0O0 = true;
            }
            oooO0O0.OooO0OO |= view4.hasFocusable();
            i22++;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            i = i5;
        }
        Arrays.fill(this.f14490OooO00o, (Object) null);
    }

    private void OooO00o(float f, int i) {
        OooOO0(Math.max(Math.round(f * ((float) this.OooOOO0)), i));
    }

    private void OooO00o(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.OooOOO oooOOO = (RecyclerView.OooOOO) view.getLayoutParams();
        if (z) {
            z2 = OooO0O0(view, i, i2, oooOOO);
        } else {
            z2 = OooO00o(view, i, i2, oooOOO);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    private void OooO00o(RecyclerView.OooOo00 oooOo00, RecyclerView.C5077OooOoO0 oooOoO0, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = i - 1;
            i3 = -1;
        }
        while (i4 != i6) {
            View view = this.f14490OooO00o[i4];
            OooO0O0 oooO0O0 = (OooO0O0) view.getLayoutParams();
            int OooO0OO2 = OooO0OO(oooOo00, oooOoO0, OooOO0(view));
            oooO0O0.OooO0O0 = OooO0OO2;
            oooO0O0.OooO00o = i5;
            i5 += OooO0OO2;
            i4 += i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0, androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View OooO00o(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.OooOo00 r26, androidx.recyclerview.widget.RecyclerView.C5077OooOoO0 r27) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.OooO00o(android.view.View, int, androidx.recyclerview.widget.RecyclerView$OooOo00, androidx.recyclerview.widget.RecyclerView$OooOoO0):android.view.View");
    }
}
