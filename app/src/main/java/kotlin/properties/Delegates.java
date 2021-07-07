package kotlin.properties;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0000\u0010\u0005*\u00020\u0001J}\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052Q\b\u0004\u0010\b\u001aK\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\b¢\u0006\u0002\u0010\u0011J}\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052Q\b\u0004\u0010\b\u001aK\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00130\tH\b¢\u0006\u0002\u0010\u0011¨\u0006\u0014"}, mo43195d2 = {"Lkotlin/properties/Delegates;", "", "()V", "notNull", "Lkotlin/properties/ReadWriteProperty;", "T", "observable", "initialValue", "onChange", "Lkotlin/Function3;", "Lkotlin/reflect/KProperty;", "Lkotlin/ParameterName;", "name", C8404oOoo0O00.OooOO0, "oldValue", "newValue", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlin/properties/ReadWriteProperty;", "vetoable", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.o0ooo0O0  reason: invalid package */
public final class Delegates {
    public static final Delegates OooO00o = new Delegates();

    /* renamed from: com.pd.sdk.o0ooo0O0$OooO00o */
    public static final class OooO00o extends O0oOOO<T> {
        public final /* synthetic */ O00Oo00O OooO00o;
        public final /* synthetic */ Object OooO0O0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(O00Oo00O o00Oo00O, Object obj, Object obj2) {
            super(obj2);
            this.OooO00o = o00Oo00O;
            this.OooO0O0 = obj;
        }

        @Override // com.p118pd.sdk.O0oOOO, com.p118pd.sdk.O0oOOO
        public void OooO00o(@NotNull KProperty<?> oo0o00o0, T t, T t2) {
            o0O0OO00.OooO0o(oo0o00o0, C8404oOoo0O00.OooOO0);
            this.OooO00o.invoke(oo0o00o0, t, t2);
        }
    }

    /* renamed from: com.pd.sdk.o0ooo0O0$OooO0O0 */
    public static final class OooO0O0 extends O0oOOO<T> {
        public final /* synthetic */ O00Oo00O OooO00o;
        public final /* synthetic */ Object OooO0O0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(O00Oo00O o00Oo00O, Object obj, Object obj2) {
            super(obj2);
            this.OooO00o = o00Oo00O;
            this.OooO0O0 = obj;
        }

        @Override // com.p118pd.sdk.O0oOOO, com.p118pd.sdk.O0oOOO
        public boolean OooO00o(@NotNull KProperty<?> oo0o00o0, T t, T t2) {
            o0O0OO00.OooO0o(oo0o00o0, C8404oOoo0O00.OooOO0);
            return ((Boolean) this.OooO00o.invoke(oo0o00o0, t, t2)).booleanValue();
        }
    }

    @NotNull
    public final <T> AbstractC7719o0ooOO00<Object, T> OooO00o() {
        return new C7737o0ooo0Oo();
    }

    @NotNull
    public final <T> AbstractC7719o0ooOO00<Object, T> OooO0O0(T t, @NotNull O00Oo00O<? super KProperty<?>, ? super T, ? super T, Boolean> o00Oo00O) {
        o0O0OO00.OooO0o(o00Oo00O, "onChange");
        return new OooO0O0(o00Oo00O, t, t);
    }

    @NotNull
    public final <T> AbstractC7719o0ooOO00<Object, T> OooO00o(T t, @NotNull O00Oo00O<? super KProperty<?>, ? super T, ? super T, C9174oooOOooO> o00Oo00O) {
        o0O0OO00.OooO0o(o00Oo00O, "onChange");
        return new OooO00o(o00Oo00O, t, t);
    }
}
