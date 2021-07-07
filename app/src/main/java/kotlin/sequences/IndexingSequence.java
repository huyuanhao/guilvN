package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo43195d2 = {"Lkotlin/sequences/IndexingSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", "sequence", "(Lkotlin/sequences/Sequence;)V", "iterator", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.Oo0OOO  reason: invalid package */
public final class IndexingSequence<T> implements AbstractC7873oO0OOo00<C9219oooo0O0<? extends T>> {
    public final AbstractC7873oO0OOo00<T> OooO00o;

    /* renamed from: com.pd.sdk.Oo0OOO$OooO00o */
    public static final class OooO00o implements Iterator<C9219oooo0O0<? extends T>>, O0OO0o {
        public final /* synthetic */ IndexingSequence OooO00o;
        @NotNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Iterator<T> f16998OooO00o;
        public int o00oO0O;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(IndexingSequence oo0OOO) {
            this.OooO00o = oo0OOO;
            this.f16998OooO00o = oo0OOO.OooO00o.iterator();
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final Iterator<T> m16627OooO00o() {
            return this.f16998OooO00o;
        }

        public boolean hasNext() {
            return this.f16998OooO00o.hasNext();
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

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C9219oooo0O0<T> next() {
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m22701OooO0O0();
            }
            return new C9219oooo0O0<>(i, this.f16998OooO00o.next());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oO0OOo00<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public IndexingSequence(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(oo0ooo00, "sequence");
        this.OooO00o = oo0ooo00;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<C9219oooo0O0<T>> iterator() {
        return new OooO00o(this);
    }
}
