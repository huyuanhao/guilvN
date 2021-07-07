package com.facebook.react.modules.timepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import javax.annotation.Nullable;
import s.h.e.l.l.C;

public class DismissableTimePickerDialog extends TimePickerDialog {
    static {
        C.i(11);
    }

    public DismissableTimePickerDialog(Context context, @Nullable TimePickerDialog.OnTimeSetListener onTimeSetListener, int i, int i2, boolean z) {
        super(context, onTimeSetListener, i, i2, z);
    }

    public native void onStop();

    public DismissableTimePickerDialog(Context context, int i, @Nullable TimePickerDialog.OnTimeSetListener onTimeSetListener, int i2, int i3, boolean z) {
        super(context, i, onTimeSetListener, i2, i3, z);
    }
}
