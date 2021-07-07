package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.firebase.annotations.PublicApi;

@PublicApi
public class FirebaseNetworkException extends FirebaseException {
    @PublicApi
    public FirebaseNetworkException(@NonNull String str) {
        super(str);
    }
}
