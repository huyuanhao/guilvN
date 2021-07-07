package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.bumptech.glide.load.engine.GlideException;
import com.p118pd.sdk.AbstractC7004o000Oo0o;
import com.p118pd.sdk.AbstractC7166o00o0Ooo;
import com.p118pd.sdk.AbstractC7174o00o0o0O;
import com.p118pd.sdk.AbstractC7175o00o0o0o;
import com.p118pd.sdk.AbstractC7202o00oOo00;
import com.p118pd.sdk.AbstractC7218o00oo0O0;
import com.p118pd.sdk.AbstractC7221o00oo0o;
import com.p118pd.sdk.C6987o000O0o;
import com.p118pd.sdk.C7082o00OO00O;
import com.p118pd.sdk.C7091o00OOO;
import com.p118pd.sdk.C7177o00o0oO0;
import com.p118pd.sdk.C7207o00oOoOO;
import com.p118pd.sdk.C7211o00oOooO;
import com.p118pd.sdk.C7219o00oo0OO;
import com.p118pd.sdk.LayoutInflater$Factory2C7167o00o0o;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, AbstractC7202o00oOo00, AbstractC7218o00oo0O0 {
    public static final int ACTIVITY_CREATED = 2;
    public static final int CREATED = 1;
    public static final int INITIALIZING = 0;
    public static final int RESUMED = 4;
    public static final int STARTED = 3;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final C6987o000O0o<String, Class<?>> sClassMap = new C6987o000O0o<>();
    public boolean mAdded;
    public C5046OooO0Oo mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mCalled;
    public LayoutInflater$Factory2C7167o00o0o mChildFragmentManager;
    public C7177o00o0oO0 mChildNonConfig;
    public ViewGroup mContainer;
    public int mContainerId;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public LayoutInflater$Factory2C7167o00o0o mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public AbstractC7174o00o0o0O mHost;
    public boolean mInLayout;
    public int mIndex = -1;
    public View mInnerView;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    public LayoutInflater mLayoutInflater;
    public C7211o00oOooO mLifecycleRegistry = new C7211o00oOooO(this);
    public boolean mMenuVisible = true;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetaining;
    public Bundle mSavedFragmentState;
    @Nullable
    public Boolean mSavedUserVisibleHint;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState = 0;
    public String mTag;
    public Fragment mTarget;
    public int mTargetIndex = -1;
    public int mTargetRequestCode;
    public boolean mUserVisibleHint = true;
    public View mView;
    public AbstractC7202o00oOo00 mViewLifecycleOwner;
    public C7207o00oOoOO<AbstractC7202o00oOo00> mViewLifecycleOwnerLiveData = new C7207o00oOoOO<>();
    public C7211o00oOooO mViewLifecycleRegistry;
    public C7219o00oo0OO mViewModelStore;
    public String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            Fragment.this.callStartTransitionListener();
        }
    }

    public class OooO0OO implements AbstractC7202o00oOo00 {
        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.AbstractC7202o00oOo00
        public Lifecycle getLifecycle() {
            Fragment fragment = Fragment.this;
            if (fragment.mViewLifecycleRegistry == null) {
                fragment.mViewLifecycleRegistry = new C7211o00oOooO(fragment.mViewLifecycleOwner);
            }
            return Fragment.this.mViewLifecycleRegistry;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$OooO0Oo  reason: case insensitive filesystem */
    public static class C5046OooO0Oo {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Animator f14359OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public View f14360OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC5047OooO0o0 f14361OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC7004o000Oo0o f14362OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Boolean f14363OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object f14364OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14365OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public AbstractC7004o000Oo0o f14366OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public Boolean f14367OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public Object f14368OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f14369OooO0O0;
        public int OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public Object f14370OooO0OO;
        public int OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public Object f14371OooO0Oo;
        public Object OooO0o;
        public Object OooO0o0;

        public C5046OooO0Oo() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f14368OooO0O0 = obj;
            this.f14370OooO0OO = null;
            this.f14371OooO0Oo = obj;
            this.OooO0o0 = null;
            this.OooO0o = obj;
            this.f14362OooO00o = null;
            this.f14366OooO0O0 = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC5047OooO0o0 {
        void OooO00o();

        void OooO0O0();
    }

    private C5046OooO0Oo ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C5046OooO0Oo();
        }
        return this.mAnimationInfo;
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public static boolean isSupportFragmentClass(Context context, String str) {
        try {
            Class<?> cls = sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void callStartTransitionListener() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        AbstractC5047OooO0o0 oooO0o0 = null;
        if (oooO0Oo != null) {
            oooO0Oo.f14365OooO00o = false;
            AbstractC5047OooO0o0 oooO0o02 = oooO0Oo.f14361OooO00o;
            oooO0Oo.f14361OooO00o = null;
            oooO0o0 = oooO0o02;
        }
        if (oooO0o0 != null) {
            oooO0o0.OooO00o();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mIndex=");
        printWriter.print(this.mIndex);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mRetaining=");
        printWriter.print(this.mRetaining);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mTarget != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.mTarget);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            AbstractC7221o00oo0o.OooO00o(this).OooO00o(str, fileDescriptor, printWriter, strArr);
        }
        if (this.mChildFragmentManager != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.mChildFragmentManager + Constants.COLON_SEPARATOR);
            LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
            o00o0o.OooO00o(str + GlideException.OooO00o.o0ooOoO, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            return o00o0o.OooO0O0(str);
        }
        return null;
    }

    @Nullable
    public final FragmentActivity getActivity() {
        AbstractC7174o00o0o0O o00o0o0o = this.mHost;
        if (o00o0o0o == null) {
            return null;
        }
        return (FragmentActivity) o00o0o0o.m18652OooO00o();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null || (bool = oooO0Oo.f14367OooO0O0) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null || (bool = oooO0Oo.f14363OooO00o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return null;
        }
        return oooO0Oo.f14360OooO00o;
    }

    public Animator getAnimator() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return null;
        }
        return oooO0Oo.f14359OooO00o;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final AbstractC7175o00o0o0o getChildFragmentManager() {
        if (this.mChildFragmentManager == null) {
            instantiateChildFragmentManager();
            int i = this.mState;
            if (i >= 4) {
                this.mChildFragmentManager.OooO0oo();
            } else if (i >= 3) {
                this.mChildFragmentManager.OooO();
            } else if (i >= 2) {
                this.mChildFragmentManager.m18637OooO0O0();
            } else if (i >= 1) {
                this.mChildFragmentManager.OooO0OO();
            }
        }
        return this.mChildFragmentManager;
    }

    @Nullable
    public Context getContext() {
        AbstractC7174o00o0o0O o00o0o0o = this.mHost;
        if (o00o0o0o == null) {
            return null;
        }
        return o00o0o0o.m18653OooO00o();
    }

    @Nullable
    public Object getEnterTransition() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return null;
        }
        return oooO0Oo.f14364OooO00o;
    }

    public AbstractC7004o000Oo0o getEnterTransitionCallback() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return null;
        }
        return oooO0Oo.f14362OooO00o;
    }

    @Nullable
    public Object getExitTransition() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return null;
        }
        return oooO0Oo.f14370OooO0OO;
    }

    public AbstractC7004o000Oo0o getExitTransitionCallback() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return null;
        }
        return oooO0Oo.f14366OooO0O0;
    }

    @Nullable
    public final AbstractC7175o00o0o0o getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        AbstractC7174o00o0o0O o00o0o0o = this.mHost;
        if (o00o0o0o == null) {
            return null;
        }
        return o00o0o0o.m18657OooO00o();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // com.p118pd.sdk.AbstractC7202o00oOo00
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC7221o00oo0o getLoaderManager() {
        return AbstractC7221o00oo0o.OooO00o(this);
    }

    public int getNextAnim() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return 0;
        }
        return oooO0Oo.OooO0O0;
    }

    public int getNextTransition() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return 0;
        }
        return oooO0Oo.OooO0OO;
    }

    public int getNextTransitionStyle() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return 0;
        }
        return oooO0Oo.OooO0Oo;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public Object getReenterTransition() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return null;
        }
        Object obj = oooO0Oo.f14371OooO0Oo;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return null;
        }
        Object obj = oooO0Oo.f14368OooO0O0;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return null;
        }
        return oooO0Oo.OooO0o0;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return null;
        }
        Object obj = oooO0Oo.OooO0o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public int getStateAfterAnimating() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return 0;
        }
        return oooO0Oo.OooO00o;
    }

    @NonNull
    public final String getString(@StringRes int i) {
        return getResources().getString(i);
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    @Nullable
    public final Fragment getTargetFragment() {
        return this.mTarget;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(@StringRes int i) {
        return getResources().getText(i);
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @NonNull
    @MainThread
    public AbstractC7202o00oOo00 getViewLifecycleOwner() {
        AbstractC7202o00oOo00 o00ooo00 = this.mViewLifecycleOwner;
        if (o00ooo00 != null) {
            return o00ooo00;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @NonNull
    public LiveData<AbstractC7202o00oOo00> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // com.p118pd.sdk.AbstractC7218o00oo0O0
    @NonNull
    public C7219o00oo0OO getViewModelStore() {
        if (getContext() != null) {
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C7219o00oo0OO();
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
    }

    public void instantiateChildFragmentManager() {
        if (this.mHost != null) {
            LayoutInflater$Factory2C7167o00o0o o00o0o = new LayoutInflater$Factory2C7167o00o0o();
            this.mChildFragmentManager = o00o0o;
            o00o0o.OooO00o(this.mHost, new OooO0O0(), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return false;
        }
        return oooO0Oo.f14369OooO0O0;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public boolean isPostponed() {
        C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
        if (oooO0Oo == null) {
            return false;
        }
        return oooO0Oo.f14365OooO00o;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 4;
    }

    public final boolean isStateSaved() {
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mFragmentManager;
        if (o00o0o == null) {
            return false;
        }
        return o00o0o.m18639OooO0OO();
    }

    public final boolean isVisible() {
        View view;
        return isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0;
    }

    public void noteStateNotSaved() {
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooOO0o();
        }
    }

    @CallSuper
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @CallSuper
    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC7174o00o0o0O o00o0o0o = this.mHost;
        Activity OooO00o2 = o00o0o0o == null ? null : o00o0o0o.m18652OooO00o();
        if (OooO00o2 != null) {
            this.mCalled = false;
            onAttach(OooO00o2);
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    @CallSuper
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    @CallSuper
    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null && !o00o0o.m18632OooO00o(1)) {
            this.mChildFragmentManager.OooO0OO();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    @CallSuper
    public void onDestroy() {
        boolean z = true;
        this.mCalled = true;
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            z = false;
        }
        C7219o00oo0OO o00oo0oo = this.mViewModelStore;
        if (o00oo0oo != null && !z) {
            o00oo0oo.OooO00o();
        }
    }

    public void onDestroyOptionsMenu() {
    }

    @CallSuper
    public void onDestroyView() {
        this.mCalled = true;
    }

    @CallSuper
    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    @CallSuper
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC7174o00o0o0O o00o0o0o = this.mHost;
        Activity OooO00o2 = o00o0o0o == null ? null : o00o0o0o.m18652OooO00o();
        if (OooO00o2 != null) {
            this.mCalled = false;
            onInflate(OooO00o2, attributeSet, bundle);
        }
    }

    @CallSuper
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    @CallSuper
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @CallSuper
    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @CallSuper
    public void onStart() {
        this.mCalled = true;
    }

    @CallSuper
    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    @CallSuper
    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Nullable
    public AbstractC7175o00o0o0o peekChildFragmentManager() {
        return this.mChildFragmentManager;
    }

    public void performActivityCreated(Bundle bundle) {
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooOO0o();
        }
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            LayoutInflater$Factory2C7167o00o0o o00o0o2 = this.mChildFragmentManager;
            if (o00o0o2 != null) {
                o00o0o2.m18637OooO0O0();
                return;
            }
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooO00o(configuration);
        }
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o == null || !o00o0o.OooO00o(menuItem)) {
            return false;
        }
        return true;
    }

    public void performCreate(Bundle bundle) {
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooOO0o();
        }
        this.mState = 1;
        this.mCalled = false;
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m18703OooO00o(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        return o00o0o != null ? z | o00o0o.OooO00o(menu, menuInflater) : z;
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooOO0o();
        }
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new OooO0OO();
        this.mViewLifecycleRegistry = null;
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.getLifecycle();
            this.mViewLifecycleOwnerLiveData.OooO0O0(this.mViewLifecycleOwner);
        } else if (this.mViewLifecycleRegistry == null) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mLifecycleRegistry.m18703OooO00o(Lifecycle.Event.ON_DESTROY);
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooO0Oo();
        }
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            this.mChildFragmentManager = null;
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.m18703OooO00o(Lifecycle.Event.ON_DESTROY);
        }
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooO0o0();
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC7221o00oo0o.OooO00o(this).OooO00o();
            this.mPerformedCreateView = false;
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
            if (o00o0o == null) {
                return;
            }
            if (this.mRetaining) {
                o00o0o.OooO0Oo();
                this.mChildFragmentManager = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDetach()");
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooO0o();
        }
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooO0O0(z);
        }
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o == null || !o00o0o.OooO0O0(menuItem)) {
            return false;
        }
        return true;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
            if (o00o0o != null) {
                o00o0o.OooO00o(menu);
            }
        }
    }

    public void performPause() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.m18703OooO00o(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.m18703OooO00o(Lifecycle.Event.ON_PAUSE);
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooO0oO();
        }
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooO0OO(z);
        }
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        return o00o0o != null ? z | o00o0o.m18634OooO00o(menu) : z;
    }

    public void performResume() {
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooOO0o();
            this.mChildFragmentManager.m18641OooO0o0();
        }
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            LayoutInflater$Factory2C7167o00o0o o00o0o2 = this.mChildFragmentManager;
            if (o00o0o2 != null) {
                o00o0o2.OooO0oo();
                this.mChildFragmentManager.m18641OooO0o0();
            }
            this.mLifecycleRegistry.m18703OooO00o(Lifecycle.Event.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleRegistry.m18703OooO00o(Lifecycle.Event.ON_RESUME);
                return;
            }
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
    }

    public void performSaveInstanceState(Bundle bundle) {
        Parcelable OooO00o2;
        onSaveInstanceState(bundle);
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null && (OooO00o2 = o00o0o.m18617OooO00o()) != null) {
            bundle.putParcelable(FragmentActivity.FRAGMENTS_TAG, OooO00o2);
        }
    }

    public void performStart() {
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooOO0o();
            this.mChildFragmentManager.m18641OooO0o0();
        }
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            LayoutInflater$Factory2C7167o00o0o o00o0o2 = this.mChildFragmentManager;
            if (o00o0o2 != null) {
                o00o0o2.OooO();
            }
            this.mLifecycleRegistry.m18703OooO00o(Lifecycle.Event.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleRegistry.m18703OooO00o(Lifecycle.Event.ON_START);
                return;
            }
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performStop() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.m18703OooO00o(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.m18703OooO00o(Lifecycle.Event.ON_STOP);
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mChildFragmentManager;
        if (o00o0o != null) {
            o00o0o.OooOO0();
        }
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f14365OooO00o = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final void requestPermissions(@NonNull String[] strArr, int i) {
        AbstractC7174o00o0o0O o00o0o0o = this.mHost;
        if (o00o0o0o != null) {
            o00o0o0o.OooO00o(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @NonNull
    public final AbstractC7175o00o0o0o requireFragmentManager() {
        AbstractC7175o00o0o0o fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public void restoreChildFragmentState(@Nullable Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable(FragmentActivity.FRAGMENTS_TAG)) != null) {
            if (this.mChildFragmentManager == null) {
                instantiateChildFragmentManager();
            }
            this.mChildFragmentManager.OooO00o(parcelable, this.mChildNonConfig);
            this.mChildNonConfig = null;
            this.mChildFragmentManager.OooO0OO();
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mInnerView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleRegistry.m18703OooO00o(Lifecycle.Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f14367OooO0O0 = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f14363OooO00o = Boolean.valueOf(z);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f14360OooO00o = view;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f14359OooO00o = animator;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mIndex < 0 || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    public void setEnterSharedElementCallback(AbstractC7004o000Oo0o o000oo0o) {
        ensureAnimationInfo().f14362OooO00o = o000oo0o;
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f14364OooO00o = obj;
    }

    public void setExitSharedElementCallback(AbstractC7004o000Oo0o o000oo0o) {
        ensureAnimationInfo().f14366OooO0O0 = o000oo0o;
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().f14370OooO0OO = obj;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.m18658OooO00o();
            }
        }
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f14369OooO0O0 = z;
    }

    public final void setIndex(int i, Fragment fragment) {
        this.mIndex = i;
        if (fragment != null) {
            this.mWho = fragment.mWho + Constants.COLON_SEPARATOR + this.mIndex;
            return;
        }
        this.mWho = "android:fragment:" + this.mIndex;
    }

    public void setInitialSavedState(@Nullable SavedState savedState) {
        Bundle bundle;
        if (this.mIndex < 0) {
            if (savedState == null || (bundle = savedState.OooO00o) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.m18658OooO00o();
            }
        }
    }

    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().OooO0O0 = i;
        }
    }

    public void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
            oooO0Oo.OooO0OO = i;
            oooO0Oo.OooO0Oo = i2;
        }
    }

    public void setOnStartEnterTransitionListener(AbstractC5047OooO0o0 oooO0o0) {
        ensureAnimationInfo();
        AbstractC5047OooO0o0 oooO0o02 = this.mAnimationInfo.f14361OooO00o;
        if (oooO0o0 != oooO0o02) {
            if (oooO0o0 == null || oooO0o02 == null) {
                C5046OooO0Oo oooO0Oo = this.mAnimationInfo;
                if (oooO0Oo.f14365OooO00o) {
                    oooO0Oo.f14361OooO00o = oooO0o0;
                }
                if (oooO0o0 != null) {
                    oooO0o0.OooO0O0();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f14371OooO0Oo = obj;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
    }

    public void setReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f14368OooO0O0 = obj;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().OooO0o0 = obj;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().OooO0o = obj;
    }

    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().OooO00o = i;
    }

    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        AbstractC7175o00o0o0o fragmentManager = getFragmentManager();
        AbstractC7175o00o0o0o fragmentManager2 = fragment != null ? fragment.getFragmentManager() : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
                if (fragment2 == this) {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            this.mTarget = fragment;
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.OooOO0(this);
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 3 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        AbstractC7174o00o0o0O o00o0o0o = this.mHost;
        if (o00o0o0o != null) {
            return o00o0o0o.OooO00o(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC7174o00o0o0O o00o0o0o = this.mHost;
        if (o00o0o0o != null) {
            o00o0o0o.OooO00o(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        LayoutInflater$Factory2C7167o00o0o o00o0o = this.mFragmentManager;
        if (o00o0o == null || o00o0o.f19580OooO00o == null) {
            ensureAnimationInfo().f14365OooO00o = false;
        } else if (Looper.myLooper() != this.mFragmentManager.f19580OooO00o.m18654OooO00o().getLooper()) {
            this.mFragmentManager.f19580OooO00o.m18654OooO00o().postAtFrontOfQueue(new OooO00o());
        } else {
            callStartTransitionListener();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C7082o00OO00O.OooO00o(this, sb);
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public final Bundle OooO00o;

        public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: OooO00o */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Bundle bundle) {
            this.OooO00o = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.OooO00o);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.OooO00o = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    public static Fragment instantiate(Context context, String str, @Nullable Bundle bundle) {
        try {
            Class<?> cls = sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    @NonNull
    public final String getString(@StringRes int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public void startActivity(Intent intent, @Nullable Bundle bundle) {
        AbstractC7174o00o0o0O o00o0o0o = this.mHost;
        if (o00o0o0o != null) {
            o00o0o0o.OooO00o(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle) {
        AbstractC7174o00o0o0O o00o0o0o = this.mHost;
        if (o00o0o0o != null) {
            o00o0o0o.OooO00o(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public class OooO0O0 extends AbstractC7166o00o0Ooo {
        public OooO0O0() {
        }

        @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
        @Nullable
        public View OooO00o(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
        public boolean OooO00o() {
            return Fragment.this.mView != null;
        }

        @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo
        public Fragment OooO00o(Context context, String str, Bundle bundle) {
            return Fragment.this.mHost.OooO00o(context, str, bundle);
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        AbstractC7174o00o0o0O o00o0o0o = this.mHost;
        if (o00o0o0o != null) {
            LayoutInflater OooO00o2 = o00o0o0o.m18655OooO00o();
            getChildFragmentManager();
            C7091o00OOO.OooO0O0(OooO00o2, this.mChildFragmentManager.m18618OooO00o());
            return OooO00o2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @CallSuper
    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @CallSuper
    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
