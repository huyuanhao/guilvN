package com.google.zxing;

public final class FormatException extends ReaderException {
    public static final FormatException INSTANCE;

    static {
        FormatException formatException = new FormatException();
        INSTANCE = formatException;
        formatException.setStackTrace(ReaderException.NO_TRACE);
    }

    public FormatException() {
    }

    public static FormatException getFormatInstance() {
        return ReaderException.isStackTrace ? new FormatException() : INSTANCE;
    }

    public FormatException(Throwable th) {
        super(th);
    }

    public static FormatException getFormatInstance(Throwable th) {
        return ReaderException.isStackTrace ? new FormatException(th) : INSTANCE;
    }
}
