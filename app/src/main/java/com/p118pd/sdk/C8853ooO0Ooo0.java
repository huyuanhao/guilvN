package com.p118pd.sdk;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.netease.nimlib.notifier.support26.annotation.RequiresApi;
import com.p118pd.sdk.C8852ooO0OoOo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RequiresApi(16)
/* renamed from: com.pd.sdk.ooO0Ooo0  reason: case insensitive filesystem */
public class C8853ooO0Ooo0 {
    public static final String OooO = "allowedDataTypes";
    public static final String OooO00o = "android.remoteinput.results";
    public static final String OooO0O0 = "android.remoteinput.resultsData";
    public static final String OooO0OO = "android.remoteinput.dataTypeResultsData";
    public static final String OooO0Oo = "resultKey";
    public static final String OooO0o = "choices";
    public static final String OooO0o0 = "label";
    public static final String OooO0oO = "allowFreeFormInput";
    public static final String OooO0oo = "extras";

    public static C8852ooO0OoOo.OooO00o OooO00o(Bundle bundle, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return oooO00o.OooO00o(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), bundle.getBundle("extras"), hashSet);
    }

    public static Bundle OooO00o(C8852ooO0OoOo.OooO00o oooO00o) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", oooO00o.m20490OooO00o());
        bundle.putCharSequence("label", oooO00o.m20489OooO00o());
        bundle.putCharSequenceArray("choices", oooO00o.m20493OooO00o());
        bundle.putBoolean("allowFreeFormInput", oooO00o.m20492OooO00o());
        bundle.putBundle("extras", oooO00o.OooO00o());
        Set<String> OooO00o2 = oooO00o.m20491OooO00o();
        if (OooO00o2 != null && !OooO00o2.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(OooO00o2.size());
            for (String str : OooO00o2) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static C8852ooO0OoOo.OooO00o[] OooO00o(Bundle[] bundleArr, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o) {
        if (bundleArr == null) {
            return null;
        }
        C8852ooO0OoOo.OooO00o[] OooO00o2 = oooO00o.OooO00o(bundleArr.length);
        for (int i = 0; i < bundleArr.length; i++) {
            OooO00o2[i] = OooO00o(bundleArr[i], oooO00o);
        }
        return OooO00o2;
    }

    public static Bundle[] OooO00o(C8852ooO0OoOo.OooO00o[] oooO00oArr) {
        if (oooO00oArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[oooO00oArr.length];
        for (int i = 0; i < oooO00oArr.length; i++) {
            bundleArr[i] = OooO00o(oooO00oArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Bundle m20494OooO00o(Intent intent) {
        Intent OooO00o2 = OooO00o(intent);
        if (OooO00o2 == null) {
            return null;
        }
        return (Bundle) OooO00o2.getExtras().getParcelable("android.remoteinput.resultsData");
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
        Intent OooO00o2 = OooO00o(intent);
        if (OooO00o2 == null) {
            OooO00o2 = new Intent();
        }
        Bundle bundleExtra = OooO00o2.getBundleExtra("android.remoteinput.resultsData");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        for (C8852ooO0OoOo.OooO00o oooO00o : oooO00oArr) {
            Object obj = bundle.get(oooO00o.m20490OooO00o());
            if (obj instanceof CharSequence) {
                bundleExtra.putCharSequence(oooO00o.m20490OooO00o(), (CharSequence) obj);
            }
        }
        OooO00o2.putExtra("android.remoteinput.resultsData", bundleExtra);
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", OooO00o2));
    }

    public static void OooO00o(C8849ooO0OoO0 ooo0ooo0, Intent intent, Map<String, Uri> map) {
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
                bundleExtra.putString(ooo0ooo0.m20484OooO00o(), value.toString());
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
