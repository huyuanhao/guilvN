package com.facebook.react.util;

import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.devsupport.StackTraceHelper;
import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JSStackTrace {
    public static final Pattern FILE_ID_PATTERN = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    public static String format(String str, ReadableArray readableArray) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(", stack:\n");
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            sb.append(map.getString(PromiseImpl.STACK_FRAME_KEY_METHOD_NAME));
            sb.append("@");
            sb.append(parseFileId(map));
            if (!map.hasKey("lineNumber") || map.isNull("lineNumber") || map.getType("lineNumber") != ReadableType.Number) {
                sb.append(-1);
            } else {
                sb.append(map.getInt("lineNumber"));
            }
            if (map.hasKey(StackTraceHelper.COLUMN_KEY) && !map.isNull(StackTraceHelper.COLUMN_KEY) && map.getType(StackTraceHelper.COLUMN_KEY) == ReadableType.Number) {
                sb.append(Constants.COLON_SEPARATOR);
                sb.append(map.getInt(StackTraceHelper.COLUMN_KEY));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String parseFileId(ReadableMap readableMap) {
        if (!readableMap.hasKey("file") || readableMap.isNull("file") || readableMap.getType("file") != ReadableType.String) {
            return "";
        }
        Matcher matcher = FILE_ID_PATTERN.matcher(readableMap.getString("file"));
        if (!matcher.find()) {
            return "";
        }
        return matcher.group(1) + Constants.COLON_SEPARATOR;
    }
}
