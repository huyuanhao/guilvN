package com.qiyukf.nimlib.p183g.p188b.p190b;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.qiyukf.nimlib.g.b.b.b */
public final class C2278b {

    /* renamed from: a */
    public String f4542a;

    /* renamed from: b */
    public int f4543b;

    public C2278b(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(58);
            if (indexOf != -1) {
                this.f4542a = str.substring(0, indexOf);
                try {
                    this.f4543b = Integer.parseInt(str.substring(indexOf + 1));
                } catch (Exception unused) {
                }
            } else {
                this.f4542a = str;
            }
        }
    }

    public final String toString() {
        String str;
        if (!(!TextUtils.isEmpty(this.f4542a))) {
            return "INVALID";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4542a);
        if (this.f4543b > 0) {
            str = Constants.COLON_SEPARATOR + this.f4543b;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
