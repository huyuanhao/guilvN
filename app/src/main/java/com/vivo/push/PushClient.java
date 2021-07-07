package com.vivo.push;

import android.content.Context;
import com.vivo.push.util.VivoPushException;
import java.util.ArrayList;
import java.util.List;

public class PushClient {
    public static final String DEFAULT_REQUEST_ID = "1";
    public static final Object SLOCK = new Object();
    public static volatile PushClient sPushClient;

    public PushClient(Context context) {
        C4121p.m11080a().mo41093a(context);
    }

    private void checkParam(String str) {
        if (str == null) {
            throw new IllegalArgumentException("PushManager String param should not be " + str);
        }
    }

    public static PushClient getInstance(Context context) {
        if (sPushClient == null) {
            synchronized (SLOCK) {
                if (sPushClient == null) {
                    sPushClient = new PushClient(context.getApplicationContext());
                }
            }
        }
        return sPushClient;
    }

    public void bindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        C4121p.m11080a().mo41100a(str, iPushActionListener);
    }

    public void checkManifest() throws VivoPushException {
        C4121p.m11080a().mo41106b();
    }

    public void delTopic(String str, IPushActionListener iPushActionListener) {
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add(str);
        C4121p.m11080a().mo41113b(arrayList, iPushActionListener);
    }

    public String getAlias() {
        return C4121p.m11080a().mo41127l();
    }

    public String getRegId() {
        return C4121p.m11080a().mo41121f();
    }

    public List<String> getTopics() {
        return C4121p.m11080a().mo41116c();
    }

    public String getVersion() {
        return "2.5.3";
    }

    public void initialize() {
        C4121p.m11080a().mo41124i();
    }

    public boolean isSupport() {
        return C4121p.m11080a().mo41119d();
    }

    public void setSystemModel(boolean z) {
        C4121p.m11080a().mo41105a(z);
    }

    public void setTopic(String str, IPushActionListener iPushActionListener) {
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add(str);
        C4121p.m11080a().mo41103a(arrayList, iPushActionListener);
    }

    public void turnOffPush(IPushActionListener iPushActionListener) {
        C4121p.m11080a().mo41108b(iPushActionListener);
    }

    public void turnOnPush(IPushActionListener iPushActionListener) {
        C4121p.m11080a().mo41095a(iPushActionListener);
    }

    public void unBindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        C4121p.m11080a().mo41110b(str, iPushActionListener);
    }
}
