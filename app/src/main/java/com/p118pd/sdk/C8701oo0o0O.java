package com.p118pd.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0o0O  reason: case insensitive filesystem */
public class C8701oo0o0O {
    public static final String OooO00o = "Util";

    public static Bundle OooO00o(Bundle bundle, String str, Object obj) {
        if (obj instanceof Bundle) {
            bundle.putBundle(str, (Bundle) obj);
        } else if (obj instanceof Byte) {
            bundle.putByte(str, ((Byte) obj).byteValue());
        } else if (obj instanceof Short) {
            bundle.putShort(str, ((Short) obj).shortValue());
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Character) {
            bundle.putChar(str, ((Character) obj).charValue());
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof CharSequence) {
            bundle.putCharSequence(str, (CharSequence) obj);
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
        } else if (obj instanceof short[]) {
            bundle.putShortArray(str, (short[]) obj);
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof char[]) {
            bundle.putCharArray(str, (char[]) obj);
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof float[]) {
            bundle.putFloatArray(str, (float[]) obj);
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof String[]) {
            bundle.putStringArray(str, (String[]) obj);
        } else if (obj instanceof CharSequence[]) {
            bundle.putCharSequenceArray(str, (CharSequence[]) obj);
        } else if (obj instanceof IBinder) {
            if (Build.VERSION.SDK_INT >= 18) {
                bundle.putBinder(str, (IBinder) obj);
            }
        } else if (obj instanceof ArrayList) {
            ArrayList<? extends Parcelable> arrayList = (ArrayList) obj;
            if (!arrayList.isEmpty()) {
                Object obj2 = arrayList.get(0);
                if (obj2 instanceof Integer) {
                    bundle.putIntegerArrayList(str, arrayList);
                } else if (obj2 instanceof String) {
                    bundle.putStringArrayList(str, arrayList);
                } else if (obj2 instanceof CharSequence) {
                    bundle.putCharSequenceArrayList(str, arrayList);
                } else if (obj2 instanceof Parcelable) {
                    bundle.putParcelableArrayList(str, arrayList);
                } else if (obj2 instanceof Serializable) {
                    bundle.putSerializable(str, (Serializable) obj);
                }
            }
        } else if (obj instanceof SparseArray) {
            bundle.putSparseParcelableArray(str, (SparseArray) obj);
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Parcelable[]) {
            bundle.putParcelableArray(str, (Parcelable[]) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
        return bundle;
    }

    public static Map<String, Object> OooO00o(JSONObject jSONObject) throws JSONException {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.get(next));
        }
        return hashMap;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Map<String, Object> m20317OooO00o(Uri uri) {
        if (uri == null) {
            return new HashMap();
        }
        return m20318OooO00o(uri.toString());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Map<String, Object> m20318OooO00o(String str) {
        HashMap hashMap = new HashMap();
        int indexOf = str.indexOf(C8932ooOOO0o.f22176OooO00o);
        if (!TextUtils.isEmpty(str) && -1 != indexOf) {
            try {
                String[] split = str.substring(indexOf + 1).split("&");
                for (String str2 : split) {
                    String str3 = "";
                    String substring = str2.contains(C8932ooOOO0o.OooO0Oo) ? str2.substring(0, str2.indexOf(C8932ooOOO0o.OooO0Oo)) : str3;
                    if (!str2.endsWith(C8932ooOOO0o.OooO0Oo)) {
                        str3 = str2.substring(str2.indexOf(C8932ooOOO0o.OooO0Oo) + 1);
                    }
                    hashMap.put(substring, str3);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public static String OooO00o(Uri uri) {
        if (uri == null) {
            return "";
        }
        String uri2 = uri.toString();
        if (-1 != uri2.indexOf(C8932ooOOO0o.f22176OooO00o)) {
            uri2 = uri2.substring(0, uri2.indexOf(C8932ooOOO0o.f22176OooO00o));
        }
        if (!uri2.startsWith(C8932ooOOO0o.OooO0OO)) {
            uri2 = C8932ooOOO0o.OooO0OO + uri2;
        }
        return Uri.parse(uri2).getPath();
    }

    public static String OooO00o(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(C8932ooOOO0o.OooO0Oo);
            sb.append(map.get(str));
            sb.append("&");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String OooO00o(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static <T extends Serializable> T OooO00o(Object obj) {
        T t;
        Exception e;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            t = (T) ((Serializable) objectInputStream.readObject());
            try {
                objectInputStream.close();
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            t = null;
            e.printStackTrace();
            return t;
        }
        return t;
    }

    public static String OooO00o(String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(C8932ooOOO0o.OooO0OO)) {
            str = C8932ooOOO0o.OooO0OO + str;
        }
        return (!str.endsWith(C8932ooOOO0o.OooO0OO) || str.length() <= 1) ? str : OooO00o(str.substring(0, str.length() - 1));
    }
}
