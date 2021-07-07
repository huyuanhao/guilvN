package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo43195d2 = {"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oO0Oo0oO  reason: invalid package */
public final class GeneratorSequence<T> implements AbstractC7873oO0OOo00<T> {
    public final O00O0000<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final O00O0OOO<T, T> f20964OooO00o;

    /* renamed from: com.pd.sdk.oO0Oo0oO$OooO00o */
    public static final class OooO00o implements Iterator<T>, O0OO0o {
        public final /* synthetic */ GeneratorSequence OooO00o;
        @Nullable

        /* renamed from: OooO00o  reason: collision with other field name */
        public T f20965OooO00o;
        public int o00oO0O = -2;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(GeneratorSequence oo0oo0oo) {
            this.OooO00o = oo0oo0oo;
        }

        private final void OooO0OO() {
            T t;
            if (this.o00oO0O == -2) {
                t = (T) this.OooO00o.OooO00o.invoke();
            } else {
                O00O0OOO o00o0ooo = this.OooO00o.f20964OooO00o;
                T t2 = this.f20965OooO00o;
                if (t2 == null) {
                    o0O0OO00.OooO0o0();
                }
                t = (T) o00o0ooo.invoke(t2);
            }
            this.f20965OooO00o = t;
            this.o00oO0O = t == null ? 0 : 1;
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final T m19572OooO00o() {
            return this.f20965OooO00o;
        }

        public boolean hasNext() {
            if (this.o00oO0O < 0) {
                OooO0OO();
            }
            return this.o00oO0O == 1;
        }

        @Override // java.util.Iterator
        @NotNull
        public T next() {
            if (this.o00oO0O < 0) {
                OooO0OO();
            }
            if (this.o00oO0O != 0) {
                T t = this.f20965OooO00o;
                if (t != null) {
                    this.o00oO0O = -1;
                    return t;
                }
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void OooO00o(@Nullable T t) {
            this.f20965OooO00o = t;
        }

        public final int OooO00o() {
            return this.o00oO0O;
        }

        public final void OooO00o(int i) {
            this.o00oO0O = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.O00O0000<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.O00O0OOO<? super T, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public GeneratorSequence(@NotNull O00O0000<? extends T> o00o0000, @NotNull O00O0OOO<? super T, ? extends T> o00o0ooo) {
        o0O0OO00.OooO0o(o00o0000, "getInitialValue");
        o0O0OO00.OooO0o(o00o0ooo, "getNextValue");
        this.OooO00o = o00o0000;
        this.f20964OooO00o = o00o0ooo;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<T> iterator() {
        return new OooO00o(this);
    }
}
