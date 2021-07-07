package com.p118pd.sdk;

import com.github.mikephil.charting.data.Entry;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoOo0O  reason: case insensitive filesystem */
public class C8226oOOoOo0O extends AbstractC8219oOOoOOOo<AbstractC8268oOOoooo> {
    public List<String> OooO0O0;

    public C8226oOOoOo0O() {
    }

    public void OooO00o(String... strArr) {
        this.OooO0O0 = Arrays.asList(strArr);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.String>] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<com.pd.sdk.oOOoooo> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p118pd.sdk.AbstractC8219oOOoOOOo
    public void OooO0O0(List<AbstractC8268oOOoooo> list) {
        this.OooO0O0 = list;
    }

    public C8226oOOoOo0O(List<AbstractC8268oOOoooo> list) {
        super(list);
    }

    @Override // com.p118pd.sdk.AbstractC8219oOOoOOOo
    public Entry OooO00o(C8246oOOoo0oO ooooo0oo) {
        return ((AbstractC8268oOOoooo) OooO00o(ooooo0oo.m19936OooO0O0())).m19951OooO00o((int) ooooo0oo.OooO0OO());
    }

    @Override // com.p118pd.sdk.AbstractC8219oOOoOOOo, com.p118pd.sdk.AbstractC8219oOOoOOOo, com.p118pd.sdk.AbstractC8219oOOoOOOo
    public List<String> OooO0O0() {
        return this.OooO0O0;
    }

    public C8226oOOoOo0O(AbstractC8268oOOoooo... oooooooArr) {
        super(oooooooArr);
    }
}
