package com.baidu.idl.facesdk;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.baidu.idl.facesdk.FaceSDK;
import java.util.HashMap;
import java.util.Map;

public class FaceRecognize {
    public static final String TAG = "FaceRecognize";
    public Map<FaceSDK.RecognizeType, Boolean> abilities = new HashMap();
    public Context context;
    public boolean isInitModel = false;

    public FaceRecognize(Context context2) {
        this.context = context2;
    }

    private native int extractFeature(int[] iArr, int i, int i2, int i3, byte[] bArr, int[] iArr2, int i4, int i5);

    private native float getConsineDistance(byte[] bArr, byte[] bArr2);

    private native float getFaceSimilarity(byte[] bArr, byte[] bArr2, int i, int i2);

    private native int recognizeModelInit(AssetManager assetManager, String str, int i);

    private native int scoreMapInit(AssetManager assetManager, String str, int i);

    public int extractFeature(int[] iArr, int i, int i2, FaceSDK.ImgType imgType, byte[] bArr, int[] iArr2, FaceSDK.RecognizeType recognizeType) {
        if (!this.abilities.containsKey(recognizeType)) {
            String str = "not success init " + recognizeType;
            return -1;
        } else if (FaceSDK.checkParameter(iArr, i, i2) && iArr2 != null && bArr != null && bArr.length == 2048) {
            return extractFeature(iArr, i, i2, imgType.ordinal(), bArr, iArr2, 1, recognizeType.ordinal());
        } else {
            return -1;
        }
    }

    public float getFaceFeatureDistance(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return -1.0f;
        }
        float consineDistance = getConsineDistance(bArr, bArr2);
        if (Float.isNaN(consineDistance)) {
            return -1.0f;
        }
        return consineDistance;
    }

    public float getFaceSimilarity(byte[] bArr, byte[] bArr2, FaceSDK.RecognizeType recognizeType) {
        if (recognizeType == FaceSDK.RecognizeType.RECOGNIZE_ID_PHOTO || recognizeType == FaceSDK.RecognizeType.RECOGNIZE_NIR) {
            if (!BDFaceUtils.hasModel(this.context, FaceConfig.recognize_finance_compare_model_path)) {
                return 0.0f;
            }
            scoreMapInit(this.context.getAssets(), FaceConfig.recognize_finance_compare_model_path, recognizeType.ordinal());
            return getFaceSimilarity(bArr, bArr2, 0, recognizeType.ordinal());
        } else if (recognizeType != FaceSDK.RecognizeType.RECOGNIZE_LIVE || !BDFaceUtils.hasModel(this.context, FaceConfig.recognize_compare_model_path)) {
            return 0.0f;
        } else {
            scoreMapInit(this.context.getAssets(), FaceConfig.recognize_compare_model_path, recognizeType.ordinal());
            return getFaceSimilarity(bArr, bArr2, 0, recognizeType.ordinal());
        }
    }

    public void initModel(FaceSDK.RecognizeType recognizeType) {
        Context context2 = this.context;
        if (context2 != null) {
            if (recognizeType == FaceSDK.RecognizeType.RECOGNIZE_ID_PHOTO && BDFaceUtils.hasModel(context2, FaceConfig.recognize_finance_model_path)) {
                recognizeModelInit(this.context.getAssets(), FaceConfig.recognize_finance_model_path, FaceSDK.RecognizeType.RECOGNIZE_ID_PHOTO.ordinal());
                this.abilities.put(FaceSDK.RecognizeType.RECOGNIZE_ID_PHOTO, true);
            }
            if (recognizeType == FaceSDK.RecognizeType.RECOGNIZE_LIVE && BDFaceUtils.hasModel(this.context, FaceConfig.recognize_model_path)) {
                recognizeModelInit(this.context.getAssets(), FaceConfig.recognize_model_path, FaceSDK.RecognizeType.RECOGNIZE_LIVE.ordinal());
                this.abilities.put(FaceSDK.RecognizeType.RECOGNIZE_LIVE, true);
            }
            if (recognizeType == FaceSDK.RecognizeType.RECOGNIZE_NIR && BDFaceUtils.hasModel(this.context, FaceConfig.recognize_nir_model_path)) {
                recognizeModelInit(this.context.getAssets(), FaceConfig.recognize_nir_model_path, FaceSDK.RecognizeType.RECOGNIZE_NIR.ordinal());
                this.abilities.put(FaceSDK.RecognizeType.RECOGNIZE_NIR, true);
            }
        }
    }

    public int extractFeature(int[] iArr, int i, int i2, FaceSDK.ImgType imgType, int i3, byte[] bArr, FaceSDK.RecognizeType recognizeType) {
        int i4;
        Exception e;
        FaceInfo[] faceInfoArr;
        if (!this.abilities.containsKey(recognizeType)) {
            String str = "not success init " + recognizeType;
            return -1;
        } else if (!FaceSDK.checkParameter(iArr, i, i2) || bArr == null || bArr.length != 2048) {
            return -1;
        } else {
            if (!this.isInitModel) {
                Context context2 = this.context;
                if (context2 == null) {
                    return -1;
                }
                FaceSDK.initModel(context2);
                this.isInitModel = true;
            }
            FaceInfo[] faceInfoArr2 = null;
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            int i5 = i3 == 0 ? 100 : i3;
            try {
                if (recognizeType != FaceSDK.RecognizeType.RECOGNIZE_LIVE) {
                    if (recognizeType != FaceSDK.RecognizeType.RECOGNIZE_ID_PHOTO) {
                        faceInfoArr = FaceSDK.run_detect(iArr, i, i2, imgType, FaceSDK.DetectMethodType.NIR, i5);
                        faceInfoArr2 = faceInfoArr;
                        String str2 = "detect end " + (System.currentTimeMillis() - currentTimeMillis2);
                        if (faceInfoArr2 == null && faceInfoArr2.length > 0) {
                            long currentTimeMillis3 = System.currentTimeMillis();
                            int i6 = 0;
                            int i7 = 0;
                            for (int i8 = 0; i8 < faceInfoArr2.length; i8++) {
                                if (faceInfoArr2[i8].mWidth > i7) {
                                    i7 = faceInfoArr2[i8].mWidth;
                                    i6 = i8;
                                }
                            }
                            int[] iArr2 = {faceInfoArr2[i6].mCenter_x, faceInfoArr2[i6].mCenter_y, faceInfoArr2[i6].mWidth, faceInfoArr2[i6].mAngle};
                            int[] iArr3 = new int[144];
                            try {
                                FaceSDK.run_align(iArr, i, i2, imgType, FaceSDK.AlignMethodType.CDNN, iArr2, iArr3, new int[]{0}, new float[]{0.0f});
                                String str3 = "align end " + (System.currentTimeMillis() - currentTimeMillis3);
                            } catch (Exception e2) {
                                Log.i(TAG, "You need to apply for the authorization to use the facesdk");
                                e2.printStackTrace();
                            }
                            long currentTimeMillis4 = System.currentTimeMillis();
                            try {
                                i4 = extractFeature(iArr, i, i2, imgType.ordinal(), bArr, iArr3, 1, recognizeType.ordinal());
                                try {
                                    String str4 = "feature end " + (System.currentTimeMillis() - currentTimeMillis4);
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                i4 = -1;
                                Log.i(TAG, "You need to apply for the authorization to use the facesdk");
                                e.printStackTrace();
                                String str5 = "all time " + (System.currentTimeMillis() - currentTimeMillis);
                                return i4;
                            }
                            String str52 = "all time " + (System.currentTimeMillis() - currentTimeMillis);
                            return i4;
                        }
                    }
                }
                faceInfoArr = FaceSDK.run_detect(iArr, i, i2, imgType, FaceSDK.DetectMethodType.CNN, i5);
                faceInfoArr2 = faceInfoArr;
                String str22 = "detect end " + (System.currentTimeMillis() - currentTimeMillis2);
            } catch (Exception e5) {
                Log.i(TAG, "FaceSDK: You need to apply for the authorization to use the facesdk");
                e5.printStackTrace();
            }
            return faceInfoArr2 == null ? -1 : -1;
        }
    }
}
