package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.spec.AlgorithmParameterSpec;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.pd.sdk.丨L1l丨  reason: invalid class name and case insensitive filesystem */
public class C9467L1l implements AlgorithmParameterSpec {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 4;
    public static final int OooO0OO = 8;
    public static final int OooO0Oo = 12;
    public static final int OooO0o = 20;
    public static final int OooO0o0 = 16;
    public static final int OooO0oO = 48;
    public static final int OooO0oo = 63;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f23038OooO00o;

    /* renamed from: com.pd.sdk.丨L1l丨$OooO0O0 */
    public static class OooO0O0 {
        public Map OooO00o = new HashMap();

        public OooO0O0() {
        }

        public OooO0O0(C9467L1l r5) {
            for (Integer num : r5.f23038OooO00o.keySet()) {
                this.OooO00o.put(num, r5.f23038OooO00o.get(num));
            }
        }

        public OooO0O0 OooO00o(int i, byte[] bArr) {
            if (bArr == null) {
                throw new IllegalArgumentException("Parameter value must not be null.");
            } else if (i != 0 && (i <= 4 || i >= 63 || i == 48)) {
                throw new IllegalArgumentException("Parameter types must be in the range 0,5..47,49..62.");
            } else if (i != 4) {
                this.OooO00o.put(I11I.OooO00o(i), bArr);
                return this;
            } else {
                throw new IllegalArgumentException("Parameter type 4 is reserved for internal use.");
            }
        }

        public OooO0O0 OooO00o(Date date, String str, String str2) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, "UTF-8");
                outputStreamWriter.write(new SimpleDateFormat("YYYYMMDD").format(date));
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str);
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                return OooO00o(8, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException("Byte I/O failed: " + e);
            }
        }

        public OooO0O0 OooO00o(Date date, Locale locale, String str, String str2) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, "UTF-8");
                outputStreamWriter.write(new SimpleDateFormat("YYYYMMDD", locale).format(date));
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str);
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                return OooO00o(8, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException("Byte I/O failed: " + e);
            }
        }

        public OooO0O0 OooO00o(byte[] bArr) {
            return OooO00o(0, bArr);
        }

        public C9467L1l OooO00o() {
            return new C9467L1l(this.OooO00o);
        }

        public OooO0O0 OooO0O0(byte[] bArr) {
            return OooO00o(16, bArr);
        }

        public OooO0O0 OooO0OO(byte[] bArr) {
            return OooO00o(20, bArr);
        }

        public OooO0O0 OooO0Oo(byte[] bArr) {
            return OooO00o(8, bArr);
        }

        public OooO0O0 OooO0o0(byte[] bArr) {
            return OooO00o(12, bArr);
        }
    }

    public C9467L1l() {
        this(new HashMap());
    }

    public C9467L1l(Map map) {
        this.f23038OooO00o = Collections.unmodifiableMap(map);
    }

    public Map OooO00o() {
        return this.f23038OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21519OooO00o() {
        return C9586iIILl.m21630OooO00o((byte[]) this.f23038OooO00o.get(I11I.OooO00o(0)));
    }

    public byte[] OooO0O0() {
        return C9586iIILl.m21630OooO00o((byte[]) this.f23038OooO00o.get(I11I.OooO00o(16)));
    }

    public byte[] OooO0OO() {
        return C9586iIILl.m21630OooO00o((byte[]) this.f23038OooO00o.get(I11I.OooO00o(20)));
    }

    public byte[] OooO0Oo() {
        return C9586iIILl.m21630OooO00o((byte[]) this.f23038OooO00o.get(I11I.OooO00o(8)));
    }

    public byte[] OooO0o0() {
        return C9586iIILl.m21630OooO00o((byte[]) this.f23038OooO00o.get(I11I.OooO00o(12)));
    }
}
