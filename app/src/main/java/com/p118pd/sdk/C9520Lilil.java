package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨Li丨lil  reason: invalid class name and case insensitive filesystem */
public class C9520Lilil {
    public static final int OooO = 13;
    public static final int OooO00o = 1;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;
    public static final int OooO0oO = 7;
    public static final int OooO0oo = 8;
    public static final int OooOO0 = 15;
    public static final int OooOO0O = 16;
    public static final int OooOO0o = 17;
    public static final int OooOOO = 19;
    public static final int OooOOO0 = 18;
    public static final int OooOOOO = 20;
    public static final int OooOOOo = 22;
    public static final int OooOOo = 24;
    public static final int OooOOo0 = 23;
    public static final int OooOOoo = 25;
    public static final int OooOo = 30;
    public static final int OooOo0 = 27;
    public static final int OooOo00 = 26;
    public static final int OooOo0O = 28;
    public static final int OooOo0o = 29;
    public static final int OooOoO = 33;
    public static final int OooOoO0 = 32;
    public static final int OooOoOO = 34;
    public static final int OooOoo = 36;
    public static final int OooOoo0 = 35;
    public static final int OooOooO = 37;
    public static final int OooOooo = 38;
    public static final int Oooo = 50;
    public static final int Oooo0 = 42;
    public static final int Oooo000 = 39;
    public static final int Oooo00O = 40;
    public static final int Oooo00o = 41;
    public static final int Oooo0O0 = 43;
    public static final int Oooo0OO = 44;
    public static final int Oooo0o = 46;
    public static final int Oooo0o0 = 45;
    public static final int Oooo0oO = 47;
    public static final int Oooo0oo = 48;
    public static final int OoooO = 54;
    public static final int OoooO0 = 52;
    public static final int OoooO00 = 51;
    public static final int OoooO0O = 53;
    public static final int OoooOO0 = 55;
    public static final int OoooOOO = 56;
    public static final int OoooOOo = 57;
    public static final int OoooOo0 = 58;
    public static final int OoooOoO = 59;
    public static final int OoooOoo = 60;
    public static final int Ooooo00 = 64;
    public static final int Ooooo0o = 65;
    public static final int OooooO0 = 66;
    public static final int OooooOO = 67;
    public static final int OooooOo = 68;
    public static final int Oooooo = 70;
    public static final int Oooooo0 = 69;
    public static final int OoooooO = 71;
    public static final int Ooooooo = 72;
    public static final int o0000 = 30;
    public static final int o00000 = 14;
    public static final int o000000 = 11;
    public static final int o000000O = 12;
    public static final int o000000o = 13;
    public static final int o00000O = 19;
    public static final int o00000O0 = 15;
    public static final int o00000OO = 24;
    public static final int o00000Oo = 25;
    public static final int o00000o0 = 26;
    public static final int o00000oO = 28;
    public static final int o00000oo = 29;
    public static final int o0000O = 61;
    public static final int o0000O0 = 34;
    public static final int o0000O00 = 32;
    public static final int o0000O0O = 35;
    public static final int o0000OO = 73;
    public static final int o0000OO0 = 72;
    public static final int o0000OOO = 76;
    public static final int o0000OOo = 78;
    public static final int o0000Oo = 0;
    public static final int o0000Oo0 = 78;
    public static final int o0000OoO = 1;
    public static final int o0000Ooo = 27;
    public static final int o0000oO = 33;
    public static final int o0000oo = 33;
    public static final int o000OO = 46;
    public static final int o000OOo = 10;
    public static final int o000oOoO = 55;
    public static final int o00O0O = 75;
    public static final int o00Oo0 = 76;
    public static final int o00Ooo = 77;
    public static final int o00o0O = 78;
    public static final int o00oO0O = 61;
    public static final int o00oO0o = 82;
    public static final int o00ooo = 80;
    public static final int o0O0O00 = 8;
    public static final int o0OO00O = 6;
    public static final int o0OOO0o = 4;
    public static final int o0Oo0oo = 5;
    public static final int o0OoOo0 = 73;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public static final int o0ooOoO = 3;
    public static final int oo000o = 81;
    public static final int oo0o0Oo = 7;
    public static final int ooOO = 74;

    public static int OooO00o(int i) {
        int i2 = 0;
        boolean z = false;
        for (int i3 = 24; i3 >= 0; i3 -= 8) {
            int i4 = (i >> i3) & 255;
            if (i4 != 0) {
                if (z) {
                    i2 = (i2 << 7) | (i4 & 127);
                } else {
                    int i5 = i4 & 31;
                    if (i5 != 31) {
                        return i5;
                    }
                    z = true;
                }
            }
        }
        return i2;
    }

    public static int OooO00o(AbstractC8947ooOOOOo0 ooooooo0) {
        int i = ooooooo0.OooO00o() ? 96 : 64;
        int OooO0OO2 = ooooooo0.OooO0OO();
        if (OooO0OO2 <= 31) {
            return i | OooO0OO2;
        }
        int i2 = ((i | 31) << 8) | (OooO0OO2 & 127);
        while (true) {
            OooO0OO2 >>= 7;
            if (OooO0OO2 <= 0) {
                return i2;
            }
            i2 = (i2 | 128) << 8;
        }
    }

    public static int OooO0O0(int i) {
        return OooO00o(i);
    }

    public static int OooO0OO(int i) {
        for (int i2 = 24; i2 >= 0; i2 -= 8) {
            int i3 = 255 << i2;
            if ((i3 & i) != 0) {
                return i & (i3 ^ -1);
            }
        }
        return 0;
    }
}
