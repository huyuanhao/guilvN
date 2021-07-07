package androidx.core.app;

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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<ComponentName, AbstractC5027OooO0oo> f13850OooO00o = new HashMap<>();
    public static final boolean OooO0o0 = false;
    public static final String o0ooOOo = "JobIntentService";

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f13851OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f13852OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5027OooO0oo f13853OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ArrayList<C5024OooO0Oo> f13854OooO00o;
    public boolean OooO0O0 = false;
    public boolean OooO0OO = false;
    public boolean OooO0Oo = false;

    public interface OooO0O0 {
        AbstractC5025OooO0o0 OooO00o();

        IBinder compatGetBinder();
    }

    /* renamed from: androidx.core.app.JobIntentService$OooO0Oo  reason: case insensitive filesystem */
    public final class C5024OooO0Oo implements AbstractC5025OooO0o0 {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Intent f13857OooO00o;

        public C5024OooO0Oo(Intent intent, int i) {
            this.f13857OooO00o = intent;
            this.OooO00o = i;
        }

        @Override // androidx.core.app.JobIntentService.AbstractC5025OooO0o0
        public void complete() {
            JobIntentService.this.stopSelf(this.OooO00o);
        }

        @Override // androidx.core.app.JobIntentService.AbstractC5025OooO0o0
        public Intent getIntent() {
            return this.f13857OooO00o;
        }
    }

    @RequiresApi(26)
    public static final class OooO0o extends JobServiceEngine implements OooO0O0 {
        public static final String OooO00o = "JobServiceEngineImpl";

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final boolean f13859OooO00o = false;

        /* renamed from: OooO00o  reason: collision with other field name */
        public JobParameters f13860OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final JobIntentService f13861OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object f13862OooO00o = new Object();

        public final class OooO00o implements AbstractC5025OooO0o0 {
            public final JobWorkItem OooO00o;

            public OooO00o(JobWorkItem jobWorkItem) {
                this.OooO00o = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.AbstractC5025OooO0o0
            public void complete() {
                synchronized (OooO0o.this.f13862OooO00o) {
                    if (OooO0o.this.f13860OooO00o != null) {
                        OooO0o.this.f13860OooO00o.completeWork(this.OooO00o);
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.AbstractC5025OooO0o0
            public Intent getIntent() {
                return this.OooO00o.getIntent();
            }
        }

        public OooO0o(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f13861OooO00o = jobIntentService;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f13861OooO00o.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return new androidx.core.app.JobIntentService.OooO0o.OooO00o(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        @Override // androidx.core.app.JobIntentService.OooO0O0
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.AbstractC5025OooO0o0 OooO00o() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f13862OooO00o
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f13860OooO00o     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000a:
                android.app.job.JobParameters r1 = r3.f13860OooO00o     // Catch:{ all -> 0x0027 }
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0026
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f13861OooO00o
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$OooO0o$OooO00o r0 = new androidx.core.app.JobIntentService$OooO0o$OooO00o
                r0.<init>(r1)
                return r0
            L_0x0026:
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.OooO0o.OooO00o():androidx.core.app.JobIntentService$OooO0o0");
        }

        @Override // androidx.core.app.JobIntentService.OooO0O0
        public IBinder compatGetBinder() {
            return getBinder();
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f13860OooO00o = jobParameters;
            this.f13861OooO00o.OooO00o(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean OooO00o2 = this.f13861OooO00o.m14475OooO00o();
            synchronized (this.f13862OooO00o) {
                this.f13860OooO00o = null;
            }
            return OooO00o2;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC5025OooO0o0 {
        void complete();

        Intent getIntent();
    }

    @RequiresApi(26)
    /* renamed from: androidx.core.app.JobIntentService$OooO0oO  reason: case insensitive filesystem */
    public static final class C5026OooO0oO extends AbstractC5027OooO0oo {
        public final JobInfo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final JobScheduler f13864OooO00o;

        public C5026OooO0oO(Context context, ComponentName componentName, int i) {
            super(context, componentName);
            OooO00o(i);
            this.OooO00o = new JobInfo.Builder(i, ((AbstractC5027OooO0oo) this).f13865OooO00o).setOverrideDeadline(0).build();
            this.f13864OooO00o = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.AbstractC5027OooO0oo
        public void OooO00o(Intent intent) {
            this.f13864OooO00o.enqueue(this.OooO00o, new JobWorkItem(intent));
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$OooO0oo  reason: case insensitive filesystem */
    public static abstract class AbstractC5027OooO0oo {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ComponentName f13865OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f13866OooO00o;

        public AbstractC5027OooO0oo(Context context, ComponentName componentName) {
            this.f13865OooO00o = componentName;
        }

        public void OooO00o() {
        }

        public void OooO00o(int i) {
            if (!this.f13866OooO00o) {
                this.f13866OooO00o = true;
                this.OooO00o = i;
            } else if (this.OooO00o != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.OooO00o);
            }
        }

        public abstract void OooO00o(Intent intent);

        public void OooO0O0() {
        }

        public void OooO0OO() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13854OooO00o = null;
        } else {
            this.f13854OooO00o = new ArrayList<>();
        }
    }

    public static void OooO00o(@NonNull Context context, @NonNull Class cls, int i, @NonNull Intent intent) {
        OooO00o(context, new ComponentName(context, cls), i, intent);
    }

    public abstract void OooO00o(@NonNull Intent intent);

    public void OooO0O0(boolean z) {
        this.OooO0O0 = z;
    }

    public boolean OooO0OO() {
        return true;
    }

    public IBinder onBind(@NonNull Intent intent) {
        OooO0O0 oooO0O0 = this.f13852OooO00o;
        if (oooO0O0 != null) {
            return oooO0O0.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13852OooO00o = new OooO0o(this);
            this.f13853OooO00o = null;
            return;
        }
        this.f13852OooO00o = null;
        this.f13853OooO00o = OooO00o((Context) this, new ComponentName(this, JobIntentService.class), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C5024OooO0Oo> arrayList = this.f13854OooO00o;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.OooO0Oo = true;
                this.f13853OooO00o.OooO00o();
            }
        }
    }

    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        if (this.f13854OooO00o == null) {
            return 2;
        }
        this.f13853OooO00o.OooO0OO();
        synchronized (this.f13854OooO00o) {
            ArrayList<C5024OooO0Oo> arrayList = this.f13854OooO00o;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C5024OooO0Oo(intent, i2));
            OooO00o(true);
        }
        return 3;
    }

    public static void OooO00o(@NonNull Context context, @NonNull ComponentName componentName, int i, @NonNull Intent intent) {
        if (intent != null) {
            synchronized (OooO00o) {
                AbstractC5027OooO0oo OooO00o2 = OooO00o(context, componentName, true, i);
                OooO00o2.OooO00o(i);
                OooO00o2.OooO00o(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public boolean OooO0O0() {
        return this.OooO0OO;
    }

    public final class OooO00o extends AsyncTask<Void, Void, Void> {
        public OooO00o() {
        }

        /* renamed from: OooO00o */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                AbstractC5025OooO0o0 OooO00o2 = JobIntentService.this.OooO00o();
                if (OooO00o2 == null) {
                    return null;
                }
                JobIntentService.this.OooO00o(OooO00o2.getIntent());
                OooO00o2.complete();
            }
        }

        /* renamed from: OooO0O0 */
        public void onPostExecute(Void r1) {
            JobIntentService.this.m14474OooO00o();
        }

        /* renamed from: OooO00o */
        public void onCancelled(Void r1) {
            JobIntentService.this.m14474OooO00o();
        }
    }

    public static AbstractC5027OooO0oo OooO00o(Context context, ComponentName componentName, boolean z, int i) {
        AbstractC5027OooO0oo oooO0oo;
        AbstractC5027OooO0oo oooO0oo2 = f13850OooO00o.get(componentName);
        if (oooO0oo2 != null) {
            return oooO0oo2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            oooO0oo = new OooO0OO(context, componentName);
        } else if (z) {
            oooO0oo = new C5026OooO0oO(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        f13850OooO00o.put(componentName, oooO0oo);
        return oooO0oo;
    }

    public static final class OooO0OO extends AbstractC5027OooO0oo {
        public final Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final PowerManager.WakeLock f13855OooO00o;
        public final PowerManager.WakeLock OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f13856OooO0O0;
        public boolean OooO0OO;

        public OooO0OO(Context context, ComponentName componentName) {
            super(context, componentName);
            this.OooO00o = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f13855OooO00o = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.OooO0O0 = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.AbstractC5027OooO0oo
        public void OooO00o(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(((AbstractC5027OooO0oo) this).f13865OooO00o);
            if (this.OooO00o.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f13856OooO0O0) {
                        this.f13856OooO0O0 = true;
                        if (!this.OooO0OO) {
                            this.f13855OooO00o.acquire(60000);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC5027OooO0oo
        public void OooO0O0() {
            synchronized (this) {
                if (!this.OooO0OO) {
                    this.OooO0OO = true;
                    this.OooO0O0.acquire(600000);
                    this.f13855OooO00o.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC5027OooO0oo
        public void OooO0OO() {
            synchronized (this) {
                this.f13856OooO0O0 = false;
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC5027OooO0oo
        public void OooO00o() {
            synchronized (this) {
                if (this.OooO0OO) {
                    if (this.f13856OooO0O0) {
                        this.f13855OooO00o.acquire(60000);
                    }
                    this.OooO0OO = false;
                    this.OooO0O0.release();
                }
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14475OooO00o() {
        OooO00o oooO00o = this.f13851OooO00o;
        if (oooO00o != null) {
            oooO00o.cancel(this.OooO0O0);
        }
        this.OooO0OO = true;
        return OooO0OO();
    }

    public void OooO00o(boolean z) {
        if (this.f13851OooO00o == null) {
            this.f13851OooO00o = new OooO00o();
            AbstractC5027OooO0oo oooO0oo = this.f13853OooO00o;
            if (oooO0oo != null && z) {
                oooO0oo.OooO0O0();
            }
            this.f13851OooO00o.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14474OooO00o() {
        ArrayList<C5024OooO0Oo> arrayList = this.f13854OooO00o;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f13851OooO00o = null;
                if (this.f13854OooO00o != null && this.f13854OooO00o.size() > 0) {
                    OooO00o(false);
                } else if (!this.OooO0Oo) {
                    this.f13853OooO00o.OooO00o();
                }
            }
        }
    }

    public AbstractC5025OooO0o0 OooO00o() {
        OooO0O0 oooO0O0 = this.f13852OooO00o;
        if (oooO0O0 != null) {
            return oooO0O0.OooO00o();
        }
        synchronized (this.f13854OooO00o) {
            if (this.f13854OooO00o.size() <= 0) {
                return null;
            }
            return this.f13854OooO00o.remove(0);
        }
    }
}
