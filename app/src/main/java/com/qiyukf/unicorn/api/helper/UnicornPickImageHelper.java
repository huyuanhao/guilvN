package com.qiyukf.unicorn.api.helper;

import android.app.Activity;
import android.content.Intent;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.session.activity.PickImageActivity;
import com.qiyukf.nim.uikit.session.helper.C2012d;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2550c;
import com.qiyukf.unicorn.p232k.C2709i;
import java.io.File;

public class UnicornPickImageHelper {
    public Activity activity;
    public SendImageCallback callback;

    public interface SendImageCallback {
        void sendImage(File file, String str, boolean z);
    }

    public UnicornPickImageHelper(Activity activity2, SendImageCallback sendImageCallback) {
        this.activity = activity2;
        this.callback = sendImageCallback;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String tempFile() {
        return C2349d.m5123a(C1853d.m3518b() + ".jpg", EnumC2347c.TYPE_TEMP);
    }

    public void goUnicornAlbum(final int i) {
        Activity activity2 = this.activity;
        if (activity2 != null && this.callback != null) {
            C2709i.m6263a(activity2).mo36469a(AbstractC2550c.f5124b).mo36468a(new C2709i.AbstractC2710a() {
                /* class com.qiyukf.unicorn.api.helper.UnicornPickImageHelper.C24211 */

                @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                public void onDenied() {
                    C1865f.m3555a(C2364R.string.ysf_no_permission_photo);
                }

                @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                public void onGranted() {
                    PickImageActivity.start(UnicornPickImageHelper.this.activity, i, 1, UnicornPickImageHelper.this.tempFile(), true, 9, false, false, 0, 0);
                }
            }).mo36470a();
        }
    }

    public void goUnicornCapturePhoto(final int i) {
        Activity activity2 = this.activity;
        if (activity2 != null && this.callback != null) {
            C2709i.m6263a(activity2).mo36469a(AbstractC2550c.f5123a).mo36468a(new C2709i.AbstractC2710a() {
                /* class com.qiyukf.unicorn.api.helper.UnicornPickImageHelper.C24233 */

                @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                public void onDenied() {
                    C1865f.m3555a(C2364R.string.ysf_no_permission_camera);
                }

                @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                public void onGranted() {
                    PickImageActivity.start(UnicornPickImageHelper.this.activity, i, 2, UnicornPickImageHelper.this.tempFile(), true, 1, false, false, 0, 0);
                }
            }).mo36470a();
        }
    }

    public void onAlbumResult(Intent intent) {
        Activity activity2 = this.activity;
        if (activity2 != null && this.callback != null && intent != null) {
            C2012d.m4000b(activity2, intent, 6, new C2012d.AbstractC2013a() {
                /* class com.qiyukf.unicorn.api.helper.UnicornPickImageHelper.C24222 */

                @Override // com.qiyukf.nim.uikit.session.helper.C2012d.AbstractC2013a
                public void sendImage(File file, String str, boolean z) {
                    if (UnicornPickImageHelper.this.callback != null) {
                        UnicornPickImageHelper.this.callback.sendImage(file, str, z);
                    }
                }
            });
        }
    }

    public void onCapturePhotoPorcessResult(Intent intent, int i) {
        Activity activity2 = this.activity;
        if (activity2 != null && this.callback != null) {
            C2012d.m3995a(activity2, intent, i, new C2012d.AbstractC2013a() {
                /* class com.qiyukf.unicorn.api.helper.UnicornPickImageHelper.C24255 */

                @Override // com.qiyukf.nim.uikit.session.helper.C2012d.AbstractC2013a
                public void sendImage(File file, String str, boolean z) {
                    if (UnicornPickImageHelper.this.callback != null) {
                        UnicornPickImageHelper.this.callback.sendImage(file, str, z);
                    }
                }
            });
        }
    }

    public void onCapturePhotoResult(Intent intent, int i) {
        Activity activity2 = this.activity;
        if (activity2 != null && this.callback != null && intent != null) {
            C2012d.m4000b(activity2, intent, i, new C2012d.AbstractC2013a() {
                /* class com.qiyukf.unicorn.api.helper.UnicornPickImageHelper.C24244 */

                @Override // com.qiyukf.nim.uikit.session.helper.C2012d.AbstractC2013a
                public void sendImage(File file, String str, boolean z) {
                    if (UnicornPickImageHelper.this.callback != null) {
                        UnicornPickImageHelper.this.callback.sendImage(file, str, z);
                    }
                }
            });
        }
    }
}
