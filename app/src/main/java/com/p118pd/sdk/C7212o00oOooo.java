package com.p118pd.sdk;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

/* renamed from: com.pd.sdk.o00oOooo  reason: case insensitive filesystem */
public class C7212o00oOooo {

    /* renamed from: com.pd.sdk.o00oOooo$OooO00o */
    public static class OooO00o implements AbstractC7208o00oOoOo<X> {
        public final /* synthetic */ AbstractC6969o0000o0o OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7206o00oOoO0 f19713OooO00o;

        public OooO00o(C7206o00oOoO0 o00oooo0, AbstractC6969o0000o0o o0000o0o) {
            this.f19713OooO00o = o00oooo0;
            this.OooO00o = o0000o0o;
        }

        @Override // com.p118pd.sdk.AbstractC7208o00oOoOo
        public void OooO00o(@Nullable X x) {
            this.f19713OooO00o.OooO0O0(this.OooO00o.OooO00o(x));
        }
    }

    /* renamed from: com.pd.sdk.o00oOooo$OooO0O0 */
    public static class OooO0O0 implements AbstractC7208o00oOoOo<X> {
        public LiveData<Y> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6969o0000o0o f19714OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7206o00oOoO0 f19715OooO00o;

        /* renamed from: com.pd.sdk.o00oOooo$OooO0O0$OooO00o */
        public class OooO00o implements AbstractC7208o00oOoOo<Y> {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC7208o00oOoOo
            public void OooO00o(@Nullable Y y) {
                OooO0O0.this.f19715OooO00o.OooO0O0((Object) y);
            }
        }

        public OooO0O0(AbstractC6969o0000o0o o0000o0o, C7206o00oOoO0 o00oooo0) {
            this.f19714OooO00o = o0000o0o;
            this.f19715OooO00o = o00oooo0;
        }

        @Override // com.p118pd.sdk.AbstractC7208o00oOoOo
        public void OooO00o(@Nullable X x) {
            LiveData<Y> liveData = (LiveData) this.f19714OooO00o.OooO00o(x);
            LiveData<Y> liveData2 = this.OooO00o;
            if (liveData2 != liveData) {
                if (liveData2 != null) {
                    this.f19715OooO00o.OooO00o((LiveData) liveData2);
                }
                this.OooO00o = liveData;
                if (liveData != null) {
                    this.f19715OooO00o.OooO00o(liveData, new OooO00o());
                }
            }
        }
    }

    @MainThread
    public static <X, Y> LiveData<Y> OooO00o(@NonNull LiveData<X> liveData, @NonNull AbstractC6969o0000o0o<X, Y> o0000o0o) {
        C7206o00oOoO0 o00oooo0 = new C7206o00oOoO0();
        o00oooo0.OooO00o(liveData, new OooO00o(o00oooo0, o0000o0o));
        return o00oooo0;
    }

    @MainThread
    public static <X, Y> LiveData<Y> OooO0O0(@NonNull LiveData<X> liveData, @NonNull AbstractC6969o0000o0o<X, LiveData<Y>> o0000o0o) {
        C7206o00oOoO0 o00oooo0 = new C7206o00oOoO0();
        o00oooo0.OooO00o(liveData, new OooO0O0(o0000o0o, o00oooo0));
        return o00oooo0;
    }
}
