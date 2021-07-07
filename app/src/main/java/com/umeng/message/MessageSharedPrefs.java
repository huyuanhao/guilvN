package com.umeng.message;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.common.C3780d;
import com.umeng.message.proguard.C3819h;
import com.umeng.message.proguard.C3848l;
import com.umeng.message.proguard.C3849m;
import com.umeng.message.provider.C3857a;
import java.util.ArrayList;
import java.util.Calendar;
import org.android.agoo.common.AgooConstants;

public class MessageSharedPrefs {

    /* renamed from: a */
    public static final String f9872a = "com.umeng.message.MessageSharedPrefs";

    /* renamed from: c */
    public static MessageSharedPrefs f9873c = null;

    /* renamed from: d */
    public static final String f9874d = "tempkey";

    /* renamed from: e */
    public static final String f9875e = "tempvalue";

    /* renamed from: b */
    public Context f9876b;

    /* renamed from: f */
    public SharedPreferences f9877f;

    /* renamed from: g */
    public int f9878g = 0;

    public MessageSharedPrefs(Context context) {
        this.f9876b = context;
        if (Build.VERSION.SDK_INT > 11) {
            this.f9878g = 0 | 4;
        }
        this.f9877f = context.getSharedPreferences(MsgConstant.PUSH_SHARED_PREFERENCES_FILE_NAME, this.f9878g);
    }

    public static synchronized MessageSharedPrefs getInstance(Context context) {
        MessageSharedPrefs messageSharedPrefs;
        synchronized (MessageSharedPrefs.class) {
            if (f9873c == null) {
                f9873c = new MessageSharedPrefs(context);
            }
            messageSharedPrefs = f9873c;
        }
        return messageSharedPrefs;
    }

    public void addAlias(String str, String str2, int i, int i2, String str3) {
        try {
            m10220a(str2, str3);
            String[] strArr = {str, str2, i + ""};
            ContentResolver contentResolver = this.f9876b.getContentResolver();
            C3857a.m10616a(this.f9876b);
            Cursor query = contentResolver.query(C3857a.f10479d, new String[]{"error"}, "alias=? and type=? and exclusive=?", strArr, "time desc");
            if (query == null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("type", str2);
                contentValues.put("alias", str);
                contentValues.put(C3848l.f10379A, Integer.valueOf(i));
                contentValues.put("error", Integer.valueOf(i2));
                contentValues.put("message", str3);
                ContentResolver contentResolver2 = this.f9876b.getContentResolver();
                C3857a.m10616a(this.f9876b);
                contentResolver2.insert(C3857a.f10479d, contentValues);
            } else if (query.getCount() > 0) {
                query.moveToFirst();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("time", Long.valueOf(System.currentTimeMillis()));
                contentValues2.put("type", str2);
                contentValues2.put("alias", str);
                contentValues2.put(C3848l.f10379A, Integer.valueOf(i));
                contentValues2.put("error", Integer.valueOf(i2));
                contentValues2.put("message", str3);
                ContentResolver contentResolver3 = this.f9876b.getContentResolver();
                C3857a.m10616a(this.f9876b);
                contentResolver3.update(C3857a.f10479d, contentValues2, "alias=? and type=? and exclusive=?", strArr);
            } else {
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("time", Long.valueOf(System.currentTimeMillis()));
                contentValues3.put("type", str2);
                contentValues3.put("alias", str);
                contentValues3.put(C3848l.f10379A, Integer.valueOf(i));
                contentValues3.put("error", Integer.valueOf(i2));
                contentValues3.put("message", str3);
                ContentResolver contentResolver4 = this.f9876b.getContentResolver();
                C3857a.m10616a(this.f9876b);
                contentResolver4.insert(C3857a.f10479d, contentValues3);
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addTags(String... strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String format = String.format("UMENG_TAG_%s", strArr[i]);
            if (!Boolean.valueOf(m10221b(format, "false")).booleanValue()) {
                m10222c(format, "true");
                m10222c("UMENG_TAG_COUNT", (getTagCount() + 1) + "");
            }
        }
    }

    public void add_addAliasInterval(String str) {
        if (str != null) {
            m10222c(MsgConstant.KEY_ADDALIAS, str);
        }
    }

    public void add_addTagsInterval(String str) {
        if (str != null) {
            m10222c(MsgConstant.KEY_ADDTAGS, str);
        }
    }

    public void add_deleteAliasInterval(String str) {
        if (str != null) {
            m10222c(MsgConstant.KEY_DELETEALIAS, str);
        }
    }

    public void add_deleteTagsInterval(String str) {
        if (str != null) {
            m10222c(MsgConstant.KEY_DELETETAGS, str);
        }
    }

    public void add_getTagsInteral(String str) {
        if (str != null) {
            m10222c(MsgConstant.KEY_GETTAGS, str);
        }
    }

    public void add_setAliasInterval(String str) {
        if (str != null) {
            m10222c("setAlias", str);
        }
    }

    /* renamed from: b */
    public int mo39491b() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_NO_DISTURB_START_MINUTE, "0")).intValue();
    }

    /* renamed from: c */
    public int mo39493c() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_NO_DISTURB_END_HOUR, MsgConstant.MESSAGE_NOTIFY_ARRIVAL)).intValue();
    }

    /* renamed from: d */
    public int mo39494d() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_NO_DISTURB_END_MINUTE, "0")).intValue();
    }

    /* renamed from: e */
    public void mo39495e() {
        m10222c(MsgConstant.KEY_ENEABLED, "true");
    }

    /* renamed from: f */
    public void mo39496f() {
        m10222c(MsgConstant.KEY_ENEABLED, "false");
    }

    public boolean finishTransferedCacheFileDataToSQL() {
        return m10221b(MsgConstant.KEY_CACHE_FILE_TRANSFER_TO_SQL, "true").equalsIgnoreCase("true");
    }

    /* renamed from: g */
    public boolean mo39498g() {
        return m10221b(MsgConstant.KEY_ENEABLED, "false").equalsIgnoreCase("true");
    }

    public String getAddWeightedTagsInterval() {
        return m10221b(MsgConstant.KEY_ADD_WEIGHTED_TAGS, null);
    }

    public int getAppLaunchLogSendPolicy() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_APP_LAUNCH_LOG_SEND_POLICY, "-1")).intValue();
    }

    public String getAppVersion() {
        return m10221b("app_version", "");
    }

    public int getDaRegisterSendPolicy() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_APP_DAREGISTER_LOG_SEND_POLICY, "-1")).intValue();
    }

    public String getDeleteWeightedTagsInterval() {
        return m10221b(MsgConstant.KEY_DELETE_WEIGHTED_TAGS, null);
    }

    public String getDeviceToken() {
        return m10221b(MsgConstant.KEY_DEVICE_TOKEN, "");
    }

    public int getDisplayNotificationNumber() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_NOTIFICATION_NUMBER, "1")).intValue();
    }

    public boolean getHasRegister() {
        return m10221b(MsgConstant.KEY_HASREGISTER, "false").equalsIgnoreCase("true");
    }

    public String getLastAlias(int i, String str) {
        String str2 = "";
        try {
            String[] strArr = {str, i + str2, "0", "2"};
            ContentResolver contentResolver = this.f9876b.getContentResolver();
            C3857a.m10616a(this.f9876b);
            Cursor query = contentResolver.query(C3857a.f10479d, new String[]{"alias"}, "type=? and exclusive=? and (error=? or error = ?)", strArr, "time desc");
            if (query != null && query.getCount() > 0) {
                query.moveToFirst();
                str2 = query.getString(query.getColumnIndex("alias"));
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    public String getLastMessageMsgID() {
        return m10221b(MsgConstant.KEY_LAST_MSG_ID, "");
    }

    public String getListWeightedTagsInterval() {
        return m10221b(MsgConstant.KEY_LIST_WEIGHTED_TAGS, null);
    }

    public int getLocationInterval() {
        return Integer.valueOf(m10221b("interval", "600")).intValue();
    }

    public String getMessageAppKey() {
        return this.f9877f.getString(MsgConstant.KEY_UMENG_MESSAGE_APP_KEY, "");
    }

    public String getMessageAppSecret() {
        return this.f9877f.getString(MsgConstant.KEY_UMENG_MESSAGE_APP_SECRET, "");
    }

    public String getMessageChannel() {
        return this.f9877f.getString(MsgConstant.KEY_UMENG_MESSAGE_APP_CHANNEL, "");
    }

    public int getMuteDuration() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_MUTE_DURATION, "60")).intValue();
    }

    public boolean getNotificaitonOnForeground() {
        return m10221b(MsgConstant.KEY_SET_NOTIFICATION_ON_FOREGROUND, "true").equals("true");
    }

    public int getNotificationPlayLights() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_SET_NOTIFICATION_PLAY_LIGHTS, "0")).intValue();
    }

    public int getNotificationPlaySound() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_SET_NOTIFICATION_PLAY_SOUND, "0")).intValue();
    }

    public int getNotificationPlayVibrate() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_SET_NOTIFICATION_PLAY_VIBRATE, "0")).intValue();
    }

    public String getPushIntentServiceClass() {
        String b = m10221b(MsgConstant.KEY_PUSH_INTENT_SERVICE_CLASSNAME, "");
        if (b.equalsIgnoreCase("")) {
            return "";
        }
        try {
            Class.forName(b);
            return b;
        } catch (ClassNotFoundException unused) {
            return "";
        }
    }

    public int getRegisterTimes() {
        return Integer.valueOf(getInstance(this.f9876b).m10221b(MsgConstant.KEY_REGISTER_TIMES, "0")).intValue();
    }

    public String getResourcePackageName() {
        return m10221b(MsgConstant.KEY_SET_RESOURCE_PACKAGENAME, "");
    }

    public int getSerialNo() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_SERIA_NO, "1")).intValue();
    }

    public int getTagCount() {
        return Integer.valueOf(m10221b("UMENG_TAG_COUNT", "0")).intValue();
    }

    public int getTagRemain() {
        return Integer.valueOf(m10221b(MsgConstant.KET_UMENG_TAG_REMAIN, "64")).intValue();
    }

    public int getTagSendPolicy() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_TAG_SEND_POLICY, "-1")).intValue();
    }

    public String getUcode() {
        return getInstance(this.f9876b).m10221b(MsgConstant.KEY_UCODE, "");
    }

    public String getUmid() {
        return this.f9877f.getString(MsgConstant.f9885a, "");
    }

    public String get_addAliasInterval() {
        return m10221b(MsgConstant.KEY_ADDALIAS, null);
    }

    public String get_addTagsInterval() {
        return m10221b(MsgConstant.KEY_ADDTAGS, null);
    }

    public String get_deleteALiasInterval() {
        return m10221b(MsgConstant.KEY_DELETEALIAS, null);
    }

    public String get_deleteTagsInterval() {
        return m10221b(MsgConstant.KEY_DELETETAGS, null);
    }

    public String get_getTagsInterval() {
        return m10221b(MsgConstant.KEY_GETTAGS, null);
    }

    public String get_setAliasInterval() {
        return m10221b("setAlias", null);
    }

    /* renamed from: h */
    public String mo39534h() {
        return this.f9877f.getString(MsgConstant.KEY_NOTIFICATION_CHANNEL, "");
    }

    public boolean hasAppLaunchLogSentToday() {
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTimeInMillis(C3849m.m10581a(this.f9876b).mo39940f());
        } catch (Exception e) {
            e.printStackTrace();
            e.toString();
        }
        Calendar instance2 = Calendar.getInstance();
        if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
            return true;
        }
        return false;
    }

    public boolean hasMessageResourceDownloaded(String str) {
        return m10221b(MsgConstant.KEY_MSG_RESOURCE_DOWNLOAD_PREFIX + str, "false").equals("true");
    }

    public boolean hasTransferedCacheFileDataToSQL() {
        return m10221b(MsgConstant.KEY_CACHE_FILE_TRANSFER_TO_SQL, "false").equalsIgnoreCase("true");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ea, code lost:
        if (r3 != null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00ec, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00f8, code lost:
        if (0 == 0) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00fb, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isAliasSet(int r13, java.lang.String r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.MessageSharedPrefs.isAliasSet(int, java.lang.String, java.lang.String):boolean");
    }

    public boolean isEnabled() {
        String b = m10221b(MsgConstant.KEY_ISENABLED, "");
        return b.equalsIgnoreCase("true") || b.equalsIgnoreCase("");
    }

    public boolean isTagSet(String str) {
        return Boolean.valueOf(m10221b(String.format("UMENG_TAG_%s", str), "false")).booleanValue();
    }

    public void removeAlias(int i, String str, String str2) {
        try {
            String[] strArr = {str2, str, i + ""};
            ContentResolver contentResolver = this.f9876b.getContentResolver();
            C3857a.m10616a(this.f9876b);
            contentResolver.delete(C3857a.f10479d, "type=? and alias=? and exclusive=? ", strArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeKeyAndValue(final String str) {
        ThreadPoolExecutorFactory.execute(new Runnable() {
            /* class com.umeng.message.MessageSharedPrefs.RunnableC37493 */

            public void run() {
                Cursor cursor = null;
                try {
                    new ContentValues().put("tempkey", str);
                    ContentResolver contentResolver = MessageSharedPrefs.this.f9876b.getContentResolver();
                    C3857a.m10616a(MessageSharedPrefs.this.f9876b);
                    cursor = contentResolver.query(C3857a.f10478c, new String[]{"tempvalue"}, null, null, null);
                    if (cursor != null) {
                        String[] strArr = {str};
                        ContentResolver contentResolver2 = MessageSharedPrefs.this.f9876b.getContentResolver();
                        C3857a.m10616a(MessageSharedPrefs.this.f9876b);
                        contentResolver2.delete(C3857a.f10478c, "tempkey=?", strArr);
                    }
                    if (cursor == null) {
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (0 == 0) {
                        return;
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
                cursor.close();
            }
        });
    }

    public void removeMessageAppKey() {
        this.f9877f.edit().remove(MsgConstant.KEY_UMENG_MESSAGE_APP_KEY).commit();
    }

    public void removeMessageAppSecret() {
        this.f9877f.edit().remove(MsgConstant.KEY_UMENG_MESSAGE_APP_SECRET).commit();
    }

    public void removeMessageResouceRecord(String str) {
        removeKeyAndValue(MsgConstant.KEY_MSG_RESOURCE_DOWNLOAD_PREFIX + str);
    }

    public void removeTags(String... strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String format = String.format("UMENG_TAG_%s", strArr[i]);
            if (Boolean.valueOf(m10221b(format, "false")).booleanValue()) {
                removeKeyAndValue(format);
                StringBuilder sb = new StringBuilder();
                sb.append(getTagCount() - 1);
                sb.append("");
                m10222c("UMENG_TAG_COUNT", sb.toString());
            }
        }
    }

    public void resetTags() {
        Cursor cursor = null;
        try {
            ArrayList arrayList = new ArrayList();
            ContentResolver contentResolver = this.f9876b.getContentResolver();
            C3857a.m10616a(this.f9876b);
            cursor = contentResolver.query(C3857a.f10478c, null, null, null, null);
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    String string = cursor.getString(cursor.getColumnIndex("tempkey"));
                    if (string.contains("UMENG_TAG")) {
                        arrayList.add(string);
                    }
                    cursor.moveToNext();
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                String[] strArr = {(String) arrayList.get(i)};
                ContentResolver contentResolver2 = this.f9876b.getContentResolver();
                C3857a.m10616a(this.f9876b);
                contentResolver2.delete(C3857a.f10478c, "tempkey=?", strArr);
            }
            if (cursor == null) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (0 == 0) {
                return;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
    }

    public void setAddWeightedTagsInterval(String str) {
        if (!TextUtils.isEmpty(str)) {
            m10222c(MsgConstant.KEY_ADD_WEIGHTED_TAGS, str);
        }
    }

    public void setAppLaunchLogSendPolicy(int i) {
        m10222c(MsgConstant.KEY_APP_LAUNCH_LOG_SEND_POLICY, i + "");
    }

    public void setAppVersion(String str) {
        if (str == null) {
            removeKeyAndValue("app_version");
        } else {
            m10222c("app_version", str);
        }
    }

    public void setDaRegisterSendPolicy(int i) {
        m10222c(MsgConstant.KEY_APP_DAREGISTER_LOG_SEND_POLICY, i + "");
    }

    public void setDeleteWeightedTagsInterval(String str) {
        if (!TextUtils.isEmpty(str)) {
            m10222c(MsgConstant.KEY_DELETE_WEIGHTED_TAGS, str);
        }
    }

    public void setDeviceToken(String str) {
        if (str == null) {
            removeKeyAndValue(MsgConstant.KEY_DEVICE_TOKEN);
        } else {
            m10222c(MsgConstant.KEY_DEVICE_TOKEN, str);
        }
    }

    public void setDisplayNotificationNumber(int i) {
        m10222c(MsgConstant.KEY_NOTIFICATION_NUMBER, i + "");
    }

    public void setHasResgister(boolean z) {
        m10222c(MsgConstant.KEY_HASREGISTER, String.valueOf(z));
    }

    public void setIsEnabled(boolean z) {
        m10222c(MsgConstant.KEY_ISENABLED, String.valueOf(z));
    }

    public void setLastMessageMsgID(String str) {
        m10222c(MsgConstant.KEY_LAST_MSG_ID, str);
    }

    public void setListWeightedTagsInterval(String str) {
        if (!TextUtils.isEmpty(str)) {
            m10222c(MsgConstant.KEY_LIST_WEIGHTED_TAGS, str);
        }
    }

    public void setLocationInterval(int i) {
        if (i < 2 || i > 1800) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo("LBS", 2, "LBS的请求间隔应该在2至1800秒之间");
            return;
        }
        m10222c("interval", i + "");
    }

    public void setMessageAppKey(String str) {
        if (!C3819h.m10565d(this.f9876b)) {
            return;
        }
        if (str == null || str.equals("")) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9872a, 0, "appkey不能为null");
            return;
        }
        this.f9877f.edit().putString(MsgConstant.KEY_UMENG_MESSAGE_APP_KEY, str).commit();
    }

    public void setMessageAppSecret(String str) {
        if (!C3819h.m10565d(this.f9876b)) {
            return;
        }
        if (str == null || str.equals("")) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9872a, 0, "appSecret不能为null");
            return;
        }
        this.f9877f.edit().putString(MsgConstant.KEY_UMENG_MESSAGE_APP_SECRET, str).commit();
    }

    public void setMessageChannel(String str) {
        if (C3819h.m10565d(this.f9876b)) {
            this.f9877f.edit().putString(MsgConstant.KEY_UMENG_MESSAGE_APP_CHANNEL, str).commit();
            C3780d.m10347a(new Runnable() {
                /* class com.umeng.message.MessageSharedPrefs.RunnableC37471 */

                public void run() {
                    UTrack.getInstance(MessageSharedPrefs.this.f9876b).updateHeader();
                }
            });
        }
    }

    public void setMessageResourceDownloaded(String str) {
        m10222c(MsgConstant.KEY_MSG_RESOURCE_DOWNLOAD_PREFIX + str, "true");
    }

    public void setMuteDuration(int i) {
        m10222c(MsgConstant.KEY_MUTE_DURATION, i + "");
    }

    public void setNotificaitonOnForeground(boolean z) {
        m10222c(MsgConstant.KEY_SET_NOTIFICATION_ON_FOREGROUND, String.valueOf(z));
    }

    public void setNotificationPlayLights(int i) {
        m10222c(MsgConstant.KEY_SET_NOTIFICATION_PLAY_LIGHTS, i + "");
    }

    public void setNotificationPlaySound(int i) {
        m10222c(MsgConstant.KEY_SET_NOTIFICATION_PLAY_SOUND, i + "");
    }

    public void setNotificationPlayVibrate(int i) {
        m10222c(MsgConstant.KEY_SET_NOTIFICATION_PLAY_VIBRATE, i + "");
    }

    public <U extends UmengMessageService> void setPushIntentServiceClass(Class<U> cls) {
        if (cls == null) {
            removeKeyAndValue(MsgConstant.KEY_PUSH_INTENT_SERVICE_CLASSNAME);
        } else {
            m10222c(MsgConstant.KEY_PUSH_INTENT_SERVICE_CLASSNAME, cls.getName());
        }
    }

    public void setRegisterTimes(int i) {
        m10222c(MsgConstant.KEY_REGISTER_TIMES, i + "");
    }

    public void setResourcePackageName(String str) {
        m10222c(MsgConstant.KEY_SET_RESOURCE_PACKAGENAME, str);
    }

    public void setSerialNo(int i) {
        m10222c(MsgConstant.KEY_SERIA_NO, i + "");
    }

    public void setTagRemain(int i) {
        m10222c(MsgConstant.KET_UMENG_TAG_REMAIN, i + "");
    }

    public void setTagSendPolicy(int i) {
        m10222c(MsgConstant.KEY_TAG_SEND_POLICY, i + "");
    }

    public void setUcode(String str) {
        m10222c(MsgConstant.KEY_UCODE, str);
    }

    public void setUmid(String str) {
        this.f9877f.edit().putString(MsgConstant.f9885a, str).apply();
    }

    /* renamed from: a */
    private void m10220a(String str, String str2) {
        String[] strArr = {str, str2};
        ContentResolver contentResolver = this.f9876b.getContentResolver();
        C3857a.m10616a(this.f9876b);
        contentResolver.delete(C3857a.f10479d, "type=? and message=? ", strArr);
    }

    /* renamed from: c */
    private void m10222c(final String str, final String str2) {
        ThreadPoolExecutorFactory.execute(new Runnable() {
            /* class com.umeng.message.MessageSharedPrefs.RunnableC37482 */

            public void run() {
                Cursor cursor = null;
                try {
                    String[] strArr = {str};
                    ContentResolver contentResolver = MessageSharedPrefs.this.f9876b.getContentResolver();
                    C3857a.m10616a(MessageSharedPrefs.this.f9876b);
                    cursor = contentResolver.query(C3857a.f10478c, new String[]{"tempvalue"}, "tempkey=?", strArr, null);
                    if (cursor == null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("tempkey", str);
                        contentValues.put("tempvalue", str2);
                        ContentResolver contentResolver2 = MessageSharedPrefs.this.f9876b.getContentResolver();
                        C3857a.m10616a(MessageSharedPrefs.this.f9876b);
                        contentResolver2.insert(C3857a.f10478c, contentValues);
                    } else if (cursor.moveToFirst()) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("tempvalue", str2);
                        ContentResolver contentResolver3 = MessageSharedPrefs.this.f9876b.getContentResolver();
                        C3857a.m10616a(MessageSharedPrefs.this.f9876b);
                        contentResolver3.update(C3857a.f10478c, contentValues2, "tempkey=?", strArr);
                    } else {
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("tempkey", str);
                        contentValues3.put("tempvalue", str2);
                        ContentResolver contentResolver4 = MessageSharedPrefs.this.f9876b.getContentResolver();
                        C3857a.m10616a(MessageSharedPrefs.this.f9876b);
                        contentResolver4.insert(C3857a.f10478c, contentValues3);
                    }
                    if (cursor == null) {
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (0 == 0) {
                        return;
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
                cursor.close();
            }
        });
    }

    /* renamed from: b */
    public void mo39492b(String str) {
        this.f9877f.edit().putString(MsgConstant.KEY_NOTIFICATION_CHANNEL, str).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r1 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (0 == 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return r12;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10221b(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "tempvalue"
            r1 = 0
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x004a }
            r2.<init>()     // Catch:{ Exception -> 0x004a }
            java.lang.String r3 = "tempkey"
            r2.put(r3, r11)     // Catch:{ Exception -> 0x004a }
            java.lang.String r7 = "tempkey=?"
            r2 = 1
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ Exception -> 0x004a }
            r3 = 0
            r8[r3] = r11     // Catch:{ Exception -> 0x004a }
            android.content.Context r11 = r10.f9876b     // Catch:{ Exception -> 0x004a }
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ Exception -> 0x004a }
            android.content.Context r11 = r10.f9876b     // Catch:{ Exception -> 0x004a }
            com.umeng.message.provider.C3857a.m10616a(r11)     // Catch:{ Exception -> 0x004a }
            android.net.Uri r5 = com.umeng.message.provider.C3857a.f10478c     // Catch:{ Exception -> 0x004a }
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ Exception -> 0x004a }
            r6[r3] = r0     // Catch:{ Exception -> 0x004a }
            r9 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x004a }
            if (r1 != 0) goto L_0x0033
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r12
        L_0x0033:
            boolean r11 = r1.moveToFirst()
            if (r11 == 0) goto L_0x0042
            int r11 = r1.getColumnIndex(r0)
            java.lang.String r11 = r1.getString(r11)
            r12 = r11
        L_0x0042:
            if (r1 == 0) goto L_0x0051
        L_0x0044:
            r1.close()
            goto L_0x0051
        L_0x0048:
            r11 = move-exception
            goto L_0x0052
        L_0x004a:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0051
            goto L_0x0044
        L_0x0051:
            return r12
        L_0x0052:
            if (r1 == 0) goto L_0x0057
            r1.close()
        L_0x0057:
            goto L_0x0059
        L_0x0058:
            throw r11
        L_0x0059:
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.MessageSharedPrefs.m10221b(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public void mo39481a(int i, int i2, int i3, int i4) {
        m10222c(MsgConstant.KEY_NO_DISTURB_START_HOUR, i + "");
        m10222c(MsgConstant.KEY_NO_DISTURB_START_HOUR, i2 + "");
        m10222c(MsgConstant.KEY_NO_DISTURB_END_HOUR, i3 + "");
        m10222c(MsgConstant.KEY_NO_DISTURB_END_MINUTE, i4 + "");
    }

    /* renamed from: a */
    public int mo39480a() {
        return Integer.valueOf(m10221b(MsgConstant.KEY_NO_DISTURB_START_HOUR, AgooConstants.REPORT_DUPLICATE_FAIL)).intValue();
    }

    /* renamed from: a */
    public boolean mo39482a(String str) {
        return m10221b(MsgConstant.KEY_DEVICE_TOKEN, "").equalsIgnoreCase(str);
    }
}
