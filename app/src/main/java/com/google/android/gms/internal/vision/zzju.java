package com.google.android.gms.internal.vision;

import com.bumptech.glide.load.engine.GlideException;
import com.p118pd.sdk.C8318oOo0oooo;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzju {
    public static void zza(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        int i;
        if (obj == null) {
            return;
        }
        if (obj instanceof zzjt) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(zzs(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append(GlideException.OooO00o.o0ooOoO);
            }
            Class<?> cls = obj.getClass();
            Field[] fields = cls.getFields();
            for (Field field : fields) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        zza(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        if (obj2 == null) {
                            i = 0;
                        } else {
                            i = Array.getLength(obj2);
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            zza(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method method : cls.getMethods()) {
                String name2 = method.getName();
                if (name2.startsWith("set")) {
                    String substring = name2.substring(3);
                    try {
                        String valueOf = String.valueOf(substring);
                        if (((Boolean) cls.getMethod(valueOf.length() != 0 ? "has".concat(valueOf) : new String("has"), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            String valueOf2 = String.valueOf(substring);
                            zza(substring, cls.getMethod(valueOf2.length() != 0 ? "get".concat(valueOf2) : new String("get"), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        String zzs = zzs(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(zzs);
        stringBuffer2.append(": ");
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.startsWith("http") && str2.length() > 200) {
                str2 = String.valueOf(str2.substring(0, 200)).concat("[...]");
            }
            int length2 = str2.length();
            StringBuilder sb = new StringBuilder(length2);
            for (int i3 = 0; i3 < length2; i3++) {
                char charAt = str2.charAt(i3);
                if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                    sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                } else {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            stringBuffer2.append("\"");
            stringBuffer2.append(sb2);
            stringBuffer2.append("\"");
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr == null) {
                stringBuffer2.append("\"\"");
            } else {
                stringBuffer2.append(C8318oOo0oooo.OooO00o);
                for (byte b : bArr) {
                    int i4 = b & 255;
                    if (i4 == 92 || i4 == 34) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append((char) i4);
                    } else if (i4 < 32 || i4 >= 127) {
                        stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i4)));
                    } else {
                        stringBuffer2.append((char) i4);
                    }
                }
                stringBuffer2.append(C8318oOo0oooo.OooO00o);
            }
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    public static <T extends zzjt> String zzb(T t) {
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            zza(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            String valueOf = String.valueOf(e.getMessage());
            return valueOf.length() != 0 ? "Error printing proto: ".concat(valueOf) : new String("Error printing proto: ");
        } catch (InvocationTargetException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            return valueOf2.length() != 0 ? "Error printing proto: ".concat(valueOf2) : new String("Error printing proto: ");
        }
    }

    public static String zzs(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }
}
