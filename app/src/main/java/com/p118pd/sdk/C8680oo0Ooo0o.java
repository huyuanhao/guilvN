package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.facebook.imagepipeline.producers.ProducerConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.jinhui365.p088rn.C1418R;
import com.jinhui365.p088rn.photo.IDCardTakePhotoActivity;
import com.jinhui365.util.fileUtil.DiskFileUtil;
import com.jinhui365.util.permission.OnBasePermissionGrantedListener;
import com.jinhui365.util.permission.PermissionManager;
import java.io.File;
import java.io.IOException;

/* renamed from: com.pd.sdk.oo0Ooo0o  reason: case insensitive filesystem */
public class C8680oo0Ooo0o {
    public static final int OooO00o = 1;

    /* renamed from: com.pd.sdk.oo0Ooo0o$OooO00o */
    public static class OooO00o extends OnBasePermissionGrantedListener {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Activity f21835OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ boolean f21836OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, Activity activity, int i, boolean z) {
            super(context);
            this.f21835OooO00o = activity;
            this.OooO00o = i;
            this.f21836OooO00o = z;
        }

        @Override // com.jinhui365.util.permission.OnBasePermissionGrantedListener
        public void onGranted() {
            if (this.f21835OooO00o.getPackageManager().hasSystemFeature("android.hardware.camera")) {
                Intent intent = new Intent(this.f21835OooO00o, IDCardTakePhotoActivity.class);
                intent.putExtra(IDCardTakePhotoActivity.o0ooOoO, this.OooO00o);
                intent.putExtra(IDCardTakePhotoActivity.o0OOO0o, this.f21836OooO00o);
                this.f21835OooO00o.startActivityForResult(intent, C8684oo0Oooo.OooO0O0);
                return;
            }
            Activity activity = this.f21835OooO00o;
            Toast.makeText(activity, activity.getResources().getString(C1418R.string.auth_identifyGuide_takePhoto_tip), 0).show();
        }
    }

    public static WritableMap OooO00o(Activity activity, String str, boolean z) {
        WritableMap createMap = Arguments.createMap();
        if (C8741oo0oOo0.OooO0Oo(str)) {
            if (z) {
                str = C8736oo0oOOOo.OooO00o(str, DiskFileUtil.OooO0OO(activity, Environment.DIRECTORY_DCIM).getAbsolutePath());
            }
            String substring = str.substring(str.lastIndexOf(C9058ooOoOoOO.OooOO0));
            try {
                createMap.putString("imageData", C8736oo0oOOOo.m20352OooO00o(C8736oo0oOOOo.OooO00o(activity, OooO00o(activity, str)), 100));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            createMap.putString("imageUrl", str);
            createMap.putString("imageName", str.substring(str.lastIndexOf(C8932ooOOO0o.OooO0OO)).replace(C8932ooOOO0o.OooO0OO, ""));
            createMap.putString(ProducerConstants.EXTRA_IMAGE_TYPE, substring);
        }
        return createMap;
    }

    public static String OooO00o(Activity activity, int i) {
        Uri uri;
        File file = new File(DiskFileUtil.OooO0o(activity, C8646oo0OOoO.OooO00o).getAbsolutePath() + "/image", System.currentTimeMillis() + ".jpg");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (Build.VERSION.SDK_INT >= 24) {
            uri = FileProvider.getUriForFile(activity, C8742oo0oOo00.m20371OooO0O0((Context) activity) + ".RNSupportFileProvider", file);
            intent.putExtra("android.intent.extra.videoQuality", 1);
            intent.addFlags(3);
        } else {
            uri = Uri.fromFile(file);
        }
        intent.putExtra("android.intent.extras.CAMERA_FACING", i);
        intent.setAction("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uri);
        activity.startActivityForResult(intent, C8684oo0Oooo.OooO00o, null);
        return file.getPath();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20295OooO00o(Activity activity, int i) {
        OooO00o(activity, i, true);
    }

    public static void OooO00o(Activity activity, int i, boolean z) {
        PermissionManager.OooO00o(activity).OooO00o(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, new OooO00o(activity, activity, i, z));
    }

    public static Uri OooO00o(Activity activity, String str) {
        File file = new File(str);
        if (Build.VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        return FileProvider.getUriForFile(activity, C8742oo0oOo00.m20371OooO0O0((Context) activity) + ".RNSupportFileProvider", file);
    }
}
