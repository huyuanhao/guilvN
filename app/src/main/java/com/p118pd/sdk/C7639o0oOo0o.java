package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.pd.sdk.o0oOo0o  reason: case insensitive filesystem */
public class C7639o0oOo0o implements GifDecoder {
    public static final String OooO00o = "o0oOo0o";
    public static final int OooOO0O = 4096;
    public static final int OooOO0o = -1;
    public static final int OooOOO = 4;
    public static final int OooOOO0 = -1;
    public static final int OooOOOO = 255;
    @ColorInt
    public static final int OooOOOo = 0;
    public int OooO;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap.Config f20515OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f20516OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final GifDecoder.OooO00o f20517OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7635o0oOo0O f20518OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7637o0oOo0OO f20519OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public Boolean f20520OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ByteBuffer f20521OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20522OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f20523OooO00o;
    @ColorInt

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f20524OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[] f20525OooO00o;
    public byte[] OooO0O0;
    @ColorInt

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int[] f20526OooO0O0;
    public byte[] OooO0OO;
    @ColorInt

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int[] f20527OooO0OO;
    public byte[] OooO0Oo;
    public int OooO0o;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;

    public C7639o0oOo0o(@NonNull GifDecoder.OooO00o oooO00o, C7635o0oOo0O o0ooo0o, ByteBuffer byteBuffer) {
        this(oooO00o, o0ooo0o, byteBuffer, 1);
    }

    private int OooO() {
        int OooOO02 = OooOO0();
        if (OooOO02 <= 0) {
            return OooOO02;
        }
        ByteBuffer byteBuffer = this.f20521OooO00o;
        byteBuffer.get(this.f20523OooO00o, 0, Math.min(OooOO02, byteBuffer.remaining()));
        return OooOO02;
    }

    private int OooOO0() {
        return this.f20521OooO00o.get() & 255;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ByteBuffer m19285OooO00o() {
        return this.f20521OooO00o;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19288OooO0O0() {
        this.OooO0o = (this.OooO0o + 1) % this.f20518OooO00o.OooO0O0;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int OooO0OO() {
        return this.OooO0o;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int OooO0Oo() {
        return this.f20521OooO00o.limit() + this.OooO0Oo.length + (this.f20527OooO0OO.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int OooO0o() {
        return this.f20518OooO00o.OooO0O0;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int OooO0o0() {
        return this.OooO0oO;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int OooO0oO() {
        return this.f20518OooO00o.OooO;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int OooO0oo() {
        int i = this.f20518OooO00o.OooO;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
        this.f20518OooO00o = null;
        byte[] bArr = this.OooO0Oo;
        if (bArr != null) {
            this.f20517OooO00o.OooO00o(bArr);
        }
        int[] iArr = this.f20527OooO0OO;
        if (iArr != null) {
            this.f20517OooO00o.OooO00o(iArr);
        }
        Bitmap bitmap = this.f20516OooO00o;
        if (bitmap != null) {
            this.f20517OooO00o.OooO00o(bitmap);
        }
        this.f20516OooO00o = null;
        this.f20521OooO00o = null;
        this.f20520OooO00o = null;
        byte[] bArr2 = this.f20523OooO00o;
        if (bArr2 != null) {
            this.f20517OooO00o.OooO00o(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getHeight() {
        return this.f20518OooO00o.OooO0Oo;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getWidth() {
        return this.f20518OooO00o.OooO0OO;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized int read(@Nullable byte[] bArr) {
        C7635o0oOo0O OooO00o2 = OooO00o().OooO00o(bArr).m19280OooO00o();
        this.f20518OooO00o = OooO00o2;
        if (bArr != null) {
            OooO00o(OooO00o2, bArr);
        }
        return this.OooO0oO;
    }

    public C7639o0oOo0o(@NonNull GifDecoder.OooO00o oooO00o, C7635o0oOo0O o0ooo0o, ByteBuffer byteBuffer, int i) {
        this(oooO00o);
        OooO00o(o0ooo0o, byteBuffer, i);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x00f7 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v13, resolved type: short */
    /* JADX WARN: Multi-variable type inference failed */
    private void OooO0OO(C7631o0oOo0 o0ooo0) {
        int i;
        int i2;
        short s;
        C7639o0oOo0o o0ooo0o = this;
        if (o0ooo0 != null) {
            o0ooo0o.f20521OooO00o.position(o0ooo0.OooO0oo);
        }
        if (o0ooo0 == null) {
            C7635o0oOo0O o0ooo0o2 = o0ooo0o.f20518OooO00o;
            i = o0ooo0o2.OooO0OO;
            i2 = o0ooo0o2.OooO0Oo;
        } else {
            i = o0ooo0.OooO0OO;
            i2 = o0ooo0.OooO0Oo;
        }
        int i3 = i * i2;
        byte[] bArr = o0ooo0o.OooO0Oo;
        if (bArr == null || bArr.length < i3) {
            o0ooo0o.OooO0Oo = o0ooo0o.f20517OooO00o.OooO00o(i3);
        }
        byte[] bArr2 = o0ooo0o.OooO0Oo;
        if (o0ooo0o.f20525OooO00o == null) {
            o0ooo0o.f20525OooO00o = new short[4096];
        }
        short[] sArr = o0ooo0o.f20525OooO00o;
        if (o0ooo0o.OooO0O0 == null) {
            o0ooo0o.OooO0O0 = new byte[4096];
        }
        byte[] bArr3 = o0ooo0o.OooO0O0;
        if (o0ooo0o.OooO0OO == null) {
            o0ooo0o.OooO0OO = new byte[4097];
        }
        byte[] bArr4 = o0ooo0o.OooO0OO;
        int OooOO02 = OooOO0();
        int i4 = 1 << OooOO02;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = OooOO02 + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = o0ooo0o.f20523OooO00o;
        int i11 = i7;
        int i12 = i6;
        int i13 = i8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            if (i9 >= i3) {
                break;
            }
            if (i14 == 0) {
                i14 = OooO();
                if (i14 <= 0) {
                    o0ooo0o.OooO0oO = 3;
                    break;
                }
                i15 = 0;
            }
            i17 += (bArr5[i15] & 255) << i16;
            i15++;
            i14--;
            int i22 = i16 + 8;
            int i23 = i12;
            int i24 = i11;
            int i25 = i19;
            int i26 = i20;
            while (true) {
                if (i22 < i24) {
                    i19 = i25;
                    i12 = i23;
                    i16 = i22;
                    o0ooo0o = this;
                    i20 = i26;
                    i7 = i7;
                    i11 = i24;
                    break;
                }
                int i27 = i17 & i13;
                i17 >>= i24;
                i22 -= i24;
                if (i27 == i4) {
                    i13 = i8;
                    i24 = i7;
                    i23 = i6;
                    i6 = i23;
                    i25 = -1;
                } else if (i27 == i5) {
                    i16 = i22;
                    i20 = i26;
                    i12 = i23;
                    i7 = i7;
                    i6 = i6;
                    i19 = i25;
                    i11 = i24;
                    o0ooo0o = this;
                    break;
                } else if (i25 == -1) {
                    bArr2[i18] = bArr3[i27];
                    i18++;
                    i9++;
                    i25 = i27;
                    i26 = i25;
                    i6 = i6;
                    i22 = i22;
                } else {
                    if (i27 >= i23) {
                        bArr4[i21] = (byte) i26;
                        i21++;
                        s = i25;
                    } else {
                        s = i27;
                    }
                    while (s >= i4) {
                        bArr4[i21] = bArr3[s];
                        i21++;
                        s = sArr[s];
                    }
                    i26 = bArr3[s] & 255;
                    byte b = (byte) i26;
                    bArr2[i18] = b;
                    while (true) {
                        i18++;
                        i9++;
                        if (i21 <= 0) {
                            break;
                        }
                        i21--;
                        bArr2[i18] = bArr4[i21];
                    }
                    if (i23 < 4096) {
                        sArr[i23] = (short) i25;
                        bArr3[i23] = b;
                        i23++;
                        if ((i23 & i13) == 0 && i23 < 4096) {
                            i24++;
                            i13 += i23;
                        }
                    }
                    i25 = i27;
                    i6 = i6;
                    i22 = i22;
                    bArr4 = bArr4;
                }
            }
        }
        Arrays.fill(bArr2, i18, i3, (byte) 0);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int OooO00o(int i) {
        if (i >= 0) {
            C7635o0oOo0O o0ooo0o = this.f20518OooO00o;
            if (i < o0ooo0o.OooO0O0) {
                return o0ooo0o.f20502OooO00o.get(i).OooO0oO;
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder
    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m19287OooO0O0() {
        int i = this.f20518OooO00o.OooO;
        if (i == -1) {
            return 1;
        }
        return i;
    }

    private void OooO0O0(C7631o0oOo0 o0ooo0) {
        C7631o0oOo0 o0ooo02 = o0ooo0;
        int[] iArr = this.f20527OooO0OO;
        int i = o0ooo02.OooO0Oo;
        int i2 = o0ooo02.OooO0O0;
        int i3 = o0ooo02.OooO0OO;
        int i4 = o0ooo02.OooO00o;
        boolean z = this.OooO0o == 0;
        int i5 = this.OooOO0;
        byte[] bArr = this.OooO0Oo;
        int[] iArr2 = this.f20524OooO00o;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = o0ooo02.OooO0OO * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = b2 & 255;
                if (i13 != b) {
                    int i14 = iArr2[i13];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i;
            }
            i6++;
            o0ooo02 = o0ooo0;
        }
        this.f20520OooO00o = Boolean.valueOf(this.f20520OooO00o == null && z && b != -1);
    }

    public C7639o0oOo0o(@NonNull GifDecoder.OooO00o oooO00o) {
        this.f20526OooO0O0 = new int[256];
        this.f20515OooO00o = Bitmap.Config.ARGB_8888;
        this.f20517OooO00o = oooO00o;
        this.f20518OooO00o = new C7635o0oOo0O();
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19283OooO00o() {
        int i;
        if (this.f20518OooO00o.OooO0O0 <= 0 || (i = this.OooO0o) < 0) {
            return 0;
        }
        return OooO00o(i);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19286OooO00o() {
        this.OooO0o = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized Bitmap m19284OooO00o() {
        if (this.f20518OooO00o.OooO0O0 <= 0 || this.OooO0o < 0) {
            if (Log.isLoggable(OooO00o, 3)) {
                String str = "Unable to decode frame, frameCount=" + this.f20518OooO00o.OooO0O0 + ", framePointer=" + this.OooO0o;
            }
            this.OooO0oO = 1;
        }
        if (this.OooO0oO != 1) {
            if (this.OooO0oO != 2) {
                this.OooO0oO = 0;
                if (this.f20523OooO00o == null) {
                    this.f20523OooO00o = this.f20517OooO00o.OooO00o(255);
                }
                C7631o0oOo0 o0ooo0 = this.f20518OooO00o.f20502OooO00o.get(this.OooO0o);
                int i = this.OooO0o - 1;
                C7631o0oOo0 o0ooo02 = i >= 0 ? this.f20518OooO00o.f20502OooO00o.get(i) : null;
                int[] iArr = o0ooo0.f20497OooO00o != null ? o0ooo0.f20497OooO00o : this.f20518OooO00o.f20504OooO00o;
                this.f20524OooO00o = iArr;
                if (iArr == null) {
                    if (Log.isLoggable(OooO00o, 3)) {
                        String str2 = "No valid color table found for frame #" + this.OooO0o;
                    }
                    this.OooO0oO = 1;
                    return null;
                }
                if (o0ooo0.f20498OooO0O0) {
                    System.arraycopy(iArr, 0, this.f20526OooO0O0, 0, iArr.length);
                    int[] iArr2 = this.f20526OooO0O0;
                    this.f20524OooO00o = iArr2;
                    iArr2[o0ooo0.OooO0o] = 0;
                }
                return OooO00o(o0ooo0, o0ooo02);
            }
        }
        if (Log.isLoggable(OooO00o, 3)) {
            String str3 = "Unable to decode frame, status=" + this.OooO0oO;
        }
        return null;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder
    private Bitmap OooO0O0() {
        Boolean bool = this.f20520OooO00o;
        Bitmap OooO00o2 = this.f20517OooO00o.OooO00o(this.OooOO0, this.OooO, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f20515OooO00o);
        OooO00o2.setHasAlpha(true);
        return OooO00o2;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int OooO00o(@Nullable InputStream inputStream, int i) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i > 0 ? i + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
            }
        } else {
            this.OooO0oO = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        return this.OooO0oO;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void OooO00o(@NonNull C7635o0oOo0O o0ooo0o, @NonNull byte[] bArr) {
        OooO00o(o0ooo0o, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void OooO00o(@NonNull C7635o0oOo0O o0ooo0o, @NonNull ByteBuffer byteBuffer) {
        OooO00o(o0ooo0o, byteBuffer, 1);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void OooO00o(@NonNull C7635o0oOo0O o0ooo0o, @NonNull ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.OooO0oO = 0;
            this.f20518OooO00o = o0ooo0o;
            this.OooO0o = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f20521OooO00o = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f20521OooO00o.order(ByteOrder.LITTLE_ENDIAN);
            this.f20522OooO00o = false;
            Iterator<C7631o0oOo0> it = o0ooo0o.f20502OooO00o.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().OooO0o0 == 3) {
                        this.f20522OooO00o = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.OooO0oo = highestOneBit;
            this.OooOO0 = o0ooo0o.OooO0OO / highestOneBit;
            this.OooO = o0ooo0o.OooO0Oo / highestOneBit;
            this.OooO0Oo = this.f20517OooO00o.OooO00o(o0ooo0o.OooO0OO * o0ooo0o.OooO0Oo);
            this.f20527OooO0OO = this.f20517OooO00o.m14990OooO00o(this.OooOO0 * this.OooO);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.gifdecoder.GifDecoder
    @NonNull
    private C7637o0oOo0OO OooO00o() {
        if (this.f20519OooO00o == null) {
            this.f20519OooO00o = new C7637o0oOo0OO();
        }
        return this.f20519OooO00o;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void OooO00o(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f20515OooO00o = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    private Bitmap OooO00o(C7631o0oOo0 o0ooo0, C7631o0oOo0 o0ooo02) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f20527OooO0OO;
        int i3 = 0;
        if (o0ooo02 == null) {
            Bitmap bitmap2 = this.f20516OooO00o;
            if (bitmap2 != null) {
                this.f20517OooO00o.OooO00o(bitmap2);
            }
            this.f20516OooO00o = null;
            Arrays.fill(iArr, 0);
        }
        if (o0ooo02 != null && o0ooo02.OooO0o0 == 3 && this.f20516OooO00o == null) {
            Arrays.fill(iArr, 0);
        }
        if (o0ooo02 != null && (i2 = o0ooo02.OooO0o0) > 0) {
            if (i2 == 2) {
                if (!o0ooo0.f20498OooO0O0) {
                    C7635o0oOo0O o0ooo0o = this.f20518OooO00o;
                    int i4 = o0ooo0o.OooO0oo;
                    if (o0ooo0.f20497OooO00o == null || o0ooo0o.OooO0o != o0ooo0.OooO0o) {
                        i3 = i4;
                    }
                } else if (this.OooO0o == 0) {
                    this.f20520OooO00o = true;
                }
                int i5 = o0ooo02.OooO0Oo;
                int i6 = this.OooO0oo;
                int i7 = i5 / i6;
                int i8 = o0ooo02.OooO0O0 / i6;
                int i9 = o0ooo02.OooO0OO / i6;
                int i10 = o0ooo02.OooO00o / i6;
                int i11 = this.OooOO0;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.OooOO0;
                }
            } else if (i2 == 3 && (bitmap = this.f20516OooO00o) != null) {
                int i16 = this.OooOO0;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.OooO);
            }
        }
        OooO0OO(o0ooo0);
        if (o0ooo0.f20496OooO00o || this.OooO0oo != 1) {
            OooO00o(o0ooo0);
        } else {
            OooO0O0(o0ooo0);
        }
        if (this.f20522OooO00o && ((i = o0ooo0.OooO0o0) == 0 || i == 1)) {
            if (this.f20516OooO00o == null) {
                this.f20516OooO00o = OooO0O0();
            }
            Bitmap bitmap3 = this.f20516OooO00o;
            int i17 = this.OooOO0;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.OooO);
        }
        Bitmap OooO0O02 = OooO0O0();
        int i18 = this.OooOO0;
        OooO0O02.setPixels(iArr, 0, i18, 0, 0, i18, this.OooO);
        return OooO0O02;
    }

    private void OooO00o(C7631o0oOo0 o0ooo0) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f20527OooO0OO;
        int i6 = o0ooo0.OooO0Oo;
        int i7 = this.OooO0oo;
        int i8 = i6 / i7;
        int i9 = o0ooo0.OooO0O0 / i7;
        int i10 = o0ooo0.OooO0OO / i7;
        int i11 = o0ooo0.OooO00o / i7;
        boolean z2 = this.OooO0o == 0;
        int i12 = this.OooO0oo;
        int i13 = this.OooOO0;
        int i14 = this.OooO;
        byte[] bArr = this.OooO0Oo;
        int[] iArr2 = this.f20524OooO00o;
        Boolean bool = this.f20520OooO00o;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (o0ooo0.f20496OooO00o) {
                if (i17 >= i8) {
                    i = i8;
                    int i19 = i18 + 1;
                    if (i19 == 2) {
                        i18 = i19;
                        i17 = 4;
                    } else if (i19 == 3) {
                        i18 = i19;
                        i17 = 2;
                        i15 = 4;
                    } else if (i19 != 4) {
                        i18 = i19;
                    } else {
                        i18 = i19;
                        i17 = 1;
                        i15 = 2;
                    }
                } else {
                    i = i8;
                }
                i2 = i17 + i15;
            } else {
                i = i8;
                i2 = i17;
                i17 = i16;
            }
            int i20 = i17 + i9;
            boolean z3 = i12 == 1;
            if (i20 < i14) {
                int i21 = i20 * i13;
                int i22 = i21 + i11;
                int i23 = i22 + i10;
                int i24 = i21 + i13;
                if (i24 < i23) {
                    i23 = i24;
                }
                i3 = i2;
                int i25 = i16 * i12 * o0ooo0.OooO0OO;
                if (z3) {
                    int i26 = i22;
                    while (i26 < i23) {
                        int i27 = iArr2[bArr[i25] & 255];
                        if (i27 != 0) {
                            iArr[i26] = i27;
                        } else if (z2 && bool2 == null) {
                            bool2 = true;
                        }
                        i25 += i12;
                        i26++;
                        i9 = i9;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i23 - i22) * i12) + i25;
                    int i29 = i22;
                    while (true) {
                        i4 = i10;
                        if (i29 >= i23) {
                            break;
                        }
                        int OooO00o2 = OooO00o(i25, i28, o0ooo0.OooO0OO);
                        if (OooO00o2 != 0) {
                            iArr[i29] = OooO00o2;
                        } else if (z2 && bool2 == null) {
                            bool2 = true;
                        }
                        i25 += i12;
                        i29++;
                        i10 = i4;
                    }
                    bool = bool2;
                    i16++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i17 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i16++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i17 = i3;
        }
        if (this.f20520OooO00o == null) {
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            this.f20520OooO00o = Boolean.valueOf(z);
        }
    }

    @ColorInt
    private int OooO00o(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.OooO0oo + i; i9++) {
            byte[] bArr = this.OooO0Oo;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f20524OooO00o[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.OooO0oo + i11; i12++) {
            byte[] bArr2 = this.OooO0Oo;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f20524OooO00o[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }
}
