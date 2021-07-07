package com.p118pd.sdk;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.pd.sdk.o00o0oO  reason: case insensitive filesystem */
public abstract class AbstractC7176o00o0oO extends AbstractC7314o0O0Oo0O {
    public static final boolean DEBUG = false;
    public static final String TAG = "FragmentPagerAdapter";
    public AbstractC7179o00o0oOo mCurTransaction = null;
    public Fragment mCurrentPrimaryItem = null;
    public final AbstractC7175o00o0o0o mFragmentManager;

    public AbstractC7176o00o0oO(AbstractC7175o00o0o0o o00o0o0o) {
        this.mFragmentManager = o00o0o0o;
    }

    public static String makeFragmentName(int i, long j) {
        return "android:switcher:" + i + Constants.COLON_SEPARATOR + j;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m18663OooO00o();
        }
        this.mCurTransaction.OooO0O0((Fragment) obj);
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        AbstractC7179o00o0oOo o00o0ooo = this.mCurTransaction;
        if (o00o0ooo != null) {
            o00o0ooo.OooO0O0();
            this.mCurTransaction = null;
        }
    }

    public abstract Fragment getItem(int i);

    public long getItemId(int i) {
        return (long) i;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m18663OooO00o();
        }
        long itemId = getItemId(i);
        Fragment OooO00o = this.mFragmentManager.OooO00o(makeFragmentName(viewGroup.getId(), itemId));
        if (OooO00o != null) {
            this.mCurTransaction.OooO00o(OooO00o);
        } else {
            OooO00o = getItem(i);
            this.mCurTransaction.OooO00o(viewGroup.getId(), OooO00o, makeFragmentName(viewGroup.getId(), itemId));
        }
        if (OooO00o != this.mCurrentPrimaryItem) {
            OooO00o.setMenuVisibility(false);
            OooO00o.setUserVisibleHint(false);
        }
        return OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public Parcelable saveState() {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.mCurrentPrimaryItem.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}
