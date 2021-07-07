package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo43195d2 = {"Lkotlin/sequences/TransformingIndexedSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function2;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.OOO0000  reason: invalid package */
public final class TransformingIndexedSequence<T, R> implements AbstractC7873oO0OOo00<R> {
    public final O00Oo000<Integer, T, R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7873oO0OOo00<T> f16978OooO00o;

    /* renamed from: com.pd.sdk.OOO0000$OooO00o */
    public static final class OooO00o implements Iterator<R>, O0OO0o {
        public final /* synthetic */ TransformingIndexedSequence OooO00o;
        @NotNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Iterator<T> f16979OooO00o;
        public int o00oO0O;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(TransformingIndexedSequence ooo0000) {
            this.OooO00o = ooo0000;
            this.f16979OooO00o = ooo0000.f16978OooO00o.iterator();
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final Iterator<T> m16547OooO00o() {
            return this.f16979OooO00o;
        }

        public boolean hasNext() {
            return this.f16979OooO00o.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            O00Oo000 o00Oo000 = this.OooO00o.OooO00o;
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m22701OooO0O0();
            }
            return (R) o00Oo000.invoke(Integer.valueOf(i), this.f16979OooO00o.next());
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
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oO0OOo00<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.O00Oo000<? super java.lang.Integer, ? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformingIndexedSequence(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, @NotNull O00Oo000<? super Integer, ? super T, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(oo0ooo00, "sequence");
        o0O0OO00.OooO0o(o00Oo000, "transformer");
        this.f16978OooO00o = oo0ooo00;
        this.OooO00o = o00Oo000;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<R> iterator() {
        return new OooO00o(this);
    }
}
