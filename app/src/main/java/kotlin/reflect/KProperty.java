package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u000e\u000fR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\u000bR\u001a\u0010\f\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\u000b¨\u0006\u0010"}, mo43195d2 = {"Lkotlin/reflect/KProperty;", "R", "Lkotlin/reflect/KCallable;", "getter", "Lkotlin/reflect/KProperty$Getter;", "getGetter", "()Lkotlin/reflect/KProperty$Getter;", "isConst", "", "isConst$annotations", "()V", "()Z", "isLateinit", "isLateinit$annotations", "Accessor", "Getter", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oO0O00O0  reason: invalid package */
public interface KProperty<R> extends KCallable<R> {

    /* renamed from: com.pd.sdk.oO0O00O0$OooO00o */
    public interface OooO00o<R> {
        @NotNull
        KProperty<R> OooO00o();
    }

    /* renamed from: com.pd.sdk.oO0O00O0$OooO0O0 */
    public static final class OooO0O0 {
        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void OooO00o() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void OooO0O0() {
        }
    }

    /* renamed from: com.pd.sdk.oO0O00O0$OooO0OO */
    public interface OooO0OO<R> extends OooO00o<R>, KFunction<R> {
    }

    @NotNull
    OooO0OO<R> getGetter();

    boolean isConst();

    boolean isLateinit();
}
