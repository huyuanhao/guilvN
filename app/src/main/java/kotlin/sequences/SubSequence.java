package kotlin.sequences;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo43195d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "startIndex", "", "endIndex", "(Lkotlin/sequences/Sequence;II)V", C8412oOoo0OoO.OooO0O0, "getCount", "()I", "drop", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "iterator", "", "take", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.OOO0  reason: invalid package */
public final class SubSequence<T> implements AbstractC7873oO0OOo00<T>, OO0OO00<T> {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7873oO0OOo00<T> f16973OooO00o;
    public final int OooO0O0;

    /* renamed from: com.pd.sdk.OOO0$OooO00o */
    public static final class OooO00o implements Iterator<T>, O0OO0o {
        public final /* synthetic */ SubSequence OooO00o;
        @NotNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Iterator<T> f16974OooO00o;
        public int o00oO0O;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(SubSequence ooo0) {
            this.OooO00o = ooo0;
            this.f16974OooO00o = ooo0.f16973OooO00o.iterator();
        }

        private final void OooO0OO() {
            while (this.o00oO0O < this.OooO00o.OooO00o && this.f16974OooO00o.hasNext()) {
                this.f16974OooO00o.next();
                this.o00oO0O++;
            }
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final Iterator<T> m16544OooO00o() {
            return this.f16974OooO00o;
        }

        public boolean hasNext() {
            OooO0OO();
            return this.o00oO0O < this.OooO00o.OooO0O0 && this.f16974OooO00o.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            OooO0OO();
            if (this.o00oO0O < this.OooO00o.OooO0O0) {
                this.o00oO0O++;
                return this.f16974OooO00o.next();
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
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oO0OOo00<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public SubSequence(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, int i, int i2) {
        o0O0OO00.OooO0o(oo0ooo00, "sequence");
        this.f16973OooO00o = oo0ooo00;
        this.OooO00o = i;
        this.OooO0O0 = i2;
        boolean z = true;
        if (i >= 0) {
            if (this.OooO0O0 >= 0) {
                if (!(this.OooO0O0 < this.OooO00o ? false : z)) {
                    throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + this.OooO0O0 + " < " + this.OooO00o).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + this.OooO0O0).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + this.OooO00o).toString());
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<T> iterator() {
        return new OooO00o(this);
    }

    @Override // com.p118pd.sdk.OO0OO00
    @NotNull
    public AbstractC7873oO0OOo00<T> OooO0O0(int i) {
        return i >= OooO00o() ? SequencesKt__SequencesKt.OooO00o() : new SubSequence(this.f16973OooO00o, this.OooO00o + i, this.OooO0O0);
    }

    private final int OooO00o() {
        return this.OooO0O0 - this.OooO00o;
    }

    @Override // com.p118pd.sdk.OO0OO00
    @NotNull
    public AbstractC7873oO0OOo00<T> OooO00o(int i) {
        if (i >= OooO00o()) {
            return this;
        }
        AbstractC7873oO0OOo00<T> oo0ooo00 = this.f16973OooO00o;
        int i2 = this.OooO00o;
        return new SubSequence(oo0ooo00, i2, i + i2);
    }
}
