package org.bouncycastle.i18n;

import com.p118pd.sdk.lLL1Il;
import java.util.Locale;

public class LocalizedException extends Exception {
    public Throwable cause;
    public lLL1Il message;

    public LocalizedException(lLL1Il lll1il) {
        super(lll1il.OooO00o(Locale.getDefault()));
        this.message = lll1il;
    }

    public LocalizedException(lLL1Il lll1il, Throwable th) {
        super(lll1il.OooO00o(Locale.getDefault()));
        this.message = lll1il;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public lLL1Il getErrorMessage() {
        return this.message;
    }
}
