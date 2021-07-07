package com.umeng.message.inapp;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.umeng.message.common.C3779c;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.proguard.C3819h;
import com.umeng.message.proguard.C3846j;
import com.umeng.message.view.UCloseView;
import org.json.JSONObject;

public final class UmengCardMessage extends DialogFragment {

    /* renamed from: a */
    public static final String f10199a = UmengCardMessage.class.getName();

    /* renamed from: r */
    public static final int f10200r = 12;

    /* renamed from: b */
    public Activity f10201b;

    /* renamed from: c */
    public UInAppMessage f10202c;

    /* renamed from: d */
    public String f10203d;

    /* renamed from: e */
    public Bitmap f10204e;

    /* renamed from: f */
    public ViewGroup f10205f;

    /* renamed from: g */
    public int f10206g;

    /* renamed from: h */
    public int f10207h;

    /* renamed from: i */
    public int f10208i;

    /* renamed from: j */
    public int f10209j;

    /* renamed from: k */
    public UInAppHandler f10210k;

    /* renamed from: l */
    public IUmengInAppMsgCloseCallback f10211l;

    /* renamed from: m */
    public boolean f10212m = false;

    /* renamed from: n */
    public boolean f10213n = false;

    /* renamed from: o */
    public boolean f10214o = false;

    /* renamed from: p */
    public boolean f10215p = false;

    /* renamed from: q */
    public String[] f10216q = {"18", "16", "16"};

    /* renamed from: a */
    private int m10393a(boolean z) {
        return z ? 1 : 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        RelativeLayout.LayoutParams layoutParams;
        super.onConfigurationChanged(configuration);
        if (this.f10205f != null) {
            if (configuration.orientation == 1) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            }
            int a = C3846j.m10571a(this.f10201b, 30.0f);
            int a2 = C3846j.m10571a(this.f10201b, 15.0f);
            layoutParams.setMargins(a, a2, a, a2);
            layoutParams.addRule(13);
            this.f10205f.setLayoutParams(layoutParams);
        }
    }

    public final void onCreate(Bundle bundle) {
        String[] b;
        super.onCreate(bundle);
        setStyle(2, 16973830);
        setRetainInstance(true);
        try {
            this.f10201b = getActivity();
            Bundle arguments = getArguments();
            this.f10202c = new UInAppMessage(new JSONObject(arguments.getString("msg")));
            this.f10203d = arguments.getString("label");
            byte[] byteArray = arguments.getByteArray("bitmapByte");
            if (byteArray != null) {
                this.f10204e = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
            this.f10210k = InAppMessageManager.getInstance(this.f10201b).getInAppHandler();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i = this.f10202c.msg_type;
        if ((i == 5 || i == 6) && (b = InAppMessageManager.getInstance(this.f10201b).mo39791b()) != null) {
            this.f10216q = b;
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.requestWindowFeature(1);
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Rect rect;
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            int height = rect.height() - C3846j.m10571a(this.f10201b, 65.0f);
            this.f10207h = height;
            double d = (double) height;
            Double.isNaN(d);
            this.f10206g = (int) (d * 1.2d);
            int width = rect.width() - C3846j.m10571a(this.f10201b, 70.0f);
            this.f10208i = width;
            this.f10209j = (width / 2) * 3;
        } else {
            rect = null;
        }
        int i = this.f10202c.msg_type;
        if (i == 2 || i == 3) {
            return m10394a();
        }
        if (i == 4) {
            return m10396a(layoutInflater, viewGroup, bundle);
        }
        if ((i == 5 || i == 6) && rect != null) {
            return m10395a(rect);
        }
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        C3807d a = C3807d.m10462a(this.f10201b);
        UInAppMessage uInAppMessage = this.f10202c;
        a.mo39863a(uInAppMessage.msg_id, uInAppMessage.msg_type, 0, m10393a(this.f10213n), 0, 0, m10393a(this.f10215p), 0, m10393a(this.f10214o));
        this.f10215p = false;
        this.f10213n = false;
        this.f10214o = false;
        this.f10212m = false;
        IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback = this.f10211l;
        if (iUmengInAppMsgCloseCallback != null) {
            iUmengInAppMsgCloseCallback.onClose();
        }
    }

    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void onStart() {
        super.onStart();
        if (!this.f10212m) {
            C3807d a = C3807d.m10462a(this.f10201b);
            UInAppMessage uInAppMessage = this.f10202c;
            a.mo39863a(uInAppMessage.msg_id, uInAppMessage.msg_type, 1, 0, 0, 0, 0, 0, 0);
        }
        this.f10212m = true;
    }

    /* renamed from: a */
    private View m10394a() {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = new RelativeLayout(this.f10201b);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(Color.parseColor("#33000000"));
        if (getResources().getConfiguration().orientation == 1) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        } else if (this.f10202c.msg_type == 2) {
            layoutParams = new RelativeLayout.LayoutParams(this.f10206g, this.f10207h);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        }
        int a = C3846j.m10571a(this.f10201b, 30.0f);
        int a2 = C3846j.m10571a(this.f10201b, 15.0f);
        layoutParams.setMargins(a, a2, a, a2);
        layoutParams.addRule(13);
        FrameLayout frameLayout = new FrameLayout(this.f10201b);
        this.f10205f = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        int a3 = C3846j.m10571a(this.f10201b, 12.0f);
        layoutParams2.setMargins(a3, a3, a3, a3);
        ImageView imageView = new ImageView(this.f10201b);
        imageView.setLayoutParams(layoutParams2);
        imageView.setAdjustViewBounds(true);
        imageView.setId(C3819h.m10559c());
        imageView.setImageBitmap(this.f10204e);
        this.f10205f.addView(imageView);
        int a4 = C3846j.m10571a(this.f10201b, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a4, a4, 5);
        UCloseView uCloseView = new UCloseView(this.f10201b);
        uCloseView.setLayoutParams(layoutParams3);
        this.f10205f.addView(uCloseView);
        relativeLayout.addView(this.f10205f);
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.umeng.message.inapp.UmengCardMessage.View$OnClickListenerC37901 */

            public void onClick(View view) {
                UmengCardMessage.this.f10213n = true;
                if (!TextUtils.equals("none", UmengCardMessage.this.f10202c.action_type)) {
                    UmengCardMessage.this.f10210k.handleInAppMessage(UmengCardMessage.this.f10201b, UmengCardMessage.this.f10202c, 16);
                    UmengCardMessage.this.dismiss();
                }
            }
        });
        uCloseView.setOnClickListener(new View.OnClickListener() {
            /* class com.umeng.message.inapp.UmengCardMessage.View$OnClickListenerC37912 */

            public void onClick(View view) {
                UmengCardMessage.this.f10215p = true;
                UmengCardMessage.this.dismiss();
            }
        });
        return relativeLayout;
    }

    /* renamed from: a */
    private View m10395a(Rect rect) {
        RelativeLayout relativeLayout = new RelativeLayout(this.f10201b);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(Color.parseColor("#33000000"));
        if (getResources().getConfiguration().orientation == 1) {
            int width = rect.width() - C3846j.m10571a(this.f10201b, 70.0f);
            this.f10208i = width;
            if (this.f10202c.msg_type == 5) {
                this.f10209j = (width / 6) * 5;
            } else {
                this.f10209j = (width / 2) * 3;
            }
        } else {
            int height = rect.height() - C3846j.m10571a(this.f10201b, 65.0f);
            this.f10209j = height;
            this.f10208i = (height / 5) * 6;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f10208i, this.f10209j);
        layoutParams.addRule(13);
        LinearLayout linearLayout = new LinearLayout(this.f10201b);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int a = C3846j.m10571a(this.f10201b, 20.0f);
        layoutParams2.setMargins(a, a, a, a);
        TextView textView = new TextView(this.f10201b);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setText(this.f10202c.title);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        textView.setTextSize((float) Integer.parseInt(this.f10216q[0]));
        textView.setTextColor(Color.parseColor("#000000"));
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.setMargins(a, 0, a, 0);
        layoutParams3.weight = 1.0f;
        ScrollView scrollView = new ScrollView(this.f10201b);
        scrollView.setLayoutParams(layoutParams3);
        scrollView.setScrollBarStyle(16777216);
        scrollView.setVerticalScrollBarEnabled(false);
        TextView textView2 = new TextView(this.f10201b);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView2.setText(this.f10202c.content);
        textView2.setTextSize((float) Integer.parseInt(this.f10216q[1]));
        textView2.setTextColor(Color.parseColor("#000000"));
        scrollView.addView(textView2);
        linearLayout.addView(scrollView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(C3846j.m10571a(this.f10201b, 1.0f), Color.parseColor("#D8D8D8"));
        gradientDrawable.setCornerRadius(20.0f);
        gradientDrawable.setColor(-1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, C3846j.m10571a(this.f10201b, 35.0f));
        layoutParams4.setMargins(a, C3846j.m10571a(this.f10201b, 30.0f), a, a);
        TextView textView3 = new TextView(this.f10201b);
        textView3.setLayoutParams(layoutParams4);
        textView3.setGravity(17);
        textView3.setBackgroundColor(Color.parseColor("#FFFFFF"));
        textView3.setText(this.f10202c.button_text);
        textView3.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        textView3.setTextSize((float) Integer.parseInt(this.f10216q[2]));
        textView3.setTextColor(Color.parseColor("#000000"));
        textView3.setBackgroundDrawable(gradientDrawable);
        linearLayout.addView(textView3);
        relativeLayout.addView(linearLayout);
        textView3.setOnClickListener(new View.OnClickListener() {
            /* class com.umeng.message.inapp.UmengCardMessage.View$OnClickListenerC37923 */

            public void onClick(View view) {
                UmengCardMessage.this.f10213n = true;
                UmengCardMessage.this.f10210k.handleInAppMessage(UmengCardMessage.this.f10201b, UmengCardMessage.this.f10202c, 18);
                UmengCardMessage.this.dismiss();
            }
        });
        return relativeLayout;
    }

    /* renamed from: a */
    private View m10396a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C3779c.m10332a(this.f10201b).mo39734e("umeng_custom_card_message"), viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(C3779c.m10332a(this.f10201b).mo39731b("umeng_card_message_image"));
        imageView.setImageBitmap(this.f10204e);
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.umeng.message.inapp.UmengCardMessage.View$OnClickListenerC37934 */

            public void onClick(View view) {
                UmengCardMessage.this.f10213n = true;
                if (!TextUtils.equals("none", UmengCardMessage.this.f10202c.action_type)) {
                    UmengCardMessage.this.f10210k.handleInAppMessage(UmengCardMessage.this.f10201b, UmengCardMessage.this.f10202c, 16);
                    UmengCardMessage.this.dismiss();
                }
            }
        });
        ((Button) inflate.findViewById(C3779c.m10332a(this.f10201b).mo39731b("umeng_card_message_ok"))).setOnClickListener(new View.OnClickListener() {
            /* class com.umeng.message.inapp.UmengCardMessage.View$OnClickListenerC37945 */

            public void onClick(View view) {
                UmengCardMessage.this.f10214o = true;
                if (!TextUtils.equals("none", UmengCardMessage.this.f10202c.action_type)) {
                    UmengCardMessage.this.f10210k.handleInAppMessage(UmengCardMessage.this.f10201b, UmengCardMessage.this.f10202c, 19);
                    UmengCardMessage.this.dismiss();
                }
            }
        });
        ((Button) inflate.findViewById(C3779c.m10332a(this.f10201b).mo39731b("umeng_card_message_close"))).setOnClickListener(new View.OnClickListener() {
            /* class com.umeng.message.inapp.UmengCardMessage.View$OnClickListenerC37956 */

            public void onClick(View view) {
                UmengCardMessage.this.f10215p = true;
                UmengCardMessage.this.dismiss();
            }
        });
        return inflate;
    }

    /* renamed from: a */
    public void mo39825a(IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback) {
        this.f10211l = iUmengInAppMsgCloseCallback;
    }
}
