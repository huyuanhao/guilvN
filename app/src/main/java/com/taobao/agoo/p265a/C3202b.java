package com.taobao.agoo.p265a;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3180l;
import com.taobao.accs.utl.C3185p;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.IRegister;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.agoo.p265a.p266a.AbstractC3199b;
import com.taobao.agoo.p265a.p266a.C3198a;
import com.taobao.agoo.p265a.p266a.C3201d;
import com.umeng.socialize.handler.UMSSOHandler;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.Config;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.agoo.a.b */
public class C3202b implements AccsDataListener {

    /* renamed from: b */
    public static C3197a f7290b;

    /* renamed from: a */
    public Map<String, ICallback> f7291a = new HashMap();

    public C3202b(Context context) {
        if (f7290b == null) {
            f7290b = new C3197a(context.getApplicationContext());
        }
    }

    /* renamed from: a */
    private void m7737a(JSONObject jSONObject, ICallback iCallback) throws JSONException {
        String a = C3185p.m7678a(jSONObject, C3198a.JSON_PUSH_USER_TOKEN, null);
        if (!TextUtils.isEmpty(a)) {
            Config.m14272b(GlobalClientInfo.getContext(), a);
            if (iCallback != null) {
                iCallback.onSuccess();
                f7290b.mo37819c(iCallback.extra);
            }
        } else if (iCallback != null) {
            iCallback.onFailure("", "agoo server error-pushtoken null");
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onAntiBrush(boolean z, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if ("AgooDeviceCmd".equals(str)) {
                ICallback iCallback = this.f7291a.get(str2);
                if (i == 200) {
                    String str3 = new String(bArr, "utf-8");
                    ALog.m7600i("RequestListener", "RequestListener onResponse", Constants.KEY_DATA_ID, str2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, iCallback, UMSSOHandler.JSON, str3);
                    JSONObject jSONObject = new JSONObject(str3);
                    String a = C3185p.m7678a(jSONObject, "resultCode", null);
                    String a2 = C3185p.m7678a(jSONObject, AbstractC3199b.JSON_CMD, null);
                    if (!"success".equals(a)) {
                        if (iCallback != null) {
                            iCallback.onFailure(String.valueOf(a), "agoo server error");
                        }
                        if ("AgooDeviceCmd".equals(str)) {
                            this.f7291a.remove(str2);
                            return;
                        }
                        return;
                    } else if ("register".equals(a2)) {
                        String a3 = C3185p.m7678a(jSONObject, "deviceId", null);
                        if (!TextUtils.isEmpty(a3)) {
                            TaobaoRegister.setIsRegisterSuccess(true);
                            C3180l.m7670a().mo37770b();
                            Config.m14269a(GlobalClientInfo.getContext(), a3);
                            f7290b.mo37817a(GlobalClientInfo.getContext().getPackageName());
                            if (iCallback instanceof IRegister) {
                                UtilityImpl.m7629c("Agoo_AppStore", GlobalClientInfo.getContext());
                                ((IRegister) iCallback).onSuccess(a3);
                            }
                        } else if (iCallback != null) {
                            iCallback.onFailure("", "agoo server error deviceid null");
                        }
                        if ("AgooDeviceCmd".equals(str)) {
                            this.f7291a.remove(str2);
                            return;
                        }
                        return;
                    } else if ("setAlias".equals(a2)) {
                        m7737a(jSONObject, iCallback);
                        if ("AgooDeviceCmd".equals(str)) {
                            this.f7291a.remove(str2);
                            return;
                        }
                        return;
                    } else if (C3198a.JSON_CMD_REMOVEALIAS.equals(a2)) {
                        Config.m14272b(GlobalClientInfo.getContext(), (String) null);
                        if (iCallback != null) {
                            iCallback.onSuccess();
                        }
                        f7290b.mo37816a();
                        if ("AgooDeviceCmd".equals(str)) {
                            this.f7291a.remove(str2);
                            return;
                        }
                        return;
                    } else if ((C3201d.JSON_CMD_ENABLEPUSH.equals(a2) || C3201d.JSON_CMD_DISABLEPUSH.equals(a2)) && iCallback != null) {
                        iCallback.onSuccess();
                    }
                } else if (iCallback != null) {
                    iCallback.onFailure(String.valueOf(i), "accs channel error");
                }
            }
            if (!"AgooDeviceCmd".equals(str)) {
                return;
            }
        } catch (Throwable th) {
            if ("AgooDeviceCmd".equals(str)) {
                this.f7291a.remove(str2);
            }
            throw th;
        }
        this.f7291a.remove(str2);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
    }
}
