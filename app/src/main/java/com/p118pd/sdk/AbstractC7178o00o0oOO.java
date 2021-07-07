package com.p118pd.sdk;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.o00o0oOO  reason: case insensitive filesystem */
public abstract class AbstractC7178o00o0oOO extends AbstractC7314o0O0Oo0O {
    public static final String OooO00o = "FragmentStatePagerAdapt";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f19618OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Fragment f19619OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7175o00o0o0o f19620OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7179o00o0oOo f19621OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<Fragment.SavedState> f19622OooO00o = new ArrayList<>();
    public ArrayList<Fragment> OooO0O0 = new ArrayList<>();

    public AbstractC7178o00o0oOO(AbstractC7175o00o0o0o o00o0o0o) {
        this.f19620OooO00o = o00o0o0o;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f19621OooO00o == null) {
            this.f19621OooO00o = this.f19620OooO00o.m18663OooO00o();
        }
        while (this.f19622OooO00o.size() <= i) {
            this.f19622OooO00o.add(null);
        }
        this.f19622OooO00o.set(i, fragment.isAdded() ? this.f19620OooO00o.OooO00o(fragment) : null);
        this.OooO0O0.set(i, null);
        this.f19621OooO00o.OooO0Oo(fragment);
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        AbstractC7179o00o0oOo o00o0ooo = this.f19621OooO00o;
        if (o00o0ooo != null) {
            o00o0ooo.OooO0O0();
            this.f19621OooO00o = null;
        }
    }

    public abstract Fragment getItem(int i);

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.OooO0O0.size() > i && (fragment = this.OooO0O0.get(i)) != null) {
            return fragment;
        }
        if (this.f19621OooO00o == null) {
            this.f19621OooO00o = this.f19620OooO00o.m18663OooO00o();
        }
        Fragment item = getItem(i);
        if (this.f19622OooO00o.size() > i && (savedState = this.f19622OooO00o.get(i)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.OooO0O0.size() <= i) {
            this.OooO0O0.add(null);
        }
        item.setMenuVisibility(false);
        item.setUserVisibleHint(false);
        this.OooO0O0.set(i, item);
        this.f19621OooO00o.OooO00o(viewGroup.getId(), item);
        return item;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f19622OooO00o.clear();
            this.OooO0O0.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f19622OooO00o.add((Fragment.SavedState) parcelable2);
                }
            }
            for (T t : bundle.keySet()) {
                if (t.startsWith("f")) {
                    int parseInt = Integer.parseInt(t.substring(1));
                    Fragment OooO00o2 = this.f19620OooO00o.OooO00o(bundle, t);
                    if (OooO00o2 != null) {
                        while (this.OooO0O0.size() <= parseInt) {
                            this.OooO0O0.add(null);
                        }
                        OooO00o2.setMenuVisibility(false);
                        this.OooO0O0.set(parseInt, OooO00o2);
                    } else {
                        String str = "Bad fragment at key " + ((String) t);
                    }
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public Parcelable saveState() {
        Bundle bundle;
        if (this.f19622OooO00o.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f19622OooO00o.size()];
            this.f19622OooO00o.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.OooO0O0.size(); i++) {
            Fragment fragment = this.OooO0O0.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f19620OooO00o.OooO00o(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f19619OooO00o;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f19619OooO00o.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f19619OooO00o = fragment;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}
