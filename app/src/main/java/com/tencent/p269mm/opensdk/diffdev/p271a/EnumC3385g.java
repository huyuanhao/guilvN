package com.tencent.p269mm.opensdk.diffdev.p271a;

import com.p118pd.sdk.C8713oo0o0o;
import com.tencent.bugly.beta.tinker.TinkerReport;

/* renamed from: com.tencent.mm.opensdk.diffdev.a.g */
public enum EnumC3385g {
    UUID_EXPIRED(TinkerReport.KEY_LOADED_SUCC_COST_3000_LESS),
    UUID_CANCELED(TinkerReport.KEY_LOADED_SUCC_COST_5000_LESS),
    UUID_SCANED(404),
    UUID_CONFIRM(C8713oo0o0o.OooO0o),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);
    
    public int code;

    /* access modifiers changed from: public */
    EnumC3385g(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    public final String toString() {
        return "UUIDStatusCode:" + this.code;
    }
}
