package com.p118pd.sdk;

import android.os.AsyncTask;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;

/* renamed from: com.pd.sdk.IlI丨ii1I  reason: invalid class name */
public class IlIii1I extends AsyncTask<Void, Void, Result> {
    public float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f15823OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final MultiFormatReader f15824OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9587iIL f15825OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15826OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15827OooO00o;
    public float OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f15828OooO0O0;
    public float OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f15829OooO0OO;
    public float OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public int f15830OooO0Oo;
    public float OooO0o0;

    public IlIii1I(AbstractC9587iIL r1, MultiFormatReader multiFormatReader, byte[] bArr, int i, int i2, boolean z, float f, float f2, float f3, float f4, int i3, int i4, float f5) {
        this.f15827OooO00o = bArr;
        this.f15823OooO00o = i;
        this.f15828OooO0O0 = i2;
        this.f15825OooO00o = r1;
        this.f15824OooO00o = multiFormatReader;
        this.f15826OooO00o = z;
        this.OooO00o = f;
        this.OooO0O0 = f2;
        this.OooO0OO = f3;
        this.OooO0Oo = f4;
        this.f15829OooO0OO = i3;
        this.f15830OooO0Oo = i4;
        this.OooO0o0 = f5;
    }

    /* renamed from: OooO00o */
    public Result doInBackground(Void... voidArr) {
        Result decodeWithState;
        if (isCancelled() || this.f15825OooO00o == null) {
            return null;
        }
        int i = (int) (((float) this.f15830OooO0Oo) / this.OooO0o0);
        int i2 = this.f15829OooO0OO;
        float f = (float) i;
        float f2 = this.OooO00o;
        int i3 = this.f15823OooO00o;
        int i4 = (int) (f2 * ((float) i3));
        int i5 = this.f15828OooO0O0;
        int i6 = (int) (((((float) ((i - i2) / 2)) + (this.OooO0O0 * ((float) i2))) / f) * ((float) i5));
        int i7 = (int) (this.OooO0OO * ((float) i3));
        int i8 = (int) (((this.OooO0Oo * ((float) i2)) / f) * ((float) i5));
        try {
            return this.f15824OooO00o.decodeWithState(OooO00o(this.f15827OooO00o, i3, i5, false, i4, i6, i7, i8));
        } catch (NotFoundException unused) {
            byte[] OooO00o2 = OooO00o(this.f15827OooO00o, this.f15823OooO00o, this.f15828OooO0O0);
            int i9 = this.f15828OooO0O0;
            try {
                decodeWithState = this.f15824OooO00o.decodeWithState(OooO00o(OooO00o2, i9, this.f15823OooO00o, false, (i9 - i8) - i6, i4, i8, i7));
            } catch (NotFoundException unused2) {
                byte[] bArr = this.f15827OooO00o;
                int i10 = this.f15823OooO00o;
                int i11 = this.f15828OooO0O0;
                try {
                    decodeWithState = this.f15824OooO00o.decodeWithState(OooO00o(bArr, i10, i11, true, (i10 - i7) - i4, (i11 - i8) - i6, i7, i8));
                } catch (NotFoundException unused3) {
                    byte[] OooO00o3 = OooO00o(this.f15827OooO00o, this.f15823OooO00o, this.f15828OooO0O0);
                    int i12 = this.f15828OooO0O0;
                    int i13 = this.f15823OooO00o;
                    try {
                        decodeWithState = this.f15824OooO00o.decodeWithState(OooO00o(OooO00o3, i12, i13, true, i6, (i13 - i7) - i4, i8, i7));
                    } catch (NotFoundException unused4) {
                        return null;
                    }
                }
            }
            return decodeWithState;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private byte[] OooO00o(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                bArr2[(((i4 * i2) + i2) - i3) - 1] = bArr[(i3 * i) + i4];
            }
        }
        return bArr2;
    }

    /* renamed from: OooO00o */
    public void onPostExecute(Result result) {
        super.onPostExecute(result);
        if (result != null) {
            this.f15825OooO00o.OooO00o(result, this.f15823OooO00o, this.f15828OooO0O0);
        }
        this.f15825OooO00o.OooO00o();
    }

    private BinaryBitmap OooO00o(byte[] bArr, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        PlanarYUVLuminanceSource planarYUVLuminanceSource;
        if (this.f15826OooO00o) {
            planarYUVLuminanceSource = new PlanarYUVLuminanceSource(bArr, i, i2, i3, i4, i5, i6, false);
        } else {
            planarYUVLuminanceSource = new PlanarYUVLuminanceSource(bArr, i, i2, 0, 0, i, i2, false);
        }
        if (z) {
            return new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSource.invert()));
        }
        return new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSource));
    }
}
