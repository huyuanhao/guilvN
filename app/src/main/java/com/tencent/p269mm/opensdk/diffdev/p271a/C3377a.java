package com.tencent.p269mm.opensdk.diffdev.p271a;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p269mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.p269mm.opensdk.diffdev.OAuthListener;
import com.tencent.p269mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.opensdk.diffdev.a.a */
public final class C3377a implements IDiffDevOAuth {

    /* renamed from: c */
    public List<OAuthListener> f8315c = new ArrayList();

    /* renamed from: d */
    public AsyncTaskC3380d f8316d;

    /* renamed from: e */
    public OAuthListener f8317e = new C3378b(this);
    public Handler handler = null;

    @Override // com.tencent.p269mm.opensdk.diffdev.IDiffDevOAuth
    public final void addListener(OAuthListener oAuthListener) {
        if (!this.f8315c.contains(oAuthListener)) {
            this.f8315c.add(oAuthListener);
        }
    }

    @Override // com.tencent.p269mm.opensdk.diffdev.IDiffDevOAuth
    public final boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        Log.m8652i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = " + str);
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            Log.m8650d("MicroMsg.SDK.DiffDevOAuth", String.format("auth fail, invalid argument, appId = %s, scope = %s", str, str2));
            return false;
        }
        if (this.handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        }
        addListener(oAuthListener);
        if (this.f8316d != null) {
            Log.m8650d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
            return true;
        }
        AsyncTaskC3380d dVar = new AsyncTaskC3380d(str, str2, str3, str4, str5, this.f8317e);
        this.f8316d = dVar;
        if (Build.VERSION.SDK_INT >= 11) {
            dVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            dVar.execute(new Void[0]);
        }
        return true;
    }

    @Override // com.tencent.p269mm.opensdk.diffdev.IDiffDevOAuth
    public final void detach() {
        Log.m8652i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f8315c.clear();
        stopAuth();
    }

    @Override // com.tencent.p269mm.opensdk.diffdev.IDiffDevOAuth
    public final void removeAllListeners() {
        this.f8315c.clear();
    }

    @Override // com.tencent.p269mm.opensdk.diffdev.IDiffDevOAuth
    public final void removeListener(OAuthListener oAuthListener) {
        this.f8315c.remove(oAuthListener);
    }

    @Override // com.tencent.p269mm.opensdk.diffdev.IDiffDevOAuth
    public final boolean stopAuth() {
        boolean z;
        Log.m8652i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            z = this.f8316d == null ? true : this.f8316d.mo38549a();
        } catch (Exception e) {
            Log.m8654w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e.getMessage());
            z = false;
        }
        this.f8316d = null;
        return z;
    }
}
