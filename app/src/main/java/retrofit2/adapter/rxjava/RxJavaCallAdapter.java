package retrofit2.adapter.rxjava;

import com.p118pd.sdk.LL1LL;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;

public final class RxJavaCallAdapter<R> implements CallAdapter<R, Object> {
    public final boolean isAsync;
    public final boolean isBody;
    public final boolean isCompletable;
    public final boolean isResult;
    public final boolean isSingle;
    public final Type responseType;
    @Nullable
    public final LL1LL scheduler;

    public RxJavaCallAdapter(Type type, @Nullable LL1LL ll1ll, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.responseType = type;
        this.scheduler = ll1ll;
        this.isAsync = z;
        this.isResult = z2;
        this.isBody = z3;
        this.isSingle = z4;
        this.isCompletable = z5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    @Override // retrofit2.CallAdapter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object adapt(retrofit2.Call<R> r2) {
        /*
            r1 = this;
            boolean r0 = r1.isAsync
            if (r0 == 0) goto L_0x000a
            retrofit2.adapter.rxjava.CallEnqueueOnSubscribe r0 = new retrofit2.adapter.rxjava.CallEnqueueOnSubscribe
            r0.<init>(r2)
            goto L_0x000f
        L_0x000a:
            retrofit2.adapter.rxjava.CallExecuteOnSubscribe r0 = new retrofit2.adapter.rxjava.CallExecuteOnSubscribe
            r0.<init>(r2)
        L_0x000f:
            boolean r2 = r1.isResult
            if (r2 == 0) goto L_0x001a
            retrofit2.adapter.rxjava.ResultOnSubscribe r2 = new retrofit2.adapter.rxjava.ResultOnSubscribe
            r2.<init>(r0)
        L_0x0018:
            r0 = r2
            goto L_0x0024
        L_0x001a:
            boolean r2 = r1.isBody
            if (r2 == 0) goto L_0x0024
            retrofit2.adapter.rxjava.BodyOnSubscribe r2 = new retrofit2.adapter.rxjava.BodyOnSubscribe
            r2.<init>(r0)
            goto L_0x0018
        L_0x0024:
            com.pd.sdk.丨III r2 = com.p118pd.sdk.C9349III.OooO00o(r0)
            com.pd.sdk.LL1LL r0 = r1.scheduler
            if (r0 == 0) goto L_0x0030
            com.pd.sdk.丨III r2 = r2.OooO0OO(r0)
        L_0x0030:
            boolean r0 = r1.isSingle
            if (r0 == 0) goto L_0x0039
            com.pd.sdk.LL丨il11 r2 = r2.OooO00o()
            return r2
        L_0x0039:
            boolean r0 = r1.isCompletable
            if (r0 == 0) goto L_0x0041
            com.pd.sdk.L丨lI丨l r2 = r2.m21392OooO00o()
        L_0x0041:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava.RxJavaCallAdapter.adapt(retrofit2.Call):java.lang.Object");
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.responseType;
    }
}
