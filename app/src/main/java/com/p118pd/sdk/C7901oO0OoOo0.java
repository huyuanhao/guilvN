package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.oO0OoOo0  reason: case insensitive filesystem */
public class C7901oO0OoOo0 extends Fragment {
    public static final String o0ooOOo = "SupportRMFragment";
    @Nullable
    public Fragment OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7658o0oOooOO f20968OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7806oO00OoO0 f20969OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7814oO00o00 f20970OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7901oO0OoOo0 f20971OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<C7901oO0OoOo0> f20972OooO00o;

    /* renamed from: com.pd.sdk.oO0OoOo0$OooO00o */
    public class OooO00o implements AbstractC7814oO00o00 {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7814oO00o00
        @NonNull
        public Set<C7658o0oOooOO> OooO00o() {
            Set<C7901oO0OoOo0> OooO00o2 = C7901oO0OoOo0.this.m19585OooO00o();
            HashSet hashSet = new HashSet(OooO00o2.size());
            for (C7901oO0OoOo0 oo0oooo0 : OooO00o2) {
                if (oo0oooo0.m19582OooO00o() != null) {
                    hashSet.add(oo0oooo0.m19582OooO00o());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C7901oO0OoOo0.this + C7522o0Ooo0o.OooO0Oo;
        }
    }

    static {
        C.i(29);
    }

    public C7901oO0OoOo0() {
        this(new C7806oO00OoO0());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private native void m19581OooO00o();

    private native void OooO00o(C7901oO0OoOo0 oo0oooo0);

    private native void OooO0O0(C7901oO0OoOo0 oo0oooo0);

    public void OooO00o(@Nullable C7658o0oOooOO o0oooooo) {
        this.f20968OooO00o = o0oooooo;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            OooO00o(getActivity());
        } catch (IllegalStateException unused) {
            Log.isLoggable(o0ooOOo, 5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public native void onDestroy();

    @Override // androidx.fragment.app.Fragment
    public native void onDetach();

    @Override // androidx.fragment.app.Fragment
    public native void onStart();

    @Override // androidx.fragment.app.Fragment
    public native void onStop();

    @Override // androidx.fragment.app.Fragment
    public native String toString();

    @SuppressLint({"ValidFragment"})
    @VisibleForTesting
    public C7901oO0OoOo0(@NonNull C7806oO00OoO0 oo00ooo0) {
        this.f20970OooO00o = new OooO00o();
        this.f20972OooO00o = new HashSet();
        this.f20969OooO00o = oo00ooo0;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7806oO00OoO0 m19583OooO00o() {
        return this.f20969OooO00o;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7658o0oOooOO m19582OooO00o() {
        return this.f20968OooO00o;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7814oO00o00 m19584OooO00o() {
        return this.f20970OooO00o;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<C7901oO0OoOo0> m19585OooO00o() {
        C7901oO0OoOo0 oo0oooo0 = this.f20971OooO00o;
        if (oo0oooo0 == null) {
            return Collections.emptySet();
        }
        if (equals(oo0oooo0)) {
            return Collections.unmodifiableSet(this.f20972OooO00o);
        }
        HashSet hashSet = new HashSet();
        for (C7901oO0OoOo0 oo0oooo02 : this.f20971OooO00o.m19585OooO00o()) {
            if (OooO00o(oo0oooo02.OooO00o())) {
                hashSet.add(oo0oooo02);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19586OooO00o(@Nullable Fragment fragment) {
        this.OooO00o = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            OooO00o(fragment.getActivity());
        }
    }

    @Nullable
    private Fragment OooO00o() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.OooO00o;
    }

    private boolean OooO00o(@NonNull Fragment fragment) {
        Fragment OooO00o2 = OooO00o();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(OooO00o2)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void OooO00o(@NonNull FragmentActivity fragmentActivity) {
        m19581OooO00o();
        C7901oO0OoOo0 OooO00o2 = ComponentCallbacks2C7604o0o0Oo0o.OooO00o((Context) fragmentActivity).m19240OooO00o().m19512OooO00o(fragmentActivity);
        this.f20971OooO00o = OooO00o2;
        if (!equals(OooO00o2)) {
            this.f20971OooO00o.OooO00o(this);
        }
    }
}
