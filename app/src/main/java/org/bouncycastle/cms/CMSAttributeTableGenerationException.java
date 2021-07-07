package org.bouncycastle.cms;

public class CMSAttributeTableGenerationException extends CMSRuntimeException {

    /* renamed from: e */
    public Exception f13483e;

    public CMSAttributeTableGenerationException(String str) {
        super(str);
    }

    public CMSAttributeTableGenerationException(String str, Exception exc) {
        super(str);
        this.f13483e = exc;
    }

    @Override // org.bouncycastle.cms.CMSRuntimeException
    public Throwable getCause() {
        return this.f13483e;
    }

    @Override // org.bouncycastle.cms.CMSRuntimeException
    public Exception getUnderlyingException() {
        return this.f13483e;
    }
}
