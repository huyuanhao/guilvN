package anet.channel.security;

/* renamed from: anet.channel.security.d */
public final class C0160d implements ISecurityFactory {
    @Override // anet.channel.security.ISecurityFactory
    public ISecurity createNonSecurity(String str) {
        return new C0157a(str);
    }

    @Override // anet.channel.security.ISecurityFactory
    public ISecurity createSecurity(String str) {
        return new C0158b(str);
    }
}
