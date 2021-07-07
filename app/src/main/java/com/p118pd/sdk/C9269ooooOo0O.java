package com.p118pd.sdk;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aJ\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001aL\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a\u001a\u0010\u0010\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001aJ\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001aL\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a$\u0010\u0011\u001a\u00020\f2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a0\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a8\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a0\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a8\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a8\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a8\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b¨\u0006\u0016"}, mo43195d2 = {"fixedRateTimer", "Ljava/util/Timer;", "name", "", "daemon", "", "startAt", "Ljava/util/Date;", "period", "", "action", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "", "Lkotlin/ExtensionFunctionType;", "initialDelay", "timer", "timerTask", "schedule", "time", "delay", "scheduleAtFixedRate", "kotlin-stdlib"}, mo43196k = 2, mo43197mv = {1, 1, 13})
@JvmName(name = "TimersKt")
/* renamed from: com.pd.sdk.ooooOo0O  reason: case insensitive filesystem */
public final class C9269ooooOo0O {

    /* renamed from: com.pd.sdk.ooooOo0O$OooO00o */
    public static final class OooO00o extends TimerTask {
        public final /* synthetic */ O00O0OOO OooO00o;

        public OooO00o(O00O0OOO o00o0ooo) {
            this.OooO00o = o00o0ooo;
        }

        public void run() {
            this.OooO00o.invoke(this);
        }
    }

    @InlineOnly
    public static final TimerTask OooO00o(@NotNull Timer timer, long j, O00O0OOO<? super TimerTask, C9174oooOOooO> o00o0ooo) {
        OooO00o oooO00o = new OooO00o(o00o0ooo);
        timer.schedule(oooO00o, j);
        return oooO00o;
    }

    @InlineOnly
    public static final TimerTask OooO0O0(@NotNull Timer timer, long j, long j2, O00O0OOO<? super TimerTask, C9174oooOOooO> o00o0ooo) {
        OooO00o oooO00o = new OooO00o(o00o0ooo);
        timer.scheduleAtFixedRate(oooO00o, j, j2);
        return oooO00o;
    }

    @InlineOnly
    public static final TimerTask OooO00o(@NotNull Timer timer, Date date, O00O0OOO<? super TimerTask, C9174oooOOooO> o00o0ooo) {
        OooO00o oooO00o = new OooO00o(o00o0ooo);
        timer.schedule(oooO00o, date);
        return oooO00o;
    }

    @InlineOnly
    public static final TimerTask OooO0O0(@NotNull Timer timer, Date date, long j, O00O0OOO<? super TimerTask, C9174oooOOooO> o00o0ooo) {
        OooO00o oooO00o = new OooO00o(o00o0ooo);
        timer.scheduleAtFixedRate(oooO00o, date, j);
        return oooO00o;
    }

    @InlineOnly
    public static final TimerTask OooO00o(@NotNull Timer timer, long j, long j2, O00O0OOO<? super TimerTask, C9174oooOOooO> o00o0ooo) {
        OooO00o oooO00o = new OooO00o(o00o0ooo);
        timer.schedule(oooO00o, j, j2);
        return oooO00o;
    }

    @InlineOnly
    public static final Timer OooO0O0(String str, boolean z, long j, long j2, O00O0OOO<? super TimerTask, C9174oooOOooO> o00o0ooo) {
        Timer OooO00o2 = OooO00o(str, z);
        OooO00o2.schedule(new OooO00o(o00o0ooo), j, j2);
        return OooO00o2;
    }

    @InlineOnly
    public static final TimerTask OooO00o(@NotNull Timer timer, Date date, long j, O00O0OOO<? super TimerTask, C9174oooOOooO> o00o0ooo) {
        OooO00o oooO00o = new OooO00o(o00o0ooo);
        timer.schedule(oooO00o, date, j);
        return oooO00o;
    }

    @InlineOnly
    public static final Timer OooO0O0(String str, boolean z, Date date, long j, O00O0OOO<? super TimerTask, C9174oooOOooO> o00o0ooo) {
        Timer OooO00o2 = OooO00o(str, z);
        OooO00o2.schedule(new OooO00o(o00o0ooo), date, j);
        return OooO00o2;
    }

    @PublishedApi
    @NotNull
    public static final Timer OooO00o(@Nullable String str, boolean z) {
        return str == null ? new Timer(z) : new Timer(str, z);
    }

    @InlineOnly
    public static /* synthetic */ Timer OooO0O0(String str, boolean z, long j, long j2, O00O0OOO o00o0ooo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        Timer OooO00o2 = OooO00o(str, z);
        OooO00o2.schedule(new OooO00o(o00o0ooo), j, j2);
        return OooO00o2;
    }

    @InlineOnly
    public static final Timer OooO00o(String str, boolean z, long j, long j2, O00O0OOO<? super TimerTask, C9174oooOOooO> o00o0ooo) {
        Timer OooO00o2 = OooO00o(str, z);
        OooO00o2.scheduleAtFixedRate(new OooO00o(o00o0ooo), j, j2);
        return OooO00o2;
    }

    @InlineOnly
    public static /* synthetic */ Timer OooO0O0(String str, boolean z, Date date, long j, O00O0OOO o00o0ooo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        Timer OooO00o2 = OooO00o(str, z);
        OooO00o2.schedule(new OooO00o(o00o0ooo), date, j);
        return OooO00o2;
    }

    @InlineOnly
    public static final Timer OooO00o(String str, boolean z, Date date, long j, O00O0OOO<? super TimerTask, C9174oooOOooO> o00o0ooo) {
        Timer OooO00o2 = OooO00o(str, z);
        OooO00o2.scheduleAtFixedRate(new OooO00o(o00o0ooo), date, j);
        return OooO00o2;
    }

    @InlineOnly
    public static final TimerTask OooO00o(O00O0OOO<? super TimerTask, C9174oooOOooO> o00o0ooo) {
        return new OooO00o(o00o0ooo);
    }

    @InlineOnly
    public static /* synthetic */ Timer OooO00o(String str, boolean z, long j, long j2, O00O0OOO o00o0ooo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        Timer OooO00o2 = OooO00o(str, z);
        OooO00o2.scheduleAtFixedRate(new OooO00o(o00o0ooo), j, j2);
        return OooO00o2;
    }

    @InlineOnly
    public static /* synthetic */ Timer OooO00o(String str, boolean z, Date date, long j, O00O0OOO o00o0ooo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        Timer OooO00o2 = OooO00o(str, z);
        OooO00o2.scheduleAtFixedRate(new OooO00o(o00o0ooo), date, j);
        return OooO00o2;
    }
}
