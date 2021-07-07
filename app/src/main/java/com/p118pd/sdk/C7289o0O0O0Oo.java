package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.o0O0O0Oo  reason: case insensitive filesystem */
public class C7289o0O0O0Oo {
    public static final boolean OooO00o = false;
    @VisibleForTesting

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6971o0000oO0<RecyclerView.AbstractC5079OooOoo0, OooO00o> f19960OooO00o = new C6971o0000oO0<>();
    @VisibleForTesting

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6930o000<RecyclerView.AbstractC5079OooOoo0> f19961OooO00o = new C6930o000<>();

    /* renamed from: com.pd.sdk.o0O0O0Oo$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0);

        void OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO, @Nullable RecyclerView.ItemAnimator.OooO0OO oooO0OO2);

        void OooO0O0(RecyclerView.AbstractC5079OooOoo0 oooOoo0, @Nullable RecyclerView.ItemAnimator.OooO0OO oooO0OO, RecyclerView.ItemAnimator.OooO0OO oooO0OO2);

        void OooO0OO(RecyclerView.AbstractC5079OooOoo0 oooOoo0, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO2);
    }

    public void OooO00o() {
        this.f19960OooO00o.clear();
        this.f19961OooO00o.OooO0O0();
    }

    @Nullable
    public RecyclerView.ItemAnimator.OooO0OO OooO0O0(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        return OooO00o(oooOoo0, 4);
    }

    public void OooO0OO(RecyclerView.AbstractC5079OooOoo0 oooOoo0, RecyclerView.ItemAnimator.OooO0OO oooO0OO) {
        OooO00o oooO00o = this.f19960OooO00o.get(oooOoo0);
        if (oooO00o == null) {
            oooO00o = OooO00o.OooO00o();
            this.f19960OooO00o.put(oooOoo0, oooO00o);
        }
        oooO00o.f19963OooO00o = oooO0OO;
        oooO00o.f19962OooO00o |= 4;
    }

    public void OooO0Oo(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        int OooO00o2 = this.f19961OooO00o.OooO00o() - 1;
        while (true) {
            if (OooO00o2 < 0) {
                break;
            } else if (oooOoo0 == this.f19961OooO00o.m18083OooO00o(OooO00o2)) {
                this.f19961OooO00o.m18085OooO00o(OooO00o2);
                break;
            } else {
                OooO00o2--;
            }
        }
        OooO00o remove = this.f19960OooO00o.remove(oooOoo0);
        if (remove != null) {
            OooO00o.OooO00o(remove);
        }
    }

    /* renamed from: com.pd.sdk.o0O0O0Oo$OooO00o */
    public static class OooO00o {
        public static Pools.OooO00o<OooO00o> OooO00o = new Pools.SimplePool(20);
        public static final int OooO0O0 = 1;
        public static final int OooO0OO = 2;
        public static final int OooO0Oo = 4;
        public static final int OooO0o = 3;
        public static final int OooO0o0 = 8;
        public static final int OooO0oO = 12;
        public static final int OooO0oo = 14;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f19962OooO00o;
        @Nullable

        /* renamed from: OooO00o  reason: collision with other field name */
        public RecyclerView.ItemAnimator.OooO0OO f19963OooO00o;
        @Nullable

        /* renamed from: OooO0O0  reason: collision with other field name */
        public RecyclerView.ItemAnimator.OooO0OO f19964OooO0O0;

        public static OooO00o OooO00o() {
            OooO00o acquire = OooO00o.acquire();
            return acquire == null ? new OooO00o() : acquire;
        }

        public static void OooO00o(OooO00o oooO00o) {
            oooO00o.f19962OooO00o = 0;
            oooO00o.f19963OooO00o = null;
            oooO00o.f19964OooO0O0 = null;
            OooO00o.release(oooO00o);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public static void m18794OooO00o() {
            do {
            } while (OooO00o.acquire() != null);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18793OooO0O0(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooO00o oooO00o = this.f19960OooO00o.get(oooOoo0);
        return (oooO00o == null || (oooO00o.f19962OooO00o & 4) == 0) ? false : true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18791OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooO00o oooO00o = this.f19960OooO00o.get(oooOoo0);
        if (oooO00o == null || (oooO00o.f19962OooO00o & 1) == 0) {
            return false;
        }
        return true;
    }

    public void OooO0O0(RecyclerView.AbstractC5079OooOoo0 oooOoo0, RecyclerView.ItemAnimator.OooO0OO oooO0OO) {
        OooO00o oooO00o = this.f19960OooO00o.get(oooOoo0);
        if (oooO00o == null) {
            oooO00o = OooO00o.OooO00o();
            this.f19960OooO00o.put(oooOoo0, oooO00o);
        }
        oooO00o.f19964OooO0O0 = oooO0OO;
        oooO00o.f19962OooO00o |= 8;
    }

    @Nullable
    public RecyclerView.ItemAnimator.OooO0OO OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        return OooO00o(oooOoo0, 8);
    }

    private RecyclerView.ItemAnimator.OooO0OO OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i) {
        OooO00o OooO0OO;
        RecyclerView.ItemAnimator.OooO0OO oooO0OO;
        int OooO00o2 = this.f19960OooO00o.OooO00o(oooOoo0);
        if (OooO00o2 >= 0 && (OooO0OO = this.f19960OooO00o.OooO0OO(OooO00o2)) != null) {
            int i2 = OooO0OO.f19962OooO00o;
            if ((i2 & i) != 0) {
                OooO0OO.f19962OooO00o = (i ^ -1) & i2;
                if (i == 4) {
                    oooO0OO = OooO0OO.f19963OooO00o;
                } else if (i == 8) {
                    oooO0OO = OooO0OO.f19964OooO0O0;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((OooO0OO.f19962OooO00o & 12) == 0) {
                    this.f19960OooO00o.m18207OooO0O0(OooO00o2);
                    OooO00o.OooO00o(OooO0OO);
                }
                return oooO0OO;
            }
        }
        return null;
    }

    public void OooO0OO(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooO00o oooO00o = this.f19960OooO00o.get(oooOoo0);
        if (oooO00o != null) {
            oooO00o.f19962OooO00o &= -2;
        }
    }

    public void OooO0O0() {
        OooO00o.m18794OooO00o();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18792OooO0O0(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooO0OO(oooOoo0);
    }

    public void OooO00o(long j, RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        this.f19961OooO00o.OooO0O0(j, oooOoo0);
    }

    public void OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0, RecyclerView.ItemAnimator.OooO0OO oooO0OO) {
        OooO00o oooO00o = this.f19960OooO00o.get(oooOoo0);
        if (oooO00o == null) {
            oooO00o = OooO00o.OooO00o();
            this.f19960OooO00o.put(oooOoo0, oooO00o);
        }
        oooO00o.f19962OooO00o |= 2;
        oooO00o.f19963OooO00o = oooO0OO;
    }

    public RecyclerView.AbstractC5079OooOoo0 OooO00o(long j) {
        return this.f19961OooO00o.m18084OooO00o(j);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18790OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooO00o oooO00o = this.f19960OooO00o.get(oooOoo0);
        if (oooO00o == null) {
            oooO00o = OooO00o.OooO00o();
            this.f19960OooO00o.put(oooOoo0, oooO00o);
        }
        oooO00o.f19962OooO00o |= 1;
    }

    public void OooO00o(OooO0O0 oooO0O0) {
        for (int size = this.f19960OooO00o.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC5079OooOoo0 OooO00o2 = this.f19960OooO00o.OooO00o(size);
            OooO00o OooO0O02 = this.f19960OooO00o.m18207OooO0O0(size);
            int i = OooO0O02.f19962OooO00o;
            if ((i & 3) == 3) {
                oooO0O0.OooO00o(OooO00o2);
            } else if ((i & 1) != 0) {
                RecyclerView.ItemAnimator.OooO0OO oooO0OO = OooO0O02.f19963OooO00o;
                if (oooO0OO == null) {
                    oooO0O0.OooO00o(OooO00o2);
                } else {
                    oooO0O0.OooO00o(OooO00o2, oooO0OO, OooO0O02.f19964OooO0O0);
                }
            } else if ((i & 14) == 14) {
                oooO0O0.OooO0O0(OooO00o2, OooO0O02.f19963OooO00o, OooO0O02.f19964OooO0O0);
            } else if ((i & 12) == 12) {
                oooO0O0.OooO0OO(OooO00o2, OooO0O02.f19963OooO00o, OooO0O02.f19964OooO0O0);
            } else if ((i & 4) != 0) {
                oooO0O0.OooO00o(OooO00o2, OooO0O02.f19963OooO00o, null);
            } else if ((i & 8) != 0) {
                oooO0O0.OooO0O0(OooO00o2, OooO0O02.f19963OooO00o, OooO0O02.f19964OooO0O0);
            }
            OooO00o.OooO00o(OooO0O02);
        }
    }
}
