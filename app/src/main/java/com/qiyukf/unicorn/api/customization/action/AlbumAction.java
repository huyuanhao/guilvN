package com.qiyukf.unicorn.api.customization.action;

import android.content.Intent;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.session.activity.PickImageActivity;
import com.qiyukf.nim.uikit.session.helper.C2012d;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.MessageService;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2550c;
import com.qiyukf.unicorn.p232k.C2709i;
import java.io.File;

public class AlbumAction extends BaseAction {
    public int actionFontColor = 0;
    public C2012d.AbstractC2013a callback = new C2012d.AbstractC2013a() {
        /* class com.qiyukf.unicorn.api.customization.action.AlbumAction.C24092 */

        @Override // com.qiyukf.nim.uikit.session.helper.C2012d.AbstractC2013a
        public void sendImage(File file, String str, boolean z) {
            MessageService.sendMessage(AlbumAction.this.buidlImageMessage(file));
        }
    };

    public AlbumAction(int i, int i2) {
        super(i, i2);
    }

    public AlbumAction(int i, String str) {
        super(i, str);
    }

    public AlbumAction(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String tempFile() {
        return C2349d.m5123a(C1853d.m3518b() + ".jpg", EnumC2347c.TYPE_TEMP);
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public int getActionFontColor() {
        int i = this.actionFontColor;
        return i == 0 ? super.getActionFontColor() : i;
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 4) {
            C2012d.m3998a(getFragment(), intent, makeRequestCode(6), this.callback);
        }
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onClick() {
        final int makeRequestCode = makeRequestCode(4);
        C2709i.m6264a(getFragment()).mo36469a(AbstractC2550c.f5124b).mo36468a(new C2709i.AbstractC2710a() {
            /* class com.qiyukf.unicorn.api.customization.action.AlbumAction.C24081 */

            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
            public void onDenied() {
                C1865f.m3555a(C2364R.string.ysf_no_permission_photo);
            }

            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
            public void onGranted() {
                PickImageActivity.start(AlbumAction.this.getFragment(), makeRequestCode, 1, AlbumAction.this.tempFile(), true, 9, false, false, 0, 0);
            }
        }).mo36470a();
    }

    public void setActionFontColor(int i) {
        this.actionFontColor = i;
    }
}
