package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class zzx implements Continuation<Void, Task<List<Task<?>>>> {
    public final /* synthetic */ Collection zzae;

    public zzx(Collection collection) {
        this.zzae = collection;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.tasks.Task] */
    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<List<Task<?>>> then(@NonNull Task<Void> task) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zzae);
        return Tasks.forResult(arrayList);
    }
}
