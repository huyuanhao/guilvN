package org.bouncycastle.cms;

import java.io.IOException;

public class CMSStreamException extends IOException {
    public final Throwable underlying;

    public CMSStreamException(String str) {
        super(str);
        this.underlying = null;
    }

    public CMSStreamException(String str, Throwable th) {
        super(str);
        this.underlying = th;
    }

    public Throwable getCause() {
        return this.underlying;
    }
}
