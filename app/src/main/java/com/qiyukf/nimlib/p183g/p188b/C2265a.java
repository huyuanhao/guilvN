package com.qiyukf.nimlib.p183g.p188b;

import android.content.Context;
import com.p118pd.sdk.C7491o0OoOOO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.C1708a;
import com.qiyukf.nimlib.C2106a;
import com.qiyukf.nimlib.p176b.C2187d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.zip.CRC32;

/* renamed from: com.qiyukf.nimlib.g.b.a */
public final class C2265a {

    /* renamed from: a */
    public int f4511a;

    /* renamed from: b */
    public PublicKey f4512b;

    /* renamed from: a */
    public static C2265a m4763a(Context context) {
        C2265a aVar = new C2265a();
        File file = new File(m4769b());
        try {
            FileInputStream fileInputStream = file.exists() ? new FileInputStream(file) : null;
            if (fileInputStream == null || !aVar.m4767a((InputStream) fileInputStream, true)) {
                aVar.m4767a(context.getAssets().open(m4764a(true)), false);
            }
        } catch (Exception unused) {
        }
        return aVar;
    }

    /* renamed from: a */
    public static String m4764a(boolean z) {
        if (!C2187d.m4518e()) {
            return C2187d.m4515b() ? z ? "keystore_unicorn2" : "bbgsvirgin2" : z ? "keystore_unicorn" : "bbgsvirgin";
        }
        return C2187d.m4518e() && C1708a.m3005d().test ? "bbgsvirgin3" : "bbgsvirgin4";
    }

    /* renamed from: a */
    public static void m4765a() {
        m4770c();
    }

    /* renamed from: a */
    public static void m4766a(int i, byte[] bArr, long j) {
        if (bArr != null && m4768a(bArr, j)) {
            try {
                byte[] encoded = KeyFactory.getInstance(C7491o0OoOOO.OooO00o).generatePublic(new RSAPublicKeySpec(new BigInteger(bArr), new BigInteger("10001", 16))).getEncoded();
                ByteBuffer allocate = ByteBuffer.allocate(encoded.length + 12);
                allocate.putLong(j);
                allocate.putInt(i);
                allocate.put(encoded);
                File file = new File(m4769b());
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(new File(m4769b()));
                fileOutputStream.write(allocate.array(), 0, allocate.capacity());
                fileOutputStream.close();
            } catch (Exception e) {
                m4770c();
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private boolean m4767a(InputStream inputStream, boolean z) {
        byte[] bArr = new byte[256];
        try {
            int read = inputStream.read(bArr);
            long j = 0;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            if (z) {
                j = wrap.getLong();
                read -= 8;
            }
            int i = wrap.getInt();
            this.f4511a = i;
            if (i < 0) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                return false;
            }
            byte[] bArr2 = new byte[(read - 4)];
            wrap.get(bArr2);
            PublicKey generatePublic = KeyFactory.getInstance(C7491o0OoOOO.OooO00o).generatePublic(new X509EncodedKeySpec(bArr2));
            this.f4512b = generatePublic;
            if (!z || m4768a(((RSAPublicKey) generatePublic).getModulus().toByteArray(), j)) {
                try {
                    inputStream.close();
                    return true;
                } catch (IOException unused2) {
                    return true;
                }
            } else {
                m4770c();
                this.f4512b = null;
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                inputStream.close();
            } catch (IOException unused4) {
            }
            return false;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused5) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m4768a(byte[] bArr, long j) {
        if (bArr == null) {
            return false;
        }
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, 0, bArr.length);
        return j == crc32.getValue();
    }

    /* renamed from: b */
    public static String m4769b() {
        return C2106a.f4241b + C8932ooOOO0o.OooO0OO + m4764a(false);
    }

    /* renamed from: c */
    public static void m4770c() {
        new File(m4769b()).delete();
    }
}
