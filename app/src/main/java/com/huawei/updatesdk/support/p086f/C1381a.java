package com.huawei.updatesdk.support.p086f;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.support.p085e.C1379c;
import com.huawei.updatesdk.support.p085e.C1380d;

/* renamed from: com.huawei.updatesdk.support.f.a */
public class C1381a {

    /* renamed from: a */
    public AbstractC1388b f1681a;

    /* renamed from: b */
    public Context f1682b;

    /* renamed from: c */
    public String f1683c;

    /* renamed from: d */
    public CharSequence f1684d;

    /* renamed from: e */
    public AlertDialog f1685e;

    /* renamed from: f */
    public AlertDialog.Builder f1686f;

    /* renamed from: g */
    public DialogInterface.OnShowListener f1687g;

    /* renamed from: h */
    public DialogInterface.OnDismissListener f1688h;

    /* renamed from: com.huawei.updatesdk.support.f.a$a */
    public enum EnumC1386a {
        CONFIRM,
        CANCEL
    }

    /* renamed from: com.huawei.updatesdk.support.f.a$b */
    public interface AbstractC1387b {
        /* renamed from: a */
        void mo16166a();
    }

    public C1381a(Context context, String str, CharSequence charSequence) {
        this.f1682b = context;
        this.f1683c = str;
        this.f1684d = charSequence;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        this.f1686f = builder;
        builder.setTitle(this.f1683c);
        this.f1686f.setPositiveButton(C1380d.m2081b(context, "upsdk_third_app_dl_sure_cancel_download"), (DialogInterface.OnClickListener) null);
        this.f1686f.setNegativeButton(C1380d.m2081b(context, "upsdk_cancel"), (DialogInterface.OnClickListener) null);
        this.f1686f.setMessage(this.f1684d);
    }

    /* renamed from: a */
    public static C1381a m2085a(Context context, String str, CharSequence charSequence) {
        return (!(context instanceof Activity) || !((Activity) context).isFinishing()) ? new C1381a(context, str, charSequence) : new C1389c(context, str, charSequence);
    }

    /* renamed from: a */
    public void mo16210a() {
        AlertDialog.Builder builder = this.f1686f;
        if (builder != null) {
            builder.setNegativeButton((CharSequence) null, (DialogInterface.OnClickListener) null);
        }
    }

    /* renamed from: a */
    public void mo16211a(int i, int i2) {
        if (C1379c.m2071a().mo16208b() >= 11) {
            Button button = null;
            AlertDialog alertDialog = this.f1685e;
            if (alertDialog != null) {
                button = alertDialog.getButton(-1);
            }
            if (button != null) {
                button.setBackgroundResource(i);
                button.setTextColor(this.f1682b.getResources().getColor(i2));
            }
        }
    }

    /* renamed from: a */
    public void mo16212a(DialogInterface.OnDismissListener onDismissListener) {
        this.f1688h = onDismissListener;
    }

    /* renamed from: a */
    public void mo16213a(DialogInterface.OnKeyListener onKeyListener) {
        AlertDialog alertDialog = this.f1685e;
        if (alertDialog != null) {
            alertDialog.setOnKeyListener(onKeyListener);
        }
    }

    /* renamed from: a */
    public void mo16214a(DialogInterface.OnShowListener onShowListener) {
        this.f1687g = onShowListener;
    }

    /* renamed from: a */
    public void mo16215a(View view) {
        ImageView imageView;
        if (this.f1686f != null) {
            int b = C1379c.m2071a().mo16208b();
            if ((b < 11 || b >= 17) && (imageView = (ImageView) view.findViewById(C1380d.m2078a(view.getContext(), "divider"))) != null) {
                imageView.setVisibility(8);
            }
            this.f1686f.setMessage((CharSequence) null);
            this.f1686f.setView(view);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0018 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0019  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16216a(com.huawei.updatesdk.support.p086f.C1381a.EnumC1386a r3, java.lang.String r4) {
        /*
            r2 = this;
            android.app.AlertDialog r0 = r2.f1685e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.huawei.updatesdk.support.f.a$a r1 = com.huawei.updatesdk.support.p086f.C1381a.EnumC1386a.CONFIRM
            if (r3 != r1) goto L_0x000f
            r3 = -1
        L_0x000a:
            android.widget.Button r3 = r0.getButton(r3)
            goto L_0x0016
        L_0x000f:
            com.huawei.updatesdk.support.f.a$a r1 = com.huawei.updatesdk.support.p086f.C1381a.EnumC1386a.CANCEL
            if (r3 != r1) goto L_0x0015
            r3 = -2
            goto L_0x000a
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x0019
            return
        L_0x0019:
            r3.setText(r4)
            r4 = 1
            r3.setAllCaps(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.support.p086f.C1381a.mo16216a(com.huawei.updatesdk.support.f.a$a, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo16217a(AbstractC1387b bVar) {
        Context context = this.f1682b;
        if (context == null || ((Activity) context).isFinishing()) {
            if (bVar != null) {
                bVar.mo16166a();
            }
        } else if (!mo16220b()) {
            try {
                AlertDialog create = this.f1686f.create();
                this.f1685e = create;
                create.setCanceledOnTouchOutside(false);
                this.f1685e.setOnShowListener(new DialogInterface.OnShowListener() {
                    /* class com.huawei.updatesdk.support.p086f.C1381a.DialogInterface$OnShowListenerC13821 */

                    public void onShow(DialogInterface dialogInterface) {
                        AlertDialog alertDialog = (AlertDialog) dialogInterface;
                        alertDialog.getButton(-1).setOnClickListener(new View.OnClickListener() {
                            /* class com.huawei.updatesdk.support.p086f.C1381a.DialogInterface$OnShowListenerC13821.View$OnClickListenerC13831 */

                            public void onClick(View view) {
                                if (C1381a.this.f1681a != null) {
                                    C1381a.this.f1681a.mo16168a();
                                }
                            }
                        });
                        Button button = alertDialog.getButton(-2);
                        if (button != null) {
                            button.setOnClickListener(new View.OnClickListener() {
                                /* class com.huawei.updatesdk.support.p086f.C1381a.DialogInterface$OnShowListenerC13821.View$OnClickListenerC13842 */

                                public void onClick(View view) {
                                    if (C1381a.this.f1681a != null) {
                                        C1381a.this.f1681a.mo16169b();
                                    }
                                }
                            });
                        }
                        if (C1381a.this.f1687g != null) {
                            C1381a.this.f1687g.onShow(dialogInterface);
                        }
                    }
                });
                this.f1685e.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    /* class com.huawei.updatesdk.support.p086f.C1381a.DialogInterface$OnDismissListenerC13852 */

                    public void onDismiss(DialogInterface dialogInterface) {
                        if (C1381a.this.f1688h != null) {
                            C1381a.this.f1688h.onDismiss(dialogInterface);
                        }
                    }
                });
                this.f1685e.show();
            } catch (Exception e) {
                if (bVar != null) {
                    bVar.mo16166a();
                }
                C1278a.m1581a("BaseAlertDialog", "show dlg error, e: ", e);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("show dlg error, mContext = ");
            sb.append(this.f1682b);
            sb.append(", mContext.isFinishing is ");
            Context context2 = this.f1682b;
            sb.append(context2 == null ? "mContext == null" : Boolean.valueOf(((Activity) context2).isFinishing()));
            C1278a.m1584d("BaseAlertDialog", sb.toString());
        }
    }

    /* renamed from: a */
    public void mo16218a(AbstractC1388b bVar) {
        this.f1681a = bVar;
    }

    /* renamed from: a */
    public void mo16219a(boolean z) {
        AlertDialog alertDialog = this.f1685e;
        if (alertDialog != null) {
            alertDialog.setCancelable(z);
        }
    }

    /* renamed from: b */
    public boolean mo16220b() {
        AlertDialog alertDialog = this.f1685e;
        return alertDialog != null && alertDialog.isShowing();
    }

    /* renamed from: c */
    public void mo16221c() {
        try {
            if (this.f1685e != null) {
                this.f1685e.dismiss();
                this.f1685e = null;
            }
        } catch (IllegalArgumentException unused) {
            C1278a.m1580a("BaseAlertDialog", "dialog dismiss IllegalArgumentException");
        }
    }
}
