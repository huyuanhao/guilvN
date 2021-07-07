package p293rx.exceptions;

import com.p118pd.sdk.C9714lli;
import java.util.HashSet;

/* renamed from: rx.exceptions.AssemblyStackTraceException */
public final class AssemblyStackTraceException extends RuntimeException {
    public static final long serialVersionUID = 2038859767182585852L;

    public AssemblyStackTraceException(String str) {
        super(str);
    }

    public static AssemblyStackTraceException find(Throwable th) {
        HashSet hashSet = new HashSet();
        while (!(th instanceof AssemblyStackTraceException)) {
            if (th == null || th.getCause() == null) {
                return null;
            }
            th = th.getCause();
            if (!hashSet.add(th)) {
                return null;
            }
        }
        return (AssemblyStackTraceException) th;
    }

    public void attachTo(Throwable th) {
        HashSet hashSet = new HashSet();
        while (th.getCause() != null) {
            th = th.getCause();
            if (!hashSet.add(th)) {
                C9714lli.m21756OooO00o((Throwable) this);
                return;
            }
        }
        try {
            th.initCause(this);
        } catch (IllegalStateException unused) {
            C9714lli.m21756OooO00o((Throwable) new RuntimeException("Received an exception with a cause set to null, instead of being unset. To fix this, look down the chain of causes. The last exception had a cause explicitly set to null. It should be unset instead.", th));
        }
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
