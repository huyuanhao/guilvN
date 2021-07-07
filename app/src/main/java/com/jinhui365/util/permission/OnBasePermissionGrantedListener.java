package com.jinhui365.util.permission;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Keep;
import com.jinhui365.util.C1427R;
import com.jinhui365.util.dialog.AlertDialog;
import com.jinhui365.util.permission.PermissionManager;
import com.p118pd.sdk.C8741oo0oOo0;
import com.p118pd.sdk.C8742oo0oOo00;
import java.util.List;

@Keep
public abstract class OnBasePermissionGrantedListener implements PermissionManager.OooO0O0 {
    public static final String TAG = "PermissionListener";
    public String failPermissionsName;
    public Context mContext;

    public class OooO00o implements View.OnClickListener {
        public final /* synthetic */ AlertDialog OooO00o;

        public OooO00o(AlertDialog alertDialog) {
            this.OooO00o = alertDialog;
        }

        public void onClick(View view) {
            this.OooO00o.m15121OooO00o();
            OnBasePermissionGrantedListener.this.getAppDetailSettingIntent();
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public final /* synthetic */ AlertDialog OooO00o;

        public OooO0O0(AlertDialog alertDialog) {
            this.OooO00o = alertDialog;
        }

        public void onClick(View view) {
            this.OooO00o.m15121OooO00o();
        }
    }

    public OnBasePermissionGrantedListener(Context context) {
        this.mContext = context;
    }

    public void getAppDetailSettingIntent() {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + this.mContext.getPackageName()));
            this.mContext.startActivity(intent);
        } catch (Exception e) {
            String str = getClass().getSimpleName() + e.getLocalizedMessage();
        }
    }

    public String getFailPermissionsName() {
        return this.failPermissionsName;
    }

    @Override // com.jinhui365.util.permission.PermissionManager.OooO0O0
    public void onFail(List<String> list) {
        this.failPermissionsName = "";
        for (int i = 0; i < list.size(); i++) {
            if (C8741oo0oOo0.OooO0OO(this.failPermissionsName)) {
                this.failPermissionsName += PermissionManager.OooO00o(list.get(i));
            } else {
                this.failPermissionsName += "、" + PermissionManager.OooO00o(list.get(i));
            }
        }
        showPermissionDialog();
    }

    public abstract void onGranted();

    @Override // com.jinhui365.util.permission.PermissionManager.OooO0O0
    public void onNext() {
        onGranted();
    }

    public void showPermissionDialog() {
        AlertDialog alertDialog = new AlertDialog(this.mContext);
        alertDialog.OooO0OO("权限提示");
        alertDialog.OooO00o(String.format(this.mContext.getString(C1427R.string.permission_tip), C8742oo0oOo00.m20364OooO00o(this.mContext), getFailPermissionsName()));
        alertDialog.OooO0O0("设置", new OooO00o(alertDialog));
        alertDialog.OooO00o("取消", new OooO0O0(alertDialog));
    }
}
