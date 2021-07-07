package org.bouncycastle.dvcs;

public class DVCSConstructionException extends DVCSException {
    public static final long serialVersionUID = 660035299653583980L;

    public DVCSConstructionException(String str) {
        super(str);
    }

    public DVCSConstructionException(String str, Throwable th) {
        super(str, th);
    }
}
