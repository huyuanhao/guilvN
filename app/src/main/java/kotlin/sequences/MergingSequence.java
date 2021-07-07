package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B;\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo43195d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", ExifInterface.o000oo0o, "Lkotlin/sequences/Sequence;", "sequence1", "sequence2", BaseViewManager.PROP_TRANSFORM, "Lkotlin/Function2;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.OO0OOO0  reason: invalid package */
public final class MergingSequence<T1, T2, V> implements AbstractC7873oO0OOo00<V> {
    public final O00Oo000<T1, T2, V> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7873oO0OOo00<T1> f16970OooO00o;
    public final AbstractC7873oO0OOo00<T2> OooO0O0;

    /* renamed from: com.pd.sdk.OO0OOO0$OooO00o */
    public static final class OooO00o implements Iterator<V>, O0OO0o {
        public final /* synthetic */ MergingSequence OooO00o;
        @NotNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Iterator<T1> f16971OooO00o;
        @NotNull
        public final Iterator<T2> OooO0O0;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(MergingSequence oo0ooo0) {
            this.OooO00o = oo0ooo0;
            this.f16971OooO00o = oo0ooo0.f16970OooO00o.iterator();
            this.OooO0O0 = oo0ooo0.OooO0O0.iterator();
        }

        @NotNull
        public final Iterator<T1> OooO00o() {
            return this.f16971OooO00o;
        }

        @NotNull
        public final Iterator<T2> OooO0O0() {
            return this.OooO0O0;
        }

        public boolean hasNext() {
            return this.f16971OooO00o.hasNext() && this.OooO0O0.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) this.OooO00o.OooO00o.invoke(this.f16971OooO00o.next(), this.OooO0O0.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oO0OOo00<? extends T1> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.oO0OOo00<? extends T2> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.pd.sdk.O00Oo000<? super T1, ? super T2, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public MergingSequence(@NotNull AbstractC7873oO0OOo00<? extends T1> oo0ooo00, @NotNull AbstractC7873oO0OOo00<? extends T2> oo0ooo002, @NotNull O00Oo000<? super T1, ? super T2, ? extends V> o00Oo000) {
        o0O0OO00.OooO0o(oo0ooo00, "sequence1");
        o0O0OO00.OooO0o(oo0ooo002, "sequence2");
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        this.f16970OooO00o = oo0ooo00;
        this.OooO0O0 = oo0ooo002;
        this.OooO00o = o00Oo000;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<V> iterator() {
        return new OooO00o(this);
    }
}
