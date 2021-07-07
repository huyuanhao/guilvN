package com.qiyukf.nim.uikit.common.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.C8783oo0oooOO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.unicorn.p232k.C2709i;
import s.h.e.l.l.C;

public abstract class TFragment extends Fragment {

    /* renamed from: a */
    public static final Handler f3472a = new Handler();

    /* renamed from: b */
    public int f3473b;

    /* renamed from: c */
    public boolean f3474c;

    static {
        C.i(16777267);
    }

    /* renamed from: a */
    public final void mo34184a(final Runnable runnable, long j) {
        f3472a.postDelayed(new Runnable() {
            /* class com.qiyukf.nim.uikit.common.fragment.TFragment.RunnableC18851 */

            public final void run() {
                if (TFragment.this.isAdded()) {
                    runnable.run();
                }
            }
        }, j);
    }

    @Override // androidx.fragment.app.Fragment
    public native void onActivityCreated(Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        C1709a.m3011a(C8783oo0oooOO.OooO0OO, "fragment: " + getClass().getSimpleName() + " onCreate()");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C1709a.m3011a(C8783oo0oooOO.OooO0OO, "fragment: " + getClass().getSimpleName() + " onCreateView()");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public native void onDestroy();

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C2709i.m6266a(i, iArr);
    }

    public native void setContainerId(int i);
}
