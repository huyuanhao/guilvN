package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.C4605ah;

/* renamed from: com.xiaomi.push.du */
public final class C4367du implements AbstractC4371dy {
    /* renamed from: a */
    private void m12126a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            try {
                if (C4249ag.m11635a(context, String.valueOf(12), 1)) {
                    C4502hw hwVar = new C4502hw();
                    hwVar.mo42048a(str + Constants.COLON_SEPARATOR + str2);
                    hwVar.mo42046a(System.currentTimeMillis());
                    hwVar.mo42047a(EnumC4496hq.BroadcastAction);
                    AbstractC4379ef.m12164a(context, hwVar);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12128b(Context context, Intent intent) {
        int a;
        try {
            String dataString = intent.getDataString();
            if (!TextUtils.isEmpty(dataString)) {
                String[] split = dataString.split(Constants.COLON_SEPARATOR);
                if (split.length < 2) {
                    return;
                }
                if (!TextUtils.isEmpty(split[1])) {
                    String str = split[1];
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean a2 = C4605ah.m13919a(context).mo42661a(EnumC4499ht.BroadcastActionCollectionSwitch.mo42043a(), true);
                    if (TextUtils.equals("android.intent.action.PACKAGE_RESTARTED", intent.getAction())) {
                        if (C4249ag.m11635a(context, String.valueOf(12), 1) && a2) {
                            if (TextUtils.isEmpty(C4378ee.f11642a)) {
                                C4378ee.f11642a += C4370dx.f11636a + Constants.COLON_SEPARATOR;
                            }
                            C4378ee.f11642a += str + C3848l.f10401s + currentTimeMillis + C3848l.f10402t + Constants.ACCEPT_TIME_SEPARATOR_SP;
                        }
                    } else if (!TextUtils.equals("android.intent.action.PACKAGE_CHANGED", intent.getAction())) {
                        if (TextUtils.equals("android.intent.action.PACKAGE_ADDED", intent.getAction())) {
                            if (!intent.getExtras().getBoolean("android.intent.extra.REPLACING") && a2) {
                                a = EnumC4496hq.BroadcastActionAdded.mo42007a();
                            } else {
                                return;
                            }
                        } else if (TextUtils.equals("android.intent.action.PACKAGE_REMOVED", intent.getAction())) {
                            if (!intent.getExtras().getBoolean("android.intent.extra.REPLACING") && a2) {
                                a = EnumC4496hq.BroadcastActionRemoved.mo42007a();
                            } else {
                                return;
                            }
                        } else if (TextUtils.equals("android.intent.action.PACKAGE_REPLACED", intent.getAction())) {
                            if (a2) {
                                a = EnumC4496hq.BroadcastActionReplaced.mo42007a();
                            } else {
                                return;
                            }
                        } else if (TextUtils.equals("android.intent.action.PACKAGE_DATA_CLEARED", intent.getAction()) && a2) {
                            a = EnumC4496hq.BroadcastActionDataCleared.mo42007a();
                        } else {
                            return;
                        }
                        m12126a(context, String.valueOf(a), str);
                    } else if (C4249ag.m11635a(context, String.valueOf(12), 1) && a2) {
                        if (TextUtils.isEmpty(C4378ee.f11643b)) {
                            C4378ee.f11643b += C4370dx.f11637b + Constants.COLON_SEPARATOR;
                        }
                        C4378ee.f11643b += str + C3848l.f10401s + currentTimeMillis + C3848l.f10402t + Constants.ACCEPT_TIME_SEPARATOR_SP;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.xiaomi.push.AbstractC4371dy
    /* renamed from: a */
    public void mo41676a(Context context, Intent intent) {
        if (intent != null) {
            C4251ai.m11641a(context).mo41474a(new RunnableC4368dv(this, context, intent));
        }
    }
}
