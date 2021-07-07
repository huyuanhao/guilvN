package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨1丨LI  reason: invalid class name and case insensitive filesystem */
public class C93191LI {
    public static final Hashtable OooO00o = new Hashtable();
    public static final Hashtable OooO0O0 = new Hashtable();

    static {
        OooO00o("B-571", AbstractC6801ll1lLI.Oooo000);
        OooO00o("B-409", AbstractC6801ll1lLI.OooOooO);
        OooO00o("B-283", AbstractC6801ll1lLI.OooOOO);
        OooO00o("B-233", AbstractC6801ll1lLI.OooOo00);
        OooO00o("B-163", AbstractC6801ll1lLI.OooOO0o);
        OooO00o("K-571", AbstractC6801ll1lLI.OooOooo);
        OooO00o("K-409", AbstractC6801ll1lLI.OooOoo);
        OooO00o("K-283", AbstractC6801ll1lLI.OooOOO0);
        OooO00o("K-233", AbstractC6801ll1lLI.OooOOoo);
        OooO00o("K-163", AbstractC6801ll1lLI.OooO0O0);
        OooO00o("P-521", AbstractC6801ll1lLI.OooOoo0);
        OooO00o("P-384", AbstractC6801ll1lLI.OooOoOO);
        OooO00o("P-256", AbstractC6801ll1lLI.Oooo00o);
        OooO00o("P-224", AbstractC6801ll1lLI.OooOoO);
        OooO00o("P-192", AbstractC6801ll1lLI.Oooo00O);
    }

    public static LlLI1 OooO00o(String str) {
        return (LlLI1) OooO00o.get(Strings.OooO0O0(str));
    }

    public static C9387Iill OooO00o(LlLI1 llLI1) {
        return C6659liLi.OooO00o(llLI1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C9387Iill m21352OooO00o(String str) {
        LlLI1 llLI1 = (LlLI1) OooO00o.get(Strings.OooO0O0(str));
        if (llLI1 != null) {
            return OooO00o(llLI1);
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m21353OooO00o(LlLI1 llLI1) {
        return (String) OooO0O0.get(llLI1);
    }

    public static Enumeration OooO00o() {
        return OooO00o.keys();
    }

    public static void OooO00o(String str, LlLI1 llLI1) {
        OooO00o.put(str, llLI1);
        OooO0O0.put(llLI1, str);
    }
}
