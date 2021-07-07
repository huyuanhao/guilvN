package anet.channel.strategy;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.strategy.c */
public class C0180c {

    /* renamed from: a */
    public final ConcurrentHashMap<String, String> f369a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public boolean f370b = true;

    /* renamed from: anet.channel.strategy.c$a */
    public static class C0181a {

        /* renamed from: a */
        public static C0180c f371a = new C0180c();
    }

    /* renamed from: a */
    public void mo3704a(boolean z) {
        this.f370b = z;
    }

    /* renamed from: b */
    public void mo3705b(String str) {
        this.f369a.put(str, "http");
    }

    /* renamed from: a */
    public String mo3703a(String str) {
        if (!this.f370b) {
            return null;
        }
        String str2 = this.f369a.get(str);
        if (str2 != null) {
            return str2;
        }
        this.f369a.put(str, "https");
        return "https";
    }
}
