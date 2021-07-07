package com.p118pd.sdk;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: com.pd.sdk.o00o0OOO  reason: case insensitive filesystem */
public class C7161o00o0OOO extends AbstractC7158o00o0O0O {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Uri f19558OooO00o;

    public C7161o00o0OOO(@Nullable AbstractC7158o00o0O0O o00o0o0o, Context context, Uri uri) {
        super(o00o0o0o);
        this.OooO00o = context;
        this.f19558OooO00o = uri;
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public AbstractC7158o00o0O0O OooO00o(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m18590OooO0O0() {
        return C7160o00o0OO0.m18583OooO0OO(this.OooO00o, this.f19558OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0OO() {
        try {
            return DocumentsContract.deleteDocument(this.OooO00o.getContentResolver(), this.f19558OooO00o);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0Oo() {
        return C7160o00o0OO0.m18584OooO0OO(this.OooO00o, this.f19558OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0o() {
        return C7160o00o0OO0.OooO0o0(this.OooO00o, this.f19558OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0o0() {
        return C7160o00o0OO0.OooO0Oo(this.OooO00o, this.f19558OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O
    public boolean OooO0oO() {
        return C7160o00o0OO0.OooO0o(this.OooO00o, this.f19558OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    public AbstractC7158o00o0O0O OooO00o(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    public long OooO0O0() {
        return C7160o00o0OO0.OooO0OO(this.OooO00o, this.f19558OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Uri m18585OooO00o() {
        return this.f19558OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18591OooO0O0() {
        return C7160o00o0OO0.m18582OooO0O0(this.OooO00o, this.f19558OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18586OooO00o() {
        return C7160o00o0OO0.m18579OooO00o(this.OooO00o, this.f19558OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    public long OooO00o() {
        return C7160o00o0OO0.OooO0O0(this.OooO00o, this.f19558OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18587OooO00o() {
        return C7160o00o0OO0.m18580OooO00o(this.OooO00o, this.f19558OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7158o00o0O0O[] m18589OooO00o() {
        throw new UnsupportedOperationException();
    }

    @Override // com.p118pd.sdk.AbstractC7158o00o0O0O, com.p118pd.sdk.AbstractC7158o00o0O0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18588OooO00o(String str) {
        throw new UnsupportedOperationException();
    }
}
