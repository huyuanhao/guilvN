package com.google.firebase.iid;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

public final class zzu implements Continuation<Bundle, String> {
    public final /* synthetic */ zzr zzbn;

    public zzu(zzr zzr) {
        this.zzbn = zzr;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.tasks.Task] */
    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ String then(@NonNull Task<Bundle> task) throws Exception {
        zzr zzr = this.zzbn;
        return zzr.zza(task.getResult(IOException.class));
    }
}
