package org.android.spdy;

public enum SslMod {
    SLIGHT_SLL_NOT_ENCRYT(0),
    SLIGHT_SSL_0_RTT(1);
    
    public int code;

    /* access modifiers changed from: public */
    SslMod(int i) {
        this.code = i;
    }

    public int getint() {
        return this.code;
    }
}
