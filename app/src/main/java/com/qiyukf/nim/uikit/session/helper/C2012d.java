package com.qiyukf.nim.uikit.session.helper;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.basesdk.p138c.p143d.C1863d;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.media.picker.activity.PreviewImageFromCameraActivity;
import com.qiyukf.nim.uikit.common.media.picker.model.C1915b;
import com.qiyukf.nim.uikit.common.media.picker.model.PhotoInfo;
import com.qiyukf.nim.uikit.session.activity.PickImageActivity;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.p198j.p200b.C2342b;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.unicorn.C2364R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.session.helper.d */
public final class C2012d implements Serializable {

    /* renamed from: com.qiyukf.nim.uikit.session.helper.d$a */
    public interface AbstractC2013a {
        void sendImage(File file, String str, boolean z);
    }

    /* renamed from: com.qiyukf.nim.uikit.session.helper.d$b */
    public static class AsyncTaskC2014b extends AsyncTask<Void, Void, File> {

        /* renamed from: a */
        public boolean f3967a;

        /* renamed from: b */
        public PhotoInfo f3968b;

        /* renamed from: c */
        public AbstractC2013a f3969c;

        public AsyncTaskC2014b(boolean z, PhotoInfo photoInfo, AbstractC2013a aVar) {
            this.f3967a = z;
            this.f3968b = photoInfo;
            this.f3969c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        @Override // android.os.AsyncTask
        public final /* synthetic */ File doInBackground(Void[] voidArr) {
            String absolutePath = this.f3968b.getAbsolutePath();
            if (TextUtils.isEmpty(absolutePath)) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.f3968b.getUri() == null) {
                    return null;
                }
                if (this.f3967a) {
                    String a = C1852c.m3510a(C2180b.m4471a(), this.f3968b.getUri());
                    String a2 = C2349d.m5123a(a + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(absolutePath), EnumC2347c.TYPE_IMAGE);
                    if (C1806a.m3410a(C2180b.m4471a(), this.f3968b.getUri(), a2)) {
                        C2342b.m5101a(new File(a2));
                        return new File(a2);
                    }
                } else {
                    String a3 = C1852c.m3510a(C2180b.m4471a(), this.f3968b.getUri());
                    String a4 = C2349d.m5123a(a3 + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(absolutePath), EnumC2347c.TYPE_IMAGE);
                    if (C1806a.m3410a(C2180b.m4471a(), this.f3968b.getUri(), a4)) {
                        File a5 = C2342b.m5098a(new File(a4), C1807b.m3416a(absolutePath));
                        if (a5 == null) {
                            return null;
                        }
                        C2342b.m5101a(a5);
                        return a5;
                    }
                }
                C1865f.m3555a(C2364R.string.ysf_copy_file_exception);
                return null;
            } else if (this.f3967a) {
                String b = C1852c.m3513b(absolutePath);
                String a6 = C1807b.m3416a(absolutePath);
                String a7 = C2349d.m5123a(b + C9058ooOoOoOO.OooOO0 + a6, EnumC2347c.TYPE_IMAGE);
                C1806a.m3408a(absolutePath, a7);
                C2342b.m5101a(new File(a7));
                return new File(a7);
            } else {
                File a8 = C2342b.m5098a(new File(absolutePath), C1807b.m3416a(absolutePath));
                if (a8 == null) {
                    return null;
                }
                C2342b.m5101a(a8);
                return a8;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(File file) {
            File file2 = file;
            if (file2 == null) {
                C1865f.m3559b(C2364R.string.ysf_picker_image_error);
            } else if (this.f3969c != null) {
                this.f3969c.sendImage(file2, C1807b.m3417b(this.f3968b.getAbsolutePath()), this.f3967a);
            }
        }

        public final void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: a */
    public static void m3995a(Activity activity, Intent intent, int i, AbstractC2013a aVar) {
        if (intent.getBooleanExtra("RESULT_SEND", false)) {
            m3996a(intent, aVar);
        } else if (intent.getBooleanExtra("RESULT_RETAKE", false)) {
            PickImageActivity.start(activity, i, 6, C2349d.m5123a(C1853d.m3518b() + ".jpg", EnumC2347c.TYPE_TEMP));
        }
    }

    /* renamed from: a */
    public static void m3996a(Intent intent, AbstractC2013a aVar) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("scaled_image_list");
        ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("orig_image_list");
        boolean booleanExtra = intent.getBooleanExtra("is_original", false);
        for (int i = 0; i < stringArrayListExtra.size(); i++) {
            String str = stringArrayListExtra.get(i);
            File file = new File(str);
            String str2 = stringArrayListExtra2.get(i);
            if (booleanExtra) {
                String b = C1852c.m3513b(str2);
                String a = C1807b.m3416a(str2);
                String a2 = C2349d.m5123a(b + C9058ooOoOoOO.OooOO0 + a, EnumC2347c.TYPE_IMAGE);
                C1806a.m3408a(str2, a2);
                String b2 = C2349d.m5131b(C1807b.m3417b(str), EnumC2347c.TYPE_THUMB_IMAGE);
                C1806a.m3413b(b2, C2349d.m5123a(b + C9058ooOoOoOO.OooOO0 + a, EnumC2347c.TYPE_THUMB_IMAGE));
                if (aVar != null) {
                    File file2 = new File(a2);
                    aVar.sendImage(file2, file2.getName(), true);
                }
            } else if (aVar != null) {
                aVar.sendImage(file, file.getName(), false);
            }
        }
    }

    /* renamed from: a */
    public static void m3997a(Fragment fragment, Intent intent, int i, int i2, AbstractC2013a aVar) {
        if (intent.getBooleanExtra("RESULT_SEND", false)) {
            m3996a(intent, aVar);
        } else if (intent.getBooleanExtra("RESULT_RETAKE", false)) {
            String a = C2349d.m5123a(C1853d.m3518b() + ".jpg", EnumC2347c.TYPE_TEMP);
            if (i == 6) {
                PickImageActivity.start(fragment, i2, 2, a);
            }
        }
    }

    /* renamed from: a */
    public static void m3998a(Fragment fragment, Intent intent, int i, AbstractC2013a aVar) {
        if (intent == null) {
            C1865f.m3559b(C2364R.string.ysf_picker_image_error);
        } else if (intent.getBooleanExtra("from_local", false)) {
            m4001b(intent, aVar);
        } else {
            Intent intent2 = new Intent();
            if (m3999a(intent2, intent)) {
                intent2.setClass(fragment.getContext(), PreviewImageFromCameraActivity.class);
                fragment.startActivityForResult(intent2, i);
            }
        }
    }

    /* renamed from: a */
    public static boolean m3999a(Intent intent, Intent intent2) {
        String stringExtra = intent2.getStringExtra("file_path");
        if (!TextUtils.isEmpty(stringExtra)) {
            File file = new File(stringExtra);
            intent.putExtra("orig_image_file_path", stringExtra);
            File a = C2342b.m5098a(file, "image/jpeg");
            if (!intent2.getExtras().getBoolean("from_local", true)) {
                C1806a.m3412b(stringExtra);
            }
            if (a != null) {
                C2342b.m5101a(a);
                intent.putExtra("image_file_path", a.getAbsolutePath());
                return true;
            }
        }
        C1865f.m3559b(C2364R.string.ysf_picker_image_error);
        return false;
    }

    /* renamed from: b */
    public static void m4000b(Activity activity, Intent intent, int i, AbstractC2013a aVar) {
        if (intent == null) {
            C1865f.m3559b(C2364R.string.ysf_picker_image_error);
        } else if (intent.getBooleanExtra("from_local", false)) {
            m4001b(intent, aVar);
        } else {
            Intent intent2 = new Intent();
            if (m3999a(intent2, intent)) {
                intent2.setClass(activity, PreviewImageFromCameraActivity.class);
                activity.startActivityForResult(intent2, i);
            }
        }
    }

    /* renamed from: b */
    public static void m4001b(Intent intent, AbstractC2013a aVar) {
        boolean booleanExtra = intent.getBooleanExtra("is_original", false);
        List<PhotoInfo> a = C1915b.m3690a(intent);
        if (a == null) {
            C1865f.m3559b(C2364R.string.ysf_picker_image_error);
            return;
        }
        for (PhotoInfo photoInfo : a) {
            C1863d.m3548a(new AsyncTaskC2014b(booleanExtra, photoInfo, aVar), new Void[0]);
        }
    }
}
