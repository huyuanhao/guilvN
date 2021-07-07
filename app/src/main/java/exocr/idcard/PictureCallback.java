package exocr.idcard;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.os.Environment;
import android.os.Message;
import exocr.exocrengine.EXIDCardResult;
import exocr.exocrengine.EXOCREngine;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class PictureCallback implements Camera.PictureCallback {
    public static final String o0ooOOo = PreviewCallback.class.getSimpleName();
    public CaptureActivity OooO00o = null;

    public void OooO00o(CaptureActivity captureActivity) {
        this.OooO00o = captureActivity;
    }

    public void onPictureTaken(byte[] bArr, Camera camera) {
        EXIDCardResult OooO00o2;
        if (CameraManager.OooO00o().m22037OooO00o().OooO00o() == 256) {
            OooO00o(bArr);
        }
        if (this.OooO00o != null) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            decodeByteArray.getWidth();
            decodeByteArray.getHeight();
            EXOCREngine eXOCREngine = new EXOCREngine();
            byte[] bArr2 = eXOCREngine.f23703OooO00o;
            int nativeRecoIDCardBitmap = EXOCREngine.nativeRecoIDCardBitmap(decodeByteArray, bArr2, bArr2.length);
            if (nativeRecoIDCardBitmap > 0 && (OooO00o2 = EXIDCardResult.OooO00o(eXOCREngine.f23703OooO00o, nativeRecoIDCardBitmap)) != null) {
                OooO00o2.OooO00o("Preview");
                Message.obtain(this.OooO00o.m22042OooO00o(), ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "id", "decode_succeeded"), OooO00o2).sendToTarget();
            }
            this.OooO00o = null;
        }
        CameraManager.OooO00o().OooO0Oo();
    }

    public static void OooO00o(Bitmap bitmap, byte[] bArr, int i, int i2) {
        int[] iArr = new int[(i * i2)];
        bitmap.getPixels(iArr, 0, i, 0, 0, i, i2);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = iArr[i3];
                double d = (double) ((16711680 & i6) >> 16);
                Double.isNaN(d);
                double d2 = (double) ((65280 & i6) >> 8);
                Double.isNaN(d2);
                double d3 = (double) (i6 & 255);
                Double.isNaN(d3);
                bArr[i3] = (byte) ((int) ((d * 0.3d) + (d2 * 0.59d) + (d3 * 0.11d)));
                i3++;
            }
        }
    }

    public static String OooO00o(byte[] bArr) {
        String str = Environment.getExternalStorageDirectory() + File.separator + Environment.DIRECTORY_DCIM + File.separator + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + ".jpg";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return str;
    }
}
