package com.google.zxing.client.result;

public abstract class ParsedResult {
    public final ParsedResultType type;

    public ParsedResult(ParsedResultType parsedResultType) {
        this.type = parsedResultType;
    }

    public static void maybeAppend(String str, StringBuilder sb) {
        if (str != null && !str.isEmpty()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(str);
        }
    }

    public abstract String getDisplayResult();

    public final ParsedResultType getType() {
        return this.type;
    }

    public final String toString() {
        return getDisplayResult();
    }

    public static void maybeAppend(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                maybeAppend(str, sb);
            }
        }
    }
}
