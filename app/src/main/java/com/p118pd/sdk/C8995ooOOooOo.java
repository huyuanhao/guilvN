package com.p118pd.sdk;

import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.ooOOooOo  reason: case insensitive filesystem */
public class C8995ooOOooOo implements AbstractC7700o0oo0oo0<byte[]> {
    public final byte[] OooO00o;

    public C8995ooOOooOo(byte[] bArr) {
        this.OooO00o = (byte[]) C7842oO0O0.OooO00o(bArr);
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<byte[]> m20660OooO00o() {
        return byte[].class;
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
    public void recycle() {
    }

    /* Return type fixed from 'byte[]' to match base method */
    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<byte[]> get() {
        return this.OooO00o;
    }

    /* Return type fixed from 'int' to match base method */
    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    public Class<byte[]> OooO00o() {
        return this.OooO00o.length;
    }
}
