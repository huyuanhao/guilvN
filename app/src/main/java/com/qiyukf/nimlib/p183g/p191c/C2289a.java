package com.qiyukf.nimlib.p183g.p191c;

import com.qiyukf.basesdk.sdk.ResponseCode;
import com.qiyukf.nimlib.p183g.p191c.p193b.AbstractC2292a;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2295b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;

/* renamed from: com.qiyukf.nimlib.g.c.a */
public final class C2289a implements AbstractC2292a {

    /* renamed from: a */
    public byte f4577a;

    /* renamed from: b */
    public byte f4578b;

    /* renamed from: c */
    public short f4579c;

    /* renamed from: d */
    public byte f4580d;

    /* renamed from: e */
    public int f4581e = 0;

    /* renamed from: f */
    public short f4582f = ResponseCode.RES_SUCCESS;

    public C2289a() {
    }

    public C2289a(byte b, byte b2) {
        this.f4577a = b;
        this.f4578b = b2;
    }

    /* renamed from: a */
    public final C2289a mo34935a() {
        C2289a aVar = new C2289a();
        aVar.f4577a = this.f4577a;
        aVar.f4578b = this.f4578b;
        aVar.f4579c = this.f4579c;
        aVar.f4580d = this.f4580d;
        aVar.f4581e = this.f4581e;
        aVar.f4582f = this.f4582f;
        return aVar;
    }

    /* renamed from: a */
    public final void mo34936a(int i) {
        this.f4581e = i;
    }

    @Override // com.qiyukf.nimlib.p183g.p191c.p193b.AbstractC2292a
    /* renamed from: a */
    public final void mo34937a(C2295b bVar) {
        bVar.mo34969b(this.f4581e);
        bVar.mo34960a(this.f4577a);
        bVar.mo34960a(this.f4578b);
        bVar.mo34966a(this.f4579c);
        bVar.mo34960a(this.f4580d);
        if (mo34943d()) {
            bVar.mo34966a(this.f4582f);
        }
    }

    @Override // com.qiyukf.nimlib.p183g.p191c.p193b.AbstractC2292a
    /* renamed from: a */
    public final void mo34938a(C2299f fVar) {
        this.f4581e = fVar.mo34981f();
        this.f4577a = fVar.mo34978c();
        this.f4578b = fVar.mo34978c();
        this.f4579c = fVar.mo34983h();
        this.f4580d = fVar.mo34978c();
        if (mo34943d()) {
            this.f4582f = fVar.mo34983h();
        }
    }

    /* renamed from: a */
    public final void mo34939a(short s) {
        this.f4579c = s;
    }

    /* renamed from: b */
    public final void mo34940b() {
        this.f4582f = ResponseCode.RES_SUCCESS;
        this.f4580d = 0;
        this.f4581e = 0;
    }

    /* renamed from: b */
    public final void mo34941b(short s) {
        this.f4580d = (byte) (this.f4580d | 2);
        this.f4582f = s;
    }

    /* renamed from: c */
    public final boolean mo34942c() {
        return (this.f4580d & 1) != 0;
    }

    /* renamed from: d */
    public final boolean mo34943d() {
        return (this.f4580d & 2) != 0;
    }

    /* renamed from: e */
    public final void mo34944e() {
        this.f4580d = (byte) (this.f4580d | 1);
    }

    /* renamed from: f */
    public final void mo34945f() {
        this.f4580d = (byte) (this.f4580d & -2);
    }

    /* renamed from: g */
    public final byte mo34946g() {
        return this.f4577a;
    }

    /* renamed from: h */
    public final byte mo34947h() {
        return this.f4578b;
    }

    /* renamed from: i */
    public final short mo34948i() {
        return this.f4579c;
    }

    /* renamed from: j */
    public final short mo34949j() {
        return this.f4582f;
    }

    /* renamed from: k */
    public final byte mo34950k() {
        return this.f4580d;
    }

    public final String toString() {
        return ("PacketHeader [SID " + ((int) this.f4577a) + " , CID " + ((int) this.f4578b) + " , SER " + ((int) this.f4579c) + " , RES " + ((int) this.f4582f) + " , TAG " + ((int) this.f4580d) + " , LEN " + this.f4581e) + "]";
    }
}
