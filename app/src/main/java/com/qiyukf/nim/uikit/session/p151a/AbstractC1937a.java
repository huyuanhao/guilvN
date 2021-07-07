package com.qiyukf.nim.uikit.session.p151a;

import android.content.Intent;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.nim.uikit.common.fragment.TFragment;
import com.qiyukf.nim.uikit.session.helper.C2005c;
import com.qiyukf.nim.uikit.session.helper.C2012d;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.unicorn.api.customization.action.BaseAction;
import java.io.File;
import java.io.Serializable;

/* renamed from: com.qiyukf.nim.uikit.session.a.a */
public abstract class AbstractC1937a extends BaseAction implements Serializable {
    public C2012d.AbstractC2013a callback = new C2012d.AbstractC2013a() {
        /* class com.qiyukf.nim.uikit.session.p151a.AbstractC1937a.C19381 */

        @Override // com.qiyukf.nim.uikit.session.helper.C2012d.AbstractC2013a
        public final void sendImage(File file, String str, boolean z) {
            AbstractC1937a.this.onPicked(file);
        }
    };
    public boolean multiSelect;
    public C2005c pickImageAndVideoHelper;

    public AbstractC1937a(int i, int i2, boolean z) {
        super(i, i2);
        this.multiSelect = z;
    }

    public AbstractC1937a(int i, String str, boolean z) {
        super(i, str);
        this.multiSelect = z;
    }

    public AbstractC1937a(String str, String str2, boolean z) {
        super(str, str2);
        this.multiSelect = z;
    }

    private String tempFile() {
        return C2349d.m5123a(C1853d.m3518b() + ".jpg", EnumC2347c.TYPE_TEMP);
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 4) {
            C2012d.m3998a(getFragment(), intent, makeRequestCode(6), this.callback);
        } else if (i == 6) {
            C2012d.m3997a(getFragment(), intent, i, makeRequestCode(4), this.callback);
        }
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onClick() {
        C2005c.m3992a((TFragment) getFragment(), makeRequestCode(4), this.multiSelect, tempFile(), true);
    }

    public abstract void onPicked(File file);
}
