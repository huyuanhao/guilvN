package org.android.agoo.message;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3178j;
import com.taobao.accs.utl.UTMini;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;
import org.json.JSONArray;
import org.json.JSONObject;

public class MessageService {
    public static final String MSG_ACCS_NOTIFY_CLICK = "8";
    public static final String MSG_ACCS_NOTIFY_DISMISS = "9";
    public static final String MSG_ACCS_READY_REPORT = "4";
    public static final String MSG_DB_COMPLETE = "100";
    public static final String MSG_DB_NOTIFY_CLICK = "2";
    public static final String MSG_DB_NOTIFY_DISMISS = "3";
    public static final String MSG_DB_NOTIFY_REACHED = "1";
    public static final String MSG_DB_READY_REPORT = "0";

    /* renamed from: a */
    public static Context f13475a;

    /* renamed from: c */
    public static Map<String, Integer> f13476c;

    /* renamed from: b */
    public volatile SQLiteOpenHelper f13477b = null;

    /* renamed from: org.android.agoo.message.MessageService$a */
    public static class C4815a extends SQLiteOpenHelper {
        public C4815a(Context context) {
            super(context, "message_accs_db", (SQLiteDatabase.CursorFactory) null, 3);
        }

        /* renamed from: a */
        private String m14303a() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("create table accs_message");
            stringBuffer.append(C3848l.f10401s);
            stringBuffer.append("id text UNIQUE not null,");
            stringBuffer.append("state text,");
            stringBuffer.append("message text,");
            stringBuffer.append("create_time date");
            stringBuffer.append(");");
            return stringBuffer.toString();
        }

        /* renamed from: b */
        private String m14304b() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("create table message");
            stringBuffer.append(C3848l.f10401s);
            stringBuffer.append("id text UNIQUE not null,");
            stringBuffer.append("state integer,");
            stringBuffer.append("body_code integer,");
            stringBuffer.append("report long,");
            stringBuffer.append("target_time long,");
            stringBuffer.append("interval integer,");
            stringBuffer.append("type text,");
            stringBuffer.append("message text,");
            stringBuffer.append("notify integer,");
            stringBuffer.append("create_time date");
            stringBuffer.append(");");
            return stringBuffer.toString();
        }

        public SQLiteDatabase getWritableDatabase() {
            if (!C3178j.m7662a(super.getWritableDatabase().getPath(), 102400)) {
                return null;
            }
            return super.getWritableDatabase();
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL(m14304b());
                    sQLiteDatabase.execSQL("CREATE INDEX id_index ON message(id)");
                    sQLiteDatabase.execSQL("CREATE INDEX body_code_index ON message(body_code)");
                    sQLiteDatabase.execSQL(m14303a());
                } catch (Throwable th) {
                    ALog.m7598e("MessageService", "messagedbhelper create", th, new Object[0]);
                }
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
                } catch (Throwable th) {
                    ALog.m7598e("MessageService", "MessageService onUpgrade is error", th, new Object[0]);
                    return;
                }
            }
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                sQLiteDatabase.execSQL(m14303a());
            } catch (Throwable th2) {
                ALog.m7598e("MessageService", "MessageService onUpgrade is error", th2, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo44537a(Context context) {
        f13476c = new HashMap();
        f13475a = context;
        this.f13477b = new C4815a(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x014d A[Catch:{ all -> 0x0190, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0166 A[SYNTHETIC, Splitter:B:69:0x0166] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016e A[Catch:{ all -> 0x016a }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<org.android.agoo.common.MsgDO> mo44543b() {
        /*
        // Method dump skipped, instructions count: 448
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.mo44543b():java.util.ArrayList");
    }

    /* renamed from: a */
    public void mo44538a(String str, String str2) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m7600i("MessageService", "updateAccsMessage sqlite3--->[" + str + ",state=" + str2 + "]", new Object[0]);
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                sQLiteDatabase = this.f13477b.getWritableDatabase();
                if (sQLiteDatabase != null) {
                    if (TextUtils.equals(str2, "1")) {
                        sQLiteDatabase.execSQL("UPDATE accs_message set state = ? where id = ? and state = ?", new Object[]{str2, str, "0"});
                    } else {
                        sQLiteDatabase.execSQL("UPDATE accs_message set state = ? where id = ?", new Object[]{str2, str});
                    }
                    if (sQLiteDatabase == null) {
                        return;
                    }
                    sQLiteDatabase.close();
                } else if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2 A[Catch:{ all -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44539a(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.mo44539a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    private String m14291a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private MsgDO m14294b(String str, String str2) {
        int i;
        String str3;
        boolean z;
        String str4 = "ext";
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m7600i("MessageService", "msgRecevie,message--->[" + str + "]" + ",utdid=" + C3178j.m7663b(f13475a), new Object[0]);
        }
        String str5 = null;
        if (TextUtils.isEmpty(str)) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.dealMessage", C3178j.m7663b(f13475a), "message==null");
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m7600i("MessageService", "handleMessage message==null,utdid=" + C3178j.m7663b(f13475a), new Object[0]);
            }
            return null;
        }
        MsgDO msgDO = new MsgDO();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            new Bundle();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            int i2 = 0;
            while (i2 < length) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject == null) {
                    i = length;
                    str3 = str4;
                } else {
                    String string = jSONObject.getString(C3617o.f9365as);
                    String string2 = jSONObject.getString(C3617o.f9367au);
                    String string3 = jSONObject.getString("b");
                    long j = jSONObject.getLong("f");
                    sb.append(string2);
                    String string4 = !jSONObject.isNull(str4) ? jSONObject.getString(str4) : str5;
                    int i3 = length - 1;
                    i = length;
                    if (i2 < i3) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    msgDO.msgIds = string2;
                    msgDO.extData = string4;
                    str3 = str4;
                    msgDO.messageSource = "accs";
                    msgDO.type = "cache";
                    if (TextUtils.isEmpty(string3)) {
                        msgDO.errorCode = AgooConstants.ACK_BODY_NULL;
                    } else if (TextUtils.isEmpty(string)) {
                        msgDO.errorCode = AgooConstants.ACK_PACK_NULL;
                    } else if (j == -1) {
                        msgDO.errorCode = "13";
                    } else if (!m14293a(f13475a, string)) {
                        ALog.m7597d("MessageService", "ondata checkpackage is del,pack=" + string, new Object[0]);
                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.dealMessage", C3178j.m7663b(f13475a), "deletePack", string);
                        sb3.append(string);
                        sb2.append(string2);
                        msgDO.removePacks = string;
                        if (i2 < i3) {
                            sb3.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        }
                    } else {
                        String string5 = m14290a(j, msgDO).getString(AgooConstants.MESSAGE_ENCRYPTED);
                        if (!f13475a.getPackageName().equals(string)) {
                            z = true;
                        } else if (TextUtils.equals(Integer.toString(0), string5) || TextUtils.equals(Integer.toString(4), string5)) {
                            z = false;
                        } else {
                            msgDO.errorCode = AgooConstants.ACK_PACK_ERROR;
                            ALog.m7599e("MessageService", "error encrypted: " + string5, new Object[0]);
                        }
                        msgDO.agooFlag = z;
                        if (!TextUtils.isEmpty(str2)) {
                            msgDO.msgStatus = str2;
                            str5 = string4;
                        }
                    }
                    str5 = string4;
                }
                i2++;
                length = i;
                str4 = str3;
            }
        } catch (Throwable th) {
            if (ALog.isPrintLog(ALog.Level.f7180E)) {
                ALog.m7599e("MessageService", "createMsg is error,e: " + th, new Object[0]);
            }
        }
        return msgDO;
    }

    /* renamed from: a */
    public void mo44540a(String str, String str2, String str3, int i) {
        m14292a(str, str2, str3, 1, -1, -1, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01a1, code lost:
        com.taobao.accs.utl.UTMini.getInstance().commitEvent(org.android.agoo.common.AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", com.taobao.accs.utl.C3178j.m7663b(org.android.agoo.message.MessageService.f13475a), "addMessageDBcloseFailed", r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013f A[Catch:{ all -> 0x01c4, all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017c A[SYNTHETIC, Splitter:B:44:0x017c] */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14292a(java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, long r18, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 528
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.m14292a(java.lang.String, java.lang.String, java.lang.String, int, long, int, int):void");
    }

    /* renamed from: a */
    public void mo44536a() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = this.f13477b.getWritableDatabase();
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
                sQLiteDatabase.execSQL("delete from accs_message where create_time< date('now','-1 day') ");
                if (sQLiteDatabase == null) {
                    return;
                }
                try {
                    sQLiteDatabase.close();
                } catch (Throwable unused) {
                }
            } else if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.close();
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    sQLiteDatabase.close();
                } catch (Throwable unused3) {
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067 A[SYNTHETIC, Splitter:B:38:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006c A[Catch:{ all -> 0x006f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo44541a(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.mo44541a(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087 A[SYNTHETIC, Splitter:B:40:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c A[Catch:{ all -> 0x008f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo44542a(java.lang.String r9, int r10) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.mo44542a(java.lang.String, int):boolean");
    }

    /* renamed from: a */
    public static final boolean m14293a(Context context, String str) {
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static Bundle m14290a(long j, MsgDO msgDO) {
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb.toString());
                    if (charArray[6] == '1') {
                        bundle.putString("report", "1");
                        msgDO.reportStr = "1";
                    }
                    if (charArray[7] == '1') {
                        bundle.putString(AgooConstants.MESSAGE_NOTIFICATION, "1");
                    }
                }
                if (9 <= charArray.length && charArray[8] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_HAS_TEST, "1");
                }
                if (10 <= charArray.length && charArray[9] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_DUPLICATE, "1");
                }
                if (11 <= charArray.length && charArray[10] == '1') {
                    bundle.putInt(AgooConstants.MESSAGE_POPUP, 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }
}
