package com.jinhui365.util.permission;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.jinhui365.util.permission.PermissionActivity;
import com.p118pd.sdk.C6989o000O0oO;
import com.p118pd.sdk.C7009o000OoOo;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.List;

@Keep
public class PermissionManager {
    public static final String OooO00o = "PermissionManager";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f15009OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PermissionActivity.OooO00o f15010OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f15011OooO00o;

    public class OooO00o implements PermissionActivity.OooO00o {
        public OooO00o() {
        }

        @Override // com.jinhui365.util.permission.PermissionActivity.OooO00o
        public void OooO00o(@NonNull String[] strArr, @NonNull int[] iArr) {
            if (iArr.length > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < strArr.length; i++) {
                    if (!PermissionManager.OooO00o(PermissionManager.this.f15009OooO00o, strArr[i])) {
                        arrayList.add(strArr[i]);
                        String str = "no granted permission:" + strArr[i];
                    }
                }
                if (PermissionManager.this.f15011OooO00o == null) {
                    return;
                }
                if (arrayList.size() == 0) {
                    PermissionManager.this.f15011OooO00o.onNext();
                } else {
                    PermissionManager.this.f15011OooO00o.onFail(arrayList);
                }
            }
        }
    }

    public interface OooO0O0 {
        void onFail(List<String> list);

        void onNext();
    }

    public PermissionManager(Context context) {
        this.f15009OooO00o = context;
    }

    public static PermissionManager OooO00o(Context context) {
        return new PermissionManager(context);
    }

    public void OooO00o(String[] strArr, OooO0O0 oooO0O0) {
        this.f15011OooO00o = oooO0O0;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 23) {
            for (int i = 0; i < strArr.length; i++) {
                if (!OooO00o(this.f15009OooO00o, strArr[i])) {
                    arrayList.add(strArr[i]);
                }
            }
            if (arrayList.size() > 0) {
                String[] strArr2 = new String[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    strArr2[i2] = (String) arrayList.get(i2);
                }
                PermissionActivity.OooO00o(this.f15010OooO00o);
                Intent intent = new Intent(this.f15009OooO00o, PermissionActivity.class);
                intent.putExtra(PermissionActivity.o0ooOOo, strArr2);
                intent.setFlags(CommonNetImpl.FLAG_AUTH);
                this.f15009OooO00o.startActivity(intent);
            } else if (oooO0O0 != null) {
                oooO0O0.onNext();
            }
        } else if (oooO0O0 != null) {
            oooO0O0.onNext();
        }
    }

    public static boolean OooO00o(Context context, String str) {
        String OooO00o2 = C6989o000O0oO.OooO00o(str);
        if (TextUtils.isEmpty(OooO00o2)) {
            return true;
        }
        if (C6989o000O0oO.OooO00o(context, OooO00o2, context.getPackageName()) != 1 && C7009o000OoOo.OooO00o(context, str) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static String OooO00o(String str) {
        char c;
        switch (str.hashCode()) {
            case -2062386608:
                if (str.equals("android.permission.READ_SMS")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1928411001:
                if (str.equals("android.permission.READ_CALENDAR")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -406040016:
                if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 463403621:
                if (str.equals("android.permission.CAMERA")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 603653886:
                if (str.equals("android.permission.WRITE_CALENDAR")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1365911975:
                if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1831139720:
                if (str.equals("android.permission.RECORD_AUDIO")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return "相机";
            case 1:
            case 2:
                return "存储";
            case 3:
                return "短信";
            case 4:
                return "录音";
            case 5:
            case 6:
                return "日历";
            default:
                return "";
        }
    }
}
