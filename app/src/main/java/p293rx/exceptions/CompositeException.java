package p293rx.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: rx.exceptions.CompositeException */
public final class CompositeException extends RuntimeException {
    public static final long serialVersionUID = 3026362227162912146L;
    public Throwable cause;
    public final List<Throwable> exceptions;
    public final String message;

    /* renamed from: rx.exceptions.CompositeException$CompositeExceptionCausalChain */
    public static final class CompositeExceptionCausalChain extends RuntimeException {
        public static final String MESSAGE = "Chain of Causes for CompositeException In Order Received =>";
        public static final long serialVersionUID = 3875212506787802066L;

        public String getMessage() {
            return MESSAGE;
        }
    }

    /* renamed from: rx.exceptions.CompositeException$OooO00o */
    public static abstract class OooO00o {
        public abstract Object OooO00o();

        public abstract void OooO00o(Object obj);
    }

    /* renamed from: rx.exceptions.CompositeException$OooO0O0 */
    public static final class OooO0O0 extends OooO00o {
        public final PrintStream OooO00o;

        public OooO0O0(PrintStream printStream) {
            this.OooO00o = printStream;
        }

        @Override // p293rx.exceptions.CompositeException.OooO00o
        public Object OooO00o() {
            return this.OooO00o;
        }

        @Override // p293rx.exceptions.CompositeException.OooO00o
        public void OooO00o(Object obj) {
            this.OooO00o.println(obj);
        }
    }

    /* renamed from: rx.exceptions.CompositeException$OooO0OO */
    public static final class OooO0OO extends OooO00o {
        public final PrintWriter OooO00o;

        public OooO0OO(PrintWriter printWriter) {
            this.OooO00o = printWriter;
        }

        @Override // p293rx.exceptions.CompositeException.OooO00o
        public Object OooO00o() {
            return this.OooO00o;
        }

        @Override // p293rx.exceptions.CompositeException.OooO00o
        public void OooO00o(Object obj) {
            this.OooO00o.println(obj);
        }
    }

    @Deprecated
    public CompositeException(String str, Collection<? extends Throwable> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (Throwable th : collection) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        this.exceptions = Collections.unmodifiableList(arrayList);
        this.message = this.exceptions.size() + " exceptions occurred. ";
    }

    private void OooO00o(OooO00o oooO00o) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        StackTraceElement[] stackTrace = getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            OooO00o(sb, th, "\t");
            i++;
        }
        synchronized (oooO00o.OooO00o()) {
            oooO00o.OooO00o(sb.toString());
        }
    }

    public synchronized Throwable getCause() {
        if (this.cause == null) {
            CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.exceptions.iterator();
            CompositeExceptionCausalChain compositeExceptionCausalChain2 = compositeExceptionCausalChain;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th : m22994OooO00o(next)) {
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        compositeExceptionCausalChain2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    compositeExceptionCausalChain2 = OooO00o(compositeExceptionCausalChain2);
                }
            }
            this.cause = compositeExceptionCausalChain;
        }
        return this.cause;
    }

    public List<Throwable> getExceptions() {
        return this.exceptions;
    }

    public String getMessage() {
        return this.message;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        OooO00o(new OooO0O0(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        OooO00o(new OooO0OO(printWriter));
    }

    private void OooO00o(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            OooO00o(sb, th.getCause(), "");
        }
    }

    public CompositeException(Collection<? extends Throwable> collection) {
        this(null, collection);
    }

    public CompositeException(Throwable... thArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (thArr != null) {
            for (Throwable th : thArr) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        this.exceptions = Collections.unmodifiableList(arrayList);
        this.message = this.exceptions.size() + " exceptions occurred. ";
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private List<Throwable> m22994OooO00o(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause2 = th.getCause();
        if (cause2 != null && cause2 != th) {
            while (true) {
                arrayList.add(cause2);
                Throwable cause3 = cause2.getCause();
                if (cause3 == null || cause3 == cause2) {
                    break;
                }
                cause2 = cause2.getCause();
            }
        }
        return arrayList;
    }

    private Throwable OooO00o(Throwable th) {
        Throwable cause2 = th.getCause();
        if (cause2 == null || cause2 == th) {
            return th;
        }
        while (true) {
            Throwable cause3 = cause2.getCause();
            if (cause3 == null || cause3 == cause2) {
                return cause2;
            }
            cause2 = cause2.getCause();
        }
        return cause2;
    }
}
