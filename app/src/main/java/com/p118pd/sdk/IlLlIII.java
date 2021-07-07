package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import p293rx.exceptions.AssemblyStackTraceException;

/* renamed from: com.pd.sdk.IlLlIII */
public final class IlLlIII<T> implements C9349III.OooO00o<T> {
    public static volatile boolean OooO0O0;
    public final C9349III.OooO00o<T> OooO00o;
    public final String o0ooOOo = OooO00o();

    /* renamed from: com.pd.sdk.IlLlIII$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> {
        public final AbstractC9508LiLi<? super T> OooO00o;
        public final String o0ooOOo;

        public OooO00o(AbstractC9508LiLi<? super T> r1, String str) {
            super(r1);
            this.OooO00o = r1;
            this.o0ooOOo = str;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            new AssemblyStackTraceException(this.o0ooOOo).attachTo(th);
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO00o.onNext(t);
        }
    }

    public IlLlIII(C9349III.OooO00o<T> oooO00o) {
        this.OooO00o = oooO00o;
    }

    public static String OooO00o() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder("Assembly trace:");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String stackTraceElement2 = stackTraceElement.toString();
            if (OooO0O0 || (stackTraceElement.getLineNumber() > 1 && !stackTraceElement2.contains("RxJavaHooks.") && !stackTraceElement2.contains("OnSubscribeOnAssembly") && !stackTraceElement2.contains(".junit.runner") && !stackTraceElement2.contains(".junit4.runner") && !stackTraceElement2.contains(".junit.internal") && !stackTraceElement2.contains("sun.reflect") && !stackTraceElement2.contains("java.lang.Thread.") && !stackTraceElement2.contains("ThreadPoolExecutor") && !stackTraceElement2.contains("org.apache.catalina.") && !stackTraceElement2.contains("org.apache.tomcat."))) {
                sb.append("\n at ");
                sb.append(stackTraceElement2);
            }
        }
        sb.append("\nOriginal exception:");
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.丨III$OooO00o<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r4) {
        this.OooO00o.call(new OooO00o(r4, this.o0ooOOo));
    }
}
