package com.qiyukf.unicorn.mediaselect;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.qiyukf.nim.uikit.provider.UnicornProvider;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2741b;
import com.qiyukf.unicorn.mediaselect.p233a.p234a.C2727a;
import com.qiyukf.unicorn.mediaselect.p235b.p236a.C2733a;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: com.qiyukf.unicorn.mediaselect.a */
public final class C2725a {

    /* renamed from: a */
    public final WeakReference<Activity> f5628a;

    /* renamed from: b */
    public final WeakReference<Fragment> f5629b;

    public C2725a(Activity activity) {
        this(activity, null);
    }

    public C2725a(Activity activity, Fragment fragment) {
        this.f5628a = new WeakReference<>(activity);
        this.f5629b = new WeakReference<>(fragment);
    }

    public C2725a(Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    /* renamed from: a */
    private C2735c m6291a(Set<EnumC2731b> set) {
        return new C2735c(this, set);
    }

    /* renamed from: a */
    public static void m6292a(Activity activity, Set<EnumC2731b> set, int i, int i2) {
        C2735c b = new C2725a(activity).m6291a(set).mo36489a().mo36492a(new C2733a()).mo36495b(activity.getResources().getDimensionPixelSize(C2364R.dimen.ysf_grid_expected_size)).mo36498d().mo36493a(new C2741b(UnicornProvider.m3771a(activity))).mo36499e().mo36491a(new C2727a()).mo36496c().mo36494b();
        if (i != 0) {
            b.mo36490a(i);
        }
        b.mo36497c(i2);
    }

    /* renamed from: a */
    public static void m6293a(Fragment fragment, Set<EnumC2731b> set, int i, int i2) {
        C2735c b = new C2725a(fragment).m6291a(set).mo36489a().mo36492a(new C2733a()).mo36495b(fragment.getResources().getDimensionPixelSize(C2364R.dimen.ysf_grid_expected_size)).mo36498d().mo36493a(new C2741b(UnicornProvider.m3771a(fragment.getContext()))).mo36499e().mo36491a(new C2727a()).mo36496c().mo36494b();
        if (i != 0) {
            b.mo36490a(i);
        }
        b.mo36497c(i2);
    }

    @Nullable
    /* renamed from: a */
    public final Activity mo36478a() {
        return this.f5628a.get();
    }

    @Nullable
    /* renamed from: b */
    public final Fragment mo36479b() {
        WeakReference<Fragment> weakReference = this.f5629b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
