package com.qiyukf.nim.uikit.session.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.nim.uikit.common.media.picker.activity.PickerAlbumActivity;
import com.qiyukf.nim.uikit.provider.UnicornProvider;
import com.qiyukf.unicorn.C2364R;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import s.h.e.l.l.C;

public class PickImageActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public boolean f3759b = false;

    static {
        C.i(50331748);
    }

    /* renamed from: a */
    public static void m3793a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public static native void start(Activity activity, int i, int i2, String str);

    public static native void start(Activity activity, int i, int i2, String str, boolean z, int i3, boolean z2, boolean z3, int i4, int i5);

    public static native void start(Fragment fragment, int i, int i2, String str);

    public static native void start(Fragment fragment, int i, int i2, String str, boolean z, int i3, boolean z2, boolean z3, int i4, int i5);

    @Override // androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            setResult(i2);
        } else if (i != 1) {
            if (i == 2) {
                try {
                    String stringExtra = getIntent().getStringExtra("file_path");
                    if (intent != null) {
                        if (intent.getData() != null) {
                            Uri data = intent.getData();
                            Cursor query = getContentResolver().query(data, null, null, null, null);
                            if (query != null) {
                                if (data.toString().contains("content://com.android.providers.media.documents/document/image")) {
                                    String decode = Uri.decode(data.toString());
                                    String substring = decode.substring(decode.lastIndexOf(Constants.COLON_SEPARATOR) + 1);
                                    m3793a(query);
                                    ContentResolver contentResolver = getContentResolver();
                                    Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                    query = contentResolver.query(uri, null, " _id = " + substring, null, null);
                                }
                                if (query != null) {
                                    query.moveToFirst();
                                    int columnIndex = query.getColumnIndex("_data");
                                    if (columnIndex >= 0) {
                                        stringExtra = query.getString(columnIndex);
                                    }
                                    m3793a(query);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(stringExtra)) {
                        Intent intent2 = new Intent();
                        intent2.putExtra("from_local", false);
                        intent2.putExtra("file_path", stringExtra);
                        setResult(-1, intent2);
                    }
                    finish();
                    return;
                } catch (Exception e) {
                    C1865f.m3559b(C2364R.string.ysf_picker_image_error);
                    C1709a.m3015b("onPickedCamera is error", "", e);
                    finish();
                    return;
                }
            } else {
                return;
            }
        } else if (intent != null) {
            try {
                Intent intent3 = new Intent(intent);
                intent3.putExtra("from_local", true);
                setResult(-1, intent3);
                finish();
                return;
            } catch (Exception e2) {
                C1865f.m3559b(C2364R.string.ysf_picker_image_error);
                C1709a.m3015b("onPickedLocal is error", "", e2);
            }
        } else {
            return;
        }
        finish();
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);

    public native void onRestoreInstanceState(Bundle bundle);

    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        Throwable e;
        super.onResume();
        if (!this.f3759b) {
            if (getIntent().getIntExtra("from", 1) == 1) {
                try {
                    boolean booleanExtra = getIntent().getBooleanExtra("multi_select_mode", false);
                    int intExtra = getIntent().getIntExtra("multi_select_size_limit", 9);
                    boolean booleanExtra2 = getIntent().getBooleanExtra("support_original", false);
                    Intent intent = new Intent();
                    intent.setClass(this, PickerAlbumActivity.class);
                    intent.putExtra("multi_select_mode", booleanExtra);
                    intent.putExtra("multi_select_size_limit", intExtra);
                    intent.putExtra("support_original", booleanExtra2);
                    startActivityForResult(intent, 1);
                } catch (Exception e2) {
                    C1709a.m3015b("pickFromLocal is error", "", e2);
                    C1865f.m3559b(C2364R.string.ysf_picker_image_sdcard_not_enough_error);
                    finish();
                }
            } else {
                try {
                    String stringExtra = getIntent().getStringExtra("file_path");
                    if (TextUtils.isEmpty(stringExtra)) {
                        C1865f.m3559b(C2364R.string.ysf_picker_image_sdcard_not_enough_error);
                        finish();
                    } else {
                        File file = new File(stringExtra);
                        Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                        intent2.addFlags(1);
                        intent2.putExtra("output", UnicornProvider.m3772b(this) ? UnicornProvider.m3770a(this, file) : Uri.fromFile(file));
                        startActivityForResult(intent2, 2);
                    }
                } catch (ActivityNotFoundException e3) {
                    e = e3;
                    finish();
                    C1709a.m3015b("pickFromCamera is error", "", e);
                    this.f3759b = true;
                } catch (Exception e4) {
                    e = e4;
                    C1865f.m3559b(C2364R.string.ysf_picker_image_sdcard_not_enough_error);
                    C1709a.m3015b("pickFromCamera is error", "", e);
                    this.f3759b = true;
                }
            }
            this.f3759b = true;
        }
    }

    @Override // androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onSaveInstanceState(Bundle bundle);
}
