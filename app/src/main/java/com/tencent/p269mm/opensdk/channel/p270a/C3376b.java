package com.tencent.p269mm.opensdk.channel.p270a;

import com.tencent.p269mm.opensdk.utils.C3388b;

/* renamed from: com.tencent.mm.opensdk.channel.a.b */
public final class C3376b {
    /* renamed from: a */
    public static byte[] m8637a(String str, int i, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        return C3388b.m8657c(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }
}
