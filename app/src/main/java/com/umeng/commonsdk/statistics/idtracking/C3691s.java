package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.os.Environment;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.C3745b;
import java.io.File;
import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.s */
public class C3691s extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9674a = "utdid";

    /* renamed from: b */
    public static final String f9675b = "android.permission.WRITE_EXTERNAL_STORAGE";

    /* renamed from: c */
    public static final Pattern f9676c = Pattern.compile("UTDID\">([^<]+)");

    /* renamed from: d */
    public Context f9677d;

    public C3691s(Context context) {
        super("utdid");
        this.f9677d = context;
    }

    /* renamed from: b */
    private String m9951b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f9676c.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: g */
    private String m9952g() {
        File h = m9953h();
        if (h != null && h.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(h);
                try {
                    return m9951b(HelperUtils.readStreamToString(fileInputStream));
                } finally {
                    HelperUtils.safeClose(fileInputStream);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: h */
    private File m9953h() {
        if (DeviceConfig.checkPermission(this.f9677d, "android.permission.WRITE_EXTERNAL_STORAGE") && Environment.getExternalStorageState().equals("mounted")) {
            try {
                return new File(Environment.getExternalStorageDirectory().getCanonicalPath(), ".UTSystemConfig/Global/Alvin2.xml");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        try {
            if (!FieldManager.allow(C3745b.f9864u)) {
                return null;
            }
            return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", Context.class).invoke(null, this.f9677d);
        } catch (Exception unused) {
            if (FieldManager.allow(C3745b.f9864u)) {
                return m9952g();
            }
            return null;
        }
    }
}
