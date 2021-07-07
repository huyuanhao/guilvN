package com.qiyukf.nim.uikit.session.helper;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.OnMessageItemClickListener;
import com.qiyukf.unicorn.p212e.C2467c;
import com.qiyukf.unicorn.p212e.C2478m;
import com.qiyukf.unicorn.widget.p251a.C3021g;
import com.xiaomi.mipush.sdk.MiPushMessage;

/* renamed from: com.qiyukf.nim.uikit.session.helper.b */
public class C2003b extends ClickableSpan {

    /* renamed from: a */
    public Context f3951a;

    /* renamed from: b */
    public String f3952b;

    /* renamed from: c */
    public int f3953c = 0;

    /* renamed from: d */
    public String f3954d;

    public C2003b(Context context, String str) {
        this.f3951a = context;
        this.f3952b = str;
    }

    /* renamed from: a */
    public static void m3987a(final Context context, String str, String str2) {
        try {
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty(parse.getScheme())) {
                str = "http://" + str;
                parse = Uri.parse(str);
            }
            if (parse.getScheme().toLowerCase().equals("qiyu")) {
                if ("action.qiyukf.com".equals(parse.getHost().toLowerCase())) {
                    String queryParameter = parse.getQueryParameter("command");
                    if (!TextUtils.isEmpty(queryParameter) && queryParameter.equalsIgnoreCase("applyHumanStaff")) {
                        String queryParameter2 = parse.getQueryParameter("groupid");
                        String queryParameter3 = parse.getQueryParameter("transferRgType");
                        String queryParameter4 = parse.getQueryParameter(MiPushMessage.KEY_MESSAGE_ID);
                        C2478m mVar = new C2478m(str2);
                        if (!TextUtils.isEmpty(queryParameter2)) {
                            C2467c cVar = new C2467c();
                            cVar.f4863a = 1;
                            cVar.f4864b = Long.parseLong(queryParameter2);
                            cVar.mo35696a(Long.parseLong(queryParameter2));
                            mVar.mo35732a(cVar);
                        }
                        try {
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                mVar.mo35737c(Integer.valueOf(queryParameter3).intValue());
                            }
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                mVar.mo35730a(Long.valueOf(queryParameter4).longValue());
                            }
                        } catch (NumberFormatException e) {
                            C1709a.m3013a("CustomURLSpan", "parse number is error", e);
                        }
                        mVar.mo35733a(true);
                        mVar.mo35729a(3);
                        C2452d.m5375g().mo36344a(mVar);
                    }
                }
            } else if (!str.startsWith("tel:") || str.length() <= 4) {
                OnMessageItemClickListener onMessageItemClickListener = C2452d.m5373e().onMessageItemClickListener;
                if (onMessageItemClickListener != null) {
                    onMessageItemClickListener.onURLClicked(context, parse.toString());
                } else {
                    context.startActivity(new Intent("android.intent.action.VIEW", parse));
                }
            } else {
                final String substring = str.substring(4);
                C3021g.m7057a(context, (CharSequence) null, new CharSequence[]{context.getString(C2364R.string.ysf_call_str), context.getString(C2364R.string.ysf_copy_phone_str), context.getString(C2364R.string.ysf_cancel)}, new C3021g.AbstractC3022a() {
                    /* class com.qiyukf.nim.uikit.session.helper.C2003b.C20041 */

                    @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                    /* renamed from: a */
                    public final void mo34369a(int i) {
                        if (i == 0) {
                            try {
                                context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + substring)));
                            } catch (SecurityException unused) {
                                C1865f.m3555a(C2364R.string.ysf_go_call_error);
                            }
                        } else if (i == 1) {
                            try {
                                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Label", substring));
                                C1865f.m3555a(C2364R.string.ysf_copy_phone_success_str);
                            } catch (Exception unused2) {
                                C1865f.m3555a(C2364R.string.ysf_copy_phone_error_str);
                            }
                        }
                    }
                });
            }
        } catch (Exception e2) {
            C1709a.m3015b("onURLClick is error", "url:" + str, e2);
        }
    }

    /* renamed from: a */
    public final void mo34463a(String str) {
        this.f3954d = str;
    }

    public void onClick(View view) {
        m3987a(this.f3951a, this.f3952b, this.f3954d);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        int i = this.f3953c;
        if (i != 0) {
            textPaint.setColor(i);
        }
    }
}
