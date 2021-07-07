package com.tencent.bugly.beta.p267ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.global.View$OnClickListenerC3223b;

/* renamed from: com.tencent.bugly.beta.ui.BetaActivity */
public class BetaActivity extends FragmentActivity {
    public Runnable onDestroyRunnable = null;

    @Override // androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            if (Beta.dialogFullScreen) {
                getWindow().setFlags(1024, 1024);
            }
            View findViewById = getWindow().getDecorView().findViewById(16908290);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View$OnClickListenerC3223b(1, this, findViewById));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int intExtra = getIntent().getIntExtra("frag", -1);
        AbstractC3238b bVar = C3243g.f7457a.get(Integer.valueOf(intExtra));
        if (bVar != null) {
            getSupportFragmentManager().m18663OooO00o().OooO00o(16908290, bVar).OooO0OO();
            C3243g.f7457a.remove(Integer.valueOf(intExtra));
            return;
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.onDestroyRunnable;
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Fragment OooO00o = getSupportFragmentManager().OooO00o(16908290);
        boolean z = false;
        try {
            if (OooO00o instanceof AbstractC3238b) {
                z = ((AbstractC3238b) OooO00o).mo38016a(i, keyEvent);
            }
        } catch (Exception unused) {
        }
        if (!z) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }
}
