package com.p118pd.sdk;

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Vector;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.i1l1l1L */
public class i1l1l1L implements Ii1IliL {
    public static BigInteger OooO00o = BigInteger.valueOf(0);
    public static BigInteger OooO0O0 = BigInteger.valueOf(1);

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1i1i f17422OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17423OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector[] f17424OooO00o = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17425OooO0O0 = false;

    public static BigInteger OooO00o(Vector vector, Vector vector2) {
        BigInteger bigInteger = OooO00o;
        BigInteger bigInteger2 = OooO0O0;
        for (int i = 0; i < vector2.size(); i++) {
            bigInteger2 = bigInteger2.multiply((BigInteger) vector2.elementAt(i));
        }
        for (int i2 = 0; i2 < vector2.size(); i2++) {
            BigInteger bigInteger3 = (BigInteger) vector2.elementAt(i2);
            BigInteger divide = bigInteger2.divide(bigInteger3);
            bigInteger = bigInteger.add(divide.multiply(divide.modInverse(bigInteger3)).multiply((BigInteger) vector.elementAt(i2)));
        }
        return bigInteger.mod(bigInteger2);
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO00o() {
        return this.f17423OooO00o ? ((this.f17422OooO00o.OooO00o() + 7) / 8) - 1 : this.f17422OooO00o.OooO0O0().toByteArray().length;
    }

    public void OooO00o(boolean z) {
        this.f17425OooO0O0 = z;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public void OooO00o(boolean z, AbstractC6370iIIIl r11) {
        this.f17423OooO00o = z;
        if (r11 instanceof liLL1l) {
            r11 = ((liLL1l) r11).OooO00o();
        }
        this.f17422OooO00o = (I1i1i) r11;
        if (!this.f17423OooO00o) {
            if (this.f17425OooO0O0) {
                System.out.println("Constructing lookup Array");
            }
            C6818lI1L r10 = (C6818lI1L) this.f17422OooO00o;
            Vector OooO00o2 = r10.OooO00o();
            this.f17424OooO00o = new Vector[OooO00o2.size()];
            for (int i = 0; i < OooO00o2.size(); i++) {
                BigInteger bigInteger = (BigInteger) OooO00o2.elementAt(i);
                int intValue = bigInteger.intValue();
                this.f17424OooO00o[i] = new Vector();
                this.f17424OooO00o[i].addElement(OooO0O0);
                if (this.f17425OooO0O0) {
                    PrintStream printStream = System.out;
                    printStream.println("Constructing lookup ArrayList for " + intValue);
                }
                BigInteger bigInteger2 = OooO00o;
                for (int i2 = 1; i2 < intValue; i2++) {
                    bigInteger2 = bigInteger2.add(r10.OooO0OO());
                    this.f17424OooO00o[i].addElement(r10.m15288OooO00o().modPow(bigInteger2.divide(bigInteger), r10.OooO0O0()));
                }
            }
        }
    }

    public byte[] OooO00o(BigInteger bigInteger) {
        byte[] byteArray = this.f17422OooO00o.OooO0O0().toByteArray();
        C9586iIILl.OooO00o(byteArray, (byte) 0);
        byte[] byteArray2 = this.f17422OooO00o.m15288OooO00o().modPow(bigInteger, this.f17422OooO00o.OooO0O0()).toByteArray();
        System.arraycopy(byteArray2, 0, byteArray, byteArray.length - byteArray2.length, byteArray2.length);
        if (this.f17425OooO0O0) {
            PrintStream printStream = System.out;
            printStream.println("Encrypted value is:  " + new BigInteger(byteArray));
        }
        return byteArray;
    }

    public byte[] OooO00o(byte[] bArr) throws InvalidCipherTextException {
        byte[] bArr2;
        if (this.f17425OooO0O0) {
            System.out.println();
        }
        if (bArr.length > OooO00o()) {
            int OooO00o2 = OooO00o();
            int OooO0O02 = OooO0O0();
            if (this.f17425OooO0O0) {
                PrintStream printStream = System.out;
                printStream.println("Input blocksize is:  " + OooO00o2 + " bytes");
                PrintStream printStream2 = System.out;
                printStream2.println("Output blocksize is: " + OooO0O02 + " bytes");
                PrintStream printStream3 = System.out;
                printStream3.println("Data has length:.... " + bArr.length + " bytes");
            }
            byte[] bArr3 = new byte[(((bArr.length / OooO00o2) + 1) * OooO0O02)];
            int i = 0;
            int i2 = 0;
            while (i < bArr.length) {
                int i3 = i + OooO00o2;
                if (i3 < bArr.length) {
                    bArr2 = OooO00o(bArr, i, OooO00o2);
                    i = i3;
                } else {
                    bArr2 = OooO00o(bArr, i, bArr.length - i);
                    i += bArr.length - i;
                }
                if (this.f17425OooO0O0) {
                    PrintStream printStream4 = System.out;
                    printStream4.println("new datapos is " + i);
                }
                if (bArr2 != null) {
                    System.arraycopy(bArr2, 0, bArr3, i2, bArr2.length);
                    i2 += bArr2.length;
                } else {
                    if (this.f17425OooO0O0) {
                        System.out.println("cipher returned null");
                    }
                    throw new InvalidCipherTextException("cipher returned null");
                }
            }
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr3, 0, bArr4, 0, i2);
            if (this.f17425OooO0O0) {
                PrintStream printStream5 = System.out;
                printStream5.println("returning " + i2 + " bytes");
            }
            return bArr4;
        }
        if (this.f17425OooO0O0) {
            System.out.println("data size is less then input block size, processing directly");
        }
        return OooO00o(bArr, 0, bArr.length);
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public byte[] OooO00o(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.f17422OooO00o == null) {
            throw new IllegalStateException("NaccacheStern engine not initialised");
        } else if (i2 > OooO00o() + 1) {
            throw new DataLengthException("input too large for Naccache-Stern cipher.\n");
        } else if (this.f17423OooO00o || i2 >= OooO00o()) {
            if (!(i == 0 && i2 == bArr.length)) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                bArr = bArr2;
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (this.f17425OooO0O0) {
                PrintStream printStream = System.out;
                printStream.println("input as BigInteger: " + bigInteger);
            }
            if (this.f17423OooO00o) {
                return OooO00o(bigInteger);
            }
            Vector vector = new Vector();
            C6818lI1L r10 = (C6818lI1L) this.f17422OooO00o;
            Vector OooO00o2 = r10.OooO00o();
            for (int i3 = 0; i3 < OooO00o2.size(); i3++) {
                BigInteger modPow = bigInteger.modPow(r10.OooO0OO().divide((BigInteger) OooO00o2.elementAt(i3)), r10.OooO0O0());
                Vector[] vectorArr = this.f17424OooO00o;
                Vector vector2 = vectorArr[i3];
                if (vectorArr[i3].size() != ((BigInteger) OooO00o2.elementAt(i3)).intValue()) {
                    if (this.f17425OooO0O0) {
                        PrintStream printStream2 = System.out;
                        printStream2.println("Prime is " + OooO00o2.elementAt(i3) + ", lookup table has size " + vector2.size());
                    }
                    throw new InvalidCipherTextException("Error in lookup Array for " + ((BigInteger) OooO00o2.elementAt(i3)).intValue() + ": Size mismatch. Expected ArrayList with length " + ((BigInteger) OooO00o2.elementAt(i3)).intValue() + " but found ArrayList of length " + this.f17424OooO00o[i3].size());
                }
                int indexOf = vector2.indexOf(modPow);
                if (indexOf == -1) {
                    if (this.f17425OooO0O0) {
                        PrintStream printStream3 = System.out;
                        printStream3.println("Actual prime is " + OooO00o2.elementAt(i3));
                        PrintStream printStream4 = System.out;
                        printStream4.println("Decrypted value is " + modPow);
                        PrintStream printStream5 = System.out;
                        printStream5.println("LookupList for " + OooO00o2.elementAt(i3) + " with size " + this.f17424OooO00o[i3].size() + " is: ");
                        for (int i4 = 0; i4 < this.f17424OooO00o[i3].size(); i4++) {
                            System.out.println(this.f17424OooO00o[i3].elementAt(i4));
                        }
                    }
                    throw new InvalidCipherTextException("Lookup failed");
                }
                vector.addElement(BigInteger.valueOf((long) indexOf));
            }
            return OooO00o(vector, OooO00o2).toByteArray();
        } else {
            throw new InvalidCipherTextException("BlockLength does not match modulus for Naccache-Stern cipher.\n");
        }
    }

    public byte[] OooO00o(byte[] bArr, byte[] bArr2) throws InvalidCipherTextException {
        if (this.f17423OooO00o) {
            if (bArr.length > OooO0O0() || bArr2.length > OooO0O0()) {
                throw new InvalidCipherTextException("BlockLength too large for simple addition.\n");
            }
        } else if (bArr.length > OooO00o() || bArr2.length > OooO00o()) {
            throw new InvalidCipherTextException("BlockLength too large for simple addition.\n");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        BigInteger mod = bigInteger.multiply(bigInteger2).mod(this.f17422OooO00o.OooO0O0());
        if (this.f17425OooO0O0) {
            PrintStream printStream = System.out;
            printStream.println("c(m1) as BigInteger:....... " + bigInteger);
            PrintStream printStream2 = System.out;
            printStream2.println("c(m2) as BigInteger:....... " + bigInteger2);
            PrintStream printStream3 = System.out;
            printStream3.println("c(m1)*c(m2)%n = c(m1+m2)%n: " + mod);
        }
        byte[] byteArray = this.f17422OooO00o.OooO0O0().toByteArray();
        C9586iIILl.OooO00o(byteArray, (byte) 0);
        System.arraycopy(mod.toByteArray(), 0, byteArray, byteArray.length - mod.toByteArray().length, mod.toByteArray().length);
        return byteArray;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO0O0() {
        return this.f17423OooO00o ? this.f17422OooO00o.OooO0O0().toByteArray().length : ((this.f17422OooO00o.OooO00o() + 7) / 8) - 1;
    }
}
