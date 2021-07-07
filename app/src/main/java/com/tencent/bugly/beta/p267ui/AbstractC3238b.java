package com.tencent.bugly.beta.p267ui;

import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: com.tencent.bugly.beta.ui.b */
public abstract class AbstractC3238b extends Fragment {

    /* renamed from: m */
    public boolean f7438m = false;

    /* renamed from: a */
    public synchronized void mo38009a() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: a */
    public abstract boolean mo38016a(int i, KeyEvent keyEvent);

    /* renamed from: b */
    public synchronized boolean mo38017b() {
        return this.f7438m;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        synchronized (this) {
            this.f7438m = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        synchronized (this) {
            this.f7438m = true;
        }
    }
}
