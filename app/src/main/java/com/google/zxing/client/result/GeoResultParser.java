package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class GeoResultParser extends ResultParser {
    public static final Pattern GEO_URL_PATTERN = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    @Override // com.google.zxing.client.result.ResultParser
    public GeoParsedResult parse(Result result) {
        Matcher matcher = GEO_URL_PATTERN.matcher(ResultParser.getMassagedText(result));
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        try {
            double parseDouble = Double.parseDouble(matcher.group(1));
            if (parseDouble <= 90.0d) {
                if (parseDouble >= -90.0d) {
                    double parseDouble2 = Double.parseDouble(matcher.group(2));
                    if (parseDouble2 <= 180.0d) {
                        if (parseDouble2 >= -180.0d) {
                            String group2 = matcher.group(3);
                            double d = AbstractC8352oOoOOoO0.OooO0O0;
                            if (group2 != null) {
                                double parseDouble3 = Double.parseDouble(matcher.group(3));
                                if (parseDouble3 < AbstractC8352oOoOOoO0.OooO0O0) {
                                    return null;
                                }
                                d = parseDouble3;
                            }
                            return new GeoParsedResult(parseDouble, parseDouble2, d, group);
                        }
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
