package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoOOoO  reason: case insensitive filesystem */
public abstract class AbstractC8222oOOoOOoO<T extends Entry> extends AbstractC8223oOOoOOoo<T> implements AbstractC8266oOOoooOO<T> {
    public float OooO = 2.5f;
    public Drawable OooO00o;
    public int OooO0O0 = Color.rgb(140, 234, 255);
    public int OooO0OO = 85;
    public boolean OooO0oO = false;

    public AbstractC8222oOOoOOoO(List<T> list, String str) {
        super(list, str);
    }

    @Override // com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8266oOOoooOO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    public Drawable OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8266oOOoooOO
    public void OooO0Oo(boolean z) {
        this.OooO0oO = z;
    }

    public void OooO0o(int i) {
        this.OooO0O0 = i;
        this.OooO00o = null;
    }

    public void OooO0o0(int i) {
        this.OooO0OO = i;
    }

    @Override // com.p118pd.sdk.AbstractC8266oOOoooOO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public float OooO0oO() {
        return this.OooO;
    }

    @Override // com.p118pd.sdk.AbstractC8266oOOoooOO
    public int OooOO0() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC8267oOOoooOo, com.p118pd.sdk.AbstractC8267oOOoooOo, com.p118pd.sdk.AbstractC8266oOOoooOO, com.p118pd.sdk.AbstractC8223oOOoOOoo, com.p118pd.sdk.AbstractC8223oOOoOOoo
    public int OooOO0O() {
        return this.OooO0O0;
    }

    @TargetApi(18)
    public void OooO00o(Drawable drawable) {
        this.OooO00o = drawable;
    }

    public void OooO0o(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 10.0f) {
            f = 10.0f;
        }
        this.OooO = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    @Override // com.p118pd.sdk.AbstractC8266oOOoooOO
    public boolean OooO0o() {
        return this.OooO0oO;
    }
}
