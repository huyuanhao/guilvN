package com.xiaomi.push;

import com.xiaomi.push.C4312cd;

/* renamed from: com.xiaomi.push.bz */
public class C4306bz extends C4312cd.C4316d {

    /* renamed from: a */
    public String f11470a = "MessageDeleteJob";

    public C4306bz(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr);
        this.f11470a = str3;
    }

    /* renamed from: a */
    public static C4306bz m11867a(String str) {
        return new C4306bz(str, "status = ?", new String[]{String.valueOf(2)}, "a job build to delete uploaded job");
    }
}
