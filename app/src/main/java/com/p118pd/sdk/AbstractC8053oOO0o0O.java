package com.p118pd.sdk;

import com.drew.lang.annotations.Nullable;
import com.p118pd.sdk.C8054oOO0o0O0;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOO0o0O  reason: case insensitive filesystem */
public abstract class AbstractC8053oOO0o0O<T extends C8054oOO0o0O0> extends C8046oOO0Oo0 {
    public ArrayList<T> OooO00o = new ArrayList<>((int) this.OooO0O0);
    public long OooO0O0;

    public AbstractC8053oOO0o0O(AbstractC7917oO0o000O oo0o000o, C8044oOO0OOoo ooo0oooo) throws IOException {
        super(oo0o000o, ooo0oooo);
        this.OooO0O0 = oo0o000o.m19626OooO0OO();
        for (int i = 0; ((long) i) < this.OooO0O0; i++) {
            this.OooO00o.add(OooO00o(oo0o000o));
        }
    }

    @Nullable
    public abstract T OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException;
}
