package com.p118pd.sdk;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOOO0  reason: case insensitive filesystem */
public class C8086oOOO0 extends C8095oOOO00oo {
    public ArrayList<String> OooO00o = new ArrayList<>();
    public long OooO0O0;
    public String OooO0OO;

    public C8086oOOO0(AbstractC7917oO0o000O oo0o000o, C8095oOOO00oo oooo00oo) throws IOException {
        super(oooo00oo);
        this.OooO0OO = oo0o000o.OooO00o(4);
        this.OooO0O0 = oo0o000o.m19626OooO0OO();
        for (int i = 16; ((long) i) < ((C8095oOOO00oo) this).OooO00o; i += 4) {
            this.OooO00o.add(oo0o000o.OooO00o(4));
        }
    }

    public void OooO00o(C8091oOOO00Oo oooo00oo) {
        oooo00oo.m19648OooO00o(1, this.OooO0OO);
        oooo00oo.OooO00o(2, this.OooO0O0);
        ArrayList<String> arrayList = this.OooO00o;
        oooo00oo.OooO00o(3, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}
