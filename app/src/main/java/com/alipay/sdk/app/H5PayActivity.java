package com.alipay.sdk.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.p118pd.sdk.AbstractC7611o0o0o00O;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.p118pd.sdk.C7477o0OoO0;
import com.p118pd.sdk.C7479o0OoO000;
import com.p118pd.sdk.C7482o0OoO0OO;
import com.p118pd.sdk.C7531o0Oooo0o;
import com.p118pd.sdk.C7544o0o0000o;
import com.p118pd.sdk.C7546o0o000O0;
import com.p118pd.sdk.C7620o0oOOOoo;

public class H5PayActivity extends Activity {
    public AbstractC7611o0o0o00O OooO00o;
    public boolean OooO0O0;
    public String o0OO00O;
    public String o0OOO0o;
    public String o0Oo0oo;
    public String o0ooOOo;
    public String o0ooOoO;

    private void OooO0O0() {
        try {
            super.requestWindowFeature(1);
        } catch (Throwable th) {
            C7620o0oOOOoo.m19257OooO00o(th);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o() {
        /*
            r2 = this;
            java.lang.Object r0 = com.alipay.sdk.app.PayTask.f14765OooO00o
            monitor-enter(r0)
            r0.notify()     // Catch:{ Exception -> 0x0009 }
            goto L_0x0009
        L_0x0007:
            r1 = move-exception
            goto L_0x000b
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x000b:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.H5PayActivity.OooO00o():void");
    }

    public void finish() {
        OooO00o();
        super.finish();
    }

    public void onBackPressed() {
        AbstractC7611o0o0o00O o0o0o00o = this.OooO00o;
        if (o0o0o00o instanceof C7544o0o0000o) {
            o0o0o00o.m19247OooO00o();
            return;
        }
        if (!o0o0o00o.m19247OooO00o()) {
            super.onBackPressed();
        }
        C7479o0OoO000.OooO00o(C7479o0OoO000.OooO0O0());
        finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        OooO0O0();
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            String string = extras.getString("url", null);
            this.o0ooOOo = string;
            if (!C7531o0Oooo0o.m19198OooO00o(string)) {
                finish();
                return;
            }
            this.o0OOO0o = extras.getString("cookie", null);
            this.o0ooOoO = extras.getString(AbstractC7726o0ooOOoo.OooOOo0, null);
            this.o0Oo0oo = extras.getString("title", null);
            this.o0OO00O = extras.getString("version", "v1");
            this.OooO0O0 = extras.getBoolean("backisexit", false);
            try {
                if (DefaultDiskStorage.DEFAULT_DISK_STORAGE_VERSION_PREFIX.equals(this.o0OO00O)) {
                    C7546o0o000O0 o0o000o0 = new C7546o0o000O0(this);
                    setContentView(o0o000o0);
                    o0o000o0.OooO00o(this.o0Oo0oo, this.o0ooOoO, this.OooO0O0);
                    o0o000o0.OooO00o(this.o0ooOOo);
                    this.OooO00o = o0o000o0;
                    return;
                }
                C7544o0o0000o o0o0000o = new C7544o0o0000o(this);
                this.OooO00o = o0o0000o;
                setContentView(o0o0000o);
                this.OooO00o.OooO00o(this.o0ooOOo, this.o0OOO0o);
                this.OooO00o.OooO00o(this.o0ooOOo);
            } catch (Throwable th) {
                C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, "GetInstalledAppEx", th);
                finish();
            }
        } catch (Exception unused) {
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AbstractC7611o0o0o00O o0o0o00o = this.OooO00o;
        if (o0o0o00o != null) {
            o0o0o00o.OooO00o();
        }
    }
}
