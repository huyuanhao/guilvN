package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import javax.annotation.Nullable;
import s.h.e.l.l.C;

public class DismissableDatePickerDialog extends DatePickerDialog {
    static {
        C.i(9);
    }

    public DismissableDatePickerDialog(Context context, @Nullable DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        super(context, onDateSetListener, i, i2, i3);
    }

    public native void onStop();

    public DismissableDatePickerDialog(Context context, int i, @Nullable DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
    }
}
