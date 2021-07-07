package com.p118pd.sdk;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.GlideException;
import com.p118pd.sdk.AbstractC7221o00oo0o;
import com.p118pd.sdk.C7214o00oo0;
import com.p118pd.sdk.C7226o00ooO00;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: com.pd.sdk.o00oo0oO  reason: case insensitive filesystem */
public class C7223o00oo0oO extends AbstractC7221o00oo0o {
    public static final String OooO00o = "LoaderManager";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f19721OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7202o00oOo00 f19722OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO f19723OooO00o;

    /* renamed from: com.pd.sdk.o00oo0oO$OooO00o */
    public static class OooO00o<D> extends C7207o00oOoOO<D> implements C7226o00ooO00.OooO0OO<D> {
        @Nullable
        public final Bundle OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC7202o00oOo00 f19724OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO0O0<D> f19725OooO00o;
        @NonNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C7226o00ooO00<D> f19726OooO00o;
        public C7226o00ooO00<D> OooO0O0;
        public final int OooO0Oo;

        public OooO00o(int i, @Nullable Bundle bundle, @NonNull C7226o00ooO00<D> o00ooo00, @Nullable C7226o00ooO00<D> o00ooo002) {
            this.OooO0Oo = i;
            this.OooO00o = bundle;
            this.f19726OooO00o = o00ooo00;
            this.OooO0O0 = o00ooo002;
            o00ooo00.registerListener(i, this);
        }

        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.LiveData, androidx.lifecycle.LiveData, androidx.lifecycle.LiveData
        @NonNull
        public C7226o00ooO00<D> OooO00o() {
            return this.f19726OooO00o;
        }

        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.LiveData
        public void OooO0O0() {
            if (C7223o00oo0oO.f19721OooO00o) {
                String str = "  Stopping: " + this;
            }
            this.f19726OooO00o.stopLoading();
        }

        public void OooO0OO() {
            AbstractC7202o00oOo00 o00ooo00 = this.f19724OooO00o;
            OooO0O0<D> oooO0O0 = this.f19725OooO00o;
            if (o00ooo00 != null && oooO0O0 != null) {
                super.OooO0O0((AbstractC7208o00oOoOo) oooO0O0);
                OooO00o(o00ooo00, oooO0O0);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.OooO0Oo);
            sb.append(" : ");
            C7082o00OO00O.OooO00o(this.f19726OooO00o, sb);
            sb.append("}}");
            return sb.toString();
        }

        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.LiveData, androidx.lifecycle.LiveData, androidx.lifecycle.LiveData
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18710OooO00o() {
            if (C7223o00oo0oO.f19721OooO00o) {
                String str = "  Starting: " + this;
            }
            this.f19726OooO00o.startLoading();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.o00oOoOo<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void OooO0O0(@NonNull AbstractC7208o00oOoOo<? super D> o00ooooo) {
            super.OooO0O0((AbstractC7208o00oOoOo) o00ooooo);
            this.f19724OooO00o = null;
            this.f19725OooO00o = null;
        }

        @NonNull
        @MainThread
        public C7226o00ooO00<D> OooO00o(@NonNull AbstractC7202o00oOo00 o00ooo00, @NonNull AbstractC7221o00oo0o.OooO00o<D> oooO00o) {
            OooO0O0<D> oooO0O0 = new OooO0O0<>(this.f19726OooO00o, oooO00o);
            OooO00o(o00ooo00, oooO0O0);
            OooO0O0<D> oooO0O02 = this.f19725OooO00o;
            if (oooO0O02 != null) {
                OooO0O0((AbstractC7208o00oOoOo) oooO0O02);
            }
            this.f19724OooO00o = o00ooo00;
            this.f19725OooO00o = oooO0O0;
            return this.f19726OooO00o;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public boolean m18711OooO0OO() {
            OooO0O0<D> oooO0O0;
            if (m14670OooO00o() && (oooO0O0 = this.f19725OooO00o) != null && !oooO0O0.m18712OooO00o()) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.LiveData, com.p118pd.sdk.C7207o00oOoOO
        public void OooO0O0(D d) {
            super.OooO0O0((Object) d);
            C7226o00ooO00<D> o00ooo00 = this.OooO0O0;
            if (o00ooo00 != null) {
                o00ooo00.reset();
                this.OooO0O0 = null;
            }
        }

        @MainThread
        public C7226o00ooO00<D> OooO00o(boolean z) {
            if (C7223o00oo0oO.f19721OooO00o) {
                String str = "  Destroying: " + this;
            }
            this.f19726OooO00o.cancelLoad();
            this.f19726OooO00o.abandon();
            OooO0O0<D> oooO0O0 = this.f19725OooO00o;
            if (oooO0O0 != null) {
                OooO0O0((AbstractC7208o00oOoOo) oooO0O0);
                if (z) {
                    oooO0O0.OooO00o();
                }
            }
            this.f19726OooO00o.unregisterListener(this);
            if ((oooO0O0 == null || oooO0O0.m18712OooO00o()) && !z) {
                return this.f19726OooO00o;
            }
            this.f19726OooO00o.reset();
            return this.OooO0O0;
        }

        @Override // com.p118pd.sdk.C7226o00ooO00.OooO0OO
        public void OooO00o(@NonNull C7226o00ooO00<D> o00ooo00, @Nullable D d) {
            if (C7223o00oo0oO.f19721OooO00o) {
                String str = "onLoadComplete: " + this;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                OooO0O0((Object) d);
                return;
            }
            boolean z = C7223o00oo0oO.f19721OooO00o;
            OooO00o((Object) d);
        }

        public void OooO00o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.OooO0Oo);
            printWriter.print(" mArgs=");
            printWriter.println(this.OooO00o);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f19726OooO00o);
            C7226o00ooO00<D> o00ooo00 = this.f19726OooO00o;
            o00ooo00.dump(str + GlideException.OooO00o.o0ooOoO, fileDescriptor, printWriter, strArr);
            if (this.f19725OooO00o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f19725OooO00o);
                OooO0O0<D> oooO0O0 = this.f19725OooO00o;
                oooO0O0.OooO00o(str + GlideException.OooO00o.o0ooOoO, printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(OooO00o().dataToString((D) m14668OooO00o()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m14670OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.o00oo0oO$OooO0OO */
    public static class OooO0OO extends AbstractC7216o00oo00O {
        public static final C7214o00oo0.OooO0O0 OooO00o = new OooO00o();

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7010o000Ooo<OooO00o> f19729OooO00o = new C7010o000Ooo<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f19730OooO00o = false;

        /* renamed from: com.pd.sdk.o00oo0oO$OooO0OO$OooO00o */
        public static class OooO00o implements C7214o00oo0.OooO0O0 {
            @Override // com.p118pd.sdk.C7214o00oo0.OooO0O0
            @NonNull
            public <T extends AbstractC7216o00oo00O> T OooO00o(@NonNull Class<T> cls) {
                return new OooO0OO();
            }
        }

        @NonNull
        public static OooO0OO OooO00o(C7219o00oo0OO o00oo0oo) {
            return (OooO0OO) new C7214o00oo0(o00oo0oo, OooO00o).OooO00o(OooO0OO.class);
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m18715OooO0O0() {
            return this.f19730OooO00o;
        }

        public void OooO0OO() {
            int OooO00o2 = this.f19729OooO00o.OooO00o();
            for (int i = 0; i < OooO00o2; i++) {
                this.f19729OooO00o.m18269OooO0O0(i).OooO0OO();
            }
        }

        public void OooO0Oo() {
            this.f19730OooO00o = true;
        }

        public void OooO00o(int i, @NonNull OooO00o oooO00o) {
            this.f19729OooO00o.OooO0O0(i, oooO00o);
        }

        public void OooO0O0() {
            this.f19730OooO00o = false;
        }

        public <D> OooO00o<D> OooO00o(int i) {
            return this.f19729OooO00o.m18264OooO00o(i);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18713OooO00o(int i) {
            this.f19729OooO00o.m18270OooO0O0(i);
        }

        @Override // com.p118pd.sdk.AbstractC7216o00oo00O
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18714OooO00o() {
            int OooO00o2 = this.f19729OooO00o.OooO00o();
            for (int i = 0; i < OooO00o2; i++) {
                if (this.f19729OooO00o.m18269OooO0O0(i).m18711OooO0OO()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.p118pd.sdk.AbstractC7216o00oo00O
        public void OooO00o() {
            super.OooO00o();
            int OooO00o2 = this.f19729OooO00o.OooO00o();
            for (int i = 0; i < OooO00o2; i++) {
                this.f19729OooO00o.m18269OooO0O0(i).OooO00o(true);
            }
            this.f19729OooO00o.OooO0O0();
        }

        public void OooO00o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f19729OooO00o.OooO00o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + C9878I1.f23489OooO00o;
                for (int i = 0; i < this.f19729OooO00o.OooO00o(); i++) {
                    OooO00o OooO0O0 = this.f19729OooO00o.m18269OooO0O0(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f19729OooO00o.OooO0O0(i));
                    printWriter.print(": ");
                    printWriter.println(OooO0O0.toString());
                    OooO0O0.OooO00o(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    public C7223o00oo0oO(@NonNull AbstractC7202o00oOo00 o00ooo00, @NonNull C7219o00oo0OO o00oo0oo) {
        this.f19722OooO00o = o00ooo00;
        this.f19723OooO00o = OooO0OO.OooO00o(o00oo0oo);
    }

    /* JADX INFO: finally extract failed */
    @NonNull
    @MainThread
    private <D> C7226o00ooO00<D> OooO00o(int i, @Nullable Bundle bundle, @NonNull AbstractC7221o00oo0o.OooO00o<D> oooO00o, @Nullable C7226o00ooO00<D> o00ooo00) {
        try {
            this.f19723OooO00o.OooO0Oo();
            C7226o00ooO00<D> onCreateLoader = oooO00o.onCreateLoader(i, bundle);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                    }
                }
                OooO00o oooO00o2 = new OooO00o(i, bundle, onCreateLoader, o00ooo00);
                if (f19721OooO00o) {
                    String str = "  Created new loader " + oooO00o2;
                }
                this.f19723OooO00o.OooO00o(i, oooO00o2);
                this.f19723OooO00o.OooO0O0();
                return oooO00o2.OooO00o(this.f19722OooO00o, oooO00o);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f19723OooO00o.OooO0O0();
            throw th;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7221o00oo0o
    @NonNull
    @MainThread
    public <D> C7226o00ooO00<D> OooO0O0(int i, @Nullable Bundle bundle, @NonNull AbstractC7221o00oo0o.OooO00o<D> oooO00o) {
        if (this.f19723OooO00o.m18715OooO0O0()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f19721OooO00o) {
                String str = "restartLoader in " + this + ": args=" + bundle;
            }
            OooO00o<D> OooO00o2 = this.f19723OooO00o.OooO00o(i);
            C7226o00ooO00<D> o00ooo00 = null;
            if (OooO00o2 != null) {
                o00ooo00 = OooO00o2.OooO00o(false);
            }
            return OooO00o(i, bundle, oooO00o, o00ooo00);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C7082o00OO00O.OooO00o(this.f19722OooO00o, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: com.pd.sdk.o00oo0oO$OooO0O0 */
    public static class OooO0O0<D> implements AbstractC7208o00oOoOo<D> {
        @NonNull
        public final AbstractC7221o00oo0o.OooO00o<D> OooO00o;
        @NonNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C7226o00ooO00<D> f19727OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f19728OooO00o = false;

        public OooO0O0(@NonNull C7226o00ooO00<D> o00ooo00, @NonNull AbstractC7221o00oo0o.OooO00o<D> oooO00o) {
            this.f19727OooO00o = o00ooo00;
            this.OooO00o = oooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC7208o00oOoOo
        public void OooO00o(@Nullable D d) {
            if (C7223o00oo0oO.f19721OooO00o) {
                String str = "  onLoadFinished in " + this.f19727OooO00o + ": " + this.f19727OooO00o.dataToString(d);
            }
            this.OooO00o.onLoadFinished(this.f19727OooO00o, d);
            this.f19728OooO00o = true;
        }

        public String toString() {
            return this.OooO00o.toString();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18712OooO00o() {
            return this.f19728OooO00o;
        }

        @MainThread
        public void OooO00o() {
            if (this.f19728OooO00o) {
                if (C7223o00oo0oO.f19721OooO00o) {
                    String str = "  Resetting: " + this.f19727OooO00o;
                }
                this.OooO00o.onLoaderReset(this.f19727OooO00o);
            }
        }

        public void OooO00o(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f19728OooO00o);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7221o00oo0o
    @NonNull
    @MainThread
    public <D> C7226o00ooO00<D> OooO00o(int i, @Nullable Bundle bundle, @NonNull AbstractC7221o00oo0o.OooO00o<D> oooO00o) {
        if (this.f19723OooO00o.m18715OooO0O0()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            OooO00o<D> OooO00o2 = this.f19723OooO00o.OooO00o(i);
            if (f19721OooO00o) {
                String str = "initLoader in " + this + ": args=" + bundle;
            }
            if (OooO00o2 == null) {
                return OooO00o(i, bundle, oooO00o, (C7226o00ooO00) null);
            }
            if (f19721OooO00o) {
                String str2 = "  Re-using existing loader " + OooO00o2;
            }
            return OooO00o2.OooO00o(this.f19722OooO00o, oooO00o);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    @Override // com.p118pd.sdk.AbstractC7221o00oo0o, com.p118pd.sdk.AbstractC7221o00oo0o
    @MainThread
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18708OooO00o(int i) {
        if (this.f19723OooO00o.m18715OooO0O0()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f19721OooO00o) {
                String str = "destroyLoader in " + this + " of " + i;
            }
            OooO00o OooO00o2 = this.f19723OooO00o.OooO00o(i);
            if (OooO00o2 != null) {
                OooO00o2.OooO00o(true);
                this.f19723OooO00o.m18713OooO00o(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    @Override // com.p118pd.sdk.AbstractC7221o00oo0o, com.p118pd.sdk.AbstractC7221o00oo0o
    @Nullable
    public <D> C7226o00ooO00<D> OooO00o(int i) {
        if (!this.f19723OooO00o.m18715OooO0O0()) {
            OooO00o<D> OooO00o2 = this.f19723OooO00o.OooO00o(i);
            if (OooO00o2 != null) {
                return OooO00o2.OooO00o();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // com.p118pd.sdk.AbstractC7221o00oo0o, com.p118pd.sdk.AbstractC7221o00oo0o
    public void OooO00o() {
        this.f19723OooO00o.OooO0OO();
    }

    @Override // com.p118pd.sdk.AbstractC7221o00oo0o
    @Deprecated
    public void OooO00o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f19723OooO00o.OooO00o(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.p118pd.sdk.AbstractC7221o00oo0o, com.p118pd.sdk.AbstractC7221o00oo0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18709OooO00o() {
        return this.f19723OooO00o.m18714OooO00o();
    }
}
