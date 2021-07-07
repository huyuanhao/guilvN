package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* renamed from: com.pd.sdk.o0oOooo0  reason: case insensitive filesystem */
public interface AbstractC7662o0oOooo0<T> {

    /* renamed from: com.pd.sdk.o0oOooo0$OooO00o */
    public interface OooO00o<T> {
        void OooO00o(@NonNull Exception exc);

        void OooO00o(@Nullable T t);
    }

    @NonNull
    DataSource OooO00o();

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    Class<T> m19297OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    void m19298OooO00o();

    void OooO00o(@NonNull Priority priority, @NonNull OooO00o<? super T> oooO00o);

    void cancel();
}
