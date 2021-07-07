package com.umeng.message;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.service.UMJobIntentService;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;

public class UmengDownloadResourceService extends UMJobIntentService {
    public static final String TAG = UmengDownloadResourceService.class.getName();

    /* renamed from: o */
    public static final String f9958o = ".tmp";

    /* renamed from: p */
    public static final String f9959p = "RETRY_TIME";

    /* renamed from: q */
    public static final String f9960q = "OPERATIOIN";

    /* renamed from: r */
    public static final int f9961r = 1;

    /* renamed from: s */
    public static final int f9962s = 2;

    /* renamed from: t */
    public static final long f9963t = 1048576;

    /* renamed from: u */
    public static final long f9964u = 86400000;

    /* renamed from: v */
    public static final int f9965v = 300000;

    /* renamed from: w */
    public static final int f9966w = 3;

    /* renamed from: x */
    public static Thread f9967x;

    /* renamed from: a */
    public ScheduledThreadPoolExecutor f9968a = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 4);

    /* renamed from: b */
    public Context f9969b = this;

    /* renamed from: c */
    public ArrayList<String> f9970c = new ArrayList<>();

    /* renamed from: b */
    public static void m10273b(File file, long j) {
        if (file != null && file.exists() && file.canWrite() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.isDirectory() && System.currentTimeMillis() - file2.lastModified() > j) {
                    file2.delete();
                }
            }
        }
    }

    public static void checkDir(final File file, long j, final long j2) throws IOException {
        if (file.exists() && m10269a(file.getCanonicalFile()) > j) {
            if (f9967x == null) {
                f9967x = new Thread(new Runnable() {
                    /* class com.umeng.message.UmengDownloadResourceService.RunnableC37711 */

                    public void run() {
                        UmengDownloadResourceService.m10273b(file, j2);
                        Thread unused = UmengDownloadResourceService.f9967x = null;
                    }
                });
            }
            synchronized (f9967x) {
                f9967x.start();
            }
        }
    }

    public static String getMessageResourceFolder(Context context, UMessage uMessage) {
        String str = context.getCacheDir() + "/umeng_push/";
        if (uMessage == null || uMessage.msg_id == null) {
            return str;
        }
        return str + uMessage.msg_id + C8932ooOOO0o.OooO0OO;
    }

    public void checkCache() {
        try {
            checkDir(new File(getMessageResourceFolder(this.f9969b, null)), 1048576, 86400000);
        } catch (Throwable unused) {
        }
    }

    public void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteAlarm(UMessage uMessage, int i) {
        UMLog uMLog = UMConfigure.umDebugLog;
        UMLog.mutlInfo(TAG, 2, "deleteAlarm");
        ((AlarmManager) getSystemService("alarm")).cancel(m10270a(uMessage, i));
    }

    @SuppressLint({"NewApi"})
    public void downloadResource(UMessage uMessage, int i) {
        DownloadResourceTask downloadResourceTask = new DownloadResourceTask(uMessage, i);
        if (Build.VERSION.SDK_INT >= 11) {
            downloadResourceTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            downloadResourceTask.execute(new Void[0]);
        }
    }

    public void notification(UMessage uMessage) {
        UHandler uHandler;
        if (UMessage.DISPLAY_TYPE_NOTIFICATIONPULLAPP.equals(uMessage.display_type)) {
            uHandler = PushAgent.getInstance(this).getAdHandler();
        } else {
            uHandler = PushAgent.getInstance(this).getMessageHandler();
        }
        if (uHandler == null) {
            return;
        }
        if (TextUtils.equals(UMessage.DISPLAY_TYPE_AUTOUPDATE, uMessage.display_type)) {
            UmengMessageHandler umengMessageHandler = (UmengMessageHandler) PushAgent.getInstance(this.f9969b).getMessageHandler();
            if (umengMessageHandler != null) {
                umengMessageHandler.dealWithNotificationMessage(this.f9969b, uMessage);
                return;
            }
            return;
        }
        uHandler.handleMessage(this, uMessage);
    }

    public void setAlarm(UMessage uMessage, int i) {
        UMLog uMLog = UMConfigure.umDebugLog;
        UMLog.mutlInfo(TAG, 2, "setAlarm");
        ((AlarmManager) getSystemService("alarm")).set(1, System.currentTimeMillis() + Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL, m10270a(uMessage, i));
    }

    public class DownloadResourceTask extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public UMessage f9973a;

        /* renamed from: b */
        public ArrayList<String> f9974b = new ArrayList<>();

        /* renamed from: c */
        public int f9975c;

        public DownloadResourceTask(UMessage uMessage, int i) {
            this.f9973a = uMessage;
            if (UMessage.DISPLAY_TYPE_NOTIFICATIONPULLAPP.equals(uMessage.display_type)) {
                try {
                    this.f9974b.add(new JSONObject(uMessage.custom).optString("img"));
                } catch (Exception unused) {
                }
            }
            if (uMessage.isLargeIconFromInternet()) {
                this.f9974b.add(uMessage.img);
            }
            if (uMessage.isSoundFromInternet()) {
                this.f9974b.add(uMessage.sound);
            }
            if (!TextUtils.isEmpty(uMessage.bar_image)) {
                this.f9974b.add(uMessage.bar_image);
            }
            if (!TextUtils.isEmpty(uMessage.expand_image)) {
                this.f9974b.add(uMessage.expand_image);
            }
            this.f9975c = i;
        }

        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            Iterator<String> it = this.f9974b.iterator();
            boolean z = true;
            while (it.hasNext()) {
                z &= download(it.next());
            }
            return Boolean.valueOf(z);
        }

        public boolean download(String str) {
            Throwable th;
            FileOutputStream fileOutputStream;
            Exception e;
            Exception e2;
            Throwable th2;
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            InputStream inputStream = null;
            try {
                String str2 = str.hashCode() + "";
                String messageResourceFolder = UmengDownloadResourceService.getMessageResourceFolder(UmengDownloadResourceService.this.f9969b, this.f9973a);
                File file = new File(messageResourceFolder, str2 + ".tmp");
                File file2 = new File(messageResourceFolder, str2);
                if (file2.exists()) {
                    UmengDownloadResourceService.this.close(null);
                    UmengDownloadResourceService.this.close(null);
                    return true;
                }
                File file3 = new File(messageResourceFolder);
                if (!file3.exists()) {
                    file3.mkdirs();
                }
                if (file.exists()) {
                    file.delete();
                }
                InputStream openStream = new URL(new URI(str).toASCIIString()).openStream();
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e3) {
                    e2 = e3;
                    fileOutputStream = null;
                    inputStream = openStream;
                    e = e2;
                    try {
                        e.printStackTrace();
                        UmengDownloadResourceService.this.close(inputStream);
                        UmengDownloadResourceService.this.close(fileOutputStream);
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        UmengDownloadResourceService.this.close(inputStream);
                        UmengDownloadResourceService.this.close(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    fileOutputStream = null;
                    inputStream = openStream;
                    th = th2;
                    UmengDownloadResourceService.this.close(inputStream);
                    UmengDownloadResourceService.this.close(fileOutputStream);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[10240];
                    while (true) {
                        int read = openStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            file.renameTo(file2);
                            UmengDownloadResourceService.this.close(openStream);
                            UmengDownloadResourceService.this.close(fileOutputStream);
                            return true;
                        }
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    inputStream = openStream;
                    e = e2;
                    e.printStackTrace();
                    UmengDownloadResourceService.this.close(inputStream);
                    UmengDownloadResourceService.this.close(fileOutputStream);
                    return false;
                } catch (Throwable th5) {
                    th2 = th5;
                    inputStream = openStream;
                    th = th2;
                    UmengDownloadResourceService.this.close(inputStream);
                    UmengDownloadResourceService.this.close(fileOutputStream);
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                fileOutputStream = null;
                e.printStackTrace();
                UmengDownloadResourceService.this.close(inputStream);
                UmengDownloadResourceService.this.close(fileOutputStream);
                return false;
            } catch (Throwable th6) {
                th = th6;
                fileOutputStream = null;
                UmengDownloadResourceService.this.close(inputStream);
                UmengDownloadResourceService.this.close(fileOutputStream);
                throw th;
            }
        }

        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            UmengDownloadResourceService.this.f9970c.remove(this.f9973a.msg_id);
            if (bool.booleanValue() || this.f9975c <= 0) {
                MessageSharedPrefs.getInstance(UmengDownloadResourceService.this.f9969b).setMessageResourceDownloaded(this.f9973a.msg_id);
                String jSONObject = this.f9973a.getRaw().toString();
                Intent intent = new Intent(UmengDownloadResourceService.this.f9969b, UmengDownloadResourceService.class);
                intent.putExtra(AgooConstants.MESSAGE_BODY, jSONObject);
                intent.putExtra("id", this.f9973a.message_id);
                intent.putExtra(AgooConstants.MESSAGE_TASK_ID, this.f9973a.task_id);
                intent.putExtra(UmengDownloadResourceService.f9960q, 1);
                intent.putExtra(UmengDownloadResourceService.f9959p, this.f9975c);
                UMJobIntentService.enqueueWork(UmengDownloadResourceService.this.f9969b, UmengDownloadResourceService.class, intent);
            } else if (UmengDownloadResourceService.this.f9970c.size() == 0) {
                UmengDownloadResourceService.this.stopSelf();
            }
        }
    }

    @Override // com.umeng.message.service.JobIntentService, com.umeng.message.service.UMJobIntentService
    /* renamed from: a */
    public void mo39680a(Intent intent) {
        MLog.m9802i("wuchi", "--->>> UmengDownloadResourceService onHandleWork");
        if (intent != null) {
            int intExtra = intent.getIntExtra(f9960q, 2);
            int intExtra2 = intent.getIntExtra(f9959p, 3);
            try {
                UMessage uMessage = new UMessage(new JSONObject(intent.getStringExtra(AgooConstants.MESSAGE_BODY)));
                uMessage.message_id = intent.getStringExtra("id");
                uMessage.task_id = intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID);
                if (!this.f9970c.contains(uMessage.msg_id)) {
                    this.f9970c.add(uMessage.msg_id);
                    if (intExtra == 1) {
                        deleteAlarm(uMessage, intExtra2);
                        UMLog uMLog = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(TAG, 2, "下载资源后显示通知");
                        notification(uMessage);
                        this.f9970c.remove(uMessage.msg_id);
                        if (this.f9970c.size() == 0) {
                            stopSelf();
                        }
                    } else if (intExtra == 2) {
                        UMLog uMLog2 = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(TAG, 2, "开始下载资源");
                        int i = intExtra2 - 1;
                        setAlarm(uMessage, i);
                        checkCache();
                        downloadResource(uMessage, i);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private PendingIntent m10270a(UMessage uMessage, int i) {
        String jSONObject = uMessage.getRaw().toString();
        int hashCode = uMessage.msg_id.hashCode();
        Intent intent = new Intent(this.f9969b, UmengDownloadResourceService.class);
        intent.putExtra(AgooConstants.MESSAGE_BODY, jSONObject);
        intent.putExtra("id", uMessage.message_id);
        intent.putExtra(AgooConstants.MESSAGE_TASK_ID, uMessage.task_id);
        intent.putExtra(f9960q, 2);
        intent.putExtra(f9959p, i);
        PendingIntent service = PendingIntent.getService(this.f9969b, hashCode, intent, 134217728);
        UMLog uMLog = UMConfigure.umDebugLog;
        String str = TAG;
        UMLog.mutlInfo(str, 2, "PendingIntent: msgId:" + uMessage.msg_id + ",requestCode:" + hashCode + ",retryTime:" + i);
        return service;
    }

    /* renamed from: a */
    public static long m10269a(File file) {
        long j = 0;
        if (file != null && file.exists() && file.isDirectory()) {
            Stack stack = new Stack();
            stack.clear();
            stack.push(file);
            while (!stack.isEmpty()) {
                File[] listFiles = ((File) stack.pop()).listFiles();
                for (File file2 : listFiles) {
                    if (!file2.isDirectory()) {
                        j += file2.length();
                    }
                }
            }
        }
        return j;
    }
}
