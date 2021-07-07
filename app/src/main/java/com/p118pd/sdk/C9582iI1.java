package com.p118pd.sdk;

import com.taobao.accs.antibrush.AntiBrush;
import com.taobao.accs.common.Constants;
import com.taobao.accs.flowcontrol.FlowControl;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;

/* renamed from: com.pd.sdk.丨iI1  reason: invalid class name and case insensitive filesystem */
public class C9582iI1 implements AbstractC5599L1Ii {
    public static int[] OooO00o = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, Lillilli.OooooOo, Lillilli.Oooooo, Lillilli.ooOO, 199, AbstractC9366ILlIL.OooO00o, 223, 227, 229, 233, 239, 241, TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, oO0oO000.Oooo00o, 331, 337, oO0oO000.OoooO00, 349, TinkerReport.KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND, 359, 367, 373, 379, 383, 389, 397, TinkerReport.KEY_LOADED_SUCC_COST_1000_LESS, 409, AntiBrush.STATUS_BRUSH, FlowControl.STATUS_FLOW_CTRL_CUR, 431, 433, 439, Constants.PORT, 449, 457, 461, 463, 467, 479, 487, 491, 499, C8713oo0o0o.OooO, 509, 521, 523, oOO000OO.OooOo00, 547, C8025oOO00oOO.Oooo0};
    public static final BigInteger OooO0oO = BigInteger.valueOf(1);

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6135iI1i f23157OooO00o;

    public static int OooO00o(SecureRandom secureRandom, int i) {
        int nextInt;
        int i2;
        if (((-i) & i) == i) {
            return (int) ((((long) i) * ((long) (secureRandom.nextInt() & Integer.MAX_VALUE))) >> 31);
        }
        do {
            nextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i2 = nextInt % i;
        } while ((nextInt - i2) + (i - 1) < 0);
        return i2;
    }

    public static BigInteger OooO00o(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigInteger = new BigInteger(i, i2, secureRandom);
        while (bigInteger.bitLength() != i) {
            bigInteger = new BigInteger(i, i2, secureRandom);
        }
        return bigInteger;
    }

    public static Vector OooO00o(int i) {
        Vector vector = new Vector(i);
        for (int i2 = 0; i2 != i; i2++) {
            vector.addElement(BigInteger.valueOf((long) OooO00o[i2]));
        }
        return vector;
    }

    public static Vector OooO00o(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            vector3.addElement(vector.elementAt(i));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), OooO00o(secureRandom, vector2.size() + 1));
        }
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public i1LLl1L OooO00o() {
        long j;
        BigInteger OooO00o2;
        BigInteger add;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger OooO00o3;
        BigInteger add2;
        BigInteger bigInteger3;
        long j2;
        BigInteger bigInteger4;
        boolean z;
        BigInteger bigInteger5;
        PrintStream printStream;
        StringBuilder sb;
        String str;
        BigInteger bigInteger6;
        int OooO00o4 = this.f23157OooO00o.OooO00o();
        SecureRandom OooO00o5 = this.f23157OooO00o.m17607OooO00o();
        int OooO0O0 = this.f23157OooO00o.OooO0O0();
        boolean OooO00o6 = this.f23157OooO00o.OooO00o();
        if (OooO00o6) {
            PrintStream printStream2 = System.out;
            printStream2.println("Fetching first " + this.f23157OooO00o.OooO0OO() + " primes.");
        }
        Vector OooO00o7 = OooO00o(OooO00o(this.f23157OooO00o.OooO0OO()), OooO00o5);
        BigInteger bigInteger7 = OooO0oO;
        BigInteger bigInteger8 = bigInteger7;
        for (int i = 0; i < OooO00o7.size() / 2; i++) {
            bigInteger8 = bigInteger8.multiply((BigInteger) OooO00o7.elementAt(i));
        }
        for (int size = OooO00o7.size() / 2; size < OooO00o7.size(); size++) {
            bigInteger7 = bigInteger7.multiply((BigInteger) OooO00o7.elementAt(size));
        }
        BigInteger multiply = bigInteger8.multiply(bigInteger7);
        int bitLength = (((OooO00o4 - multiply.bitLength()) - 48) / 2) + 1;
        BigInteger OooO00o8 = OooO00o(bitLength, OooO0O0, OooO00o5);
        BigInteger OooO00o9 = OooO00o(bitLength, OooO0O0, OooO00o5);
        if (OooO00o6) {
            System.out.println("generating p and q");
        }
        BigInteger shiftLeft = OooO00o8.multiply(bigInteger8).shiftLeft(1);
        BigInteger shiftLeft2 = OooO00o9.multiply(bigInteger7).shiftLeft(1);
        long j3 = 0;
        while (true) {
            j = j3 + 1;
            OooO00o2 = OooO00o(24, OooO0O0, OooO00o5);
            add = OooO00o2.multiply(shiftLeft).add(OooO0oO);
            if (!add.isProbablePrime(OooO0O0)) {
                bigInteger2 = shiftLeft2;
                bigInteger = shiftLeft;
            } else {
                while (true) {
                    do {
                        OooO00o3 = OooO00o(24, OooO0O0, OooO00o5);
                    } while (OooO00o2.equals(OooO00o3));
                    bigInteger2 = shiftLeft2;
                    add2 = OooO00o3.multiply(shiftLeft2).add(OooO0oO);
                    if (add2.isProbablePrime(OooO0O0)) {
                        break;
                    }
                    shiftLeft2 = bigInteger2;
                }
                bigInteger = shiftLeft;
                if (!multiply.gcd(OooO00o2.multiply(OooO00o3)).equals(OooO0oO)) {
                    continue;
                } else if (add.multiply(add2).bitLength() >= OooO00o4) {
                    break;
                } else if (OooO00o6) {
                    PrintStream printStream3 = System.out;
                    printStream3.println("key size too small. Should be " + OooO00o4 + " but is actually " + add.multiply(add2).bitLength());
                }
            }
            j3 = j;
            shiftLeft2 = bigInteger2;
            shiftLeft = bigInteger;
        }
        if (OooO00o6) {
            PrintStream printStream4 = System.out;
            bigInteger3 = OooO00o9;
            printStream4.println("needed " + j + " tries to generate p and q.");
        } else {
            bigInteger3 = OooO00o9;
        }
        BigInteger multiply2 = add.multiply(add2);
        BigInteger multiply3 = add.subtract(OooO0oO).multiply(add2.subtract(OooO0oO));
        if (OooO00o6) {
            System.out.println("generating g");
        }
        long j4 = 0;
        while (true) {
            Vector vector = new Vector();
            j2 = j4;
            int i2 = 0;
            while (i2 != OooO00o7.size()) {
                BigInteger divide = multiply3.divide((BigInteger) OooO00o7.elementAt(i2));
                while (true) {
                    j2++;
                    bigInteger6 = new BigInteger(OooO00o4, OooO0O0, OooO00o5);
                    if (!bigInteger6.modPow(divide, multiply2).equals(OooO0oO)) {
                        break;
                    }
                    OooO00o4 = OooO00o4;
                    OooO00o5 = OooO00o5;
                }
                vector.addElement(bigInteger6);
                i2++;
                OooO00o4 = OooO00o4;
                OooO00o5 = OooO00o5;
            }
            bigInteger4 = OooO0oO;
            for (int i3 = 0; i3 < OooO00o7.size(); i3++) {
                bigInteger4 = bigInteger4.multiply(((BigInteger) vector.elementAt(i3)).modPow(multiply.divide((BigInteger) OooO00o7.elementAt(i3)), multiply2)).mod(multiply2);
            }
            int i4 = 0;
            while (true) {
                if (i4 >= OooO00o7.size()) {
                    z = false;
                    break;
                } else if (bigInteger4.modPow(multiply3.divide((BigInteger) OooO00o7.elementAt(i4)), multiply2).equals(OooO0oO)) {
                    if (OooO00o6) {
                        PrintStream printStream5 = System.out;
                        printStream5.println("g has order phi(n)/" + OooO00o7.elementAt(i4) + "\n g: " + bigInteger4);
                    }
                    z = true;
                } else {
                    i4++;
                }
            }
            if (!z) {
                if (!bigInteger4.modPow(multiply3.divide(BigInteger.valueOf(4)), multiply2).equals(OooO0oO)) {
                    if (!bigInteger4.modPow(multiply3.divide(OooO00o2), multiply2).equals(OooO0oO)) {
                        if (!bigInteger4.modPow(multiply3.divide(OooO00o3), multiply2).equals(OooO0oO)) {
                            if (!bigInteger4.modPow(multiply3.divide(OooO00o8), multiply2).equals(OooO0oO)) {
                                bigInteger5 = bigInteger3;
                                if (!bigInteger4.modPow(multiply3.divide(bigInteger5), multiply2).equals(OooO0oO)) {
                                    break;
                                }
                                if (OooO00o6) {
                                    PrintStream printStream6 = System.out;
                                    printStream6.println("g has order phi(n)/b\n g: " + bigInteger4);
                                }
                                bigInteger3 = bigInteger5;
                                add = add;
                                j4 = j2;
                                add2 = add2;
                                OooO00o4 = OooO00o4;
                                OooO00o5 = OooO00o5;
                            } else if (OooO00o6) {
                                printStream = System.out;
                                sb = new StringBuilder();
                                str = "g has order phi(n)/a\n g: ";
                            }
                        } else if (OooO00o6) {
                            printStream = System.out;
                            sb = new StringBuilder();
                            str = "g has order phi(n)/q'\n g: ";
                        }
                    } else if (OooO00o6) {
                        printStream = System.out;
                        sb = new StringBuilder();
                        str = "g has order phi(n)/p'\n g: ";
                    }
                } else if (OooO00o6) {
                    printStream = System.out;
                    sb = new StringBuilder();
                    str = "g has order phi(n)/4\n g:";
                }
                sb.append(str);
                sb.append(bigInteger4);
                printStream.println(sb.toString());
            }
            bigInteger5 = bigInteger3;
            bigInteger3 = bigInteger5;
            add = add;
            j4 = j2;
            add2 = add2;
            OooO00o4 = OooO00o4;
            OooO00o5 = OooO00o5;
        }
        if (OooO00o6) {
            PrintStream printStream7 = System.out;
            printStream7.println("needed " + j2 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            PrintStream printStream8 = System.out;
            printStream8.println("smallPrimes: " + OooO00o7);
            PrintStream printStream9 = System.out;
            printStream9.println("sigma:...... " + multiply + " (" + multiply.bitLength() + " bits)");
            PrintStream printStream10 = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("a:.......... ");
            sb2.append(OooO00o8);
            printStream10.println(sb2.toString());
            PrintStream printStream11 = System.out;
            printStream11.println("b:.......... " + bigInteger5);
            PrintStream printStream12 = System.out;
            printStream12.println("p':......... " + OooO00o2);
            PrintStream printStream13 = System.out;
            printStream13.println("q':......... " + OooO00o3);
            PrintStream printStream14 = System.out;
            printStream14.println("p:.......... " + add);
            PrintStream printStream15 = System.out;
            printStream15.println("q:.......... " + add2);
            PrintStream printStream16 = System.out;
            printStream16.println("n:.......... " + multiply2);
            PrintStream printStream17 = System.out;
            printStream17.println("phi(n):..... " + multiply3);
            PrintStream printStream18 = System.out;
            printStream18.println("g:.......... " + bigInteger4);
            System.out.println();
        }
        return new i1LLl1L((C6213iL11I) new I1i1i(false, bigInteger4, multiply2, multiply.bitLength()), (C6213iL11I) new C6818lI1L(bigInteger4, multiply2, multiply.bitLength(), OooO00o7, multiply3));
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public void OooO00o(C6470l1i r1) {
        this.f23157OooO00o = (C6135iI1i) r1;
    }
}
