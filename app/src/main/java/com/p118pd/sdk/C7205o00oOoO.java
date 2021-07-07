package com.p118pd.sdk;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00oOoO  reason: case insensitive filesystem */
public class C7205o00oOoO {
    public Map<String, Integer> OooO00o = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean OooO00o(String str, int i) {
        Integer num = this.OooO00o.get(str);
        boolean z = false;
        int intValue = num != null ? num.intValue() : 0;
        if ((intValue & i) != 0) {
            z = true;
        }
        this.OooO00o.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}
