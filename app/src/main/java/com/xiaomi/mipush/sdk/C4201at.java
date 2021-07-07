package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.AbstractC4532iz;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4285bf;
import com.xiaomi.push.C4298br;
import com.xiaomi.push.C4351dh;
import com.xiaomi.push.C4415fc;
import com.xiaomi.push.C4417fd;
import com.xiaomi.push.C4506i;
import com.xiaomi.push.C4507ia;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4511ie;
import com.xiaomi.push.C4512if;
import com.xiaomi.push.C4516ij;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.C4518il;
import com.xiaomi.push.C4519im;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4522ip;
import com.xiaomi.push.C4524ir;
import com.xiaomi.push.C4526it;
import com.xiaomi.push.C4528iv;
import com.xiaomi.push.C4530ix;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.C4542je;
import com.xiaomi.push.C4570r;
import com.xiaomi.push.EnumC4423fi;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4499ht;
import com.xiaomi.push.EnumC4504hy;
import com.xiaomi.push.EnumC4509ic;
import com.xiaomi.push.service.AbstractC4621aq;
import com.xiaomi.push.service.C4592aa;
import com.xiaomi.push.service.C4605ah;
import com.xiaomi.push.service.C4607ai;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.mipush.sdk.at */
public class C4201at {

    /* renamed from: a */
    public static C4201at f11239a;

    /* renamed from: a */
    public static Object f11240a = new Object();

    /* renamed from: a */
    public static Queue<String> f11241a;

    /* renamed from: a */
    public Context f11242a;

    public C4201at(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f11242a = applicationContext;
        if (applicationContext == null) {
            this.f11242a = context;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x013b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m11419a(android.content.Context r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
        // Method dump skipped, instructions count: 383
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C4201at.m11419a(android.content.Context, java.lang.String, java.util.Map):android.content.Intent");
    }

    /* renamed from: a */
    private PushMessageHandler.AbstractC4180a m11420a(C4517ik ikVar, boolean z, byte[] bArr, String str, int i) {
        String str2;
        int i2;
        String str3;
        String str4;
        C4417fd fdVar;
        MiPushMessage miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        miPushMessage = null;
        ArrayList arrayList3 = null;
        miPushMessage = null;
        try {
            AbstractC4532iz a = C4197ap.m11415a(this.f11242a, ikVar);
            if (a == null) {
                AbstractC4163b.m11306d("receiving an un-recognized message. " + ikVar.f12687a);
                C4417fd.m12519a(this.f11242a).mo41816b(this.f11242a.getPackageName(), C4415fc.m12511a(i), str, "receiving an un-recognized message.");
                return null;
            }
            EnumC4494ho a2 = ikVar.mo42273a();
            AbstractC4163b.m11301a("processing a message, action=" + a2);
            switch (C4203av.f11246a[a2.ordinal()]) {
                case 1:
                    if (!C4209b.m11491a(this.f11242a).m11513d() || z) {
                        C4524ir irVar = (C4524ir) a;
                        C4507ia a3 = irVar.mo42435a();
                        if (a3 != null) {
                            if (z) {
                                if (C4592aa.m13887a(ikVar)) {
                                    MiPushClient.reportIgnoreRegMessageClicked(this.f11242a, a3.m13061a(), ikVar.m13270a(), ikVar.f12694b, a3.mo42089b());
                                } else {
                                    MiPushClient.reportMessageClicked(this.f11242a, a3.m13061a(), ikVar.m13270a(), a3.mo42089b());
                                }
                            }
                            if (!z) {
                                if (!TextUtils.isEmpty(irVar.mo42440d()) && MiPushClient.aliasSetTime(this.f11242a, irVar.mo42440d()) < 0) {
                                    MiPushClient.addAlias(this.f11242a, irVar.mo42440d());
                                } else if (!TextUtils.isEmpty(irVar.mo42438c()) && MiPushClient.topicSubscribedTime(this.f11242a, irVar.mo42438c()) < 0) {
                                    MiPushClient.addTopic(this.f11242a, irVar.mo42438c());
                                }
                            }
                            C4508ib ibVar = ikVar.f12688a;
                            String str5 = (ibVar == null || ibVar.m13098a() == null) ? null : ikVar.f12688a.f12532a.get("jobkey");
                            if (TextUtils.isEmpty(str5)) {
                                str5 = a3.m13061a();
                            }
                            if (z || !m11432a(this.f11242a, str5)) {
                                MiPushMessage generateMessage = PushMessageHelper.generateMessage(irVar, ikVar.m13270a(), z);
                                if (generateMessage.getPassThrough() != 0 || z || !C4592aa.m13889a(generateMessage.getExtra())) {
                                    AbstractC4163b.m11301a("receive a message, msgid=" + a3.m13061a() + ", jobkey=" + str5);
                                    if (!z || generateMessage.getExtra() == null || !generateMessage.getExtra().containsKey("notify_effect")) {
                                        miPushMessage = generateMessage;
                                    } else {
                                        Map<String, String> extra = generateMessage.getExtra();
                                        String str6 = extra.get("notify_effect");
                                        if (C4592aa.m13887a(ikVar)) {
                                            Intent a4 = m11419a(this.f11242a, ikVar.f12694b, extra);
                                            a4.putExtra("eventMessageType", i);
                                            a4.putExtra(MiPushMessage.KEY_MESSAGE_ID, str);
                                            if (a4 == null) {
                                                AbstractC4163b.m11301a("Getting Intent fail from ignore reg message. ");
                                                C4417fd.m12519a(this.f11242a).mo41816b(this.f11242a.getPackageName(), C4415fc.m12511a(i), str, "Getting Intent fail from ignore reg message.");
                                                return null;
                                            }
                                            String c = a3.mo42091c();
                                            if (!TextUtils.isEmpty(c)) {
                                                a4.putExtra("payload", c);
                                            }
                                            this.f11242a.startActivity(a4);
                                            C4417fd a5 = C4417fd.m12519a(this.f11242a);
                                            String packageName = this.f11242a.getPackageName();
                                            String a6 = C4415fc.m12511a(i);
                                            a5.mo41813a(packageName, a6, str, AuthApiStatusCodes.AUTH_APP_CERT_ERROR, "business message is clicked typeId " + str6);
                                        } else {
                                            Context context = this.f11242a;
                                            Intent a7 = m11419a(context, context.getPackageName(), extra);
                                            if (a7 != null) {
                                                if (!str6.equals(AbstractC4621aq.f13224c)) {
                                                    a7.putExtra(PushMessageHelper.KEY_MESSAGE, generateMessage);
                                                    a7.putExtra("eventMessageType", i);
                                                    a7.putExtra(MiPushMessage.KEY_MESSAGE_ID, str);
                                                }
                                                this.f11242a.startActivity(a7);
                                                AbstractC4163b.m11301a("start activity succ");
                                                C4417fd a8 = C4417fd.m12519a(this.f11242a);
                                                String packageName2 = this.f11242a.getPackageName();
                                                String a9 = C4415fc.m12511a(i);
                                                a8.mo41813a(packageName2, a9, str, 1006, "notification message is clicked typeId " + str6);
                                                if (str6.equals(AbstractC4621aq.f13224c)) {
                                                    C4417fd a10 = C4417fd.m12519a(this.f11242a);
                                                    String packageName3 = this.f11242a.getPackageName();
                                                    String a11 = C4415fc.m12511a(i);
                                                    a10.mo41814a(packageName3, a11, str, "try open web page typeId " + str6);
                                                }
                                            }
                                        }
                                        return null;
                                    }
                                } else {
                                    C4592aa.m13872a(this.f11242a, ikVar, bArr);
                                    return null;
                                }
                            } else {
                                AbstractC4163b.m11301a("drop a duplicate message, key=" + str5);
                                C4417fd a12 = C4417fd.m12519a(this.f11242a);
                                String packageName4 = this.f11242a.getPackageName();
                                String a13 = C4415fc.m12511a(i);
                                a12.mo41817c(packageName4, a13, str, "drop a duplicate message, key=" + str5);
                            }
                            if (ikVar.m13270a() == null && !z) {
                                m11430a(irVar, ikVar);
                                break;
                            }
                        } else {
                            AbstractC4163b.m11306d("receive an empty message without push content, drop it");
                            C4417fd.m12519a(this.f11242a).mo41816b(this.f11242a.getPackageName(), C4415fc.m12511a(i), str, "receive an empty message without push content, drop it");
                            return null;
                        }
                    } else {
                        AbstractC4163b.m11301a("receive a message in pause state. drop it");
                        C4417fd.m12519a(this.f11242a).mo41814a(this.f11242a.getPackageName(), C4415fc.m12511a(i), str, "receive a message in pause state. drop it");
                        return null;
                    }
                    break;
                case 2:
                    C4522ip ipVar = (C4522ip) a;
                    String str7 = C4209b.m11491a(this.f11242a).f11268a;
                    if (TextUtils.isEmpty(str7) || !TextUtils.equals(str7, ipVar.m13409a())) {
                        AbstractC4163b.m11301a("bad Registration result:");
                        C4417fd.m12519a(this.f11242a).mo41816b(this.f11242a.getPackageName(), C4415fc.m12511a(i), str, "bad Registration result:");
                        return null;
                    }
                    C4209b.m11491a(this.f11242a).f11268a = null;
                    int i3 = (ipVar.f12812a > 0 ? 1 : (ipVar.f12812a == 0 ? 0 : -1));
                    Context context2 = this.f11242a;
                    if (i3 == 0) {
                        C4209b.m11491a(context2).mo41430b(ipVar.f12822e, ipVar.f12823f, ipVar.f12829l);
                        fdVar = C4417fd.m12519a(this.f11242a);
                        str4 = this.f11242a.getPackageName();
                        str3 = C4415fc.m12511a(i);
                        i2 = 6006;
                        str2 = "receive register result success";
                    } else {
                        fdVar = C4417fd.m12519a(context2);
                        str4 = this.f11242a.getPackageName();
                        str3 = C4415fc.m12511a(i);
                        i2 = 6006;
                        str2 = "receive register result fail";
                    }
                    fdVar.mo41813a(str4, str3, str, i2, str2);
                    if (!TextUtils.isEmpty(ipVar.f12822e)) {
                        arrayList3 = new ArrayList();
                        arrayList3.add(ipVar.f12822e);
                    }
                    MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(EnumC4423fi.COMMAND_REGISTER.f11840a, arrayList3, ipVar.f12812a, ipVar.f12821d, null);
                    C4204aw.m11444a(this.f11242a).m11488d();
                    return generateCommandMessage;
                case 3:
                    if (((C4528iv) a).f12945a == 0) {
                        C4209b.m11491a(this.f11242a).m11496a();
                        MiPushClient.clearExtras(this.f11242a);
                    }
                    PushMessageHandler.mo41277a();
                    break;
                case 4:
                    C4526it itVar = (C4526it) a;
                    if (itVar.f12899a == 0) {
                        MiPushClient.addTopic(this.f11242a, itVar.mo42471a());
                    }
                    if (!TextUtils.isEmpty(itVar.mo42471a())) {
                        arrayList2 = new ArrayList();
                        arrayList2.add(itVar.mo42471a());
                    }
                    return PushMessageHelper.generateCommandMessage(EnumC4423fi.COMMAND_SUBSCRIBE_TOPIC.f11840a, arrayList2, itVar.f12899a, itVar.f12905d, itVar.mo42473b());
                case 5:
                    C4530ix ixVar = (C4530ix) a;
                    if (ixVar.f12982a == 0) {
                        MiPushClient.removeTopic(this.f11242a, ixVar.mo42545a());
                    }
                    if (!TextUtils.isEmpty(ixVar.mo42545a())) {
                        arrayList = new ArrayList();
                        arrayList.add(ixVar.mo42545a());
                    }
                    return PushMessageHelper.generateCommandMessage(EnumC4423fi.COMMAND_UNSUBSCRIBE_TOPIC.f11840a, arrayList, ixVar.f12982a, ixVar.f12988d, ixVar.mo42547b());
                case 6:
                    C4351dh.m12081a(this.f11242a.getPackageName(), this.f11242a, a, EnumC4494ho.Command, bArr.length);
                    C4516ij ijVar = (C4516ij) a;
                    String a14 = ijVar.mo42256a();
                    List<String> a15 = ijVar.m13250a();
                    if (ijVar.f12667a == 0) {
                        if (TextUtils.equals(a14, EnumC4423fi.COMMAND_SET_ACCEPT_TIME.f11840a) && a15 != null && a15.size() > 1) {
                            MiPushClient.addAcceptTime(this.f11242a, a15.get(0), a15.get(1));
                            if (!"00:00".equals(a15.get(0)) || !"00:00".equals(a15.get(1))) {
                                C4209b.m11491a(this.f11242a).mo41426a(false);
                            } else {
                                C4209b.m11491a(this.f11242a).mo41426a(true);
                            }
                            a15 = mo41393a(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), a15);
                        } else if (TextUtils.equals(a14, EnumC4423fi.COMMAND_SET_ALIAS.f11840a) && a15 != null && a15.size() > 0) {
                            MiPushClient.addAlias(this.f11242a, a15.get(0));
                        } else if (TextUtils.equals(a14, EnumC4423fi.COMMAND_UNSET_ALIAS.f11840a) && a15 != null && a15.size() > 0) {
                            MiPushClient.removeAlias(this.f11242a, a15.get(0));
                        } else if (TextUtils.equals(a14, EnumC4423fi.COMMAND_SET_ACCOUNT.f11840a) && a15 != null && a15.size() > 0) {
                            MiPushClient.addAccount(this.f11242a, a15.get(0));
                        } else if (TextUtils.equals(a14, EnumC4423fi.COMMAND_UNSET_ACCOUNT.f11840a) && a15 != null && a15.size() > 0) {
                            MiPushClient.removeAccount(this.f11242a, a15.get(0));
                        } else if (TextUtils.equals(a14, EnumC4423fi.COMMAND_CHK_VDEVID.f11840a)) {
                            if (a15 != null && a15.size() > 0) {
                                C4506i.m13035a(this.f11242a, a15.get(0));
                            }
                            return null;
                        }
                    }
                    return PushMessageHelper.generateCommandMessage(a14, a15, ijVar.f12667a, ijVar.f12675d, ijVar.mo42258b());
                case 7:
                    C4351dh.m12081a(this.f11242a.getPackageName(), this.f11242a, a, EnumC4494ho.Notification, bArr.length);
                    if (!(a instanceof C4512if)) {
                        if (a instanceof C4520in) {
                            C4520in inVar = (C4520in) a;
                            if (!"registration id expired".equalsIgnoreCase(inVar.f12728d)) {
                                if ("client_info_update_ok".equalsIgnoreCase(inVar.f12728d)) {
                                    if (inVar.m13318a() != null && inVar.m13318a().containsKey("app_version")) {
                                        C4209b.m11491a(this.f11242a).m11498a(inVar.m13318a().get("app_version"));
                                        break;
                                    }
                                } else if (EnumC4504hy.AwakeApp.f12451a.equalsIgnoreCase(inVar.f12728d)) {
                                    if (ikVar.m13289b() && inVar.m13318a() != null && inVar.m13318a().containsKey("awake_info")) {
                                        Context context3 = this.f11242a;
                                        C4227n.m11584a(context3, C4209b.m11491a(context3).m11495a(), C4605ah.m13919a(this.f11242a).mo42656a(EnumC4499ht.AwakeInfoUploadWaySwitch.mo42043a(), 0), inVar.m13318a().get("awake_info"));
                                        break;
                                    }
                                } else if (!EnumC4504hy.NormalClientConfigUpdate.f12451a.equalsIgnoreCase(inVar.f12728d)) {
                                    if (!EnumC4504hy.CustomClientConfigUpdate.f12451a.equalsIgnoreCase(inVar.f12728d)) {
                                        if (!EnumC4504hy.SyncInfoResult.f12451a.equalsIgnoreCase(inVar.f12728d)) {
                                            if (!EnumC4504hy.ForceSync.f12451a.equalsIgnoreCase(inVar.f12728d)) {
                                                if (EnumC4504hy.CancelPushMessage.f12451a.equals(inVar.f12728d)) {
                                                    if (inVar.m13318a() != null) {
                                                        int i4 = -2;
                                                        if (inVar.m13318a().containsKey(AbstractC4621aq.f13221J)) {
                                                            String str8 = inVar.m13318a().get(AbstractC4621aq.f13221J);
                                                            if (!TextUtils.isEmpty(str8)) {
                                                                try {
                                                                    i4 = Integer.parseInt(str8);
                                                                } catch (NumberFormatException e) {
                                                                    e.printStackTrace();
                                                                }
                                                            }
                                                        }
                                                        if (i4 >= -1) {
                                                            MiPushClient.clearNotification(this.f11242a, i4);
                                                            break;
                                                        } else {
                                                            MiPushClient.clearNotification(this.f11242a, inVar.m13318a().containsKey(AbstractC4621aq.f13219H) ? inVar.m13318a().get(AbstractC4621aq.f13219H) : "", inVar.m13318a().containsKey(AbstractC4621aq.f13220I) ? inVar.m13318a().get(AbstractC4621aq.f13220I) : "");
                                                            break;
                                                        }
                                                    }
                                                } else if (!EnumC4504hy.HybridRegisterResult.f12451a.equals(inVar.f12728d)) {
                                                    if (!EnumC4504hy.HybridUnregisterResult.f12451a.equals(inVar.f12728d)) {
                                                        if (EnumC4504hy.PushLogUpload.f12451a.equals(inVar.f12728d) && inVar.m13318a() != null && inVar.m13318a().containsKey("packages")) {
                                                            String[] split = inVar.m13318a().get("packages").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                                            if (TextUtils.equals(this.f11242a.getPackageName(), MiPushRegistar.PACKAGE_XIAOMI)) {
                                                                Logger.uploadLogFile(this.f11242a, true);
                                                                m11426a(this.f11242a, split);
                                                                break;
                                                            } else {
                                                                Logger.uploadLogFile(this.f11242a, false);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        C4528iv ivVar = new C4528iv();
                                                        C4531iy.m13589a(ivVar, inVar.m13325a());
                                                        MiPushClient4Hybrid.onReceiveUnregisterResult(this.f11242a, ivVar);
                                                        break;
                                                    }
                                                } else {
                                                    C4522ip ipVar2 = new C4522ip();
                                                    C4531iy.m13589a(ipVar2, inVar.m13325a());
                                                    MiPushClient4Hybrid.onReceiveRegisterResult(this.f11242a, ipVar2);
                                                    break;
                                                }
                                            } else {
                                                AbstractC4163b.m11301a("receive force sync notification");
                                                C4213bc.m11533a(this.f11242a, false);
                                                break;
                                            }
                                        } else {
                                            C4213bc.m11532a(this.f11242a, inVar);
                                            break;
                                        }
                                    } else {
                                        C4518il ilVar = new C4518il();
                                        C4531iy.m13589a(ilVar, inVar.m13325a());
                                        C4607ai.m13936a(C4605ah.m13919a(this.f11242a), ilVar);
                                        break;
                                    }
                                } else {
                                    C4519im imVar = new C4519im();
                                    try {
                                        C4531iy.m13589a(imVar, inVar.m13325a());
                                        C4607ai.m13937a(C4605ah.m13919a(this.f11242a), imVar);
                                        break;
                                    } catch (C4542je e2) {
                                        AbstractC4163b.m11303a(e2);
                                        break;
                                    }
                                }
                            } else {
                                List<String> allAlias = MiPushClient.getAllAlias(this.f11242a);
                                List<String> allTopic = MiPushClient.getAllTopic(this.f11242a);
                                List<String> allUserAccount = MiPushClient.getAllUserAccount(this.f11242a);
                                String acceptTime = MiPushClient.getAcceptTime(this.f11242a);
                                MiPushClient.reInitialize(this.f11242a, EnumC4509ic.RegIdExpired);
                                for (String str9 : allAlias) {
                                    MiPushClient.removeAlias(this.f11242a, str9);
                                    MiPushClient.setAlias(this.f11242a, str9, null);
                                }
                                for (String str10 : allTopic) {
                                    MiPushClient.removeTopic(this.f11242a, str10);
                                    MiPushClient.subscribe(this.f11242a, str10, null);
                                }
                                for (String str11 : allUserAccount) {
                                    MiPushClient.removeAccount(this.f11242a, str11);
                                    MiPushClient.setUserAccount(this.f11242a, str11, null);
                                }
                                String[] split2 = acceptTime.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                if (split2.length == 2) {
                                    MiPushClient.removeAcceptTime(this.f11242a);
                                    MiPushClient.addAcceptTime(this.f11242a, split2[0], split2[1]);
                                    break;
                                }
                            }
                        }
                    } else {
                        C4512if ifVar = (C4512if) a;
                        String a16 = ifVar.mo42198a();
                        if (EnumC4504hy.DisablePushMessage.f12451a.equalsIgnoreCase(ifVar.f12621d)) {
                            if (ifVar.f12614a != 0) {
                                if ("syncing".equals(C4194am.m11405a(this.f11242a).mo41387a(EnumC4212bb.DISABLE_PUSH))) {
                                    synchronized (C4194am.class) {
                                        if (C4194am.m11405a(this.f11242a).m11410a(a16)) {
                                            if (C4194am.m11405a(this.f11242a).mo41386a(a16) < 10) {
                                                C4194am.m11405a(this.f11242a).mo41389b(a16);
                                                C4204aw.m11444a(this.f11242a).mo41411a(true, a16);
                                            } else {
                                                C4194am.m11405a(this.f11242a).mo41390c(a16);
                                            }
                                        }
                                    }
                                    break;
                                }
                            } else {
                                synchronized (C4194am.class) {
                                    if (C4194am.m11405a(this.f11242a).m11410a(a16)) {
                                        C4194am.m11405a(this.f11242a).mo41390c(a16);
                                        if ("syncing".equals(C4194am.m11405a(this.f11242a).mo41387a(EnumC4212bb.DISABLE_PUSH))) {
                                            C4194am.m11405a(this.f11242a).mo41388a(EnumC4212bb.DISABLE_PUSH, "synced");
                                            MiPushClient.clearNotification(this.f11242a);
                                            MiPushClient.clearLocalNotificationType(this.f11242a);
                                            PushMessageHandler.mo41277a();
                                            C4204aw.m11444a(this.f11242a).m11484b();
                                        }
                                    }
                                }
                                break;
                            }
                        } else if (EnumC4504hy.EnablePushMessage.f12451a.equalsIgnoreCase(ifVar.f12621d)) {
                            if (ifVar.f12614a != 0) {
                                if ("syncing".equals(C4194am.m11405a(this.f11242a).mo41387a(EnumC4212bb.ENABLE_PUSH))) {
                                    synchronized (C4194am.class) {
                                        if (C4194am.m11405a(this.f11242a).m11410a(a16)) {
                                            if (C4194am.m11405a(this.f11242a).mo41386a(a16) < 10) {
                                                C4194am.m11405a(this.f11242a).mo41389b(a16);
                                                C4204aw.m11444a(this.f11242a).mo41411a(false, a16);
                                            } else {
                                                C4194am.m11405a(this.f11242a).mo41390c(a16);
                                            }
                                        }
                                    }
                                    break;
                                }
                            } else {
                                synchronized (C4194am.class) {
                                    if (C4194am.m11405a(this.f11242a).m11410a(a16)) {
                                        C4194am.m11405a(this.f11242a).mo41390c(a16);
                                        if ("syncing".equals(C4194am.m11405a(this.f11242a).mo41387a(EnumC4212bb.ENABLE_PUSH))) {
                                            C4194am.m11405a(this.f11242a).mo41388a(EnumC4212bb.ENABLE_PUSH, "synced");
                                        }
                                    }
                                }
                                break;
                            }
                        } else if (!EnumC4504hy.ThirdPartyRegUpdate.f12451a.equalsIgnoreCase(ifVar.f12621d)) {
                            if (EnumC4504hy.UploadTinyData.f12451a.equalsIgnoreCase(ifVar.f12621d)) {
                                m11428a(ifVar);
                                break;
                            }
                        } else {
                            m11434b(ifVar);
                            break;
                        }
                        C4194am.m11405a(this.f11242a).mo41390c(a16);
                        break;
                    }
                    break;
            }
            return miPushMessage;
        } catch (C4233t e3) {
            AbstractC4163b.m11303a(e3);
            m11429a(ikVar);
            C4417fd.m12519a(this.f11242a).mo41815a(this.f11242a.getPackageName(), C4415fc.m12511a(i), str, e3);
            return null;
        } catch (C4542je e4) {
            AbstractC4163b.m11303a(e4);
            AbstractC4163b.m11306d("receive a message which action string is not valid. is the reg expired?");
            C4417fd.m12519a(this.f11242a).mo41815a(this.f11242a.getPackageName(), C4415fc.m12511a(i), str, e4);
            return null;
        }
    }

    /* renamed from: a */
    private PushMessageHandler.AbstractC4180a m11421a(C4517ik ikVar, byte[] bArr) {
        String str;
        String str2 = null;
        try {
            AbstractC4532iz a = C4197ap.m11415a(this.f11242a, ikVar);
            if (a == null) {
                AbstractC4163b.m11306d("message arrived: receiving an un-recognized message. " + ikVar.f12687a);
                return null;
            }
            EnumC4494ho a2 = ikVar.mo42273a();
            AbstractC4163b.m11301a("message arrived: processing an arrived message, action=" + a2);
            if (C4203av.f11246a[a2.ordinal()] != 1) {
                return null;
            }
            C4524ir irVar = (C4524ir) a;
            C4507ia a3 = irVar.mo42435a();
            if (a3 == null) {
                str = "message arrived: receive an empty message without push content, drop it";
                AbstractC4163b.m11306d(str);
                return null;
            }
            C4508ib ibVar = ikVar.f12688a;
            if (!(ibVar == null || ibVar.m13098a() == null)) {
                str2 = ikVar.f12688a.f12532a.get("jobkey");
            }
            MiPushMessage generateMessage = PushMessageHelper.generateMessage(irVar, ikVar.m13270a(), false);
            generateMessage.setArrivedMessage(true);
            AbstractC4163b.m11301a("message arrived: receive a message, msgid=" + a3.m13061a() + ", jobkey=" + str2);
            return generateMessage;
        } catch (C4233t e) {
            AbstractC4163b.m11303a(e);
            str = "message arrived: receive a message but decrypt failed. report when click.";
        } catch (C4542je e2) {
            AbstractC4163b.m11303a(e2);
            str = "message arrived: receive a message which action string is not valid. is the reg expired?";
        }
    }

    /* renamed from: a */
    public static C4201at m11422a(Context context) {
        if (f11239a == null) {
            f11239a = new C4201at(context);
        }
        return f11239a;
    }

    /* renamed from: a */
    private void m11423a() {
        SharedPreferences sharedPreferences = this.f11242a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - sharedPreferences.getLong(Constants.SP_KEY_LAST_REINITIALIZE, 0)) > 1800000) {
            MiPushClient.reInitialize(this.f11242a, EnumC4509ic.PackageUnregistered);
            sharedPreferences.edit().putLong(Constants.SP_KEY_LAST_REINITIALIZE, currentTimeMillis).commit();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11424a(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.exported && serviceInfo.enabled && "com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) && !context.getPackageName().equals(serviceInfo.packageName)) {
                    try {
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.SYNC_LOG");
                        PushMessageHandler.m11386a(context, intent);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m11425a(Context context, String str) {
        synchronized (f11240a) {
            f11241a.remove(str);
            C4209b.m11491a(context);
            SharedPreferences a = C4209b.m11490a(context);
            String a2 = C4285bf.m11802a(f11241a, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor edit = a.edit();
            edit.putString("pref_msg_ids", a2);
            C4570r.m13744a(edit);
        }
    }

    /* renamed from: a */
    private void m11426a(Context context, String[] strArr) {
        C4251ai.m11641a(context).mo41474a(new RunnableC4202au(this, strArr, context));
    }

    /* renamed from: a */
    private void m11428a(C4512if ifVar) {
        String a = ifVar.mo42198a();
        AbstractC4163b.m11304b("receive ack " + a);
        Map<String, String> a2 = ifVar.m13188a();
        if (a2 != null) {
            String str = a2.get("real_source");
            if (!TextUtils.isEmpty(str)) {
                AbstractC4163b.m11304b("receive ack : messageId = " + a + "  realSource = " + str);
                C4298br.m11843a(this.f11242a).mo41537a(a, str, Boolean.valueOf(ifVar.f12614a == 0));
            }
        }
    }

    /* renamed from: a */
    private void m11429a(C4517ik ikVar) {
        AbstractC4163b.m11301a("receive a message but decrypt failed. report now.");
        C4520in inVar = new C4520in(ikVar.m13270a().f12530a, false);
        inVar.mo42317c(EnumC4504hy.DecryptMessageFail.f12451a);
        inVar.mo42314b(ikVar.m13277a());
        inVar.mo42321d(ikVar.f12694b);
        HashMap hashMap = new HashMap();
        inVar.f12723a = hashMap;
        hashMap.put("regid", MiPushClient.getRegId(this.f11242a));
        C4204aw.m11444a(this.f11242a).mo41404a((AbstractC4532iz) inVar, EnumC4494ho.Notification, false, (C4508ib) null);
    }

    /* renamed from: a */
    private void m11430a(C4524ir irVar, C4517ik ikVar) {
        C4508ib a = ikVar.m13270a();
        C4511ie ieVar = new C4511ie();
        ieVar.mo42167b(irVar.mo42437b());
        ieVar.mo42163a(irVar.m13453a());
        ieVar.mo42162a(irVar.mo42435a().mo42087a());
        if (!TextUtils.isEmpty(irVar.mo42438c())) {
            ieVar.mo42170c(irVar.mo42438c());
        }
        if (!TextUtils.isEmpty(irVar.mo42440d())) {
            ieVar.mo42174d(irVar.mo42440d());
        }
        ieVar.mo42164a(C4531iy.m13588a(this.f11242a, ikVar));
        C4204aw.m11444a(this.f11242a).mo41402a(ieVar, EnumC4494ho.AckMessage, a);
    }

    /* renamed from: a */
    private void m11431a(String str, long j, EnumC4216d dVar) {
        EnumC4212bb a = C4223k.m11571a(dVar);
        if (a != null) {
            if (j == 0) {
                synchronized (C4194am.class) {
                    if (C4194am.m11405a(this.f11242a).m11410a(str)) {
                        C4194am.m11405a(this.f11242a).mo41390c(str);
                        if ("syncing".equals(C4194am.m11405a(this.f11242a).mo41387a(a))) {
                            C4194am.m11405a(this.f11242a).mo41388a(a, "synced");
                        }
                    }
                }
            } else if ("syncing".equals(C4194am.m11405a(this.f11242a).mo41387a(a))) {
                synchronized (C4194am.class) {
                    if (C4194am.m11405a(this.f11242a).m11410a(str)) {
                        if (C4194am.m11405a(this.f11242a).mo41386a(str) < 10) {
                            C4194am.m11405a(this.f11242a).mo41389b(str);
                            C4204aw.m11444a(this.f11242a).mo41408a(str, a, dVar);
                        } else {
                            C4194am.m11405a(this.f11242a).mo41390c(str);
                        }
                    }
                }
            } else {
                C4194am.m11405a(this.f11242a).mo41390c(str);
            }
        }
    }

    /* renamed from: a */
    public static boolean m11432a(Context context, String str) {
        synchronized (f11240a) {
            C4209b.m11491a(context);
            SharedPreferences a = C4209b.m11490a(context);
            if (f11241a == null) {
                String[] split = a.getString("pref_msg_ids", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                f11241a = new LinkedList();
                for (String str2 : split) {
                    f11241a.add(str2);
                }
            }
            if (f11241a.contains(str)) {
                return true;
            }
            f11241a.add(str);
            if (f11241a.size() > 25) {
                f11241a.poll();
            }
            String a2 = C4285bf.m11802a(f11241a, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor edit = a.edit();
            edit.putString("pref_msg_ids", a2);
            C4570r.m13744a(edit);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m11433a(C4517ik ikVar) {
        if (!TextUtils.equals(Constants.HYBRID_PACKAGE_NAME, ikVar.mo42282b()) && !TextUtils.equals(Constants.HYBRID_DEBUG_PACKAGE_NAME, ikVar.mo42282b())) {
            return false;
        }
        Map<String, String> a = ikVar.m13270a() == null ? null : ikVar.m13270a().m13098a();
        if (a == null) {
            return false;
        }
        String str = a.get(Constants.EXTRA_KEY_PUSH_SERVER_ACTION);
        return TextUtils.equals(str, Constants.EXTRA_VALUE_HYBRID_MESSAGE) || TextUtils.equals(str, Constants.EXTRA_VALUE_PLATFORM_MESSAGE);
    }

    /* renamed from: b */
    private void m11434b(C4512if ifVar) {
        long j;
        EnumC4216d dVar;
        AbstractC4163b.m11305c("ASSEMBLE_PUSH : " + ifVar.toString());
        String a = ifVar.mo42198a();
        Map<String, String> a2 = ifVar.m13188a();
        if (a2 != null) {
            String str = a2.get(Constants.ASSEMBLE_PUSH_REG_INFO);
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("brand:" + EnumC4195an.FCM.name())) {
                    AbstractC4163b.m11301a("ASSEMBLE_PUSH : receive fcm token sync ack");
                    C4220h.m11567b(this.f11242a, EnumC4216d.ASSEMBLE_PUSH_FCM, str);
                    j = ifVar.f12614a;
                    dVar = EnumC4216d.ASSEMBLE_PUSH_FCM;
                } else {
                    if (str.contains("brand:" + EnumC4195an.HUAWEI.name())) {
                        AbstractC4163b.m11301a("ASSEMBLE_PUSH : receive hw token sync ack");
                        C4220h.m11567b(this.f11242a, EnumC4216d.ASSEMBLE_PUSH_HUAWEI, str);
                        j = ifVar.f12614a;
                        dVar = EnumC4216d.ASSEMBLE_PUSH_HUAWEI;
                    } else {
                        if (str.contains("brand:" + EnumC4195an.f11233d.name())) {
                            AbstractC4163b.m11301a("ASSEMBLE_PUSH : receive COS token sync ack");
                            C4220h.m11567b(this.f11242a, EnumC4216d.ASSEMBLE_PUSH_COS, str);
                            j = ifVar.f12614a;
                            dVar = EnumC4216d.ASSEMBLE_PUSH_COS;
                        } else {
                            if (str.contains("brand:" + EnumC4195an.f11234e.name())) {
                                AbstractC4163b.m11301a("ASSEMBLE_PUSH : receive FTOS token sync ack");
                                C4220h.m11567b(this.f11242a, EnumC4216d.ASSEMBLE_PUSH_FTOS, str);
                                j = ifVar.f12614a;
                                dVar = EnumC4216d.ASSEMBLE_PUSH_FTOS;
                            } else {
                                return;
                            }
                        }
                    }
                }
                m11431a(a, j, dVar);
            }
        }
    }

    /* renamed from: b */
    private void m11435b(C4517ik ikVar) {
        C4508ib a = ikVar.m13270a();
        C4511ie ieVar = new C4511ie();
        ieVar.mo42167b(ikVar.m13277a());
        ieVar.mo42163a(a.m13097a());
        ieVar.mo42162a(a.m13092a());
        if (!TextUtils.isEmpty(a.m13108b())) {
            ieVar.mo42170c(a.m13108b());
        }
        ieVar.mo42164a(C4531iy.m13588a(this.f11242a, ikVar));
        C4204aw.m11444a(this.f11242a).mo41404a((AbstractC4532iz) ieVar, EnumC4494ho.AckMessage, false, ikVar.m13270a());
    }

    /* renamed from: a */
    public PushMessageHandler.AbstractC4180a mo41392a(Intent intent) {
        Throwable e;
        String str;
        String action = intent.getAction();
        AbstractC4163b.m11301a("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent.getStringExtra(MiPushMessage.KEY_MESSAGE_ID);
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                AbstractC4163b.m11306d("receiving an empty message, drop");
                C4417fd.m12519a(this.f11242a).mo41810a(this.f11242a.getPackageName(), intent, "receiving an empty message, drop");
                return null;
            }
            C4517ik ikVar = new C4517ik();
            try {
                C4531iy.m13589a(ikVar, byteArrayExtra);
                C4209b a = C4209b.m11491a(this.f11242a);
                C4508ib a2 = ikVar.m13270a();
                if (ikVar.mo42273a() == EnumC4494ho.SendMessage && a2 != null && !a.m11513d() && !booleanExtra) {
                    a2.mo42118a("mrt", stringExtra);
                    a2.mo42118a("mat", Long.toString(System.currentTimeMillis()));
                    if (!m11433a(ikVar)) {
                        m11435b(ikVar);
                    } else {
                        AbstractC4163b.m11304b("this is a mina's message, ack later");
                        a2.mo42118a(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS, String.valueOf(a2.m13092a()));
                        a2.mo42118a(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS, String.valueOf((int) C4531iy.m13588a(this.f11242a, ikVar)));
                    }
                }
                if (ikVar.mo42273a() == EnumC4494ho.SendMessage && !ikVar.m13289b()) {
                    String str2 = "";
                    if (!C4592aa.m13887a(ikVar)) {
                        Object[] objArr = new Object[2];
                        objArr[0] = ikVar.mo42282b();
                        objArr[1] = a2 != null ? a2.m13097a() : str2;
                        AbstractC4163b.m11301a(String.format("drop an un-encrypted messages. %1$s, %2$s", objArr));
                        C4417fd a3 = C4417fd.m12519a(this.f11242a);
                        String packageName = this.f11242a.getPackageName();
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = ikVar.mo42282b();
                        if (a2 != null) {
                            str2 = a2.m13097a();
                        }
                        objArr2[1] = str2;
                        a3.mo41810a(packageName, intent, String.format("drop an un-encrypted messages. %1$s, %2$s", objArr2));
                        return null;
                    } else if (!booleanExtra || a2.m13098a() == null || !a2.m13098a().containsKey("notify_effect")) {
                        AbstractC4163b.m11301a(String.format("drop an un-encrypted messages. %1$s, %2$s", ikVar.mo42282b(), a2.m13097a()));
                        C4417fd a4 = C4417fd.m12519a(this.f11242a);
                        String packageName2 = this.f11242a.getPackageName();
                        Object[] objArr3 = new Object[2];
                        objArr3[0] = ikVar.mo42282b();
                        if (a2 != null) {
                            str2 = a2.m13097a();
                        }
                        objArr3[1] = str2;
                        a4.mo41810a(packageName2, intent, String.format("drop an un-encrypted messages. %1$s, %2$s", objArr3));
                        return null;
                    }
                }
                if (a.m11511c() || ikVar.f12687a == EnumC4494ho.Registration) {
                    if (!a.m11511c() || !a.m11515e()) {
                        return m11420a(ikVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra);
                    }
                    if (ikVar.f12687a == EnumC4494ho.UnRegistration) {
                        a.m11496a();
                        MiPushClient.clearExtras(this.f11242a);
                        PushMessageHandler.mo41277a();
                        return null;
                    }
                    MiPushClient.unregisterPush(this.f11242a);
                    return null;
                } else if (C4592aa.m13887a(ikVar)) {
                    return m11420a(ikVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra);
                } else {
                    AbstractC4163b.m11306d("receive message without registration. need re-register!");
                    C4417fd.m12519a(this.f11242a).mo41810a(this.f11242a.getPackageName(), intent, "receive message without registration. need re-register!");
                    m11423a();
                    return null;
                }
            } catch (C4542je | Exception e2) {
                e = e2;
                C4417fd.m12519a(this.f11242a).mo41811a(this.f11242a.getPackageName(), intent, e);
                AbstractC4163b.m11303a(e);
                return null;
            }
        } else if ("com.xiaomi.mipush.ERROR".equals(action)) {
            MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
            C4517ik ikVar2 = new C4517ik();
            try {
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra2 != null) {
                    C4531iy.m13589a(ikVar2, byteArrayExtra2);
                }
            } catch (C4542je unused) {
            }
            miPushCommandMessage.setCommand(String.valueOf(ikVar2.mo42273a()));
            miPushCommandMessage.setResultCode((long) intent.getIntExtra("mipush_error_code", 0));
            miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
            AbstractC4163b.m11306d("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
            return miPushCommandMessage;
        } else if (!"com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
            return null;
        } else {
            byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra3 == null) {
                AbstractC4163b.m11306d("message arrived: receiving an empty message, drop");
                return null;
            }
            C4517ik ikVar3 = new C4517ik();
            try {
                C4531iy.m13589a(ikVar3, byteArrayExtra3);
                C4209b a5 = C4209b.m11491a(this.f11242a);
                if (C4592aa.m13887a(ikVar3)) {
                    str = "message arrived: receive ignore reg message, ignore!";
                } else if (!a5.m11511c()) {
                    str = "message arrived: receive message without registration. need unregister or re-register!";
                } else if (!a5.m11511c() || !a5.m11515e()) {
                    return m11421a(ikVar3, byteArrayExtra3);
                } else {
                    str = "message arrived: app info is invalidated";
                }
                AbstractC4163b.m11306d(str);
                return null;
            } catch (C4542je | Exception e3) {
                e = e3;
                AbstractC4163b.m11303a(e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public List<String> mo41393a(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        if (timeZone.equals(timeZone2)) {
            return list;
        }
        long rawOffset = (long) (((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60);
        long parseLong = Long.parseLong(list.get(0).split(Constants.COLON_SEPARATOR)[0]);
        long parseLong2 = Long.parseLong(list.get(0).split(Constants.COLON_SEPARATOR)[1]);
        long j = ((((parseLong * 60) + parseLong2) - rawOffset) + 1440) % 1440;
        long parseLong3 = ((((Long.parseLong(list.get(1).split(Constants.COLON_SEPARATOR)[0]) * 60) + Long.parseLong(list.get(1).split(Constants.COLON_SEPARATOR)[1])) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j / 60), Long.valueOf(j % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(parseLong3 / 60), Long.valueOf(parseLong3 % 60)));
        return arrayList;
    }
}
