package com.p118pd.sdk;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;

/* renamed from: com.pd.sdk.o0OOo0o0  reason: case insensitive filesystem */
public class C7424o0OOo0o0 extends PushbackReader {
    public static final int o000OOo = 8;
    public static final int o0O0O00 = 5;
    public static final int o0OO00O = 3;
    public static final int o0OOO0o = 1;
    public static final int o0Oo0oo = 2;
    public static final int o0ooOoO = 0;
    public static final int oo0o0Oo = 4;
    public int o00oO0O = 0;
    public int o0ooOO0 = 0;
    public int o0ooOOo = 0;

    public C7424o0OOo0o0(Reader reader) {
        super(reader, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (com.p118pd.sdk.C7431o0OOoO0o.OooO00o((char) r10.o0ooOO0) != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        if (com.p118pd.sdk.C7431o0OOoO0o.OooO00o((char) r10.o0ooOO0) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private char OooO00o(char r11) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7424o0OOo0o0.OooO00o(char):char");
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        char[] cArr2 = new char[8];
        boolean z = true;
        int i3 = 0;
        loop0:
        while (true) {
            int i4 = 0;
            while (z && i3 < i2) {
                z = super.read(cArr2, i4, 1) == 1;
                if (z) {
                    char OooO00o = OooO00o(cArr2[i4]);
                    int i5 = this.o00oO0O;
                    if (i5 == 0) {
                        if (C7431o0OOoO0o.OooO00o(OooO00o)) {
                            OooO00o = ' ';
                        }
                        cArr[i] = OooO00o;
                        i3++;
                        i++;
                    } else {
                        i4++;
                        if (i5 == 5) {
                            unread(cArr2, 0, i4);
                        }
                    }
                } else if (i4 > 0) {
                    unread(cArr2, 0, i4);
                    this.o00oO0O = 5;
                    z = true;
                }
            }
        }
        if (i3 > 0 || z) {
            return i3;
        }
        return -1;
    }
}
