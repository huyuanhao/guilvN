package com.google.android.gms.internal.firebase_ml;

import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public final class zzqq implements Closeable, Flushable {
    public static final String[] zzbav = new String[128];
    public static final String[] zzbaw;
    public final Writer out;
    public String separator;
    public boolean zzazy;
    public int[] zzbag = new int[32];
    public int zzbah = 0;
    public String zzbax;
    public String zzbay;
    public boolean zzbaz;

    static {
        for (int i = 0; i <= 31; i++) {
            zzbav[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = zzbav;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzbaw = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzqq(Writer writer) {
        zzbs(6);
        this.separator = Constants.COLON_SEPARATOR;
        this.zzbaz = true;
        this.out = writer;
    }

    private final int peek() {
        int i = this.zzbah;
        if (i != 0) {
            return this.zzbag[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final zzqq zza(int i, String str) throws IOException {
        zzoe();
        zzbs(i);
        this.out.write(str);
        return this;
    }

    private final void zzbs(int i) {
        int i2 = this.zzbah;
        int[] iArr = this.zzbag;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.zzbag = iArr2;
        }
        int[] iArr3 = this.zzbag;
        int i3 = this.zzbah;
        this.zzbah = i3 + 1;
        iArr3[i3] = i;
    }

    private final void zzbu(int i) {
        this.zzbag[this.zzbah - 1] = i;
    }

    private final zzqq zzc(int i, int i2, String str) throws IOException {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.zzbay == null) {
            this.zzbah--;
            if (peek == i2) {
                zzod();
            }
            this.out.write(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.zzbay);
        }
    }

    private final void zzcl(String str) throws IOException {
        String str2;
        String[] strArr = zzbav;
        this.out.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.out.write(str, i, i2 - i);
            }
            this.out.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.out.write(str, i, length - i);
        }
        this.out.write("\"");
    }

    private final void zzob() throws IOException {
        if (this.zzbay != null) {
            int peek = peek();
            if (peek == 5) {
                this.out.write(44);
            } else if (peek != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzod();
            zzbu(4);
            zzcl(this.zzbay);
            this.zzbay = null;
        }
    }

    private final void zzod() throws IOException {
        if (this.zzbax != null) {
            this.out.write("\n");
            int i = this.zzbah;
            for (int i2 = 1; i2 < i; i2++) {
                this.out.write(this.zzbax);
            }
        }
    }

    private final void zzoe() throws IOException {
        int peek = peek();
        if (peek == 1) {
            zzbu(2);
            zzod();
        } else if (peek == 2) {
            this.out.append(AbstractC1299b.COMMA);
            zzod();
        } else if (peek != 4) {
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.zzazy) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            zzbu(7);
        } else {
            this.out.append((CharSequence) this.separator);
            zzbu(5);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.out.close();
        int i = this.zzbah;
        if (i > 1 || (i == 1 && this.zzbag[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzbah = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzbah != 0) {
            this.out.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void setIndent(String str) {
        if (str.length() == 0) {
            this.zzbax = null;
            this.separator = Constants.COLON_SEPARATOR;
            return;
        }
        this.zzbax = str;
        this.separator = ": ";
    }

    public final void setLenient(boolean z) {
        this.zzazy = true;
    }

    public final zzqq zzag(boolean z) throws IOException {
        zzob();
        zzoe();
        this.out.write(z ? "true" : "false");
        return this;
    }

    public final zzqq zzb(double d) throws IOException {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        zzob();
        zzoe();
        this.out.append((CharSequence) Double.toString(d));
        return this;
    }

    public final zzqq zzcj(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.zzbay != null) {
            throw new IllegalStateException();
        } else if (this.zzbah != 0) {
            this.zzbay = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final zzqq zzck(String str) throws IOException {
        if (str == null) {
            return zzoc();
        }
        zzob();
        zzoe();
        zzcl(str);
        return this;
    }

    public final zzqq zznx() throws IOException {
        zzob();
        return zza(1, "[");
    }

    public final zzqq zzny() throws IOException {
        return zzc(1, 2, "]");
    }

    public final zzqq zznz() throws IOException {
        zzob();
        return zza(3, "{");
    }

    public final zzqq zzo(long j) throws IOException {
        zzob();
        zzoe();
        this.out.write(Long.toString(j));
        return this;
    }

    public final zzqq zzoa() throws IOException {
        return zzc(3, 5, C7522o0Ooo0o.OooO0Oo);
    }

    public final zzqq zzoc() throws IOException {
        if (this.zzbay != null) {
            if (this.zzbaz) {
                zzob();
            } else {
                this.zzbay = null;
                return this;
            }
        }
        zzoe();
        this.out.write("null");
        return this;
    }

    public final zzqq zza(Number number) throws IOException {
        if (number == null) {
            return zzoc();
        }
        zzob();
        String obj = number.toString();
        if (this.zzazy || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            zzoe();
            this.out.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }
}
