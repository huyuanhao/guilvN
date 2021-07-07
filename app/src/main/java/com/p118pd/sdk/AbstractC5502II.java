package com.p118pd.sdk;

import java.io.PrintStream;
import org.bouncycastle.util.test.TestFailedException;

/* renamed from: com.pd.sdk.I丨I  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5502II implements AbstractC6857lLll {
    public static void OooO00o(AbstractC6857lLll r1) {
        OooO00o(r1, System.out);
    }

    public static void OooO00o(AbstractC6857lLll r1, PrintStream printStream) {
        AbstractC6638li1iIL OooO00o = r1.OooO00o();
        printStream.println(OooO00o.toString());
        if (OooO00o.OooO00o() != null) {
            OooO00o.OooO00o().printStackTrace(printStream);
        }
    }

    private AbstractC6638li1iIL OooO0O0() {
        return C6476lI11.OooO0O0(this, "Okay");
    }

    @Override // com.p118pd.sdk.AbstractC6857lLll
    public AbstractC6638li1iIL OooO00o() {
        try {
            m15752OooO00o();
            return OooO0O0();
        } catch (TestFailedException e) {
            return e.getResult();
        } catch (Exception e2) {
            return C6476lI11.OooO00o(this, "Exception: " + e2, e2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6857lLll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m15752OooO00o() throws Exception;

    public void OooO00o(int i, int i2) {
        if (i != i2) {
            throw new TestFailedException(C6476lI11.OooO00o(this, "no message"));
        }
    }

    public void OooO00o(long j, long j2) {
        if (j != j2) {
            throw new TestFailedException(C6476lI11.OooO00o(this, "no message"));
        }
    }

    public void OooO00o(Object obj, Object obj2) {
        if (!obj.equals(obj2)) {
            throw new TestFailedException(C6476lI11.OooO00o(this, "no message"));
        }
    }

    public void OooO00o(String str) {
        throw new TestFailedException(C6476lI11.OooO00o(this, str));
    }

    public void OooO00o(String str, long j, long j2) {
        if (j != j2) {
            throw new TestFailedException(C6476lI11.OooO00o(this, str));
        }
    }

    public void OooO00o(String str, Object obj, Object obj2) {
        throw new TestFailedException(C6476lI11.OooO00o(this, str, obj, obj2));
    }

    public void OooO00o(String str, Throwable th) {
        throw new TestFailedException(C6476lI11.OooO00o(this, str, th));
    }

    public void OooO00o(String str, boolean z) {
        if (!z) {
            throw new TestFailedException(C6476lI11.OooO00o(this, str));
        }
    }

    public void OooO00o(String str, boolean z, boolean z2) {
        if (z != z2) {
            throw new TestFailedException(C6476lI11.OooO00o(this, str));
        }
    }

    public void OooO00o(boolean z) {
        if (!z) {
            throw new TestFailedException(C6476lI11.OooO00o(this, "no message"));
        }
    }

    public boolean OooO00o(byte[] bArr, byte[] bArr2) {
        return C9586iIILl.m21627OooO00o(bArr, bArr2);
    }

    public boolean OooO00o(byte[][] bArr, byte[][] bArr2) {
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (!OooO00o(bArr[i], bArr2[i])) {
                return false;
            }
        }
        return true;
    }

    public void OooO0O0(String str, Object obj, Object obj2) {
        if (obj != null || obj2 != null) {
            if (obj == null) {
                throw new TestFailedException(C6476lI11.OooO00o(this, str));
            } else if (obj2 == null) {
                throw new TestFailedException(C6476lI11.OooO00o(this, str));
            } else if (!obj.equals(obj2)) {
                throw new TestFailedException(C6476lI11.OooO00o(this, str));
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6857lLll
    public abstract String getName();
}
