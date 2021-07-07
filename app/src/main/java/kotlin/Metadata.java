package kotlin;

import com.p118pd.sdk.C8669oo0OoOO;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3416b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.JvmName;

@Target({ElementType.TYPE})
@SinceKotlin(version = "1.3")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\\\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003R\u0011\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\r\u001a\u00020\u0003X\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t8\u0007¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0012\u0010\f\u001a\u00020\tX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, mo43195d2 = {"Lkotlin/Metadata;", "", "kind", "", "metadataVersion", "", "bytecodeVersion", C8669oo0OoOO.OooO00o, "", "", "data2", "extraString", Constants.KEY_PACKAGE_NAME, "extraInt", "bv", "()[I", "d1", "()[Ljava/lang/String;", "d2", "xi", "()I", "xs", "()Ljava/lang/String;", "k", "mv", C3416b.f8452ad, "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public @interface Metadata {
    @JvmName(name = "bv")
    /* renamed from: bv */
    int[] mo43193bv() default {};

    @JvmName(name = "d1")
    /* renamed from: d1 */
    String[] mo43194d1() default {};

    @JvmName(name = "d2")
    /* renamed from: d2 */
    String[] mo43195d2() default {};

    @JvmName(name = "k")
    /* renamed from: k */
    int mo43196k() default 1;

    @JvmName(name = "mv")
    /* renamed from: mv */
    int[] mo43197mv() default {};

    @JvmName(name = C3416b.f8452ad)
    /* renamed from: pn */
    String mo43198pn() default "";

    @JvmName(name = "xi")
    /* renamed from: xi */
    int mo43199xi() default 0;

    @JvmName(name = "xs")
    /* renamed from: xs */
    String mo43200xs() default "";
}
