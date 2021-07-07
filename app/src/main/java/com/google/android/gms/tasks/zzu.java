package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class zzu<TResult> extends Task<TResult> {
    public final Object mLock = new Object();
    @GuardedBy("mLock")
    public TResult zzaa;
    @GuardedBy("mLock")
    public Exception zzab;
    public final zzr<TResult> zzx = new zzr<>();
    @GuardedBy("mLock")
    public boolean zzy;
    public volatile boolean zzz;

    public static class zza extends LifecycleCallback {
        public final List<WeakReference<zzq<?>>> zzac = new ArrayList();

        public zza(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
        }

        public static zza zza(Activity activity) {
            LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
            zza zza = (zza) fragment.getCallbackOrNull("TaskOnStopCallback", zza.class);
            return zza == null ? new zza(fragment) : zza;
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        @MainThread
        public void onStop() {
            synchronized (this.zzac) {
                for (WeakReference<zzq<?>> weakReference : this.zzac) {
                    zzq<?> zzq = weakReference.get();
                    if (zzq != null) {
                        zzq.cancel();
                    }
                }
                this.zzac.clear();
            }
        }

        public final <T> void zzb(zzq<T> zzq) {
            synchronized (this.zzac) {
                this.zzac.add(new WeakReference<>(zzq));
            }
        }
    }

    @GuardedBy("mLock")
    private final void zzb() {
        Preconditions.checkState(this.zzy, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void zzc() {
        Preconditions.checkState(!this.zzy, "Task is already complete");
    }

    @GuardedBy("mLock")
    private final void zzd() {
        if (this.zzz) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void zze() {
        synchronized (this.mLock) {
            if (this.zzy) {
                this.zzx.zza(this);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCanceledListener(@NonNull OnCanceledListener onCanceledListener) {
        return addOnCanceledListener(TaskExecutors.MAIN_THREAD, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        return addOnCompleteListener(TaskExecutors.MAIN_THREAD, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnFailureListener(@NonNull OnFailureListener onFailureListener) {
        return addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnSuccessListener(@NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        return addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NonNull Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @Nullable
    public final Exception getException() {
        Exception exc;
        synchronized (this.mLock) {
            exc = this.zzab;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.mLock) {
            zzb();
            zzd();
            if (this.zzab == null) {
                tresult = this.zzaa;
            } else {
                throw new RuntimeExecutionException(this.zzab);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.zzz;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzy;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzy && !this.zzz && this.zzab == null;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        zzu zzu = new zzu();
        this.zzx.zza(new zzo(executor, successContinuation, zzu));
        zze();
        return zzu;
    }

    public final void setException(@NonNull Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.mLock) {
            zzc();
            this.zzy = true;
            this.zzab = exc;
        }
        this.zzx.zza(this);
    }

    public final void setResult(TResult tresult) {
        synchronized (this.mLock) {
            zzc();
            this.zzy = true;
            this.zzaa = tresult;
        }
        this.zzx.zza(this);
    }

    public final boolean trySetException(@NonNull Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.mLock) {
            if (this.zzy) {
                return false;
            }
            this.zzy = true;
            this.zzab = exc;
            this.zzx.zza(this);
            return true;
        }
    }

    public final boolean trySetResult(TResult tresult) {
        synchronized (this.mLock) {
            if (this.zzy) {
                return false;
            }
            this.zzy = true;
            this.zzaa = tresult;
            this.zzx.zza(this);
            return true;
        }
    }

    public final boolean zza() {
        synchronized (this.mLock) {
            if (this.zzy) {
                return false;
            }
            this.zzy = true;
            this.zzz = true;
            this.zzx.zza(this);
            return true;
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCanceledListener(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.zzx.zza(new zzg(executor, onCanceledListener));
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.zzx.zza(new zzi(executor, onCompleteListener));
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnFailureListener(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.zzx.zza(new zzk(executor, onFailureListener));
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnSuccessListener(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.zzx.zza(new zzm(executor, onSuccessListener));
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation) {
        zzu zzu = new zzu();
        this.zzx.zza(new zzc(executor, continuation, zzu));
        zze();
        return zzu;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        zzu zzu = new zzu();
        this.zzx.zza(new zze(executor, continuation, zzu));
        zze();
        return zzu;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCanceledListener(@NonNull Activity activity, @NonNull OnCanceledListener onCanceledListener) {
        zzg zzg = new zzg(TaskExecutors.MAIN_THREAD, onCanceledListener);
        this.zzx.zza(zzg);
        zza.zza(activity).zzb(zzg);
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        zzi zzi = new zzi(TaskExecutors.MAIN_THREAD, onCompleteListener);
        this.zzx.zza(zzi);
        zza.zza(activity).zzb(zzi);
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnFailureListener(@NonNull Activity activity, @NonNull OnFailureListener onFailureListener) {
        zzk zzk = new zzk(TaskExecutors.MAIN_THREAD, onFailureListener);
        this.zzx.zza(zzk);
        zza.zza(activity).zzb(zzk);
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnSuccessListener(@NonNull Activity activity, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        zzm zzm = new zzm(TaskExecutors.MAIN_THREAD, onSuccessListener);
        this.zzx.zza(zzm);
        zza.zza(activity).zzb(zzm);
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        return onSuccessTask(TaskExecutors.MAIN_THREAD, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends Throwable> TResult getResult(@NonNull Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.mLock) {
            zzb();
            zzd();
            if (cls.isInstance(this.zzab)) {
                throw cls.cast(this.zzab);
            } else if (this.zzab == null) {
                tresult = this.zzaa;
            } else {
                throw new RuntimeExecutionException(this.zzab);
            }
        }
        return tresult;
    }
}
