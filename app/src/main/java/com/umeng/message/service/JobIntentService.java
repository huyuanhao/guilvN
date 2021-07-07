package com.umeng.message.service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service {

    /* renamed from: d */
    public static final String f10503d = "JobIntentService";

    /* renamed from: e */
    public static final boolean f10504e = false;

    /* renamed from: m */
    public static final Object f10505m = new Object();

    /* renamed from: n */
    public static final HashMap<ComponentName, AbstractC3865f> f10506n = new HashMap<>();

    /* renamed from: f */
    public CompatJobEngine f10507f;

    /* renamed from: g */
    public AbstractC3865f f10508g;

    /* renamed from: h */
    public AsyncTaskC3859a f10509h;

    /* renamed from: i */
    public boolean f10510i = false;

    /* renamed from: j */
    public boolean f10511j = false;

    /* renamed from: k */
    public boolean f10512k = false;

    /* renamed from: l */
    public final ArrayList<C3861c> f10513l;

    public interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    /* renamed from: com.umeng.message.service.JobIntentService$c */
    public final class C3861c implements GenericWorkItem {

        /* renamed from: a */
        public final Intent f10520a;

        /* renamed from: b */
        public final int f10521b;

        public C3861c(Intent intent, int i) {
            this.f10520a = intent;
            this.f10521b = i;
        }

        @Override // com.umeng.message.service.JobIntentService.GenericWorkItem
        public void complete() {
            try {
                JobIntentService.this.stopSelf(this.f10521b);
            } catch (Throwable unused) {
            }
        }

        @Override // com.umeng.message.service.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.f10520a;
        }
    }

    /* renamed from: com.umeng.message.service.JobIntentService$d  reason: invalid class name */
    public static final class jobJobServiceEngineC3862d extends JobServiceEngine implements CompatJobEngine {

        /* renamed from: a */
        public static final String f10523a = "JobServiceEngineImpl";

        /* renamed from: b */
        public static final boolean f10524b = false;

        /* renamed from: c */
        public final JobIntentService f10525c;

        /* renamed from: d */
        public final Object f10526d = new Object();

        /* renamed from: e */
        public JobParameters f10527e;

        /* renamed from: com.umeng.message.service.JobIntentService$d$a */
        public final class C3863a implements GenericWorkItem {

            /* renamed from: a */
            public final JobWorkItem f10528a;

            public C3863a(JobWorkItem jobWorkItem) {
                this.f10528a = jobWorkItem;
            }

            @Override // com.umeng.message.service.JobIntentService.GenericWorkItem
            public void complete() {
                try {
                    Object obj = jobJobServiceEngineC3862d.this.f10526d;
                    synchronized (jobJobServiceEngineC3862d.this.f10526d) {
                        if (jobJobServiceEngineC3862d.this.f10527e != null) {
                            try {
                                jobJobServiceEngineC3862d.this.f10527e.completeWork(this.f10528a);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }

            @Override // com.umeng.message.service.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                return this.f10528a.getIntent();
            }
        }

        public jobJobServiceEngineC3862d(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f10525c = jobIntentService;
        }

        @Override // com.umeng.message.service.JobIntentService.CompatJobEngine
        public IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
            if (r2 == null) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r2.getIntent().setExtrasClassLoader(r4.f10525c.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
            return new com.umeng.message.service.JobIntentService.jobJobServiceEngineC3862d.C3863a(r4, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            return null;
         */
        @Override // com.umeng.message.service.JobIntentService.CompatJobEngine
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.umeng.message.service.JobIntentService.GenericWorkItem dequeueWork() {
            /*
                r4 = this;
                r0 = 0
                java.lang.Object r1 = r4.f10526d     // Catch:{ all -> 0x002a }
                monitor-enter(r1)     // Catch:{ all -> 0x002a }
                android.app.job.JobParameters r2 = r4.f10527e     // Catch:{ all -> 0x0027 }
                if (r2 != 0) goto L_0x000a
                monitor-exit(r1)     // Catch:{ all -> 0x0027 }
                return r0
            L_0x000a:
                android.app.job.JobParameters r2 = r4.f10527e     // Catch:{ all -> 0x0027 }
                android.app.job.JobWorkItem r2 = r2.dequeueWork()     // Catch:{ all -> 0x0027 }
                monitor-exit(r1)     // Catch:{ all -> 0x0027 }
                if (r2 == 0) goto L_0x0026
                android.content.Intent r1 = r2.getIntent()
                com.umeng.message.service.JobIntentService r3 = r4.f10525c
                java.lang.ClassLoader r3 = r3.getClassLoader()
                r1.setExtrasClassLoader(r3)
                com.umeng.message.service.JobIntentService$d$a r1 = new com.umeng.message.service.JobIntentService$d$a
                r1.<init>(r2)
                return r1
            L_0x0026:
                return r0
            L_0x0027:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            L_0x002a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.service.JobIntentService.jobJobServiceEngineC3862d.dequeueWork():com.umeng.message.service.JobIntentService$GenericWorkItem");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f10527e = jobParameters;
            this.f10525c.mo39958a(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean a = this.f10525c.mo39959a();
            synchronized (this.f10526d) {
                this.f10527e = null;
            }
            return a;
        }
    }

    /* renamed from: com.umeng.message.service.JobIntentService$e */
    public static final class C3864e extends AbstractC3865f {

        /* renamed from: a */
        public final JobInfo f10530a;

        /* renamed from: b */
        public final JobScheduler f10531b;

        public C3864e(Context context, ComponentName componentName, int i) {
            super(context, componentName);
            mo39985a(i);
            this.f10530a = new JobInfo.Builder(i, this.f10532c).setOverrideDeadline(0).build();
            this.f10531b = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // com.umeng.message.service.JobIntentService.AbstractC3865f
        /* renamed from: a */
        public void mo39980a(Intent intent) {
            try {
                this.f10531b.enqueue(this.f10530a, new JobWorkItem(intent));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.umeng.message.service.JobIntentService$f */
    public static abstract class AbstractC3865f {

        /* renamed from: c */
        public final ComponentName f10532c;

        /* renamed from: d */
        public boolean f10533d;

        /* renamed from: e */
        public int f10534e;

        public AbstractC3865f(Context context, ComponentName componentName) {
            this.f10532c = componentName;
        }

        /* renamed from: a */
        public void mo39979a() {
        }

        /* renamed from: a */
        public void mo39985a(int i) {
            if (!this.f10533d) {
                this.f10533d = true;
                this.f10534e = i;
            } else if (this.f10534e != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f10534e);
            }
        }

        /* renamed from: a */
        public abstract void mo39980a(Intent intent);

        /* renamed from: b */
        public void mo39981b() {
        }

        /* renamed from: c */
        public void mo39982c() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f10513l = null;
        } else {
            this.f10513l = new ArrayList<>();
        }
    }

    /* renamed from: a */
    public static AbstractC3865f m10617a(Context context, ComponentName componentName, boolean z, int i) {
        AbstractC3865f fVar;
        AbstractC3865f fVar2 = f10506n.get(componentName);
        if (fVar2 != null) {
            return fVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            fVar = new C3860b(context, componentName);
        } else if (z) {
            fVar = new C3864e(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        f10506n.put(componentName, fVar);
        return fVar;
    }

    /* renamed from: d */
    private void m10618d() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f10507f = new jobJobServiceEngineC3862d(this);
                this.f10508g = null;
                return;
            }
            this.f10507f = null;
            this.f10508g = m10617a(this, new ComponentName(this, getClass()), false, 0);
        } catch (Throwable unused) {
        }
    }

    public static void enqueueWork(Context context, Class cls, int i, Intent intent) {
        if (context != null && cls != null && intent != null) {
            try {
                enqueueWork(context, new ComponentName(context, cls), i, intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public abstract void mo39680a(Intent intent);

    /* renamed from: b */
    public void mo39960b() {
        try {
            if (this.f10513l != null) {
                synchronized (this.f10513l) {
                    this.f10509h = null;
                    if (this.f10513l != null && this.f10513l.size() > 0) {
                        mo39958a(false);
                    } else if (!this.f10512k) {
                        this.f10508g.mo39982c();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public GenericWorkItem mo39961c() {
        C3861c remove;
        CompatJobEngine compatJobEngine = this.f10507f;
        if (compatJobEngine != null) {
            return compatJobEngine.dequeueWork();
        }
        synchronized (this.f10513l) {
            remove = this.f10513l.size() > 0 ? this.f10513l.remove(0) : null;
        }
        return remove;
    }

    public boolean isStopped() {
        return this.f10511j;
    }

    public IBinder onBind(Intent intent) {
        if (intent != null) {
            try {
                if (this.f10507f != null) {
                    return this.f10507f.compatGetBinder();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        m10618d();
    }

    public void onDestroy() {
        try {
            super.onDestroy();
            if (this.f10513l != null) {
                synchronized (this.f10513l) {
                    this.f10512k = true;
                    this.f10508g.mo39982c();
                }
            }
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"WrongConstant"})
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            try {
                if (this.f10513l != null) {
                    if (this.f10508g == null) {
                        m10618d();
                    }
                    this.f10508g.mo39979a();
                    synchronized (this.f10513l) {
                        ArrayList<C3861c> arrayList = this.f10513l;
                        if (intent == null) {
                            intent = new Intent();
                        }
                        arrayList.add(new C3861c(intent, i2));
                        mo39958a(true);
                    }
                    return 3;
                }
            } catch (Throwable unused) {
            }
        }
        return 2;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void setInterruptIfStopped(boolean z) {
        this.f10510i = z;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        } else if (context != null && componentName != null) {
            try {
                synchronized (f10505m) {
                    AbstractC3865f a = m10617a(context, componentName, true, i);
                    a.mo39985a(i);
                    a.mo39980a(intent);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.umeng.message.service.JobIntentService$a */
    public final class AsyncTaskC3859a extends AsyncTask<Void, Void, Void> {
        public AsyncTaskC3859a() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                try {
                    GenericWorkItem c = JobIntentService.this.mo39961c();
                    if (c == null) {
                        return null;
                    }
                    JobIntentService.this.mo39680a(c.getIntent());
                    c.complete();
                } catch (Throwable unused) {
                    return null;
                }
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void r1) {
            try {
                JobIntentService.this.mo39960b();
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        public void onCancelled(Void r1) {
            try {
                JobIntentService.this.mo39960b();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean mo39959a() {
        AsyncTaskC3859a aVar = this.f10509h;
        if (aVar != null) {
            aVar.cancel(this.f10510i);
        }
        this.f10511j = true;
        return onStopCurrentWork();
    }

    /* renamed from: com.umeng.message.service.JobIntentService$b */
    public static final class C3860b extends AbstractC3865f {

        /* renamed from: a */
        public boolean f10515a;

        /* renamed from: b */
        public boolean f10516b;

        /* renamed from: f */
        public final Context f10517f;

        /* renamed from: g */
        public final PowerManager.WakeLock f10518g;

        /* renamed from: h */
        public final PowerManager.WakeLock f10519h;

        public C3860b(Context context, ComponentName componentName) {
            super(context, componentName);
            this.f10517f = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f10518g = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f10519h = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // com.umeng.message.service.JobIntentService.AbstractC3865f
        /* renamed from: a */
        public void mo39980a(Intent intent) {
            try {
                Intent intent2 = new Intent(intent);
                intent2.setComponent(this.f10532c);
                if (this.f10517f.startService(intent2) != null) {
                    synchronized (this) {
                        if (!this.f10515a) {
                            this.f10515a = true;
                            if (!this.f10516b) {
                                this.f10518g.acquire(60000);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.umeng.message.service.JobIntentService.AbstractC3865f
        /* renamed from: b */
        public void mo39981b() {
            try {
                synchronized (this) {
                    if (!this.f10516b) {
                        this.f10516b = true;
                        this.f10519h.acquire(600000);
                        this.f10518g.release();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.umeng.message.service.JobIntentService.AbstractC3865f
        /* renamed from: c */
        public void mo39982c() {
            try {
                synchronized (this) {
                    if (this.f10516b) {
                        if (this.f10515a) {
                            this.f10518g.acquire(60000);
                        }
                        this.f10516b = false;
                        this.f10519h.release();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.umeng.message.service.JobIntentService.AbstractC3865f
        /* renamed from: a */
        public void mo39979a() {
            synchronized (this) {
                this.f10515a = false;
            }
        }
    }

    /* renamed from: a */
    public void mo39958a(boolean z) {
        try {
            if (this.f10509h == null) {
                this.f10509h = new AsyncTaskC3859a();
                if (this.f10508g != null && z) {
                    this.f10508g.mo39981b();
                }
                this.f10509h.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        } catch (Throwable unused) {
        }
    }
}
