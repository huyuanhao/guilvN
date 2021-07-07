package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.p118pd.sdk.AbstractC7175o00o0o0o;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = DialogModule.NAME)
public class DialogModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    public static final String ACTION_DISMISSED = "dismissed";
    public static final Map<String, Object> CONSTANTS = MapBuilder.m950of(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, "dismissed", "dismissed", KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);
    public static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    public static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    public static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    public static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    public static final String KEY_CANCELABLE = "cancelable";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    public boolean mIsInForeground;

    public class AlertFragmentListener implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
        public final Callback mCallback;
        public boolean mCallbackConsumed = false;

        public AlertFragmentListener(Callback callback) {
            this.mCallback = callback;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!this.mCallbackConsumed && DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.mCallback.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i));
                this.mCallbackConsumed = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.mCallbackConsumed && DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.mCallback.invoke("dismissed");
                this.mCallbackConsumed = true;
            }
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Nullable
    private FragmentManagerHelper getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        if (currentActivity instanceof FragmentActivity) {
            return new FragmentManagerHelper(((FragmentActivity) currentActivity).getSupportFragmentManager());
        }
        return new FragmentManagerHelper(currentActivity.getFragmentManager());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mIsInForeground = true;
        FragmentManagerHelper fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.showPendingAlert();
        } else {
            FLog.m909w(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @ReactMethod
    public void showAlert(ReadableMap readableMap, Callback callback, final Callback callback2) {
        final FragmentManagerHelper fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        final Bundle bundle = new Bundle();
        if (readableMap.hasKey("title")) {
            bundle.putString("title", readableMap.getString("title"));
        }
        if (readableMap.hasKey("message")) {
            bundle.putString("message", readableMap.getString("message"));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString(AlertFragment.ARG_BUTTON_POSITIVE, readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString(AlertFragment.ARG_BUTTON_NEGATIVE, readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString(AlertFragment.ARG_BUTTON_NEUTRAL, readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey("items")) {
            ReadableArray array = readableMap.getArray("items");
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray("items", charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.modules.dialog.DialogModule.RunnableC07601 */

            public void run() {
                fragmentManagerHelper.showNewAlert(DialogModule.this.mIsInForeground, bundle, callback2);
            }
        });
    }

    public class FragmentManagerHelper {
        @Nullable
        public final FragmentManager mFragmentManager;
        @Nullable
        public Object mFragmentToShow;
        @Nullable
        public final AbstractC7175o00o0o0o mSupportFragmentManager;

        public FragmentManagerHelper(AbstractC7175o00o0o0o o00o0o0o) {
            this.mFragmentManager = null;
            this.mSupportFragmentManager = o00o0o0o;
        }

        private void dismissExisting() {
            if (isUsingSupportLibrary()) {
                SupportAlertFragment supportAlertFragment = (SupportAlertFragment) this.mSupportFragmentManager.OooO00o(DialogModule.FRAGMENT_TAG);
                if (supportAlertFragment != null && supportAlertFragment.isResumed()) {
                    supportAlertFragment.dismiss();
                    return;
                }
                return;
            }
            AlertFragment alertFragment = (AlertFragment) this.mFragmentManager.findFragmentByTag(DialogModule.FRAGMENT_TAG);
            if (alertFragment != null && alertFragment.isResumed()) {
                alertFragment.dismiss();
            }
        }

        private boolean isUsingSupportLibrary() {
            return this.mSupportFragmentManager != null;
        }

        public void showNewAlert(boolean z, Bundle bundle, Callback callback) {
            UiThreadUtil.assertOnUiThread();
            dismissExisting();
            AlertFragmentListener alertFragmentListener = callback != null ? new AlertFragmentListener(callback) : null;
            if (isUsingSupportLibrary()) {
                SupportAlertFragment supportAlertFragment = new SupportAlertFragment(alertFragmentListener, bundle);
                if (!z || this.mSupportFragmentManager.OooO0OO()) {
                    this.mFragmentToShow = supportAlertFragment;
                    return;
                }
                if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                    supportAlertFragment.setCancelable(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
                }
                supportAlertFragment.show(this.mSupportFragmentManager, DialogModule.FRAGMENT_TAG);
                return;
            }
            AlertFragment alertFragment = new AlertFragment(alertFragmentListener, bundle);
            if (z) {
                if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                    alertFragment.setCancelable(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
                }
                alertFragment.show(this.mFragmentManager, DialogModule.FRAGMENT_TAG);
                return;
            }
            this.mFragmentToShow = alertFragment;
        }

        public void showPendingAlert() {
            UiThreadUtil.assertOnUiThread();
            if (this.mFragmentToShow != null) {
                if (isUsingSupportLibrary()) {
                    ((SupportAlertFragment) this.mFragmentToShow).show(this.mSupportFragmentManager, DialogModule.FRAGMENT_TAG);
                } else {
                    ((AlertFragment) this.mFragmentToShow).show(this.mFragmentManager, DialogModule.FRAGMENT_TAG);
                }
                this.mFragmentToShow = null;
            }
        }

        public FragmentManagerHelper(FragmentManager fragmentManager) {
            this.mFragmentManager = fragmentManager;
            this.mSupportFragmentManager = null;
        }
    }
}
