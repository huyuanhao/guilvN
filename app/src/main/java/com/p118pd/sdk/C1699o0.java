package com.p118pd.sdk;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;
import com.p118pd.sdk.C7616o0oO0Ooo;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.o0 */
public class C1699o0 implements C7616o0oO0Ooo.OooO00o {
    public static final String OooO00o = "AHT";
    public static final int OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final boolean f19051OooO0O0 = false;
    public static final int OooO0OO = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19052OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Pools.OooO00o<OooO0O0> f19053OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f19054OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7616o0oO0Ooo f19055OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f19056OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ArrayList<OooO0O0> f19057OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f19058OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final ArrayList<OooO0O0> f19059OooO0O0;

    /* renamed from: com.pd.sdk.o0$OooO00o */
    public interface OooO00o {
        RecyclerView.AbstractC5079OooOoo0 OooO00o(int i);

        void OooO00o(int i, int i2);

        void OooO00o(int i, int i2, Object obj);

        void OooO00o(OooO0O0 oooO0O0);

        void OooO0O0(int i, int i2);

        void OooO0O0(OooO0O0 oooO0O0);

        void OooO0OO(int i, int i2);

        void OooO0Oo(int i, int i2);
    }

    /* renamed from: com.pd.sdk.o0$OooO0O0 */
    public static class OooO0O0 {
        public static final int OooO0Oo = 1;
        public static final int OooO0o = 4;
        public static final int OooO0o0 = 2;
        public static final int OooO0oO = 8;
        public static final int OooO0oo = 30;
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object f19060OooO00o;
        public int OooO0O0;
        public int OooO0OO;

        public OooO0O0(int i, int i2, int i3, Object obj) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.OooO0OO = i3;
            this.f19060OooO00o = obj;
        }

        public String OooO00o() {
            int i = this.OooO00o;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return CommonNetImpl.f10820UP;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0O0.class != obj.getClass()) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            int i = this.OooO00o;
            if (i != oooO0O0.OooO00o) {
                return false;
            }
            if (i == 8 && Math.abs(this.OooO0OO - this.OooO0O0) == 1 && this.OooO0OO == oooO0O0.OooO0O0 && this.OooO0O0 == oooO0O0.OooO0OO) {
                return true;
            }
            if (this.OooO0OO != oooO0O0.OooO0OO || this.OooO0O0 != oooO0O0.OooO0O0) {
                return false;
            }
            Object obj2 = this.f19060OooO00o;
            if (obj2 != null) {
                if (!obj2.equals(oooO0O0.f19060OooO00o)) {
                    return false;
                }
            } else if (oooO0O0.f19060OooO00o != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.OooO00o * 31) + this.OooO0O0) * 31) + this.OooO0OO;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + OooO00o() + ",s:" + this.OooO0O0 + "c:" + this.OooO0OO + ",p:" + this.f19060OooO00o + "]";
        }
    }

    public C1699o0(OooO00o oooO00o) {
        this(oooO00o, false);
    }

    private int OooO0O0(int i, int i2) {
        for (int size = this.f19059OooO0O0.size() - 1; size >= 0; size--) {
            OooO0O0 oooO0O0 = this.f19059OooO0O0.get(size);
            int i3 = oooO0O0.OooO00o;
            if (i3 == 8) {
                int i4 = oooO0O0.OooO0O0;
                int i5 = oooO0O0.OooO0OO;
                if (i4 >= i5) {
                    i5 = i4;
                    i4 = i5;
                }
                if (i < i4 || i > i5) {
                    int i6 = oooO0O0.OooO0O0;
                    if (i < i6) {
                        if (i2 == 1) {
                            oooO0O0.OooO0O0 = i6 + 1;
                            oooO0O0.OooO0OO++;
                        } else if (i2 == 2) {
                            oooO0O0.OooO0O0 = i6 - 1;
                            oooO0O0.OooO0OO--;
                        }
                    }
                } else {
                    int i7 = oooO0O0.OooO0O0;
                    if (i4 == i7) {
                        if (i2 == 1) {
                            oooO0O0.OooO0OO++;
                        } else if (i2 == 2) {
                            oooO0O0.OooO0OO--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            oooO0O0.OooO0O0 = i7 + 1;
                        } else if (i2 == 2) {
                            oooO0O0.OooO0O0 = i7 - 1;
                        }
                        i--;
                    }
                }
            } else {
                int i8 = oooO0O0.OooO0O0;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= oooO0O0.OooO0OO;
                    } else if (i3 == 2) {
                        i += oooO0O0.OooO0OO;
                    }
                } else if (i2 == 1) {
                    oooO0O0.OooO0O0 = i8 + 1;
                } else if (i2 == 2) {
                    oooO0O0.OooO0O0 = i8 - 1;
                }
            }
        }
        for (int size2 = this.f19059OooO0O0.size() - 1; size2 >= 0; size2--) {
            OooO0O0 oooO0O02 = this.f19059OooO0O0.get(size2);
            if (oooO0O02.OooO00o == 8) {
                int i9 = oooO0O02.OooO0OO;
                if (i9 == oooO0O02.OooO0O0 || i9 < 0) {
                    this.f19059OooO0O0.remove(size2);
                    OooO00o(oooO0O02);
                }
            } else if (oooO0O02.OooO0OO <= 0) {
                this.f19059OooO0O0.remove(size2);
                OooO00o(oooO0O02);
            }
        }
        return i;
    }

    private void OooO0o(OooO0O0 oooO0O0) {
        int i;
        int i2 = oooO0O0.OooO00o;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int OooO0O02 = OooO0O0(oooO0O0.OooO0O0, i2);
        int i3 = oooO0O0.OooO0O0;
        int i4 = oooO0O0.OooO00o;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + oooO0O0);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < oooO0O0.OooO0OO; i6++) {
            int OooO0O03 = OooO0O0(oooO0O0.OooO0O0 + (i * i6), oooO0O0.OooO00o);
            int i7 = oooO0O0.OooO00o;
            if (i7 == 2 ? OooO0O03 == OooO0O02 : i7 == 4 && OooO0O03 == OooO0O02 + 1) {
                i5++;
            } else {
                OooO0O0 OooO00o2 = OooO00o(oooO0O0.OooO00o, OooO0O02, i5, oooO0O0.f19060OooO00o);
                OooO00o(OooO00o2, i3);
                OooO00o(OooO00o2);
                if (oooO0O0.OooO00o == 4) {
                    i3 += i5;
                }
                OooO0O02 = OooO0O03;
                i5 = 1;
            }
        }
        Object obj = oooO0O0.f19060OooO00o;
        OooO00o(oooO0O0);
        if (i5 > 0) {
            OooO0O0 OooO00o3 = OooO00o(oooO0O0.OooO00o, OooO0O02, i5, obj);
            OooO00o(OooO00o3, i3);
            OooO00o(OooO00o3);
        }
    }

    private void OooO0o0(OooO0O0 oooO0O0) {
        int i = oooO0O0.OooO0O0;
        int i2 = oooO0O0.OooO0OO + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f19054OooO00o.OooO00o(i) != null || OooO0O0(i)) {
                if (c == 0) {
                    OooO0o(OooO00o(4, i3, i4, oooO0O0.f19060OooO00o));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    OooO0oO(OooO00o(4, i3, i4, oooO0O0.f19060OooO00o));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != oooO0O0.OooO0OO) {
            Object obj = oooO0O0.f19060OooO00o;
            OooO00o(oooO0O0);
            oooO0O0 = OooO00o(4, i3, i4, obj);
        }
        if (c == 0) {
            OooO0o(oooO0O0);
        } else {
            OooO0oO(oooO0O0);
        }
    }

    private void OooO0oO(OooO0O0 oooO0O0) {
        this.f19059OooO0O0.add(oooO0O0);
        int i = oooO0O0.OooO00o;
        if (i == 1) {
            this.f19054OooO00o.OooO0OO(oooO0O0.OooO0O0, oooO0O0.OooO0OO);
        } else if (i == 2) {
            this.f19054OooO00o.OooO0Oo(oooO0O0.OooO0O0, oooO0O0.OooO0OO);
        } else if (i == 4) {
            this.f19054OooO00o.OooO00o(oooO0O0.OooO0O0, oooO0O0.OooO0OO, oooO0O0.f19060OooO00o);
        } else if (i == 8) {
            this.f19054OooO00o.OooO0O0(oooO0O0.OooO0O0, oooO0O0.OooO0OO);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + oooO0O0);
        }
    }

    public C1699o0 OooO00o(OooO0O0... oooO0O0Arr) {
        Collections.addAll(this.f19057OooO00o, oooO0O0Arr);
        return this;
    }

    public void OooO0OO() {
        this.f19055OooO00o.m19248OooO00o((List<OooO0O0>) this.f19057OooO00o);
        int size = this.f19057OooO00o.size();
        for (int i = 0; i < size; i++) {
            OooO0O0 oooO0O0 = this.f19057OooO00o.get(i);
            int i2 = oooO0O0.OooO00o;
            if (i2 == 1) {
                OooO0O0(oooO0O0);
            } else if (i2 == 2) {
                OooO0Oo(oooO0O0);
            } else if (i2 == 4) {
                OooO0o0(oooO0O0);
            } else if (i2 == 8) {
                OooO0OO(oooO0O0);
            }
            Runnable runnable = this.f19056OooO00o;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f19057OooO00o.clear();
    }

    public void OooO0Oo() {
        OooO00o(this.f19057OooO00o);
        OooO00o(this.f19059OooO0O0);
        this.f19052OooO00o = 0;
    }

    public C1699o0(OooO00o oooO00o, boolean z) {
        this.f19053OooO00o = new Pools.SimplePool(30);
        this.f19057OooO00o = new ArrayList<>();
        this.f19059OooO0O0 = new ArrayList<>();
        this.f19052OooO00o = 0;
        this.f19054OooO00o = oooO00o;
        this.f19058OooO00o = z;
        this.f19055OooO00o = new C7616o0oO0Ooo(this);
    }

    public void OooO00o() {
        int size = this.f19059OooO0O0.size();
        for (int i = 0; i < size; i++) {
            this.f19054OooO00o.OooO0O0(this.f19059OooO0O0.get(i));
        }
        OooO00o(this.f19059OooO0O0);
        this.f19052OooO00o = 0;
    }

    private void OooO0Oo(OooO0O0 oooO0O0) {
        char c;
        boolean z;
        int i = oooO0O0.OooO0O0;
        int i2 = oooO0O0.OooO0OO + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f19054OooO00o.OooO00o(i3) != null || OooO0O0(i3)) {
                if (c2 == 0) {
                    OooO0o(OooO00o(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    OooO0oO(OooO00o(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != oooO0O0.OooO0OO) {
            OooO00o(oooO0O0);
            oooO0O0 = OooO00o(2, i, i4, null);
        }
        if (c2 == 0) {
            OooO0o(oooO0O0);
        } else {
            OooO0oO(oooO0O0);
        }
    }

    public void OooO00o(OooO0O0 oooO0O0, int i) {
        this.f19054OooO00o.OooO00o(oooO0O0);
        int i2 = oooO0O0.OooO00o;
        if (i2 == 2) {
            this.f19054OooO00o.OooO00o(i, oooO0O0.OooO0OO);
        } else if (i2 == 4) {
            this.f19054OooO00o.OooO00o(i, oooO0O0.OooO0OO, oooO0O0.f19060OooO00o);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18076OooO00o() {
        return this.f19057OooO00o.size() > 0;
    }

    private void OooO0OO(OooO0O0 oooO0O0) {
        OooO0oO(oooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18077OooO00o(int i) {
        return (i & this.f19052OooO00o) != 0;
    }

    public int OooO00o(int i, int i2) {
        int size = this.f19059OooO0O0.size();
        while (i2 < size) {
            OooO0O0 oooO0O0 = this.f19059OooO0O0.get(i2);
            int i3 = oooO0O0.OooO00o;
            if (i3 == 8) {
                int i4 = oooO0O0.OooO0O0;
                if (i4 == i) {
                    i = oooO0O0.OooO0OO;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (oooO0O0.OooO0OO <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = oooO0O0.OooO0O0;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = oooO0O0.OooO0OO;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += oooO0O0.OooO0OO;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean OooO00o(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f19057OooO00o.add(OooO00o(4, i, i2, obj));
        this.f19052OooO00o |= 4;
        if (this.f19057OooO00o.size() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18078OooO00o(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f19057OooO00o.add(OooO00o(1, i, i2, null));
        this.f19052OooO00o |= 1;
        if (this.f19057OooO00o.size() == 1) {
            return true;
        }
        return false;
    }

    public boolean OooO00o(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f19057OooO00o.add(OooO00o(8, i, i2, null));
            this.f19052OooO00o |= 8;
            if (this.f19057OooO00o.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    private boolean OooO0O0(int i) {
        int size = this.f19059OooO0O0.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0 oooO0O0 = this.f19059OooO0O0.get(i2);
            int i3 = oooO0O0.OooO00o;
            if (i3 == 8) {
                if (OooO00o(oooO0O0.OooO0OO, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = oooO0O0.OooO0O0;
                int i5 = oooO0O0.OooO0OO + i4;
                while (i4 < i5) {
                    if (OooO00o(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public int OooO00o(int i) {
        int size = this.f19057OooO00o.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0 oooO0O0 = this.f19057OooO00o.get(i2);
            int i3 = oooO0O0.OooO00o;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = oooO0O0.OooO0O0;
                    if (i4 <= i) {
                        int i5 = oooO0O0.OooO0OO;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = oooO0O0.OooO0O0;
                    if (i6 == i) {
                        i = oooO0O0.OooO0OO;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (oooO0O0.OooO0OO <= i) {
                            i++;
                        }
                    }
                }
            } else if (oooO0O0.OooO0O0 <= i) {
                i += oooO0O0.OooO0OO;
            }
        }
        return i;
    }

    private void OooO0O0(OooO0O0 oooO0O0) {
        OooO0oO(oooO0O0);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m18079OooO0O0(int i) {
        return OooO00o(i, 0);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18081OooO0O0(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f19057OooO00o.add(OooO00o(2, i, i2, null));
        this.f19052OooO00o |= 2;
        if (this.f19057OooO00o.size() == 1) {
            return true;
        }
        return false;
    }

    public void OooO0O0() {
        OooO00o();
        int size = this.f19057OooO00o.size();
        for (int i = 0; i < size; i++) {
            OooO0O0 oooO0O0 = this.f19057OooO00o.get(i);
            int i2 = oooO0O0.OooO00o;
            if (i2 == 1) {
                this.f19054OooO00o.OooO0O0(oooO0O0);
                this.f19054OooO00o.OooO0OO(oooO0O0.OooO0O0, oooO0O0.OooO0OO);
            } else if (i2 == 2) {
                this.f19054OooO00o.OooO0O0(oooO0O0);
                this.f19054OooO00o.OooO00o(oooO0O0.OooO0O0, oooO0O0.OooO0OO);
            } else if (i2 == 4) {
                this.f19054OooO00o.OooO0O0(oooO0O0);
                this.f19054OooO00o.OooO00o(oooO0O0.OooO0O0, oooO0O0.OooO0OO, oooO0O0.f19060OooO00o);
            } else if (i2 == 8) {
                this.f19054OooO00o.OooO0O0(oooO0O0);
                this.f19054OooO00o.OooO0O0(oooO0O0.OooO0O0, oooO0O0.OooO0OO);
            }
            Runnable runnable = this.f19056OooO00o;
            if (runnable != null) {
                runnable.run();
            }
        }
        OooO00o(this.f19057OooO00o);
        this.f19052OooO00o = 0;
    }

    @Override // com.p118pd.sdk.C7616o0oO0Ooo.OooO00o
    public OooO0O0 OooO00o(int i, int i2, int i3, Object obj) {
        OooO0O0 acquire = this.f19053OooO00o.acquire();
        if (acquire == null) {
            return new OooO0O0(i, i2, i3, obj);
        }
        acquire.OooO00o = i;
        acquire.OooO0O0 = i2;
        acquire.OooO0OO = i3;
        acquire.f19060OooO00o = obj;
        return acquire;
    }

    @Override // com.p118pd.sdk.C7616o0oO0Ooo.OooO00o
    public void OooO00o(OooO0O0 oooO0O0) {
        if (!this.f19058OooO00o) {
            oooO0O0.f19060OooO00o = null;
            this.f19053OooO00o.release(oooO0O0);
        }
    }

    public void OooO00o(List<OooO0O0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            OooO00o(list.get(i));
        }
        list.clear();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18080OooO0O0() {
        return !this.f19059OooO0O0.isEmpty() && !this.f19057OooO00o.isEmpty();
    }
}
