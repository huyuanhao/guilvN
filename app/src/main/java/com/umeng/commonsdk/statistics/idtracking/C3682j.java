package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.File;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.j */
public class C3682j extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9654a = "oldumid";

    /* renamed from: b */
    public Context f9655b;

    /* renamed from: c */
    public String f9656c = null;

    /* renamed from: d */
    public String f9657d = null;

    public C3682j(Context context) {
        super(f9654a);
        this.f9655b = context;
    }

    /* renamed from: b */
    private void m9935b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: j */
    private void m9936j() {
        try {
            m9935b("/data/local/tmp/.um");
            HelperUtils.writeFile(new File("/data/local/tmp/.um/sysid.dat"), this.f9657d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: k */
    private void m9937k() {
        try {
            m9935b("/sdcard/Android/obj/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/obj/.um/sysid.dat"), this.f9657d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: l */
    private void m9938l() {
        try {
            m9935b("/sdcard/Android/data/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/data/.um/sysid.dat"), this.f9657d);
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        return this.f9656c;
    }

    /* renamed from: g */
    public boolean mo39258g() {
        return mo39259h();
    }

    /* renamed from: h */
    public boolean mo39259h() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f9655b, "umid", null);
        this.f9657d = imprintProperty;
        if (TextUtils.isEmpty(imprintProperty)) {
            return false;
        }
        this.f9657d = DataHelper.encryptBySHA1(this.f9657d);
        String readFile = HelperUtils.readFile(new File("/sdcard/Android/data/.um/sysid.dat"));
        String readFile2 = HelperUtils.readFile(new File("/sdcard/Android/obj/.um/sysid.dat"));
        String readFile3 = HelperUtils.readFile(new File("/data/local/tmp/.um/sysid.dat"));
        if (TextUtils.isEmpty(readFile)) {
            m9938l();
        } else if (!this.f9657d.equals(readFile)) {
            this.f9656c = readFile;
            return true;
        }
        if (TextUtils.isEmpty(readFile2)) {
            m9937k();
        } else if (!this.f9657d.equals(readFile2)) {
            this.f9656c = readFile2;
            return true;
        }
        if (TextUtils.isEmpty(readFile3)) {
            m9936j();
            return false;
        } else if (this.f9657d.equals(readFile3)) {
            return false;
        } else {
            this.f9656c = readFile3;
            return true;
        }
    }

    /* renamed from: i */
    public void mo39260i() {
        try {
            m9938l();
            m9937k();
            m9936j();
        } catch (Exception unused) {
        }
    }
}
