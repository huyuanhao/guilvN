package anet.channel;

import anet.channel.security.ISecurity;
import anet.channel.strategy.dispatch.IAmdcSign;

/* renamed from: anet.channel.c */
public class C0118c implements IAmdcSign {

    /* renamed from: a */
    public final /* synthetic */ String f120a;

    /* renamed from: b */
    public final /* synthetic */ ISecurity f121b;

    /* renamed from: c */
    public final /* synthetic */ SessionCenter f122c;

    public C0118c(SessionCenter sessionCenter, String str, ISecurity iSecurity) {
        this.f122c = sessionCenter;
        this.f120a = str;
        this.f121b = iSecurity;
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public String getAppkey() {
        return this.f120a;
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public String sign(String str) {
        return this.f121b.sign(this.f122c.f66b, ISecurity.SIGN_ALGORITHM_HMAC_SHA1, getAppkey(), str);
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public boolean useSecurityGuard() {
        return !this.f121b.isSecOff();
    }
}
