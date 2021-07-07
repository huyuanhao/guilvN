package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J3\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003\"\u0004\b\u0002\u0010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000b0\u0006H\u0000¢\u0006\u0002\b\fJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo43195d2 = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", ExifInterface.o000oo00, "iterator", "", "flatten$kotlin_stdlib", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oOo00000  reason: invalid package */
public final class TransformingSequence<T, R> implements AbstractC7873oO0OOo00<R> {
    public final O00O0OOO<T, R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7873oO0OOo00<T> f21364OooO00o;

    /* renamed from: com.pd.sdk.oOo00000$OooO00o */
    public static final class OooO00o implements Iterator<R>, O0OO0o {
        public final /* synthetic */ TransformingSequence OooO00o;
        @NotNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Iterator<T> f21365OooO00o;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(TransformingSequence ooo00000) {
            this.OooO00o = ooo00000;
            this.f21365OooO00o = ooo00000.f21364OooO00o.iterator();
        }

        @NotNull
        public final Iterator<T> OooO00o() {
            return this.f21365OooO00o;
        }

        public boolean hasNext() {
            return this.f21365OooO00o.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.OooO00o.OooO00o.invoke(this.f21365OooO00o.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oO0OOo00<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.O00O0OOO<? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformingSequence(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, @NotNull O00O0OOO<? super T, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(oo0ooo00, "sequence");
        o0O0OO00.OooO0o(o00o0ooo, "transformer");
        this.f21364OooO00o = oo0ooo00;
        this.OooO00o = o00o0ooo;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<R> iterator() {
        return new OooO00o(this);
    }

    @NotNull
    public final <E> AbstractC7873oO0OOo00<E> OooO00o(@NotNull O00O0OOO<? super R, ? extends Iterator<? extends E>> o00o0ooo) {
        o0O0OO00.OooO0o(o00o0ooo, "iterator");
        return new FlatteningSequence(this.f21364OooO00o, this.OooO00o, o00o0ooo);
    }
}
