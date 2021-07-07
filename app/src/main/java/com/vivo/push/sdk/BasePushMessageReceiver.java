package com.vivo.push.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.vivo.push.C4121p;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4149s;
import java.util.List;

public abstract class BasePushMessageReceiver extends BroadcastReceiver implements PushMessageCallback {
    public static final String TAG = "PushMessageReceiver";

    @Override // com.vivo.push.sdk.PushMessageCallback
    public boolean isAllowNet(Context context) {
        if (context == null) {
            C4146p.m11204a(TAG, "isAllowNet sContext is null");
            return false;
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            C4146p.m11204a(TAG, "isAllowNet pkgName is null");
            return false;
        }
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(packageName);
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices != null && queryIntentServices.size() > 0) {
            return C4149s.m11224a(context, packageName);
        }
        C4146p.m11204a(TAG, "this is client sdk");
        return true;
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onBind(Context context, int i, String str) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onDelAlias(Context context, int i, List<String> list, List<String> list2, String str) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onDelTags(Context context, int i, List<String> list, List<String> list2, String str) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onListTags(Context context, int i, List<String> list, String str) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onLog(Context context, String str, int i, boolean z) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onPublish(Context context, int i, String str) {
    }

    public final void onReceive(Context context, Intent intent) {
        Context applicationContext = context.getApplicationContext();
        C4121p.m11080a().mo41093a(applicationContext);
        try {
            int intExtra = intent.getIntExtra(AbstractC7726o0ooOOoo.OooOOo0, -1);
            String stringExtra = intent.getStringExtra("req_id");
            C4146p.m11216d(TAG, "PushMessageReceiver " + applicationContext.getPackageName() + " ; type = " + intExtra + " ; requestId = " + stringExtra);
            try {
                C4121p.m11080a().mo41094a(intent, this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            C4146p.m11212b(TAG, "get method error", e2);
        }
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onSetAlias(Context context, int i, List<String> list, List<String> list2, String str) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onSetTags(Context context, int i, List<String> list, List<String> list2, String str) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onTransmissionMessage(Context context, UnvarnishedMessage unvarnishedMessage) {
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onUnBind(Context context, int i, String str) {
    }
}
