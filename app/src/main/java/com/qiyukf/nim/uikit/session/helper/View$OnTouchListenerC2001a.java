package com.qiyukf.nim.uikit.session.helper;

import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.qiyukf.basesdk.p119a.C1709a;

/* renamed from: com.qiyukf.nim.uikit.session.helper.a */
public final class View$OnTouchListenerC2001a implements View.OnTouchListener {

    /* renamed from: a */
    public RunnableC2002a f3947a;

    /* renamed from: b */
    public boolean f3948b;

    /* renamed from: com.qiyukf.nim.uikit.session.helper.a$a */
    public class RunnableC2002a implements Runnable {

        /* renamed from: b */
        public View f3950b;

        public RunnableC2002a(View view) {
            this.f3950b = view;
        }

        public final void run() {
            View view = this.f3950b;
            if (view != null) {
                while (!view.performLongClick() && (view.getParent() instanceof View)) {
                    try {
                        view = (View) view.getParent();
                    } catch (NullPointerException e) {
                        C1709a.m3015b("ClickMovementMethod", "LongClickCallback callback is exception", e);
                        return;
                    }
                }
                View$OnTouchListenerC2001a.this.f3948b = false;
            }
        }
    }

    /* renamed from: a */
    public static View$OnTouchListenerC2001a m3985a() {
        return new View$OnTouchListenerC2001a();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f3947a == null) {
            this.f3947a = new RunnableC2002a(view);
        }
        TextView textView = (TextView) view;
        textView.setMovementMethod(null);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(textView.getText());
        int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 3) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (textView == null) {
                return false;
            }
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) newSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 0) {
                    this.f3948b = true;
                    view.postDelayed(this.f3947a, (long) ViewConfiguration.getLongPressTimeout());
                } else if (this.f3948b) {
                    view.removeCallbacks(this.f3947a);
                    if (action == 1) {
                        try {
                            clickableSpanArr[0].onClick(textView);
                        } catch (Throwable th) {
                            C1709a.m3015b("onSpanClick is error", "", th);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
