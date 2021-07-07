package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.load.engine.GlideException;
import com.p118pd.sdk.AbstractC7004o000Oo0o;
import com.p118pd.sdk.AbstractC7174o00o0o0O;
import com.p118pd.sdk.AbstractC7175o00o0o0o;
import com.p118pd.sdk.AbstractC7218o00oo0O0;
import com.p118pd.sdk.AbstractC7221o00oo0o;
import com.p118pd.sdk.C6981o000O00O;
import com.p118pd.sdk.C7010o000Ooo;
import com.p118pd.sdk.C7173o00o0o00;
import com.p118pd.sdk.C7177o00o0oO0;
import com.p118pd.sdk.C7219o00oo0OO;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends ComponentActivity implements AbstractC7218o00oo0O0, C6981o000O00O.OooO0O0, C6981o000O00O.AbstractC6982OooO0Oo {
    public static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
    public static final String FRAGMENTS_TAG = "android:support:fragments";
    public static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
    public static final int MSG_RESUME_PENDING = 2;
    public static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
    public static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
    public static final String TAG = "FragmentActivity";
    public boolean mCreated;
    public final C7173o00o0o00 mFragments = C7173o00o0o00.OooO00o(new OooO0O0());
    public final Handler mHandler = new OooO00o();
    public int mNextCandidateRequestIndex;
    public C7010o000Ooo<String> mPendingFragmentActivityResults;
    public boolean mRequestedPermissionsFromFragment;
    public boolean mResumed;
    public boolean mStartedActivityFromFragment;
    public boolean mStartedIntentSenderFromFragment;
    public boolean mStopped = true;
    public C7219o00oo0OO mViewModelStore;

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            FragmentActivity.this.onResumeFragments();
            FragmentActivity.this.mFragments.m18650OooO00o();
        }
    }

    public class OooO0O0 extends AbstractC7174o00o0o0O<FragmentActivity> {
        public OooO0O0() {
            super(FragmentActivity.this);
        }

        @Override // com.p118pd.sdk.AbstractC7174o00o0o0O
        public boolean OooO0O0() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // com.p118pd.sdk.AbstractC7174o00o0o0O
        public void OooO00o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14667OooO00o(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        /* Return type fixed from 'android.view.LayoutInflater' to match base method */
        @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O
        /* renamed from: OooO00o  reason: collision with other method in class */
        public FragmentActivity m14663OooO00o() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O
        public FragmentActivity OooO00o() {
            return FragmentActivity.this;
        }

        @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14665OooO00o() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // com.p118pd.sdk.AbstractC7174o00o0o0O
        public void OooO00o(Fragment fragment, Intent intent, int i) {
            FragmentActivity.this.startActivityFromFragment(fragment, intent, i);
        }

        @Override // com.p118pd.sdk.AbstractC7174o00o0o0O
        public void OooO00o(Fragment fragment, Intent intent, int i, @Nullable Bundle bundle) {
            FragmentActivity.this.startActivityFromFragment(fragment, intent, i, bundle);
        }

        @Override // com.p118pd.sdk.AbstractC7174o00o0o0O
        public void OooO00o(Fragment fragment, IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            FragmentActivity.this.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }

        @Override // com.p118pd.sdk.AbstractC7174o00o0o0O
        public void OooO00o(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
            FragmentActivity.this.requestPermissionsFromFragment(fragment, strArr, i);
        }

        @Override // com.p118pd.sdk.AbstractC7174o00o0o0O
        public boolean OooO00o(@NonNull String str) {
            return C6981o000O00O.OooO00o((Activity) FragmentActivity.this, str);
        }

        /* Return type fixed from 'int' to match base method */
        @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O
        public FragmentActivity OooO00o() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O
        public void OooO00o(Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo, com.p118pd.sdk.AbstractC7174o00o0o0O
        @Nullable
        public View OooO00o(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // com.p118pd.sdk.AbstractC7166o00o0Ooo, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O, com.p118pd.sdk.AbstractC7174o00o0o0O
        /* renamed from: OooO00o  reason: collision with other method in class */
        public FragmentActivity m14666OooO00o() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    public static final class OooO0OO {
        public C7177o00o0oO0 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7219o00oo0OO f14372OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object f14373OooO00o;
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.OooO00o() < 65534) {
            while (this.mPendingFragmentActivityResults.OooO00o(this.mNextCandidateRequestIndex) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
            }
            int i = this.mNextCandidateRequestIndex;
            this.mPendingFragmentActivityResults.OooO0O0(i, fragment.mWho);
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    public static void checkForValidRequestCode(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED));
    }

    public static boolean markState(AbstractC7175o00o0o0o o00o0o0o, Lifecycle.State state) {
        boolean z = false;
        for (Fragment fragment : o00o0o0o.m18664OooO00o()) {
            if (fragment != null) {
                if (fragment.getLifecycle().OooO00o().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.m18704OooO00o(state);
                    z = true;
                }
                AbstractC7175o00o0o0o peekChildFragmentManager = fragment.peekChildFragmentManager();
                if (peekChildFragmentManager != null) {
                    z |= markState(peekChildFragmentManager, state);
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.OooO00o(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + GlideException.OooO00o.o0ooOoO;
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC7221o00oo0o.OooO00o(this).OooO00o(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.m18645OooO00o().OooO00o(str, fileDescriptor, printWriter, strArr);
    }

    public Object getLastCustomNonConfigurationInstance() {
        OooO0OO oooO0OO = (OooO0OO) getLastNonConfigurationInstance();
        if (oooO0OO != null) {
            return oooO0OO.f14373OooO00o;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, com.p118pd.sdk.AbstractC7202o00oOo00
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    public AbstractC7175o00o0o0o getSupportFragmentManager() {
        return this.mFragments.m18645OooO00o();
    }

    @Deprecated
    public AbstractC7221o00oo0o getSupportLoaderManager() {
        return AbstractC7221o00oo0o.OooO00o(this);
    }

    @Override // com.p118pd.sdk.AbstractC7218o00oo0O0
    @NonNull
    public C7219o00oo0OO getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                OooO0OO oooO0OO = (OooO0OO) getLastNonConfigurationInstance();
                if (oooO0OO != null) {
                    this.mViewModelStore = oooO0OO.f14372OooO00o;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new C7219o00oo0OO();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.mFragments.OooOOO();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String OooO00o2 = this.mPendingFragmentActivityResults.m18264OooO00o(i4);
            this.mPendingFragmentActivityResults.m18270OooO0O0(i4);
            if (OooO00o2 != null) {
                Fragment OooO00o3 = this.mFragments.OooO00o(OooO00o2);
                if (OooO00o3 == null) {
                    String str = "Activity result no fragment exists for who: " + OooO00o2;
                    return;
                }
                OooO00o3.onActivityResult(i & 65535, i2, intent);
                return;
            }
            return;
        }
        C6981o000O00O.OooO0OO OooO00o4 = C6981o000O00O.OooO00o();
        if (OooO00o4 == null || !OooO00o4.OooO00o(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void onBackPressed() {
        AbstractC7175o00o0o0o OooO00o2 = this.mFragments.m18645OooO00o();
        boolean OooO0OO2 = OooO00o2.OooO0OO();
        if (OooO0OO2 && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (OooO0OO2 || !OooO00o2.OooO0Oo()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.OooOOO();
        this.mFragments.OooO00o(configuration);
    }

    @Override // androidx.core.app.ComponentActivity
    public void onCreate(@Nullable Bundle bundle) {
        C7219o00oo0OO o00oo0oo;
        C7177o00o0oO0 o00o0oo0 = null;
        this.mFragments.OooO00o((Fragment) null);
        super.onCreate(bundle);
        OooO0OO oooO0OO = (OooO0OO) getLastNonConfigurationInstance();
        if (!(oooO0OO == null || (o00oo0oo = oooO0OO.f14372OooO00o) == null || this.mViewModelStore != null)) {
            this.mViewModelStore = o00oo0oo;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable(FRAGMENTS_TAG);
            C7173o00o0o00 o00o0o00 = this.mFragments;
            if (oooO0OO != null) {
                o00o0oo0 = oooO0OO.OooO00o;
            }
            o00o0o00.OooO00o(parcelable, o00o0oo0);
            if (bundle.containsKey(NEXT_CANDIDATE_REQUEST_INDEX_TAG)) {
                this.mNextCandidateRequestIndex = bundle.getInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG);
                int[] intArray = bundle.getIntArray(ALLOCATED_REQUEST_INDICIES_TAG);
                String[] stringArray = bundle.getStringArray(REQUEST_FRAGMENT_WHO_TAG);
                if (!(intArray == null || stringArray == null || intArray.length != stringArray.length)) {
                    this.mPendingFragmentActivityResults = new C7010o000Ooo<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.OooO0O0(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new C7010o000Ooo<>();
            this.mNextCandidateRequestIndex = 0;
        }
        this.mFragments.OooO0O0();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.OooO00o(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mViewModelStore != null && !isChangingConfigurations()) {
            this.mViewModelStore.OooO00o();
        }
        this.mFragments.OooO0OO();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.OooO0o0();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.OooO0O0(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.OooO00o(menuItem);
    }

    @CallSuper
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.OooO00o(z);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.OooOOO();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.OooO00o(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        if (this.mHandler.hasMessages(2)) {
            this.mHandler.removeMessages(2);
            onResumeFragments();
        }
        this.mFragments.OooO0o();
    }

    @CallSuper
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.OooO0O0(z);
    }

    public void onPostResume() {
        super.onPostResume();
        this.mHandler.removeMessages(2);
        onResumeFragments();
        this.mFragments.m18650OooO00o();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        return onPrepareOptionsPanel(view, menu) | this.mFragments.m18651OooO00o(menu);
    }

    @Override // com.p118pd.sdk.C6981o000O00O.OooO0O0
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.OooOOO();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String OooO00o2 = this.mPendingFragmentActivityResults.m18264OooO00o(i3);
            this.mPendingFragmentActivityResults.m18270OooO0O0(i3);
            if (OooO00o2 != null) {
                Fragment OooO00o3 = this.mFragments.OooO00o(OooO00o2);
                if (OooO00o3 == null) {
                    String str = "Activity result no fragment exists for who: " + OooO00o2;
                    return;
                }
                OooO00o3.onRequestPermissionsResult(i & 65535, strArr, iArr);
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.mHandler.sendEmptyMessage(2);
        this.mResumed = true;
        this.mFragments.m18650OooO00o();
    }

    public void onResumeFragments() {
        this.mFragments.OooO0oo();
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C7177o00o0oO0 OooO00o2 = this.mFragments.m18646OooO00o();
        if (OooO00o2 == null && this.mViewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f14373OooO00o = onRetainCustomNonConfigurationInstance;
        oooO0OO.f14372OooO00o = this.mViewModelStore;
        oooO0OO.OooO00o = OooO00o2;
        return oooO0OO;
    }

    @Override // androidx.core.app.ComponentActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        Parcelable OooO00o2 = this.mFragments.m18643OooO00o();
        if (OooO00o2 != null) {
            bundle.putParcelable(FRAGMENTS_TAG, OooO00o2);
        }
        if (this.mPendingFragmentActivityResults.OooO00o() > 0) {
            bundle.putInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG, this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.OooO00o()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.OooO00o()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.OooO00o(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.OooO0O0(i);
                strArr[i] = this.mPendingFragmentActivityResults.m18269OooO0O0(i);
            }
            bundle.putIntArray(ALLOCATED_REQUEST_INDICIES_TAG, iArr);
            bundle.putStringArray(REQUEST_FRAGMENT_WHO_TAG, strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m18649OooO00o();
        }
        this.mFragments.OooOOO();
        this.mFragments.m18650OooO00o();
        this.mFragments.OooO();
    }

    public void onStateNotSaved() {
        this.mFragments.OooOOO();
    }

    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.OooOO0();
    }

    /* JADX INFO: finally extract failed */
    public void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            C6981o000O00O.OooO00o(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            C6981o000O00O.OooO00o(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535));
            this.mRequestedPermissionsFromFragment = false;
        } catch (Throwable th) {
            this.mRequestedPermissionsFromFragment = false;
            throw th;
        }
    }

    public void setEnterSharedElementCallback(AbstractC7004o000Oo0o o000oo0o) {
        C6981o000O00O.OooO00o(this, o000oo0o);
    }

    public void setExitSharedElementCallback(AbstractC7004o000Oo0o o000oo0o) {
        C6981o000O00O.OooO0O0(this, o000oo0o);
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, null);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.mStartedIntentSenderFromFragment = true;
        if (i == -1) {
            try {
                C6981o000O00O.OooO00o(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.mStartedIntentSenderFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C6981o000O00O.OooO00o(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), intent, i2, i3, i4, bundle);
            this.mStartedIntentSenderFromFragment = false;
        }
    }

    public void supportFinishAfterTransition() {
        C6981o000O00O.OooO0O0((Activity) this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C6981o000O00O.OooO0OO((Activity) this);
    }

    public void supportStartPostponedEnterTransition() {
        C6981o000O00O.OooO0Oo(this);
    }

    @Override // com.p118pd.sdk.C6981o000O00O.AbstractC6982OooO0Oo
    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, @Nullable Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i == -1) {
            try {
                C6981o000O00O.OooO00o(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C6981o000O00O.OooO00o(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
