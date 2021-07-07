package org.bouncycastle.x509;

import com.p118pd.sdk.lLL1Il;
import java.security.cert.CertPath;
import org.bouncycastle.i18n.LocalizedException;

public class CertPathReviewerException extends LocalizedException {
    public CertPath certPath = null;
    public int index = -1;

    public CertPathReviewerException(lLL1Il lll1il) {
        super(lll1il);
    }

    public CertPathReviewerException(lLL1Il lll1il, Throwable th) {
        super(lll1il, th);
    }

    public CertPathReviewerException(lLL1Il lll1il, Throwable th, CertPath certPath2, int i) {
        super(lll1il, th);
        if (certPath2 == null || i == -1) {
            throw new IllegalArgumentException();
        } else if (i < -1 || (certPath2 != null && i >= certPath2.getCertificates().size())) {
            throw new IndexOutOfBoundsException();
        } else {
            this.certPath = certPath2;
            this.index = i;
        }
    }

    public CertPathReviewerException(lLL1Il lll1il, CertPath certPath2, int i) {
        super(lll1il);
        if (certPath2 == null || i == -1) {
            throw new IllegalArgumentException();
        } else if (i < -1 || (certPath2 != null && i >= certPath2.getCertificates().size())) {
            throw new IndexOutOfBoundsException();
        } else {
            this.certPath = certPath2;
            this.index = i;
        }
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getIndex() {
        return this.index;
    }
}
