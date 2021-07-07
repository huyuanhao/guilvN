package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.util.p292io.pem.PemGenerationException;

/* renamed from: com.pd.sdk.丨11L1L  reason: invalid class name */
public class C11L1L implements LliILl1 {
    public static final List OooO0O0 = Collections.unmodifiableList(new ArrayList());
    public String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f22718OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f22719OooO00o;

    public C11L1L(String str, List list, byte[] bArr) {
        this.OooO00o = str;
        this.f22718OooO00o = Collections.unmodifiableList(list);
        this.f22719OooO00o = bArr;
    }

    public C11L1L(String str, byte[] bArr) {
        this(str, OooO0O0, bArr);
    }

    @Override // com.p118pd.sdk.LliILl1
    public C11L1L OooO00o() throws PemGenerationException {
        return this;
    }

    @Override // com.p118pd.sdk.LliILl1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21231OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.LliILl1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List m21232OooO00o() {
        return this.f22718OooO00o;
    }

    @Override // com.p118pd.sdk.LliILl1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21233OooO00o() {
        return this.f22719OooO00o;
    }
}
