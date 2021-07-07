package com.vivo.push.p281b;

import com.vivo.push.C4026a;

/* renamed from: com.vivo.push.b.w */
public final class C4057w extends AbstractC4058x {

    /* renamed from: a */
    public long f10945a = -1;

    /* renamed from: b */
    public int f10946b;

    public C4057w() {
        super(20);
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.p281b.AbstractC4058x, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        aVar.mo40878a("undo_msg_v1", this.f10945a);
        aVar.mo40877a("undo_msg_type_v1", this.f10946b);
    }

    /* renamed from: d */
    public final long mo40935d() {
        return this.f10945a;
    }

    /* renamed from: e */
    public final String mo40936e() {
        long j = this.f10945a;
        if (j != -1) {
            return String.valueOf(j);
        }
        return null;
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    public final String toString() {
        return "OnUndoMsgCommand";
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.p281b.AbstractC4058x, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        this.f10945a = aVar.mo40884b("undo_msg_v1", this.f10945a);
        this.f10946b = aVar.mo40883b("undo_msg_type_v1", 0);
    }
}
