package com.qiyukf.nim.uikit.session.helper;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.fragment.TFragment;
import com.qiyukf.nim.uikit.session.activity.CaptureVideoActivity;
import com.qiyukf.nim.uikit.session.activity.PickImageActivity;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.C2725a;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2550c;
import com.qiyukf.unicorn.p232k.C2706g;
import com.qiyukf.unicorn.p232k.C2709i;
import com.qiyukf.unicorn.widget.p251a.C3021g;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.qiyukf.nim.uikit.session.helper.c */
public final class C2005c {

    /* renamed from: a */
    public static String f3957a;

    /* renamed from: b */
    public static File f3958b;

    /* renamed from: com.qiyukf.nim.uikit.session.helper.c$a */
    public interface AbstractC2011a {
        /* renamed from: a */
        void mo34465a(File file);
    }

    /* renamed from: a */
    public static void m3990a(Intent intent, AbstractC2011a aVar) {
        ArrayList<String> stringArrayListExtra;
        if (intent.getIntExtra("SELECT_VIDEO_TYPE_TAG", 0) == 0) {
            File file = f3958b;
            if (file == null || !file.exists()) {
                String stringExtra = intent.getStringExtra("EXTRA_DATA_FILE_NAME");
                if (!TextUtils.isEmpty(stringExtra)) {
                    f3958b = new File(stringExtra);
                }
            }
            File file2 = f3958b;
            if (file2 != null && file2.exists()) {
                if (f3958b.length() <= 0) {
                    f3958b.delete();
                    return;
                }
                String path = f3958b.getPath();
                String b = C1852c.m3513b(path);
                String a = C2349d.m5123a(b + ".mp4", EnumC2347c.TYPE_VIDEO);
                if (C1806a.m3413b(path, a) && aVar != null) {
                    aVar.mo34465a(new File(a));
                }
            }
        } else if (intent != null && (stringArrayListExtra = intent.getStringArrayListExtra("EXTRA_DATA_VIDEO_PATH")) != null && stringArrayListExtra.size() != 0 && !TextUtils.isEmpty(stringArrayListExtra.get(0))) {
            String b2 = C1852c.m3513b(stringArrayListExtra.get(0));
            String a2 = C2349d.m5123a(b2 + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(stringArrayListExtra.get(0)), EnumC2347c.TYPE_VIDEO);
            if (C1806a.m3408a(stringArrayListExtra.get(0), a2) == -1) {
                C1865f.m3555a(C2364R.string.ysf_video_exception);
            } else if (aVar != null) {
                aVar.mo34465a(new File(a2));
            }
        }
    }

    /* renamed from: a */
    public static void m3991a(TFragment tFragment) {
        if (C2349d.m5128a(EnumC2347c.TYPE_VIDEO)) {
            String a = C2349d.m5123a(C1853d.m3514a() + ".mp4", EnumC2347c.TYPE_TEMP);
            f3957a = a;
            if (a == null) {
                String str = "videoFilePath = " + f3957a + "this is ";
                return;
            }
            f3958b = new File(f3957a);
            String str2 = "videoFile = " + f3958b + "this is ";
            CaptureVideoActivity.start(tFragment, f3957a, 1);
        }
    }

    /* renamed from: a */
    public static void m3992a(final TFragment tFragment, final int i, final boolean z, final String str, boolean z2) {
        if (tFragment.isAdded()) {
            C2706g.m6260a(tFragment);
            C3021g.m7057a(tFragment.getContext(), (CharSequence) null, z2 ? new CharSequence[]{tFragment.getString(C2364R.string.ysf_input_panel_take), tFragment.getString(C2364R.string.ysf_pick_video_record), tFragment.getString(C2364R.string.ysf_picker_image_choose_from_photo_album), tFragment.getString(C2364R.string.ysf_picker_video_from_photo_album)} : new CharSequence[]{tFragment.getString(C2364R.string.ysf_input_panel_take), tFragment.getString(C2364R.string.ysf_picker_image_choose_from_photo_album)}, new C3021g.AbstractC3022a() {
                /* class com.qiyukf.nim.uikit.session.helper.C2005c.C20061 */

                @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                /* renamed from: a */
                public final void mo34369a(int i) {
                    C2709i a;
                    C2709i.AbstractC2710a r0;
                    if (i == 0) {
                        a = C2709i.m6264a(tFragment).mo36469a(AbstractC2550c.f5123a);
                        r0 = new C2709i.AbstractC2710a() {
                            /* class com.qiyukf.nim.uikit.session.helper.C2005c.C20061.C20071 */

                            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                            public final void onDenied() {
                                C1865f.m3555a(C2364R.string.ysf_no_permission_camera);
                            }

                            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                            public final void onGranted() {
                                C20061 r0 = C20061.this;
                                PickImageActivity.start((Fragment) tFragment, i, 2, str, z, 1, false, false, 0, 0);
                            }
                        };
                    } else if (i == 1) {
                        a = C2709i.m6264a(tFragment).mo36469a(AbstractC2550c.f5125c);
                        r0 = new C2709i.AbstractC2710a() {
                            /* class com.qiyukf.nim.uikit.session.helper.C2005c.C20061.C20082 */

                            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                            public final void onDenied() {
                                C1865f.m3555a(C2364R.string.ysf_no_permission_video);
                            }

                            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                            public final void onGranted() {
                                C2005c.m3991a(tFragment);
                            }
                        };
                    } else if (i == 2) {
                        a = C2709i.m6264a(tFragment).mo36469a(AbstractC2550c.f5124b);
                        r0 = new C2709i.AbstractC2710a() {
                            /* class com.qiyukf.nim.uikit.session.helper.C2005c.C20061.C20093 */

                            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                            public final void onDenied() {
                                C1865f.m3555a(C2364R.string.ysf_no_permission_photo);
                            }

                            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                            public final void onGranted() {
                                C20061 r0 = C20061.this;
                                PickImageActivity.start((Fragment) tFragment, i, 1, str, z, 9, false, false, 0, 0);
                            }
                        };
                    } else if (i == 3) {
                        C2709i.m6264a(tFragment).mo36469a(AbstractC2550c.f5124b).mo36468a(new C2709i.AbstractC2710a() {
                            /* class com.qiyukf.nim.uikit.session.helper.C2005c.C20061.C20104 */

                            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                            public final void onDenied() {
                                C1865f.m3555a(C2364R.string.ysf_no_permission_photo);
                            }

                            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                            public final void onGranted() {
                                C2725a.m6293a(tFragment, EnumC2731b.m6309c(), 1, 2);
                            }
                        }).mo36470a();
                        return;
                    } else {
                        return;
                    }
                    a.mo36468a(r0).mo36470a();
                }
            });
        }
    }
}
