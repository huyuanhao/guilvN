package anet.channel.security;

/* renamed from: anet.channel.security.c */
public class C0159c {

    /* renamed from: a */
    public static volatile ISecurityFactory f263a;

    /* renamed from: a */
    public static ISecurityFactory m153a() {
        if (f263a == null) {
            f263a = new C0160d();
        }
        return f263a;
    }
}
