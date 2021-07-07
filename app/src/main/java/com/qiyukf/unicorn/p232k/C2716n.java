package com.qiyukf.unicorn.p232k;

import android.os.Handler;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nim.uikit.C1877b;
import com.qiyukf.nimlib.p179d.C2209b;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2323f;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2562ab;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2618n;
import com.qiyukf.unicorn.p213f.p223b.C2632a;
import com.qiyukf.unicorn.p213f.p223b.C2633b;
import com.qiyukf.unicorn.p229h.C2667c;
import com.umeng.socialize.handler.UMSSOHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.k.n */
public final class C2716n {

    /* renamed from: com.qiyukf.unicorn.k.n$a */
    public interface AbstractC2721a {
        /* renamed from: a */
        void mo36474a(int i);

        /* renamed from: a */
        void mo36475a(JSONArray jSONArray);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fc A[Catch:{ JSONException -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fd A[Catch:{ JSONException -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014d A[Catch:{ JSONException -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0150 A[Catch:{ JSONException -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0167 A[Catch:{ JSONException -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017b A[Catch:{ JSONException -> 0x0181 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.qiyukf.nimlib.p195h.C2313a m6278a(org.json.JSONObject r7) {
        /*
        // Method dump skipped, instructions count: 480
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p232k.C2716n.m6278a(org.json.JSONObject):com.qiyukf.nimlib.h.a");
    }

    /* renamed from: a */
    public static void m6279a() {
        C2667c.m6115a((AbstractC2597e) new C2618n(), C2667c.m6116a(), false);
    }

    /* renamed from: a */
    public static void m6280a(final C2562ab abVar) {
        new Thread(new Runnable() {
            /* class com.qiyukf.unicorn.p232k.C2716n.RunnableC27182 */

            public final void run() {
                String str;
                String str2;
                C2562ab abVar = abVar;
                HashMap hashMap = new HashMap();
                hashMap.put("appKey", C2452d.m5371d());
                hashMap.put("fromAccount", C1877b.m3581b());
                hashMap.put(UMSSOHandler.ACCESSTOKEN, abVar.mo36015a());
                hashMap.put("beginTime", String.valueOf(System.currentTimeMillis() - 604800000));
                hashMap.put("endTime", String.valueOf(System.currentTimeMillis()));
                hashMap.put("limit", "20");
                C27191 r3 = new AbstractC2721a() {
                    /* class com.qiyukf.unicorn.p232k.C2716n.RunnableC27182.C27191 */

                    @Override // com.qiyukf.unicorn.p232k.C2716n.AbstractC2721a
                    /* renamed from: a */
                    public final void mo36474a(int i) {
                        C1709a.m3011a("请求未读消息接口失败 code 为：", String.valueOf(i));
                    }

                    @Override // com.qiyukf.unicorn.p232k.C2716n.AbstractC2721a
                    /* renamed from: a */
                    public final void mo36475a(JSONArray jSONArray) {
                        C2437b.m5242a((Boolean) true);
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(C2716n.m6278a(C1810b.m3429b(jSONArray, i)));
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C2313a aVar = (C2313a) it.next();
                            if (C2323f.m5032b(aVar.getUuid()) != 0 || ((aVar.getUuid().contains("#") && C2323f.m5032b(aVar.getUuid().substring(aVar.getUuid().indexOf("#") + 1)) != 0) || (aVar.getUuid().contains("#") && C2323f.m5032b(aVar.getUuid().substring(aVar.getUuid().lastIndexOf("#") + 1)) != 0))) {
                                it.remove();
                            }
                        }
                        if (arrayList.size() != 0) {
                            C2323f.m5031a(arrayList);
                            Collections.sort(arrayList, new Comparator<C2313a>() {
                                /* class com.qiyukf.unicorn.p232k.C2716n.C27203 */

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                @Override // java.util.Comparator
                                public final /* synthetic */ int compare(C2313a aVar, C2313a aVar2) {
                                    return (int) (aVar.getTime() - aVar2.getTime());
                                }
                            });
                            C2209b.m4601a(arrayList);
                        }
                    }
                };
                try {
                    String a = C2632a.m5993a("/webapi/sdk/user/message/history", hashMap);
                    C1709a.m3011a("服务端返回未读消息的 json", a);
                    JSONObject a2 = C1810b.m3420a(a);
                    if (a2.getInt("code") == 200) {
                        r3.mo36475a(a2.getJSONArray("result"));
                    } else {
                        r3.mo36474a(a2.getInt("code"));
                    }
                } catch (C2633b e) {
                    e = e;
                    str = "请求 url 为" + "/webapi/sdk/user/message/history";
                    str2 = "YSFHttpClient.httpGet失败";
                    C1709a.m3013a(str2, str, e);
                } catch (JSONException e2) {
                    e = e2;
                    str = "请求 url 为" + "/webapi/sdk/user/message/history";
                    str2 = "解析未读消息 json 失败";
                    C1709a.m3013a(str2, str, e);
                }
            }
        }).start();
    }

    /* renamed from: a */
    public static synchronized void m6281a(Boolean bool) {
        synchronized (C2716n.class) {
            C2437b.m5242a((Boolean) false);
            m6279a();
            if (bool.booleanValue()) {
                new Handler().postDelayed(new Runnable() {
                    /* class com.qiyukf.unicorn.p232k.C2716n.RunnableC27171 */

                    public final void run() {
                        if (!C2437b.m5287k().booleanValue()) {
                            C2716n.m6279a();
                        }
                    }
                }, WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
            }
        }
    }
}
