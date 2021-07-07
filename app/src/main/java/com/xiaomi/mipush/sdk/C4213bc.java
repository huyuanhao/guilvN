package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4246ad;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4285bf;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.EnumC4499ht;
import com.xiaomi.push.service.C4605ah;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.xiaomi.mipush.sdk.bc */
public class C4213bc {
    /* renamed from: a */
    public static void m11531a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        long j = sharedPreferences.getLong("last_sync_info", -1);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long a = (long) C4605ah.m13919a(context).mo42656a(EnumC4499ht.SyncInfoFrequency.mo42043a(), 1209600);
        if (j != -1) {
            if (Math.abs(currentTimeMillis - j) > a) {
                m11533a(context, true);
            } else {
                return;
            }
        }
        sharedPreferences.edit().putLong("last_sync_info", currentTimeMillis).commit();
    }

    /* renamed from: a */
    public static void m11532a(Context context, C4520in inVar) {
        AbstractC4163b.m11301a("need to update local info with: " + inVar.m13318a());
        String str = inVar.m13318a().get(Constants.EXTRA_KEY_ACCEPT_TIME);
        if (str != null) {
            MiPushClient.removeAcceptTime(context);
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (split.length == 2) {
                MiPushClient.addAcceptTime(context, split[0], split[1]);
                if (!"00:00".equals(split[0]) || !"00:00".equals(split[1])) {
                    C4209b.m11491a(context).mo41426a(false);
                } else {
                    C4209b.m11491a(context).mo41426a(true);
                }
            }
        }
        String str2 = inVar.m13318a().get(Constants.EXTRA_KEY_ALIASES);
        if (str2 != null) {
            MiPushClient.removeAllAliases(context);
            if (!"".equals(str2)) {
                for (String str3 : str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    MiPushClient.addAlias(context, str3);
                }
            }
        }
        String str4 = inVar.m13318a().get(Constants.EXTRA_KEY_TOPICS);
        if (str4 != null) {
            MiPushClient.removeAllTopics(context);
            if (!"".equals(str4)) {
                for (String str5 : str4.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    MiPushClient.addTopic(context, str5);
                }
            }
        }
        String str6 = inVar.m13318a().get(Constants.EXTRA_KEY_ACCOUNTS);
        if (str6 != null) {
            MiPushClient.removeAllAccounts(context);
            if (!"".equals(str6)) {
                for (String str7 : str6.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    MiPushClient.addAccount(context, str7);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m11533a(Context context, boolean z) {
        C4251ai.m11641a(context).mo41474a(new RunnableC4214bd(context, z));
    }

    /* renamed from: c */
    public static String m11535c(List<String> list) {
        String a = C4285bf.m11800a(m11536d(list));
        return (TextUtils.isEmpty(a) || a.length() <= 4) ? "" : a.substring(0, 4).toLowerCase();
    }

    /* renamed from: d */
    public static String m11536d(List<String> list) {
        String str = "";
        if (C4246ad.m11632a(list)) {
            return str;
        }
        ArrayList<String> arrayList = new ArrayList(list);
        Collections.sort(arrayList, Collator.getInstance(Locale.CHINA));
        for (String str2 : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                str = str + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
            str = str + str2;
        }
        return str;
    }
}
