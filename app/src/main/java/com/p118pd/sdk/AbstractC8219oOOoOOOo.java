package com.p118pd.sdk;

import android.graphics.Typeface;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.p118pd.sdk.AbstractC8265oOOoooO0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoOOOo  reason: case insensitive filesystem */
public abstract class AbstractC8219oOOoOOOo<T extends AbstractC8265oOOoooO0<? extends Entry>> {
    public float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<T> f21339OooO00o;
    public float OooO0O0;
    public float OooO0OO;
    public float OooO0Oo;
    public float OooO0o;
    public float OooO0o0;
    public float OooO0oO;
    public float OooO0oo;

    public AbstractC8219oOOoOOOo() {
        this.OooO00o = -3.4028235E38f;
        this.OooO0O0 = Float.MAX_VALUE;
        this.OooO0OO = -3.4028235E38f;
        this.OooO0Oo = Float.MAX_VALUE;
        this.OooO0o0 = -3.4028235E38f;
        this.OooO0o = Float.MAX_VALUE;
        this.OooO0oO = -3.4028235E38f;
        this.OooO0oo = Float.MAX_VALUE;
        this.f21339OooO00o = new ArrayList();
    }

    private List<T> OooO00o(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public float OooO0O0(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f = this.OooO0o;
            return f == Float.MAX_VALUE ? this.OooO0oo : f;
        }
        float f2 = this.OooO0oo;
        return f2 == Float.MAX_VALUE ? this.OooO0o : f2;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m19919OooO0OO() {
        m19906OooO00o();
    }

    public float OooO0Oo() {
        return this.OooO0O0;
    }

    public float OooO0OO() {
        return this.OooO00o;
    }

    public void OooO00o(float f, float f2) {
        for (T t : this.f21339OooO00o) {
            t.m19957OooO00o(f, f2);
        }
        m19906OooO00o();
    }

    public float OooO0O0() {
        return this.OooO0Oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19906OooO00o() {
        List<T> list = this.f21339OooO00o;
        if (list != null) {
            this.OooO00o = -3.4028235E38f;
            this.OooO0O0 = Float.MAX_VALUE;
            this.OooO0OO = -3.4028235E38f;
            this.OooO0Oo = Float.MAX_VALUE;
            for (T t : list) {
                OooO0O0((AbstractC8265oOOoooO0) t);
            }
            this.OooO0o0 = -3.4028235E38f;
            this.OooO0o = Float.MAX_VALUE;
            this.OooO0oO = -3.4028235E38f;
            this.OooO0oo = Float.MAX_VALUE;
            T OooO00o2 = OooO00o(this.f21339OooO00o);
            if (OooO00o2 != null) {
                this.OooO0o0 = OooO00o2.OooO();
                this.OooO0o = OooO00o2.OooO0o0();
                for (T t2 : this.f21339OooO00o) {
                    if (t2.m19949OooO00o() == YAxis.AxisDependency.LEFT) {
                        if (t2.OooO0o0() < this.OooO0o) {
                            this.OooO0o = t2.OooO0o0();
                        }
                        if (t2.OooO() > this.OooO0o0) {
                            this.OooO0o0 = t2.OooO();
                        }
                    }
                }
            }
            T OooO0O02 = OooO0O0(this.f21339OooO00o);
            if (OooO0O02 != null) {
                this.OooO0oO = OooO0O02.OooO();
                this.OooO0oo = OooO0O02.OooO0o0();
                for (T t3 : this.f21339OooO00o) {
                    if (t3.m19949OooO00o() == YAxis.AxisDependency.RIGHT) {
                        if (t3.OooO0o0() < this.OooO0oo) {
                            this.OooO0oo = t3.OooO0o0();
                        }
                        if (t3.OooO() > this.OooO0oO) {
                            this.OooO0oO = t3.OooO();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19918OooO0O0(T t) {
        if (t == null) {
            return false;
        }
        boolean remove = this.f21339OooO00o.remove(t);
        if (remove) {
            m19906OooO00o();
        }
        return remove;
    }

    public void OooO0O0(T t) {
        if (this.OooO00o < t.OooO()) {
            this.OooO00o = t.OooO();
        }
        if (this.OooO0O0 > t.OooO0o0()) {
            this.OooO0O0 = t.OooO0o0();
        }
        if (this.OooO0OO < t.OooOo()) {
            this.OooO0OO = t.OooOo();
        }
        if (this.OooO0Oo > t.OooOoO()) {
            this.OooO0Oo = t.OooOoO();
        }
        if (t.m19949OooO00o() == YAxis.AxisDependency.LEFT) {
            if (this.OooO0o0 < t.OooO()) {
                this.OooO0o0 = t.OooO();
            }
            if (this.OooO0o > t.OooO0o0()) {
                this.OooO0o = t.OooO0o0();
                return;
            }
            return;
        }
        if (this.OooO0oO < t.OooO()) {
            this.OooO0oO = t.OooO();
        }
        if (this.OooO0oo > t.OooO0o0()) {
            this.OooO0oo = t.OooO0o0();
        }
    }

    public AbstractC8219oOOoOOOo(T... tArr) {
        this.OooO00o = -3.4028235E38f;
        this.OooO0O0 = Float.MAX_VALUE;
        this.OooO0OO = -3.4028235E38f;
        this.OooO0Oo = Float.MAX_VALUE;
        this.OooO0o0 = -3.4028235E38f;
        this.OooO0o = Float.MAX_VALUE;
        this.OooO0oO = -3.4028235E38f;
        this.OooO0oo = Float.MAX_VALUE;
        this.f21339OooO00o = OooO00o(tArr);
        m19919OooO0OO();
    }

    public AbstractC8219oOOoOOOo(List<T> list) {
        this.OooO00o = -3.4028235E38f;
        this.OooO0O0 = Float.MAX_VALUE;
        this.OooO0OO = -3.4028235E38f;
        this.OooO0Oo = Float.MAX_VALUE;
        this.OooO0o0 = -3.4028235E38f;
        this.OooO0o = Float.MAX_VALUE;
        this.OooO0oO = -3.4028235E38f;
        this.OooO0oo = Float.MAX_VALUE;
        this.f21339OooO00o = list;
        m19919OooO0OO();
    }

    public T OooO0O0(List<T> list) {
        for (T t : list) {
            if (t.m19949OooO00o() == YAxis.AxisDependency.RIGHT) {
                return t;
            }
        }
        return null;
    }

    public void OooO0O0(boolean z) {
        for (T t : this.f21339OooO00o) {
            t.OooO00o(z);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19917OooO0O0() {
        List<T> list = this.f21339OooO00o;
        if (list != null) {
            list.clear();
        }
        m19919OooO0OO();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m19916OooO0O0() {
        int i = 0;
        for (T t : this.f21339OooO00o) {
            i += t.OooO0Oo();
        }
        return i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19903OooO00o() {
        List<T> list = this.f21339OooO00o;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public float OooO00o(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f = this.OooO0o0;
            return f == -3.4028235E38f ? this.OooO0oO : f;
        }
        float f2 = this.OooO0oO;
        return f2 == -3.4028235E38f ? this.OooO0o0 : f2;
    }

    public float OooO00o() {
        return this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<T> m19905OooO00o() {
        return this.f21339OooO00o;
    }

    public int OooO00o(List<T> list, String str, boolean z) {
        int i = 0;
        if (z) {
            while (i < list.size()) {
                if (str.equalsIgnoreCase(list.get(i).m19954OooO00o())) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < list.size()) {
            if (str.equals(list.get(i).m19954OooO00o())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String[] m19915OooO00o() {
        String[] strArr = new String[this.f21339OooO00o.size()];
        for (int i = 0; i < this.f21339OooO00o.size(); i++) {
            strArr[i] = this.f21339OooO00o.get(i).m19954OooO00o();
        }
        return strArr;
    }

    public Entry OooO00o(C8246oOOoo0oO ooooo0oo) {
        if (ooooo0oo.m19936OooO0O0() >= this.f21339OooO00o.size()) {
            return null;
        }
        return this.f21339OooO00o.get(ooooo0oo.m19936OooO0O0()).OooO00o(ooooo0oo.OooO0OO(), ooooo0oo.OooO0o0());
    }

    public T OooO00o(String str, boolean z) {
        int OooO00o2 = OooO00o(this.f21339OooO00o, str, z);
        if (OooO00o2 < 0 || OooO00o2 >= this.f21339OooO00o.size()) {
            return null;
        }
        return this.f21339OooO00o.get(OooO00o2);
    }

    public T OooO00o(int i) {
        List<T> list = this.f21339OooO00o;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.f21339OooO00o.get(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19908OooO00o(T t) {
        if (t != null) {
            OooO0O0((AbstractC8265oOOoooO0) t);
            this.f21339OooO00o.add(t);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19911OooO00o(int i) {
        if (i >= this.f21339OooO00o.size() || i < 0) {
            return false;
        }
        return m19918OooO0O0((AbstractC8265oOOoooO0) this.f21339OooO00o.get(i));
    }

    public void OooO00o(Entry entry, int i) {
        if (this.f21339OooO00o.size() > i && i >= 0) {
            T t = this.f21339OooO00o.get(i);
            if (t.OooO0OO(entry)) {
                OooO00o(entry, t.m19949OooO00o());
            }
        }
    }

    public void OooO00o(Entry entry, YAxis.AxisDependency axisDependency) {
        if (this.OooO00o < entry.OooO00o()) {
            this.OooO00o = entry.OooO00o();
        }
        if (this.OooO0O0 > entry.OooO00o()) {
            this.OooO0O0 = entry.OooO00o();
        }
        if (this.OooO0OO < entry.OooO0O0()) {
            this.OooO0OO = entry.OooO0O0();
        }
        if (this.OooO0Oo > entry.OooO0O0()) {
            this.OooO0Oo = entry.OooO0O0();
        }
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            if (this.OooO0o0 < entry.OooO00o()) {
                this.OooO0o0 = entry.OooO00o();
            }
            if (this.OooO0o > entry.OooO00o()) {
                this.OooO0o = entry.OooO00o();
                return;
            }
            return;
        }
        if (this.OooO0oO < entry.OooO00o()) {
            this.OooO0oO = entry.OooO00o();
        }
        if (this.OooO0oo > entry.OooO00o()) {
            this.OooO0oo = entry.OooO00o();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19912OooO00o(Entry entry, int i) {
        T t;
        if (entry == null || i >= this.f21339OooO00o.size() || (t = this.f21339OooO00o.get(i)) == null) {
            return false;
        }
        boolean OooO0O02 = t.OooO0O0(entry);
        if (OooO0O02) {
            m19906OooO00o();
        }
        return OooO0O02;
    }

    public boolean OooO00o(float f, int i) {
        Entry OooO00o2;
        if (i < this.f21339OooO00o.size() && (OooO00o2 = this.f21339OooO00o.get(i).OooO00o(f, Float.NaN)) != null) {
            return m19912OooO00o(OooO00o2, i);
        }
        return false;
    }

    public T OooO00o(Entry entry) {
        if (entry == null) {
            return null;
        }
        for (int i = 0; i < this.f21339OooO00o.size(); i++) {
            T t = this.f21339OooO00o.get(i);
            for (int i2 = 0; i2 < t.OooO0Oo(); i2++) {
                if (entry.OooO00o(t.OooO00o(entry.OooO0O0(), entry.OooO00o()))) {
                    return t;
                }
            }
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m19914OooO00o() {
        if (this.f21339OooO00o == null) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f21339OooO00o.size(); i2++) {
            i += this.f21339OooO00o.get(i2).m19955OooO00o().size();
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f21339OooO00o.size(); i4++) {
            for (Integer num : this.f21339OooO00o.get(i4).m19955OooO00o()) {
                iArr[i3] = num.intValue();
                i3++;
            }
        }
        return iArr;
    }

    public int OooO00o(T t) {
        return this.f21339OooO00o.indexOf(t);
    }

    public T OooO00o(List<T> list) {
        for (T t : list) {
            if (t.m19949OooO00o() == YAxis.AxisDependency.LEFT) {
                return t;
            }
        }
        return null;
    }

    public void OooO00o(AbstractC8239oOOoo00O ooooo00o) {
        if (ooooo00o != null) {
            for (T t : this.f21339OooO00o) {
                t.OooO00o(ooooo00o);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19907OooO00o(int i) {
        for (T t : this.f21339OooO00o) {
            t.m19958OooO00o(i);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19909OooO00o(List<Integer> list) {
        for (T t : this.f21339OooO00o) {
            t.OooO00o(list);
        }
    }

    public void OooO00o(Typeface typeface) {
        for (T t : this.f21339OooO00o) {
            t.OooO00o(typeface);
        }
    }

    public void OooO00o(float f) {
        for (T t : this.f21339OooO00o) {
            t.OooO0O0(f);
        }
    }

    public void OooO00o(boolean z) {
        for (T t : this.f21339OooO00o) {
            t.OooO0O0(z);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19910OooO00o() {
        for (T t : this.f21339OooO00o) {
            if (!t.OooO0O0()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19913OooO00o(T t) {
        for (T t2 : this.f21339OooO00o) {
            if (t2.equals(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m19904OooO00o() {
        List<T> list = this.f21339OooO00o;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T t = this.f21339OooO00o.get(0);
        for (T t2 : this.f21339OooO00o) {
            if (t2.OooO0Oo() > t.OooO0Oo()) {
                t = t2;
            }
        }
        return t;
    }
}
