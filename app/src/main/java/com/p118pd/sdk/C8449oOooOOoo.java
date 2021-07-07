package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.pd.sdk.oOooOOoo  reason: case insensitive filesystem */
public class C8449oOooOOoo {
    public static void OooO00o(Context context, Intent intent, AbstractC8393oOoo0000 oooo0000) {
        String str;
        if (context == null) {
            str = "context is null , please check param of parseIntent()";
        } else if (intent == null) {
            str = "intent is null , please check param of parseIntent()";
        } else if (oooo0000 == null) {
            str = "callback is null , please check param of parseIntent()";
        } else {
            for (AbstractC8411oOoo0Oo0 oooo0oo0 : AbstractC8471oOooo0oO.OooO00o(context, intent)) {
                if (oooo0oo0 != null) {
                    for (AbstractC8382oOoOoo oooooo : C8379oOoOoOo.OooO00o().m20059OooO0O0()) {
                        if (oooooo != null) {
                            oooooo.OooO00o(context, oooo0oo0, oooo0000);
                        }
                    }
                }
            }
            return;
        }
        C8409oOoo0OOo.OooO0O0(str);
    }

    public static void OooO00o(Context context, C8400oOoo00oO oooo00oo, C8379oOoOoOo ooooooo) {
        if (context == null) {
            C8409oOoo0OOo.OooO0O0("context is null , please check param of parseCommandMessage(2)");
        } else if (oooo00oo == null) {
            C8409oOoo0OOo.OooO0O0("message is null , please check param of parseCommandMessage(2)");
        } else if (ooooooo == null) {
            C8409oOoo0OOo.OooO0O0("pushManager is null , please check param of parseCommandMessage(2)");
        } else if (ooooooo.m20055OooO00o() == null) {
            C8409oOoo0OOo.OooO0O0("pushManager.getPushCallback() is null , please check param of parseCommandMessage(2)");
        } else {
            switch (oooo00oo.OooO0OO()) {
                case 12289:
                    if (oooo00oo.OooO0Oo() == 0) {
                        ooooooo.OooO0O0(oooo00oo.OooO0o0());
                    }
                    ooooooo.m20055OooO00o().onRegister(oooo00oo.OooO0Oo(), oooo00oo.OooO0o0());
                    return;
                case 12290:
                    ooooooo.m20055OooO00o().onUnRegister(oooo00oo.OooO0Oo());
                    return;
                case 12291:
                case C8400oOoo00oO.OooOooO:
                case C8400oOoo00oO.OooOooo:
                case C8400oOoo00oO.Oooo0:
                case C8400oOoo00oO.Oooo0O0:
                case C8400oOoo00oO.Oooo0o0:
                case 12308:
                default:
                    return;
                case C8400oOoo00oO.OooOo0o:
                    ooooooo.m20055OooO00o().onSetAliases(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "alias", "aliasId", "aliasName"));
                    return;
                case C8400oOoo00oO.OooOo:
                    ooooooo.m20055OooO00o().onGetAliases(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "alias", "aliasId", "aliasName"));
                    return;
                case 12294:
                    ooooooo.m20055OooO00o().onUnsetAliases(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "alias", "aliasId", "aliasName"));
                    return;
                case 12295:
                    ooooooo.m20055OooO00o().onSetTags(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "tags", "tagId", "tagName"));
                    return;
                case C8400oOoo00oO.OooOoOO:
                    ooooooo.m20055OooO00o().onGetTags(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "tags", "tagId", "tagName"));
                    return;
                case C8400oOoo00oO.OooOoo0:
                    ooooooo.m20055OooO00o().onUnsetTags(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "tags", "tagId", "tagName"));
                    return;
                case C8400oOoo00oO.OooOoo:
                    ooooooo.m20055OooO00o().onSetPushTime(oooo00oo.OooO0Oo(), oooo00oo.OooO0o0());
                    return;
                case C8400oOoo00oO.Oooo000:
                    ooooooo.m20055OooO00o().onSetUserAccounts(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "tags", "accountId", "accountName"));
                    return;
                case C8400oOoo00oO.Oooo00O:
                    ooooooo.m20055OooO00o().onGetUserAccounts(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "tags", "accountId", "accountName"));
                    return;
                case C8400oOoo00oO.Oooo00o:
                    ooooooo.m20055OooO00o().onUnsetUserAccounts(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "tags", "accountId", "accountName"));
                    return;
                case C8400oOoo00oO.Oooo0OO:
                    ooooooo.m20055OooO00o().onGetPushStatus(oooo00oo.OooO0Oo(), C8415oOoo0o0.OooO00o(oooo00oo.OooO0o0()));
                    return;
                case 12309:
                    ooooooo.m20055OooO00o().onGetNotificationStatus(oooo00oo.OooO0Oo(), C8415oOoo0o0.OooO00o(oooo00oo.OooO0o0()));
                    return;
            }
        }
    }

    public static void OooO00o(Context context, C8400oOoo00oO oooo00oo, AbstractC8394oOoo000O oooo000o) {
        if (context == null) {
            C8409oOoo0OOo.OooO0O0("context is null , please check param of parseCommandMessage()");
        } else if (oooo00oo == null) {
            C8409oOoo0OOo.OooO0O0("message is null , please check param of parseCommandMessage()");
        } else if (oooo000o == null) {
            C8409oOoo0OOo.OooO0O0("callback is null , please check param of parseCommandMessage()");
        } else {
            switch (oooo00oo.OooO0OO()) {
                case 12289:
                    if (oooo00oo.OooO0Oo() == 0) {
                        C8379oOoOoOo.OooO00o().OooO0O0(oooo00oo.OooO0o0());
                    }
                    oooo000o.onRegister(oooo00oo.OooO0Oo(), oooo00oo.OooO0o0());
                    return;
                case 12290:
                    oooo000o.onUnRegister(oooo00oo.OooO0Oo());
                    return;
                case 12291:
                case C8400oOoo00oO.OooOooO:
                case C8400oOoo00oO.OooOooo:
                case C8400oOoo00oO.Oooo0:
                case C8400oOoo00oO.Oooo0O0:
                case C8400oOoo00oO.Oooo0o0:
                case 12308:
                default:
                    return;
                case C8400oOoo00oO.OooOo0o:
                    oooo000o.onSetAliases(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "alias", "aliasId", "aliasName"));
                    return;
                case C8400oOoo00oO.OooOo:
                    oooo000o.onGetAliases(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "alias", "aliasId", "aliasName"));
                    return;
                case 12294:
                    oooo000o.onUnsetAliases(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "alias", "aliasId", "aliasName"));
                    return;
                case 12295:
                    oooo000o.onSetTags(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "tags", "tagId", "tagName"));
                    return;
                case C8400oOoo00oO.OooOoOO:
                    oooo000o.onGetTags(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "tags", "tagId", "tagName"));
                    return;
                case C8400oOoo00oO.OooOoo0:
                    oooo000o.onUnsetTags(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "tags", "tagId", "tagName"));
                    return;
                case C8400oOoo00oO.OooOoo:
                    oooo000o.onSetPushTime(oooo00oo.OooO0Oo(), oooo00oo.OooO0o0());
                    return;
                case C8400oOoo00oO.Oooo000:
                    oooo000o.onSetUserAccounts(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "tags", "accountId", "accountName"));
                    return;
                case C8400oOoo00oO.Oooo00O:
                    oooo000o.onGetUserAccounts(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "tags", "accountId", "accountName"));
                    return;
                case C8400oOoo00oO.Oooo00o:
                    oooo000o.onUnsetUserAccounts(oooo00oo.OooO0Oo(), C8400oOoo00oO.OooO00o(oooo00oo.OooO0o0(), "tags", "accountId", "accountName"));
                    return;
                case C8400oOoo00oO.Oooo0OO:
                    oooo000o.onGetPushStatus(oooo00oo.OooO0Oo(), C8415oOoo0o0.OooO00o(oooo00oo.OooO0o0()));
                    return;
                case 12309:
                    oooo000o.onGetNotificationStatus(oooo00oo.OooO0Oo(), C8415oOoo0o0.OooO00o(oooo00oo.OooO0o0()));
                    return;
            }
        }
    }
}
