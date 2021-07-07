package com.facebook.react.modules.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO;
import java.util.Calendar;
import java.util.Locale;
import javax.annotation.Nullable;

public class TimePickerDialogFragment extends DialogInterface$OnCancelListenerC7165o00o0OoO {
    @Nullable
    public DialogInterface.OnDismissListener mOnDismissListener;
    @Nullable
    public TimePickerDialog.OnTimeSetListener mOnTimeSetListener;

    public static Dialog createDialog(Bundle bundle, Context context, @Nullable TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(11);
        int i2 = instance.get(12);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        TimePickerMode timePickerMode = TimePickerMode.DEFAULT;
        if (!(bundle == null || bundle.getString("mode", null) == null)) {
            timePickerMode = TimePickerMode.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        if (bundle != null) {
            i = bundle.getInt(TimePickerDialogModule.ARG_HOUR, instance.get(11));
            i2 = bundle.getInt("minute", instance.get(12));
            is24HourFormat = bundle.getBoolean(TimePickerDialogModule.ARG_IS24HOUR, DateFormat.is24HourFormat(context));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (timePickerMode == TimePickerMode.CLOCK) {
                return new DismissableTimePickerDialog(context, context.getResources().getIdentifier("ClockTimePickerDialog", "style", context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
            }
            if (timePickerMode == TimePickerMode.SPINNER) {
                return new DismissableTimePickerDialog(context, context.getResources().getIdentifier("SpinnerTimePickerDialog", "style", context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
            }
        }
        return new DismissableTimePickerDialog(context, onTimeSetListener, i, i2, is24HourFormat);
    }

    @Override // com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO
    public Dialog onCreateDialog(Bundle bundle) {
        return createDialog(getArguments(), getActivity(), this.mOnTimeSetListener);
    }

    @Override // com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnTimeSetListener(@Nullable TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.mOnTimeSetListener = onTimeSetListener;
    }
}
