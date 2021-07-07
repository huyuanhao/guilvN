package com.qiyukf.nimlib.p155a.p162c.p166d;

import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2295b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2297d;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.a.c.d.b */
public final class C2141b extends AbstractC2131a {

    /* renamed from: a */
    public List<String> f4300a = new ArrayList(1);

    /* renamed from: a */
    public final void mo34683a(String str, SessionTypeEnum sessionTypeEnum) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (sessionTypeEnum == SessionTypeEnum.P2P) {
            str2 = "p2p|";
        } else if (sessionTypeEnum == SessionTypeEnum.Team) {
            str2 = "team|";
        } else {
            throw new IllegalArgumentException("only support p2p and team.");
        }
        sb.append(str2);
        sb.append(str);
        this.f4300a.add(sb.toString());
    }

    @Override // com.qiyukf.nimlib.p155a.p162c.AbstractC2131a
    /* renamed from: b */
    public final C2295b mo34669b() {
        C2295b bVar = new C2295b();
        C2297d.m4894a(bVar, this.f4300a);
        return bVar;
    }

    @Override // com.qiyukf.nimlib.p155a.p162c.AbstractC2131a
    /* renamed from: c */
    public final byte mo34670c() {
        return 7;
    }

    @Override // com.qiyukf.nimlib.p155a.p162c.AbstractC2131a
    /* renamed from: d */
    public final byte mo34671d() {
        return 9;
    }
}
