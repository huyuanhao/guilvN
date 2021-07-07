package com.umeng.umcrash;

import android.text.TextUtils;
import android.util.Log;
import com.p118pd.sdk.C9114oooO00O;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UMCustomLogInfoBuilder {
    public static final String LINE_SEP = "\n";
    public static final String LOG_KEY_AC = "k_ac";
    public static final String LOG_KEY_CT = "k_ct";
    public static final String LOG_KEY_STACK_FUNC = "stackFunc";
    public static final String LOG_KEY_STACK_HASH = "stackHash";
    public static final String LOG_SECTION_SEP = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---";
    public static final String LOG_TYPE = "exception";
    public Map<String, String> kvInfoMap = new HashMap(20);
    public C9114oooO00O mCustomLogInfo = new C9114oooO00O(new StringBuffer(), "exception");
    public List<String> sectionList = new ArrayList(5);
    public String stack;

    public UMCustomLogInfoBuilder(String str) {
        this.kvInfoMap.put(LOG_KEY_CT, "exception");
        this.kvInfoMap.put(LOG_KEY_AC, str);
    }

    public UMCustomLogInfoBuilder addLogCat(boolean z) {
        this.mCustomLogInfo.f22526OooO0OO = z;
        return this;
    }

    public UMCustomLogInfoBuilder addSection(String str) {
        this.sectionList.add(str);
        return this;
    }

    public C9114oooO00O build() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : this.kvInfoMap.entrySet()) {
            stringBuffer.append(entry.getKey());
            stringBuffer.append(Constants.COLON_SEPARATOR);
            stringBuffer.append(entry.getValue());
            stringBuffer.append("\n");
        }
        if (!TextUtils.isEmpty(this.stack)) {
            stringBuffer.append(this.stack);
            stringBuffer.append("\n");
        }
        for (String str : this.sectionList) {
            stringBuffer.append(LOG_SECTION_SEP);
            stringBuffer.append("\n");
            stringBuffer.append(str);
            stringBuffer.append("\n");
        }
        C9114oooO00O oooo00o = this.mCustomLogInfo;
        oooo00o.f22522OooO00o = stringBuffer;
        return oooo00o;
    }

    public UMCustomLogInfoBuilder put(String str, String str2) {
        if (!LOG_KEY_AC.equals(str) && !LOG_KEY_CT.equals(str)) {
            this.kvInfoMap.put(str, str2);
        }
        return this;
    }

    public UMCustomLogInfoBuilder stack(Throwable th) {
        return stack(Log.getStackTraceString(th));
    }

    public UMCustomLogInfoBuilder stackFunc(String str) {
        this.kvInfoMap.put(LOG_KEY_STACK_FUNC, str);
        return this;
    }

    public UMCustomLogInfoBuilder stackHash(String str) {
        this.kvInfoMap.put(LOG_KEY_STACK_HASH, str);
        return this;
    }

    public UMCustomLogInfoBuilder uploadNow(boolean z) {
        this.mCustomLogInfo.f22527OooO0Oo = z;
        return this;
    }

    public UMCustomLogInfoBuilder stack(String str) {
        this.stack = "Exception message:\nBack traces starts.\n" + str + "Back traces ends.";
        return this;
    }
}
