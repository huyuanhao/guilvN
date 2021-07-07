package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import p293rx.functions.Actions;
import p293rx.internal.operators.OnSubscribeAutoConnect;

/* renamed from: com.pd.sdk.i11iiILl */
public abstract class i11iiILl<T> extends C9349III<T> {

    /* renamed from: com.pd.sdk.i11iiILl$OooO00o */
    public class OooO00o implements AbstractC6153iL1l<LlIiLii> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LlIiLii[] f17342OooO00o;

        public OooO00o(LlIiLii[] llIiLiiArr) {
            this.f17342OooO00o = llIiLiiArr;
        }

        /* renamed from: OooO00o */
        public void call(LlIiLii llIiLii) {
            this.f17342OooO00o[0] = llIiLii;
        }
    }

    public i11iiILl(C9349III.OooO00o<T> oooO00o) {
        super(oooO00o);
    }

    public C9349III<T> OooO00o(int i, AbstractC6153iL1l<? super LlIiLii> il1l) {
        if (i > 0) {
            return C9349III.OooO0O0((C9349III.OooO00o) new OnSubscribeAutoConnect(this, i, il1l));
        }
        OooO0O0(il1l);
        return this;
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III
    public final LlIiLii OooO0O0() {
        LlIiLii[] llIiLiiArr = new LlIiLii[1];
        OooO0O0((AbstractC6153iL1l<? super LlIiLii>) new OooO00o(llIiLiiArr));
        return llIiLiiArr[0];
    }

    @Override // com.p118pd.sdk.C9349III
    public abstract void OooO0O0(AbstractC6153iL1l<? super LlIiLii> il1l);

    public C9349III<T> OooOOO(int i) {
        return OooO00o(i, (AbstractC6153iL1l<? super LlIiLii>) Actions.m22996OooO00o());
    }

    public C9349III<T> OooOooO() {
        return OooOOO(1);
    }

    public C9349III<T> OooOooo() {
        return C9349III.OooO0O0((C9349III.OooO00o) new C6095iILLII(this));
    }
}
