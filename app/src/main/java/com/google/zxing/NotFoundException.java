package com.google.zxing;

public final class NotFoundException extends ReaderException {
    public static final NotFoundException INSTANCE;

    static {
        NotFoundException notFoundException = new NotFoundException();
        INSTANCE = notFoundException;
        notFoundException.setStackTrace(ReaderException.NO_TRACE);
    }

    public static NotFoundException getNotFoundInstance() {
        return INSTANCE;
    }
}
