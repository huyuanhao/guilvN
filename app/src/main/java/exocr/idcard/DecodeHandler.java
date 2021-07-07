package exocr.idcard;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import exocr.exocrengine.EXIDCardResult;
import exocr.exocrengine.EXOCREngine;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DecodeHandler extends Handler {
    public static final String OooO00o = DecodeHandler.class.getSimpleName();
    public int OooO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23765OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CaptureActivity f23766OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23767OooO00o;
    public final int OooO0O0 = 1;
    public final int OooO0OO = 2;
    public final int OooO0Oo = 4;
    public int OooO0o;
    public final int OooO0o0 = 8;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O;

    public DecodeHandler(CaptureActivity captureActivity) {
        this.f23766OooO00o = captureActivity;
        this.f23765OooO00o = 0;
        this.OooO0o = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "decode");
        this.OooO0oO = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "decode_succeeded");
        this.OooO0oo = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "decode_failed");
        this.OooO = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "quit");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m22049OooO00o(byte[] bArr, int i, int i2) {
        EXOCREngine eXOCREngine;
        int i3;
        if (this.f23767OooO00o == null) {
            this.f23767OooO00o = new byte[bArr.length];
        }
        if (this.f23767OooO00o.length < bArr.length) {
            this.f23767OooO00o = null;
            this.f23767OooO00o = new byte[bArr.length];
        }
        byte[] bArr2 = this.f23767OooO00o;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.OooOO0 = i;
        this.OooOO0O = i2;
        long currentTimeMillis = System.currentTimeMillis();
        int[] iArr = new int[32];
        EXOCREngine eXOCREngine2 = new EXOCREngine();
        eXOCREngine2.f23702OooO00o = System.currentTimeMillis();
        if (!IDCardManager.OooO00o().OooO0oo()) {
            byte[] bArr3 = eXOCREngine2.f23703OooO00o;
            eXOCREngine = eXOCREngine2;
            i3 = EXOCREngine.nativeRecoIDCardRawdat(bArr, i, i2, i, 1, bArr3, bArr3.length);
        } else {
            eXOCREngine = eXOCREngine2;
            i3 = 0;
        }
        eXOCREngine.f23704OooO0O0 = System.currentTimeMillis();
        if (i3 > 0) {
            long currentTimeMillis2 = System.currentTimeMillis();
            DebugLog.m22048OooO00o("Found text (" + (currentTimeMillis2 - currentTimeMillis) + " ms):\n");
            EXIDCardResult OooO00o2 = EXIDCardResult.OooO00o(eXOCREngine.f23703OooO00o, i3);
            if (OooO00o2 != null && this.f23766OooO00o.m22045OooO00o(OooO00o2)) {
                OooO00o2.OooO00o("Preview");
                OooO00o2.OooO00o(OooO00o(bArr, i, i2));
                int[] iArr2 = new int[1];
                int OooO0O02 = IDCardManager.OooO00o().OooO0O0();
                int i4 = 2;
                if (OooO0O02 == 0) {
                    i4 = 1;
                } else if (OooO0O02 != 1) {
                    i4 = 14;
                }
                byte[] bArr4 = eXOCREngine.f23703OooO00o;
                Bitmap nativeGetIDCardStdImg2 = EXOCREngine.nativeGetIDCardStdImg2(bArr, i, i2, i4, bArr4, bArr4.length, iArr, iArr2);
                if (nativeGetIDCardStdImg2 != null) {
                    OooO00o2.OooO00o(nativeGetIDCardStdImg2, nativeGetIDCardStdImg2);
                    OooO00o2.f23695OooO0O0 = OooO00o();
                    OooO00o2.OooO00o(iArr);
                    OooO00o2.OooO0O0(iArr2[0]);
                    this.f23767OooO00o = null;
                    Message.obtain(this.f23766OooO00o.m22042OooO00o(), this.OooO0oO, OooO00o2).sendToTarget();
                    return;
                }
            }
        }
        Message.obtain(this.f23766OooO00o.m22042OooO00o(), this.OooO0oo).sendToTarget();
    }

    private void OooO0O0(byte[] bArr, int i, int i2) {
        this.f23765OooO00o++;
        String str = Environment.getExternalStorageDirectory() + File.separator + Environment.DIRECTORY_DCIM + File.separator + new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date()) + "_" + this.f23765OooO00o + ".jpg";
        Rect rect = new Rect(0, 0, i - 1, i2 - 1);
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            yuvImage.compressToJpeg(rect, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private void OooO0OO(byte[] bArr, int i, int i2) {
        this.f23765OooO00o++;
        String str = "/mnt/sdcard/test_" + this.f23765OooO00o + ".raw";
        String str2 = "size=width=" + i + "height=" + i2;
        byte[] bArr2 = new byte[str2.length()];
        for (int i3 = 0; i3 < str2.length(); i3++) {
            bArr2[i3] = (byte) str2.charAt(i3);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            fileOutputStream.write(bArr, 0, i * i2);
            fileOutputStream.write(bArr2);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == this.OooO0o) {
            m22049OooO00o((byte[]) message.obj, message.arg1, message.arg2);
        } else if (i == this.OooO) {
            Looper.myLooper().quit();
        }
    }

    private int OooO00o(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = i2 / 16;
        int i5 = (i2 / 2) - i4;
        int i6 = i / 16;
        int i7 = i6 * 2;
        int i8 = ((i / 2) - i6) * 2;
        int i9 = 0;
        while (i4 < i5) {
            for (int i10 = i7; i10 < i8; i10++) {
                if ((bArr[(i4 * i) + i10 + i3] & 255) > 144) {
                    i9++;
                }
            }
            i4++;
        }
        if (i9 > 255) {
            return 1;
        }
        return 0;
    }

    public void OooO00o(Bitmap bitmap) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(Environment.getExternalStorageDirectory() + File.separator + Environment.DIRECTORY_DCIM + File.separator + "image_idcard.jpg"));
            if (bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream)) {
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public Bitmap OooO00o() {
        if (this.f23767OooO00o == null) {
            return null;
        }
        DebugLog.OooO0OO("数据不为空" + this.f23767OooO00o.length);
        try {
            YuvImage yuvImage = new YuvImage(this.f23767OooO00o, 17, this.OooOO0, this.OooOO0O, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, this.OooOO0, this.OooOO0O), 80, byteArrayOutputStream);
            return BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        } catch (Exception unused) {
            return null;
        }
    }
}
