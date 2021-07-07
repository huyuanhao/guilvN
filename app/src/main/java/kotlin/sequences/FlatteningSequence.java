package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo43195d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", ExifInterface.o000oo00, "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oO0OO0O0  reason: invalid package */
public final class FlatteningSequence<T, R, E> implements AbstractC7873oO0OOo00<E> {
    public final O00O0OOO<T, R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7873oO0OOo00<T> f20925OooO00o;
    public final O00O0OOO<R, Iterator<E>> OooO0O0;

    /* renamed from: com.pd.sdk.oO0OO0O0$OooO00o */
    public static final class OooO00o implements Iterator<E>, O0OO0o {
        public final /* synthetic */ FlatteningSequence OooO00o;
        @NotNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Iterator<T> f20926OooO00o;
        @Nullable
        public Iterator<? extends E> OooO0O0;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(FlatteningSequence oo0oo0o0) {
            this.OooO00o = oo0oo0o0;
            this.f20926OooO00o = oo0oo0o0.f20925OooO00o.iterator();
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Iterator<? extends E>, java.util.Iterator<E> */
        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final Iterator<E> m19553OooO00o() {
            return (Iterator<? extends E>) this.OooO0O0;
        }

        @NotNull
        public final Iterator<T> OooO0O0() {
            return this.f20926OooO00o;
        }

        public boolean hasNext() {
            return OooO00o();
        }

        @Override // java.util.Iterator
        public E next() {
            if (OooO00o()) {
                Iterator<? extends E> it = this.OooO0O0;
                if (it == null) {
                    o0O0OO00.OooO0o0();
                }
                return (E) it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void OooO00o(@Nullable Iterator<? extends E> it) {
            this.OooO0O0 = it;
        }

        private final boolean OooO00o() {
            Iterator<? extends E> it = this.OooO0O0;
            if (it != null && !it.hasNext()) {
                this.OooO0O0 = null;
            }
            while (true) {
                if (this.OooO0O0 == null) {
                    if (this.f20926OooO00o.hasNext()) {
                        Iterator<? extends E> it2 = (Iterator) this.OooO00o.OooO0O0.invoke(this.OooO00o.OooO00o.invoke(this.f20926OooO00o.next()));
                        if (it2.hasNext()) {
                            this.OooO0O0 = it2;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oO0OOo00<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.O00O0OOO<? super T, ? extends R> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.pd.sdk.O00O0OOO<? super R, ? extends java.util.Iterator<? extends E>> */
    /* JADX WARN: Multi-variable type inference failed */
    public FlatteningSequence(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, @NotNull O00O0OOO<? super T, ? extends R> o00o0ooo, @NotNull O00O0OOO<? super R, ? extends Iterator<? extends E>> o00o0ooo2) {
        o0O0OO00.OooO0o(oo0ooo00, "sequence");
        o0O0OO00.OooO0o(o00o0ooo, "transformer");
        o0O0OO00.OooO0o(o00o0ooo2, "iterator");
        this.f20925OooO00o = oo0ooo00;
        this.OooO00o = o00o0ooo;
        this.OooO0O0 = o00o0ooo2;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<E> iterator() {
        return new OooO00o(this);
    }
}
