package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.regex.Pattern;
import org.android.agoo.common.AgooConstants;

public final class EmailAddressResultParser extends ResultParser {
    public static final Pattern COMMA = Pattern.compile(Constants.ACCEPT_TIME_SEPARATOR_SP);

    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String str;
        String str2;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str3;
        String massagedText = ResultParser.getMassagedText(result);
        String[] strArr4 = null;
        if (massagedText.startsWith("mailto:") || massagedText.startsWith("MAILTO:")) {
            String substring = massagedText.substring(7);
            int indexOf = substring.indexOf(63);
            if (indexOf >= 0) {
                substring = substring.substring(0, indexOf);
            }
            try {
                String urlDecode = ResultParser.urlDecode(substring);
                String[] split = !urlDecode.isEmpty() ? COMMA.split(urlDecode) : null;
                Map<String, String> parseNameValuePairs = ResultParser.parseNameValuePairs(massagedText);
                if (parseNameValuePairs != null) {
                    if (split == null && (str3 = parseNameValuePairs.get("to")) != null) {
                        split = COMMA.split(str3);
                    }
                    String str4 = parseNameValuePairs.get("cc");
                    String[] split2 = str4 != null ? COMMA.split(str4) : null;
                    String str5 = parseNameValuePairs.get("bcc");
                    if (str5 != null) {
                        strArr4 = COMMA.split(str5);
                    }
                    str = parseNameValuePairs.get(AgooConstants.MESSAGE_BODY);
                    strArr3 = split;
                    strArr = strArr4;
                    strArr2 = split2;
                    str2 = parseNameValuePairs.get("subject");
                } else {
                    strArr3 = split;
                    strArr2 = null;
                    strArr = null;
                    str2 = null;
                    str = null;
                }
                return new EmailAddressParsedResult(strArr3, strArr2, strArr, str2, str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (!EmailDoCoMoResultParser.isBasicallyValidEmailAddress(massagedText)) {
            return null;
        } else {
            return new EmailAddressParsedResult(massagedText);
        }
    }
}
