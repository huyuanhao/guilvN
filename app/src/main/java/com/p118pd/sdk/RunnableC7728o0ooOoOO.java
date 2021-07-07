package com.p118pd.sdk;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.o0ooOoOO  reason: case insensitive filesystem */
public final class RunnableC7728o0ooOoOO implements Runnable {
    public static final ThreadLocal<RunnableC7728o0ooOoOO> OooO00o = new ThreadLocal<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Comparator<OooO0OO> f20716OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f20717OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<RecyclerView> f20718OooO00o = new ArrayList<>();
    public long OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public ArrayList<OooO0OO> f20719OooO0O0 = new ArrayList<>();

    /* renamed from: com.pd.sdk.o0ooOoOO$OooO00o */
    public static class OooO00o implements Comparator<OooO0OO> {
        /* renamed from: OooO00o */
        public int compare(OooO0OO oooO0OO, OooO0OO oooO0OO2) {
            if ((oooO0OO.f20721OooO00o == null) == (oooO0OO2.f20721OooO00o == null)) {
                boolean z = oooO0OO.f20722OooO00o;
                if (z == oooO0OO2.f20722OooO00o) {
                    int i = oooO0OO2.OooO00o - oooO0OO.OooO00o;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = oooO0OO.OooO0O0 - oooO0OO2.OooO0O0;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                } else if (z) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (oooO0OO.f20721OooO00o == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: com.pd.sdk.o0ooOoOO$OooO0OO */
    public static class OooO0OO {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public RecyclerView f20721OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f20722OooO00o;
        public int OooO0O0;
        public int OooO0OO;

        public void OooO00o() {
            this.f20722OooO00o = false;
            this.OooO00o = 0;
            this.OooO0O0 = 0;
            this.f20721OooO00o = null;
            this.OooO0OO = 0;
        }
    }

    public void OooO00o(RecyclerView recyclerView) {
        this.f20718OooO00o.add(recyclerView);
    }

    public void OooO0O0(RecyclerView recyclerView) {
        this.f20718OooO00o.remove(recyclerView);
    }

    public void run() {
        try {
            C7067o00O0o00.OooO00o(RecyclerView.o0O0O00);
            if (!this.f20718OooO00o.isEmpty()) {
                int size = this.f20718OooO00o.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f20718OooO00o.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    OooO00o(TimeUnit.MILLISECONDS.toNanos(j) + this.OooO0O0);
                    this.f20717OooO00o = 0;
                    C7067o00O0o00.OooO00o();
                }
            }
        } finally {
            this.f20717OooO00o = 0;
            C7067o00O0o00.OooO00o();
        }
    }

    private void OooO0O0(long j) {
        for (int i = 0; i < this.f20719OooO0O0.size(); i++) {
            OooO0OO oooO0OO = this.f20719OooO0O0.get(i);
            if (oooO0OO.f20721OooO00o != null) {
                OooO00o(oooO0OO, j);
                oooO0OO.OooO00o();
            } else {
                return;
            }
        }
    }

    public void OooO00o(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f20717OooO00o == 0) {
            this.f20717OooO00o = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f14543OooO00o.OooO0O0(i, i2);
    }

    private void OooO00o() {
        OooO0OO oooO0OO;
        int size = this.f20718OooO00o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f20718OooO00o.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f14543OooO00o.OooO00o(recyclerView, false);
                i += recyclerView.f14543OooO00o.OooO0OO;
            }
        }
        this.f20719OooO0O0.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f20718OooO00o.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                OooO0O0 oooO0O0 = recyclerView2.f14543OooO00o;
                int abs = Math.abs(oooO0O0.OooO00o) + Math.abs(oooO0O0.OooO0O0);
                for (int i5 = 0; i5 < oooO0O0.OooO0OO * 2; i5 += 2) {
                    if (i3 >= this.f20719OooO0O0.size()) {
                        oooO0OO = new OooO0OO();
                        this.f20719OooO0O0.add(oooO0OO);
                    } else {
                        oooO0OO = this.f20719OooO0O0.get(i3);
                    }
                    int i6 = oooO0O0.f20720OooO00o[i5 + 1];
                    oooO0OO.f20722OooO00o = i6 <= abs;
                    oooO0OO.OooO00o = abs;
                    oooO0OO.OooO0O0 = i6;
                    oooO0OO.f20721OooO00o = recyclerView2;
                    oooO0OO.OooO0OO = oooO0O0.f20720OooO00o[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f20719OooO0O0, f20716OooO00o);
    }

    /* renamed from: com.pd.sdk.o0ooOoOO$OooO0O0 */
    public static class OooO0O0 implements RecyclerView.OooOOO0.OooO0OO {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f20720OooO00o;
        public int OooO0O0;
        public int OooO0OO;

        public void OooO00o(RecyclerView recyclerView, boolean z) {
            this.OooO0OO = 0;
            int[] iArr = this.f20720OooO00o;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.OooOOO0 oooOOO0 = recyclerView.f14527OooO00o;
            if (recyclerView.f14525OooO00o != null && oooOOO0 != null && oooOOO0.m14768OooO()) {
                if (z) {
                    if (!recyclerView.f14538OooO00o.m18076OooO00o()) {
                        oooOOO0.OooO00o(recyclerView.f14525OooO00o.OooO00o(), this);
                    }
                } else if (!recyclerView.m14734OooO0O0()) {
                    oooOOO0.OooO00o(this.OooO00o, this.OooO0O0, recyclerView.f14534OooO00o, this);
                }
                int i = this.OooO0OO;
                if (i > oooOOO0.OooO00o) {
                    oooOOO0.OooO00o = i;
                    oooOOO0.OooO0o = z;
                    recyclerView.f14531OooO00o.OooO0oO();
                }
            }
        }

        public void OooO0O0(int i, int i2) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO0.OooO0OO
        public void OooO00o(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.OooO0OO * 2;
                int[] iArr = this.f20720OooO00o;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f20720OooO00o = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f20720OooO00o = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f20720OooO00o;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.OooO0OO++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public boolean OooO00o(int i) {
            if (this.f20720OooO00o != null) {
                int i2 = this.OooO0OO * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f20720OooO00o[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void OooO00o() {
            int[] iArr = this.f20720OooO00o;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.OooO0OO = 0;
        }
    }

    public static boolean OooO00o(RecyclerView recyclerView, int i) {
        int OooO0O02 = recyclerView.f14542OooO00o.OooO0O0();
        for (int i2 = 0; i2 < OooO0O02; i2++) {
            RecyclerView.AbstractC5079OooOoo0 OooO0OO2 = RecyclerView.OooO0OO(recyclerView.f14542OooO00o.OooO0OO(i2));
            if (OooO0OO2.OooO00o == i && !OooO0OO2.m14851OooO0Oo()) {
                return true;
            }
        }
        return false;
    }

    private RecyclerView.AbstractC5079OooOoo0 OooO00o(RecyclerView recyclerView, int i, long j) {
        if (OooO00o(recyclerView, i)) {
            return null;
        }
        RecyclerView.OooOo00 oooOo00 = recyclerView.f14531OooO00o;
        try {
            recyclerView.OooOOOo();
            RecyclerView.AbstractC5079OooOoo0 OooO00o2 = oooOo00.OooO00o(i, false, j);
            if (OooO00o2 != null) {
                if (!OooO00o2.m14849OooO0OO() || OooO00o2.m14851OooO0Oo()) {
                    oooOo00.OooO00o(OooO00o2, false);
                } else {
                    oooOo00.OooO0O0(OooO00o2.f14626OooO00o);
                }
            }
            return OooO00o2;
        } finally {
            recyclerView.OooO00o(false);
        }
    }

    private void OooO00o(@Nullable RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.OooOO0O && recyclerView.f14542OooO00o.OooO0O0() != 0) {
                recyclerView.OooOOoo();
            }
            OooO0O0 oooO0O0 = recyclerView.f14543OooO00o;
            oooO0O0.OooO00o(recyclerView, true);
            if (oooO0O0.OooO0OO != 0) {
                try {
                    C7067o00O0o00.OooO00o(RecyclerView.o000OOo);
                    recyclerView.f14534OooO00o.OooO00o(recyclerView.f14525OooO00o);
                    for (int i = 0; i < oooO0O0.OooO0OO * 2; i += 2) {
                        OooO00o(recyclerView, oooO0O0.f20720OooO00o[i], j);
                    }
                } finally {
                    C7067o00O0o00.OooO00o();
                }
            }
        }
    }

    private void OooO00o(OooO0OO oooO0OO, long j) {
        RecyclerView.AbstractC5079OooOoo0 OooO00o2 = OooO00o(oooO0OO.f20721OooO00o, oooO0OO.OooO0OO, oooO0OO.f20722OooO00o ? Long.MAX_VALUE : j);
        if (OooO00o2 != null && OooO00o2.f14630OooO00o != null && OooO00o2.m14849OooO0OO() && !OooO00o2.m14851OooO0Oo()) {
            OooO00o(OooO00o2.f14630OooO00o.get(), j);
        }
    }

    public void OooO00o(long j) {
        OooO00o();
        OooO0O0(j);
    }
}
