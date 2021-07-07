package com.google.firebase.p027ml.vision.label;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.label.zzb */
public final class zzb implements Continuation<List<FirebaseVisionImageLabel>, List<FirebaseVisionImageLabel>> {
    public final /* synthetic */ FirebaseVisionImageLabeler zzayz;

    public zzb(FirebaseVisionImageLabeler firebaseVisionImageLabeler) {
        this.zzayz = firebaseVisionImageLabeler;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.tasks.Task] */
    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ List<FirebaseVisionImageLabel> then(@NonNull Task<List<FirebaseVisionImageLabel>> task) throws Exception {
        LinkedList linkedList = new LinkedList();
        for (FirebaseVisionImageLabel firebaseVisionImageLabel : task.getResult()) {
            if (Float.compare(firebaseVisionImageLabel.getConfidence(), this.zzayz.zzayu.getConfidenceThreshold()) >= 0) {
                linkedList.add(firebaseVisionImageLabel);
            }
        }
        return linkedList;
    }
}
