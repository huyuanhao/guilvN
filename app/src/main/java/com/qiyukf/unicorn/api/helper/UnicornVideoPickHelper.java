package com.qiyukf.unicorn.api.helper;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.session.activity.CaptureVideoActivity;
import com.qiyukf.nim.uikit.session.helper.C2016f;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.C2725a;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2550c;
import com.qiyukf.unicorn.p232k.C2709i;
import java.io.File;

public class UnicornVideoPickHelper {
    public UincornVideoSelectListener uincornVideoSelectListener;
    public C2016f videoMsgHelper;

    public interface UincornVideoSelectListener {
        void onVideoPicked(File file, String str);
    }

    public UnicornVideoPickHelper(Activity activity, final UincornVideoSelectListener uincornVideoSelectListener2) {
        this.uincornVideoSelectListener = uincornVideoSelectListener2;
        this.videoMsgHelper = new C2016f(activity, new C2016f.AbstractC2019a() {
            /* class com.qiyukf.unicorn.api.helper.UnicornVideoPickHelper.C24261 */

            @Override // com.qiyukf.nim.uikit.session.helper.C2016f.AbstractC2019a
            public void onVideoPicked(File file, String str) {
                if (UnicornVideoPickHelper.this.uincornVideoSelectListener != null) {
                    uincornVideoSelectListener2.onVideoPicked(file, str);
                }
            }
        });
    }

    public static void goVideoActivity(Fragment fragment, String str, int i) {
        CaptureVideoActivity.start(fragment, str, i);
    }

    public static void goVideoAlbumActivity(final Fragment fragment, final int i) {
        C2709i.m6264a(fragment).mo36469a(AbstractC2550c.f5124b).mo36468a(new C2709i.AbstractC2710a() {
            /* class com.qiyukf.unicorn.api.helper.UnicornVideoPickHelper.C24272 */

            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
            public final void onDenied() {
                C1865f.m3555a(C2364R.string.ysf_no_permission_photo);
            }

            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
            public final void onGranted() {
                C2725a.m6293a(fragment, EnumC2731b.m6309c(), 1, i);
            }
        }).mo36470a();
    }

    public static void onCaptureVideoResult(String str, UincornVideoSelectListener uincornVideoSelectListener2) {
        String b = C1852c.m3513b(str);
        String a = C2349d.m5123a(b + ".mp4", EnumC2347c.TYPE_VIDEO);
        if (!C1806a.m3413b(str, a)) {
            C1865f.m3559b(C2364R.string.ysf_video_exception);
        } else if (uincornVideoSelectListener2 != null) {
            uincornVideoSelectListener2.onVideoPicked(new File(a), b);
        }
    }

    public static void onSelectLocalVideoResult(String str, UincornVideoSelectListener uincornVideoSelectListener2) {
        String b = C1852c.m3513b(str);
        String a = C2349d.m5123a(b + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(str), EnumC2347c.TYPE_VIDEO);
        if (C1806a.m3408a(str, a) == -1) {
            C1865f.m3555a(C2364R.string.ysf_video_exception);
        } else if (uincornVideoSelectListener2 != null) {
            uincornVideoSelectListener2.onVideoPicked(new File(a), b);
        }
    }

    public void goCaptureVideo(int i) {
        C2016f fVar = this.videoMsgHelper;
        if (fVar != null) {
            fVar.mo34469a(i);
        }
    }

    public void goVideoAlbum(int i) {
        C2016f fVar = this.videoMsgHelper;
        if (fVar != null) {
            fVar.mo34471b(i);
        }
    }

    public void onCaptureVideoResult(Intent intent) {
        C2016f fVar;
        if (intent != null && (fVar = this.videoMsgHelper) != null) {
            fVar.mo34470a(intent);
        }
    }

    public void onSelectLocalVideoResult(Intent intent) {
        C2016f fVar;
        if (intent != null && (fVar = this.videoMsgHelper) != null) {
            fVar.mo34472b(intent);
        }
    }
}
