package com.rxhui.data.core;

import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseVO implements Serializable {
    public static final String o0ooOOo = "BaseVO";
    public static final long serialVersionUID = 7837870846952680596L;

    public enum DataType {
        INT,
        STRING,
        DOUBLE,
        LONG,
        BOOL,
        FLOAT
    }

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.rxhui.data.core.BaseVO$DataType[] r0 = com.rxhui.data.core.BaseVO.DataType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.rxhui.data.core.BaseVO.OooO00o.OooO00o = r0
                com.rxhui.data.core.BaseVO$DataType r1 = com.rxhui.data.core.BaseVO.DataType.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.rxhui.data.core.BaseVO.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rxhui.data.core.BaseVO$DataType r1 = com.rxhui.data.core.BaseVO.DataType.INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.rxhui.data.core.BaseVO.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rxhui.data.core.BaseVO$DataType r1 = com.rxhui.data.core.BaseVO.DataType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.rxhui.data.core.BaseVO.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.rxhui.data.core.BaseVO$DataType r1 = com.rxhui.data.core.BaseVO.DataType.LONG     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.rxhui.data.core.BaseVO.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x003e }
                com.rxhui.data.core.BaseVO$DataType r1 = com.rxhui.data.core.BaseVO.DataType.FLOAT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.rxhui.data.core.BaseVO.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.rxhui.data.core.BaseVO$DataType r1 = com.rxhui.data.core.BaseVO.DataType.BOOL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rxhui.data.core.BaseVO.OooO00o.<clinit>():void");
        }
    }

    public static boolean getBooleanValue(String str, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            try {
                return Boolean.parseBoolean(jSONObject.getString(str));
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    e.getMessage();
                }
            }
        }
        return false;
    }

    public static double getDoubleValue(String str, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            try {
                return Double.parseDouble(jSONObject.getString(str));
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    e.getMessage();
                }
            }
        }
        return AbstractC8352oOoOOoO0.OooO0O0;
    }

    public static float getFloatValue(String str, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            try {
                return Float.parseFloat(jSONObject.getString(str));
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    e.getMessage();
                }
            }
        }
        return 0.0f;
    }

    public static int getIntValue(String str, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            try {
                return Integer.parseInt(jSONObject.getString(str));
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    e.getMessage();
                }
            }
        }
        return 0;
    }

    public static JSONArray getJsonArray(Object obj, String str) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            try {
                return jSONObject.getJSONArray(str);
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    e.getMessage();
                }
            }
        }
        return null;
    }

    public static JSONObject getJsonValue(Object obj, String str) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            try {
                return jSONObject.getJSONObject(str);
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    e.getMessage();
                }
            }
        }
        return null;
    }

    public static long getLongValue(String str, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            try {
                return Long.parseLong(jSONObject.getString(str));
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    e.getMessage();
                }
            }
        }
        return 0;
    }

    public static String getMessage(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        JSONObject jSONObject2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject("message");
        } catch (JSONException e) {
            e.getMessage();
        }
        if (jSONObject2 != null) {
            try {
                return jSONObject2.getString("message");
            } catch (JSONException e2) {
                e2.getMessage();
            }
        }
        return "";
    }

    public static int getMessageCode(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
            return -1;
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject2 = jSONObject.getJSONObject("message");
        } catch (JSONException e) {
            e.getMessage();
        }
        if (jSONObject2 == null) {
            return 0;
        }
        try {
            return jSONObject2.getInt("code");
        } catch (JSONException e2) {
            e2.getMessage();
            return 0;
        }
    }

    public static String getStringValue(String str, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    e.getMessage();
                }
            }
        }
        return "";
    }

    public static List<?> parseList(Object obj, String str, Class<?> cls) {
        return parseList(getJsonArray(obj, str), cls);
    }

    public boolean hasValue(Object obj, String str) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null || !jSONObject.has(str)) {
            return false;
        }
        String str2 = null;
        try {
            str2 = jSONObject.getString(str);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                e.getMessage();
            }
        }
        if (str2 == null || str2.length() <= 0) {
            return false;
        }
        return true;
    }

    public void parseBooleanField(String str, Object obj) {
        parseField(str, obj, DataType.BOOL);
    }

    public void parseDoubleField(String str, Object obj) {
        parseField(str, obj, DataType.DOUBLE);
    }

    public void parseField(String str, Object obj, DataType dataType) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            Field field = null;
            try {
                field = getClass().getDeclaredField(str);
            } catch (NoSuchFieldException e) {
                e.getMessage();
            }
            if (field != null) {
                field.setAccessible(true);
                if (hasValue(jSONObject, str)) {
                    try {
                        switch (OooO00o.OooO00o[dataType.ordinal()]) {
                            case 1:
                                field.set(this, jSONObject.getString(str));
                                break;
                            case 2:
                                field.set(this, Integer.valueOf(Integer.parseInt(jSONObject.getString(str))));
                                break;
                            case 3:
                                field.set(this, Double.valueOf(Double.parseDouble(jSONObject.getString(str))));
                                break;
                            case 4:
                                field.set(this, Long.valueOf(Long.parseLong(jSONObject.getString(str))));
                                break;
                            case 5:
                                field.set(this, Float.valueOf(Float.parseFloat(jSONObject.getString(str))));
                                break;
                            case 6:
                                field.set(this, Boolean.valueOf(jSONObject.getBoolean(str)));
                                break;
                        }
                    } catch (Exception e2) {
                        if (e2.getMessage() != null) {
                            e2.getMessage();
                        }
                    }
                } else {
                    try {
                        switch (OooO00o.OooO00o[dataType.ordinal()]) {
                            case 1:
                                field.set(this, "");
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                field.set(this, 0);
                                break;
                            case 6:
                                field.set(this, false);
                                break;
                        }
                    } catch (Exception e3) {
                        if (e3.getMessage() != null) {
                            e3.getMessage();
                        }
                    }
                }
                field.setAccessible(false);
            }
        }
    }

    public void parseFloatField(String str, Object obj) {
        parseField(str, obj, DataType.FLOAT);
    }

    public void parseIntField(String str, Object obj) {
        parseField(str, obj, DataType.INT);
    }

    public void parseLongField(String str, Object obj) {
        parseField(str, obj, DataType.LONG);
    }

    public void parseStringField(String str, Object obj) {
        parseField(str, obj, DataType.STRING);
    }

    public static List<?> parseList(JSONArray jSONArray, Class<?> cls) {
        Constructor<?> constructor;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                constructor = cls.getDeclaredConstructor(Object.class);
            } catch (NoSuchMethodException e) {
                e.getMessage();
                constructor = null;
            }
            if (constructor == null) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add(constructor.newInstance(jSONArray.get(i)));
                } catch (Exception e2) {
                    if (e2.getMessage() != null) {
                        e2.getMessage();
                    }
                }
            }
        }
        return arrayList;
    }
}
