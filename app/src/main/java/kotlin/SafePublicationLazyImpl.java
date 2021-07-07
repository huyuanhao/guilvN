package kotlin;

import com.p118pd.sdk.AbstractC9141oooO0oO;
import com.p118pd.sdk.C9171oooOOoO;
import com.p118pd.sdk.O00O0000;
import com.p118pd.sdk.O0o0o;
import com.p118pd.sdk.o0O0OO00;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u0013*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0013B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, mo43195d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public final class SafePublicationLazyImpl<T> implements AbstractC9141oooO0oO<T>, Serializable {
    public static final OooO00o Companion = new OooO00o(null);
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> OooO00o = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    public volatile Object _value = C9171oooOOoO.OooO00o;

    /* renamed from: final  reason: not valid java name */
    public final Object f23858final = C9171oooOOoO.OooO00o;
    public volatile O00O0000<? extends T> initializer;

    public static final class OooO00o {
        public OooO00o() {
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    public SafePublicationLazyImpl(@NotNull O00O0000<? extends T> o00o0000) {
        o0O0OO00.OooO0o(o00o0000, "initializer");
        this.initializer = o00o0000;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // com.p118pd.sdk.AbstractC9141oooO0oO
    public T getValue() {
        T t = (T) this._value;
        if (t != C9171oooOOoO.OooO00o) {
            return t;
        }
        O00O0000<? extends T> o00o0000 = this.initializer;
        if (o00o0000 != null) {
            T t2 = (T) o00o0000.invoke();
            if (OooO00o.compareAndSet(this, C9171oooOOoO.OooO00o, t2)) {
                this.initializer = null;
                return t2;
            }
        }
        return (T) this._value;
    }

    @Override // com.p118pd.sdk.AbstractC9141oooO0oO
    public boolean isInitialized() {
        return this._value != C9171oooOOoO.OooO00o;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
