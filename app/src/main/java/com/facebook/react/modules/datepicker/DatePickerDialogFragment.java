package com.facebook.react.modules.datepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO;
import java.util.Calendar;
import java.util.Locale;
import javax.annotation.Nullable;

@SuppressLint({"ValidFragment"})
public class DatePickerDialogFragment extends DialogInterface$OnCancelListenerC7165o00o0OoO {
    public static final long DEFAULT_MIN_DATE = -2208988800001L;
    @Nullable
    public DatePickerDialog.OnDateSetListener mOnDateSetListener;
    @Nullable
    public DialogInterface.OnDismissListener mOnDismissListener;

    /* renamed from: com.facebook.react.modules.datepicker.DatePickerDialogFragment$1 */
    public static /* synthetic */ class C07581 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$react$modules$datepicker$DatePickerMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.react.modules.datepicker.DatePickerMode[] r0 = com.facebook.react.modules.datepicker.DatePickerMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.modules.datepicker.DatePickerDialogFragment.C07581.$SwitchMap$com$facebook$react$modules$datepicker$DatePickerMode = r0
                com.facebook.react.modules.datepicker.DatePickerMode r1 = com.facebook.react.modules.datepicker.DatePickerMode.CALENDAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.react.modules.datepicker.DatePickerDialogFragment.C07581.$SwitchMap$com$facebook$react$modules$datepicker$DatePickerMode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.modules.datepicker.DatePickerMode r1 = com.facebook.react.modules.datepicker.DatePickerMode.SPINNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.react.modules.datepicker.DatePickerDialogFragment.C07581.$SwitchMap$com$facebook$react$modules$datepicker$DatePickerMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.modules.datepicker.DatePickerMode r1 = com.facebook.react.modules.datepicker.DatePickerMode.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.datepicker.DatePickerDialogFragment.C07581.<clinit>():void");
        }
    }

    public static Dialog createDialog(Bundle bundle, Context context, @Nullable DatePickerDialog.OnDateSetListener onDateSetListener) {
        DismissableDatePickerDialog dismissableDatePickerDialog;
        Calendar instance = Calendar.getInstance();
        if (bundle != null && bundle.containsKey(DatePickerDialogModule.ARG_DATE)) {
            instance.setTimeInMillis(bundle.getLong(DatePickerDialogModule.ARG_DATE));
        }
        int i = instance.get(1);
        int i2 = instance.get(2);
        int i3 = instance.get(5);
        DatePickerMode datePickerMode = DatePickerMode.DEFAULT;
        DismissableDatePickerDialog dismissableDatePickerDialog2 = null;
        if (!(bundle == null || bundle.getString("mode", null) == null)) {
            datePickerMode = DatePickerMode.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int i4 = C07581.$SwitchMap$com$facebook$react$modules$datepicker$DatePickerMode[datePickerMode.ordinal()];
            if (i4 == 1) {
                dismissableDatePickerDialog = new DismissableDatePickerDialog(context, context.getResources().getIdentifier("CalendarDatePickerDialog", "style", context.getPackageName()), onDateSetListener, i, i2, i3);
            } else if (i4 == 2) {
                dismissableDatePickerDialog = new DismissableDatePickerDialog(context, context.getResources().getIdentifier("SpinnerDatePickerDialog", "style", context.getPackageName()), onDateSetListener, i, i2, i3);
            } else if (i4 == 3) {
                dismissableDatePickerDialog = new DismissableDatePickerDialog(context, onDateSetListener, i, i2, i3);
            }
            dismissableDatePickerDialog2 = dismissableDatePickerDialog;
        } else {
            DismissableDatePickerDialog dismissableDatePickerDialog3 = new DismissableDatePickerDialog(context, onDateSetListener, i, i2, i3);
            int i5 = C07581.$SwitchMap$com$facebook$react$modules$datepicker$DatePickerMode[datePickerMode.ordinal()];
            if (i5 == 1) {
                dismissableDatePickerDialog3.getDatePicker().setCalendarViewShown(true);
                dismissableDatePickerDialog3.getDatePicker().setSpinnersShown(false);
            } else if (i5 == 2) {
                dismissableDatePickerDialog3.getDatePicker().setCalendarViewShown(false);
            }
            dismissableDatePickerDialog2 = dismissableDatePickerDialog3;
        }
        DatePicker datePicker = dismissableDatePickerDialog2.getDatePicker();
        if (bundle == null || !bundle.containsKey(DatePickerDialogModule.ARG_MINDATE)) {
            datePicker.setMinDate(DEFAULT_MIN_DATE);
        } else {
            instance.setTimeInMillis(bundle.getLong(DatePickerDialogModule.ARG_MINDATE));
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            datePicker.setMinDate(instance.getTimeInMillis());
        }
        if (bundle != null && bundle.containsKey(DatePickerDialogModule.ARG_MAXDATE)) {
            instance.setTimeInMillis(bundle.getLong(DatePickerDialogModule.ARG_MAXDATE));
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(13, 59);
            instance.set(14, 999);
            datePicker.setMaxDate(instance.getTimeInMillis());
        }
        return dismissableDatePickerDialog2;
    }

    @Override // com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO
    public Dialog onCreateDialog(Bundle bundle) {
        return createDialog(getArguments(), getActivity(), this.mOnDateSetListener);
    }

    @Override // com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public void setOnDateSetListener(@Nullable DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.mOnDateSetListener = onDateSetListener;
    }

    public void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }
}
