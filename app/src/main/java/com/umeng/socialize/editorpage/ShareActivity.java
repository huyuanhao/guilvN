package com.umeng.socialize.editorpage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.ResContainer;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import java.io.File;

public class ShareActivity extends Activity implements View.OnClickListener {

    /* renamed from: c */
    public static final String f10720c = "ShareActivity";

    /* renamed from: d */
    public static int f10721d = 140;

    /* renamed from: a */
    public ImageView f10722a;

    /* renamed from: b */
    public TextWatcher f10723b = new TextWatcher() {
        /* class com.umeng.socialize.editorpage.ShareActivity.C39261 */

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ShareActivity shareActivity = ShareActivity.this;
            shareActivity.f10732m = shareActivity.m10802e();
        }
    };

    /* renamed from: e */
    public String f10724e = "7.0.2";

    /* renamed from: f */
    public String f10725f;

    /* renamed from: g */
    public String f10726g;

    /* renamed from: h */
    public String f10727h;

    /* renamed from: i */
    public ResContainer f10728i;

    /* renamed from: j */
    public EditText f10729j;

    /* renamed from: k */
    public TextView f10730k;

    /* renamed from: l */
    public Context f10731l;

    /* renamed from: m */
    public boolean f10732m;

    /* renamed from: n */
    public SHARE_MEDIA f10733n;

    /* renamed from: o */
    public boolean f10734o = false;

    /* renamed from: p */
    public ImageView f10735p;

    /* renamed from: q */
    public TextView f10736q;

    /* renamed from: b */
    private String m10798b(String str) {
        if (str.equals("TENCENT")) {
            return getResources().getString(this.f10728i.string("umeng_socialize_sharetotencent"));
        }
        if (str.equals("RENREN")) {
            return getResources().getString(this.f10728i.string("umeng_socialize_sharetorenren"));
        }
        if (str.equals("DOUBAN")) {
            return getResources().getString(this.f10728i.string("umeng_socialize_sharetodouban"));
        }
        if (str.equals("TWITTER")) {
            return getResources().getString(this.f10728i.string("umeng_socialize_sharetotwitter"));
        }
        if (str.equals("LINKEDIN")) {
            return getResources().getString(this.f10728i.string("umeng_socialize_sharetolinkin"));
        }
        return getResources().getString(this.f10728i.string("umeng_socialize_sharetosina"));
    }

    /* renamed from: c */
    private void m10800c() {
        SHARE_MEDIA share_media;
        String obj = this.f10729j.getText().toString();
        if (TextUtils.isEmpty(obj.trim()) && this.f10733n == SHARE_MEDIA.SINA && (TextUtils.isEmpty(this.f10727h) || this.f10727h.equals("web") || this.f10727h.equals("video") || this.f10727h.equals("music"))) {
            Toast.makeText(this.f10731l, UmengText.SHARE.CONTEXT_EMPTY, 0).show();
        } else if (SocializeUtils.countContentLength(obj) > f10721d && (share_media = this.f10733n) != SHARE_MEDIA.TWITTER && share_media != SHARE_MEDIA.LINKEDIN) {
        } else {
            if (!this.f10732m || this.f10733n == SHARE_MEDIA.TWITTER) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString(SocializeConstants.KEY_TEXT, obj);
                bundle.putString("pic", this.f10727h);
                intent.putExtras(bundle);
                setResult(-1, intent);
                mo40296a();
                return;
            }
            Toast.makeText(this.f10731l, UmengText.SHARE.CONTEXT_LONG, 0).show();
        }
    }

    /* renamed from: d */
    private void m10801d() {
        this.f10727h = null;
        findViewById(this.f10728i.mo40288id("root")).setBackgroundColor(Color.parseColor("#D4E0E5"));
        findViewById(this.f10728i.mo40288id("umeng_socialize_share_bottom_area")).setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private boolean m10802e() {
        int countContentLength = f10721d - SocializeUtils.countContentLength(this.f10729j.getText().toString());
        TextView textView = this.f10730k;
        textView.setText(SocializeUtils.countContentLength(this.f10729j.getText().toString()) + C8932ooOOO0o.OooO0OO + f10721d);
        return countContentLength < 0;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!SocializeConstants.BACKKEY_COMPLETE_CLOSE || keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        new Handler().postDelayed(new Runnable() {
            /* class com.umeng.socialize.editorpage.ShareActivity.RunnableC39272 */

            public void run() {
                ShareActivity.this.setResult(1000);
                ShareActivity.this.finish();
            }
        }, 400);
        return true;
    }

    public void onCancel(View view) {
        setResult(1000);
        mo40296a();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == this.f10728i.mo40288id("umeng_back")) {
            onCancel(view);
        } else if (id == this.f10728i.mo40288id("umeng_share_btn")) {
            m10800c();
        } else if (id == this.f10728i.mo40288id("umeng_del")) {
            m10801d();
        }
    }

    public void onCreate(Bundle bundle) {
        this.f10728i = ResContainer.get(this);
        this.f10734o = SocializeUtils.isFloatWindowStyle(this);
        super.onCreate(bundle);
        this.f10731l = this;
        setContentView(this.f10728i.layout("umeng_socialize_share"));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.softInputMode = 32;
        if (this.f10734o) {
            int[] floatWindowSize = SocializeUtils.getFloatWindowSize(this.f10731l);
            attributes.width = floatWindowSize[0];
            attributes.height = floatWindowSize[1];
        }
        getWindow().setAttributes(attributes);
        SLog.m10856E(UmengText.SHARE.SHAREVIEWV + this.f10724e);
        Bundle extras = getIntent().getExtras();
        SHARE_MEDIA a = m10795a(extras.getString(SocializeConstants.KEY_PLATFORM));
        this.f10733n = a;
        if (a == SHARE_MEDIA.RENREN) {
            f10721d = 120;
        } else {
            f10721d = 140;
        }
        this.f10725f = extras.getString(SocializeConstants.KEY_TEXT);
        this.f10727h = extras.getString("pic");
        this.f10726g = extras.getString("title");
        m10799b();
        this.f10735p = (ImageView) findViewById(this.f10728i.mo40288id("umeng_del"));
        this.f10729j.addTextChangedListener(this.f10723b);
        ((TextView) findViewById(this.f10728i.mo40288id("umeng_title"))).setText(m10798b(extras.getString(SocializeConstants.KEY_PLATFORM)));
        findViewById(this.f10728i.mo40288id("umeng_back")).setOnClickListener(this);
        findViewById(this.f10728i.mo40288id("umeng_share_btn")).setOnClickListener(this);
        this.f10735p.setOnClickListener(this);
        this.f10730k = (TextView) findViewById(this.f10728i.mo40288id("umeng_socialize_share_word_num"));
        this.f10732m = m10802e();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getRepeatCount() == 0) {
            setResult(1000);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public void onResume() {
        this.f10729j.requestFocus();
        super.onResume();
    }

    public void onStop() {
        super.onStop();
    }

    /* renamed from: a */
    private SHARE_MEDIA m10795a(String str) {
        if (str.equals("TENCENT")) {
            return SHARE_MEDIA.TENCENT;
        }
        if (str.equals("RENREN")) {
            return SHARE_MEDIA.RENREN;
        }
        if (str.equals("DOUBAN")) {
            return SHARE_MEDIA.DOUBAN;
        }
        if (str.equals("TWITTER")) {
            return SHARE_MEDIA.TWITTER;
        }
        if (str.equals("LINKEDIN")) {
            return SHARE_MEDIA.LINKEDIN;
        }
        return SHARE_MEDIA.SINA;
    }

    /* renamed from: b */
    private void m10799b() {
        this.f10729j = (EditText) findViewById(this.f10728i.mo40288id("umeng_socialize_share_edittext"));
        if (!TextUtils.isEmpty(this.f10725f)) {
            this.f10729j.setText(this.f10725f);
            this.f10729j.setSelection(this.f10725f.length());
        }
        this.f10736q = (TextView) findViewById(this.f10728i.mo40288id("umeng_web_title"));
        this.f10722a = (ImageView) findViewById(this.f10728i.mo40288id("umeng_share_icon"));
        if (this.f10727h != null) {
            findViewById(this.f10728i.mo40288id("umeng_socialize_share_bottom_area")).setVisibility(0);
            ImageView imageView = (ImageView) findViewById(this.f10728i.mo40288id("umeng_share_icon"));
            this.f10722a = imageView;
            imageView.setVisibility(0);
            if (this.f10727h.equals("video")) {
                this.f10722a.setImageResource(ResContainer.getResourceId(this.f10731l, "drawable", "umeng_socialize_share_video"));
            } else if (this.f10727h.equals("music")) {
                this.f10722a.setImageResource(ResContainer.getResourceId(this.f10731l, "drawable", "umeng_socialize_share_music"));
            } else if (this.f10727h.equals("web")) {
                this.f10722a.setImageResource(ResContainer.getResourceId(this.f10731l, "drawable", "umeng_socialize_share_web"));
            } else {
                this.f10722a.setImageURI(Uri.fromFile(new File(this.f10727h)));
            }
            if (!TextUtils.isEmpty(this.f10726g)) {
                this.f10736q.setVisibility(0);
                this.f10736q.setText(this.f10726g);
            }
            findViewById(this.f10728i.mo40288id("root")).setBackgroundColor(-1);
        } else if (!TextUtils.isEmpty(this.f10726g)) {
            this.f10722a.setImageResource(ResContainer.getResourceId(this.f10731l, "drawable", "umeng_socialize_share_web"));
            this.f10736q.setVisibility(0);
            this.f10736q.setText(this.f10726g);
        }
    }

    /* renamed from: a */
    public void mo40296a() {
        finish();
    }
}
