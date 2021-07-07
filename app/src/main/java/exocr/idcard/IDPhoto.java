package exocr.idcard;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.p118pd.sdk.C9058ooOoOoOO;
import exocr.exocrengine.EXIDCardResult;
import exocr.exocrengine.EXOCREngine;

public class IDPhoto {
    public static final String OooO00o = "IDPhoto";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f23801OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f23802OooO00o = new Handler() {
        /* class exocr.idcard.IDPhoto.HandlerC47351 */

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (IDPhoto.this.f23801OooO00o != null && !IDPhoto.this.f23801OooO00o.isRecycled()) {
                IDPhoto.this.f23801OooO00o = null;
            }
            if (IDPhoto.this.f23806OooO00o) {
                if (IDPhoto.this.f23803OooO00o != null) {
                    IDPhoto.this.f23805OooO00o.OooO0O0(0);
                    IDPhoto iDPhoto = IDPhoto.this;
                    iDPhoto.f23805OooO00o.OooO00o(iDPhoto.f23803OooO00o);
                    IDPhoto.this.f23803OooO00o = null;
                    if (!IDPhoto.this.f23805OooO00o.m22061OooO0O0()) {
                        IDPhoto.this.f23804OooO00o.finish();
                        IDPhoto.this.f23805OooO00o.m22060OooO0O0();
                        return;
                    }
                    IDPhoto.this.f23805OooO00o.OooO0O0(true);
                }
            } else if (IDPhoto.this.f23803OooO00o != null) {
                IDPhoto.this.f23805OooO00o.OooO0O0(-1);
                IDPhoto iDPhoto2 = IDPhoto.this;
                iDPhoto2.f23805OooO00o.OooO00o(iDPhoto2.f23803OooO00o);
                IDPhoto.this.f23803OooO00o = null;
                if (!IDPhoto.this.f23805OooO00o.m22061OooO0O0()) {
                    IDPhoto.this.f23805OooO00o.m22060OooO0O0();
                    IDPhoto.this.f23804OooO00o.finish();
                    return;
                }
                IDPhoto.this.f23805OooO00o.OooO0O0(false);
            }
        }
    };

    /* renamed from: OooO00o  reason: collision with other field name */
    public EXIDCardResult f23803OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CaptureActivity f23804OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IDCardManager f23805OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23806OooO00o;

    public IDPhoto(CaptureActivity captureActivity) {
        this.f23804OooO00o = captureActivity;
        this.f23805OooO00o = IDCardManager.OooO00o();
    }

    public IDPhoto() {
    }

    public void OooO00o() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType(C9058ooOoOoOO.OooO0o);
        this.f23804OooO00o.startActivityForResult(intent, 4133);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(Bitmap bitmap) {
        byte[] bArr = new byte[4096];
        int[] iArr = new int[16];
        int[] iArr2 = new int[64];
        float currentTimeMillis = (float) System.currentTimeMillis();
        Bitmap nativeRecoIDCardStillImageV2 = EXOCREngine.nativeRecoIDCardStillImageV2(bitmap, 0, 1, bArr, 4096, iArr2, iArr);
        float currentTimeMillis2 = (float) System.currentTimeMillis();
        DebugLog.OooO0OO("return=" + iArr[0] + "\nstart:" + currentTimeMillis + "\nend:" + currentTimeMillis2 + "\ntime cost :" + (currentTimeMillis2 - currentTimeMillis));
        int i = iArr[0];
        if (i > 0) {
            EXIDCardResult OooO00o2 = EXIDCardResult.OooO00o(bArr, i);
            this.f23803OooO00o = OooO00o2;
            if (OooO00o2 != null) {
                if (this.f23805OooO00o.OooO()) {
                    this.f23803OooO00o.OooO00o(bitmap, nativeRecoIDCardStillImageV2);
                } else {
                    this.f23803OooO00o.OooO00o(nativeRecoIDCardStillImageV2, nativeRecoIDCardStillImageV2);
                }
                this.f23803OooO00o.OooO00o(iArr2);
                this.f23806OooO00o = true;
                return;
            }
            return;
        }
        this.f23806OooO00o = false;
        EXIDCardResult eXIDCardResult = new EXIDCardResult();
        this.f23803OooO00o = eXIDCardResult;
        eXIDCardResult.OooO00o(bitmap, (Bitmap) null);
    }

    public void OooO00o(Intent intent) {
        Uri data = intent.getData();
        DebugLog.m22048OooO00o(data.toString());
        ContentResolver contentResolver = this.f23804OooO00o.getContentResolver();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(contentResolver.openInputStream(data), null, options);
            int i2 = options.outHeight;
            int i3 = options.outWidth;
            DebugLog.OooO0o0(" width: " + i3 + " heigth:" + i2);
            int min = Math.min(i2, i3);
            if (min > 1000) {
                i = (int) (((float) min) / 500.0f);
            }
            options.inJustDecodeBounds = false;
            options.inSampleSize = i;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            this.f23801OooO00o = BitmapFactory.decodeStream(contentResolver.openInputStream(data), null, options);
            DebugLog.OooO0o0("size: " + this.f23801OooO00o.getByteCount() + " width: " + this.f23801OooO00o.getWidth() + " heigth:" + this.f23801OooO00o.getHeight() + "inSampleSize:" + i);
            if (this.f23801OooO00o != null) {
                new Thread() {
                    /* class exocr.idcard.IDPhoto.C47362 */

                    public void run() {
                        IDPhoto iDPhoto = IDPhoto.this;
                        iDPhoto.OooO00o((IDPhoto) iDPhoto.f23801OooO00o);
                        IDPhoto.this.f23802OooO00o.sendEmptyMessage(0);
                    }
                }.start();
            }
        } catch (Exception e) {
            DebugLog.OooO0O0(e.getMessage());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public EXIDCardResult m22075OooO00o(Bitmap bitmap) {
        new EXIDCardResult();
        byte[] bArr = new byte[4096];
        int[] iArr = new int[16];
        int[] iArr2 = new int[64];
        Bitmap nativeRecoIDCardStillImageV2 = EXOCREngine.nativeRecoIDCardStillImageV2(bitmap, 0, 1, bArr, 4096, iArr2, iArr);
        DebugLog.OooO0OO("return=" + iArr[0]);
        int i = iArr[0];
        if (i > 0) {
            EXIDCardResult OooO00o2 = EXIDCardResult.OooO00o(bArr, i);
            if (OooO00o2 == null) {
                return null;
            }
            OooO00o2.OooO00o(nativeRecoIDCardStillImageV2, nativeRecoIDCardStillImageV2);
            OooO00o2.OooO00o(iArr2);
            this.f23806OooO00o = true;
            return OooO00o2;
        }
        this.f23806OooO00o = false;
        EXIDCardResult eXIDCardResult = new EXIDCardResult();
        eXIDCardResult.OooO00o(bitmap, (Bitmap) null);
        return eXIDCardResult;
    }
}
