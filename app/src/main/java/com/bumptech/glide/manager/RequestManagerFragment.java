package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.p118pd.sdk.AbstractC7814oO00o00;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.C7658o0oOooOO;
import com.p118pd.sdk.C7806oO00OoO0;
import com.p118pd.sdk.ComponentCallbacks2C7604o0o0Oo0o;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import s.h.e.l.l.C;

@Deprecated
public class RequestManagerFragment extends Fragment {
    public static final String o0ooOOo = "RMFragment";
    @Nullable
    public Fragment OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public RequestManagerFragment f14841OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7658o0oOooOO f14842OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7806oO00OoO0 f14843OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7814oO00o00 f14844OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<RequestManagerFragment> f14845OooO00o;

    public class OooO00o implements AbstractC7814oO00o00 {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7814oO00o00
        @NonNull
        public Set<C7658o0oOooOO> OooO00o() {
            Set<RequestManagerFragment> OooO00o2 = RequestManagerFragment.this.m15009OooO00o();
            HashSet hashSet = new HashSet(OooO00o2.size());
            for (RequestManagerFragment requestManagerFragment : OooO00o2) {
                if (requestManagerFragment.m15006OooO00o() != null) {
                    hashSet.add(requestManagerFragment.m15006OooO00o());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + C7522o0Ooo0o.OooO0Oo;
        }
    }

    static {
        C.i(3);
    }

    public RequestManagerFragment() {
        this(new C7806oO00OoO0());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private native void m15005OooO00o();

    private native void OooO00o(RequestManagerFragment requestManagerFragment);

    private native void OooO0O0(RequestManagerFragment requestManagerFragment);

    public void OooO00o(@Nullable C7658o0oOooOO o0oooooo) {
        this.f14842OooO00o = o0oooooo;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            OooO00o(activity);
        } catch (IllegalStateException unused) {
            Log.isLoggable(o0ooOOo, 5);
        }
    }

    public native void onDestroy();

    public native void onDetach();

    public native void onStart();

    public native void onStop();

    public native String toString();

    @SuppressLint({"ValidFragment"})
    @VisibleForTesting
    public RequestManagerFragment(@NonNull C7806oO00OoO0 oo00ooo0) {
        this.f14844OooO00o = new OooO00o();
        this.f14845OooO00o = new HashSet();
        this.f14843OooO00o = oo00ooo0;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7806oO00OoO0 m15007OooO00o() {
        return this.f14843OooO00o;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7658o0oOooOO m15006OooO00o() {
        return this.f14842OooO00o;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7814oO00o00 m15008OooO00o() {
        return this.f14844OooO00o;
    }

    @NonNull
    @TargetApi(17)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<RequestManagerFragment> m15009OooO00o() {
        if (equals(this.f14841OooO00o)) {
            return Collections.unmodifiableSet(this.f14845OooO00o);
        }
        if (this.f14841OooO00o == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (RequestManagerFragment requestManagerFragment : this.f14841OooO00o.m15009OooO00o()) {
            if (OooO00o(requestManagerFragment.getParentFragment())) {
                hashSet.add(requestManagerFragment);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15010OooO00o(@Nullable Fragment fragment) {
        this.OooO00o = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            OooO00o(fragment.getActivity());
        }
    }

    @Nullable
    @TargetApi(17)
    private Fragment OooO00o() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.OooO00o;
    }

    @TargetApi(17)
    private boolean OooO00o(@NonNull Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void OooO00o(@NonNull Activity activity) {
        m15005OooO00o();
        RequestManagerFragment OooO00o2 = ComponentCallbacks2C7604o0o0Oo0o.OooO00o((Context) activity).m19240OooO00o().m19509OooO00o(activity);
        this.f14841OooO00o = OooO00o2;
        if (!equals(OooO00o2)) {
            this.f14841OooO00o.OooO00o(this);
        }
    }
}
