package com.jinhui365.util.dialog;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.annotation.Keep;
import com.jinhui365.util.C1427R;
import com.p118pd.sdk.C8733oo0oOO0o;
import com.p118pd.sdk.C8734oo0oOOO;

@Keep
public class BottomDialog {
    public static Activity OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Window f15000OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WindowManager.LayoutParams f15001OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LinearLayout f15002OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PopupWindow f15003OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5119OooO0Oo f15004OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15005OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String[] f15006OooO00o;

    public class OooO00o implements PopupWindow.OnDismissListener {
        public OooO00o() {
        }

        public void onDismiss() {
            BottomDialog.this.f15001OooO00o.alpha = 1.0f;
            BottomDialog.this.f15000OooO00o.setAttributes(BottomDialog.this.f15001OooO00o);
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        public void onClick(View view) {
            BottomDialog.this.f15004OooO00o.OooO00o("取消");
            BottomDialog.this.f15003OooO00o.dismiss();
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public final /* synthetic */ String o0ooOOo;

        public OooO0OO(String str) {
            this.o0ooOOo = str;
        }

        public void onClick(View view) {
            BottomDialog.this.f15004OooO00o.OooO00o(this.o0ooOOo);
            BottomDialog.this.f15003OooO00o.dismiss();
        }
    }

    /* renamed from: com.jinhui365.util.dialog.BottomDialog$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC5119OooO0Oo {
        void OooO00o(String str);
    }

    /* renamed from: com.jinhui365.util.dialog.BottomDialog$OooO0o0  reason: case insensitive filesystem */
    public static class C5120OooO0o0 {
        public static final BottomDialog OooO00o = new BottomDialog(null);
    }

    public /* synthetic */ BottomDialog(OooO00o oooO00o) {
        this();
    }

    private void OooO0OO() {
        C8733oo0oOO0o oo0ooo0o = new C8733oo0oOO0o(OooO00o);
        oo0ooo0o.setTitleText("取消");
        oo0ooo0o.setTitleColor(C1427R.C1428color.f1871C8);
        oo0ooo0o.setIsShowLine(false);
        oo0ooo0o.setOnClickListener(new OooO0O0());
        LinearLayout linearLayout = new LinearLayout(OooO00o);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setLayoutParams(layoutParams);
        oo0ooo0o.setLayoutParams(layoutParams);
        linearLayout.setBackgroundColor(OooO00o.getResources().getColor(C1427R.C1428color.C16));
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, 20, 0, 0);
        linearLayout.addView(oo0ooo0o);
        this.f15002OooO00o.addView(linearLayout);
    }

    private void OooO0Oo() {
        int i = 0;
        while (true) {
            String[] strArr = this.f15006OooO00o;
            if (i >= strArr.length) {
                break;
            }
            OooO00o(i, strArr[i]);
            i++;
        }
        if (this.f15005OooO00o) {
            OooO0OO();
        }
    }

    public void OooO0O0() {
        PopupWindow popupWindow = this.f15003OooO00o;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f15003OooO00o.dismiss();
        }
        OooO00o = null;
    }

    public BottomDialog() {
        this.f15005OooO00o = true;
    }

    public BottomDialog OooO00o(AbstractC5119OooO0Oo oooO0Oo) {
        this.f15004OooO00o = oooO0Oo;
        return this;
    }

    public static BottomDialog OooO00o(Activity activity) {
        OooO00o = activity;
        return C5120OooO0o0.OooO00o;
    }

    public BottomDialog OooO00o(boolean z) {
        this.f15005OooO00o = z;
        return this;
    }

    public BottomDialog OooO00o(String[] strArr) {
        this.f15006OooO00o = strArr;
        return this;
    }

    public void OooO00o() {
        this.f15000OooO00o = OooO00o.getWindow();
        this.f15001OooO00o = OooO00o.getWindow().getAttributes();
        View inflate = View.inflate(OooO00o, C1427R.layout.bottom_dialog_view, null);
        this.f15002OooO00o = (LinearLayout) inflate.findViewById(C1427R.C1430id.ll_item);
        OooO0Oo();
        this.f15001OooO00o.dimAmount = 0.5f;
        this.f15000OooO00o.addFlags(2);
        PopupWindow popupWindow = new PopupWindow(inflate, (int) C8734oo0oOOO.OooO0o0(OooO00o), -2);
        this.f15003OooO00o = popupWindow;
        popupWindow.setOnDismissListener(new OooO00o());
        this.f15003OooO00o.setWidth(-1);
        this.f15003OooO00o.setHeight(-2);
        this.f15003OooO00o.setBackgroundDrawable(new BitmapDrawable());
        this.f15003OooO00o.setTouchable(true);
        this.f15003OooO00o.setFocusable(false);
        this.f15003OooO00o.setOutsideTouchable(false);
        this.f15003OooO00o.setAnimationStyle(C1427R.style.jinhui_AnimBottom);
        this.f15002OooO00o.setBackgroundColor(OooO00o.getResources().getColor(C1427R.C1428color.f1864C1));
    }

    public void OooO00o(View view) {
        this.f15003OooO00o.showAtLocation(view, 80, 0, 0);
        WindowManager.LayoutParams layoutParams = this.f15001OooO00o;
        layoutParams.alpha = 0.5f;
        this.f15000OooO00o.setAttributes(layoutParams);
    }

    public void OooO00o(int i, String str) {
        C8733oo0oOO0o oo0ooo0o = new C8733oo0oOO0o(OooO00o);
        oo0ooo0o.setTitleText(str);
        boolean z = true;
        if (i == this.f15006OooO00o.length - 1) {
            z = false;
        }
        oo0ooo0o.setIsShowLine(z);
        oo0ooo0o.setOnClickListener(new OooO0OO(str));
        this.f15002OooO00o.addView(oo0ooo0o);
    }
}
