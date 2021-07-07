package kotlin;

import com.p118pd.sdk.AbstractC9141oooO0oO;
import com.p118pd.sdk.C9171oooOOoO;
import com.p118pd.sdk.O00O0000;
import com.p118pd.sdk.O0o0o;
import com.p118pd.sdk.o0O0OO00;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, mo43195d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public final class SynchronizedLazyImpl<T> implements AbstractC9141oooO0oO<T>, Serializable {
    public volatile Object _value;
    public O00O0000<? extends T> initializer;
    public final Object lock;

    public SynchronizedLazyImpl(@NotNull O00O0000<? extends T> o00o0000, @Nullable Object obj) {
        o0O0OO00.OooO0o(o00o0000, "initializer");
        this.initializer = o00o0000;
        this._value = C9171oooOOoO.OooO00o;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // com.p118pd.sdk.AbstractC9141oooO0oO
    public T getValue() {
        T t;
        T t2 = (T) this._value;
        if (t2 != C9171oooOOoO.OooO00o) {
            return t2;
        }
        synchronized (this.lock) {
            t = (T) this._value;
            if (t == C9171oooOOoO.OooO00o) {
                O00O0000<? extends T> o00o0000 = this.initializer;
                if (o00o0000 == null) {
                    o0O0OO00.OooO0o0();
                }
                t = (T) o00o0000.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }

    @Override // com.p118pd.sdk.AbstractC9141oooO0oO
    public boolean isInitialized() {
        return this._value != C9171oooOOoO.OooO00o;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SynchronizedLazyImpl(O00O0000 o00o0000, Object obj, int i, O0o0o o0o0o) {
        this(o00o0000, (i & 2) != 0 ? null : obj);
    }
}
