package kotlin;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.umeng.message.proguard.C3848l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0014\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0014\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\u001b\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\t\u0010+\u001a\u00020,HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006."}, mo43195d2 = {"Lkotlin/UIntArray;", "", "Lkotlin/UInt;", FileAttachment.KEY_SIZE, "", "constructor-impl", "(I)[I", "storage", "", "([I)[I", "getSize-impl", "([I)I", "storage$annotations", "()V", "contains", "", "element", "contains-WZ4Q5Ns", "([II)Z", "containsAll", "elements", "containsAll-impl", "([ILjava/util/Collection;)Z", "equals", DispatchConstants.OTHER, "", "get", "index", "get-impl", "([II)I", "hashCode", "isEmpty", "isEmpty-impl", "([I)Z", "iterator", "Lkotlin/collections/UIntIterator;", "iterator-impl", "([I)Lkotlin/collections/UIntIterator;", "set", "", "value", "set-VXSXFK8", "([III)V", "toString", "", "Iterator", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.oooOOOo  reason: invalid package */
public final class UIntArray implements Collection<UInt>, O0OO0o {
    @NotNull
    public final int[] OooO00o;

    /* renamed from: com.pd.sdk.oooOOOo$OooO00o */
    public static final class OooO00o extends AbstractC9245ooooO0O {
        public final int[] OooO00o;
        public int o00oO0O;

        public OooO00o(@NotNull int[] iArr) {
            o0O0OO00.OooO0o(iArr, "array");
            this.OooO00o = iArr;
        }

        @Override // com.p118pd.sdk.AbstractC9245ooooO0O, com.p118pd.sdk.AbstractC9245ooooO0O
        public int OooO00o() {
            int i = this.o00oO0O;
            int[] iArr = this.OooO00o;
            if (i < iArr.length) {
                this.o00oO0O = i + 1;
                return UInt.m20934OooO0O0(iArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.o00oO0O));
        }

        public boolean hasNext() {
            return this.o00oO0O < this.OooO00o.length;
        }
    }

    @PublishedApi
    public /* synthetic */ UIntArray(@NotNull int[] iArr) {
        o0O0OO00.OooO0o(iArr, "storage");
        this.OooO00o = iArr;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20921OooO00o(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + C3848l.f10402t;
    }

    public static boolean OooO00o(int[] iArr, @Nullable Object obj) {
        return (obj instanceof UIntArray) && o0O0OO00.OooO00o(iArr, ((UIntArray) obj).OooO00o());
    }

    public static final boolean OooO00o(@NotNull int[] iArr, @NotNull int[] iArr2) {
        o0O0OO00.OooO0o(iArr, "p1");
        o0O0OO00.OooO0o(iArr2, "p2");
        throw null;
    }

    @PublishedApi
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m20924OooO00o(@NotNull int[] iArr) {
        o0O0OO00.OooO0o(iArr, "storage");
        return iArr;
    }

    public static int OooO0O0(int[] iArr) {
        if (iArr != null) {
            return Arrays.hashCode(iArr);
        }
        return 0;
    }

    public int OooO00o() {
        return OooO00o(this.OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20926OooO00o(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean OooO0O0(int i) {
        return m20923OooO00o(this.OooO00o, i);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* synthetic */ boolean add(UInt ooooooo0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UInt> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return OooO0O0(((UInt) obj).OooO00o());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        return OooO00o(this.OooO00o, (Collection<UInt>) collection);
    }

    public boolean equals(Object obj) {
        return OooO00o(this.OooO00o, obj);
    }

    public int hashCode() {
        return OooO0O0(this.OooO00o);
    }

    public boolean isEmpty() {
        return m20922OooO00o(this.OooO00o);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return OooO00o();
    }

    public Object[] toArray() {
        return C7275o0O00OOo.OooO00o(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C7275o0O00OOo.OooO00o(this, tArr);
    }

    public String toString() {
        return m20921OooO00o(this.OooO00o);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9245ooooO0O iterator() {
        return m20920OooO00o(this.OooO00o);
    }

    @NotNull
    public static int[] OooO00o(int i) {
        return m20924OooO00o(new int[i]);
    }

    public static final int OooO00o(int[] iArr, int i) {
        return UInt.m20934OooO0O0(iArr[i]);
    }

    public static final void OooO00o(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    public static int OooO00o(int[] iArr) {
        return iArr.length;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC9245ooooO0O m20920OooO00o(int[] iArr) {
        return new OooO00o(iArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20923OooO00o(int[] iArr, int i) {
        return ArraysKt___ArraysKt.m22305OooO00o(iArr, i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20922OooO00o(int[] iArr) {
        return iArr.length == 0;
    }

    public static boolean OooO00o(int[] iArr, @NotNull Collection<UInt> collection) {
        o0O0OO00.OooO0o(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!ArraysKt___ArraysKt.m22305OooO00o(iArr, it.next().OooO00o())) {
                return false;
            }
        }
        return true;
    }
}
