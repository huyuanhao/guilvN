package com.p118pd.sdk;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.o0oo0ooO  reason: case insensitive filesystem */
public final class C7701o0oo0ooO implements AbstractC7644o0oOoOO {
    public static final oO0O00oO<Class<?>, byte[]> OooO00o = new oO0O00oO<>(50);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f20648OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7644o0oOoOO f20649OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7648o0oOoOo f20650OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7655o0oOoo0O<?> f20651OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7707o0ooO00O f20652OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Class<?> f20653OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final AbstractC7644o0oOoOO f20654OooO0O0;

    public C7701o0oo0ooO(AbstractC7707o0ooO00O o0ooo00o, AbstractC7644o0oOoOO o0ooooo, AbstractC7644o0oOoOO o0ooooo2, int i, int i2, AbstractC7655o0oOoo0O<?> o0oooo0o, Class<?> cls, C7648o0oOoOo o0ooooo3) {
        this.f20652OooO00o = o0ooo00o;
        this.f20649OooO00o = o0ooooo;
        this.f20654OooO0O0 = o0ooooo2;
        this.f20648OooO00o = i;
        this.OooO0O0 = i2;
        this.f20651OooO00o = o0oooo0o;
        this.f20653OooO00o = cls;
        this.f20650OooO00o = o0ooooo3;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f20652OooO00o.OooO00o(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f20648OooO00o).putInt(this.OooO0O0).array();
        this.f20654OooO0O0.OooO00o(messageDigest);
        this.f20649OooO00o.OooO00o(messageDigest);
        messageDigest.update(bArr);
        AbstractC7655o0oOoo0O<?> o0oooo0o = this.f20651OooO00o;
        if (o0oooo0o != null) {
            o0oooo0o.OooO00o(messageDigest);
        }
        this.f20650OooO00o.OooO00o(messageDigest);
        messageDigest.update(OooO00o());
        this.f20652OooO00o.OooO00o(bArr);
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        if (!(obj instanceof C7701o0oo0ooO)) {
            return false;
        }
        C7701o0oo0ooO o0oo0ooo = (C7701o0oo0ooO) obj;
        if (this.OooO0O0 != o0oo0ooo.OooO0O0 || this.f20648OooO00o != o0oo0ooo.f20648OooO00o || !oO0O0O00.OooO0O0(this.f20651OooO00o, o0oo0ooo.f20651OooO00o) || !this.f20653OooO00o.equals(o0oo0ooo.f20653OooO00o) || !this.f20649OooO00o.equals(o0oo0ooo.f20649OooO00o) || !this.f20654OooO0O0.equals(o0oo0ooo.f20654OooO0O0) || !this.f20650OooO00o.equals(o0oo0ooo.f20650OooO00o)) {
            return false;
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        int hashCode = (((((this.f20649OooO00o.hashCode() * 31) + this.f20654OooO0O0.hashCode()) * 31) + this.f20648OooO00o) * 31) + this.OooO0O0;
        AbstractC7655o0oOoo0O<?> o0oooo0o = this.f20651OooO00o;
        if (o0oooo0o != null) {
            hashCode = (hashCode * 31) + o0oooo0o.hashCode();
        }
        return (((hashCode * 31) + this.f20653OooO00o.hashCode()) * 31) + this.f20650OooO00o.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f20649OooO00o + ", signature=" + this.f20654OooO0O0 + ", width=" + this.f20648OooO00o + ", height=" + this.OooO0O0 + ", decodedResourceClass=" + this.f20653OooO00o + ", transformation='" + this.f20651OooO00o + '\'' + ", options=" + this.f20650OooO00o + '}';
    }

    private byte[] OooO00o() {
        byte[] OooO00o2 = OooO00o.m19519OooO00o(this.f20653OooO00o);
        if (OooO00o2 != null) {
            return OooO00o2;
        }
        byte[] bytes = this.f20653OooO00o.getName().getBytes(AbstractC7644o0oOoOO.f20533OooO00o);
        OooO00o.OooO00o(this.f20653OooO00o, bytes);
        return bytes;
    }
}
