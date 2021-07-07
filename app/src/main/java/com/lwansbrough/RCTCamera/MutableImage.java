package com.lwansbrough.RCTCamera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.MetadataException;
import com.facebook.react.bridge.ReadableMap;
import com.p118pd.sdk.AbstractC7922oO0o0O0O;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C7925oO0o0OO0;
import com.p118pd.sdk.C7928oO0o0Oo;
import com.p118pd.sdk.C8287oOo00O0O;
import com.p118pd.sdk.C8294oOo00OoO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.oO0O0O;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MutableImage {
    public static final String OooO00o = "RNCamera";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f15062OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7925oO0o0OO0 f15063OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15064OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f15065OooO00o;

    public static class ImageMutationFailedException extends Exception {
        public ImageMutationFailedException(String str, Throwable th) {
            super(str, th);
        }

        public ImageMutationFailedException(String str) {
            super(str);
        }
    }

    public static class OooO00o {
        public static String OooO00o(double d) {
            return d < AbstractC8352oOoOOoO0.OooO0O0 ? ExifInterface.o000oOoo : "N";
        }

        public static void OooO00o(double d, double d2, android.media.ExifInterface exifInterface) throws IOException {
            exifInterface.setAttribute(ExifInterface.o0000OOo, OooO0OO(d));
            exifInterface.setAttribute(ExifInterface.o0000OOO, OooO00o(d));
            exifInterface.setAttribute(ExifInterface.o0000Oo, OooO0OO(d2));
            exifInterface.setAttribute(ExifInterface.o0000Oo0, OooO0O0(d2));
        }

        public static String OooO0O0(double d) {
            return d < AbstractC8352oOoOOoO0.OooO0O0 ? ExifInterface.o000oo0 : ExifInterface.o000oo00;
        }

        public static String OooO0OO(double d) {
            double abs = Math.abs(d);
            int i = (int) abs;
            double d2 = (double) i;
            Double.isNaN(d2);
            double d3 = (abs * 60.0d) - (d2 * 60.0d);
            int i2 = (int) d3;
            double d4 = (double) i2;
            Double.isNaN(d4);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i);
            stringBuffer.append("/1,");
            stringBuffer.append(i2);
            stringBuffer.append("/1,");
            stringBuffer.append((int) (((d3 * 60.0d) - (d4 * 60.0d)) * 1000.0d));
            stringBuffer.append("/1000,");
            return stringBuffer.toString();
        }
    }

    public MutableImage(byte[] bArr) {
        this.f15065OooO00o = bArr;
        this.f15062OooO00o = OooO00o(bArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15127OooO00o() {
        return this.f15062OooO00o.getHeight();
    }

    public int OooO0O0() {
        return this.f15062OooO00o.getWidth();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15129OooO00o() throws ImageMutationFailedException {
        int OooO00o2;
        try {
            C8287oOo00O0O ooo00o0o = (C8287oOo00O0O) OooO00o().OooO00o(C8287oOo00O0O.class);
            if (ooo00o0o != null && ooo00o0o.m19650OooO00o(274) && (OooO00o2 = ooo00o0o.m19631OooO00o(274)) != 1) {
                OooO00o(OooO00o2);
                ooo00o0o.OooO00o(274, 1);
            }
        } catch (ImageProcessingException | MetadataException | IOException e) {
            throw new ImageMutationFailedException("failed to fix orientation", e);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m15130OooO0O0() throws ImageMutationFailedException {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(this.f15062OooO00o, 0, 0, OooO0O0(), m15127OooO00o(), matrix, false);
        if (createBitmap != null) {
            this.f15062OooO00o = createBitmap;
            return;
        }
        throw new ImageMutationFailedException("failed to mirror");
    }

    public void OooO00o(double d) throws IllegalArgumentException {
        int i;
        int i2;
        int OooO0O0 = OooO0O0();
        int OooO00o2 = m15127OooO00o();
        double d2 = (double) OooO00o2;
        Double.isNaN(d2);
        double d3 = d2 * d;
        double d4 = (double) OooO0O0;
        if (d3 > d4) {
            Double.isNaN(d4);
            i = (int) (d4 / d);
            i2 = OooO0O0;
        } else {
            i2 = (int) d3;
            i = OooO00o2;
        }
        this.f15062OooO00o = Bitmap.createBitmap(this.f15062OooO00o, (OooO0O0 - i2) / 2, (OooO00o2 - i) / 2, i2, i);
    }

    private void OooO00o(int i) throws ImageMutationFailedException {
        Matrix matrix = new Matrix();
        switch (i) {
            case 1:
                return;
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.postRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postRotate(270.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.postRotate(270.0f);
                break;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f15062OooO00o, 0, 0, OooO0O0(), m15127OooO00o(), matrix, false);
        if (createBitmap != null) {
            this.f15062OooO00o = createBitmap;
            this.f15064OooO00o = true;
            return;
        }
        throw new ImageMutationFailedException("failed to rotate");
    }

    public static Bitmap OooO00o(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Bitmap decodeStream = BitmapFactory.decodeStream(byteArrayInputStream);
            byteArrayInputStream.close();
            return decodeStream;
        } catch (IOException e) {
            throw new IllegalStateException("Will not happen", e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15128OooO00o(int i) {
        return Base64.encodeToString(OooO00o(this.f15062OooO00o, i), 2);
    }

    public void OooO00o(File file, ReadableMap readableMap, int i) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(OooO00o(this.f15062OooO00o, i));
        fileOutputStream.close();
        try {
            android.media.ExifInterface exifInterface = new android.media.ExifInterface(file.getAbsolutePath());
            for (AbstractC7922oO0o0O0O oo0o0o0o : OooO00o().m19661OooO00o()) {
                for (C7928oO0o0Oo oo0o0oo : oo0o0o0o.m19645OooO00o()) {
                    exifInterface.setAttribute(oo0o0oo.OooO0OO(), oo0o0o0o.m19642OooO00o(oo0o0oo.OooO00o()).toString());
                }
            }
            C8294oOo00OoO ooo00ooo = (C8294oOo00OoO) OooO00o().OooO00o(C8294oOo00OoO.class);
            for (C7928oO0o0Oo oo0o0oo2 : ooo00ooo.m19645OooO00o()) {
                int OooO00o2 = oo0o0oo2.OooO00o();
                String replaceAll = oo0o0oo2.OooO0OO().replaceAll(" ", "");
                Object OooO00o3 = ooo00ooo.m19642OooO00o(OooO00o2);
                if (replaceAll.equals(ExifInterface.f14237OoooOOO)) {
                    exifInterface.setAttribute(replaceAll, OooO00o(OooO00o3.toString()));
                } else {
                    exifInterface.setAttribute(replaceAll, OooO00o3.toString());
                }
            }
            OooO00o(readableMap, exifInterface);
            if (this.f15064OooO00o) {
                OooO00o(exifInterface);
            }
            exifInterface.saveAttributes();
        } catch (ImageProcessingException | IOException unused) {
        }
    }

    private String OooO00o(String str) {
        if (!str.contains(C8932ooOOO0o.OooO0OO)) {
            return "";
        }
        return Double.toString(1.0d / Double.parseDouble(str.split(C8932ooOOO0o.OooO0OO)[1]));
    }

    private void OooO00o(android.media.ExifInterface exifInterface) {
        exifInterface.setAttribute(ExifInterface.f14146OooO0oo, String.valueOf(1));
    }

    private void OooO00o(ReadableMap readableMap, android.media.ExifInterface exifInterface) {
        if (readableMap.hasKey("metadata")) {
            ReadableMap map = readableMap.getMap("metadata");
            if (map.hasKey("location")) {
                ReadableMap map2 = map.getMap("location");
                if (map2.hasKey("coords")) {
                    try {
                        ReadableMap map3 = map2.getMap("coords");
                        OooO00o.OooO00o(map3.getDouble("latitude"), map3.getDouble("longitude"), exifInterface);
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    private C7925oO0o0OO0 OooO00o() throws ImageProcessingException, IOException {
        if (this.f15063OooO00o == null) {
            this.f15063OooO00o = oO0O0O.OooO00o(new BufferedInputStream(new ByteArrayInputStream(this.f15065OooO00o)), (long) this.f15065OooO00o.length);
        }
        return this.f15063OooO00o;
    }

    public static byte[] OooO00o(Bitmap bitmap, int i) throws OutOfMemoryError {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        try {
            return byteArrayOutputStream.toByteArray();
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
