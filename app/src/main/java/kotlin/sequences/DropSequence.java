package kotlin.sequences;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo43195d2 = {"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", C8412oOoo0OoO.OooO0O0, "", "(Lkotlin/sequences/Sequence;I)V", "drop", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "iterator", "", "take", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.OO0OO0  reason: invalid package */
public final class DropSequence<T> implements AbstractC7873oO0OOo00<T>, OO0OO00<T> {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7873oO0OOo00<T> f16964OooO00o;

    /* renamed from: com.pd.sdk.OO0OO0$OooO00o */
    public static final class OooO00o implements Iterator<T>, O0OO0o {
        public final /* synthetic */ DropSequence OooO00o;
        @NotNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Iterator<T> f16965OooO00o;
        public int o00oO0O;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(DropSequence oo0oo0) {
            this.OooO00o = oo0oo0;
            this.f16965OooO00o = oo0oo0.f16964OooO00o.iterator();
            this.o00oO0O = oo0oo0.OooO00o;
        }

        private final void OooO0OO() {
            while (this.o00oO0O > 0 && this.f16965OooO00o.hasNext()) {
                this.f16965OooO00o.next();
                this.o00oO0O--;
            }
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final Iterator<T> m16541OooO00o() {
            return this.f16965OooO00o;
        }

        public boolean hasNext() {
            OooO0OO();
            return this.f16965OooO00o.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            OooO0OO();
            return this.f16965OooO00o.next();
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
    public DropSequence(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, int i) {
        o0O0OO00.OooO0o(oo0ooo00, "sequence");
        this.f16964OooO00o = oo0ooo00;
        this.OooO00o = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + this.OooO00o + '.').toString());
        }
    }

    @Override // com.p118pd.sdk.OO0OO00
    @NotNull
    public AbstractC7873oO0OOo00<T> OooO0O0(int i) {
        int i2 = this.OooO00o + i;
        return i2 < 0 ? new DropSequence(this, i) : new DropSequence(this.f16964OooO00o, i2);
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<T> iterator() {
        return new OooO00o(this);
    }

    @Override // com.p118pd.sdk.OO0OO00
    @NotNull
    public AbstractC7873oO0OOo00<T> OooO00o(int i) {
        int i2 = this.OooO00o;
        int i3 = i2 + i;
        return i3 < 0 ? new TakeSequence(this, i) : new SubSequence(this.f16964OooO00o, i2, i3);
    }
}
