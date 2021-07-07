package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class zaa extends ActivityLifecycleObserver {
    public final WeakReference<C4887zaa> zack;

    public zaa(Activity activity) {
        this(C4887zaa.zaa(activity));
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C4887zaa zaa = this.zack.get();
        if (zaa != null) {
            zaa.zaa((C4887zaa) runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }

    @VisibleForTesting(otherwise = 2)
    public zaa(C4887zaa zaa) {
        this.zack = new WeakReference<>(zaa);
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: com.google.android.gms.common.api.internal.zaa$zaa  reason: collision with other inner class name */
    public static class C4887zaa extends LifecycleCallback {
        public List<Runnable> zacl = new ArrayList();

        public C4887zaa(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        public static C4887zaa zaa(Activity activity) {
            C4887zaa zaa;
            synchronized (activity) {
                LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                zaa = (C4887zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", C4887zaa.class);
                if (zaa == null) {
                    zaa = new C4887zaa(fragment);
                }
            }
            return zaa;
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        @MainThread
        public void onStop() {
            List<Runnable> list;
            synchronized (this) {
                list = this.zacl;
                this.zacl = new ArrayList();
            }
            for (Runnable runnable : list) {
                runnable.run();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final synchronized void zaa(Runnable runnable) {
            this.zacl.add(runnable);
        }
    }
}
