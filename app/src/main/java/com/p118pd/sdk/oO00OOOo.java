package com.p118pd.sdk;

import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.oO00OOOo */
public class oO00OOOo extends AbstractC7794oO00O0o<C7796oO00OO> implements AbstractC7695o0oo0o0o {
    public oO00OOOo(C7796oO00OO oo00oo) {
        super(oo00oo);
    }

    /* Return type fixed from 'java.lang.Class<com.pd.sdk.oO00OO>' to match base method */
    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7794oO00O0o
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7796oO00OO m19506OooO00o() {
        return C7796oO00OO.class;
    }

    @Override // com.p118pd.sdk.AbstractC7695o0oo0o0o, com.p118pd.sdk.AbstractC7794oO00O0o
    public void initialize() {
        ((C7796oO00OO) this.OooO00o).m19486OooO00o().prepareToDraw();
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
    public void recycle() {
        ((C7796oO00OO) this.OooO00o).stop();
        ((C7796oO00OO) this.OooO00o).m19491OooO0O0();
    }

    /* Return type fixed from 'int' to match base method */
    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7794oO00O0o
    public C7796oO00OO OooO00o() {
        return ((C7796oO00OO) this.OooO00o).OooO0OO();
    }
}
