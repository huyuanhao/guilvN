package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractCollection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b'\u0018\u0000 \u000b*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, mo43195d2 = {"Lkotlin/collections/AbstractSet;", ExifInterface.o000oo00, "Lkotlin/collections/AbstractCollection;", "", "()V", "equals", "", DispatchConstants.OTHER, "", "hashCode", "", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oooOoOO0  reason: invalid package */
public abstract class AbstractSet<E> extends AbstractCollection<E> implements Set<E>, O0OO0o {
    public static final OooO00o OooO00o = new OooO00o(null);

    /* renamed from: com.pd.sdk.oooOoOO0$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        public final int OooO00o(@NotNull Collection<?> collection) {
            o0O0OO00.OooO0o(collection, C2756c.f5722a);
            Iterator<?> it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                i += next != null ? next.hashCode() : 0;
            }
            return i;
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }

        public final boolean OooO00o(@NotNull Set<?> set, @NotNull Set<?> set2) {
            o0O0OO00.OooO0o(set, C2756c.f5722a);
            o0O0OO00.OooO0o(set2, DispatchConstants.OTHER);
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return OooO00o.OooO00o(this, (Set) obj);
    }

    public int hashCode() {
        return OooO00o.OooO00o(this);
    }

    @Override // java.util.Collection, java.util.Set, kotlin.collections.AbstractCollection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
