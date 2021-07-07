package com.p118pd.sdk;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.o0OoOoOo  reason: case insensitive filesystem */
public class C7509o0OoOoOo {
    public static final String OooO00o = "ChildrenHelper";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f20352OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f20353OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f20354OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<View> f20355OooO00o = new ArrayList();

    /* renamed from: com.pd.sdk.o0OoOoOo$OooO0O0 */
    public interface OooO0O0 {
        int OooO00o(View view);

        View OooO00o(int i);

        /* renamed from: OooO00o  reason: collision with other method in class */
        RecyclerView.AbstractC5079OooOoo0 m19150OooO00o(View view);

        void OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        void m19151OooO00o(int i);

        /* renamed from: OooO00o  reason: collision with other method in class */
        void m19152OooO00o(View view);

        void OooO00o(View view, int i);

        void OooO00o(View view, int i, ViewGroup.LayoutParams layoutParams);

        void OooO0O0(int i);

        void OooO0O0(View view);

        int getChildCount();
    }

    public C7509o0OoOoOo(OooO0O0 oooO0O0) {
        this.f20354OooO00o = oooO0O0;
    }

    private boolean OooO0OO(View view) {
        if (!this.f20355OooO00o.remove(view)) {
            return false;
        }
        this.f20354OooO00o.m19152OooO00o(view);
        return true;
    }

    private void OooO0Oo(View view) {
        this.f20355OooO00o.add(view);
        this.f20354OooO00o.OooO0O0(view);
    }

    public void OooO00o(View view, boolean z) {
        OooO00o(view, -1, z);
    }

    public void OooO0O0(View view) {
        int OooO00o2 = this.f20354OooO00o.OooO00o(view);
        if (OooO00o2 >= 0) {
            if (this.f20353OooO00o.m19149OooO0O0(OooO00o2)) {
                OooO0OO(view);
            }
            this.f20354OooO00o.OooO0O0(OooO00o2);
        }
    }

    public String toString() {
        return this.f20353OooO00o.toString() + ", hidden list:" + this.f20355OooO00o.size();
    }

    public void OooO00o(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f20354OooO00o.getChildCount();
        } else {
            i2 = OooO00o(i);
        }
        this.f20353OooO00o.OooO00o(i2, z);
        if (z) {
            OooO0Oo(view);
        }
        this.f20354OooO00o.OooO00o(view, i2);
    }

    /* renamed from: com.pd.sdk.o0OoOoOo$OooO00o */
    public static class OooO00o {
        public static final int OooO00o = 64;
        public static final long OooO0O0 = Long.MIN_VALUE;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f20356OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO00o f20357OooO00o;

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19147OooO00o(int i) {
            if (i >= 64) {
                OooO00o oooO00o = this.f20357OooO00o;
                if (oooO00o != null) {
                    oooO00o.m19147OooO00o(i - 64);
                    return;
                }
                return;
            }
            this.f20356OooO00o &= (1 << i) ^ -1;
        }

        public void OooO0O0(int i) {
            if (i >= 64) {
                OooO0O0();
                this.f20357OooO00o.OooO0O0(i - 64);
                return;
            }
            this.f20356OooO00o |= 1 << i;
        }

        public String toString() {
            if (this.f20357OooO00o == null) {
                return Long.toBinaryString(this.f20356OooO00o);
            }
            return this.f20357OooO00o.toString() + "xx" + Long.toBinaryString(this.f20356OooO00o);
        }

        private void OooO0O0() {
            if (this.f20357OooO00o == null) {
                this.f20357OooO00o = new OooO00o();
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m19148OooO00o(int i) {
            if (i < 64) {
                return (this.f20356OooO00o & (1 << i)) != 0;
            }
            OooO0O0();
            return this.f20357OooO00o.m19148OooO00o(i - 64);
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m19149OooO0O0(int i) {
            if (i >= 64) {
                OooO0O0();
                return this.f20357OooO00o.m19149OooO0O0(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f20356OooO00o & j) != 0;
            long j2 = this.f20356OooO00o & (j ^ -1);
            this.f20356OooO00o = j2;
            long j3 = j - 1;
            this.f20356OooO00o = (j2 & j3) | Long.rotateRight((j3 ^ -1) & j2, 1);
            OooO00o oooO00o = this.f20357OooO00o;
            if (oooO00o != null) {
                if (oooO00o.m19148OooO00o(0)) {
                    OooO0O0(63);
                }
                this.f20357OooO00o.m19149OooO0O0(0);
            }
            return z;
        }

        public void OooO00o() {
            this.f20356OooO00o = 0;
            OooO00o oooO00o = this.f20357OooO00o;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
        }

        public void OooO00o(int i, boolean z) {
            if (i >= 64) {
                OooO0O0();
                this.f20357OooO00o.OooO00o(i - 64, z);
                return;
            }
            boolean z2 = (this.f20356OooO00o & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f20356OooO00o;
            this.f20356OooO00o = ((j2 & (j ^ -1)) << 1) | (j2 & j);
            if (z) {
                OooO0O0(i);
            } else {
                m19147OooO00o(i);
            }
            if (z2 || this.f20357OooO00o != null) {
                OooO0O0();
                this.f20357OooO00o.OooO00o(0, z2);
            }
        }

        public int OooO00o(int i) {
            OooO00o oooO00o = this.f20357OooO00o;
            if (oooO00o == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f20356OooO00o);
                }
                return Long.bitCount(this.f20356OooO00o & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f20356OooO00o & ((1 << i) - 1));
            } else {
                return oooO00o.OooO00o(i - 64) + Long.bitCount(this.f20356OooO00o);
            }
        }
    }

    public View OooO0OO(int i) {
        return this.f20354OooO00o.OooO00o(i);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m19146OooO0OO(View view) {
        int OooO00o2 = this.f20354OooO00o.OooO00o(view);
        if (OooO00o2 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f20353OooO00o.m19148OooO00o(OooO00o2)) {
            this.f20353OooO00o.m19147OooO00o(OooO00o2);
            OooO0OO(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19144OooO0O0(int i) {
        int OooO00o2 = OooO00o(i);
        View OooO00o3 = this.f20354OooO00o.OooO00o(OooO00o2);
        if (OooO00o3 != null) {
            if (this.f20353OooO00o.m19149OooO0O0(OooO00o2)) {
                OooO0OO(OooO00o3);
            }
            this.f20354OooO00o.OooO0O0(OooO00o2);
        }
    }

    private int OooO00o(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f20354OooO00o.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int OooO00o2 = i - (i2 - this.f20353OooO00o.OooO00o(i2));
            if (OooO00o2 == 0) {
                while (this.f20353OooO00o.m19148OooO00o(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += OooO00o2;
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19140OooO00o() {
        this.f20353OooO00o.OooO00o();
        for (int size = this.f20355OooO00o.size() - 1; size >= 0; size--) {
            this.f20354OooO00o.m19152OooO00o(this.f20355OooO00o.get(size));
            this.f20355OooO00o.remove(size);
        }
        this.f20354OooO00o.OooO00o();
    }

    public View OooO0O0(int i) {
        return this.f20354OooO00o.OooO00o(OooO00o(i));
    }

    public int OooO0O0() {
        return this.f20354OooO00o.getChildCount();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19145OooO0O0(View view) {
        int OooO00o2 = this.f20354OooO00o.OooO00o(view);
        if (OooO00o2 == -1) {
            OooO0OO(view);
            return true;
        } else if (!this.f20353OooO00o.m19148OooO00o(OooO00o2)) {
            return false;
        } else {
            this.f20353OooO00o.m19149OooO0O0(OooO00o2);
            OooO0OO(view);
            this.f20354OooO00o.OooO0O0(OooO00o2);
            return true;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m19139OooO00o(int i) {
        int size = this.f20355OooO00o.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f20355OooO00o.get(i2);
            RecyclerView.AbstractC5079OooOoo0 OooO00o2 = this.f20354OooO00o.m19150OooO00o(view);
            if (!(OooO00o2.OooO0OO() != i || OooO00o2.m14851OooO0Oo() || OooO00o2.m14852OooO0o())) {
                return view;
            }
        }
        return null;
    }

    public void OooO00o(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f20354OooO00o.getChildCount();
        } else {
            i2 = OooO00o(i);
        }
        this.f20353OooO00o.OooO00o(i2, z);
        if (z) {
            OooO0Oo(view);
        }
        this.f20354OooO00o.OooO00o(view, i2, layoutParams);
    }

    public int OooO00o() {
        return this.f20354OooO00o.getChildCount() - this.f20355OooO00o.size();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19141OooO00o(int i) {
        int OooO00o2 = OooO00o(i);
        this.f20353OooO00o.m19149OooO0O0(OooO00o2);
        this.f20354OooO00o.m19151OooO00o(OooO00o2);
    }

    public int OooO00o(View view) {
        int OooO00o2 = this.f20354OooO00o.OooO00o(view);
        if (OooO00o2 != -1 && !this.f20353OooO00o.m19148OooO00o(OooO00o2)) {
            return OooO00o2 - this.f20353OooO00o.OooO00o(OooO00o2);
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19143OooO00o(View view) {
        return this.f20355OooO00o.contains(view);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19142OooO00o(View view) {
        int OooO00o2 = this.f20354OooO00o.OooO00o(view);
        if (OooO00o2 >= 0) {
            this.f20353OooO00o.OooO0O0(OooO00o2);
            OooO0Oo(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }
}
