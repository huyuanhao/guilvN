package kotlin.sequences;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo43195d2 = {"Lkotlin/sequences/TakeSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", C8412oOoo0OoO.OooO0O0, "", "(Lkotlin/sequences/Sequence;I)V", "drop", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "iterator", "", "take", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.OoO00  reason: invalid package */
public final class TakeSequence<T> implements AbstractC7873oO0OOo00<T>, OO0OO00<T> {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7873oO0OOo00<T> f17002OooO00o;

    /* renamed from: com.pd.sdk.OoO00$OooO00o */
    public static final class OooO00o implements Iterator<T>, O0OO0o {
        public final /* synthetic */ TakeSequence OooO00o;
        @NotNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Iterator<T> f17003OooO00o;
        public int o00oO0O;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(TakeSequence ooO00) {
            this.OooO00o = ooO00;
            this.o00oO0O = ooO00.OooO00o;
            this.f17003OooO00o = ooO00.f17002OooO00o.iterator();
        }

        public final int OooO00o() {
            return this.o00oO0O;
        }

        public boolean hasNext() {
            return this.o00oO0O > 0 && this.f17003OooO00o.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.o00oO0O;
            if (i != 0) {
                this.o00oO0O = i - 1;
                return this.f17003OooO00o.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void OooO00o(int i) {
            this.o00oO0O = i;
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final Iterator<T> m16630OooO00o() {
            return this.f17003OooO00o;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oO0OOo00<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public TakeSequence(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, int i) {
        o0O0OO00.OooO0o(oo0ooo00, "sequence");
        this.f17002OooO00o = oo0ooo00;
        this.OooO00o = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + this.OooO00o + '.').toString());
        }
    }

    @Override // com.p118pd.sdk.OO0OO00
    @NotNull
    public AbstractC7873oO0OOo00<T> OooO0O0(int i) {
        int i2 = this.OooO00o;
        return i >= i2 ? SequencesKt__SequencesKt.OooO00o() : new SubSequence(this.f17002OooO00o, i, i2);
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<T> iterator() {
        return new OooO00o(this);
    }

    @Override // com.p118pd.sdk.OO0OO00
    @NotNull
    public AbstractC7873oO0OOo00<T> OooO00o(int i) {
        return i >= this.OooO00o ? this : new TakeSequence(this.f17002OooO00o, i);
    }
}
