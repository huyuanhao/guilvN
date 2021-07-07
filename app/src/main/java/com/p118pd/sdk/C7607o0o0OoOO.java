package com.p118pd.sdk;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Registry;
import java.util.Map;

/* renamed from: com.pd.sdk.o0o0OoOO  reason: case insensitive filesystem */
public class C7607o0o0OoOO extends ContextWrapper {
    @VisibleForTesting
    public static final AbstractC7623o0oOOoOo<?, ?> OooO00o = new C7603o0o0Oo0O();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f20455OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Handler f20456OooO00o = new Handler(Looper.getMainLooper());

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Registry f20457OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7687o0oo0Oo f20458OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7707o0ooO00O f20459OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7824oO00o0oo f20460OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7830oO00oOO0 f20461OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<Class<?>, AbstractC7623o0oOOoOo<?, ?>> f20462OooO00o;

    public C7607o0o0OoOO(@NonNull Context context, @NonNull AbstractC7707o0ooO00O o0ooo00o, @NonNull Registry registry, @NonNull C7830oO00oOO0 oo00ooo0, @NonNull C7824oO00o0oo oo00o0oo, @NonNull Map<Class<?>, AbstractC7623o0oOOoOo<?, ?>> map, @NonNull C7687o0oo0Oo o0oo0oo, int i) {
        super(context.getApplicationContext());
        this.f20459OooO00o = o0ooo00o;
        this.f20457OooO00o = registry;
        this.f20461OooO00o = oo00ooo0;
        this.f20460OooO00o = oo00o0oo;
        this.f20462OooO00o = map;
        this.f20458OooO00o = o0oo0oo;
        this.f20455OooO00o = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7824oO00o0oo m19246OooO00o() {
        return this.f20460OooO00o;
    }

    @NonNull
    public <T> AbstractC7623o0oOOoOo<?, T> OooO00o(@NonNull Class<T> cls) {
        AbstractC7623o0oOOoOo<?, T> o0oooooo = (AbstractC7623o0oOOoOo<?, T>) this.f20462OooO00o.get(cls);
        if (o0oooooo == null) {
            for (Map.Entry<Class<?>, AbstractC7623o0oOOoOo<?, ?>> entry : this.f20462OooO00o.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    o0oooooo = (AbstractC7623o0oOOoOo<?, T>) entry.getValue();
                }
            }
        }
        return o0oooooo == null ? (AbstractC7623o0oOOoOo<?, T>) OooO00o : o0oooooo;
    }

    @NonNull
    public <X> oO0OO00O<ImageView, X> OooO00o(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.f20461OooO00o.OooO00o(imageView, cls);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Handler m19242OooO00o() {
        return this.f20456OooO00o;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7687o0oo0Oo m19244OooO00o() {
        return this.f20458OooO00o;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Registry m19243OooO00o() {
        return this.f20457OooO00o;
    }

    public int OooO00o() {
        return this.f20455OooO00o;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7707o0ooO00O m19245OooO00o() {
        return this.f20459OooO00o;
    }
}
