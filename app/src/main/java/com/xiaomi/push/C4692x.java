package com.xiaomi.push;

import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.x */
public class C4692x {

    /* renamed from: a */
    public static final HashMap<String, String> f13413a;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f13413a = hashMap;
        hashMap.put("FFD8FF", BitmapUtils.IMAGE_KEY_SUFFIX);
        f13413a.put("89504E47", "png");
        f13413a.put("47494638", "gif");
        f13413a.put("474946", "gif");
        f13413a.put("424D", "bmp");
    }

    /* renamed from: a */
    public static long m14234a(File file) {
        long j = 0;
        try {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                j += listFiles[i].isDirectory() ? m14234a(listFiles[i]) : listFiles[i].length();
            }
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
        return j;
    }
}
