package com.p118pd.sdk;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoOOoo  reason: case insensitive filesystem */
public abstract class AbstractC8223oOOoOOoo<T extends Entry> extends AbstractC8212oOOoO0oo<T> implements AbstractC8267oOOoooOo<T> {
    public DashPathEffect OooO0O0;
    public boolean OooO0o;
    public boolean OooO0o0;
    public float OooO0oo;

    public AbstractC8223oOOoOOoo(List<T> list, String str) {
        super(list, str);
        this.OooO0o0 = true;
        this.OooO0o = true;
        this.OooO0oo = 0.5f;
        this.OooO0O0 = null;
        this.OooO0oo = AbstractC8352oOoOOoO0.OooO00o(0.5f);
    }

    public void OooO(boolean z) {
        this.OooO0o0 = z;
    }

    public void OooO00o(float f, float f2, float f3) {
        this.OooO0O0 = new DashPathEffect(new float[]{f, f2}, f3);
    }

    @Override // com.p118pd.sdk.AbstractC8267oOOoooOo, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    public DashPathEffect OooO0OO() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    public void OooO0Oo() {
        this.OooO0O0 = null;
    }

    public void OooO0o0(float f) {
        this.OooO0oo = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public void OooO0oO(boolean z) {
        OooO(z);
        OooO0oo(z);
    }

    public void OooO0oo(boolean z) {
        this.OooO0o = z;
    }

    @Override // com.p118pd.sdk.AbstractC8267oOOoooOo, com.p118pd.sdk.AbstractC8267oOOoooOo
    /* renamed from: OooOO0O  reason: collision with other method in class */
    public boolean m19927OooOO0O() {
        return this.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC8267oOOoooOo
    public boolean OooOOOo() {
        return this.OooO0o;
    }

    public boolean OooOo0O() {
        return this.OooO0O0 != null;
    }

    @Override // com.p118pd.sdk.AbstractC8267oOOoooOo, com.p118pd.sdk.AbstractC8267oOOoooOo
    public float OooOO0O() {
        return this.OooO0oo;
    }
}
