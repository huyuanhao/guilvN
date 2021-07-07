package com.alipay.sdk.protocol;

import android.text.TextUtils;

/* renamed from: com.alipay.sdk.protocol.a */
public enum EnumC0406a {
    None("none"),
    WapPay("js://wappay"),
    Update("js://update"),
    OpenWeb("loc:openweb"),
    SetResult("loc:setResult"),
    Exit("loc:exit");
    

    /* renamed from: g */
    public String f923g;

    /* access modifiers changed from: public */
    EnumC0406a(String str) {
        this.f923g = str;
    }

    /* renamed from: a */
    public static EnumC0406a m837a(String str) {
        if (TextUtils.isEmpty(str)) {
            return None;
        }
        EnumC0406a aVar = None;
        EnumC0406a[] values = values();
        for (EnumC0406a aVar2 : values) {
            if (str.startsWith(aVar2.f923g)) {
                return aVar2;
            }
        }
        return aVar;
    }
}
