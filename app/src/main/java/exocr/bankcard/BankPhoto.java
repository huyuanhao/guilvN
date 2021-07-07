package exocr.bankcard;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.p118pd.sdk.C9058ooOoOoOO;

public class BankPhoto {
    public static final String OooO00o = "BankPhoto";

    /* renamed from: OooO00o  reason: collision with other field name */
    public ProgressDialog f23607OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f23608OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f23609OooO00o = new Handler() {
        /* class exocr.bankcard.BankPhoto.HandlerC47041 */

        public void handleMessage(Message message) {
            super.handleMessage(message);
            BankPhoto.this.f23607OooO00o.dismiss();
            if (BankPhoto.this.f23608OooO00o != null && !BankPhoto.this.f23608OooO00o.isRecycled()) {
                BankPhoto.this.f23608OooO00o = null;
            }
            if (BankPhoto.this.f23612OooO00o) {
                if (BankPhoto.this.f23611OooO00o != null) {
                    BankPhoto.this.f23610OooO00o.OooO00o(BankPhoto.this.f23612OooO00o, BankPhoto.this.f23611OooO00o);
                }
            } else if (BankPhoto.this.f23611OooO00o != null) {
                BankPhoto.this.f23610OooO00o.OooO00o(BankPhoto.this.f23612OooO00o, BankPhoto.this.f23611OooO00o);
                BankPhoto.this.f23611OooO00o = null;
            }
        }
    };

    /* renamed from: OooO00o  reason: collision with other field name */
    public CardRecoActivity f23610OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public EXBankCardInfo f23611OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23612OooO00o;

    public BankPhoto(CardRecoActivity cardRecoActivity) {
        this.f23610OooO00o = cardRecoActivity;
        EXBankCardReco.nativeCheckSignature(cardRecoActivity.getApplicationContext());
        this.f23611OooO00o = new EXBankCardInfo();
    }

    public BankPhoto(Context context) {
        EXBankCardReco.nativeCheckSignature(context);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m22000OooO00o() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType(C9058ooOoOoOO.OooO0o);
        this.f23610OooO00o.startActivityForResult(intent, 4132);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(Bitmap bitmap) {
        byte[] bArr = new byte[4096];
        int[] iArr = new int[16];
        int[] iArr2 = new int[4];
        Bitmap nativeRecoStillImage2 = EXBankCardReco.nativeRecoStillImage2(bitmap, 1, 1, bArr, 4096, iArr, iArr2);
        if (nativeRecoStillImage2 != null) {
            try {
                nativeRecoStillImage2 = Bitmap.createBitmap(nativeRecoStillImage2, iArr2[0], iArr2[1], iArr2[2] - iArr2[0], iArr2[3] - iArr2[1]);
            } catch (Exception unused) {
            }
        } else {
            nativeRecoStillImage2 = null;
        }
        Log.i(OooO00o, "rect:" + iArr2[0] + "*" + iArr2[1] + "*" + iArr2[2] + "*" + iArr2[3]);
        int i = iArr[0];
        if (i <= 0 || nativeRecoStillImage2 == null) {
            this.f23612OooO00o = false;
            Bitmap bitmap2 = this.f23611OooO00o.f23665OooO0O0;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f23611OooO00o.f23665OooO0O0 = null;
            }
            this.f23611OooO00o.f23665OooO0O0 = bitmap;
            return;
        }
        this.f23612OooO00o = EXBankCardReco.OooO0O0(bArr, i, this.f23611OooO00o);
        if (BankManager.OooO00o().OooO0oo()) {
            this.f23611OooO00o.f23661OooO00o = bitmap;
        } else {
            this.f23611OooO00o.f23661OooO00o = nativeRecoStillImage2;
        }
        if (this.f23612OooO00o) {
            Bitmap bitmap3 = this.f23611OooO00o.f23665OooO0O0;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                this.f23611OooO00o.f23665OooO0O0 = null;
            }
            this.f23611OooO00o.f23665OooO0O0 = bitmap;
        }
    }

    public void OooO00o(Intent intent) {
        Uri data = intent.getData();
        DebugLog.OooO0OO(data.toString());
        ContentResolver contentResolver = this.f23610OooO00o.getContentResolver();
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
            this.f23608OooO00o = BitmapFactory.decodeStream(contentResolver.openInputStream(data), null, options);
            DebugLog.OooO0o0("size: " + this.f23608OooO00o.getByteCount() + " width: " + this.f23608OooO00o.getWidth() + " heigth:" + this.f23608OooO00o.getHeight() + "inSampleSize:" + i);
            if (this.f23608OooO00o != null) {
                this.f23607OooO00o = ProgressDialog.show(this.f23610OooO00o, null, "正在识别，请稍候");
                new Thread() {
                    /* class exocr.bankcard.BankPhoto.C47052 */

                    public void run() {
                        BankPhoto bankPhoto = BankPhoto.this;
                        bankPhoto.OooO00o((BankPhoto) bankPhoto.f23608OooO00o);
                        BankPhoto.this.f23609OooO00o.sendEmptyMessage(0);
                    }
                }.start();
            }
        } catch (Exception e) {
            DebugLog.OooO0O0(e.getMessage());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public EXBankCardInfo m21999OooO00o(Bitmap bitmap) {
        Bitmap bitmap2;
        int i;
        EXBankCardInfo eXBankCardInfo = new EXBankCardInfo();
        byte[] bArr = new byte[4096];
        int[] iArr = new int[16];
        int[] iArr2 = new int[4];
        Bitmap nativeRecoStillImage2 = EXBankCardReco.nativeRecoStillImage2(bitmap, 1, 1, bArr, 4096, iArr, iArr2);
        if (nativeRecoStillImage2 != null) {
            try {
                bitmap2 = Bitmap.createBitmap(nativeRecoStillImage2, iArr2[0], iArr2[1], iArr2[2] - iArr2[0], iArr2[3] - iArr2[1]);
            } catch (Exception unused) {
            }
            i = iArr[0];
            if (i > 0 || bitmap2 == null) {
                this.f23612OooO00o = false;
                Bitmap bitmap3 = eXBankCardInfo.f23665OooO0O0;
                if (bitmap3 != null && !bitmap3.isRecycled()) {
                    eXBankCardInfo.f23665OooO0O0 = bitmap;
                }
                return eXBankCardInfo;
            }
            this.f23612OooO00o = EXBankCardReco.OooO0O0(bArr, i, eXBankCardInfo);
            eXBankCardInfo.f23661OooO00o = bitmap2;
            Bitmap bitmap4 = eXBankCardInfo.f23665OooO0O0;
            if (bitmap4 != null && !bitmap4.isRecycled()) {
                eXBankCardInfo.f23665OooO0O0 = bitmap;
            }
            return eXBankCardInfo;
        }
        bitmap2 = null;
        i = iArr[0];
        if (i > 0) {
        }
        this.f23612OooO00o = false;
        Bitmap bitmap32 = eXBankCardInfo.f23665OooO0O0;
        eXBankCardInfo.f23665OooO0O0 = bitmap;
        return eXBankCardInfo;
    }

    public EXBankCardInfo OooO00o() {
        return this.f23611OooO00o;
    }
}
