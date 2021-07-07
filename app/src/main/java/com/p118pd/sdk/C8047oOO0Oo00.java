package com.p118pd.sdk;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOO0Oo00  reason: case insensitive filesystem */
public class C8047oOO0Oo00 extends C8044oOO0OOoo {
    public ArrayList<String> OooO00o = new ArrayList<>((int) ((((C8044oOO0OOoo) this).OooO00o / 16) >> 2));
    public long OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f21074OooO0O0;

    public C8047oOO0Oo00(AbstractC7917oO0o000O oo0o000o, C8044oOO0OOoo ooo0oooo) throws IOException {
        super(ooo0oooo);
        this.f21074OooO0O0 = oo0o000o.OooO00o(4);
        this.OooO0O0 = oo0o000o.m19626OooO0OO();
        for (int i = 16; ((long) i) < ((C8044oOO0OOoo) this).OooO00o; i += 4) {
            this.OooO00o.add(oo0o000o.OooO00o(4));
        }
    }

    public void OooO00o(oOO0OOOO ooo0oooo) {
        ooo0oooo.m19648OooO00o(4096, this.f21074OooO0O0);
        ooo0oooo.OooO00o(4097, this.OooO0O0);
        ArrayList<String> arrayList = this.OooO00o;
        ooo0oooo.OooO00o(4098, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}
