package org.bouncycastle.jcajce.provider.drbg;

import com.p118pd.sdk.AbstractC5552Iil;
import com.p118pd.sdk.AbstractC6380iLi;
import com.p118pd.sdk.AbstractC6464l1l;
import com.p118pd.sdk.AbstractC6769llL1L;
import com.p118pd.sdk.C5622LILlL;
import com.p118pd.sdk.C6383iLl1;
import com.p118pd.sdk.C6443l1Il;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.C9599iIiI1;
import com.p118pd.sdk.Il1LIlll;
import com.p118pd.sdk.l1I1L;
import com.umeng.message.UmengMessageHandler;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.util.Strings;

public class DRBG {
    public static final String OooO00o = "org.bouncycastle.jcajce.provider.drbg.DRBG";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object[] f23955OooO00o = OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[][] f23956OooO00o = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};

    public static class CoreSecureRandom extends SecureRandom {
        public CoreSecureRandom() {
            super((SecureRandomSpi) DRBG.f23955OooO00o[1], (Provider) DRBG.f23955OooO00o[0]);
        }
    }

    public static class Default extends SecureRandomSpi {
        public static final SecureRandom OooO00o = DRBG.OooO0O0(true);

        public byte[] engineGenerateSeed(int i) {
            return OooO00o.generateSeed(i);
        }

        public void engineNextBytes(byte[] bArr) {
            OooO00o.nextBytes(bArr);
        }

        public void engineSetSeed(byte[] bArr) {
            OooO00o.setSeed(bArr);
        }
    }

    public static class HybridRandomProvider extends Provider {
        public HybridRandomProvider() {
            super("BCHEP", 1.0d, "Bouncy Castle Hybrid Entropy Provider");
        }
    }

    public static class HybridSecureRandom extends SecureRandom {
        public final SecureRandom baseRandom = DRBG.OooO0Oo();
        public final SP800SecureRandom drbg = new C9599iIiI1(new OooO00o()).OooO00o(Strings.m22985OooO00o("Bouncy Castle Hybrid Entropy Source")).OooO00o((AbstractC6769llL1L) new C6383iLl1(new C5622LILlL()), this.baseRandom.generateSeed(32), false);
        public final AtomicInteger samples = new AtomicInteger(0);
        public final AtomicBoolean seedAvailable = new AtomicBoolean(false);

        public class OooO00o implements AbstractC6380iLi {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC6380iLi
            public AbstractC5552Iil OooO00o(int i) {
                return new OooO0O0(i);
            }
        }

        public class OooO0O0 implements AbstractC5552Iil {
            public final int OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final AtomicBoolean f23957OooO00o = new AtomicBoolean(false);

            /* renamed from: OooO00o  reason: collision with other field name */
            public final AtomicReference f23958OooO00o = new AtomicReference();

            public class OooO00o implements Runnable {
                public final int o00oO0O;

                public OooO00o(int i) {
                    this.o00oO0O = i;
                }

                public void run() {
                    OooO0O0.this.f23958OooO00o.set(HybridSecureRandom.this.baseRandom.generateSeed(this.o00oO0O));
                    HybridSecureRandom.this.seedAvailable.set(true);
                }
            }

            public OooO0O0(int i) {
                this.OooO00o = (i + 7) / 8;
            }

            @Override // com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil
            public int OooO00o() {
                return this.OooO00o * 8;
            }

            @Override // com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil
            /* renamed from: OooO00o  reason: collision with other method in class */
            public boolean m22968OooO00o() {
                return true;
            }

            @Override // com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil
            /* renamed from: OooO00o  reason: collision with other method in class */
            public byte[] m22969OooO00o() {
                byte[] bArr = (byte[]) this.f23958OooO00o.getAndSet(null);
                if (bArr == null || bArr.length != this.OooO00o) {
                    bArr = HybridSecureRandom.this.baseRandom.generateSeed(this.OooO00o);
                } else {
                    this.f23957OooO00o.set(false);
                }
                if (!this.f23957OooO00o.getAndSet(true)) {
                    new Thread(new OooO00o(this.OooO00o)).start();
                }
                return bArr;
            }
        }

        public HybridSecureRandom() {
            super(null, new HybridRandomProvider());
        }

        public byte[] generateSeed(int i) {
            byte[] bArr = new byte[i];
            if (this.samples.getAndIncrement() > 20 && this.seedAvailable.getAndSet(false)) {
                this.samples.set(0);
                this.drbg.reseed(null);
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandom
        public void setSeed(long j) {
            SP800SecureRandom sP800SecureRandom = this.drbg;
            if (sP800SecureRandom != null) {
                sP800SecureRandom.setSeed(j);
            }
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
            SP800SecureRandom sP800SecureRandom = this.drbg;
            if (sP800SecureRandom != null) {
                sP800SecureRandom.setSeed(bArr);
            }
        }
    }

    public static class NonceAndIV extends SecureRandomSpi {
        public static final SecureRandom OooO00o = DRBG.OooO0O0(false);

        public byte[] engineGenerateSeed(int i) {
            return OooO00o.generateSeed(i);
        }

        public void engineNextBytes(byte[] bArr) {
            OooO00o.nextBytes(bArr);
        }

        public void engineSetSeed(byte[] bArr) {
            OooO00o.setSeed(bArr);
        }
    }

    public static class OooO00o implements PrivilegedAction<Boolean> {
        /* renamed from: OooO00o */
        public Boolean run() {
            try {
                return Boolean.valueOf(SecureRandom.class.getMethod("getInstanceStrong", new Class[0]) != null);
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static class OooO0O0 implements PrivilegedAction<SecureRandom> {
        /* renamed from: OooO00o */
        public SecureRandom run() {
            try {
                return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                return DRBG.OooO0OO();
            }
        }
    }

    public static class OooO0OO implements PrivilegedAction<AbstractC6380iLi> {
        public final /* synthetic */ String OooO00o;

        public OooO0OO(String str) {
            this.OooO00o = str;
        }

        /* renamed from: OooO00o */
        public AbstractC6380iLi run() {
            try {
                return (AbstractC6380iLi) C6443l1Il.OooO00o(DRBG.class, this.OooO00o).newInstance();
            } catch (Exception e) {
                throw new IllegalStateException("entropy source " + this.OooO00o + " not created: " + e.getMessage(), e);
            }
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.drbg.DRBG$OooO0Oo  reason: case insensitive filesystem */
    public static class C9948OooO0Oo extends Il1LIlll {
        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("SecureRandom.DEFAULT", DRBG.OooO00o + "$Default");
            r3.addAlgorithm("SecureRandom.NONCEANDIV", DRBG.OooO00o + "$NonceAndIV");
        }
    }

    public static class URLSeededSecureRandom extends SecureRandom {
        public final InputStream seedStream;

        public class OooO00o implements PrivilegedAction<InputStream> {
            public final /* synthetic */ URL OooO00o;

            public OooO00o(URL url) {
                this.OooO00o = url;
            }

            /* renamed from: OooO00o */
            public InputStream run() {
                try {
                    return this.OooO00o.openStream();
                } catch (IOException unused) {
                    throw new InternalError("unable to open random source");
                }
            }
        }

        public class OooO0O0 implements PrivilegedAction<Integer> {
            public final /* synthetic */ int OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ byte[] f23962OooO00o;
            public final /* synthetic */ int OooO0O0;

            public OooO0O0(byte[] bArr, int i, int i2) {
                this.f23962OooO00o = bArr;
                this.OooO00o = i;
                this.OooO0O0 = i2;
            }

            /* renamed from: OooO00o */
            public Integer run() {
                try {
                    return Integer.valueOf(URLSeededSecureRandom.this.seedStream.read(this.f23962OooO00o, this.OooO00o, this.OooO0O0));
                } catch (IOException unused) {
                    throw new InternalError("unable to read random source");
                }
            }
        }

        public URLSeededSecureRandom(URL url) {
            super(null, new HybridRandomProvider());
            this.seedStream = (InputStream) AccessController.doPrivileged(new OooO00o(url));
        }

        private int OooO00o(byte[] bArr, int i, int i2) {
            return ((Integer) AccessController.doPrivileged(new OooO0O0(bArr, i, i2))).intValue();
        }

        public byte[] generateSeed(int i) {
            byte[] bArr;
            synchronized (this) {
                bArr = new byte[i];
                int i2 = 0;
                while (i2 != i) {
                    int OooO00o2 = OooO00o(bArr, i2, i - i2);
                    if (OooO00o2 <= -1) {
                        break;
                    }
                    i2 += OooO00o2;
                }
                if (i2 != i) {
                    throw new InternalError("unable to fully read random source");
                }
            }
            return bArr;
        }

        @Override // java.security.SecureRandom
        public void setSeed(long j) {
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
        }
    }

    public static AbstractC6380iLi OooO00o() {
        return (AbstractC6380iLi) AccessController.doPrivileged(new OooO0OO(System.getProperty("org.bouncycastle.drbg.entropysource")));
    }

    public static byte[] OooO00o(byte[] bArr) {
        return C9586iIILl.OooO00o(Strings.m22985OooO00o(UmengMessageHandler.DEFAULT_NOTIFICATION_CHANNEL_NAME), bArr, AbstractC6464l1l.OooO00o(Thread.currentThread().getId()), AbstractC6464l1l.OooO00o(System.currentTimeMillis()));
    }

    public static SecureRandom OooO0O0(boolean z) {
        if (System.getProperty("org.bouncycastle.drbg.entropysource") != null) {
            AbstractC6380iLi OooO00o2 = OooO00o();
            AbstractC5552Iil OooO00o3 = OooO00o2.OooO00o(128);
            byte[] OooO00o4 = OooO00o3.m15831OooO00o();
            return new C9599iIiI1(OooO00o2).OooO00o(z ? OooO00o(OooO00o4) : OooO0O0(OooO00o4)).OooO00o(new C5622LILlL(), C9586iIILl.m21645OooO0O0(OooO00o3.m15831OooO00o(), OooO00o3.m15831OooO00o()), z);
        }
        HybridSecureRandom hybridSecureRandom = new HybridSecureRandom();
        byte[] generateSeed = hybridSecureRandom.generateSeed(16);
        return new C9599iIiI1(hybridSecureRandom, true).OooO00o(z ? OooO00o(generateSeed) : OooO0O0(generateSeed)).OooO00o(new C5622LILlL(), hybridSecureRandom.generateSeed(32), z);
    }

    public static byte[] OooO0O0(byte[] bArr) {
        return C9586iIILl.OooO00o(Strings.m22985OooO00o("Nonce"), bArr, AbstractC6464l1l.OooO0O0(Thread.currentThread().getId()), AbstractC6464l1l.OooO0O0(System.currentTimeMillis()));
    }

    public static final Object[] OooO0O0() {
        int i = 0;
        while (true) {
            String[][] strArr = f23956OooO00o;
            if (i >= strArr.length) {
                return null;
            }
            String[] strArr2 = strArr[i];
            try {
                return new Object[]{Class.forName(strArr2[0]).newInstance(), Class.forName(strArr2[1]).newInstance()};
            } catch (Throwable unused) {
                i++;
            }
        }
    }

    public static SecureRandom OooO0OO() {
        if (f23955OooO00o != null) {
            return new CoreSecureRandom();
        }
        try {
            return new URLSeededSecureRandom(new URL(Security.getProperty("securerandom.source")));
        } catch (Exception unused) {
            return new SecureRandom();
        }
    }

    public static SecureRandom OooO0Oo() {
        return ((Boolean) AccessController.doPrivileged(new OooO00o())).booleanValue() ? (SecureRandom) AccessController.doPrivileged(new OooO0O0()) : OooO0OO();
    }
}
