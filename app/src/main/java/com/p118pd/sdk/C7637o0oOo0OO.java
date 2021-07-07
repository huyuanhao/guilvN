package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.pd.sdk.o0oOo0OO  reason: case insensitive filesystem */
public class C7637o0oOo0OO {
    public static final int OooO = 1;
    public static final String OooO00o = "GifHeaderParser";
    public static final int OooO0O0 = 255;
    public static final int OooO0OO = 44;
    public static final int OooO0Oo = 33;
    public static final int OooO0o = 249;
    public static final int OooO0o0 = 59;
    public static final int OooO0oO = 255;
    public static final int OooO0oo = 254;
    public static final int OooOO0 = 28;
    public static final int OooOO0O = 2;
    public static final int OooOO0o = 1;
    public static final int OooOOO = 64;
    public static final int OooOOO0 = 128;
    public static final int OooOOOO = 7;
    public static final int OooOOOo = 128;
    public static final int OooOOo = 2;
    public static final int OooOOo0 = 7;
    public static final int OooOOoo = 10;
    public static final int OooOo00 = 256;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f20511OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7635o0oOo0O f20512OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ByteBuffer f20513OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f20514OooO00o = new byte[256];

    private void OooO() {
        this.f20513OooO00o = null;
        Arrays.fill(this.f20514OooO00o, (byte) 0);
        this.f20512OooO00o = new C7635o0oOo0O();
        this.f20511OooO00o = 0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private void m19278OooO0O0() {
        this.f20512OooO00o.f20501OooO00o.OooO00o = OooO0O0();
        this.f20512OooO00o.f20501OooO00o.OooO0O0 = OooO0O0();
        this.f20512OooO00o.f20501OooO00o.OooO0OO = OooO0O0();
        this.f20512OooO00o.f20501OooO00o.OooO0Oo = OooO0O0();
        int OooO00o2 = OooO00o();
        boolean z = false;
        boolean z2 = (OooO00o2 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((OooO00o2 & 7) + 1));
        C7631o0oOo0 o0ooo0 = this.f20512OooO00o.f20501OooO00o;
        if ((OooO00o2 & 64) != 0) {
            z = true;
        }
        o0ooo0.f20496OooO00o = z;
        if (z2) {
            this.f20512OooO00o.f20501OooO00o.f20497OooO00o = m19277OooO00o(pow);
        } else {
            this.f20512OooO00o.f20501OooO00o.f20497OooO00o = null;
        }
        this.f20512OooO00o.f20501OooO00o.OooO0oo = this.f20513OooO00o.position();
        OooOO0O();
        if (!m19279OooO0O0()) {
            C7635o0oOo0O o0ooo0o = this.f20512OooO00o;
            o0ooo0o.OooO0O0++;
            o0ooo0o.f20502OooO00o.add(o0ooo0o.f20501OooO00o);
        }
    }

    private void OooO0OO() {
        int OooO00o2 = OooO00o();
        this.f20511OooO00o = OooO00o2;
        if (OooO00o2 > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f20511OooO00o) {
                try {
                    i2 = this.f20511OooO00o - i;
                    this.f20513OooO00o.get(this.f20514OooO00o, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    if (Log.isLoggable(OooO00o, 3)) {
                        String str = "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f20511OooO00o;
                    }
                    this.f20512OooO00o.OooO00o = 1;
                    return;
                }
            }
        }
    }

    private void OooO0Oo() {
        OooO00o(Integer.MAX_VALUE);
    }

    private void OooO0o() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) OooO00o());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f20512OooO00o.OooO00o = 1;
            return;
        }
        OooO0oO();
        if (this.f20512OooO00o.f20503OooO00o && !m19279OooO0O0()) {
            C7635o0oOo0O o0ooo0o = this.f20512OooO00o;
            o0ooo0o.f20504OooO00o = m19277OooO00o(o0ooo0o.OooO0o0);
            C7635o0oOo0O o0ooo0o2 = this.f20512OooO00o;
            o0ooo0o2.OooO0oo = o0ooo0o2.f20504OooO00o[o0ooo0o2.OooO0o];
        }
    }

    private void OooO0o0() {
        OooO00o();
        int OooO00o2 = OooO00o();
        C7631o0oOo0 o0ooo0 = this.f20512OooO00o.f20501OooO00o;
        int i = (OooO00o2 & 28) >> 2;
        o0ooo0.OooO0o0 = i;
        boolean z = true;
        if (i == 0) {
            o0ooo0.OooO0o0 = 1;
        }
        C7631o0oOo0 o0ooo02 = this.f20512OooO00o.f20501OooO00o;
        if ((OooO00o2 & 1) == 0) {
            z = false;
        }
        o0ooo02.f20498OooO0O0 = z;
        int OooO0O02 = OooO0O0();
        if (OooO0O02 < 2) {
            OooO0O02 = 10;
        }
        C7631o0oOo0 o0ooo03 = this.f20512OooO00o.f20501OooO00o;
        o0ooo03.OooO0oO = OooO0O02 * 10;
        o0ooo03.OooO0o = OooO00o();
        OooO00o();
    }

    private void OooO0oO() {
        this.f20512OooO00o.OooO0OO = OooO0O0();
        this.f20512OooO00o.OooO0Oo = OooO0O0();
        int OooO00o2 = OooO00o();
        this.f20512OooO00o.f20503OooO00o = (OooO00o2 & 128) != 0;
        this.f20512OooO00o.OooO0o0 = (int) Math.pow(2.0d, (double) ((OooO00o2 & 7) + 1));
        this.f20512OooO00o.OooO0o = OooO00o();
        this.f20512OooO00o.OooO0oO = OooO00o();
    }

    private void OooO0oo() {
        do {
            OooO0OO();
            byte[] bArr = this.f20514OooO00o;
            if (bArr[0] == 1) {
                this.f20512OooO00o.OooO = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f20511OooO00o <= 0) {
                return;
            }
        } while (!m19279OooO0O0());
    }

    private void OooOO0() {
        int OooO00o2;
        do {
            OooO00o2 = OooO00o();
            this.f20513OooO00o.position(Math.min(this.f20513OooO00o.position() + OooO00o2, this.f20513OooO00o.limit()));
        } while (OooO00o2 > 0);
    }

    private void OooOO0O() {
        OooO00o();
        OooOO0();
    }

    public C7637o0oOo0OO OooO00o(@NonNull ByteBuffer byteBuffer) {
        OooO();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f20513OooO00o = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f20513OooO00o.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public C7637o0oOo0OO OooO00o(@Nullable byte[] bArr) {
        if (bArr != null) {
            OooO00o(ByteBuffer.wrap(bArr));
        } else {
            this.f20513OooO00o = null;
            this.f20512OooO00o.OooO00o = 2;
        }
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19281OooO00o() {
        this.f20513OooO00o = null;
        this.f20512OooO00o = null;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7635o0oOo0O m19280OooO00o() {
        if (this.f20513OooO00o == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m19279OooO0O0()) {
            return this.f20512OooO00o;
        } else {
            OooO0o();
            if (!m19279OooO0O0()) {
                OooO0Oo();
                C7635o0oOo0O o0ooo0o = this.f20512OooO00o;
                if (o0ooo0o.OooO0O0 < 0) {
                    o0ooo0o.OooO00o = 1;
                }
            }
            return this.f20512OooO00o;
        }
    }

    private int OooO0O0() {
        return this.f20513OooO00o.getShort();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private boolean m19279OooO0O0() {
        return this.f20512OooO00o.OooO00o != 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19282OooO00o() {
        OooO0o();
        if (!m19279OooO0O0()) {
            OooO00o(2);
        }
        return this.f20512OooO00o.OooO0O0 > 1;
    }

    private void OooO00o(int i) {
        boolean z = false;
        while (!z && !m19279OooO0O0() && this.f20512OooO00o.OooO0O0 <= i) {
            int OooO00o2 = OooO00o();
            if (OooO00o2 == 33) {
                int OooO00o3 = OooO00o();
                if (OooO00o3 == 1) {
                    OooOO0();
                } else if (OooO00o3 == 249) {
                    this.f20512OooO00o.f20501OooO00o = new C7631o0oOo0();
                    OooO0o0();
                } else if (OooO00o3 == 254) {
                    OooOO0();
                } else if (OooO00o3 != 255) {
                    OooOO0();
                } else {
                    OooO0OO();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f20514OooO00o[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        OooO0oo();
                    } else {
                        OooOO0();
                    }
                }
            } else if (OooO00o2 == 44) {
                C7635o0oOo0O o0ooo0o = this.f20512OooO00o;
                if (o0ooo0o.f20501OooO00o == null) {
                    o0ooo0o.f20501OooO00o = new C7631o0oOo0();
                }
                m19278OooO0O0();
            } else if (OooO00o2 != 59) {
                this.f20512OooO00o.OooO00o = 1;
            } else {
                z = true;
            }
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    private int[] m19277OooO00o(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f20513OooO00o.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable(OooO00o, 3);
            this.f20512OooO00o.OooO00o = 1;
        }
        return iArr;
    }

    private int OooO00o() {
        try {
            return this.f20513OooO00o.get() & 255;
        } catch (Exception unused) {
            this.f20512OooO00o.OooO00o = 1;
            return 0;
        }
    }
}
