package kotlin.p285io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo43195d2 = {"Lkotlin/io/LinesSequence;", "Lkotlin/sequences/Sequence;", "", "reader", "Ljava/io/BufferedReader;", "(Ljava/io/BufferedReader;)V", "iterator", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.O00O0 */
public final class LinesSequence implements AbstractC7873oO0OOo00<String> {
    public final BufferedReader OooO00o;

    /* renamed from: com.pd.sdk.O00O0$OooO00o */
    public static final class OooO00o implements Iterator<String>, O0OO0o {
        public final /* synthetic */ LinesSequence OooO00o;
        public boolean OooO0O0;
        public String o0ooOOo;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(LinesSequence o00o0) {
            this.OooO00o = o00o0;
        }

        @NotNull
        /* renamed from: OooO00o */
        public String next() {
            if (hasNext()) {
                String str = this.o0ooOOo;
                this.o0ooOOo = null;
                if (str == null) {
                    o0O0OO00.OooO0o0();
                }
                return str;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.o0ooOOo == null && !this.OooO0O0) {
                String readLine = this.OooO00o.OooO00o.readLine();
                this.o0ooOOo = readLine;
                if (readLine == null) {
                    this.OooO0O0 = true;
                }
            }
            if (this.o0ooOOo != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public LinesSequence(@NotNull BufferedReader bufferedReader) {
        o0O0OO00.OooO0o(bufferedReader, "reader");
        this.OooO00o = bufferedReader;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<String> iterator() {
        return new OooO00o(this);
    }
}
