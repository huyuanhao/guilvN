package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0002¨\u0006\u0004"}, mo43195d2 = {"iterator", "", "T", "Ljava/util/Enumeration;", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/collections/CollectionsKt")
/* renamed from: com.pd.sdk.oooOoooO  reason: case insensitive filesystem */
public class C9203oooOoooO extends C9202oooOooo {

    /* renamed from: com.pd.sdk.oooOoooO$OooO00o */
    public static final class OooO00o implements Iterator<T>, O0OO0o {
        public final /* synthetic */ Enumeration OooO00o;

        public OooO00o(Enumeration<T> enumeration) {
            this.OooO00o = enumeration;
        }

        public boolean hasNext() {
            return this.OooO00o.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.OooO00o.nextElement();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    public static final <T> Iterator<T> OooO00o(@NotNull Enumeration<T> enumeration) {
        o0O0OO00.OooO0o(enumeration, "receiver$0");
        return new OooO00o(enumeration);
    }
}
