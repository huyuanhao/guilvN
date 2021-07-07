package com.facebook.react.modules.timepicker;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.p118pd.sdk.AbstractC7175o00o0o0o;
import com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO;
import javax.annotation.Nullable;

@ReactModule(name = TimePickerDialogModule.FRAGMENT_TAG)
public class TimePickerDialogModule extends ReactContextBaseJavaModule {
    public static final String ACTION_DISMISSED = "dismissedAction";
    public static final String ACTION_TIME_SET = "timeSetAction";
    public static final String ARG_HOUR = "hour";
    public static final String ARG_IS24HOUR = "is24Hour";
    public static final String ARG_MINUTE = "minute";
    public static final String ARG_MODE = "mode";
    public static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
    @VisibleForTesting
    public static final String FRAGMENT_TAG = "TimePickerAndroid";

    public class TimePickerDialogListener implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener {
        public final Promise mPromise;
        public boolean mPromiseResolved = false;

        public TimePickerDialogListener(Promise promise) {
            this.mPromise = promise;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.mPromiseResolved && TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "dismissedAction");
                this.mPromise.resolve(writableNativeMap);
                this.mPromiseResolved = true;
            }
        }

        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            if (!this.mPromiseResolved && TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", TimePickerDialogModule.ACTION_TIME_SET);
                writableNativeMap.putInt(TimePickerDialogModule.ARG_HOUR, i);
                writableNativeMap.putInt("minute", i2);
                this.mPromise.resolve(writableNativeMap);
                this.mPromiseResolved = true;
            }
        }
    }

    public TimePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(ARG_HOUR) && !readableMap.isNull(ARG_HOUR)) {
            bundle.putInt(ARG_HOUR, readableMap.getInt(ARG_HOUR));
        }
        if (readableMap.hasKey("minute") && !readableMap.isNull("minute")) {
            bundle.putInt("minute", readableMap.getInt("minute"));
        }
        if (readableMap.hasKey(ARG_IS24HOUR) && !readableMap.isNull(ARG_IS24HOUR)) {
            bundle.putBoolean(ARG_IS24HOUR, readableMap.getBoolean(ARG_IS24HOUR));
        }
        if (readableMap.hasKey("mode") && !readableMap.isNull("mode")) {
            bundle.putString("mode", readableMap.getString("mode"));
        }
        return bundle;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return FRAGMENT_TAG;
    }

    @ReactMethod
    public void open(@Nullable ReadableMap readableMap, Promise promise) {
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        if (fragmentActivity == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a TimePicker dialog while not attached to an Activity");
            return;
        }
        AbstractC7175o00o0o0o supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        DialogInterface$OnCancelListenerC7165o00o0OoO o00o0ooo = (DialogInterface$OnCancelListenerC7165o00o0OoO) supportFragmentManager.OooO00o(FRAGMENT_TAG);
        if (o00o0ooo != null) {
            o00o0ooo.dismiss();
        }
        TimePickerDialogFragment timePickerDialogFragment = new TimePickerDialogFragment();
        if (readableMap != null) {
            timePickerDialogFragment.setArguments(createFragmentArguments(readableMap));
        }
        TimePickerDialogListener timePickerDialogListener = new TimePickerDialogListener(promise);
        timePickerDialogFragment.setOnDismissListener(timePickerDialogListener);
        timePickerDialogFragment.setOnTimeSetListener(timePickerDialogListener);
        timePickerDialogFragment.show(supportFragmentManager, FRAGMENT_TAG);
    }
}
