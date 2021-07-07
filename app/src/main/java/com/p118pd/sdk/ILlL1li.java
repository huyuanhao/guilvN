package com.p118pd.sdk;

import p293rx.internal.util.UtilityFunctions;

/* renamed from: com.pd.sdk.ILlL1li */
public final class ILlL1li {
    public static final Object OooO00o = new Object();

    /* renamed from: com.pd.sdk.ILlL1li$OooO00o */
    public static class OooO00o implements AbstractC5189I1l1l<Object, Object, Boolean> {
        public final /* synthetic */ AbstractC5189I1l1l OooO00o;

        public OooO00o(AbstractC5189I1l1l r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC5189I1l1l
        public Boolean OooO00o(Object obj, Object obj2) {
            boolean z = obj == ILlL1li.OooO00o;
            boolean z2 = obj2 == ILlL1li.OooO00o;
            if (z && z2) {
                return true;
            }
            if (z || z2) {
                return false;
            }
            return (Boolean) this.OooO00o.OooO00o(obj, obj2);
        }
    }

    public ILlL1li() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> C9349III<Object> OooO00o(C9349III<T> r1) {
        return C9349III.OooO0O0((C9349III) r1, C9349III.OooO0oO(OooO00o));
    }

    public static <T> C9349III<Boolean> OooO00o(C9349III<? extends T> r1, C9349III<? extends T> r2, AbstractC5189I1l1l<? super T, ? super T, Boolean> r3) {
        return C9349III.OooO0OO(OooO00o(r1), OooO00o(r2), new OooO00o(r3)).OooO00o((AbstractC9847l1) UtilityFunctions.OooO0OO());
    }
}
