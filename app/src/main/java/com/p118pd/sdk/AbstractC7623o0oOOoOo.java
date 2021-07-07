package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC7623o0oOOoOo;
import com.p118pd.sdk.C8283oOo000oo;

/* renamed from: com.pd.sdk.o0oOOoOo  reason: case insensitive filesystem */
public abstract class AbstractC7623o0oOOoOo<CHILD extends AbstractC7623o0oOOoOo<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public AbstractC8274oOo0000O<? super TranscodeType> OooO00o = C7836oO00ooOO.m19513OooO00o();

    private CHILD OooO0OO() {
        return this;
    }

    @NonNull
    public final CHILD OooO00o(int i) {
        return OooO00o(new C7839oO00ooo0(i));
    }

    @NonNull
    public final CHILD OooO0O0() {
        return OooO00o(C7836oO00ooOO.m19513OooO00o());
    }

    @NonNull
    public final CHILD OooO00o(@NonNull C8283oOo000oo.OooO00o oooO00o) {
        return OooO00o(new C7838oO00ooo(oooO00o));
    }

    @NonNull
    public final CHILD OooO00o(@NonNull AbstractC8274oOo0000O<? super TranscodeType> ooo0000o) {
        this.OooO00o = (AbstractC8274oOo0000O) C7842oO0O0.OooO00o(ooo0000o);
        return OooO0OO();
    }

    /* renamed from: OooO00o */
    public final CHILD clone() {
        try {
            return (CHILD) ((AbstractC7623o0oOOoOo) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final AbstractC8274oOo0000O<? super TranscodeType> m19258OooO00o() {
        return this.OooO00o;
    }
}
