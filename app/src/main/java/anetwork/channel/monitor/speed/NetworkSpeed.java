package anetwork.channel.monitor.speed;

public enum NetworkSpeed {
    Slow("弱网络", 1),
    Fast("强网络", 5);
    
    public final int code;
    public final String desc;

    /* access modifiers changed from: public */
    NetworkSpeed(String str, int i) {
        this.desc = str;
        this.code = i;
    }

    public static NetworkSpeed valueOfCode(int i) {
        return i == 1 ? Slow : Fast;
    }

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
