package com.vivo.push;

import android.content.Context;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.p281b.C4032aa;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4155y;
import com.vivo.push.util.C4156z;
import com.vivo.push.util.VivoPushException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PushManager {
    public static final String DEFAULT_REQUEST_ID = "1";
    public static final Object SLOCK = new Object();
    public static final String TAG = "PushManager";
    public static volatile PushManager sPushClient;

    public PushManager(Context context) {
        C4121p.m11080a().mo41093a(context);
        LocalAliasTagsManager.getInstance(context).init();
    }

    private void delLocalTag(String str) {
        checkParam(str);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        delLocalTags(arrayList);
    }

    public static PushManager getInstance(Context context) {
        if (sPushClient == null) {
            synchronized (SLOCK) {
                if (sPushClient == null) {
                    sPushClient = new PushManager(context.getApplicationContext());
                }
            }
        }
        return sPushClient;
    }

    private void setLocalTag(String str) {
        checkParam(str);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        setLocalTags(arrayList);
    }

    private void stopWork() {
        C4121p.m11080a().mo41125j();
    }

    public void bindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        C4121p.m11080a().mo41100a(str, iPushActionListener);
    }

    public void checkManifest() throws VivoPushException {
        C4121p.m11080a().mo41106b();
    }

    public void checkParam(String str) {
        if (str == null) {
            throw new RuntimeException("PushManager String param should not be " + str);
        }
    }

    public void delLocalAlias() {
        String localAlias = LocalAliasTagsManager.getInstance(C4121p.m11080a().mo41123h()).getLocalAlias();
        if (localAlias != null) {
            LocalAliasTagsManager.getInstance(C4121p.m11080a().mo41123h()).delLocalAlias(localAlias);
        }
    }

    public void delLocalTags(ArrayList<String> arrayList) {
        checkParam(arrayList);
        LocalAliasTagsManager.getInstance(C4121p.m11080a().mo41123h()).delLocalTags(arrayList);
    }

    public void delTopic(String str, String str2) {
        checkParam(str2);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        C4121p.m11080a().mo41112b(str, arrayList);
    }

    public void disableNet() {
        C4121p.m11080a().mo41129n();
    }

    public void enableNet() {
        C4121p.m11080a().mo41128m();
    }

    public String getClientId() {
        return C4155y.m11251b(C4121p.m11080a().mo41123h()).mo41187a("com.vivo.pushservice.client_id", null);
    }

    public Map<String, String> getDebugInfo() {
        return C4121p.m11080a().mo41134s();
    }

    public String getRegId() {
        return C4121p.m11080a().mo41121f();
    }

    public String getVersion() {
        return "2.5.3";
    }

    public void initialize() {
        C4121p.m11080a().mo41124i();
    }

    public boolean isEnableNet() {
        return C4121p.m11080a().mo41131p();
    }

    public boolean isEnablePush() {
        return ClientConfigManagerImpl.getInstance(C4121p.m11080a().mo41123h()).isEnablePush();
    }

    public boolean isPushProcess() {
        return C4156z.m11262a(C4121p.m11080a().mo41123h());
    }

    public void killPush() {
        C4121p.m11080a().mo41132q();
    }

    public boolean reportData(Context context, long j, long j2) {
        C4146p.m11216d("PushManager", "report message: " + j + ", reportType: " + j2);
        if (j2 <= 0) {
            return false;
        }
        C4032aa aaVar = new C4032aa(j2);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("messageID", String.valueOf(j));
        aaVar.mo40901a(hashMap);
        C4121p.m11080a().mo41096a(aaVar);
        return true;
    }

    public void reset() {
        if (C4146p.m11210a()) {
            C4121p.m11080a().mo41092a(-1);
        }
    }

    public void setDebugMode(boolean z) {
        C4121p.m11080a().mo41115b(z);
    }

    public void setLocalAlias(String str) {
        checkParam(str);
        LocalAliasTagsManager.getInstance(C4121p.m11080a().mo41123h()).setLocalAlias(str);
    }

    public void setLocalTags(ArrayList<String> arrayList) {
        checkParam(arrayList);
        LocalAliasTagsManager.getInstance(C4121p.m11080a().mo41123h()).setLocalTags(arrayList);
    }

    public void setMode(int i) {
        C4121p.m11080a().mo41107b(i);
    }

    public void setNotifyStyle(int i) {
        C4121p.m11080a().mo41117c(i);
    }

    public void setSystemModel(boolean z) {
        C4121p.m11080a().mo41105a(z);
    }

    public void setTopic(String str, String str2) {
        checkParam(str2);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        C4121p.m11080a().mo41102a(str, arrayList);
    }

    public void showDebugInfo() {
        C4121p.m11080a().mo41130o();
    }

    public void turnOffPush() {
        turnOffPush(null);
    }

    public void turnOnPush() {
        turnOnPush(null);
    }

    public void unBindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        C4121p.m11080a().mo41110b(str, iPushActionListener);
    }

    public void checkParam(List<String> list) {
        boolean z = list != null && list.size() > 0;
        if (z) {
            for (String str : list) {
                if (str == null) {
                    z = false;
                }
            }
        }
        if (!z) {
            throw new IllegalArgumentException("PushManager param should not be " + list);
        }
    }

    public void turnOffPush(IPushActionListener iPushActionListener) {
        C4121p.m11080a().mo41108b(iPushActionListener);
    }

    public void turnOnPush(IPushActionListener iPushActionListener) {
        C4121p.m11080a().mo41095a(iPushActionListener);
    }

    public void reset(int i) {
        if (C4146p.m11210a()) {
            C4121p.m11080a().mo41092a(i);
        }
    }

    public void delTopic(ArrayList<String> arrayList) {
        checkParam(arrayList);
        C4121p.m11080a().mo41112b("1", arrayList);
    }

    public void setTopic(ArrayList<String> arrayList) {
        checkParam(arrayList);
        C4121p.m11080a().mo41102a("1", arrayList);
    }

    public void delTopic(String str, ArrayList<String> arrayList) {
        checkParam(arrayList);
        C4121p.m11080a().mo41112b(str, arrayList);
    }

    public void setTopic(String str, ArrayList<String> arrayList) {
        checkParam(arrayList);
        C4121p.m11080a().mo41102a(str, arrayList);
    }
}
