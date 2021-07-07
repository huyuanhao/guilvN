package com.p118pd.sdk;

import java.util.Iterator;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2/\b\u0001\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aM\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\n0\u0014\"\u0004\b\u0000\u0010\n2/\b\u0001\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0007\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000*\f\b\u0002\u0010\u0016\"\u00020\u00012\u00020\u0001\u0002\u0004\n\u0002\b\t¨\u0006\u0017"}, mo43195d2 = {"State_Done", "", "Lkotlin/coroutines/experimental/State;", "State_Failed", "State_ManyNotReady", "State_ManyReady", "State_NotReady", "State_Ready", "buildIterator", "", "T", "builderAction", "Lkotlin/Function2;", "Lkotlin/coroutines/experimental/SequenceBuilder;", "Lkotlin/coroutines/experimental/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "buildSequence", "Lkotlin/sequences/Sequence;", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "State", "kotlin-stdlib_coroutines"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/coroutines/experimental/SequenceBuilderKt")
/* renamed from: com.pd.sdk.ooooooO0  reason: case insensitive filesystem */
public class C9293ooooooO0 {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;
    public static final int OooO0o = 5;
    public static final int OooO0o0 = 4;

    /* renamed from: com.pd.sdk.ooooooO0$OooO00o */
    public static final class OooO00o implements AbstractC7873oO0OOo00<T> {
        public final /* synthetic */ O00Oo000 OooO00o;

        public OooO00o(O00Oo000 o00Oo000) {
            this.OooO00o = o00Oo000;
        }

        @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
        @NotNull
        public Iterator<T> iterator() {
            return C9293ooooooO0.m21223OooO00o(this.OooO00o);
        }
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T> AbstractC7873oO0OOo00<T> OooO00o(@BuilderInference @NotNull O00Oo000<? super AbstractC9290oooooo0<? super T>, ? super AbstractC9285oooooOO<? super C9174oooOOooO>, ? extends Object> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "builderAction");
        return new OooO00o(o00Oo000);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> Iterator<T> m21223OooO00o(@BuilderInference @NotNull O00Oo000<? super AbstractC9290oooooo0<? super T>, ? super AbstractC9285oooooOO<? super C9174oooOOooO>, ? extends Object> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "builderAction");
        C9291oooooo0O oooooo0o = new C9291oooooo0O();
        oooooo0o.OooO00o(C9295ooooooOo.OooO00o((O00Oo000) o00Oo000, (Object) oooooo0o, (AbstractC9285oooooOO) oooooo0o));
        return oooooo0o;
    }
}
