package com.p118pd.sdk;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.pd.sdk.o00oo0  reason: case insensitive filesystem */
public class C7214o00oo0 {
    public static final String OooO00o = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f19716OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7219o00oo0OO f19717OooO00o;

    /* renamed from: com.pd.sdk.o00oo0$OooO0O0 */
    public interface OooO0O0 {
        @NonNull
        <T extends AbstractC7216o00oo00O> T OooO00o(@NonNull Class<T> cls);
    }

    /* renamed from: com.pd.sdk.o00oo0$OooO0OO */
    public static class OooO0OO implements OooO0O0 {
        @Override // com.p118pd.sdk.C7214o00oo0.OooO0O0
        @NonNull
        public <T extends AbstractC7216o00oo00O> T OooO00o(@NonNull Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    public C7214o00oo0(@NonNull AbstractC7218o00oo0O0 o00oo0o0, @NonNull OooO0O0 oooO0O0) {
        this(o00oo0o0.getViewModelStore(), oooO0O0);
    }

    @NonNull
    @MainThread
    public <T extends AbstractC7216o00oo00O> T OooO00o(@NonNull Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) OooO00o("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C7214o00oo0(@NonNull C7219o00oo0OO o00oo0oo, @NonNull OooO0O0 oooO0O0) {
        this.f19716OooO00o = oooO0O0;
        this.f19717OooO00o = o00oo0oo;
    }

    /* renamed from: com.pd.sdk.o00oo0$OooO00o */
    public static class OooO00o extends OooO0OO {
        public static OooO00o OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Application f19718OooO00o;

        public OooO00o(@NonNull Application application) {
            this.f19718OooO00o = application;
        }

        @NonNull
        public static OooO00o OooO00o(@NonNull Application application) {
            if (OooO00o == null) {
                OooO00o = new OooO00o(application);
            }
            return OooO00o;
        }

        @Override // com.p118pd.sdk.C7214o00oo0.OooO0O0, com.p118pd.sdk.C7214o00oo0.OooO0OO
        @NonNull
        public <T extends AbstractC7216o00oo00O> T OooO00o(@NonNull Class<T> cls) {
            if (!C7717o0ooOO.class.isAssignableFrom(cls)) {
                return (T) super.OooO00o(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.f19718OooO00o);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    @NonNull
    @MainThread
    public <T extends AbstractC7216o00oo00O> T OooO00o(@NonNull String str, @NonNull Class<T> cls) {
        T t = (T) this.f19717OooO00o.OooO00o(str);
        if (cls.isInstance(t)) {
            return t;
        }
        T t2 = (T) this.f19716OooO00o.OooO00o(cls);
        this.f19717OooO00o.OooO00o(str, t2);
        return t2;
    }
}
