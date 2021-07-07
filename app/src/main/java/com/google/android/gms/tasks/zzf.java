package com.google.android.gms.tasks;

public final class zzf implements Runnable {
    public final /* synthetic */ Task zzg;
    public final /* synthetic */ zze zzi;

    public zzf(zze zze, Task task) {
        this.zzi = zze;
        this.zzg = task;
    }

    public final void run() {
        try {
            Task task = (Task) zze.zza(this.zzi).then(this.zzg);
            if (task == null) {
                this.zzi.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            task.addOnSuccessListener(TaskExecutors.zzw, this.zzi);
            task.addOnFailureListener(TaskExecutors.zzw, this.zzi);
            task.addOnCanceledListener(TaskExecutors.zzw, this.zzi);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                zze.zzb(this.zzi).setException((Exception) e.getCause());
            } else {
                zze.zzb(this.zzi).setException(e);
            }
        } catch (Exception e2) {
            zze.zzb(this.zzi).setException(e2);
        }
    }
}
