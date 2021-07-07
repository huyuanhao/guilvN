package com.umeng.message.tag;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.UTrack;
import com.umeng.message.common.C3780d;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.common.inter.ITagManager;
import com.umeng.message.util.C3895e;
import com.umeng.message.util.HttpRequest;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class TagManager {

    /* renamed from: a */
    public static final String f10538a = "com.umeng.message.tag.TagManager";

    /* renamed from: b */
    public static final String f10539b = "ok";

    /* renamed from: c */
    public static final String f10540c = "fail";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    public static TagManager f10541d;

    /* renamed from: f */
    public static ITagManager f10542f;

    /* renamed from: e */
    public Context f10543e;

    public interface TCallBack {
        void onMessage(boolean z, ITagManager.Result result);
    }

    public interface TagListCallBack {
        void onMessage(boolean z, List<String> list);
    }

    public interface WeightedTagListCallBack {
        void onMessage(boolean z, Hashtable<String, Integer> hashtable);
    }

    public TagManager(Context context) {
        this.f10543e = context.getApplicationContext();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private ITagManager.Result m10659f() {
        ITagManager.Result result = new ITagManager.Result(new JSONObject(), false);
        result.remain = MessageSharedPrefs.getInstance(this.f10543e).getTagRemain();
        result.status = "ok";
        result.jsonString = "status:" + result.status + Constants.ACCEPT_TIME_SEPARATOR_SP + " remain:" + result.remain + Constants.ACCEPT_TIME_SEPARATOR_SP + "description:" + result.status;
        return result;
    }

    public static synchronized TagManager getInstance(Context context) {
        TagManager tagManager;
        synchronized (TagManager.class) {
            if (f10541d == null) {
                f10541d = new TagManager(context.getApplicationContext());
                try {
                    f10542f = (ITagManager) Class.forName("com.umeng.message.common.impl.json.JTagManager").getConstructor(Context.class).newInstance(context);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            tagManager = f10541d;
        }
        return tagManager;
    }

    public void addTags(final TCallBack tCallBack, final String... strArr) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.tag.TagManager.RunnableC38661 */

            public void run() {
                ITagManager.Result result = new ITagManager.Result();
                String[] strArr = strArr;
                if (strArr == null || strArr.length == 0) {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(TagManager.f10538a, 0, "No tags");
                    result.setErrors("No tags");
                    tCallBack.onMessage(false, result);
                } else if (!TagManager.this.m10656d()) {
                    UMLog uMLog2 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(TagManager.f10538a, 0, "No utdid or device_token");
                    result.setErrors("No utdid or device_token");
                    tCallBack.onMessage(false, result);
                } else if (TagManager.this.m10658e()) {
                    UMLog uMLog3 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(TagManager.f10538a, 0, "Tag API is disabled by the server");
                    result.setErrors("Tag API is disabled by the server");
                    tCallBack.onMessage(false, result);
                } else {
                    TagManager tagManager = TagManager.this;
                    String a = tagManager.m10644a((TagManager) MessageSharedPrefs.getInstance(tagManager.f10543e).get_addTagsInterval(), (String) strArr);
                    if (!TextUtils.isEmpty(a)) {
                        UMLog uMLog4 = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(TagManager.f10538a, 0, a);
                        result.setErrors(a);
                        tCallBack.onMessage(false, result);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = strArr;
                    if (strArr2.length > 0) {
                        for (String str : strArr2) {
                            if (!MessageSharedPrefs.getInstance(TagManager.this.f10543e).isTagSet(str) && !arrayList.contains(str)) {
                                byte[] bArr = null;
                                try {
                                    bArr = str.getBytes("UTF-8");
                                } catch (UnsupportedEncodingException e) {
                                    e.printStackTrace();
                                }
                                if (bArr.length <= 128 && bArr.length >= 0) {
                                    arrayList.add(str);
                                }
                            }
                        }
                    }
                    if (arrayList.size() == 0) {
                        tCallBack.onMessage(true, TagManager.this.m10659f());
                        return;
                    }
                    try {
                        JSONObject c = TagManager.this.m10654c();
                        c.put("tags", C3895e.m10708a(arrayList));
                        tCallBack.onMessage(true, TagManager.f10542f.addTags(c, strArr));
                    } catch (Exception unused) {
                        UMLog uMLog5 = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(TagManager.f10538a, 0, "添加tag异常");
                    }
                }
            }
        });
    }

    public void addWeightedTags(final TCallBack tCallBack, final Hashtable<String, Integer> hashtable) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.tag.TagManager.RunnableC38672 */

            public void run() {
                ITagManager.Result result = new ITagManager.Result();
                if (!TagManager.this.m10656d()) {
                    result.setErrors("No utdid or device token");
                    UMLog uMLog = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(TagManager.f10538a, 0, "No utdid or device token");
                    tCallBack.onMessage(false, result);
                    return;
                }
                Hashtable hashtable = hashtable;
                if (hashtable == null || hashtable.size() == 0) {
                    UMLog uMLog2 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(TagManager.f10538a, 0, "No weighted tags");
                    result.setErrors("No weighted tags");
                    tCallBack.onMessage(false, result);
                } else if (hashtable.size() > 64) {
                    UMLog uMLog3 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(TagManager.f10538a, 0, "The maximum number of adding weighted tags per request is 64");
                    result.setErrors("The maximum number of adding weighted tags per request is 64");
                    tCallBack.onMessage(false, result);
                } else {
                    TagManager tagManager = TagManager.this;
                    String a = tagManager.m10642a((TagManager) MessageSharedPrefs.getInstance(tagManager.f10543e).getAddWeightedTagsInterval(), (String) hashtable);
                    if (!TextUtils.isEmpty(a)) {
                        UMLog uMLog4 = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(TagManager.f10538a, 0, a);
                        result.setErrors(a);
                        tCallBack.onMessage(false, result);
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (String str : hashtable.keySet()) {
                            jSONObject.put(str, ((Integer) hashtable.get(str)).intValue());
                        }
                        JSONObject c = TagManager.this.m10654c();
                        c.put("tags", jSONObject);
                        tCallBack.onMessage(true, TagManager.f10542f.addWeightedTags(c, hashtable));
                    } catch (Exception e) {
                        e.printStackTrace();
                        UMLog uMLog5 = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(TagManager.f10538a, 0, "添加加权标签异常");
                    }
                }
            }
        });
    }

    public void deleteTags(final TCallBack tCallBack, final String... strArr) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.tag.TagManager.RunnableC38694 */

            public void run() {
                TagManager tagManager = TagManager.this;
                String a = tagManager.m10644a((TagManager) MessageSharedPrefs.getInstance(tagManager.f10543e).get_deleteTagsInterval(), (String) strArr);
                ITagManager.Result result = null;
                if (!TextUtils.isEmpty(a)) {
                    try {
                        throw new Exception(a);
                    } catch (Exception e) {
                        UMLog uMLog = UMConfigure.umDebugLog;
                        String str = TagManager.f10538a;
                        UMLog.mutlInfo(str, 0, "exception:" + e.getMessage());
                        tCallBack.onMessage(false, null);
                    }
                } else if (TagManager.this.m10658e()) {
                    try {
                        throw new Exception("Tag API is disabled by the server.");
                    } catch (Exception e2) {
                        UMLog uMLog2 = UMConfigure.umDebugLog;
                        String str2 = TagManager.f10538a;
                        UMLog.mutlInfo(str2, 0, "exception:" + e2.getMessage());
                        tCallBack.onMessage(false, null);
                    }
                } else if (TagManager.this.m10656d()) {
                    String[] strArr = strArr;
                    if (strArr == null || strArr.length == 0) {
                        try {
                            throw new Exception("No tags");
                        } catch (Exception e3) {
                            UMLog uMLog3 = UMConfigure.umDebugLog;
                            String str3 = TagManager.f10538a;
                            UMLog.mutlInfo(str3, 0, "exception:" + e3.getMessage());
                            tCallBack.onMessage(false, null);
                        }
                    } else {
                        try {
                            JSONObject c = TagManager.this.m10654c();
                            c.put("tags", C3895e.m10709a(strArr));
                            result = TagManager.f10542f.deleteTags(c, strArr);
                            tCallBack.onMessage(true, result);
                        } catch (Exception e4) {
                            UMLog uMLog4 = UMConfigure.umDebugLog;
                            String str4 = TagManager.f10538a;
                            UMLog.mutlInfo(str4, 0, "exception:" + e4.getMessage());
                            tCallBack.onMessage(false, result);
                        }
                    }
                } else {
                    try {
                        throw new Exception("No utdid or device_token");
                    } catch (Exception e5) {
                        UMLog uMLog5 = UMConfigure.umDebugLog;
                        String str5 = TagManager.f10538a;
                        UMLog.mutlInfo(str5, 0, "exception:" + e5.getMessage());
                        tCallBack.onMessage(false, null);
                    }
                }
            }
        });
    }

    public void deleteWeightedTags(final TCallBack tCallBack, final String... strArr) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.tag.TagManager.RunnableC38705 */

            public void run() {
                ITagManager.Result result = new ITagManager.Result();
                if (!TagManager.this.m10656d()) {
                    result.setErrors("缺少utdid或device token");
                    UMLog uMLog = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(TagManager.f10538a, 0, "缺少utdid或device token");
                    tCallBack.onMessage(false, result);
                    return;
                }
                String[] strArr = strArr;
                if (strArr == null || strArr.length == 0) {
                    UMLog uMLog2 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(TagManager.f10538a, 0, "没有加权标签");
                    result.setErrors("没有加权标签");
                    tCallBack.onMessage(false, result);
                } else if (strArr.length > 64) {
                    UMLog uMLog3 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(TagManager.f10538a, 0, "每次请求最多删除64个加权标签");
                    result.setErrors("每次请求最多删除64个加权标签");
                    tCallBack.onMessage(false, result);
                } else {
                    TagManager tagManager = TagManager.this;
                    String b = tagManager.m10651b(MessageSharedPrefs.getInstance(tagManager.f10543e).getDeleteWeightedTagsInterval(), strArr);
                    if (!TextUtils.isEmpty(b)) {
                        UMLog uMLog4 = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(TagManager.f10538a, 0, b);
                        result.setErrors(b);
                        tCallBack.onMessage(false, result);
                        return;
                    }
                    try {
                        JSONObject c = TagManager.this.m10654c();
                        c.put("tags", C3895e.m10709a(strArr));
                        tCallBack.onMessage(true, TagManager.f10542f.deleteWeightedTags(c, strArr));
                    } catch (Exception unused) {
                        UMLog uMLog5 = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(TagManager.f10538a, 0, "删除加权标签异常");
                    }
                }
            }
        });
    }

    public void getTags(final TagListCallBack tagListCallBack) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.tag.TagManager.RunnableC38727 */

            public void run() {
                TagManager tagManager = TagManager.this;
                String a = tagManager.m10643a((TagManager) MessageSharedPrefs.getInstance(tagManager.f10543e).get_getTagsInterval(), (String) false);
                List<String> list = null;
                if (!TextUtils.isEmpty(a)) {
                    try {
                        throw new Exception(a);
                    } catch (Exception e) {
                        UMLog uMLog = UMConfigure.umDebugLog;
                        String str = TagManager.f10538a;
                        UMLog.mutlInfo(str, 0, "exception:" + e.getMessage());
                        tagListCallBack.onMessage(false, null);
                    }
                } else if (TagManager.this.m10658e()) {
                    try {
                        throw new Exception("Tag API被服务器禁止.");
                    } catch (Exception e2) {
                        UMLog uMLog2 = UMConfigure.umDebugLog;
                        String str2 = TagManager.f10538a;
                        UMLog.mutlInfo(str2, 0, "exception:" + e2.getMessage());
                        tagListCallBack.onMessage(false, null);
                    }
                } else if (TagManager.this.m10656d()) {
                    try {
                        list = TagManager.f10542f.getTags(TagManager.this.m10654c());
                        tagListCallBack.onMessage(true, list);
                    } catch (Exception e3) {
                        UMLog uMLog3 = UMConfigure.umDebugLog;
                        String str3 = TagManager.f10538a;
                        UMLog.mutlInfo(str3, 0, "exception:" + e3.getMessage());
                        tagListCallBack.onMessage(false, list);
                    }
                } else {
                    try {
                        throw new Exception("缺少utdid或device token");
                    } catch (Exception e4) {
                        UMLog uMLog4 = UMConfigure.umDebugLog;
                        String str4 = TagManager.f10538a;
                        UMLog.mutlInfo(str4, 0, "exception:" + e4.getMessage());
                        tagListCallBack.onMessage(false, null);
                    }
                }
            }
        });
    }

    public void getWeightedTags(final WeightedTagListCallBack weightedTagListCallBack) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.tag.TagManager.RunnableC38738 */

            public void run() {
                Hashtable<String, Integer> hashtable = new Hashtable<>();
                if (!TagManager.this.m10656d()) {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(TagManager.f10538a, 0, "缺少utdid或device token");
                    weightedTagListCallBack.onMessage(false, hashtable);
                    return;
                }
                TagManager tagManager = TagManager.this;
                String a = tagManager.m10643a((TagManager) MessageSharedPrefs.getInstance(tagManager.f10543e).getListWeightedTagsInterval(), (String) true);
                if (!TextUtils.isEmpty(a)) {
                    UMLog uMLog2 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(TagManager.f10538a, 0, a);
                    weightedTagListCallBack.onMessage(false, hashtable);
                    return;
                }
                try {
                    hashtable = TagManager.f10542f.getWeightedTags(TagManager.this.m10654c());
                    weightedTagListCallBack.onMessage(true, hashtable);
                } catch (Exception unused) {
                    UMLog uMLog3 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(TagManager.f10538a, 0, "获取加权标签列表异常");
                    weightedTagListCallBack.onMessage(false, hashtable);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private JSONObject m10654c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", UTrack.getInstance(this.f10543e).getHeader());
        jSONObject.put("utdid", UmengMessageDeviceConfig.getUtdid(this.f10543e));
        jSONObject.put(MsgConstant.KEY_DEVICE_TOKEN, MessageSharedPrefs.getInstance(this.f10543e).getDeviceToken());
        jSONObject.put("ts", System.currentTimeMillis());
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private boolean m10656d() {
        if (TextUtils.isEmpty(UmengMessageDeviceConfig.getUtdid(this.f10543e))) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10538a, 0, "UTDID为空");
            return false;
        } else if (!TextUtils.isEmpty(MessageSharedPrefs.getInstance(this.f10543e).getDeviceToken())) {
            return true;
        } else {
            UMLog uMLog2 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10538a, 0, "Device token为空");
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private boolean m10658e() {
        boolean z = MessageSharedPrefs.getInstance(this.f10543e).getTagSendPolicy() == 1;
        if (z) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10538a, 2, "Tag API被服务器禁止");
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private String m10651b(String str, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            try {
                byte[] bytes = str2.getBytes("UTF-8");
                if (bytes.length > 128 || bytes.length < 0) {
                    return "部分Tags长度不在限制0到128个字符之间";
                }
                arrayList.add(str2);
            } catch (UnsupportedEncodingException unused) {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f10538a, 0, "UnsupportedEncodingException");
                return "部分Tags长度不在限制0到128个字符之间";
            }
        }
        if (str == null) {
            return null;
        }
        try {
            ITagManager.Result result = new ITagManager.Result(new JSONObject(str), true);
            long currentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() <= 0 || result.interval == 0) {
                return null;
            }
            if ((currentTimeMillis - result.last_requestTime) / 1000 > result.interval) {
                return null;
            }
            return "interval限制";
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private String m10644a(String str, String... strArr) {
        String str2;
        byte[] bArr;
        ArrayList arrayList = new ArrayList();
        if (strArr != null && strArr.length > 0) {
            for (String str3 : strArr) {
                if (!MessageSharedPrefs.getInstance(this.f10543e).isTagSet(str3) && !arrayList.contains(str3)) {
                    try {
                        bArr = str3.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                        bArr = null;
                    }
                    if (bArr.length > 128 || bArr.length < 0) {
                        return "部分Tags长度不在限制0到128个字符之间";
                    }
                    arrayList.add(str3);
                }
            }
        }
        if (str == null) {
            return null;
        }
        try {
            ITagManager.Result result = new ITagManager.Result(new JSONObject(str), false);
            long currentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() <= 0) {
                return null;
            }
            if (result.remain < 0 || arrayList.size() > result.remain) {
                str2 = "Tags数量不能超过1024";
            } else if (result.interval == 0) {
                return null;
            } else {
                if ((currentTimeMillis - result.last_requestTime) / 1000 > result.interval) {
                    return null;
                }
                str2 = "interval限制";
            }
            return str2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0011  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10642a(java.lang.String r8, java.util.Hashtable<java.lang.String, java.lang.Integer> r9) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.tag.TagManager.m10642a(java.lang.String, java.util.Hashtable):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private String m10643a(String str, boolean z) {
        if (str == null) {
            return null;
        }
        try {
            ITagManager.Result result = new ITagManager.Result(new JSONObject(str), z);
            long currentTimeMillis = System.currentTimeMillis();
            if (result.interval == 0) {
                return null;
            }
            if ((currentTimeMillis - result.last_requestTime) / 1000 > result.interval) {
                return null;
            }
            return "interval限制";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private void m10647a(final TCallBack tCallBack, final String... strArr) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.tag.TagManager.RunnableC38683 */

            public void run() {
                ITagManager.Result result = null;
                if (TagManager.this.m10658e()) {
                    try {
                        throw new Exception("Tag API is disabled by the server.");
                    } catch (Exception e) {
                        e.printStackTrace();
                        tCallBack.onMessage(false, null);
                    }
                } else if (TagManager.this.m10656d()) {
                    String[] strArr = strArr;
                    if (strArr == null || strArr.length == 0) {
                        try {
                            throw new Exception("No tags");
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            tCallBack.onMessage(false, null);
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                        if (arrayList.size() == 0) {
                            tCallBack.onMessage(true, TagManager.this.m10659f());
                            return;
                        }
                        try {
                            JSONObject c = TagManager.this.m10654c();
                            c.put("tags", C3895e.m10708a(arrayList));
                            result = TagManager.f10542f.update(c, strArr);
                            tCallBack.onMessage(true, result);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            tCallBack.onMessage(true, result);
                        }
                    }
                } else {
                    try {
                        throw new Exception("No utdid or device_token");
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        tCallBack.onMessage(false, null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m10646a(final TCallBack tCallBack) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.tag.TagManager.RunnableC38716 */

            public void run() {
                ITagManager.Result result = null;
                if (TagManager.this.m10658e()) {
                    try {
                        throw new Exception("Tag API被服务器禁止");
                    } catch (Exception e) {
                        e.printStackTrace();
                        tCallBack.onMessage(false, null);
                    }
                } else if (TagManager.this.m10656d()) {
                    try {
                        result = TagManager.f10542f.reset(TagManager.this.m10654c());
                        tCallBack.onMessage(true, result);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        tCallBack.onMessage(false, result);
                    }
                } else {
                    try {
                        throw new Exception("缺少utdid或device token");
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        tCallBack.onMessage(false, null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static JSONObject m10645a(JSONObject jSONObject, String str) throws JSONException {
        String body = HttpRequest.post(str).acceptJson().contentType(HttpRequest.CONTENT_TYPE_JSON).send(jSONObject.toString()).body("UTF-8");
        UMLog uMLog = UMConfigure.umDebugLog;
        String str2 = f10538a;
        UMLog.mutlInfo(str2, 2, "postJson() url=" + str + "\n request = " + jSONObject + "\n response = " + body);
        return new JSONObject(body);
    }
}
