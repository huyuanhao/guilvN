package com.p118pd.sdk;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import com.bumptech.glide.load.engine.GlideException;
import com.p118pd.sdk.AbstractC7175o00o0o0o;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.pd.sdk.o00o0o  reason: case insensitive filesystem */
public final class LayoutInflater$Factory2C7167o00o0o extends AbstractC7175o00o0o0o implements LayoutInflater.Factory2 {
    public static final Interpolator OooO00o = new DecelerateInterpolator(2.5f);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Field f19570OooO00o = null;
    public static final Interpolator OooO0O0 = new DecelerateInterpolator(1.5f);
    public static final Interpolator OooO0OO = new AccelerateInterpolator(2.5f);
    public static final Interpolator OooO0Oo = new AccelerateInterpolator(1.5f);
    public static boolean OooO0oo = false;
    public static final int o000OOo = 6;
    public static final int o0O0O00 = 5;
    public static final int o0OO00O = 3;

    /* renamed from: o0OO00O  reason: collision with other field name */
    public static final String f19571o0OO00O = "android:view_state";
    public static final int o0OOO0o = 1;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public static final String f19572o0OOO0o = "android:target_req_state";
    public static final int o0Oo0oo = 2;

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public static final String f19573o0Oo0oo = "android:target_state";
    public static final int o0ooOoO = 220;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public static final String f19574o0ooOoO = "FragmentManager";
    public static final int oo0o0Oo = 4;

    /* renamed from: oo0o0Oo  reason: collision with other field name */
    public static final String f19575oo0o0Oo = "android:user_visible_hint";
    public ArrayList<Boolean> OooO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bundle f19576OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SparseArray<Fragment> f19577OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Fragment f19578OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7166o00o0Ooo f19579OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7174o00o0o0O f19580OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7177o00o0oO0 f19581OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f19582OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<AbstractC7172OooOO0o> f19583OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CopyOnWriteArrayList<OooOO0> f19584OooO00o = new CopyOnWriteArrayList<>();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public SparseArray<Parcelable> f19585OooO0O0 = null;
    @Nullable

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Fragment f19586OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final ArrayList<Fragment> f19587OooO0O0 = new ArrayList<>();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19588OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public ArrayList<C7163o00o0Oo> f19589OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f19590OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public ArrayList<Fragment> f19591OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f19592OooO0Oo;
    public ArrayList<Integer> OooO0o;

    /* renamed from: OooO0o  reason: collision with other field name */
    public boolean f19593OooO0o;
    public ArrayList<C7163o00o0Oo> OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f19594OooO0o0;
    public ArrayList<AbstractC7175o00o0o0o.OooO0OO> OooO0oO;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public boolean f19595OooO0oO;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public ArrayList<C7163o00o0Oo> f19596OooO0oo;
    public ArrayList<Fragment> OooOO0;
    public ArrayList<OooOOO> OooOO0O;
    public int o0ooOO0 = 0;
    public int o0ooOOo = 0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public String f19597o0ooOOo;

    /* renamed from: com.pd.sdk.o00o0o$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            LayoutInflater$Factory2C7167o00o0o.this.m18641OooO0o0();
        }
    }

    /* renamed from: com.pd.sdk.o00o0o$OooO0O0 */
    public class OooO0O0 extends OooO0o {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Fragment f19599OooO00o;

        /* renamed from: com.pd.sdk.o00o0o$OooO0O0$OooO00o */
        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            public void run() {
                if (OooO0O0.this.f19599OooO00o.getAnimatingAway() != null) {
                    OooO0O0.this.f19599OooO00o.setAnimatingAway(null);
                    OooO0O0 oooO0O0 = OooO0O0.this;
                    LayoutInflater$Factory2C7167o00o0o o00o0o = LayoutInflater$Factory2C7167o00o0o.this;
                    Fragment fragment = oooO0O0.f19599OooO00o;
                    o00o0o.OooO00o(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(Animation.AnimationListener animationListener, ViewGroup viewGroup, Fragment fragment) {
            super(animationListener);
            this.OooO00o = viewGroup;
            this.f19599OooO00o = fragment;
        }

        @Override // com.p118pd.sdk.LayoutInflater$Factory2C7167o00o0o.OooO0o
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.OooO00o.post(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.o00o0o$OooO0OO */
    public class OooO0OO extends AnimatorListenerAdapter {
        public final /* synthetic */ View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ViewGroup f19601OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Fragment f19602OooO00o;

        public OooO0OO(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f19601OooO00o = viewGroup;
            this.OooO00o = view;
            this.f19602OooO00o = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f19601OooO00o.endViewTransition(this.OooO00o);
            Animator animator2 = this.f19602OooO00o.getAnimator();
            this.f19602OooO00o.setAnimator(null);
            if (animator2 != null && this.f19601OooO00o.indexOfChild(this.OooO00o) < 0) {
                LayoutInflater$Factory2C7167o00o0o o00o0o = LayoutInflater$Factory2C7167o00o0o.this;
                Fragment fragment = this.f19602OooO00o;
                o00o0o.OooO00o(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
            }
        }
    }

    /* renamed from: com.pd.sdk.o00o0o$OooO0Oo  reason: case insensitive filesystem */
    public class C7168OooO0Oo extends AnimatorListenerAdapter {
        public final /* synthetic */ View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ViewGroup f19604OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Fragment f19605OooO00o;

        public C7168OooO0Oo(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f19604OooO00o = viewGroup;
            this.OooO00o = view;
            this.f19605OooO00o = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f19604OooO00o.endViewTransition(this.OooO00o);
            animator.removeListener(this);
            View view = this.f19605OooO00o.mView;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: com.pd.sdk.o00o0o$OooO0o */
    public static class OooO0o implements Animation.AnimationListener {
        public final Animation.AnimationListener OooO00o;

        public OooO0o(Animation.AnimationListener animationListener) {
            this.OooO00o = animationListener;
        }

        @CallSuper
        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.OooO00o;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        @CallSuper
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.OooO00o;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        @CallSuper
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.OooO00o;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: com.pd.sdk.o00o0o$OooO0o0  reason: case insensitive filesystem */
    public static class C7169OooO0o0 extends OooO0o {
        public View OooO00o;

        /* renamed from: com.pd.sdk.o00o0o$OooO0o0$OooO00o */
        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            public void run() {
                C7169OooO0o0.this.OooO00o.setLayerType(0, null);
            }
        }

        public C7169OooO0o0(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.OooO00o = view;
        }

        @Override // com.p118pd.sdk.LayoutInflater$Factory2C7167o00o0o.OooO0o
        @CallSuper
        public void onAnimationEnd(Animation animation) {
            if (ViewCompat.m14604OooO0oo(this.OooO00o) || Build.VERSION.SDK_INT >= 24) {
                this.OooO00o.post(new OooO00o());
            } else {
                this.OooO00o.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: com.pd.sdk.o00o0o$OooO0oo  reason: case insensitive filesystem */
    public static class C7171OooO0oo extends AnimatorListenerAdapter {
        public View OooO00o;

        public C7171OooO0oo(View view) {
            this.OooO00o = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.OooO00o.setLayerType(0, null);
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            this.OooO00o.setLayerType(2, null);
        }
    }

    /* renamed from: com.pd.sdk.o00o0o$OooOO0 */
    public static final class OooOO0 {
        public final AbstractC7175o00o0o0o.OooO0O0 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean f19608OooO00o;

        public OooOO0(AbstractC7175o00o0o0o.OooO0O0 oooO0O0, boolean z) {
            this.OooO00o = oooO0O0;
            this.f19608OooO00o = z;
        }
    }

    /* renamed from: com.pd.sdk.o00o0o$OooOO0O */
    public static class OooOO0O {
        public static final int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final int[] f19609OooO00o = {16842755, 16842960, 16842961};
        public static final int OooO0O0 = 0;
        public static final int OooO0OO = 2;
    }

    /* renamed from: com.pd.sdk.o00o0o$OooOO0o  reason: case insensitive filesystem */
    public interface AbstractC7172OooOO0o {
        boolean OooO00o(ArrayList<C7163o00o0Oo> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: com.pd.sdk.o00o0o$OooOOO0 */
    public class OooOOO0 implements AbstractC7172OooOO0o {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f19613OooO00o;
        public final int OooO0O0;

        public OooOOO0(String str, int i, int i2) {
            this.f19613OooO00o = str;
            this.OooO00o = i;
            this.OooO0O0 = i2;
        }

        @Override // com.p118pd.sdk.LayoutInflater$Factory2C7167o00o0o.AbstractC7172OooOO0o
        public boolean OooO00o(ArrayList<C7163o00o0Oo> arrayList, ArrayList<Boolean> arrayList2) {
            AbstractC7175o00o0o0o peekChildFragmentManager;
            Fragment fragment = LayoutInflater$Factory2C7167o00o0o.this.f19586OooO0O0;
            if (fragment == null || this.OooO00o >= 0 || this.f19613OooO00o != null || (peekChildFragmentManager = fragment.peekChildFragmentManager()) == null || !peekChildFragmentManager.OooO0Oo()) {
                return LayoutInflater$Factory2C7167o00o0o.this.OooO00o(arrayList, arrayList2, this.f19613OooO00o, this.OooO00o, this.OooO0O0);
            }
            return false;
        }
    }

    public static int OooO00o(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    public static int OooO00o(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    public static boolean OooO00o(C7170OooO0oO oooO0oO) {
        Animation animation = oooO0oO.f19607OooO00o;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return OooO00o(oooO0oO.OooO00o);
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    private void OooOOo() {
        if (m18639OooO0OO()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f19597o0ooOOo != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f19597o0ooOOo);
        }
    }

    private void OooOOo0() {
        SparseArray<Fragment> sparseArray = this.f19577OooO00o;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f19577OooO00o.valueAt(size) == null) {
                    SparseArray<Fragment> sparseArray2 = this.f19577OooO00o;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    private void OooOOoo() {
        this.f19588OooO0O0 = false;
        this.OooO.clear();
        this.f19596OooO0oo.clear();
    }

    private void OooOo0() {
        if (this.OooOO0O != null) {
            while (!this.OooOO0O.isEmpty()) {
                this.OooOO0O.remove(0).OooO0Oo();
            }
        }
    }

    private void OooOo00() {
        SparseArray<Fragment> sparseArray = this.f19577OooO00o;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i = 0; i < size; i++) {
            Fragment valueAt = this.f19577OooO00o.valueAt(i);
            if (valueAt != null) {
                if (valueAt.getAnimatingAway() != null) {
                    int stateAfterAnimating = valueAt.getStateAfterAnimating();
                    View animatingAway = valueAt.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    valueAt.setAnimatingAway(null);
                    OooO00o(valueAt, stateAfterAnimating, 0, 0, false);
                } else if (valueAt.getAnimator() != null) {
                    valueAt.getAnimator().end();
                }
            }
        }
    }

    public void OooO(Fragment fragment) {
        OooO00o(fragment, this.o0ooOOo, 0, 0, false);
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LayoutInflater.Factory2 m18618OooO00o() {
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    public void OooO0O0(AbstractC7175o00o0o0o.OooO0OO oooO0OO) {
        ArrayList<AbstractC7175o00o0o0o.OooO0OO> arrayList = this.OooO0oO;
        if (arrayList != null) {
            arrayList.remove(oooO0OO);
        }
    }

    public void OooO0OO(Fragment fragment) {
        if (OooO0oo) {
            String str = "detach: " + fragment;
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (OooO0oo) {
                    String str2 = "remove from detach: " + fragment;
                }
                synchronized (this.f19587OooO0O0) {
                    this.f19587OooO0O0.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.f19590OooO0OO = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m18640OooO0Oo() {
        OooOOo();
        return OooO00o((String) null, -1, 0);
    }

    public void OooO0o(Fragment fragment) {
        if (fragment.mIndex < 0) {
            int i = this.o0ooOO0;
            this.o0ooOO0 = i + 1;
            fragment.setIndex(i, this.f19578OooO00o);
            if (this.f19577OooO00o == null) {
                this.f19577OooO00o = new SparseArray<>();
            }
            this.f19577OooO00o.put(fragment.mIndex, fragment);
            if (OooO0oo) {
                String str = "Allocated fragment index " + fragment;
            }
        }
    }

    public void OooO0o0(Fragment fragment) {
        if (OooO0oo) {
            String str = "hide: " + fragment;
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    public void OooO0oO(Fragment fragment) {
        if (fragment.mIndex >= 0) {
            if (OooO0oo) {
                String str = "Freeing fragment index " + fragment;
            }
            this.f19577OooO00o.put(fragment.mIndex, null);
            fragment.initState();
        }
    }

    public void OooO0oo(Fragment fragment) {
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (fragment != null) {
            int i = this.o0ooOOo;
            if (fragment.mRemoving) {
                if (fragment.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            OooO00o(fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
            if (fragment.mView != null) {
                Fragment OooO00o2 = OooO00o(fragment);
                if (OooO00o2 != null && (indexOfChild2 = viewGroup.indexOfChild(fragment.mView)) < (indexOfChild = (viewGroup = fragment.mContainer).indexOfChild(OooO00o2.mView))) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.mView, indexOfChild);
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    float f = fragment.mPostponedAlpha;
                    if (f > 0.0f) {
                        fragment.mView.setAlpha(f);
                    }
                    fragment.mPostponedAlpha = 0.0f;
                    fragment.mIsNewlyAdded = false;
                    C7170OooO0oO OooO00o3 = OooO00o(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                    if (OooO00o3 != null) {
                        OooO00o(fragment.mView, OooO00o3);
                        Animation animation = OooO00o3.f19607OooO00o;
                        if (animation != null) {
                            fragment.mView.startAnimation(animation);
                        } else {
                            OooO00o3.OooO00o.setTarget(fragment.mView);
                            OooO00o3.OooO00o.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                OooO0O0(fragment);
            }
        }
    }

    public void OooOO0(Fragment fragment) {
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.f19588OooO0O0) {
            this.f19595OooO0oO = true;
            return;
        }
        fragment.mDeferStart = false;
        OooO00o(fragment, this.o0ooOOo, 0, 0, false);
    }

    public void OooOO0O(Fragment fragment) {
        if (OooO0oo) {
            String str = "remove: " + fragment + " nesting=" + fragment.mBackStackNesting;
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            synchronized (this.f19587OooO0O0) {
                this.f19587OooO0O0.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f19590OooO0OO = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    public void OooOO0o(Fragment fragment) {
        if (fragment.mInnerView != null) {
            SparseArray<Parcelable> sparseArray = this.f19585OooO0O0;
            if (sparseArray == null) {
                this.f19585OooO0O0 = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.f19585OooO0O0);
            if (this.f19585OooO0O0.size() > 0) {
                fragment.mSavedViewState = this.f19585OooO0O0;
                this.f19585OooO0O0 = null;
            }
        }
    }

    public void OooOOO(Fragment fragment) {
        if (OooO0oo) {
            String str = "show: " + fragment;
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void OooOOO0() {
        if (this.OooO0oO != null) {
            for (int i = 0; i < this.OooO0oO.size(); i++) {
                this.OooO0oO.get(i).OooO00o();
            }
        }
    }

    public void OooOOOO() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.OooOO0O != null && !this.OooOO0O.isEmpty();
            if (this.f19583OooO00o != null && this.f19583OooO00o.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f19580OooO00o.m18654OooO00o().removeCallbacks(this.f19582OooO00o);
                this.f19580OooO00o.m18654OooO00o().post(this.f19582OooO00o);
            }
        }
    }

    public void OooOOOo() {
        if (this.f19577OooO00o != null) {
            for (int i = 0; i < this.f19577OooO00o.size(); i++) {
                Fragment valueAt = this.f19577OooO00o.valueAt(i);
                if (valueAt != null) {
                    OooOO0(valueAt);
                }
            }
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOO0O.f19609OooO00o);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.isSupportFragmentClass(this.f19580OooO00o.m18653OooO00o(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment OooO00o2 = resourceId != -1 ? m18621OooO00o(resourceId) : null;
        if (OooO00o2 == null && string != null) {
            OooO00o2 = OooO00o(string);
        }
        if (OooO00o2 == null && i != -1) {
            OooO00o2 = m18621OooO00o(i);
        }
        if (OooO0oo) {
            String str2 = "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + OooO00o2;
        }
        if (OooO00o2 == null) {
            OooO00o2 = this.f19579OooO00o.OooO00o(context, attributeValue, null);
            OooO00o2.mFromLayout = true;
            OooO00o2.mFragmentId = resourceId != 0 ? resourceId : i;
            OooO00o2.mContainerId = i;
            OooO00o2.mTag = string;
            OooO00o2.mInLayout = true;
            OooO00o2.mFragmentManager = this;
            AbstractC7174o00o0o0O o00o0o0o = this.f19580OooO00o;
            OooO00o2.mHost = o00o0o0o;
            OooO00o2.onInflate(o00o0o0o.m18653OooO00o(), attributeSet, OooO00o2.mSavedFragmentState);
            OooO00o(OooO00o2, true);
        } else if (!OooO00o2.mInLayout) {
            OooO00o2.mInLayout = true;
            AbstractC7174o00o0o0O o00o0o0o2 = this.f19580OooO00o;
            OooO00o2.mHost = o00o0o0o2;
            if (!OooO00o2.mRetaining) {
                OooO00o2.onInflate(o00o0o0o2.m18653OooO00o(), attributeSet, OooO00o2.mSavedFragmentState);
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
        }
        if (this.o0ooOOo >= 1 || !OooO00o2.mFromLayout) {
            OooO(OooO00o2);
        } else {
            OooO00o(OooO00o2, 1, 0, 0, false);
        }
        View view2 = OooO00o2.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (OooO00o2.mView.getTag() == null) {
                OooO00o2.mView.setTag(string);
            }
            return OooO00o2.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f19578OooO00o;
        if (fragment != null) {
            C7082o00OO00O.OooO00o(fragment, sb);
        } else {
            C7082o00OO00O.OooO00o(this.f19580OooO00o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: com.pd.sdk.o00o0o$OooOOO */
    public static class OooOOO implements Fragment.AbstractC5047OooO0o0 {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C7163o00o0Oo f19610OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean f19611OooO00o;

        public OooOOO(C7163o00o0Oo o00o0oo, boolean z) {
            this.f19611OooO00o = z;
            this.f19610OooO00o = o00o0oo;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC5047OooO0o0
        public void OooO00o() {
            int i = this.OooO00o - 1;
            this.OooO00o = i;
            if (i == 0) {
                this.f19610OooO00o.OooO00o.OooOOOO();
            }
        }

        @Override // androidx.fragment.app.Fragment.AbstractC5047OooO0o0
        public void OooO0O0() {
            this.OooO00o++;
        }

        public void OooO0OO() {
            C7163o00o0Oo o00o0oo = this.f19610OooO00o;
            o00o0oo.OooO00o.OooO00o(o00o0oo, this.f19611OooO00o, false, false);
        }

        public void OooO0Oo() {
            boolean z = this.OooO00o > 0;
            LayoutInflater$Factory2C7167o00o0o o00o0o = this.f19610OooO00o.OooO00o;
            int size = o00o0o.f19587OooO0O0.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = o00o0o.f19587OooO0O0.get(i);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C7163o00o0Oo o00o0oo = this.f19610OooO00o;
            o00o0oo.OooO00o.OooO00o(o00o0oo, this.f19611OooO00o, !z, true);
        }

        @Override // androidx.fragment.app.Fragment.AbstractC5047OooO0o0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18642OooO00o() {
            return this.OooO00o == 0;
        }
    }

    public void OooO() {
        this.f19592OooO0Oo = false;
        this.f19594OooO0o0 = false;
        OooO0O0(3);
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public List<Fragment> m18636OooO0O0() {
        SparseArray<Fragment> sparseArray = this.f19577OooO00o;
        if (sparseArray == null) {
            return null;
        }
        int size = sparseArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(this.f19577OooO00o.valueAt(i));
        }
        return arrayList;
    }

    public void OooO0Oo(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                fragment.mInnerView = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                OooO00o(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    /* renamed from: com.pd.sdk.o00o0o$OooO0oO  reason: case insensitive filesystem */
    public static class C7170OooO0oO {
        public final Animator OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Animation f19607OooO00o;

        public C7170OooO0oO(Animation animation) {
            this.f19607OooO00o = animation;
            this.OooO00o = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public C7170OooO0oO(Animator animator) {
            this.f19607OooO00o = null;
            this.OooO00o = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    public void OooOOO0(Fragment fragment) {
        if (fragment == null || (this.f19577OooO00o.get(fragment.mIndex) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            this.f19586OooO0O0 = fragment;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m18641OooO0o0() {
        OooO0Oo(true);
        boolean z = false;
        while (m18615OooO00o(this.f19596OooO0oo, this.OooO)) {
            this.f19588OooO0O0 = true;
            try {
                OooO0O0(this.f19596OooO0oo, this.OooO);
                OooOOoo();
                z = true;
            } catch (Throwable th) {
                OooOOoo();
                throw th;
            }
        }
        OooOO0O();
        OooOOo0();
        return z;
    }

    public void OooO0oO() {
        OooO0O0(3);
    }

    public void OooOOO() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C7177o00o0oO0 o00o0oo0;
        if (this.f19577OooO00o != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i = 0; i < this.f19577OooO00o.size(); i++) {
                Fragment valueAt = this.f19577OooO00o.valueAt(i);
                if (valueAt != null) {
                    if (valueAt.mRetainInstance) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(valueAt);
                        Fragment fragment = valueAt.mTarget;
                        valueAt.mTargetIndex = fragment != null ? fragment.mIndex : -1;
                        if (OooO0oo) {
                            String str = "retainNonConfig: keeping retained " + valueAt;
                        }
                    }
                    LayoutInflater$Factory2C7167o00o0o o00o0o = valueAt.mChildFragmentManager;
                    if (o00o0o != null) {
                        o00o0o.OooOOO();
                        o00o0oo0 = valueAt.mChildFragmentManager.f19581OooO00o;
                    } else {
                        o00o0oo0 = valueAt.mChildNonConfig;
                    }
                    if (arrayList2 == null && o00o0oo0 != null) {
                        arrayList2 = new ArrayList(this.f19577OooO00o.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(o00o0oo0);
                    }
                    if (arrayList == null && valueAt.mViewModelStore != null) {
                        arrayList = new ArrayList(this.f19577OooO00o.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(valueAt.mViewModelStore);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.f19581OooO00o = null;
        } else {
            this.f19581OooO00o = new C7177o00o0oO0(arrayList3, arrayList2, arrayList);
        }
    }

    /* renamed from: com.pd.sdk.o00o0o$OooO */
    public static class OooO extends AnimationSet implements Runnable {
        public final View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ViewGroup f19598OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;
        public boolean OooO0Oo = true;

        public OooO(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f19598OooO00o = viewGroup;
            this.OooO00o = view;
            addAnimation(animation);
            this.f19598OooO00o.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.OooO0Oo = true;
            if (this.OooO0O0) {
                return !this.OooO0OO;
            }
            if (!super.getTransformation(j, transformation)) {
                this.OooO0O0 = true;
                ViewTreeObserver$OnPreDrawListenerC7215o00oo000.OooO00o(this.f19598OooO00o, this);
            }
            return true;
        }

        public void run() {
            if (this.OooO0O0 || !this.OooO0Oo) {
                this.f19598OooO00o.endViewTransition(this.OooO00o);
                this.OooO0OO = true;
                return;
            }
            this.OooO0Oo = false;
            this.f19598OooO00o.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.OooO0Oo = true;
            if (this.OooO0O0) {
                return !this.OooO0OO;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.OooO0O0 = true;
                ViewTreeObserver$OnPreDrawListenerC7215o00oo000.OooO00o(this.f19598OooO00o, this);
            }
            return true;
        }
    }

    public void OooO0oO(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO0oO(fragment, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO0o(this, fragment);
            }
        }
    }

    public void OooOO0() {
        this.f19594OooO0o0 = true;
        OooO0O0(2);
    }

    public static boolean OooO00o(Animator animator) {
        PropertyValuesHolder[] values;
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (OooO00o(childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    public int OooO0O0() {
        SparseArray<Fragment> sparseArray = this.f19577OooO00o;
        if (sparseArray == null) {
            return 0;
        }
        return sparseArray.size();
    }

    public void OooO0o() {
        for (int i = 0; i < this.f19587OooO0O0.size(); i++) {
            Fragment fragment = this.f19587OooO0O0.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18638OooO0O0() {
        return this.f19593OooO0o;
    }

    public void OooOO0o() {
        this.f19581OooO00o = null;
        this.f19592OooO0Oo = false;
        this.f19594OooO0o0 = false;
        int size = this.f19587OooO0O0.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f19587OooO0O0.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void OooO0O0(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            C7170OooO0oO OooO00o2 = OooO00o(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (OooO00o2 == null || (animator = OooO00o2.OooO00o) == null) {
                if (OooO00o2 != null) {
                    OooO00o(fragment.mView, OooO00o2);
                    fragment.mView.startAnimation(OooO00o2.f19607OooO00o);
                    OooO00o2.f19607OooO00o.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    OooO00o2.OooO00o.addListener(new C7168OooO0Oo(viewGroup, view, fragment));
                }
                OooO00o(fragment.mView, OooO00o2);
                OooO00o2.OooO00o.start();
            }
        }
        if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
            this.f19590OooO0OO = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    public void OooO0o(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO0o(fragment, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO0o0(this, fragment);
            }
        }
    }

    private void OooO0Oo(boolean z) {
        if (this.f19588OooO0O0) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f19580OooO00o == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f19580OooO00o.m18654OooO00o().getLooper()) {
            if (!z) {
                OooOOo();
            }
            if (this.f19596OooO0oo == null) {
                this.f19596OooO0oo = new ArrayList<>();
                this.OooO = new ArrayList<>();
            }
            this.f19588OooO0O0 = true;
            try {
                OooO00o((ArrayList<C7163o00o0Oo>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f19588OooO0O0 = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public void OooO0o0() {
        OooO0O0(1);
    }

    public void OooOO0O() {
        if (this.f19595OooO0oO) {
            this.f19595OooO0oO = false;
            OooOOOo();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18639OooO0OO() {
        return this.f19592OooO0Oo || this.f19594OooO0o0;
    }

    public void OooO0o0(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO0o0(fragment, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO0Oo(this, fragment);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    public void OooO0OO() {
        this.f19592OooO0Oo = false;
        this.f19594OooO0o0 = false;
        OooO0O0(1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18614OooO00o(View view, C7170OooO0oO oooO0oO) {
        if (view == null || oooO0oO == null || Build.VERSION.SDK_INT < 19 || view.getLayerType() != 0 || !ViewCompat.m14595OooO0o(view) || !OooO00o(oooO0oO)) {
            return false;
        }
        return true;
    }

    public void OooO0OO(boolean z) {
        for (int size = this.f19587OooO0O0.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f19587OooO0O0.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    private void OooO00o(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C7083o00OO00o("FragmentManager"));
        AbstractC7174o00o0o0O o00o0o0o = this.f19580OooO00o;
        if (o00o0o0o != null) {
            try {
                o00o0o0o.OooO00o(GlideException.OooO00o.o0ooOoO, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            OooO00o(GlideException.OooO00o.o0ooOoO, (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    public void OooO0OO(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO0OO(fragment, bundle, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO0OO(this, fragment, bundle);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    public void OooO0Oo() {
        this.f19593OooO0o = true;
        m18641OooO0o0();
        OooO0O0(0);
        this.f19580OooO00o = null;
        this.f19579OooO00o = null;
        this.f19578OooO00o = null;
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7179o00o0oOo m18624OooO00o() {
        return new C7163o00o0Oo(this);
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18631OooO00o() {
        boolean OooO0o02 = m18641OooO0o0();
        OooOo0();
        return OooO0o02;
    }

    public void OooO0OO(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO0OO(fragment, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO0O0(this, fragment);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18626OooO00o() {
        OooO00o((AbstractC7172OooOO0o) new OooOOO0(null, -1, 0), false);
    }

    public void OooO0oo() {
        this.f19592OooO0Oo = false;
        this.f19594OooO0o0 = false;
        OooO0O0(4);
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    public void OooO00o(@Nullable String str, int i) {
        OooO00o((AbstractC7172OooOO0o) new OooOOO0(str, -1, i), false);
    }

    public void OooO0Oo(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO0Oo(fragment, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO0OO(this, fragment);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18635OooO00o(@Nullable String str, int i) {
        OooOOo();
        return OooO00o(str, -1, i);
    }

    public void OooO0oo(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO0oo(fragment, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO0oO(this, fragment);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    public void OooO00o(int i, int i2) {
        if (i >= 0) {
            OooO00o((AbstractC7172OooOO0o) new OooOOO0(null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18633OooO00o(int i, int i2) {
        OooOOo();
        m18641OooO0o0();
        if (i >= 0) {
            return OooO00o((String) null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    public Fragment OooO0O0(String str) {
        Fragment findFragmentByWho;
        SparseArray<Fragment> sparseArray = this.f19577OooO00o;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            Fragment valueAt = this.f19577OooO00o.valueAt(size);
            if (!(valueAt == null || (findFragmentByWho = valueAt.findFragmentByWho(str)) == null)) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public void OooO0Oo(@NonNull Fragment fragment, @NonNull Bundle bundle, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO0Oo(fragment, bundle, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO0Oo(this, fragment, bundle);
            }
        }
    }

    private boolean OooO00o(String str, int i, int i2) {
        AbstractC7175o00o0o0o peekChildFragmentManager;
        m18641OooO0o0();
        OooO0Oo(true);
        Fragment fragment = this.f19586OooO0O0;
        if (fragment != null && i < 0 && str == null && (peekChildFragmentManager = fragment.peekChildFragmentManager()) != null && peekChildFragmentManager.OooO0Oo()) {
            return true;
        }
        boolean OooO00o2 = OooO00o(this.f19596OooO0oo, this.OooO, str, i, i2);
        if (OooO00o2) {
            this.f19588OooO0O0 = true;
            try {
                OooO0O0(this.f19596OooO0oo, this.OooO);
            } finally {
                OooOOoo();
            }
        }
        OooOO0O();
        OooOOo0();
        return OooO00o2;
    }

    public void OooO0O0(AbstractC7172OooOO0o oooOO0o, boolean z) {
        if (!z || (this.f19580OooO00o != null && !this.f19593OooO0o)) {
            OooO0Oo(z);
            if (oooOO0o.OooO00o(this.f19596OooO0oo, this.OooO)) {
                this.f19588OooO0O0 = true;
                try {
                    OooO0O0(this.f19596OooO0oo, this.OooO);
                } finally {
                    OooOOoo();
                }
            }
            OooOO0O();
            OooOOo0();
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private void OooO0O0(ArrayList<C7163o00o0Oo> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            OooO00o(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f19568OooO0Oo) {
                    if (i2 != i) {
                        OooO0O0(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f19568OooO0Oo) {
                            i2++;
                        }
                    }
                    OooO0O0(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                OooO0O0(arrayList, arrayList2, i2, size);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    public int OooO00o() {
        ArrayList<C7163o00o0Oo> arrayList = this.f19589OooO0OO;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7175o00o0o0o.OooO00o m18622OooO00o(int i) {
        return this.f19589OooO0OO.get(i);
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    public void OooO00o(AbstractC7175o00o0o0o.OooO0OO oooO0OO) {
        if (this.OooO0oO == null) {
            this.OooO0oO = new ArrayList<>();
        }
        this.OooO0oO.add(oooO0OO);
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    public void OooO00o(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mIndex < 0) {
            OooO00o(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.mIndex);
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    @Nullable
    public Fragment OooO00o(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        Fragment fragment = this.f19577OooO00o.get(i);
        if (fragment == null) {
            OooO00o(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        return fragment;
    }

    private void OooO0O0(ArrayList<C7163o00o0Oo> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        boolean z = arrayList.get(i5).f19568OooO0Oo;
        ArrayList<Fragment> arrayList3 = this.OooOO0;
        if (arrayList3 == null) {
            this.OooOO0 = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.OooOO0.addAll(this.f19587OooO0O0);
        Fragment OooO00o2 = m18620OooO00o();
        boolean z2 = false;
        for (int i6 = i5; i6 < i2; i6++) {
            C7163o00o0Oo o00o0oo = arrayList.get(i6);
            if (!arrayList2.get(i6).booleanValue()) {
                OooO00o2 = o00o0oo.OooO00o(this.OooOO0, OooO00o2);
            } else {
                OooO00o2 = o00o0oo.OooO0O0(this.OooOO0, OooO00o2);
            }
            z2 = z2 || o00o0oo.f19563OooO00o;
        }
        this.OooOO0.clear();
        if (!z) {
            C7182o00o0oo0.OooO00o(this, arrayList, arrayList2, i, i2, false);
        }
        OooO00o(arrayList, arrayList2, i, i2);
        if (z) {
            C6972o0000oOO<Fragment> o0000ooo = new C6972o0000oOO<>();
            OooO00o(o0000ooo);
            int OooO00o3 = OooO00o(arrayList, arrayList2, i, i2, o0000ooo);
            OooO0O0(o0000ooo);
            i3 = OooO00o3;
        } else {
            i3 = i2;
        }
        if (i3 != i5 && z) {
            C7182o00o0oo0.OooO00o(this, arrayList, arrayList2, i, i3, true);
            m18628OooO00o(this.o0ooOOo, true);
        }
        while (i5 < i2) {
            C7163o00o0Oo o00o0oo2 = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue() && (i4 = o00o0oo2.OooOOO) >= 0) {
                m18627OooO00o(i4);
                o00o0oo2.OooOOO = -1;
            }
            o00o0oo2.m18613OooO0Oo();
            i5++;
        }
        if (z2) {
            OooOOO0();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<Fragment> m18625OooO00o() {
        List<Fragment> list;
        if (this.f19587OooO0O0.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f19587OooO0O0) {
            list = (List) this.f19587OooO0O0.clone();
        }
        return list;
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Fragment.SavedState m18619OooO00o(Fragment fragment) {
        Bundle OooO00o2;
        if (fragment.mIndex < 0) {
            OooO00o(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.mState <= 0 || (OooO00o2 = m18616OooO00o(fragment)) == null) {
            return null;
        }
        return new Fragment.SavedState(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    public void OooO00o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + C9878I1.f23489OooO00o;
        SparseArray<Fragment> sparseArray = this.f19577OooO00o;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(Constants.COLON_SEPARATOR);
            for (int i = 0; i < size5; i++) {
                Fragment valueAt = this.f19577OooO00o.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f19587OooO0O0.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size6; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f19587OooO0O0.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f19591OooO0Oo;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f19591OooO0Oo.get(i3).toString());
            }
        }
        ArrayList<C7163o00o0Oo> arrayList2 = this.f19589OooO0OO;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C7163o00o0Oo o00o0oo = this.f19589OooO0OO.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(o00o0oo.toString());
                o00o0oo.OooO00o(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.OooO0o0 != null && (size2 = this.OooO0o0.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((C7163o00o0Oo) this.OooO0o0.get(i5));
                }
            }
            if (this.OooO0o != null && this.OooO0o.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.OooO0o.toArray()));
            }
        }
        ArrayList<AbstractC7172OooOO0o> arrayList3 = this.f19583OooO00o;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println((AbstractC7172OooOO0o) this.f19583OooO00o.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f19580OooO00o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f19579OooO00o);
        if (this.f19578OooO00o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f19578OooO00o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.o0ooOOo);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f19592OooO0Oo);
        printWriter.print(" mStopped=");
        printWriter.print(this.f19594OooO0o0);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f19593OooO0o);
        if (this.f19590OooO0OO) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f19590OooO0OO);
        }
        if (this.f19597o0ooOOo != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f19597o0ooOOo);
        }
    }

    private void OooO0O0(C6972o0000oOO<Fragment> o0000ooo) {
        int size = o0000ooo.size();
        for (int i = 0; i < size; i++) {
            Fragment OooO0O02 = o0000ooo.m18177OooO0O0(i);
            if (!OooO0O02.mAdded) {
                View view = OooO0O02.getView();
                OooO0O02.mPostponedAlpha = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18637OooO0O0() {
        this.f19592OooO0Oo = false;
        this.f19594OooO0o0 = false;
        OooO0O0(2);
    }

    /* JADX INFO: finally extract failed */
    private void OooO0O0(int i) {
        try {
            this.f19588OooO0O0 = true;
            m18628OooO00o(i, false);
            this.f19588OooO0O0 = false;
            m18641OooO0o0();
        } catch (Throwable th) {
            this.f19588OooO0O0 = false;
            throw th;
        }
    }

    public void OooO0O0(boolean z) {
        for (int size = this.f19587OooO0O0.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f19587OooO0O0.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public boolean OooO0O0(MenuItem menuItem) {
        if (this.o0ooOOo < 1) {
            return false;
        }
        for (int i = 0; i < this.f19587OooO0O0.size(); i++) {
            Fragment fragment = this.f19587OooO0O0.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void OooO0O0(@NonNull Fragment fragment, @NonNull Context context, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO0O0(fragment, context, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO0O0(this, fragment, context);
            }
        }
    }

    public void OooO0O0(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO0O0(fragment, bundle, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO0O0(this, fragment, bundle);
            }
        }
    }

    public void OooO0O0(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO0O0(fragment, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO00o(this, fragment);
            }
        }
    }

    public static C7170OooO0oO OooO00o(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(OooO00o);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(OooO0O0);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C7170OooO0oO(animationSet);
    }

    public static C7170OooO0oO OooO00o(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(OooO0O0);
        alphaAnimation.setDuration(220);
        return new C7170OooO0oO(alphaAnimation);
    }

    public C7170OooO0oO OooO00o(Fragment fragment, int i, boolean z, int i2) {
        int OooO00o2;
        int nextAnim = fragment.getNextAnim();
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, nextAnim);
        if (onCreateAnimation != null) {
            return new C7170OooO0oO(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i, z, nextAnim);
        if (onCreateAnimator != null) {
            return new C7170OooO0oO(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(this.f19580OooO00o.m18653OooO00o().getResources().getResourceTypeName(nextAnim));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f19580OooO00o.m18653OooO00o(), nextAnim);
                    if (loadAnimation != null) {
                        return new C7170OooO0oO(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f19580OooO00o.m18653OooO00o(), nextAnim);
                    if (loadAnimator != null) {
                        return new C7170OooO0oO(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f19580OooO00o.m18653OooO00o(), nextAnim);
                        if (loadAnimation2 != null) {
                            return new C7170OooO0oO(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0 || (OooO00o2 = OooO00o(i, z)) < 0) {
            return null;
        }
        switch (OooO00o2) {
            case 1:
                return OooO00o(this.f19580OooO00o.m18653OooO00o(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return OooO00o(this.f19580OooO00o.m18653OooO00o(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return OooO00o(this.f19580OooO00o.m18653OooO00o(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return OooO00o(this.f19580OooO00o.m18653OooO00o(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return OooO00o(this.f19580OooO00o.m18653OooO00o(), 0.0f, 1.0f);
            case 6:
                return OooO00o(this.f19580OooO00o.m18653OooO00o(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f19580OooO00o.OooO0O0()) {
                    i2 = this.f19580OooO00o.OooO00o();
                }
                if (i2 == 0) {
                }
                return null;
        }
    }

    public static void OooO00o(View view, C7170OooO0oO oooO0oO) {
        if (view != null && oooO0oO != null && m18614OooO00o(view, oooO0oO)) {
            Animator animator = oooO0oO.OooO00o;
            if (animator != null) {
                animator.addListener(new C7171OooO0oo(view));
                return;
            }
            Animation.AnimationListener OooO00o2 = OooO00o(oooO0oO.f19607OooO00o);
            view.setLayerType(2, null);
            oooO0oO.f19607OooO00o.setAnimationListener(new C7169OooO0o0(view, OooO00o2));
        }
    }

    public static Animation.AnimationListener OooO00o(Animation animation) {
        try {
            if (f19570OooO00o == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                f19570OooO00o = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) f19570OooO00o.get(animation);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18632OooO00o(int i) {
        return this.o0ooOOo >= i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006e, code lost:
        if (r0 != 3) goto L_0x03f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(androidx.fragment.app.Fragment r16, int r17, int r18, int r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 1058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.LayoutInflater$Factory2C7167o00o0o.OooO00o(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    private void OooO00o(@NonNull Fragment fragment, @NonNull C7170OooO0oO oooO0oO, int i) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i);
        if (oooO0oO.f19607OooO00o != null) {
            OooO oooO = new OooO(oooO0oO.f19607OooO00o, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            oooO.setAnimationListener(new OooO0O0(OooO00o(oooO), viewGroup, fragment));
            OooO00o(view, oooO0oO);
            fragment.mView.startAnimation(oooO);
            return;
        }
        Animator animator = oooO0oO.OooO00o;
        fragment.setAnimator(animator);
        animator.addListener(new OooO0OO(viewGroup, view, fragment));
        animator.setTarget(fragment.mView);
        OooO00o(fragment.mView, oooO0oO);
        animator.start();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18628OooO00o(int i, boolean z) {
        AbstractC7174o00o0o0O o00o0o0o;
        if (this.f19580OooO00o == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.o0ooOOo) {
            this.o0ooOOo = i;
            if (this.f19577OooO00o != null) {
                int size = this.f19587OooO0O0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    OooO0oo(this.f19587OooO0O0.get(i2));
                }
                int size2 = this.f19577OooO00o.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Fragment valueAt = this.f19577OooO00o.valueAt(i3);
                    if (valueAt != null && ((valueAt.mRemoving || valueAt.mDetached) && !valueAt.mIsNewlyAdded)) {
                        OooO0oo(valueAt);
                    }
                }
                OooOOOo();
                if (this.f19590OooO0OO && (o00o0o0o = this.f19580OooO00o) != null && this.o0ooOOo == 4) {
                    o00o0o0o.m18658OooO00o();
                    this.f19590OooO0OO = false;
                }
            }
        }
    }

    public void OooO00o(Fragment fragment, boolean z) {
        if (OooO0oo) {
            String str = "add: " + fragment;
        }
        OooO0o(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.f19587OooO0O0.contains(fragment)) {
            synchronized (this.f19587OooO0O0) {
                this.f19587OooO0O0.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f19590OooO0OO = true;
            }
            if (z) {
                OooO(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18629OooO00o(Fragment fragment) {
        if (OooO0oo) {
            String str = "attach: " + fragment;
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.f19587OooO0O0.contains(fragment)) {
                if (OooO0oo) {
                    String str2 = "add from attach: " + fragment;
                }
                synchronized (this.f19587OooO0O0) {
                    this.f19587OooO0O0.add(fragment);
                }
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.f19590OooO0OO = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Fragment m18621OooO00o(int i) {
        for (int size = this.f19587OooO0O0.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f19587OooO0O0.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        SparseArray<Fragment> sparseArray = this.f19577OooO00o;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.f19577OooO00o.valueAt(size2);
            if (valueAt != null && valueAt.mFragmentId == i) {
                return valueAt;
            }
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    @Nullable
    public Fragment OooO00o(@Nullable String str) {
        if (str != null) {
            for (int size = this.f19587OooO0O0.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f19587OooO0O0.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        SparseArray<Fragment> sparseArray = this.f19577OooO00o;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.f19577OooO00o.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.mTag)) {
                return valueAt;
            }
        }
        return null;
    }

    public void OooO00o(AbstractC7172OooOO0o oooOO0o, boolean z) {
        if (!z) {
            OooOOo();
        }
        synchronized (this) {
            if (!this.f19593OooO0o) {
                if (this.f19580OooO00o != null) {
                    if (this.f19583OooO00o == null) {
                        this.f19583OooO00o = new ArrayList<>();
                    }
                    this.f19583OooO00o.add(oooOO0o);
                    OooOOOO();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public int OooO00o(C7163o00o0Oo o00o0oo) {
        synchronized (this) {
            if (this.OooO0o != null) {
                if (this.OooO0o.size() > 0) {
                    int intValue = this.OooO0o.remove(this.OooO0o.size() - 1).intValue();
                    if (OooO0oo) {
                        String str = "Adding back stack index " + intValue + " with " + o00o0oo;
                    }
                    this.OooO0o0.set(intValue, o00o0oo);
                    return intValue;
                }
            }
            if (this.OooO0o0 == null) {
                this.OooO0o0 = new ArrayList<>();
            }
            int size = this.OooO0o0.size();
            if (OooO0oo) {
                String str2 = "Setting back stack index " + size + " to " + o00o0oo;
            }
            this.OooO0o0.add(o00o0oo);
            return size;
        }
    }

    public void OooO00o(int i, C7163o00o0Oo o00o0oo) {
        synchronized (this) {
            if (this.OooO0o0 == null) {
                this.OooO0o0 = new ArrayList<>();
            }
            int size = this.OooO0o0.size();
            if (i < size) {
                if (OooO0oo) {
                    String str = "Setting back stack index " + i + " to " + o00o0oo;
                }
                this.OooO0o0.set(i, o00o0oo);
            } else {
                while (size < i) {
                    this.OooO0o0.add(null);
                    if (this.OooO0o == null) {
                        this.OooO0o = new ArrayList<>();
                    }
                    if (OooO0oo) {
                        String str2 = "Adding available back stack index " + size;
                    }
                    this.OooO0o.add(Integer.valueOf(size));
                    size++;
                }
                if (OooO0oo) {
                    String str3 = "Adding back stack index " + i + " with " + o00o0oo;
                }
                this.OooO0o0.add(o00o0oo);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18627OooO00o(int i) {
        synchronized (this) {
            this.OooO0o0.set(i, null);
            if (this.OooO0o == null) {
                this.OooO0o = new ArrayList<>();
            }
            if (OooO0oo) {
                String str = "Freeing back stack index " + i;
            }
            this.OooO0o.add(Integer.valueOf(i));
        }
    }

    private void OooO00o(ArrayList<C7163o00o0Oo> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<OooOOO> arrayList3 = this.OooOO0O;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            OooOOO oooOOO = this.OooOO0O.get(i);
            if (arrayList != null && !oooOOO.f19611OooO00o && (indexOf2 = arrayList.indexOf(oooOOO.f19610OooO00o)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                oooOOO.OooO0OO();
            } else if (oooOOO.m18642OooO00o() || (arrayList != null && oooOOO.f19610OooO00o.OooO00o(arrayList, 0, arrayList.size()))) {
                this.OooOO0O.remove(i);
                i--;
                size--;
                if (arrayList == null || oooOOO.f19611OooO00o || (indexOf = arrayList.indexOf(oooOOO.f19610OooO00o)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                    oooOOO.OooO0Oo();
                } else {
                    oooOOO.OooO0OO();
                }
            }
            i++;
        }
    }

    private int OooO00o(ArrayList<C7163o00o0Oo> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C6972o0000oOO<Fragment> o0000ooo) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C7163o00o0Oo o00o0oo = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (o00o0oo.m18612OooO0OO() && !o00o0oo.OooO00o(arrayList, i4 + 1, i2)) {
                if (this.OooOO0O == null) {
                    this.OooOO0O = new ArrayList<>();
                }
                OooOOO oooOOO = new OooOOO(o00o0oo, booleanValue);
                this.OooOO0O.add(oooOOO);
                o00o0oo.OooO00o(oooOOO);
                if (booleanValue) {
                    o00o0oo.m18611OooO0OO();
                } else {
                    o00o0oo.m18605OooO00o(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, o00o0oo);
                }
                OooO00o(o0000ooo);
            }
        }
        return i3;
    }

    public void OooO00o(C7163o00o0Oo o00o0oo, boolean z, boolean z2, boolean z3) {
        if (z) {
            o00o0oo.m18605OooO00o(z3);
        } else {
            o00o0oo.m18611OooO0OO();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(o00o0oo);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C7182o00o0oo0.OooO00o(this, (ArrayList<C7163o00o0Oo>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            m18628OooO00o(this.o0ooOOo, true);
        }
        SparseArray<Fragment> sparseArray = this.f19577OooO00o;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                Fragment valueAt = this.f19577OooO00o.valueAt(i);
                if (valueAt != null && valueAt.mView != null && valueAt.mIsNewlyAdded && o00o0oo.m18607OooO00o(valueAt.mContainerId)) {
                    float f = valueAt.mPostponedAlpha;
                    if (f > 0.0f) {
                        valueAt.mView.setAlpha(f);
                    }
                    if (z3) {
                        valueAt.mPostponedAlpha = 0.0f;
                    } else {
                        valueAt.mPostponedAlpha = -1.0f;
                        valueAt.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    private Fragment OooO00o(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f19587OooO0O0.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f19587OooO0O0.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public static void OooO00o(ArrayList<C7163o00o0Oo> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C7163o00o0Oo o00o0oo = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                o00o0oo.m18603OooO00o(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                o00o0oo.m18605OooO00o(z);
            } else {
                o00o0oo.m18603OooO00o(1);
                o00o0oo.m18611OooO0OO();
            }
            i++;
        }
    }

    private void OooO00o(C6972o0000oOO<Fragment> o0000ooo) {
        int i = this.o0ooOOo;
        if (i >= 1) {
            int min = Math.min(i, 3);
            int size = this.f19587OooO0O0.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f19587OooO0O0.get(i2);
                if (fragment.mState < min) {
                    OooO00o(fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        o0000ooo.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m18615OooO00o(ArrayList<C7163o00o0Oo> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.f19583OooO00o != null) {
                if (this.f19583OooO00o.size() != 0) {
                    int size = this.f19583OooO00o.size();
                    boolean z = false;
                    for (int i = 0; i < size; i++) {
                        z |= this.f19583OooO00o.get(i).OooO00o(arrayList, arrayList2);
                    }
                    this.f19583OooO00o.clear();
                    this.f19580OooO00o.m18654OooO00o().removeCallbacks(this.f19582OooO00o);
                    return z;
                }
            }
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18630OooO00o(C7163o00o0Oo o00o0oo) {
        if (this.f19589OooO0OO == null) {
            this.f19589OooO0OO = new ArrayList<>();
        }
        this.f19589OooO0OO.add(o00o0oo);
    }

    public boolean OooO00o(ArrayList<C7163o00o0Oo> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C7163o00o0Oo> arrayList3 = this.f19589OooO0OO;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f19589OooO0OO.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i >= 0) {
                int size2 = this.f19589OooO0OO.size() - 1;
                while (size2 >= 0) {
                    C7163o00o0Oo o00o0oo = this.f19589OooO0OO.get(size2);
                    if ((str != null && str.equals(o00o0oo.getName())) || (i >= 0 && i == o00o0oo.OooOOO)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C7163o00o0Oo o00o0oo2 = this.f19589OooO0OO.get(size2);
                        if ((str == null || !str.equals(o00o0oo2.getName())) && (i < 0 || i != o00o0oo2.OooOOO)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f19589OooO0OO.size() - 1) {
                return false;
            }
            for (int size3 = this.f19589OooO0OO.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f19589OooO0OO.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7177o00o0oO0 m18623OooO00o() {
        OooO00o(this.f19581OooO00o);
        return this.f19581OooO00o;
    }

    public static void OooO00o(C7177o00o0oO0 o00o0oo0) {
        if (o00o0oo0 != null) {
            List<Fragment> OooO0O02 = o00o0oo0.OooO0O0();
            if (OooO0O02 != null) {
                for (Fragment fragment : OooO0O02) {
                    fragment.mRetaining = true;
                }
            }
            List<C7177o00o0oO0> OooO00o2 = o00o0oo0.OooO00o();
            if (OooO00o2 != null) {
                for (C7177o00o0oO0 o00o0oo02 : OooO00o2) {
                    OooO00o(o00o0oo02);
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bundle m18616OooO00o(Fragment fragment) {
        if (this.f19576OooO00o == null) {
            this.f19576OooO00o = new Bundle();
        }
        fragment.performSaveInstanceState(this.f19576OooO00o);
        OooO0Oo(fragment, this.f19576OooO00o, false);
        Bundle bundle = null;
        if (!this.f19576OooO00o.isEmpty()) {
            Bundle bundle2 = this.f19576OooO00o;
            this.f19576OooO00o = null;
            bundle = bundle2;
        }
        if (fragment.mView != null) {
            OooOO0o(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(f19571o0OO00O, fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f19575oo0o0Oo, fragment.mUserVisibleHint);
        }
        return bundle;
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Parcelable m18617OooO00o() {
        int[] iArr;
        int size;
        OooOo0();
        OooOo00();
        m18641OooO0o0();
        this.f19592OooO0Oo = true;
        BackStackState[] backStackStateArr = null;
        this.f19581OooO00o = null;
        SparseArray<Fragment> sparseArray = this.f19577OooO00o;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f19577OooO00o.size();
        FragmentState[] fragmentStateArr = new FragmentState[size2];
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Fragment valueAt = this.f19577OooO00o.valueAt(i);
            if (valueAt != null) {
                if (valueAt.mIndex < 0) {
                    OooO00o(new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.mIndex));
                }
                FragmentState fragmentState = new FragmentState(valueAt);
                fragmentStateArr[i] = fragmentState;
                if (valueAt.mState <= 0 || fragmentState.OooO0O0 != null) {
                    fragmentState.OooO0O0 = valueAt.mSavedFragmentState;
                } else {
                    fragmentState.OooO0O0 = m18616OooO00o(valueAt);
                    Fragment fragment = valueAt.mTarget;
                    if (fragment != null) {
                        if (fragment.mIndex < 0) {
                            OooO00o(new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.mTarget));
                        }
                        if (fragmentState.OooO0O0 == null) {
                            fragmentState.OooO0O0 = new Bundle();
                        }
                        OooO00o(fragmentState.OooO0O0, f19573o0Oo0oo, valueAt.mTarget);
                        int i2 = valueAt.mTargetRequestCode;
                        if (i2 != 0) {
                            fragmentState.OooO0O0.putInt(f19572o0OOO0o, i2);
                        }
                    }
                }
                if (OooO0oo) {
                    String str = "Saved state of " + valueAt + ": " + fragmentState.OooO0O0;
                }
                z = true;
            }
        }
        if (!z) {
            boolean z2 = OooO0oo;
            return null;
        }
        int size3 = this.f19587OooO0O0.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i3 = 0; i3 < size3; i3++) {
                iArr[i3] = this.f19587OooO0O0.get(i3).mIndex;
                if (iArr[i3] < 0) {
                    OooO00o(new IllegalStateException("Failure saving state: active " + this.f19587OooO0O0.get(i3) + " has cleared index: " + iArr[i3]));
                }
                if (OooO0oo) {
                    String str2 = "saveAllState: adding fragment #" + i3 + ": " + this.f19587OooO0O0.get(i3);
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<C7163o00o0Oo> arrayList = this.f19589OooO0OO;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i4 = 0; i4 < size; i4++) {
                backStackStateArr[i4] = new BackStackState(this.f19589OooO0OO.get(i4));
                if (OooO0oo) {
                    String str3 = "saveAllState: adding back stack #" + i4 + ": " + this.f19589OooO0OO.get(i4);
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f14375OooO00o = fragmentStateArr;
        fragmentManagerState.OooO00o = iArr;
        fragmentManagerState.f14374OooO00o = backStackStateArr;
        Fragment fragment2 = this.f19586OooO0O0;
        if (fragment2 != null) {
            fragmentManagerState.o00oO0O = fragment2.mIndex;
        }
        fragmentManagerState.o0ooOO0 = this.o0ooOO0;
        OooOOO();
        return fragmentManagerState;
    }

    public void OooO00o(Parcelable parcelable, C7177o00o0oO0 o00o0oo0) {
        List<C7219o00oo0OO> list;
        List<C7177o00o0oO0> list2;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f14375OooO00o != null) {
                if (o00o0oo0 != null) {
                    List<Fragment> OooO0O02 = o00o0oo0.OooO0O0();
                    list2 = o00o0oo0.OooO00o();
                    list = o00o0oo0.OooO0OO();
                    int size = OooO0O02 != null ? OooO0O02.size() : 0;
                    for (int i = 0; i < size; i++) {
                        Fragment fragment = OooO0O02.get(i);
                        if (OooO0oo) {
                            String str = "restoreAllState: re-attaching retained " + fragment;
                        }
                        int i2 = 0;
                        while (true) {
                            FragmentState[] fragmentStateArr = fragmentManagerState.f14375OooO00o;
                            if (i2 < fragmentStateArr.length && fragmentStateArr[i2].o00oO0O != fragment.mIndex) {
                                i2++;
                            }
                        }
                        if (i2 == fragmentManagerState.f14375OooO00o.length) {
                            OooO00o(new IllegalStateException("Could not find active fragment with index " + fragment.mIndex));
                        }
                        FragmentState fragmentState = fragmentManagerState.f14375OooO00o[i2];
                        fragmentState.f14376OooO00o = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        fragment.mTarget = null;
                        Bundle bundle = fragmentState.OooO0O0;
                        if (bundle != null) {
                            bundle.setClassLoader(this.f19580OooO00o.m18653OooO00o().getClassLoader());
                            fragment.mSavedViewState = fragmentState.OooO0O0.getSparseParcelableArray(f19571o0OO00O);
                            fragment.mSavedFragmentState = fragmentState.OooO0O0;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.f19577OooO00o = new SparseArray<>(fragmentManagerState.f14375OooO00o.length);
                int i3 = 0;
                while (true) {
                    FragmentState[] fragmentStateArr2 = fragmentManagerState.f14375OooO00o;
                    if (i3 >= fragmentStateArr2.length) {
                        break;
                    }
                    FragmentState fragmentState2 = fragmentStateArr2[i3];
                    if (fragmentState2 != null) {
                        Fragment OooO00o2 = fragmentState2.OooO00o(this.f19580OooO00o, this.f19579OooO00o, this.f19578OooO00o, (list2 == null || i3 >= list2.size()) ? null : list2.get(i3), (list == null || i3 >= list.size()) ? null : list.get(i3));
                        if (OooO0oo) {
                            String str2 = "restoreAllState: active #" + i3 + ": " + OooO00o2;
                        }
                        this.f19577OooO00o.put(OooO00o2.mIndex, OooO00o2);
                        fragmentState2.f14376OooO00o = null;
                    }
                    i3++;
                }
                if (o00o0oo0 != null) {
                    List<Fragment> OooO0O03 = o00o0oo0.OooO0O0();
                    int size2 = OooO0O03 != null ? OooO0O03.size() : 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        Fragment fragment2 = OooO0O03.get(i4);
                        int i5 = fragment2.mTargetIndex;
                        if (i5 >= 0) {
                            Fragment fragment3 = this.f19577OooO00o.get(i5);
                            fragment2.mTarget = fragment3;
                            if (fragment3 == null) {
                                String str3 = "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.mTargetIndex;
                            }
                        }
                    }
                }
                this.f19587OooO0O0.clear();
                if (fragmentManagerState.OooO00o != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr = fragmentManagerState.OooO00o;
                        if (i6 >= iArr.length) {
                            break;
                        }
                        Fragment fragment4 = this.f19577OooO00o.get(iArr[i6]);
                        if (fragment4 == null) {
                            OooO00o(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.OooO00o[i6]));
                        }
                        fragment4.mAdded = true;
                        if (OooO0oo) {
                            String str4 = "restoreAllState: added #" + i6 + ": " + fragment4;
                        }
                        if (!this.f19587OooO0O0.contains(fragment4)) {
                            synchronized (this.f19587OooO0O0) {
                                this.f19587OooO0O0.add(fragment4);
                            }
                            i6++;
                        } else {
                            throw new IllegalStateException("Already added!");
                        }
                    }
                }
                if (fragmentManagerState.f14374OooO00o != null) {
                    this.f19589OooO0OO = new ArrayList<>(fragmentManagerState.f14374OooO00o.length);
                    int i7 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr = fragmentManagerState.f14374OooO00o;
                        if (i7 >= backStackStateArr.length) {
                            break;
                        }
                        C7163o00o0Oo OooO00o3 = backStackStateArr[i7].OooO00o(this);
                        if (OooO0oo) {
                            String str5 = "restoreAllState: back stack #" + i7 + " (index " + OooO00o3.OooOOO + "): " + OooO00o3;
                            PrintWriter printWriter = new PrintWriter(new C7083o00OO00o("FragmentManager"));
                            OooO00o3.OooO00o(GlideException.OooO00o.o0ooOoO, printWriter, false);
                            printWriter.close();
                        }
                        this.f19589OooO0OO.add(OooO00o3);
                        int i8 = OooO00o3.OooOOO;
                        if (i8 >= 0) {
                            OooO00o(i8, OooO00o3);
                        }
                        i7++;
                    }
                } else {
                    this.f19589OooO0OO = null;
                }
                int i9 = fragmentManagerState.o00oO0O;
                if (i9 >= 0) {
                    this.f19586OooO0O0 = this.f19577OooO00o.get(i9);
                }
                this.o0ooOO0 = fragmentManagerState.o0ooOO0;
            }
        }
    }

    public void OooO00o(AbstractC7174o00o0o0O o00o0o0o, AbstractC7166o00o0Ooo o00o0ooo, Fragment fragment) {
        if (this.f19580OooO00o == null) {
            this.f19580OooO00o = o00o0o0o;
            this.f19579OooO00o = o00o0ooo;
            this.f19578OooO00o = fragment;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public void OooO00o(Configuration configuration) {
        for (int i = 0; i < this.f19587OooO0O0.size(); i++) {
            Fragment fragment = this.f19587OooO0O0.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public boolean OooO00o(Menu menu, MenuInflater menuInflater) {
        if (this.o0ooOOo < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f19587OooO0O0.size(); i++) {
            Fragment fragment = this.f19587OooO0O0.get(i);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f19591OooO0Oo != null) {
            for (int i2 = 0; i2 < this.f19591OooO0Oo.size(); i2++) {
                Fragment fragment2 = this.f19591OooO0Oo.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f19591OooO0Oo = arrayList;
        return z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18634OooO00o(Menu menu) {
        if (this.o0ooOOo < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f19587OooO0O0.size(); i++) {
            Fragment fragment = this.f19587OooO0O0.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean OooO00o(MenuItem menuItem) {
        if (this.o0ooOOo < 1) {
            return false;
        }
        for (int i = 0; i < this.f19587OooO0O0.size(); i++) {
            Fragment fragment = this.f19587OooO0O0.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void OooO00o(Menu menu) {
        if (this.o0ooOOo >= 1) {
            for (int i = 0; i < this.f19587OooO0O0.size(); i++) {
                Fragment fragment = this.f19587OooO0O0.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o, com.p118pd.sdk.AbstractC7175o00o0o0o
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Fragment m18620OooO00o() {
        return this.f19586OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    public void OooO00o(AbstractC7175o00o0o0o.OooO0O0 oooO0O0, boolean z) {
        this.f19584OooO00o.add(new OooOO0(oooO0O0, z));
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o
    public void OooO00o(AbstractC7175o00o0o0o.OooO0O0 oooO0O0) {
        synchronized (this.f19584OooO00o) {
            int i = 0;
            int size = this.f19584OooO00o.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f19584OooO00o.get(i).OooO00o == oooO0O0) {
                    this.f19584OooO00o.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    public void OooO00o(@NonNull Fragment fragment, @NonNull Context context, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO00o(fragment, context, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO00o(this, fragment, context);
            }
        }
    }

    public void OooO00o(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO00o(fragment, bundle, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO00o(this, fragment, bundle);
            }
        }
    }

    public void OooO00o(@NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.f19578OooO00o;
        if (fragment2 != null) {
            AbstractC7175o00o0o0o fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof LayoutInflater$Factory2C7167o00o0o) {
                ((LayoutInflater$Factory2C7167o00o0o) fragmentManager).OooO00o(fragment, view, bundle, true);
            }
        }
        Iterator<OooOO0> it = this.f19584OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0 next = it.next();
            if (!z || next.f19608OooO00o) {
                next.OooO00o.OooO00o(this, fragment, view, bundle);
            }
        }
    }
}
