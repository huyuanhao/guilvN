package com.p118pd.sdk;

import com.facebook.react.uimanager.ViewProps;
import com.taobao.accs.AccsClientConfig;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u001a0\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\fH\b¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, mo43195d2 = {"thread", "Ljava/lang/Thread;", ViewProps.START, "", "isDaemon", "contextClassLoader", "Ljava/lang/ClassLoader;", "name", "", AbstractC8411oOoo0Oo0.OooOOo, "", "block", "Lkotlin/Function0;", "", "getOrSet", "T", "", "Ljava/lang/ThreadLocal;", AccsClientConfig.DEFAULT_CONFIGTAG, "(Ljava/lang/ThreadLocal;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, mo43196k = 2, mo43197mv = {1, 1, 13})
@JvmName(name = "ThreadsKt")
/* renamed from: com.pd.sdk.ooooOOo  reason: case insensitive filesystem */
public final class C9265ooooOOo {

    /* renamed from: com.pd.sdk.ooooOOo$OooO00o */
    public static final class OooO00o extends Thread {
        public final /* synthetic */ O00O0000 OooO00o;

        public OooO00o(O00O0000 o00o0000) {
            this.OooO00o = o00o0000;
        }

        public void run() {
            this.OooO00o.invoke();
        }
    }

    @NotNull
    public static /* synthetic */ Thread OooO00o(boolean z, boolean z2, ClassLoader classLoader, String str, int i, O00O0000 o00o0000, int i2, Object obj) {
        return OooO00o((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : classLoader, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? -1 : i, o00o0000);
    }

    @NotNull
    public static final Thread OooO00o(boolean z, boolean z2, @Nullable ClassLoader classLoader, @Nullable String str, int i, @NotNull O00O0000<C9174oooOOooO> o00o0000) {
        o0O0OO00.OooO0o(o00o0000, "block");
        OooO00o oooO00o = new OooO00o(o00o0000);
        if (z2) {
            oooO00o.setDaemon(true);
        }
        if (i > 0) {
            oooO00o.setPriority(i);
        }
        if (str != null) {
            oooO00o.setName(str);
        }
        if (classLoader != null) {
            oooO00o.setContextClassLoader(classLoader);
        }
        if (z) {
            oooO00o.start();
        }
        return oooO00o;
    }

    @InlineOnly
    public static final <T> T OooO00o(@NotNull ThreadLocal<T> threadLocal, O00O0000<? extends T> o00o0000) {
        T t = threadLocal.get();
        if (t != null) {
            return t;
        }
        T t2 = (T) o00o0000.invoke();
        threadLocal.set(t2);
        return t2;
    }
}
