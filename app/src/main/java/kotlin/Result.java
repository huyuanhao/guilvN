package kotlin;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.p118pd.sdk.C9157oooOO0Oo;
import com.p118pd.sdk.O0o0o;
import com.p118pd.sdk.o0O0OO00;
import java.io.Serializable;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001e\u001fB\u0016\b\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\b¢\u0006\u0004\b\u0017\u0010\u0007J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, mo43195d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isFailure", "", "isFailure-impl", "(Ljava/lang/Object;)Z", "isSuccess", "isSuccess-impl", "value$annotations", "()V", "equals", DispatchConstants.OTHER, "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getOrNull", "getOrNull-impl", "hashCode", "", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "Companion", "Failure", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public final class Result<T> implements Serializable {
    public static final OooO00o Companion = new OooO00o(null);
    @Nullable
    public final Object value;

    @Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo43195d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "exception", "", "(Ljava/lang/Throwable;)V", "equals", "", DispatchConstants.OTHER, "", "hashCode", "", "toString", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
    public static final class Failure implements Serializable {
        @JvmField
        @NotNull
        public final Throwable exception;

        public Failure(@NotNull Throwable th) {
            o0O0OO00.OooO0o(th, "exception");
            this.exception = th;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof Failure) && o0O0OO00.OooO00o(this.exception, ((Failure) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    public static final class OooO00o {
        public OooO00o() {
        }

        @InlineOnly
        private final <T> Object OooO00o(T t) {
            return Result.m22101constructorimpl(t);
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }

        @InlineOnly
        private final <T> Object OooO00o(Throwable th) {
            return Result.m22101constructorimpl(C9157oooOO0Oo.OooO00o(th));
        }
    }

    @PublishedApi
    public /* synthetic */ Result(@Nullable Object obj) {
        this.value = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    public static final T OooO00o(Object obj) {
        if (m22106isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    @NotNull
    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Result m22100boximpl(@Nullable Object obj) {
        return new Result(obj);
    }

    @PublishedApi
    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static Object m22101constructorimpl(@Nullable Object obj) {
        return obj;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m22102equalsimpl(Object obj, @Nullable Object obj2) {
        return (obj2 instanceof Result) && o0O0OO00.OooO00o(obj, ((Result) obj2).m22109unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m22103equalsimpl0(@Nullable Object obj, @Nullable Object obj2) {
        throw null;
    }

    @Nullable
    /* renamed from: exceptionOrNull-impl  reason: not valid java name */
    public static final Throwable m22104exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m22105hashCodeimpl(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: isFailure-impl  reason: not valid java name */
    public static final boolean m22106isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    /* renamed from: isSuccess-impl  reason: not valid java name */
    public static final boolean m22107isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m22108toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    @PublishedApi
    public static /* synthetic */ void value$annotations() {
    }

    public boolean equals(Object obj) {
        return m22102equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m22105hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m22108toStringimpl(this.value);
    }

    @Nullable
    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m22109unboximpl() {
        return this.value;
    }
}
