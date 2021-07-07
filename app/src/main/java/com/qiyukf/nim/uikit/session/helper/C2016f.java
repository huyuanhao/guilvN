package com.qiyukf.nim.uikit.session.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.session.activity.CaptureVideoActivity;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.C2725a;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2550c;
import com.qiyukf.unicorn.p232k.C2709i;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.qiyukf.nim.uikit.session.helper.f */
public final class C2016f {

    /* renamed from: a */
    public File f3970a;

    /* renamed from: b */
    public String f3971b;

    /* renamed from: c */
    public Fragment f3972c;

    /* renamed from: d */
    public Activity f3973d;

    /* renamed from: e */
    public AbstractC2019a f3974e;

    /* renamed from: f */
    public int f3975f;

    /* renamed from: g */
    public int f3976g;

    /* renamed from: com.qiyukf.nim.uikit.session.helper.f$a */
    public interface AbstractC2019a {
        void onVideoPicked(File file, String str);
    }

    public C2016f(Activity activity, AbstractC2019a aVar) {
        this.f3973d = activity;
        this.f3974e = aVar;
    }

    public C2016f(Fragment fragment, AbstractC2019a aVar) {
        this.f3972c = fragment;
        this.f3974e = aVar;
    }

    /* renamed from: a */
    public final void mo34469a(int i) {
        C2709i iVar;
        this.f3976g = i;
        Fragment fragment = this.f3972c;
        if (fragment != null) {
            iVar = C2709i.m6264a(fragment);
        } else {
            Activity activity = this.f3973d;
            iVar = activity != null ? C2709i.m6263a(activity) : null;
        }
        if (iVar != null) {
            iVar.mo36469a(AbstractC2550c.f5125c).mo36468a(new C2709i.AbstractC2710a() {
                /* class com.qiyukf.nim.uikit.session.helper.C2016f.C20171 */

                @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                public final void onDenied() {
                    C1865f.m3555a(C2364R.string.ysf_no_permission_video);
                }

                @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                public final void onGranted() {
                    if (C2349d.m5128a(EnumC2347c.TYPE_VIDEO)) {
                        C2016f.this.f3971b = C2349d.m5123a(C1853d.m3514a() + ".mp4", EnumC2347c.TYPE_TEMP);
                        if (C2016f.this.f3971b == null) {
                            String str = "videoFilePath = " + C2016f.this.f3971b + "this is ";
                            return;
                        }
                        C2016f.this.f3970a = new File(C2016f.this.f3971b);
                        if (C2016f.this.f3972c != null) {
                            CaptureVideoActivity.start(C2016f.this.f3972c, C2016f.this.f3971b, C2016f.this.f3976g);
                        } else if (C2016f.this.f3973d != null) {
                            CaptureVideoActivity.start(C2016f.this.f3973d, C2016f.this.f3971b, C2016f.this.f3976g);
                        }
                    }
                }
            }).mo36470a();
        }
    }

    /* renamed from: a */
    public final void mo34470a(Intent intent) {
        ArrayList<String> stringArrayListExtra;
        AbstractC2019a aVar;
        if (intent != null) {
            if (intent.getIntExtra("SELECT_VIDEO_TYPE_TAG", 0) == 0) {
                File file = this.f3970a;
                if (file == null || !file.exists()) {
                    String stringExtra = intent.getStringExtra("EXTRA_DATA_FILE_NAME");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        this.f3970a = new File(stringExtra);
                    }
                }
                File file2 = this.f3970a;
                if (file2 != null && file2.exists()) {
                    if (this.f3970a.length() <= 0) {
                        this.f3970a.delete();
                        return;
                    }
                    String path = this.f3970a.getPath();
                    String b = C1852c.m3513b(intent.getStringExtra("EXTRA_DATA_FILE_NAME"));
                    String a = C2349d.m5123a(b + ".mp4", EnumC2347c.TYPE_VIDEO);
                    if (C1806a.m3413b(path, a) && (aVar = this.f3974e) != null) {
                        aVar.onVideoPicked(new File(a), b);
                    }
                }
            } else if (intent != null && (stringArrayListExtra = intent.getStringArrayListExtra("EXTRA_DATA_VIDEO_PATH")) != null && stringArrayListExtra.size() != 0 && !TextUtils.isEmpty(stringArrayListExtra.get(0))) {
                String b2 = C1852c.m3513b(stringArrayListExtra.get(0));
                String a2 = C2349d.m5123a(b2 + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(stringArrayListExtra.get(0)), EnumC2347c.TYPE_VIDEO);
                if (C1806a.m3408a(stringArrayListExtra.get(0), a2) != -1) {
                    AbstractC2019a aVar2 = this.f3974e;
                    if (aVar2 != null) {
                        aVar2.onVideoPicked(new File(a2), b2);
                        return;
                    }
                    return;
                }
                C1865f.m3555a(C2364R.string.ysf_video_exception);
            }
        }
    }

    /* renamed from: b */
    public final void mo34471b(int i) {
        C2709i iVar;
        this.f3975f = i;
        Fragment fragment = this.f3972c;
        if (fragment != null) {
            iVar = C2709i.m6264a(fragment);
        } else {
            Activity activity = this.f3973d;
            iVar = activity != null ? C2709i.m6263a(activity) : null;
        }
        if (iVar != null) {
            iVar.mo36469a(AbstractC2550c.f5124b).mo36468a(new C2709i.AbstractC2710a() {
                /* class com.qiyukf.nim.uikit.session.helper.C2016f.C20182 */

                @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                public final void onDenied() {
                    C1865f.m3555a(C2364R.string.ysf_no_permission_photo);
                }

                @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                public final void onGranted() {
                    if (C2016f.this.f3972c != null) {
                        C2725a.m6293a(C2016f.this.f3972c, EnumC2731b.m6309c(), 1, C2016f.this.f3975f);
                    } else if (C2016f.this.f3973d != null) {
                        C2725a.m6292a(C2016f.this.f3973d, EnumC2731b.m6309c(), 1, C2016f.this.f3975f);
                    }
                }
            }).mo36470a();
        }
    }

    /* renamed from: b */
    public final void mo34472b(Intent intent) {
        ArrayList<String> stringArrayListExtra;
        Fragment fragment = this.f3972c;
        Context context = fragment == null ? this.f3973d : fragment.getContext();
        if (intent != null && context != null && (stringArrayListExtra = intent.getStringArrayListExtra("extra_result_selection_path")) != null && stringArrayListExtra.size() != 0 && !TextUtils.isEmpty(stringArrayListExtra.get(0))) {
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
                if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() != 0 && parcelableArrayListExtra.get(0) != null) {
                    String a = C1852c.m3510a(context, (Uri) parcelableArrayListExtra.get(0));
                    String a2 = C2349d.m5123a(a + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(stringArrayListExtra.get(0)), EnumC2347c.TYPE_VIDEO);
                    if (C1806a.m3410a(context, (Uri) parcelableArrayListExtra.get(0), a2)) {
                        AbstractC2019a aVar = this.f3974e;
                        if (aVar != null) {
                            aVar.onVideoPicked(new File(a2), a);
                            return;
                        }
                        return;
                    }
                    C1865f.m3555a(C2364R.string.ysf_video_exception);
                    return;
                }
                return;
            }
            String b = C1852c.m3513b(stringArrayListExtra.get(0));
            String a3 = C2349d.m5123a(b + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(stringArrayListExtra.get(0)), EnumC2347c.TYPE_VIDEO);
            if (C1806a.m3408a(stringArrayListExtra.get(0), a3) != -1) {
                AbstractC2019a aVar2 = this.f3974e;
                if (aVar2 != null) {
                    aVar2.onVideoPicked(new File(a3), b);
                    return;
                }
                return;
            }
            C1865f.m3555a(C2364R.string.ysf_video_exception);
        }
    }
}
