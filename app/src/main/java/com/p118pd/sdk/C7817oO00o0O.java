package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oO00o0O  reason: case insensitive filesystem */
public final class C7817oO00o0O {
    public final List<ImageHeaderParser> OooO00o = new ArrayList();

    @NonNull
    public synchronized List<ImageHeaderParser> OooO00o() {
        return this.OooO00o;
    }

    public synchronized void OooO00o(@NonNull ImageHeaderParser imageHeaderParser) {
        this.OooO00o.add(imageHeaderParser);
    }
}
