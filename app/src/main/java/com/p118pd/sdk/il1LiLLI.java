package com.p118pd.sdk;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.il1LiLLI */
public class il1LiLLI extends BufferedWriter {
    public static final int o0ooOO0 = 64;
    public char[] OooO00o = new char[64];
    public final int o00oO0O;

    public il1LiLLI(Writer writer) {
        super(writer);
        String OooO00o2 = Strings.m22984OooO00o();
        this.o00oO0O = OooO00o2 != null ? OooO00o2.length() : 2;
    }

    private void OooO00o(String str) throws IOException {
        write(C9428Ill1L.o0ooOoO + str + "-----");
        newLine();
    }

    private void OooO00o(byte[] bArr) throws IOException {
        int i;
        byte[] OooO0O0 = C6808lllI.OooO0O0(bArr);
        int i2 = 0;
        while (i2 < OooO0O0.length) {
            int i3 = 0;
            while (true) {
                char[] cArr = this.OooO00o;
                if (i3 == cArr.length || (i = i2 + i3) >= OooO0O0.length) {
                    write(this.OooO00o, 0, i3);
                    newLine();
                    i2 += this.OooO00o.length;
                } else {
                    cArr[i3] = (char) OooO0O0[i];
                    i3++;
                }
            }
            write(this.OooO00o, 0, i3);
            newLine();
            i2 += this.OooO00o.length;
        }
    }

    private void OooO0O0(String str) throws IOException {
        write(C9428Ill1L.o0ooOOo + str + "-----");
        newLine();
    }

    public int OooO00o(C11L1L r5) {
        int length = ((r5.m21231OooO00o().length() + 10 + this.o00oO0O) * 2) + 6 + 4;
        if (!r5.m21232OooO00o().isEmpty()) {
            for (i11I1 r2 : r5.m21232OooO00o()) {
                length += r2.OooO00o().length() + 2 + r2.OooO0O0().length() + this.o00oO0O;
            }
            length += this.o00oO0O;
        }
        int length2 = ((r5.m21233OooO00o().length + 2) / 3) * 4;
        return length + length2 + ((((length2 + 64) - 1) / 64) * this.o00oO0O);
    }

    public void OooO00o(LliILl1 lliILl1) throws IOException {
        C11L1L OooO00o2 = lliILl1.OooO00o();
        OooO0O0(OooO00o2.m21231OooO00o());
        if (!OooO00o2.m21232OooO00o().isEmpty()) {
            for (i11I1 r1 : OooO00o2.m21232OooO00o()) {
                write(r1.OooO00o());
                write(": ");
                write(r1.OooO0O0());
                newLine();
            }
            newLine();
        }
        OooO00o(OooO00o2.m21233OooO00o());
        OooO00o(OooO00o2.m21231OooO00o());
    }
}
