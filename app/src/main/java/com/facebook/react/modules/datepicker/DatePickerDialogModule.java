package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.google.gson.internal.bind.TypeAdapters;
import com.p118pd.sdk.AbstractC7175o00o0o0o;
import com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@ReactModule(name = DatePickerDialogModule.FRAGMENT_TAG)
public class DatePickerDialogModule extends ReactContextBaseJavaModule {
    public static final String ACTION_DATE_SET = "dateSetAction";
    public static final String ACTION_DISMISSED = "dismissedAction";
    public static final String ARG_DATE = "date";
    public static final String ARG_MAXDATE = "maxDate";
    public static final String ARG_MINDATE = "minDate";
    public static final String ARG_MODE = "mode";
    public static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
    @VisibleForTesting
    public static final String FRAGMENT_TAG = "DatePickerAndroid";

    public class DatePickerDialogListener implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener {
        public final Promise mPromise;
        public boolean mPromiseResolved = false;

        public DatePickerDialogListener(Promise promise) {
            this.mPromise = promise;
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (!this.mPromiseResolved && DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", DatePickerDialogModule.ACTION_DATE_SET);
                writableNativeMap.putInt(TypeAdapters.C104427.YEAR, i);
                writableNativeMap.putInt(TypeAdapters.C104427.MONTH, i2);
                writableNativeMap.putInt("day", i3);
                this.mPromise.resolve(writableNativeMap);
                this.mPromiseResolved = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.mPromiseResolved && DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", "dismissedAction");
                this.mPromise.resolve(writableNativeMap);
                this.mPromiseResolved = true;
            }
        }
    }

    public DatePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(ARG_DATE) && !readableMap.isNull(ARG_DATE)) {
            bundle.putLong(ARG_DATE, (long) readableMap.getDouble(ARG_DATE));
        }
        if (readableMap.hasKey(ARG_MINDATE) && !readableMap.isNull(ARG_MINDATE)) {
            bundle.putLong(ARG_MINDATE, (long) readableMap.getDouble(ARG_MINDATE));
        }
        if (readableMap.hasKey(ARG_MAXDATE) && !readableMap.isNull(ARG_MAXDATE)) {
            bundle.putLong(ARG_MAXDATE, (long) readableMap.getDouble(ARG_MAXDATE));
        }
        if (readableMap.hasKey("mode") && !readableMap.isNull("mode")) {
            bundle.putString("mode", readableMap.getString("mode"));
        }
        return bundle;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return FRAGMENT_TAG;
    }

    @ReactMethod
    public void open(@Nullable ReadableMap readableMap, Promise promise) {
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        if (fragmentActivity == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to an Activity");
            return;
        }
        AbstractC7175o00o0o0o supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        DialogInterface$OnCancelListenerC7165o00o0OoO o00o0ooo = (DialogInterface$OnCancelListenerC7165o00o0OoO) supportFragmentManager.OooO00o(FRAGMENT_TAG);
        if (o00o0ooo != null) {
            o00o0ooo.dismiss();
        }
        DatePickerDialogFragment datePickerDialogFragment = new DatePickerDialogFragment();
        if (readableMap != null) {
            datePickerDialogFragment.setArguments(createFragmentArguments(readableMap));
        }
        DatePickerDialogListener datePickerDialogListener = new DatePickerDialogListener(promise);
        datePickerDialogFragment.setOnDismissListener(datePickerDialogListener);
        datePickerDialogFragment.setOnDateSetListener(datePickerDialogListener);
        datePickerDialogFragment.show(supportFragmentManager, FRAGMENT_TAG);
    }
}
