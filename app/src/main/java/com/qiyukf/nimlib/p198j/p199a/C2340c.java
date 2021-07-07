package com.qiyukf.nimlib.p198j.p199a;

import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.unicorn.C2364R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.qiyukf.nimlib.j.a.c */
public final class C2340c {

    /* renamed from: a */
    public static final Map<String, Integer> f4692a;

    static {
        HashMap hashMap = new HashMap();
        f4692a = hashMap;
        hashMap.put("xls", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_xls));
        f4692a.put("xlsx", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_xls));
        f4692a.put("csv", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_xls));
        f4692a.put("ppt", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_ppt));
        f4692a.put("pptx", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_ppt));
        f4692a.put("doc", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_word));
        f4692a.put("docx", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_word));
        f4692a.put("pdf", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_pdf));
        f4692a.put("bmp", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_jpg));
        f4692a.put(BitmapUtils.IMAGE_KEY_SUFFIX, Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_jpg));
        f4692a.put("jpeg", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_jpg));
        f4692a.put("png", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_jpg));
        f4692a.put("gif", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_jpg));
        f4692a.put("exif", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_jpg));
        f4692a.put("mp3", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp3));
        f4692a.put("wma", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp3));
        f4692a.put("ape", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp3));
        f4692a.put("flac", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp3));
        f4692a.put("wav", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp3));
        f4692a.put("aac", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp3));
        f4692a.put("ogg", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp3));
        f4692a.put("avi", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp4));
        f4692a.put("mov", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp4));
        f4692a.put("mkv", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp4));
        f4692a.put("rmvb", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp4));
        f4692a.put("wmv", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp4));
        f4692a.put("3gp", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp4));
        f4692a.put("flv", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp4));
        f4692a.put("mp4", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp4));
        f4692a.put("mpg", Integer.valueOf(C2364R.C2366drawable.ysf_message_file_new_icon_mp4));
    }

    /* renamed from: a */
    public static int m5083a(String str, boolean z) {
        Integer num = f4692a.get(C1807b.m3416a(str).toLowerCase());
        return num == null ? C2364R.C2366drawable.ysf_message_file_new_icon_unknown : num.intValue();
    }
}
