package com.umeng.message.inapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.PushAgent;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.inapp.UImageLoadTask;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.umeng.message.inapp.b */
public final class C3804b implements IUmengInAppMessageCallback, UImageLoadTask.ImageLoaderCallback {

    /* renamed from: a */
    public static final String f10266a = "com.umeng.message.inapp.b";

    /* renamed from: f */
    public static final int f10267f = 10;

    /* renamed from: b */
    public Context f10268b;

    /* renamed from: c */
    public String f10269c;

    /* renamed from: d */
    public boolean f10270d;

    /* renamed from: e */
    public UInAppMessage f10271e;

    /* renamed from: g */
    public IUmengInAppMsgCloseCallback f10272g;

    public C3804b(Activity activity, String str, IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback) {
        this.f10268b = activity;
        this.f10269c = str;
        this.f10272g = iUmengInAppMsgCloseCallback;
    }

    /* renamed from: a */
    private boolean m10448a(String str) {
        if (!UmengMessageDeviceConfig.getAppVersionCode(this.f10268b).equals(InAppMessageManager.getInstance(this.f10268b).mo39802g())) {
            InAppMessageManager.getInstance(this.f10268b).mo39796d("");
        }
        InAppMessageManager.getInstance(this.f10268b).mo39798e(UmengMessageDeviceConfig.getAppVersionCode(this.f10268b));
        String f = InAppMessageManager.getInstance(this.f10268b).mo39799f();
        JSONArray jSONArray = null;
        if (!TextUtils.isEmpty(f)) {
            try {
                jSONArray = new JSONArray(f);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (jSONArray == null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str);
            InAppMessageManager.getInstance(this.f10268b).mo39796d(jSONArray2.toString());
            return true;
        } else if (m10449a(jSONArray, str)) {
            return true;
        } else {
            if (jSONArray.length() >= 10) {
                return false;
            }
            jSONArray.put(str);
            InAppMessageManager.getInstance(this.f10268b).mo39796d(jSONArray.toString());
            return true;
        }
    }

    /* renamed from: b */
    private void m10450b() {
        try {
            UmengCardMessage umengCardMessage = new UmengCardMessage();
            umengCardMessage.mo39825a(this.f10272g);
            Bundle bundle = new Bundle();
            bundle.putString("label", this.f10269c);
            bundle.putString("msg", this.f10271e.getRaw().toString());
            umengCardMessage.setArguments(bundle);
            umengCardMessage.show(((Activity) this.f10268b).getFragmentManager(), this.f10269c);
            InAppMessageManager.getInstance(this.f10268b).mo39787a(this.f10271e.msg_id, 1);
            InAppMessageManager.getInstance(this.f10268b).mo39800f(this.f10269c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024 A[ADDED_TO_REGION] */
    @Override // com.umeng.message.inapp.IUmengInAppMessageCallback
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCardMessage(com.umeng.message.entity.UInAppMessage r5) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.C3804b.onCardMessage(com.umeng.message.entity.UInAppMessage):void");
    }

    @Override // com.umeng.message.inapp.UImageLoadTask.ImageLoaderCallback
    public void onLoadImage(Bitmap[] bitmapArr) {
        if (!this.f10270d) {
            m10447a(bitmapArr[0]);
        }
        InAppMessageManager.getInstance(this.f10268b).mo39784a(this.f10271e, this.f10269c);
    }

    @Override // com.umeng.message.inapp.IUmengInAppMessageCallback
    public void onSplashMessage(UInAppMessage uInAppMessage) {
    }

    public C3804b(Context context, String str) {
        this.f10268b = context.getApplicationContext();
        this.f10269c = str;
        this.f10270d = true;
    }

    /* renamed from: b */
    private boolean m10451b(String str) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(InAppMessageManager.getInstance(this.f10268b).mo39801g(str));
        Calendar instance2 = Calendar.getInstance();
        if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m10449a(JSONArray jSONArray, String str) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (jSONArray.getString(i).equals(str)) {
                    return true;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo39856a() {
        if (TextUtils.isEmpty(this.f10269c.trim())) {
            if (PushAgent.DEBUG) {
                Toast.makeText(this.f10268b, "插屏消息的标签不能为空", 1).show();
            }
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10266a, 0, "插屏消息的标签不能为空");
        } else if (!m10448a(this.f10269c)) {
            UMLog uMLog2 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10266a, 0, "插屏消息的最大标签数为 10");
        } else if (InAppMessageManager.f10168a) {
            C3807d.m10462a(this.f10268b).mo39864a(this.f10269c, this);
        } else if (System.currentTimeMillis() - InAppMessageManager.getInstance(this.f10268b).mo39789b(this.f10269c) > ((long) InAppMessageManager.f10169b)) {
            C3807d.m10462a(this.f10268b).mo39864a(this.f10269c, this);
        } else {
            onCardMessage(null);
        }
    }

    /* renamed from: a */
    private void m10447a(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                UmengCardMessage umengCardMessage = new UmengCardMessage();
                umengCardMessage.mo39825a(this.f10272g);
                Bundle bundle = new Bundle();
                bundle.putString("label", this.f10269c);
                bundle.putString("msg", this.f10271e.getRaw().toString());
                bundle.putByteArray("bitmapByte", byteArray);
                umengCardMessage.setArguments(bundle);
                umengCardMessage.show(((Activity) this.f10268b).getFragmentManager(), this.f10269c);
                InAppMessageManager.getInstance(this.f10268b).mo39787a(this.f10271e.msg_id, 1);
                InAppMessageManager.getInstance(this.f10268b).mo39800f(this.f10269c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
