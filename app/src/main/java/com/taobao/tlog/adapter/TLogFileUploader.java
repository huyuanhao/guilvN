package com.taobao.tlog.adapter;

import android.content.Context;
import com.taobao.tao.log.upload.FileUploadListener;
import com.taobao.tao.log.upload.LogFileUploadManager;
import java.util.HashMap;
import java.util.Map;

public class TLogFileUploader {
    public static boolean isValid;

    static {
        try {
            Class.forName("com.taobao.tao.log.TLog");
            isValid = true;
        } catch (ClassNotFoundException unused) {
            isValid = false;
        }
    }

    public static void uploadLogFile(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        uploadLogFile(context, hashMap);
    }

    @Deprecated
    public static void uploadLogFile(Context context, Map<String, Object> map) {
    }

    public void uploadWithFilePath(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        new LogFileUploadManager(context).uploadWithFilePath(str, str2, str3, str4, map, new FileUploadListener() {
            /* class com.taobao.tlog.adapter.TLogFileUploader.C32122 */

            public void onError(String str, String str2, String str3) {
                String str4 = "uploadWithFilePath failure! " + str2 + " msg:" + str3;
            }

            public void onSucessed(String str, String str2) {
            }
        });
    }

    public static void uploadLogFile(Context context, String str, String str2, Map<String, String> map) {
        new LogFileUploadManager(context).uploadWithFilePrefix(str, str2, map, new FileUploadListener() {
            /* class com.taobao.tlog.adapter.TLogFileUploader.C32111 */

            public void onError(String str, String str2, String str3) {
                String str4 = "uploadWithFilePrefix failure!" + str2 + " msg:" + str3;
            }

            public void onSucessed(String str, String str2) {
            }
        });
    }

    @Deprecated
    public static void uploadLogFile(Context context, Map<String, Object> map, String str) {
        if (isValid) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                Object obj = map.get("type");
                if (!(obj instanceof String) || !"exception".equalsIgnoreCase((String) obj)) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if (entry.getValue() instanceof String) {
                            hashMap.put(key, (String) entry.getValue());
                        }
                    }
                } else {
                    return;
                }
            }
            new LogFileUploadManager(context).uploadWithFilePrefix("FEEDBACK", "taobao4android_feedback_21646297", hashMap, new FileUploadListener() {
                /* class com.taobao.tlog.adapter.TLogFileUploader.C32133 */

                public void onError(String str, String str2, String str3) {
                    String str4 = "uploadWithFilePrefix failure! " + str2 + " msg:" + str3;
                }

                public void onSucessed(String str, String str2) {
                }
            });
        }
    }
}
