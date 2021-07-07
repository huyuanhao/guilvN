package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractCollection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, mo43195d2 = {"Lkotlin/collections/AbstractList;", ExifInterface.o000oo00, "Lkotlin/collections/AbstractCollection;", "", "()V", FileAttachment.KEY_SIZE, "", "getSize", "()I", "equals", "", DispatchConstants.OTHER, "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oooOoO00  reason: invalid package */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, O0OO0o {
    public static final OooO00o OooO00o = new OooO00o(null);

    /* renamed from: com.pd.sdk.oooOoO00$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        public final void OooO00o(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void OooO0O0(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }

        public final void OooO00o(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        public final int OooO00o(@NotNull Collection<?> collection) {
            o0O0OO00.OooO0o(collection, C2756c.f5722a);
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        public final boolean OooO00o(@NotNull Collection<?> collection, @NotNull Collection<?> collection2) {
            o0O0OO00.OooO0o(collection, C2756c.f5722a);
            o0O0OO00.OooO0o(collection2, DispatchConstants.OTHER);
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!o0O0OO00.OooO00o(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: com.pd.sdk.oooOoO00$OooO0O0 */
    public class OooO0O0 implements Iterator<E>, O0OO0o {
        public int o00oO0O;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO0O0() {
        }

        public final int OooO00o() {
            return this.o00oO0O;
        }

        public boolean hasNext() {
            return this.o00oO0O < AbstractList.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                AbstractList oooooo00 = AbstractList.this;
                int i = this.o00oO0O;
                this.o00oO0O = i + 1;
                return (E) oooooo00.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void OooO00o(int i) {
            this.o00oO0O = i;
        }
    }

    /* renamed from: com.pd.sdk.oooOoO00$OooO0OO */
    public class OooO0OO extends AbstractList<E>.OooO0O0 implements ListIterator<E>, O0OO0o {
        public OooO0OO(int i) {
            super();
            AbstractList.OooO00o.OooO0O0(i, AbstractList.this.size());
            OooO00o(i);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return OooO00o() > 0;
        }

        public int nextIndex() {
            return OooO00o();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                AbstractList oooooo00 = AbstractList.this;
                OooO00o(OooO00o() - 1);
                return (E) oooooo00.get(OooO00o());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return OooO00o() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: com.pd.sdk.oooOoO00$OooO0Oo  reason: case insensitive filesystem */
    public static final class C9180OooO0Oo<E> extends AbstractList<E> implements RandomAccess {
        public final AbstractList<E> OooO00o;
        public int o00oO0O;
        public final int o0ooOO0;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oooOoO00<? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public C9180OooO0Oo(@NotNull AbstractList<? extends E> oooooo00, int i, int i2) {
            o0O0OO00.OooO0o(oooooo00, C8412oOoo0OoO.OooO0OO);
            this.OooO00o = oooooo00;
            this.o0ooOO0 = i;
            AbstractList.OooO00o.OooO00o(i, i2, oooooo00.size());
            this.o00oO0O = i2 - this.o0ooOO0;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int OooO00o() {
            return this.o00oO0O;
        }

        @Override // java.util.List, kotlin.collections.AbstractList
        public E get(int i) {
            AbstractList.OooO00o.OooO00o(i, this.o00oO0O);
            return this.OooO00o.get(this.o0ooOO0 + i);
        }
    }

    @Override // kotlin.collections.AbstractCollection
    public abstract int OooO00o();

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return OooO00o.OooO00o(this, (Collection) obj);
    }

    @Override // java.util.List
    public abstract E get(int i);

    public int hashCode() {
        return OooO00o.OooO00o(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (E e : this) {
            if (o0O0OO00.OooO00o((Object) e, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection, kotlin.collections.AbstractCollection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return new OooO0O0();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (o0O0OO00.OooO00o((Object) listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return new OooO0OO(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<E> subList(int i, int i2) {
        return new C9180OooO0Oo(this, i, i2);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        return new OooO0OO(i);
    }
}
