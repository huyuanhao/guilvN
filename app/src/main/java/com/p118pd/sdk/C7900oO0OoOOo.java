package com.p118pd.sdk;

import java.util.Iterator;
import kotlin.BuilderInference;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000R\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aN\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2/\b\t\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f¢\u0006\u0002\b\u0011H\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aN\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\n0\u0014\"\u0004\b\u0000\u0010\n2/\b\t\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f¢\u0006\u0002\b\u0011H\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001aM\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2/\b\u0001\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aM\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\n0\u0014\"\u0004\b\u0000\u0010\n2/\b\u0001\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0007\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000*V\b\u0007\u0010\u0019\u001a\u0004\b\u0000\u0010\n\"\b\u0012\u0004\u0012\u0002H\n0\r2\b\u0012\u0004\u0012\u0002H\n0\rB6\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u001c\b\u001d\u0012\u0018\b\u000bB\u0014\b\u001e\u0012\u0006\b\u001f\u0012\u0002\b\f\u0012\b\b \u0012\u0004\b\b(!\u0012\n\b\"\u0012\u0006\b\n0#8$*\f\b\u0002\u0010%\"\u00020\u00012\u00020\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, mo43195d2 = {"State_Done", "", "Lkotlin/sequences/State;", "State_Failed", "State_ManyNotReady", "State_ManyReady", "State_NotReady", "State_Ready", "buildIterator", "", "T", "builderAction", "Lkotlin/Function2;", "Lkotlin/sequences/SequenceScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "buildSequence", "Lkotlin/sequences/Sequence;", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "iterator", "block", "sequence", "SequenceBuilder", "Lkotlin/Deprecated;", "message", "Use SequenceScope class instead.", "replaceWith", "Lkotlin/ReplaceWith;", "imports", "expression", "SequenceScope<T>", C8912ooOO0o0.OooO0O0, "Lkotlin/DeprecationLevel;", "ERROR", "State", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/sequences/SequencesKt")
/* renamed from: com.pd.sdk.oO0OoOOo  reason: case insensitive filesystem */
public class C7900oO0OoOOo {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;
    public static final int OooO0o = 5;
    public static final int OooO0o0 = 4;

    /* renamed from: com.pd.sdk.oO0OoOOo$OooO00o */
    public static final class OooO00o implements AbstractC7873oO0OOo00<T> {
        public final /* synthetic */ O00Oo000 OooO00o;

        public OooO00o(O00Oo000 o00Oo000) {
            this.OooO00o = o00Oo000;
        }

        @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
        @NotNull
        public Iterator<T> iterator() {
            return C7900oO0OoOOo.m19580OooO0O0(this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.oO0OoOOo$OooO0O0 */
    public static final class OooO0O0 implements AbstractC7873oO0OOo00<T> {
        public final /* synthetic */ O00Oo000 OooO00o;

        public OooO0O0(O00Oo000 o00Oo000) {
            this.OooO00o = o00Oo000;
        }

        @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
        @NotNull
        public Iterator<T> iterator() {
            return C7900oO0OoOOo.m19580OooO0O0(this.OooO00o);
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'sequence { }' function instead.", replaceWith = @ReplaceWith(expression = "sequence(builderAction)", imports = {}))
    public static final <T> AbstractC7873oO0OOo00<T> OooO00o(@BuilderInference O00Oo000<? super Oo0OoOO<? super T>, ? super AbstractC9282oooooO0<? super C9174oooOOooO>, ? extends Object> o00Oo000) {
        return new OooO00o(o00Oo000);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use SequenceScope class instead.", replaceWith = @ReplaceWith(expression = "SequenceScope<T>", imports = {}))
    public static /* synthetic */ void OooO00o() {
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> AbstractC7873oO0OOo00<T> OooO0O0(@BuilderInference @NotNull O00Oo000<? super Oo0OoOO<? super T>, ? super AbstractC9282oooooO0<? super C9174oooOOooO>, ? extends Object> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "block");
        return new OooO0O0(o00Oo000);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'iterator { }' function instead.", replaceWith = @ReplaceWith(expression = "iterator(builderAction)", imports = {}))
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> Iterator<T> m19579OooO00o(@BuilderInference O00Oo000<? super Oo0OoOO<? super T>, ? super AbstractC9282oooooO0<? super C9174oooOOooO>, ? extends Object> o00Oo000) {
        return m19580OooO0O0((O00Oo000) o00Oo000);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <T> Iterator<T> m19580OooO0O0(@BuilderInference @NotNull O00Oo000<? super Oo0OoOO<? super T>, ? super AbstractC9282oooooO0<? super C9174oooOOooO>, ? extends Object> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "block");
        C7896oO0OoO0o oo0ooo0o = new C7896oO0OoO0o();
        oo0ooo0o.OooO00o(IntrinsicsKt__IntrinsicsJvmKt.OooO00o((O00Oo000) o00Oo000, (Object) oo0ooo0o, (AbstractC9282oooooO0) oo0ooo0o));
        return oo0ooo0o;
    }
}
