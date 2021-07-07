package com.p118pd.sdk;

import android.graphics.Paint;

/* renamed from: com.pd.sdk.oOOo0oOO  reason: case insensitive filesystem */
public class C8202oOOo0oOO extends AbstractC8200oOOo0oO {
    public Paint.Align OooO00o = Paint.Align.RIGHT;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8349oOoOOo00 f21313OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21314OooO00o = "Description Label";

    public C8202oOOo0oOO() {
        this.OooO0OO = AbstractC8352oOoOOoO0.OooO00o(8.0f);
    }

    public void OooO00o(String str) {
        this.f21314OooO00o = str;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19876OooO00o() {
        return this.f21314OooO00o;
    }

    public void OooO00o(float f, float f2) {
        C8349oOoOOo00 oooooo00 = this.f21313OooO00o;
        if (oooooo00 == null) {
            this.f21313OooO00o = C8349oOoOOo00.OooO00o(f, f2);
            return;
        }
        oooooo00.f21456OooO00o = f;
        oooooo00.OooO0O0 = f2;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8349oOoOOo00 m19875OooO00o() {
        return this.f21313OooO00o;
    }

    public void OooO00o(Paint.Align align) {
        this.OooO00o = align;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    public Paint.Align OooO00o() {
        return this.OooO00o;
    }
}
