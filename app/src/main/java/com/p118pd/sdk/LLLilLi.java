package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

/* renamed from: com.pd.sdk.L丨LLilLi  reason: invalid class name */
public class LLLilLi implements AbstractC6370iIIIl {
    public static final int o00oO0O = 0;
    public static final int o0OO00O = 48;
    public static final int o0OOO0o = 16;
    public static final int o0Oo0oo = 20;
    public static final int o0ooOO0 = 4;
    public static final int o0ooOOo = 8;
    public static final int o0ooOoO = 12;
    public static final int oo0o0Oo = 63;
    public Hashtable OooO00o;

    /* renamed from: com.pd.sdk.L丨LLilLi$OooO0O0 */
    public static class OooO0O0 {
        public Hashtable OooO00o = new Hashtable();

        public OooO0O0() {
        }

        public OooO0O0(LLLilLi r5) {
            Enumeration keys = r5.OooO00o.keys();
            while (keys.hasMoreElements()) {
                Integer num = (Integer) keys.nextElement();
                this.OooO00o.put(num, r5.OooO00o.get(num));
            }
        }

        public OooO0O0(Hashtable hashtable) {
            Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                Integer num = (Integer) keys.nextElement();
                this.OooO00o.put(num, hashtable.get(num));
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

        public LLLilLi OooO00o() {
            return new LLLilLi(this.OooO00o);
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

    public LLLilLi() {
        this(new Hashtable());
    }

    public LLLilLi(Hashtable hashtable) {
        this.OooO00o = hashtable;
    }

    public Hashtable OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16431OooO00o() {
        return (byte[]) this.OooO00o.get(I11I.OooO00o(0));
    }

    public byte[] OooO0O0() {
        return (byte[]) this.OooO00o.get(I11I.OooO00o(16));
    }

    public byte[] OooO0OO() {
        return (byte[]) this.OooO00o.get(I11I.OooO00o(20));
    }

    public byte[] OooO0Oo() {
        return (byte[]) this.OooO00o.get(I11I.OooO00o(8));
    }

    public byte[] OooO0o0() {
        return (byte[]) this.OooO00o.get(I11I.OooO00o(12));
    }
}
