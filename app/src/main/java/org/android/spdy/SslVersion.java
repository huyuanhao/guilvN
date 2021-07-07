package org.android.spdy;

public enum SslVersion {
    SLIGHT_VERSION_V1(0);
    
    public int code;

    /* access modifiers changed from: public */
    SslVersion(int i) {
        this.code = i;
    }

    public int getint() {
        return this.code;
    }
}
