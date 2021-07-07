package com.p118pd.sdk;

import java.util.Map;

/* renamed from: com.pd.sdk.丨l1I1L丨  reason: invalid class name */
public interface l1I1L {
    public static final String o00o0O = "threadLocalEcImplicitlyCa";
    public static final String o00oO0O = "acceptableEcCurves";
    public static final String o00oO0o = "DhDefaultParams";
    public static final String o00ooo = "ecImplicitlyCa";
    public static final String o0ooOO0 = "additionalEcParameters";
    public static final String oo000o = "threadLocalDhDefaultParams";

    void addAlgorithm(String str, LlLI1 llLI1, String str2);

    void addAlgorithm(String str, String str2);

    void addAttributes(String str, Map<String, String> map);

    void addKeyInfoConverter(LlLI1 llLI1, AbstractC5416IilI v);

    boolean hasAlgorithm(String str, String str2);

    void setParameter(String str, Object obj);
}
