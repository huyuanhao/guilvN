package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo43195d2 = {"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.OOO000  reason: invalid package */
public final class TakeWhileSequence<T> implements AbstractC7873oO0OOo00<T> {
    public final O00O0OOO<T, Boolean> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7873oO0OOo00<T> f16975OooO00o;

    /* renamed from: com.pd.sdk.OOO000$OooO00o */
    public static final class OooO00o implements Iterator<T>, O0OO0o {
        public final /* synthetic */ TakeWhileSequence OooO00o;
        @Nullable

        /* renamed from: OooO00o  reason: collision with other field name */
        public T f16976OooO00o;
        @NotNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Iterator<T> f16977OooO00o;
        public int o00oO0O = -1;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(TakeWhileSequence ooo000) {
            this.OooO00o = ooo000;
            this.f16977OooO00o = ooo000.f16975OooO00o.iterator();
        }

        private final void OooO0OO() {
            if (this.f16977OooO00o.hasNext()) {
                T next = this.f16977OooO00o.next();
                if (((Boolean) this.OooO00o.OooO00o.invoke(next)).booleanValue()) {
                    this.o00oO0O = 1;
                    this.f16976OooO00o = next;
                    return;
                }
            }
            this.o00oO0O = 0;
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final Iterator<T> m16546OooO00o() {
            return this.f16977OooO00o;
        }

        public boolean hasNext() {
            if (this.o00oO0O == -1) {
                OooO0OO();
            }
            return this.o00oO0O == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.o00oO0O == -1) {
                OooO0OO();
            }
            if (this.o00oO0O != 0) {
                T t = this.f16976OooO00o;
                this.f16976OooO00o = null;
                this.o00oO0O = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int OooO00o() {
            return this.o00oO0O;
        }

        public final void OooO00o(int i) {
            this.o00oO0O = i;
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final T m16545OooO00o() {
            return this.f16976OooO00o;
        }

        public final void OooO00o(@Nullable T t) {
            this.f16976OooO00o = t;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oO0OOo00<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.O00O0OOO<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public TakeWhileSequence(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, @NotNull O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(oo0ooo00, "sequence");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        this.f16975OooO00o = oo0ooo00;
        this.OooO00o = o00o0ooo;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<T> iterator() {
        return new OooO00o(this);
    }
}
