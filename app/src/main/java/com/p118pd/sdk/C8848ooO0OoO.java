package com.p118pd.sdk;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.netease.nimlib.notifier.support26.annotation.RequiresApi;
import com.p118pd.sdk.C8852ooO0OoOo;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(20)
/* renamed from: com.pd.sdk.ooO0OoO  reason: case insensitive filesystem */
public class C8848ooO0OoO {
    public static final String OooO00o = "android.remoteinput.dataTypeResultsData";

    public static C8852ooO0OoOo.OooO00o[] OooO00o(RemoteInput[] remoteInputArr, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o) {
        if (remoteInputArr == null) {
            return null;
        }
        C8852ooO0OoOo.OooO00o[] OooO00o2 = oooO00o.OooO00o(remoteInputArr.length);
        for (int i = 0; i < remoteInputArr.length; i++) {
            RemoteInput remoteInput = remoteInputArr[i];
            OooO00o2[i] = oooO00o.OooO00o(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), remoteInput.getExtras(), null);
        }
        return OooO00o2;
    }

    public static RemoteInput[] OooO00o(C8852ooO0OoOo.OooO00o[] oooO00oArr) {
        if (oooO00oArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[oooO00oArr.length];
        for (int i = 0; i < oooO00oArr.length; i++) {
            C8852ooO0OoOo.OooO00o oooO00o = oooO00oArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(oooO00o.m20490OooO00o()).setLabel(oooO00o.m20489OooO00o()).setChoices(oooO00o.m20493OooO00o()).setAllowFreeFormInput(oooO00o.m20492OooO00o()).addExtras(oooO00o.OooO00o()).build();
        }
        return remoteInputArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Bundle m20482OooO00o(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }

    public static Map<String, Uri> OooO00o(Intent intent, String str) {
        String substring;
        String string;
        Intent OooO00o2 = OooO00o(intent);
        if (OooO00o2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : OooO00o2.getExtras().keySet()) {
            if (str2.startsWith("android.remoteinput.dataTypeResultsData") && (substring = str2.substring(39)) != null && !substring.isEmpty() && (string = OooO00o2.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                hashMap.put(substring, Uri.parse(string));
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public static void OooO00o(C8852ooO0OoOo.OooO00o[] oooO00oArr, Intent intent, Bundle bundle) {
        Bundle OooO00o2 = m20482OooO00o(intent);
        if (OooO00o2 != null) {
            OooO00o2.putAll(bundle);
            bundle = OooO00o2;
        }
        for (C8852ooO0OoOo.OooO00o oooO00o : oooO00oArr) {
            Map<String, Uri> OooO00o3 = OooO00o(intent, oooO00o.m20490OooO00o());
            RemoteInput.addResultsToIntent(OooO00o(new C8852ooO0OoOo.OooO00o[]{oooO00o}), intent, bundle);
            if (OooO00o3 != null) {
                OooO00o(oooO00o, intent, OooO00o3);
            }
        }
    }

    public static void OooO00o(C8852ooO0OoOo.OooO00o oooO00o, Intent intent, Map<String, Uri> map) {
        Intent OooO00o2 = OooO00o(intent);
        if (OooO00o2 == null) {
            OooO00o2 = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = OooO00o2.getBundleExtra(OooO00o(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(oooO00o.m20490OooO00o(), value.toString());
                OooO00o2.putExtra(OooO00o(key), bundleExtra);
            }
        }
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", OooO00o2));
    }

    public static String OooO00o(String str) {
        return "android.remoteinput.dataTypeResultsData" + str;
    }

    public static Intent OooO00o(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().equals("android.remoteinput.results")) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }
}
