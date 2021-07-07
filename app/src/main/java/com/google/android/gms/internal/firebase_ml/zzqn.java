package com.google.android.gms.internal.firebase_ml;

import com.google.gson.Gson;
import com.p118pd.sdk.C8318oOo0oooo;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public final class zzqn implements Closeable {
    public static final char[] zzazx = Gson.JSON_NON_EXECUTABLE_PREFIX.toCharArray();

    /* renamed from: in */
    public final Reader f999in;
    public int limit = 0;
    public int pos = 0;
    public boolean zzazy = false;
    public final char[] zzazz = new char[1024];
    public int zzbaa = 0;
    public int zzbab = 0;
    public int zzbac = 0;
    public long zzbad;
    public int zzbae;
    public String zzbaf;
    public int[] zzbag;
    public int zzbah;
    public String[] zzbai;
    public int[] zzbaj;

    static {
        zzqm.zzazw = new zzqo();
    }

    public zzqn(Reader reader) {
        int[] iArr = new int[32];
        this.zzbag = iArr;
        this.zzbah = 0;
        this.zzbah = 0 + 1;
        iArr[0] = 6;
        this.zzbai = new String[32];
        this.zzbaj = new int[32];
        if (reader != null) {
            this.f999in = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private final int zzaf(boolean z) throws IOException {
        char[] cArr = this.zzazz;
        int i = this.pos;
        int i2 = this.limit;
        while (true) {
            boolean z2 = true;
            if (i == i2) {
                this.pos = i;
                if (zzbt(1)) {
                    i = this.pos;
                    i2 = this.limit;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + zznv());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.zzbaa++;
                this.zzbab = i3;
            } else if (!(c == ' ' || c == '\r' || c == '\t')) {
                if (c == '/') {
                    this.pos = i3;
                    if (i3 == i2) {
                        this.pos = i3 - 1;
                        boolean zzbt = zzbt(2);
                        this.pos++;
                        if (!zzbt) {
                            return c;
                        }
                    }
                    zznt();
                    int i4 = this.pos;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.pos = i4 + 1;
                        while (true) {
                            if (this.pos + 2 > this.limit && !zzbt(2)) {
                                z2 = false;
                                break;
                            }
                            char[] cArr2 = this.zzazz;
                            int i5 = this.pos;
                            if (cArr2[i5] != '\n') {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (this.zzazz[this.pos + i6] == "*/".charAt(i6)) {
                                    }
                                }
                                break;
                            }
                            this.zzbaa++;
                            this.zzbab = i5 + 1;
                            this.pos++;
                        }
                        if (z2) {
                            i = this.pos + 2;
                            i2 = this.limit;
                        } else {
                            throw zzci("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.pos = i4 + 1;
                        zznu();
                        i = this.pos;
                        i2 = this.limit;
                    }
                } else if (c == '#') {
                    this.pos = i3;
                    zznt();
                    zznu();
                    i = this.pos;
                    i2 = this.limit;
                } else {
                    this.pos = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private final void zzbs(int i) {
        int i2 = this.zzbah;
        int[] iArr = this.zzbag;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 << 1)];
            int[] iArr3 = new int[(i2 << 1)];
            String[] strArr = new String[(i2 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.zzbaj, 0, iArr3, 0, this.zzbah);
            System.arraycopy(this.zzbai, 0, strArr, 0, this.zzbah);
            this.zzbag = iArr2;
            this.zzbaj = iArr3;
            this.zzbai = strArr;
        }
        int[] iArr4 = this.zzbag;
        int i3 = this.zzbah;
        this.zzbah = i3 + 1;
        iArr4[i3] = i;
    }

    private final boolean zzbt(int i) throws IOException {
        int i2;
        char[] cArr = this.zzazz;
        int i3 = this.zzbab;
        int i4 = this.pos;
        this.zzbab = i3 - i4;
        int i5 = this.limit;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.limit = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.f999in;
            int i7 = this.limit;
            int read = reader.read(cArr, i7, cArr.length - i7);
            if (read == -1) {
                return false;
            }
            int i8 = this.limit + read;
            this.limit = i8;
            if (this.zzbaa == 0 && (i2 = this.zzbab) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.zzbab = i2 + 1;
                i++;
            }
        } while (this.limit < i);
        return true;
    }

    private final IOException zzci(String str) throws IOException {
        throw new zzqr(str + zznv());
    }

    private final boolean zze(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        zznt();
        return false;
    }

    private final String zzf(char c) throws IOException {
        char[] cArr = this.zzazz;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = this.pos;
            int i2 = this.limit;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.pos = i4;
                        sb.append(cArr, i, (i4 - i) - 1);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.pos = i4;
                        sb.append(cArr, i, (i4 - i) - 1);
                        sb.append(zznw());
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.zzbaa++;
                            this.zzbab = i4;
                        }
                        i3 = i4;
                    }
                } else {
                    sb.append(cArr, i, i3 - i);
                    this.pos = i3;
                    if (!zzbt(1)) {
                        throw zzci("Unterminated string");
                    }
                }
            }
        }
    }

    private final void zzg(char c) throws IOException {
        char[] cArr = this.zzazz;
        while (true) {
            int i = this.pos;
            int i2 = this.limit;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.pos = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.pos = i3;
                        zznw();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.zzbaa++;
                            this.zzbab = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.pos = i;
                    if (!zzbt(1)) {
                        throw zzci("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01fd, code lost:
        if (zze(r5) == false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0200, code lost:
        if (r4 != 2) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0202, code lost:
        if (r11 == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0208, code lost:
        if (r12 != Long.MIN_VALUE) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x020a, code lost:
        if (r16 == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x020c, code lost:
        if (r16 == false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x020f, code lost:
        r12 = -r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0210, code lost:
        r19.zzbad = r12;
        r19.pos += r9;
        r5 = 15;
        r19.zzbac = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x021c, code lost:
        if (r4 == 2) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x021f, code lost:
        if (r4 == 4) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0222, code lost:
        if (r4 != 7) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0227, code lost:
        r19.zzbae = r9;
        r5 = 16;
        r19.zzbac = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0173 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zznr() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 781
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqn.zznr():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        zznt();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String zzns() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqn.zzns():java.lang.String");
    }

    private final void zznt() throws IOException {
        if (!this.zzazy) {
            throw zzci("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private final void zznu() throws IOException {
        char c;
        do {
            if (this.pos < this.limit || zzbt(1)) {
                char[] cArr = this.zzazz;
                int i = this.pos;
                int i2 = i + 1;
                this.pos = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.zzbaa++;
                    this.zzbab = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    private final String zznv() {
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(this.zzbaa + 1);
        sb.append(" column ");
        sb.append((this.pos - this.zzbab) + 1);
        sb.append(" path ");
        StringBuilder sb2 = new StringBuilder("$");
        int i = this.zzbah;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.zzbag[i2];
            if (i3 == 1 || i3 == 2) {
                sb2.append('[');
                sb2.append(this.zzbaj[i2]);
                sb2.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb2.append('.');
                String[] strArr = this.zzbai;
                if (strArr[i2] != null) {
                    sb2.append(strArr[i2]);
                }
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    private final char zznw() throws IOException {
        int i;
        int i2;
        if (this.pos != this.limit || zzbt(1)) {
            char[] cArr = this.zzazz;
            int i3 = this.pos;
            int i4 = i3 + 1;
            this.pos = i4;
            char c = cArr[i3];
            if (c == '\n') {
                this.zzbaa++;
                this.zzbab = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return '\b';
                }
                if (c == 'f') {
                    return '\f';
                }
                if (c == 'n') {
                    return '\n';
                }
                if (c == 'r') {
                    return '\r';
                }
                if (c == 't') {
                    return '\t';
                }
                if (c != 'u') {
                    throw zzci("Invalid escape sequence");
                } else if (i4 + 4 <= this.limit || zzbt(4)) {
                    char c2 = 0;
                    int i5 = this.pos;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c3 = this.zzazz[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.zzazz, this.pos, 4));
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i5++;
                    }
                    this.pos += 4;
                    return c2;
                } else {
                    throw zzci("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw zzci("Unterminated escape sequence");
    }

    public final void beginArray() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 3) {
            zzbs(1);
            this.zzbaj[this.zzbah - 1] = 0;
            this.zzbac = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + zznq() + zznv());
    }

    public final void beginObject() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 1) {
            zzbs(3);
            this.zzbac = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + zznq() + zznv());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzbac = 0;
        this.zzbag[0] = 8;
        this.zzbah = 1;
        this.f999in.close();
    }

    public final void endArray() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 4) {
            int i2 = this.zzbah - 1;
            this.zzbah = i2;
            int[] iArr = this.zzbaj;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.zzbac = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + zznq() + zznv());
    }

    public final void endObject() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 2) {
            int i2 = this.zzbah - 1;
            this.zzbah = i2;
            this.zzbai[i2] = null;
            int[] iArr = this.zzbaj;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.zzbac = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + zznq() + zznv());
    }

    public final boolean nextBoolean() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 5) {
            this.zzbac = 0;
            int[] iArr = this.zzbaj;
            int i2 = this.zzbah - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.zzbac = 0;
            int[] iArr2 = this.zzbaj;
            int i3 = this.zzbah - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + zznq() + zznv());
        }
    }

    public final String nextName() throws IOException {
        String str;
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 14) {
            str = zzns();
        } else if (i == 12) {
            str = zzf('\'');
        } else if (i == 13) {
            str = zzf(C8318oOo0oooo.OooO00o);
        } else {
            throw new IllegalStateException("Expected a name but was " + zznq() + zznv());
        }
        this.zzbac = 0;
        this.zzbai[this.zzbah - 1] = str;
        return str;
    }

    public final void nextNull() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        if (i == 7) {
            this.zzbac = 0;
            int[] iArr = this.zzbaj;
            int i2 = this.zzbah - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + zznq() + zznv());
    }

    public final String nextString() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        String str = null;
        if (i == 10) {
            str = zzns();
        } else if (i == 8) {
            str = zzf('\'');
        } else if (i == 9) {
            str = zzf(C8318oOo0oooo.OooO00o);
        } else if (i == 11) {
            this.zzbaf = null;
        } else if (i == 15) {
            str = Long.toString(this.zzbad);
        } else if (i == 16) {
            str = new String(this.zzazz, this.pos, this.zzbae);
            this.pos += this.zzbae;
        } else {
            throw new IllegalStateException("Expected a string but was " + zznq() + zznv());
        }
        this.zzbac = 0;
        int[] iArr = this.zzbaj;
        int i2 = this.zzbah - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final void setLenient(boolean z) {
        this.zzazy = true;
    }

    public final void skipValue() throws IOException {
        int i;
        int i2 = 0;
        do {
            int i3 = this.zzbac;
            if (i3 == 0) {
                i3 = zznr();
            }
            if (i3 == 3) {
                zzbs(1);
            } else if (i3 == 1) {
                zzbs(3);
            } else {
                if (i3 == 4) {
                    this.zzbah--;
                } else if (i3 == 2) {
                    this.zzbah--;
                } else if (i3 == 14 || i3 == 10) {
                    while (true) {
                        i = 0;
                        while (true) {
                            int i4 = this.pos;
                            if (i4 + i < this.limit) {
                                char c = this.zzazz[i4 + i];
                                if (!(c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ')) {
                                    if (c != '#') {
                                        if (c != ',') {
                                            if (!(c == '/' || c == '=')) {
                                                if (!(c == '{' || c == '}' || c == ':')) {
                                                    if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.pos = i4 + i;
                                if (!zzbt(1)) {
                                }
                            }
                        }
                    }
                    zznt();
                    this.pos += i;
                    this.zzbac = 0;
                } else if (i3 == 8 || i3 == 12) {
                    zzg('\'');
                    this.zzbac = 0;
                } else if (i3 == 9 || i3 == 13) {
                    zzg(C8318oOo0oooo.OooO00o);
                    this.zzbac = 0;
                } else {
                    if (i3 == 16) {
                        this.pos += this.zzbae;
                    }
                    this.zzbac = 0;
                }
                i2--;
                this.zzbac = 0;
            }
            i2++;
            this.zzbac = 0;
        } while (i2 != 0);
        int[] iArr = this.zzbaj;
        int i5 = this.zzbah;
        int i6 = i5 - 1;
        iArr[i6] = iArr[i6] + 1;
        this.zzbai[i5 - 1] = "null";
    }

    public final String toString() {
        return zzqn.class.getSimpleName() + zznv();
    }

    public final zzqp zznq() throws IOException {
        int i = this.zzbac;
        if (i == 0) {
            i = zznr();
        }
        switch (i) {
            case 1:
                return zzqp.BEGIN_OBJECT;
            case 2:
                return zzqp.END_OBJECT;
            case 3:
                return zzqp.BEGIN_ARRAY;
            case 4:
                return zzqp.END_ARRAY;
            case 5:
            case 6:
                return zzqp.BOOLEAN;
            case 7:
                return zzqp.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return zzqp.STRING;
            case 12:
            case 13:
            case 14:
                return zzqp.NAME;
            case 15:
            case 16:
                return zzqp.NUMBER;
            case 17:
                return zzqp.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
