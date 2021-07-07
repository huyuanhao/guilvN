package com.p118pd.sdk;

import java.io.PrintStream;
import java.io.PrintWriter;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooO0o00  reason: case insensitive filesystem */
public class C9138oooO0o00 {
    @InlineOnly
    public static final void OooO00o(@NotNull Throwable th) {
        if (th != null) {
            th.printStackTrace();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable");
    }

    public static /* synthetic */ void OooO0O0(Throwable th) {
    }

    @InlineOnly
    public static final void OooO00o(@NotNull Throwable th, PrintWriter printWriter) {
        if (th != null) {
            th.printStackTrace(printWriter);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable");
    }

    @InlineOnly
    public static final void OooO00o(@NotNull Throwable th, PrintStream printStream) {
        if (th != null) {
            th.printStackTrace(printStream);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable");
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final StackTraceElement[] m20878OooO00o(@NotNull Throwable th) {
        o0O0OO00.OooO0o(th, "receiver$0");
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null) {
            o0O0OO00.OooO0o0();
        }
        return stackTrace;
    }

    public static final void OooO00o(@NotNull Throwable th, @NotNull Throwable th2) {
        o0O0OO00.OooO0o(th, "receiver$0");
        o0O0OO00.OooO0o(th2, "exception");
        O000O000.OooO00o.OooO00o(th, th2);
    }
}
