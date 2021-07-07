package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.internal.Util;

public final class RouteException extends RuntimeException {
    public IOException firstException;
    public IOException lastException;

    public RouteException(IOException iOException) {
        super(iOException);
        this.firstException = iOException;
        this.lastException = iOException;
    }

    public void addConnectException(IOException iOException) {
        Util.addSuppressedIfPossible(this.firstException, iOException);
        this.lastException = iOException;
    }

    public IOException getFirstConnectException() {
        return this.firstException;
    }

    public IOException getLastConnectException() {
        return this.lastException;
    }
}
