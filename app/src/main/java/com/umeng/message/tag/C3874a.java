package com.umeng.message.tag;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;

/* renamed from: com.umeng.message.tag.a */
public class C3874a implements TagFilter {

    /* renamed from: a */
    public static final String f10565a = "com.umeng.message.tag.a";

    /* renamed from: b */
    public static int f10566b = 256;

    @Override // com.umeng.message.tag.TagFilter
    public boolean filter(String str) {
        if (str == null || "".equals(str.trim())) {
            return false;
        }
        if (str == null || str.length() <= f10566b) {
            return true;
        }
        UMLog uMLog = UMConfigure.umDebugLog;
        UMLog.mutlInfo(f10565a, 0, String.format("The length of %s exceeds allowed max length %i", str, Integer.valueOf(f10566b)));
        return false;
    }
}
