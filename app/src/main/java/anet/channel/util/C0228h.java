package anet.channel.util;

import anet.channel.request.Request;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.umeng.socialize.handler.UMSSOHandler;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anet.channel.util.h */
public class C0228h {

    /* renamed from: a */
    public static Map<String, Integer> f488a;

    static {
        HashMap hashMap = new HashMap();
        f488a = hashMap;
        hashMap.put("tpatch", 3);
        f488a.put("so", 3);
        f488a.put(UMSSOHandler.JSON, 3);
        f488a.put("html", 4);
        f488a.put("htm", 4);
        f488a.put("css", 5);
        f488a.put("js", 5);
        f488a.put("webp", 6);
        f488a.put("png", 6);
        f488a.put(BitmapUtils.IMAGE_KEY_SUFFIX, 6);
        f488a.put("do", 6);
        f488a.put("zip", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f488a.put("bin", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        f488a.put("apk", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
    }

    /* renamed from: a */
    public static int m329a(Request request) {
        Integer num;
        if (request == null) {
            throw new NullPointerException("url is null!");
        } else if (request.getHeaders().containsKey(HttpConstant.X_PV)) {
            return 1;
        } else {
            String trySolveFileExtFromUrlPath = HttpHelper.trySolveFileExtFromUrlPath(request.getHttpUrl().path());
            if (trySolveFileExtFromUrlPath == null || (num = f488a.get(trySolveFileExtFromUrlPath)) == null) {
                return 6;
            }
            return num.intValue();
        }
    }
}
