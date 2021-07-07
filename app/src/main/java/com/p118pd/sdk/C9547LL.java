package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3617o;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.丨L丨L  reason: invalid class name and case insensitive filesystem */
public class C9547LL {
    public static final int OooO = 70;
    public static final int OooO0O0 = 0;
    public static final int OooO0OO = 10;
    public static final int OooO0Oo = 20;
    public static final int OooO0o = 40;
    public static final int OooO0o0 = 30;
    public static final int OooO0oO = 50;
    public static final int OooO0oo = 60;

    /* renamed from: OooO  reason: collision with other field name */
    public BigInteger f23117OooO;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6436l11LI f23118OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f23119OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger f23120OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SecureRandom f23121OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public char[] f23122OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f23123OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final BigInteger f23124OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final BigInteger f23125OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public BigInteger f23126OooO0Oo;

    /* renamed from: OooO0o  reason: collision with other field name */
    public BigInteger f23127OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public BigInteger f23128OooO0o0;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public BigInteger f23129OooO0oO;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public BigInteger f23130OooO0oo;
    public BigInteger OooOO0;

    public C9547LL(String str, char[] cArr) {
        this(str, cArr, C1L.OooO0OO);
    }

    public C9547LL(String str, char[] cArr, C6648liIIL r9) {
        this(str, cArr, r9, new I1li1Ll(), IIllii.OooO00o());
    }

    public C9547LL(String str, char[] cArr, C6648liIIL r4, AbstractC6436l11LI r5, SecureRandom secureRandom) {
        C6570lLI11I.OooO00o((Object) str, "participantId");
        C6570lLI11I.OooO00o(cArr, "password");
        C6570lLI11I.OooO00o(r4, C3617o.f9365as);
        C6570lLI11I.OooO00o((Object) r5, AbstractC9852lIli.OooO0O0);
        C6570lLI11I.OooO00o(secureRandom, "random");
        if (cArr.length != 0) {
            this.f23119OooO00o = str;
            this.f23122OooO00o = C9586iIILl.OooO00o(cArr, cArr.length);
            this.f23120OooO00o = r4.OooO0O0();
            this.f23124OooO0O0 = r4.OooO0OO();
            this.f23125OooO0OO = r4.OooO00o();
            this.f23118OooO00o = r5;
            this.f23121OooO00o = secureRandom;
            this.OooO00o = 0;
            return;
        }
        throw new IllegalArgumentException("Password must not be empty.");
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6374iL m21606OooO00o() {
        if (this.OooO00o < 10) {
            this.f23126OooO0Oo = C6570lLI11I.OooO00o(this.f23124OooO0O0, this.f23121OooO00o);
            this.f23128OooO0o0 = C6570lLI11I.OooO0O0(this.f23124OooO0O0, this.f23121OooO00o);
            this.f23127OooO0o = C6570lLI11I.OooO00o(this.f23120OooO00o, this.f23125OooO0OO, this.f23126OooO0Oo);
            this.f23129OooO0oO = C6570lLI11I.OooO00o(this.f23120OooO00o, this.f23125OooO0OO, this.f23128OooO0o0);
            BigInteger[] OooO00o2 = C6570lLI11I.OooO00o(this.f23120OooO00o, this.f23124OooO0O0, this.f23125OooO0OO, this.f23127OooO0o, this.f23126OooO0Oo, this.f23119OooO00o, this.f23118OooO00o, this.f23121OooO00o);
            BigInteger[] OooO00o3 = C6570lLI11I.OooO00o(this.f23120OooO00o, this.f23124OooO0O0, this.f23125OooO0OO, this.f23129OooO0oO, this.f23128OooO0o0, this.f23119OooO00o, this.f23118OooO00o, this.f23121OooO00o);
            this.OooO00o = 10;
            return new C6374iL(this.f23119OooO00o, this.f23127OooO0o, this.f23129OooO0oO, OooO00o2, OooO00o3);
        }
        throw new IllegalStateException("Round1 payload already created for " + this.f23119OooO00o);
    }

    public C6408ilIl OooO00o(BigInteger bigInteger) {
        int i = this.OooO00o;
        if (i >= 60) {
            throw new IllegalStateException("Round3 payload already created for " + this.f23119OooO00o);
        } else if (i >= 50) {
            BigInteger OooO00o2 = C6570lLI11I.OooO00o(this.f23119OooO00o, this.f23123OooO0O0, this.f23127OooO0o, this.f23129OooO0oO, this.f23130OooO0oo, this.f23117OooO, bigInteger, this.f23118OooO00o);
            this.OooO00o = 60;
            return new C6408ilIl(this.f23119OooO00o, OooO00o2);
        } else {
            throw new IllegalStateException("Keying material must be calculated prior to creating Round3 payload for " + this.f23119OooO00o);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1iLL1 m21607OooO00o() {
        int i = this.OooO00o;
        if (i >= 30) {
            throw new IllegalStateException("Round2 payload already created for " + this.f23119OooO00o);
        } else if (i >= 20) {
            BigInteger OooO0O02 = C6570lLI11I.OooO0O0(this.f23120OooO00o, this.f23127OooO0o, this.f23130OooO0oo, this.f23117OooO);
            BigInteger OooO0O03 = C6570lLI11I.OooO0O0(this.f23124OooO0O0, this.f23128OooO0o0, C6570lLI11I.OooO00o(this.f23122OooO00o));
            BigInteger OooO00o2 = C6570lLI11I.OooO00o(this.f23120OooO00o, this.f23124OooO0O0, OooO0O02, OooO0O03);
            BigInteger[] OooO00o3 = C6570lLI11I.OooO00o(this.f23120OooO00o, this.f23124OooO0O0, OooO0O02, OooO00o2, OooO0O03, this.f23119OooO00o, this.f23118OooO00o, this.f23121OooO00o);
            this.OooO00o = 30;
            return new C1iLL1(this.f23119OooO00o, OooO00o2, OooO00o3);
        } else {
            throw new IllegalStateException("Round1 payload must be validated prior to creating Round2 payload for " + this.f23119OooO00o);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21608OooO00o() {
        int i = this.OooO00o;
        if (i >= 50) {
            throw new IllegalStateException("Key already calculated for " + this.f23119OooO00o);
        } else if (i >= 40) {
            BigInteger OooO00o2 = C6570lLI11I.OooO00o(this.f23122OooO00o);
            C9586iIILl.OooO00o(this.f23122OooO00o, (char) 0);
            this.f23122OooO00o = null;
            BigInteger OooO00o3 = C6570lLI11I.OooO00o(this.f23120OooO00o, this.f23124OooO0O0, this.f23117OooO, this.f23128OooO0o0, OooO00o2, this.OooOO0);
            this.f23126OooO0Oo = null;
            this.f23128OooO0o0 = null;
            this.OooOO0 = null;
            this.OooO00o = 50;
            return OooO00o3;
        } else {
            throw new IllegalStateException("Round2 payload must be validated prior to creating key for " + this.f23119OooO00o);
        }
    }

    public void OooO00o(C6374iL r15) throws CryptoException {
        if (this.OooO00o < 20) {
            this.f23123OooO0O0 = r15.OooO00o();
            this.f23130OooO0oo = r15.m17486OooO00o();
            this.f23117OooO = r15.OooO0O0();
            BigInteger[] OooO00o2 = r15.m17487OooO00o();
            BigInteger[] OooO0O02 = r15.m17488OooO0O0();
            C6570lLI11I.OooO00o(this.f23119OooO00o, r15.OooO00o());
            C6570lLI11I.OooO0O0(this.f23117OooO);
            C6570lLI11I.OooO00o(this.f23120OooO00o, this.f23124OooO0O0, this.f23125OooO0OO, this.f23130OooO0oo, OooO00o2, r15.OooO00o(), this.f23118OooO00o);
            C6570lLI11I.OooO00o(this.f23120OooO00o, this.f23124OooO0O0, this.f23125OooO0OO, this.f23117OooO, OooO0O02, r15.OooO00o(), this.f23118OooO00o);
            this.OooO00o = 20;
            return;
        }
        throw new IllegalStateException("Validation already attempted for round1 payload for" + this.f23119OooO00o);
    }

    public void OooO00o(C6408ilIl r13, BigInteger bigInteger) throws CryptoException {
        int i = this.OooO00o;
        if (i >= 70) {
            throw new IllegalStateException("Validation already attempted for round3 payload for" + this.f23119OooO00o);
        } else if (i >= 50) {
            C6570lLI11I.OooO00o(this.f23119OooO00o, r13.OooO00o());
            C6570lLI11I.OooO0O0(this.f23123OooO0O0, r13.OooO00o());
            C6570lLI11I.OooO00o(this.f23119OooO00o, this.f23123OooO0O0, this.f23127OooO0o, this.f23129OooO0oO, this.f23130OooO0oo, this.f23117OooO, bigInteger, this.f23118OooO00o, r13.m17525OooO00o());
            this.f23127OooO0o = null;
            this.f23129OooO0oO = null;
            this.f23130OooO0oo = null;
            this.f23117OooO = null;
            this.OooO00o = 70;
        } else {
            throw new IllegalStateException("Keying material must be calculated validated prior to validating Round3 payload for " + this.f23119OooO00o);
        }
    }

    public void OooO00o(C1iLL1 r13) throws CryptoException {
        int i = this.OooO00o;
        if (i >= 40) {
            throw new IllegalStateException("Validation already attempted for round2 payload for" + this.f23119OooO00o);
        } else if (i >= 20) {
            BigInteger OooO0O02 = C6570lLI11I.OooO0O0(this.f23120OooO00o, this.f23130OooO0oo, this.f23127OooO0o, this.f23129OooO0oO);
            this.OooOO0 = r13.m21312OooO00o();
            BigInteger[] OooO00o2 = r13.m21313OooO00o();
            C6570lLI11I.OooO00o(this.f23119OooO00o, r13.OooO00o());
            C6570lLI11I.OooO0O0(this.f23123OooO0O0, r13.OooO00o());
            C6570lLI11I.OooO00o(OooO0O02);
            C6570lLI11I.OooO00o(this.f23120OooO00o, this.f23124OooO0O0, OooO0O02, this.OooOO0, OooO00o2, r13.OooO00o(), this.f23118OooO00o);
            this.OooO00o = 40;
        } else {
            throw new IllegalStateException("Round1 payload must be validated prior to validating Round2 payload for " + this.f23119OooO00o);
        }
    }
}
