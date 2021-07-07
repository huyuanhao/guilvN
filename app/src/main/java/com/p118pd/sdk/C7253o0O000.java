package com.p118pd.sdk;

import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import com.p118pd.sdk.AbstractC7614o0oO0O0o;
import com.p118pd.sdk.C7352o0O0oo0o;

/* renamed from: com.pd.sdk.o0O000  reason: case insensitive filesystem */
public class C7253o0O000<T> {
    public static final String OooO00o = "AsyncListUtil";
    public static final boolean OooO0O0 = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f19813OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SparseIntArray f19814OooO00o = new SparseIntArray();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO<T> f19815OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7254OooO0Oo f19816OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7352o0O0oo0o<T> f19817OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7614o0oO0O0o.OooO00o<T> f19818OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7614o0oO0O0o.OooO0O0<T> f19819OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Class<T> f19820OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19821OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f19822OooO00o = new int[2];

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f19823OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final AbstractC7614o0oO0O0o.OooO00o<T> f19824OooO0O0 = new OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final AbstractC7614o0oO0O0o.OooO0O0<T> f19825OooO0O0 = new OooO00o();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int[] f19826OooO0O0 = new int[2];
    public int OooO0OO = 0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final int[] f19827OooO0OO = new int[2];
    public int OooO0Oo = 0;
    public int OooO0o0 = 0;

    /* renamed from: com.pd.sdk.o0O000$OooO0OO */
    public static abstract class OooO0OO<T> {
        @WorkerThread
        public int OooO00o() {
            return 10;
        }

        @WorkerThread
        public void OooO00o(@NonNull T[] tArr, int i) {
        }

        @WorkerThread
        public abstract void OooO00o(@NonNull T[] tArr, int i, int i2);

        @WorkerThread
        public abstract int OooO0O0();
    }

    /* renamed from: com.pd.sdk.o0O000$OooO0Oo  reason: case insensitive filesystem */
    public static abstract class AbstractC7254OooO0Oo {
        public static final int OooO00o = 0;
        public static final int OooO0O0 = 1;
        public static final int OooO0OO = 2;

        @UiThread
        public abstract void OooO00o();

        @UiThread
        public abstract void OooO00o(int i);

        @UiThread
        public abstract void OooO00o(@NonNull int[] iArr);

        @UiThread
        public void OooO00o(@NonNull int[] iArr, @NonNull int[] iArr2, int i) {
            int i2 = (iArr[1] - iArr[0]) + 1;
            int i3 = i2 / 2;
            iArr2[0] = iArr[0] - (i == 1 ? i2 : i3);
            int i4 = iArr[1];
            if (i != 2) {
                i2 = i3;
            }
            iArr2[1] = i4 + i2;
        }
    }

    public C7253o0O000(@NonNull Class<T> cls, int i, @NonNull OooO0OO<T> oooO0OO, @NonNull AbstractC7254OooO0Oo oooO0Oo) {
        this.f19820OooO00o = cls;
        this.f19813OooO00o = i;
        this.f19815OooO00o = oooO0OO;
        this.f19816OooO00o = oooO0Oo;
        this.f19817OooO00o = new C7352o0O0oo0o<>(i);
        C7276o0O00Oo o0o00oo = new C7276o0O00Oo();
        this.f19819OooO00o = o0o00oo.OooO00o(this.f19825OooO0O0);
        this.f19818OooO00o = o0o00oo.OooO00o(this.f19824OooO0O0);
        OooO0O0();
    }

    public void OooO00o(String str, Object... objArr) {
        String str2 = "[MAIN] " + String.format(str, objArr);
    }

    public void OooO0O0() {
        this.f19814OooO00o.clear();
        AbstractC7614o0oO0O0o.OooO00o<T> oooO00o = this.f19818OooO00o;
        int i = this.OooO0o0 + 1;
        this.OooO0o0 = i;
        oooO00o.OooO00o(i);
    }

    public void OooO0OO() {
        this.f19816OooO00o.OooO00o(this.f19822OooO00o);
        int[] iArr = this.f19822OooO00o;
        if (iArr[0] <= iArr[1] && iArr[0] >= 0 && iArr[1] < this.OooO0OO) {
            if (!this.f19821OooO00o) {
                this.f19823OooO0O0 = 0;
            } else {
                int i = iArr[0];
                int[] iArr2 = this.f19826OooO0O0;
                if (i > iArr2[1] || iArr2[0] > iArr[1]) {
                    this.f19823OooO0O0 = 0;
                } else if (iArr[0] < iArr2[0]) {
                    this.f19823OooO0O0 = 1;
                } else if (iArr[0] > iArr2[0]) {
                    this.f19823OooO0O0 = 2;
                }
            }
            int[] iArr3 = this.f19826OooO0O0;
            int[] iArr4 = this.f19822OooO00o;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
            this.f19816OooO00o.OooO00o(iArr4, this.f19827OooO0OO, this.f19823OooO0O0);
            int[] iArr5 = this.f19827OooO0OO;
            iArr5[0] = Math.min(this.f19822OooO00o[0], Math.max(iArr5[0], 0));
            int[] iArr6 = this.f19827OooO0OO;
            iArr6[1] = Math.max(this.f19822OooO00o[1], Math.min(iArr6[1], this.OooO0OO - 1));
            AbstractC7614o0oO0O0o.OooO00o<T> oooO00o = this.f19818OooO00o;
            int[] iArr7 = this.f19822OooO00o;
            int i2 = iArr7[0];
            int i3 = iArr7[1];
            int[] iArr8 = this.f19827OooO0OO;
            oooO00o.OooO00o(i2, i3, iArr8[0], iArr8[1], this.f19823OooO0O0);
        }
    }

    /* renamed from: com.pd.sdk.o0O000$OooO0O0 */
    public class OooO0O0 implements AbstractC7614o0oO0O0o.OooO00o<T> {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final SparseBooleanArray f19828OooO00o = new SparseBooleanArray();

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7352o0O0oo0o.OooO00o<T> f19830OooO00o;
        public int OooO0O0;
        public int OooO0OO;
        public int OooO0Oo;

        public OooO0O0() {
        }

        private void OooO0O0(C7352o0O0oo0o.OooO00o<T> oooO00o) {
            this.f19828OooO00o.put(oooO00o.OooO00o, true);
            C7253o0O000.this.f19819OooO00o.OooO00o(this.OooO00o, oooO00o);
        }

        private void OooO0OO(int i) {
            this.f19828OooO00o.delete(i);
            C7253o0O000.this.f19819OooO00o.OooO0O0(this.OooO00o, i);
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18730OooO00o(int i) {
            this.OooO00o = i;
            this.f19828OooO00o.clear();
            int OooO0O02 = C7253o0O000.this.f19815OooO00o.OooO0O0();
            this.OooO0O0 = OooO0O02;
            C7253o0O000.this.f19819OooO00o.OooO00o(this.OooO00o, OooO0O02);
        }

        private void OooO0O0(int i) {
            int OooO00o2 = C7253o0O000.this.f19815OooO00o.OooO00o();
            while (this.f19828OooO00o.size() >= OooO00o2) {
                int keyAt = this.f19828OooO00o.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f19828OooO00o;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i2 = this.OooO0OO - keyAt;
                int i3 = keyAt2 - this.OooO0Oo;
                if (i2 > 0 && (i2 >= i3 || i == 2)) {
                    OooO0OO(keyAt);
                } else if (i3 <= 0) {
                    return;
                } else {
                    if (i2 < i3 || i == 1) {
                        OooO0OO(keyAt2);
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO00o
        public void OooO00o(int i, int i2, int i3, int i4, int i5) {
            if (i <= i2) {
                int OooO00o2 = OooO00o(i);
                int OooO00o3 = OooO00o(i2);
                this.OooO0OO = OooO00o(i3);
                int OooO00o4 = OooO00o(i4);
                this.OooO0Oo = OooO00o4;
                if (i5 == 1) {
                    OooO00o(this.OooO0OO, OooO00o3, i5, true);
                    OooO00o(OooO00o3 + C7253o0O000.this.f19813OooO00o, this.OooO0Oo, i5, false);
                    return;
                }
                OooO00o(OooO00o2, OooO00o4, i5, false);
                OooO00o(this.OooO0OO, OooO00o2 - C7253o0O000.this.f19813OooO00o, i5, true);
            }
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO00o
        private int OooO00o(int i) {
            return i - (i % C7253o0O000.this.f19813OooO00o);
        }

        private void OooO00o(int i, int i2, int i3, boolean z) {
            int i4 = i;
            while (i4 <= i2) {
                C7253o0O000.this.f19818OooO00o.OooO00o(z ? (i2 + i) - i4 : i4, i3);
                i4 += C7253o0O000.this.f19813OooO00o;
            }
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO00o
        public void OooO00o(int i, int i2) {
            if (!m18729OooO00o(i)) {
                C7352o0O0oo0o.OooO00o<T> OooO00o2 = OooO00o();
                OooO00o2.OooO00o = i;
                int min = Math.min(C7253o0O000.this.f19813OooO00o, this.OooO0O0 - i);
                OooO00o2.OooO0O0 = min;
                C7253o0O000.this.f19815OooO00o.OooO00o(OooO00o2.f20085OooO00o, OooO00o2.OooO00o, min);
                OooO0O0(i2);
                OooO0O0(OooO00o2);
            }
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO00o
        public void OooO00o(C7352o0O0oo0o.OooO00o<T> oooO00o) {
            C7253o0O000.this.f19815OooO00o.OooO00o(oooO00o.f20085OooO00o, oooO00o.OooO0O0);
            oooO00o.f20084OooO00o = this.f19830OooO00o;
            this.f19830OooO00o = oooO00o;
        }

        private C7352o0O0oo0o.OooO00o<T> OooO00o() {
            C7352o0O0oo0o.OooO00o<T> oooO00o = this.f19830OooO00o;
            if (oooO00o != null) {
                this.f19830OooO00o = oooO00o.f20084OooO00o;
                return oooO00o;
            }
            C7253o0O000 o0o000 = C7253o0O000.this;
            return new C7352o0O0oo0o.OooO00o<>(o0o000.f19820OooO00o, o0o000.f19813OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        private boolean m18729OooO00o(int i) {
            return this.f19828OooO00o.get(i);
        }

        private void OooO00o(String str, Object... objArr) {
            String str2 = "[BKGR] " + String.format(str, objArr);
        }
    }

    private boolean OooO00o() {
        return this.OooO0o0 != this.OooO0Oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18728OooO00o() {
        if (!OooO00o()) {
            OooO0OO();
            this.f19821OooO00o = true;
        }
    }

    @Nullable
    public T OooO00o(int i) {
        if (i < 0 || i >= this.OooO0OO) {
            throw new IndexOutOfBoundsException(i + " is not within 0 and " + this.OooO0OO);
        }
        T OooO00o2 = this.f19817OooO00o.m18859OooO00o(i);
        if (OooO00o2 == null && !OooO00o()) {
            this.f19814OooO00o.put(i, 0);
        }
        return OooO00o2;
    }

    /* renamed from: com.pd.sdk.o0O000$OooO00o */
    public class OooO00o implements AbstractC7614o0oO0O0o.OooO0O0<T> {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO0O0
        public void OooO00o(int i, int i2) {
            if (OooO00o(i)) {
                C7253o0O000 o0o000 = C7253o0O000.this;
                o0o000.OooO0OO = i2;
                o0o000.f19816OooO00o.OooO00o();
                C7253o0O000 o0o0002 = C7253o0O000.this;
                o0o0002.OooO0Oo = o0o0002.OooO0o0;
                OooO00o();
                C7253o0O000 o0o0003 = C7253o0O000.this;
                o0o0003.f19821OooO00o = false;
                o0o0003.OooO0OO();
            }
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO0O0
        public void OooO0O0(int i, int i2) {
            if (OooO00o(i)) {
                C7352o0O0oo0o.OooO00o<T> OooO0O0 = C7253o0O000.this.f19817OooO00o.OooO0O0(i2);
                if (OooO0O0 == null) {
                    String str = "tile not found @" + i2;
                    return;
                }
                C7253o0O000.this.f19818OooO00o.OooO00o(OooO0O0);
            }
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO0O0
        public void OooO00o(int i, C7352o0O0oo0o.OooO00o<T> oooO00o) {
            if (!OooO00o(i)) {
                C7253o0O000.this.f19818OooO00o.OooO00o(oooO00o);
                return;
            }
            C7352o0O0oo0o.OooO00o<T> OooO00o2 = C7253o0O000.this.f19817OooO00o.OooO00o(oooO00o);
            if (OooO00o2 != null) {
                String str = "duplicate tile @" + OooO00o2.OooO00o;
                C7253o0O000.this.f19818OooO00o.OooO00o(OooO00o2);
            }
            int i2 = oooO00o.OooO00o + oooO00o.OooO0O0;
            int i3 = 0;
            while (i3 < C7253o0O000.this.f19814OooO00o.size()) {
                int keyAt = C7253o0O000.this.f19814OooO00o.keyAt(i3);
                if (oooO00o.OooO00o > keyAt || keyAt >= i2) {
                    i3++;
                } else {
                    C7253o0O000.this.f19814OooO00o.removeAt(i3);
                    C7253o0O000.this.f19816OooO00o.OooO00o(keyAt);
                }
            }
        }

        private void OooO00o() {
            for (int i = 0; i < C7253o0O000.this.f19817OooO00o.OooO00o(); i++) {
                C7253o0O000 o0o000 = C7253o0O000.this;
                o0o000.f19818OooO00o.OooO00o(o0o000.f19817OooO00o.OooO00o(i));
            }
            C7253o0O000.this.f19817OooO00o.m18860OooO00o();
        }

        private boolean OooO00o(int i) {
            return i == C7253o0O000.this.OooO0o0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18727OooO00o() {
        return this.OooO0OO;
    }
}
