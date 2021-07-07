package com.p118pd.sdk;

import anet.channel.entity.ConnType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.views.text.FontMetricsUtil;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.RadarEntry;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oOoOo0oo  reason: case insensitive filesystem */
public final class C8370oOoOo0oo {
    public static WritableMap OooO00o(Entry entry) {
        if (entry == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (entry.m19899OooO00o() instanceof Map) {
            writableNativeMap.putMap("data", OooO00o((Map) entry.m19899OooO00o()));
        }
        if (entry instanceof BarEntry) {
            BarEntry barEntry = (BarEntry) entry;
            writableNativeMap.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, (double) entry.OooO0O0());
            if (barEntry.m15084OooO00o() != null) {
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                for (float f : barEntry.m15084OooO00o()) {
                    writableNativeArray.pushDouble((double) f);
                }
                writableNativeMap.putArray("yValues", writableNativeArray);
            } else {
                writableNativeMap.putDouble("y", (double) entry.OooO00o());
            }
        } else if (entry instanceof BubbleEntry) {
            writableNativeMap.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, (double) entry.OooO0O0());
            writableNativeMap.putDouble("y", (double) entry.OooO00o());
            writableNativeMap.putDouble(FileAttachment.KEY_SIZE, (double) ((BubbleEntry) entry).OooO0OO());
        } else if (entry instanceof CandleEntry) {
            CandleEntry candleEntry = (CandleEntry) entry;
            writableNativeMap.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, (double) entry.OooO0O0());
            writableNativeMap.putDouble(ConnType.PK_OPEN, (double) candleEntry.OooO0oO());
            writableNativeMap.putDouble("close", (double) candleEntry.OooO0Oo());
            writableNativeMap.putDouble(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW, (double) candleEntry.OooO0o());
            writableNativeMap.putDouble(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH, (double) candleEntry.OooO0o0());
        } else if (entry instanceof PieEntry) {
            PieEntry pieEntry = (PieEntry) entry;
            writableNativeMap.putDouble("value", (double) pieEntry.OooO0OO());
            writableNativeMap.putString("label", pieEntry.m15103OooO00o());
        } else if (entry instanceof RadarEntry) {
            writableNativeMap.putDouble("value", (double) ((RadarEntry) entry).OooO0OO());
        } else {
            writableNativeMap.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, (double) entry.OooO0O0());
            writableNativeMap.putDouble("y", (double) entry.OooO00o());
        }
        return writableNativeMap;
    }

    public static WritableMap OooO00o(Map map) {
        return OooO00o(new JSONObject(map));
    }

    public static WritableMap OooO00o(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    writableNativeMap.putMap(next, OooO00o((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableNativeMap.putArray(next, OooO00o((JSONArray) obj));
                } else if (obj instanceof Boolean) {
                    writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    writableNativeMap.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    writableNativeMap.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    writableNativeMap.putString(next, (String) obj);
                } else {
                    writableNativeMap.putString(next, obj.toString());
                }
            }
        } catch (JSONException e) {
            writableNativeMap.putString("error", "Failed to convert JSONObject to WritableMap: " + e.getMessage());
        }
        return writableNativeMap;
    }

    public static WritableArray OooO00o(JSONArray jSONArray) throws JSONException {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                writableNativeArray.pushMap(OooO00o((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeArray.pushArray(OooO00o((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeArray.pushDouble(((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeArray.pushString((String) obj);
            } else {
                writableNativeArray.pushString(obj.toString());
            }
        }
        return writableNativeArray;
    }
}
