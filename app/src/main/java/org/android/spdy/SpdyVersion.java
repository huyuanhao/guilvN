package org.android.spdy;

public enum SpdyVersion {
    SPDY2(2),
    SPDY3(3),
    SPDY3DOT1(4);
    
    public int version;

    /* access modifiers changed from: public */
    SpdyVersion(int i) {
        this.version = i;
    }

    public int getInt() {
        return this.version;
    }
}
