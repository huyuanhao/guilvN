package com.p118pd.sdk;

import androidx.annotation.RestrictTo;
import java.io.Writer;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00OO00o  reason: case insensitive filesystem */
public class C7083o00OO00o extends Writer {
    public StringBuilder OooO00o = new StringBuilder(128);
    public final String o0ooOOo;

    public C7083o00OO00o(String str) {
        this.o0ooOOo = str;
    }

    private void OooO00o() {
        if (this.OooO00o.length() > 0) {
            this.OooO00o.toString();
            StringBuilder sb = this.OooO00o;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        OooO00o();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        OooO00o();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                OooO00o();
            } else {
                this.OooO00o.append(c);
            }
        }
    }
}
