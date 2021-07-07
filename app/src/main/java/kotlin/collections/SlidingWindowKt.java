package kotlin.collections;

import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.C7900oO0OoOOo;
import com.p118pd.sdk.C9212oooo00O0;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, mo43195d2 = {"checkWindowSizeStep", "", FileAttachment.KEY_SIZE, "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, mo43196k = 2, mo43197mv = {1, 1, 13})
public final class SlidingWindowKt {

    public static final class OooO00o implements AbstractC7873oO0OOo00<List<? extends T>> {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7873oO0OOo00 f23863OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ boolean f23864OooO00o;
        public final /* synthetic */ int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final /* synthetic */ boolean f23865OooO0O0;

        public OooO00o(AbstractC7873oO0OOo00 oo0ooo00, int i, int i2, boolean z, boolean z2) {
            this.f23863OooO00o = oo0ooo00;
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.f23864OooO00o = z;
            this.f23865OooO0O0 = z2;
        }

        @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
        @NotNull
        public Iterator<List<? extends T>> iterator() {
            return SlidingWindowKt.OooO00o(this.f23863OooO00o.iterator(), this.OooO00o, this.OooO0O0, this.f23864OooO00o, this.f23865OooO0O0);
        }
    }

    public static final void OooO00o(int i, int i2) {
        String str;
        if (!(i > 0 && i2 > 0)) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @NotNull
    public static final <T> AbstractC7873oO0OOo00<List<T>> OooO00o(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, int i, int i2, boolean z, boolean z2) {
        o0O0OO00.OooO0o(oo0ooo00, "receiver$0");
        OooO00o(i, i2);
        return new OooO00o(oo0ooo00, i, i2, z, z2);
    }

    @NotNull
    public static final <T> Iterator<List<T>> OooO00o(@NotNull Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        o0O0OO00.OooO0o(it, "iterator");
        if (!it.hasNext()) {
            return C9212oooo00O0.OooO00o;
        }
        return C7900oO0OoOOo.m19580OooO0O0((O00Oo000) new SlidingWindowKt$windowedIterator$1(i2, i, it, z2, z, null));
    }
}
