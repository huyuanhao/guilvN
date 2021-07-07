package com.p118pd.sdk;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0oo00O  reason: case insensitive filesystem */
public class C8754oo0oo00O {
    public static final int OooO00o = 2054712097;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21937OooO00o = "∘";
    public static final String OooO0O0 = "∙";
    public static final String OooO0OO = "UTF-8";
    public static final String OooO0Oo = "Packer Ng Sig V2";
    public static final String OooO0o0 = "CHANNEL";

    public static String OooO00o(File file) throws IOException {
        return OooO00o(file, OooO0o0, (int) OooO00o);
    }

    public static void OooO0O0(File file, byte[] bArr, int i) throws IOException {
        C8750oo0oo.OooO00o(file, i, OooO00o(bArr));
    }

    public static void OooO00o(File file, String str) throws IOException {
        OooO00o(file, OooO0o0, str, OooO00o);
    }

    public static String OooO00o(File file, String str, int i) throws IOException {
        Map<String, String> OooO00o2 = m20396OooO00o(file, i);
        if (OooO00o2 == null || OooO00o2.isEmpty()) {
            return null;
        }
        return OooO00o2.get(str);
    }

    public static byte[] OooO0O0(File file, int i) throws IOException {
        int i2;
        ByteBuffer OooO00o2 = C8750oo0oo.OooO00o(file, i);
        if (OooO00o2 == null) {
            return null;
        }
        byte[] bytes = OooO0Oo.getBytes("UTF-8");
        byte[] bArr = new byte[bytes.length];
        OooO00o2.get(bArr);
        if (Arrays.equals(bytes, bArr) && (i2 = OooO00o2.getInt()) > 0) {
            byte[] bArr2 = new byte[i2];
            OooO00o2.get(bArr2);
            if (OooO00o2.getInt() == i2) {
                return bArr2;
            }
        }
        return null;
    }

    public static void OooO00o(File file, String str, String str2, int i) throws IOException {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        OooO00o(file, hashMap, i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Map<String, String> m20396OooO00o(File file, int i) throws IOException {
        return OooO00o(OooO00o(file, i));
    }

    public static String OooO00o(File file, int i) throws IOException {
        byte[] OooO00o2 = m20398OooO00o(file, i);
        if (OooO00o2 == null || OooO00o2.length == 0) {
            return null;
        }
        return new String(OooO00o2, "UTF-8");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20398OooO00o(File file, int i) throws IOException {
        return OooO0O0(file, i);
    }

    public static void OooO00o(File file, Map<String, String> map, int i) throws IOException {
        if (map != null && !map.isEmpty()) {
            HashMap hashMap = new HashMap();
            Map<String, String> OooO00o2 = m20396OooO00o(file, i);
            if (OooO00o2 != null) {
                hashMap.putAll(OooO00o2);
            }
            hashMap.putAll(map);
            m20397OooO00o(file, OooO00o(hashMap), i);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20397OooO00o(File file, String str, int i) throws IOException {
        OooO00o(file, str.getBytes("UTF-8"), i);
    }

    public static void OooO00o(File file, byte[] bArr, int i) throws IOException {
        OooO0O0(file, bArr, i);
    }

    public static ByteBuffer OooO00o(byte[] bArr) throws UnsupportedEncodingException {
        byte[] bytes = OooO0Oo.getBytes("UTF-8");
        int length = bytes.length;
        int length2 = bArr.length;
        ByteBuffer allocate = ByteBuffer.allocate(((length + 4) * 2) + length2);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put(bytes);
        allocate.putInt(length2);
        allocate.put(bArr);
        allocate.putInt(length2);
        allocate.flip();
        return allocate;
    }

    public static String OooO00o(Map<String, String> map) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(f21937OooO00o);
            sb.append(entry.getValue());
            sb.append(OooO0O0);
        }
        return sb.toString();
    }

    public static Map<String, String> OooO00o(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(OooO0O0)) {
            String[] split = str2.split(f21937OooO00o);
            if (split.length == 2) {
                hashMap.put(split[0], split[1]);
            }
        }
        return hashMap;
    }
}
