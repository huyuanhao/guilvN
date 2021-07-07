package kotlin.collections;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0006J\u0015\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010!J'\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0014¢\u0006\u0002\u0010#J9\u0010$\u001a\u00020\u0014\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\t2\u0006\u0010\u0015\u001a\u0002H\u00012\b\b\u0002\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'J\u0015\u0010(\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0007R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, mo43195d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", "buffer", "", "", "[Ljava/lang/Object;", "getCapacity", "()I", "<set-?>", FileAttachment.KEY_SIZE, "getSize", "setSize", "startIndex", "add", "", "element", "(Ljava/lang/Object;)V", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "removeFirst", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "fill", "fromIndex", "toIndex", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "forward", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oooo0oOo  reason: invalid package */
public final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
    public final Object[] OooO00o;
    public int o00oO0O;
    public int o0ooOO0;
    public final int o0ooOOo;

    /* renamed from: com.pd.sdk.oooo0oOo$OooO00o */
    public static final class OooO00o extends AbstractC9176oooOo<T> {
        public final /* synthetic */ RingBuffer OooO00o;
        public int o00oO0O;
        public int o0ooOO0;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(RingBuffer oooo0ooo) {
            this.OooO00o = oooo0ooo;
            this.o00oO0O = oooo0ooo.size();
            this.o0ooOO0 = oooo0ooo.o00oO0O;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oooo0oOo$OooO00o */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC9176oooOo
        public void OooO0OO() {
            if (this.o00oO0O == 0) {
                OooO0Oo();
                return;
            }
            OooO00o(this.OooO00o.OooO00o[this.o0ooOO0]);
            this.o0ooOO0 = (this.o0ooOO0 + 1) % this.OooO00o.OooO0O0();
            this.o00oO0O--;
        }
    }

    public RingBuffer(int i) {
        this.o0ooOOo = i;
        if (i >= 0) {
            this.OooO00o = new Object[this.o0ooOOo];
            return;
        }
        throw new IllegalArgumentException(("ring buffer capacity should not be negative but it is " + this.o0ooOOo).toString());
    }

    @Override // java.util.List, kotlin.collections.AbstractList
    public T get(int i) {
        AbstractList.OooO00o.OooO00o(i, size());
        return (T) this.OooO00o[(this.o00oO0O + i) % OooO0O0()];
    }

    @Override // java.util.List, java.util.Collection, kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new OooO00o(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: T[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection, kotlin.collections.AbstractCollection
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        o0O0OO00.OooO0o(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
            o0O0OO00.OooO00o((Object) tArr, "java.util.Arrays.copyOf(this, newSize)");
        }
        int size = size();
        int i = this.o00oO0O;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size && i < this.o0ooOOo) {
            tArr[i3] = this.OooO00o[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            tArr[i3] = this.OooO00o[i2];
            i3++;
            i2++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        if (tArr != null) {
            return tArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final int OooO0O0() {
        return this.o0ooOOo;
    }

    /* access modifiers changed from: private */
    public void OooO0O0(int i) {
        this.o0ooOO0 = i;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int OooO00o() {
        return this.o0ooOO0;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final boolean m21123OooO00o() {
        return size() == this.o0ooOOo;
    }

    public final void OooO00o(T t) {
        if (!m21123OooO00o()) {
            this.OooO00o[(this.o00oO0O + size()) % OooO0O0()] = t;
            OooO0O0(size() + 1);
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.oooo0oOo<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.pd.sdk.oooo0oOo<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO00o(int i) {
        boolean z = true;
        if (i >= 0) {
            if (i > size()) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
            } else if (i > 0) {
                int i2 = this.o00oO0O;
                int OooO0O0 = (i2 + i) % OooO0O0();
                if (i2 > OooO0O0) {
                    OooO00o(this.OooO00o, null, i2, this.o0ooOOo);
                    OooO00o(this.OooO00o, null, 0, OooO0O0);
                } else {
                    OooO00o(this.OooO00o, null, i2, OooO0O0);
                }
                this.o00oO0O = OooO0O0;
                OooO0O0(size() - i);
            }
        } else {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
    }

    /* access modifiers changed from: private */
    public final int OooO00o(int i, int i2) {
        return (i + i2) % OooO0O0();
    }

    public static /* synthetic */ void OooO00o(RingBuffer oooo0ooo, Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        oooo0ooo.OooO00o(objArr, obj, i, i2);
    }

    private final <T> void OooO00o(@NotNull T[] tArr, T t, int i, int i2) {
        while (i < i2) {
            tArr[i] = t;
            i++;
        }
    }
}
