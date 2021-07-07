package com.tencent.p272pd.sdk;

import android.graphics.Bitmap;
import android.widget.Toast;
import com.facebook.imagepipeline.producers.ProducerConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.jinhui365.util.util.gson.GsonUtil;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.p118pd.sdk.AbstractC8670oo0OoOO0;
import com.p118pd.sdk.AbstractC8740oo0oOo;
import com.p118pd.sdk.AbstractC8744oo0oOo0o;
import com.p118pd.sdk.C8609oo0O0OoO;
import com.p118pd.sdk.C8610oo0O0Ooo;
import com.p118pd.sdk.C8736oo0oOOOo;
import com.p118pd.sdk.C8938ooOOOO00;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.taobao.accs.common.Constants;
import com.umeng.socialize.handler.UMSSOHandler;
import exocr.bankcard.EXBankCardInfo;
import exocr.exocrengine.EXIDCardResult;
import java.util.HashMap;

/* renamed from: com.tencent.pd.sdk.Li11lli */
public class Li11lli extends ReactContextBaseJavaModule {
    public static final String LOG_TYPE = " Authentication";
    public final String MODULE_NAME = "AuthModule";
    public String address_key = "address";
    public String bankName_key = "bankName";
    public String bankNumber_key = "bankNumber";
    public String birth_key = "birth";
    public String cardType_key = "cardType";
    public String code_key = "code";
    public String data_key = "data";
    public String errorCode_key = Constants.KEY_ERROR_CODE;
    public String errorMsg_key = "errorMsg";
    public String gender_key = UMSSOHandler.GENDER;
    public String imageData_key = "imageData";
    public String imageType_key = ProducerConstants.EXTRA_IMAGE_TYPE;
    public String imageType_value = ".jpg";
    public String issue_key = "issue";
    public ReactApplicationContext mContext;
    public String name_key = "name";
    public String nation_key = "nation";
    public String token_key = "token";
    public String type_key = "type";
    public String validEnd_key = "validEnd";
    public String validStart_key = "validStart";

    public Li11lli(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext;
    }

    @ReactMethod
    public void bankCardOCR(ReadableMap readableMap, final Promise promise) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "bankCardOCR");
        hashMap.put("communication_type", "rn-call-native");
        hashMap.put("in_params", GsonUtil.toJson(C8609oo0O0OoO.OooO00o(readableMap)));
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, LOG_TYPE, hashMap);
        HashMap<String, Object> hashMap2 = new HashMap<>();
        if (readableMap != null) {
            hashMap2 = readableMap.toHashMap();
        }
        C8610oo0O0Ooo.OooO00o().OooO00o(getCurrentActivity(), hashMap2, new AbstractC8744oo0oOo0o() {
            /* class com.tencent.p272pd.sdk.Li11lli.C33942 */

            @Override // com.p118pd.sdk.AbstractC8744oo0oOo0o
            public void fail(int i, String str) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("code", i);
                createMap.putString("message", str);
                promise.resolve(createMap);
            }

            @Override // com.p118pd.sdk.AbstractC8744oo0oOo0o
            public void success(EXBankCardInfo eXBankCardInfo) {
                if (eXBankCardInfo != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("code", 0);
                    createMap.putString(Li11lli.this.bankName_key, eXBankCardInfo.f23668o0ooOOo);
                    createMap.putString(Li11lli.this.cardType_key, eXBankCardInfo.f23667o0Oo0oo);
                    createMap.putString(Li11lli.this.bankNumber_key, eXBankCardInfo.f23669o0ooOoO);
                    promise.resolve(createMap);
                    return;
                }
                LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, " Authentication:bankCardOCR success cardInfo null");
                promise.resolve(Arguments.createMap());
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AuthModule";
    }

    @ReactMethod
    public void idCardOCR(int i, ReadableMap readableMap, final Promise promise) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "idCardOCR");
        hashMap.put("communication_type", "rn-call-native");
        HashMap<String, String> OooO00o = C8609oo0O0OoO.OooO00o(readableMap);
        OooO00o.put("idCardOCR_type", i + "");
        hashMap.put("in_params", GsonUtil.toJson(OooO00o));
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, LOG_TYPE, hashMap);
        HashMap<String, Object> hashMap2 = new HashMap<>();
        if (readableMap != null) {
            hashMap2 = readableMap.toHashMap();
        }
        C8610oo0O0Ooo.OooO00o().OooO00o(getCurrentActivity(), i, hashMap2, new AbstractC8740oo0oOo() {
            /* class com.tencent.p272pd.sdk.Li11lli.C33931 */

            @Override // com.p118pd.sdk.AbstractC8740oo0oOo
            public void fail(int i, String str) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("code", i);
                createMap.putString("message", str);
                promise.resolve(createMap);
            }

            @Override // com.p118pd.sdk.AbstractC8740oo0oOo
            public void success(EXIDCardResult eXIDCardResult) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt(Li11lli.this.type_key, eXIDCardResult.o0ooOO0);
                if (eXIDCardResult.o0ooOO0 == 1) {
                    Bitmap bitmap = eXIDCardResult.OooO00o;
                    if (bitmap == null) {
                        LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, " Authentication:idCardFrontFullImage == null");
                        Toast.makeText(Li11lli.this.getCurrentActivity(), "身份证正面识别失败，请再次上传", 0).show();
                        return;
                    }
                    createMap.putString(Li11lli.this.imageType_key, Li11lli.this.imageType_value);
                    createMap.putString(Li11lli.this.imageData_key, C8736oo0oOOOo.m20351OooO00o(bitmap));
                    createMap.putString(Li11lli.this.name_key, eXIDCardResult.o0OOO0o);
                    createMap.putString(Li11lli.this.gender_key, eXIDCardResult.o0Oo0oo);
                    createMap.putString(Li11lli.this.nation_key, eXIDCardResult.oo0o0Oo);
                    createMap.putString(Li11lli.this.birth_key, eXIDCardResult.o0O0O00);
                    createMap.putString(Li11lli.this.address_key, eXIDCardResult.o0OO00O);
                    createMap.putString(Li11lli.this.code_key, eXIDCardResult.o0ooOoO);
                } else {
                    Bitmap bitmap2 = eXIDCardResult.OooO00o;
                    if (bitmap2 == null) {
                        LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, " Authentication:idCardBackFullImage == null");
                        Toast.makeText(Li11lli.this.getCurrentActivity(), "身份证背面识别失败，请再次上传", 0).show();
                        return;
                    }
                    createMap.putString(Li11lli.this.imageType_key, Li11lli.this.imageType_value);
                    createMap.putString(Li11lli.this.imageData_key, C8736oo0oOOOo.m20351OooO00o(bitmap2));
                    createMap.putString(Li11lli.this.issue_key, eXIDCardResult.o000OOo);
                    String[] split = eXIDCardResult.o000000.split(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    if (split.length == 2) {
                        String OooO00o = C8609oo0O0OoO.OooO00o(split[0], "yyyyMMdd", "yyyy-MM-dd");
                        String OooO00o2 = split[1].startsWith("长期") ? "长期有效" : C8609oo0O0OoO.OooO00o(split[1], "yyyyMMdd", "yyyy-MM-dd");
                        createMap.putString(Li11lli.this.validStart_key, OooO00o);
                        createMap.putString(Li11lli.this.validEnd_key, OooO00o2);
                    }
                }
                promise.resolve(createMap);
            }
        });
    }

    @ReactMethod
    public void livingRecognition(ReadableMap readableMap, ReadableMap readableMap2, final Promise promise) {
        final HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "livingRecognition");
        hashMap.put("communication_type", "rn-call-native");
        hashMap.put("in_params", GsonUtil.toJson(C8609oo0O0OoO.OooO00o(readableMap)));
        hashMap.put("option_params", GsonUtil.toJson(C8609oo0O0OoO.OooO00o(readableMap2)));
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, LOG_TYPE, hashMap);
        HashMap<String, Object> hashMap2 = new HashMap<>();
        if (readableMap != null) {
            hashMap2 = readableMap.toHashMap();
        }
        HashMap<String, Object> hashMap3 = new HashMap<>();
        if (readableMap2 != null) {
            hashMap3 = readableMap2.toHashMap();
        }
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, " AuthenticationlivingRecognition,开始调用活体");
        C8610oo0O0Ooo.OooO00o().OooO00o(getCurrentActivity(), hashMap2, hashMap3, new AbstractC8670oo0OoOO0() {
            /* class com.tencent.p272pd.sdk.Li11lli.C33953 */

            @Override // com.p118pd.sdk.AbstractC8670oo0OoOO0
            public void onFail(String str, int i) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("code", 0);
                createMap.putInt(Li11lli.this.errorCode_key, i);
                createMap.putString(Li11lli.this.errorMsg_key, str);
                hashMap.put("out_params", GsonUtil.toJson(C8609oo0O0OoO.OooO00o(createMap)));
                hashMap.put("desc", "livingRecognition onFail");
                hashMap.put("communication_type", "native-call-rn");
                LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, Li11lli.LOG_TYPE, hashMap);
                promise.resolve(createMap);
            }

            @Override // com.p118pd.sdk.AbstractC8670oo0OoOO0
            public void onPreFail(String str, int i) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("code", -1);
                createMap.putInt(Li11lli.this.errorCode_key, i);
                createMap.putString(Li11lli.this.errorMsg_key, str);
                hashMap.put("out_params", GsonUtil.toJson(C8609oo0O0OoO.OooO00o(createMap)));
                hashMap.put("desc", "livingRecognition onPreFail");
                hashMap.put("communication_type", "native-call-rn");
                LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, Li11lli.LOG_TYPE, hashMap);
                promise.resolve(createMap);
            }

            @Override // com.p118pd.sdk.AbstractC8670oo0OoOO0
            public void onPreFinish() {
                HashMap hashMap = new HashMap();
                hashMap.put("desc", "livingRecognition onPreFinish");
                LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, Li11lli.LOG_TYPE, hashMap);
            }

            @Override // com.p118pd.sdk.AbstractC8670oo0OoOO0
            public void onPreStart() {
                HashMap hashMap = new HashMap();
                hashMap.put("desc", "livingRecognition onPreStart");
                LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, Li11lli.LOG_TYPE, hashMap);
            }

            @Override // com.p118pd.sdk.AbstractC8670oo0OoOO0
            public void success(String str, String str2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("code", 1);
                createMap.putString(Li11lli.this.data_key, str2);
                createMap.putString(Li11lli.this.token_key, str);
                HashMap hashMap = new HashMap();
                hashMap.put("code", "1");
                hashMap.put(Li11lli.this.data_key, C8938ooOOOO00.OooO00o(str2, 10, str2.length() - 10, 4));
                hashMap.put(Li11lli.this.token_key, str);
                hashMap.put("out_params", GsonUtil.toJson(hashMap));
                hashMap.put("desc", "livingRecognition success");
                hashMap.put("communication_type", "native-call-rn");
                LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, Li11lli.LOG_TYPE, hashMap);
                promise.resolve(createMap);
            }
        });
    }
}
