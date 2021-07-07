package anet.channel.monitor;

public enum NetworkSpeed {
    Slow("弱网络", 1),
    Fast("强网络", 5);
    

    /* renamed from: a */
    public final String f179a;

    /* renamed from: b */
    public final int f180b;

    /* access modifiers changed from: public */
    NetworkSpeed(String str, int i) {
        this.f179a = str;
        this.f180b = i;
    }

    public static NetworkSpeed valueOfCode(int i) {
        return i == 1 ? Slow : Fast;
    }

    public int getCode() {
        return this.f180b;
    }

    public String getDesc() {
        return this.f179a;
    }
}
