package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.manager.RequestManagerFragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oO00o000  reason: case insensitive filesystem */
public class C7815oO00o000 implements Handler.Callback {
    public static final int OooO00o = 1;
    @VisibleForTesting

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20861OooO00o = "com.bumptech.glide.manager";
    public static final int OooO0O0 = 2;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final OooO0O0 f20862OooO0O0 = new OooO00o();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f20863OooO0O0 = "RMRetriever";
    public static final String OooO0OO = "key";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Bundle f20864OooO00o = new Bundle();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Handler f20865OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6971o0000oO0<View, Fragment> f20866OooO00o = new C6971o0000oO0<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile C7658o0oOooOO f20867OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f20868OooO00o;
    @VisibleForTesting

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<FragmentManager, RequestManagerFragment> f20869OooO00o = new HashMap();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final C6971o0000oO0<View, android.app.Fragment> f20870OooO0O0 = new C6971o0000oO0<>();
    @VisibleForTesting

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Map<AbstractC7175o00o0o0o, C7901oO0OoOo0> f20871OooO0O0 = new HashMap();

    /* renamed from: com.pd.sdk.oO00o000$OooO00o */
    public class OooO00o implements OooO0O0 {
        @Override // com.p118pd.sdk.C7815oO00o000.OooO0O0
        @NonNull
        public C7658o0oOooOO OooO00o(@NonNull ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, @NonNull AbstractC7809oO00Ooo oo00ooo, @NonNull AbstractC7814oO00o00 oo00o00, @NonNull Context context) {
            return new C7658o0oOooOO(o0o0oo0o, oo00ooo, oo00o00, context);
        }
    }

    /* renamed from: com.pd.sdk.oO00o000$OooO0O0 */
    public interface OooO0O0 {
        @NonNull
        C7658o0oOooOO OooO00o(@NonNull ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, @NonNull AbstractC7809oO00Ooo oo00ooo, @NonNull AbstractC7814oO00o00 oo00o00, @NonNull Context context);
    }

    public C7815oO00o000(@Nullable OooO0O0 oooO0O0) {
        this.f20868OooO00o = oooO0O0 == null ? f20862OooO0O0 : oooO0O0;
        this.f20865OooO00o = new Handler(Looper.getMainLooper(), this);
    }

    @NonNull
    private C7658o0oOooOO OooO0O0(@NonNull Context context) {
        if (this.f20867OooO00o == null) {
            synchronized (this) {
                if (this.f20867OooO00o == null) {
                    this.f20867OooO00o = this.f20868OooO00o.OooO00o(ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context.getApplicationContext()), new C7805oO00OoO(), new C7810oO00Ooo0(), context.getApplicationContext());
                }
            }
        }
        return this.f20867OooO00o;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7658o0oOooOO m19511OooO00o(@NonNull Context context) {
        if (context != null) {
            if (oO0O0O00.m19528OooO0O0() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return OooO00o((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return m19510OooO00o((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    return m19511OooO00o(((ContextWrapper) context).getBaseContext());
                }
            }
            return OooO0O0(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        int i = message.what;
        Object obj4 = null;
        boolean z = true;
        if (i == 1) {
            obj3 = (FragmentManager) message.obj;
            obj2 = this.f20869OooO00o.remove(obj3);
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj4 == null && Log.isLoggable(f20863OooO0O0, 5)) {
                String str = "Failed to remove expected request manager fragment, manager: " + obj;
            }
            return z;
        } else {
            obj3 = (AbstractC7175o00o0o0o) message.obj;
            obj2 = this.f20871OooO0O0.remove(obj3);
        }
        obj4 = obj2;
        obj = obj3;
        String str2 = "Failed to remove expected request manager fragment, manager: " + obj;
        return z;
    }

    @Deprecated
    private void OooO0O0(@NonNull FragmentManager fragmentManager, @NonNull C6971o0000oO0<View, android.app.Fragment> o0000oo0) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f20864OooO00o.putInt("key", i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f20864OooO00o, "key");
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    o0000oo0.put(fragment.getView(), fragment);
                    if (Build.VERSION.SDK_INT >= 17) {
                        OooO00o(fragment.getChildFragmentManager(), o0000oo0);
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    @NonNull
    public C7658o0oOooOO OooO00o(@NonNull FragmentActivity fragmentActivity) {
        if (oO0O0O00.m19525OooO00o()) {
            return m19511OooO00o(fragmentActivity.getApplicationContext());
        }
        OooO00o((Activity) fragmentActivity);
        return OooO00o(fragmentActivity, fragmentActivity.getSupportFragmentManager(), (Fragment) null, m19508OooO00o((Activity) fragmentActivity));
    }

    @NonNull
    public C7658o0oOooOO OooO00o(@NonNull Fragment fragment) {
        C7842oO0O0.OooO00o(fragment.getActivity(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (oO0O0O00.m19525OooO00o()) {
            return m19511OooO00o(fragment.getActivity().getApplicationContext());
        }
        return OooO00o(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7658o0oOooOO m19510OooO00o(@NonNull Activity activity) {
        if (oO0O0O00.m19525OooO00o()) {
            return m19511OooO00o(activity.getApplicationContext());
        }
        OooO00o(activity);
        return OooO00o(activity, activity.getFragmentManager(), (android.app.Fragment) null, m19508OooO00o(activity));
    }

    @NonNull
    public C7658o0oOooOO OooO00o(@NonNull View view) {
        if (oO0O0O00.m19525OooO00o()) {
            return m19511OooO00o(view.getContext().getApplicationContext());
        }
        C7842oO0O0.OooO00o(view);
        C7842oO0O0.OooO00o(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity OooO00o2 = OooO00o(view.getContext());
        if (OooO00o2 == null) {
            return m19511OooO00o(view.getContext().getApplicationContext());
        }
        if (OooO00o2 instanceof FragmentActivity) {
            Fragment OooO00o3 = OooO00o(view, (FragmentActivity) OooO00o2);
            return OooO00o3 != null ? OooO00o(OooO00o3) : m19510OooO00o(OooO00o2);
        }
        android.app.Fragment OooO00o4 = OooO00o(view, OooO00o2);
        if (OooO00o4 == null) {
            return m19510OooO00o(OooO00o2);
        }
        return OooO00o(OooO00o4);
    }

    public static void OooO00o(@Nullable Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment fragment : collection) {
                if (!(fragment == null || fragment.getView() == null)) {
                    map.put(fragment.getView(), fragment);
                    OooO00o(fragment.getChildFragmentManager().m18664OooO00o(), map);
                }
            }
        }
    }

    @Nullable
    private Fragment OooO00o(@NonNull View view, @NonNull FragmentActivity fragmentActivity) {
        this.f20866OooO00o.clear();
        OooO00o(fragmentActivity.getSupportFragmentManager().m18664OooO00o(), this.f20866OooO00o);
        View findViewById = fragmentActivity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f20866OooO00o.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f20866OooO00o.clear();
        return fragment;
    }

    @Nullable
    @Deprecated
    private android.app.Fragment OooO00o(@NonNull View view, @NonNull Activity activity) {
        this.f20870OooO0O0.clear();
        OooO00o(activity.getFragmentManager(), this.f20870OooO0O0);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f20870OooO0O0.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f20870OooO0O0.clear();
        return fragment;
    }

    @TargetApi(26)
    @Deprecated
    private void OooO00o(@NonNull FragmentManager fragmentManager, @NonNull C6971o0000oO0<View, android.app.Fragment> o0000oo0) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    o0000oo0.put(fragment.getView(), fragment);
                    OooO00o(fragment.getChildFragmentManager(), o0000oo0);
                }
            }
            return;
        }
        OooO0O0(fragmentManager, o0000oo0);
    }

    @Nullable
    private Activity OooO00o(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return OooO00o(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(17)
    public static void OooO00o(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @NonNull
    @TargetApi(17)
    @Deprecated
    public C7658o0oOooOO OooO00o(@NonNull android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (oO0O0O00.m19525OooO00o() || Build.VERSION.SDK_INT < 17) {
            return m19511OooO00o(fragment.getActivity().getApplicationContext());
        } else {
            return OooO00o(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    @NonNull
    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public RequestManagerFragment m19509OooO00o(Activity activity) {
        return OooO00o(activity.getFragmentManager(), (android.app.Fragment) null, m19508OooO00o(activity));
    }

    @NonNull
    private RequestManagerFragment OooO00o(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag(f20861OooO00o);
        if (requestManagerFragment == null && (requestManagerFragment = this.f20869OooO00o.get(fragmentManager)) == null) {
            requestManagerFragment = new RequestManagerFragment();
            requestManagerFragment.m15010OooO00o(fragment);
            if (z) {
                requestManagerFragment.m15007OooO00o().OooO0O0();
            }
            this.f20869OooO00o.put(fragmentManager, requestManagerFragment);
            fragmentManager.beginTransaction().add(requestManagerFragment, f20861OooO00o).commitAllowingStateLoss();
            this.f20865OooO00o.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment;
    }

    @NonNull
    @Deprecated
    private C7658o0oOooOO OooO00o(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        RequestManagerFragment OooO00o2 = OooO00o(fragmentManager, fragment, z);
        C7658o0oOooOO OooO00o3 = OooO00o2.m15006OooO00o();
        if (OooO00o3 != null) {
            return OooO00o3;
        }
        C7658o0oOooOO OooO00o4 = this.f20868OooO00o.OooO00o(ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context), OooO00o2.m15007OooO00o(), OooO00o2.m15008OooO00o(), context);
        OooO00o2.OooO00o(OooO00o4);
        return OooO00o4;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7901oO0OoOo0 m19512OooO00o(FragmentActivity fragmentActivity) {
        return OooO00o(fragmentActivity.getSupportFragmentManager(), (Fragment) null, m19508OooO00o((Activity) fragmentActivity));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19508OooO00o(Activity activity) {
        return !activity.isFinishing();
    }

    @NonNull
    private C7901oO0OoOo0 OooO00o(@NonNull AbstractC7175o00o0o0o o00o0o0o, @Nullable Fragment fragment, boolean z) {
        C7901oO0OoOo0 oo0oooo0 = (C7901oO0OoOo0) o00o0o0o.OooO00o(f20861OooO00o);
        if (oo0oooo0 == null && (oo0oooo0 = this.f20871OooO0O0.get(o00o0o0o)) == null) {
            oo0oooo0 = new C7901oO0OoOo0();
            oo0oooo0.m19586OooO00o(fragment);
            if (z) {
                oo0oooo0.m19583OooO00o().OooO0O0();
            }
            this.f20871OooO0O0.put(o00o0o0o, oo0oooo0);
            o00o0o0o.m18663OooO00o().OooO00o(oo0oooo0, f20861OooO00o).OooO0Oo();
            this.f20865OooO00o.obtainMessage(2, o00o0o0o).sendToTarget();
        }
        return oo0oooo0;
    }

    @NonNull
    private C7658o0oOooOO OooO00o(@NonNull Context context, @NonNull AbstractC7175o00o0o0o o00o0o0o, @Nullable Fragment fragment, boolean z) {
        C7901oO0OoOo0 OooO00o2 = OooO00o(o00o0o0o, fragment, z);
        C7658o0oOooOO OooO00o3 = OooO00o2.m19582OooO00o();
        if (OooO00o3 != null) {
            return OooO00o3;
        }
        C7658o0oOooOO OooO00o4 = this.f20868OooO00o.OooO00o(ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context), OooO00o2.m19583OooO00o(), OooO00o2.m19584OooO00o(), context);
        OooO00o2.OooO00o(OooO00o4);
        return OooO00o4;
    }
}
