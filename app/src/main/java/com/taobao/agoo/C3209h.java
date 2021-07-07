package com.taobao.agoo;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AbstractC3099c;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3180l;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.p265a.C3202b;
import com.taobao.agoo.p265a.p266a.C3200c;
import java.util.Map;
import org.android.agoo.common.Config;

/* renamed from: com.taobao.agoo.h */
public final class C3209h implements IAgooAppReceiver {

    /* renamed from: a */
    public final /* synthetic */ Context f7294a;

    /* renamed from: b */
    public final /* synthetic */ Context f7295b;

    /* renamed from: c */
    public final /* synthetic */ IRegister f7296c;

    /* renamed from: d */
    public final /* synthetic */ String f7297d;

    /* renamed from: e */
    public final /* synthetic */ String f7298e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC3099c f7299f;

    public C3209h(Context context, Context context2, IRegister iRegister, String str, String str2, AbstractC3099c cVar) {
        this.f7294a = context;
        this.f7295b = context2;
        this.f7296c = iRegister;
        this.f7297d = str;
        this.f7298e = str2;
        this.f7299f = cVar;
    }

    @Override // com.taobao.accs.IAppReceiver
    public Map<String, String> getAllServices() {
        return null;
    }

    @Override // com.taobao.accs.IAgooAppReceiver
    public String getAppkey() {
        return this.f7297d;
    }

    @Override // com.taobao.accs.IAppReceiver
    public String getService(String str) {
        return null;
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onBindApp(int i) {
    }

    @Override // com.taobao.accs.IAppReceiverV1
    public void onBindApp(int i, String str) {
        try {
            ALog.m7600i(TaobaoRegister.TAG, "onBindApp", Constants.KEY_ERROR_CODE, Integer.valueOf(i));
            if (i == 200) {
                if (TaobaoRegister.mRequestListener == null) {
                    C3202b unused = TaobaoRegister.mRequestListener = new C3202b(this.f7294a);
                }
                GlobalClientInfo.getInstance(this.f7295b).registerListener("AgooDeviceCmd", TaobaoRegister.mRequestListener);
                if (!C3202b.f7290b.mo37818b(this.f7294a.getPackageName()) || !UtilityImpl.m7625b(Constants.SP_CHANNEL_FILE_NAME, this.f7295b)) {
                    byte[] a = C3200c.m7733a(this.f7294a, this.f7297d, this.f7298e);
                    if (a != null) {
                        String b = this.f7299f.mo37480b(this.f7294a, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", a, null));
                        if (TextUtils.isEmpty(b)) {
                            if (this.f7296c != null) {
                                this.f7296c.onFailure("503.1", "accs channel disabled!");
                            }
                        } else if (this.f7296c != null) {
                            TaobaoRegister.mRequestListener.f7291a.put(b, this.f7296c);
                        }
                    } else if (this.f7296c != null) {
                        this.f7296c.onFailure("503.1", "req data null");
                    }
                } else {
                    ALog.m7600i(TaobaoRegister.TAG, "agoo aready Registered return ", new Object[0]);
                    boolean unused2 = TaobaoRegister.isRegisterSuccess = true;
                    C3180l.m7670a().mo37770b();
                    if (this.f7296c != null) {
                        this.f7296c.onSuccess(Config.m14278g(this.f7294a));
                    }
                }
            } else if (this.f7296c != null) {
                this.f7296c.onFailure(String.valueOf(i), "accs bindapp error!");
            }
        } catch (Throwable th) {
            ALog.m7598e(TaobaoRegister.TAG, "register onBindApp", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onBindUser(String str, int i) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onData(String str, String str2, byte[] bArr) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onSendData(String str, int i) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onUnbindApp(int i) {
    }

    @Override // com.taobao.accs.IAppReceiver
    public void onUnbindUser(int i) {
    }
}
