package com.github.mikephil.charting.data;

import com.github.mikephil.charting.data.Entry;
import com.p118pd.sdk.AbstractC8205oOOoO;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import java.util.ArrayList;
import java.util.List;

public abstract class DataSet<T extends Entry> extends AbstractC8205oOOoO<T> {
    public List<T> OooO0OO = null;
    public float OooO0Oo = -3.4028235E38f;
    public float OooO0o = -3.4028235E38f;
    public float OooO0o0 = Float.MAX_VALUE;
    public float OooO0oO = Float.MAX_VALUE;

    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public DataSet(List<T> list, String str) {
        super(str);
        this.OooO0OO = list;
        if (list == null) {
            this.OooO0OO = new ArrayList();
        }
        m15088OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public float OooO() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public abstract DataSet<T> OooO00o();

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15088OooO00o() {
        List<T> list = this.OooO0OO;
        if (!(list == null || list.isEmpty())) {
            this.OooO0Oo = -3.4028235E38f;
            this.OooO0o0 = Float.MAX_VALUE;
            this.OooO0o = -3.4028235E38f;
            this.OooO0oO = Float.MAX_VALUE;
            for (T t : this.OooO0OO) {
                OooO0O0((Entry) t);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO0O0(T t) {
        if (t != null) {
            OooO0OO((Entry) t);
            OooO0Oo(t);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO0OO(T t) {
        if (t.OooO0O0() < this.OooO0oO) {
            this.OooO0oO = t.OooO0O0();
        }
        if (t.OooO0O0() > this.OooO0o) {
            this.OooO0o = t.OooO0O0();
        }
    }

    public void OooO0Oo(T t) {
        if (t.OooO00o() < this.OooO0o0) {
            this.OooO0o0 = t.OooO00o();
        }
        if (t.OooO00o() > this.OooO0Oo) {
            this.OooO0Oo = t.OooO00o();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public float OooO0o0() {
        return this.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public float OooOo() {
        return this.OooO0o;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public float OooOoO() {
        return this.OooO0oO;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void clear() {
        this.OooO0OO.clear();
        m19886OooO0O0();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(OooO0O0());
        for (int i = 0; i < this.OooO0OO.size(); i++) {
            stringBuffer.append(this.OooO0OO.get(i).toString() + " ");
        }
        return stringBuffer.toString();
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0
    public String OooO0O0() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append("DataSet, label: ");
        sb.append(m19882OooO00o() == null ? "" : m19882OooO00o());
        sb.append(", entries: ");
        sb.append(this.OooO0OO.size());
        sb.append("\n");
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0
    public List<T> OooO0OO() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public int OooO0Oo() {
        return this.OooO0OO.size();
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15091OooO0O0(T t) {
        List<T> list;
        if (t == null || (list = this.OooO0OO) == null) {
            return false;
        }
        boolean remove = list.remove(t);
        if (remove) {
            m15088OooO00o();
        }
        return remove;
    }

    public void OooO0OO(List<T> list) {
        this.OooO0OO = list;
        m19886OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15089OooO00o(float f, float f2) {
        List<T> list = this.OooO0OO;
        if (!(list == null || list.isEmpty())) {
            this.OooO0Oo = -3.4028235E38f;
            this.OooO0o0 = Float.MAX_VALUE;
            int OooO00o = OooO00o(f2, Float.NaN, Rounding.UP);
            for (int OooO00o2 = OooO00o(f, Float.NaN, Rounding.DOWN); OooO00o2 <= OooO00o; OooO00o2++) {
                OooO0Oo(this.OooO0OO.get(OooO00o2));
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m15092OooO0OO(T t) {
        if (t == null) {
            return false;
        }
        List<T> OooO0OO2 = OooO0OO();
        if (OooO0OO2 == null) {
            OooO0OO2 = new ArrayList<>();
        }
        OooO0O0((Entry) t);
        return OooO0OO2.add(t);
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15090OooO00o(T t) {
        if (t != null) {
            if (this.OooO0OO == null) {
                this.OooO0OO = new ArrayList();
            }
            OooO0O0((Entry) t);
            if (this.OooO0OO.size() > 0) {
                List<T> list = this.OooO0OO;
                if (list.get(list.size() - 1).OooO0O0() > t.OooO0O0()) {
                    this.OooO0OO.add(OooO00o(t.OooO0O0(), t.OooO00o(), Rounding.UP), t);
                    return;
                }
            }
            this.OooO0OO.add(t);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public int OooO00o(Entry entry) {
        return this.OooO0OO.indexOf(entry);
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m15087OooO00o(float f, float f2, Rounding rounding) {
        int OooO00o = OooO00o(f, f2, rounding);
        if (OooO00o > -1) {
            return this.OooO0OO.get(OooO00o);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public T OooO00o(float f, float f2) {
        return m15087OooO00o(f, f2, Rounding.CLOSEST);
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public T OooO00o(int i) {
        if (i > this.OooO0OO.size() - 1) {
            return null;
        }
        return this.OooO0OO.get(i);
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public int OooO00o(float f, float f2, Rounding rounding) {
        T t;
        List<T> list = this.OooO0OO;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int i = 0;
        int size = this.OooO0OO.size() - 1;
        while (i < size) {
            int i2 = (i + size) / 2;
            float OooO0O0 = this.OooO0OO.get(i2).OooO0O0() - f;
            int i3 = i2 + 1;
            float abs = Math.abs(OooO0O0);
            float abs2 = Math.abs(this.OooO0OO.get(i3).OooO0O0() - f);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d = (double) OooO0O0;
                    if (d < AbstractC8352oOoOOoO0.OooO0O0) {
                        if (d >= AbstractC8352oOoOOoO0.OooO0O0) {
                        }
                    }
                }
                size = i2;
            }
            i = i3;
        }
        if (size == -1) {
            return size;
        }
        float OooO0O02 = this.OooO0OO.get(size).OooO0O0();
        if (rounding == Rounding.UP) {
            if (OooO0O02 < f && size < this.OooO0OO.size() - 1) {
                size++;
            }
        } else if (rounding == Rounding.DOWN && OooO0O02 > f && size > 0) {
            size--;
        }
        if (Float.isNaN(f2)) {
            return size;
        }
        while (size > 0 && this.OooO0OO.get(size - 1).OooO0O0() == OooO0O02) {
            size--;
        }
        float OooO00o = this.OooO0OO.get(size).OooO00o();
        loop2:
        while (true) {
            do {
                size++;
                if (size >= this.OooO0OO.size()) {
                    break loop2;
                }
                t = this.OooO0OO.get(size);
                if (t.OooO0O0() != OooO0O02) {
                    break loop2;
                }
            } while (Math.abs(t.OooO00o() - f2) >= Math.abs(OooO00o - f2));
            OooO00o = f2;
        }
        return size;
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public List<T> OooO00o(float f) {
        ArrayList arrayList = new ArrayList();
        int size = this.OooO0OO.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i2 = (size + i) / 2;
            T t = this.OooO0OO.get(i2);
            if (f == t.OooO0O0()) {
                while (i2 > 0 && this.OooO0OO.get(i2 - 1).OooO0O0() == f) {
                    i2--;
                }
                int size2 = this.OooO0OO.size();
                while (i2 < size2) {
                    T t2 = this.OooO0OO.get(i2);
                    if (t2.OooO0O0() != f) {
                        break;
                    }
                    arrayList.add(t2);
                    i2++;
                }
            } else if (f > t.OooO0O0()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }
}
