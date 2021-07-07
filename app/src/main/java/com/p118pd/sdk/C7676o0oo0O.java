package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC7734o0ooo00O;
import java.io.File;

/* renamed from: com.pd.sdk.o0oo0O  reason: case insensitive filesystem */
public class C7676o0oo0O<DataType> implements AbstractC7734o0ooo00O.OooO0O0 {
    public final AbstractC7641o0oOoO<DataType> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7648o0oOoOo f20557OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final DataType f20558OooO00o;

    public C7676o0oo0O(AbstractC7641o0oOoO<DataType> o0oooo, DataType datatype, C7648o0oOoOo o0ooooo) {
        this.OooO00o = o0oooo;
        this.f20558OooO00o = datatype;
        this.f20557OooO00o = o0ooooo;
    }

    @Override // com.p118pd.sdk.AbstractC7734o0ooo00O.OooO0O0
    public boolean OooO00o(@NonNull File file) {
        return this.OooO00o.OooO00o(this.f20558OooO00o, file, this.f20557OooO00o);
    }
}
