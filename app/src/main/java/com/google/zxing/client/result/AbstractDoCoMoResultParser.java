package com.google.zxing.client.result;

public abstract class AbstractDoCoMoResultParser extends ResultParser {
    public static String[] matchDoCoMoPrefixedField(String str, String str2, boolean z) {
        return ResultParser.matchPrefixedField(str, str2, ';', z);
    }

    public static String matchSingleDoCoMoPrefixedField(String str, String str2, boolean z) {
        return ResultParser.matchSinglePrefixedField(str, str2, ';', z);
    }
}
