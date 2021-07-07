package com.taobao.agoo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.taobao.accs.utl.ALog;
import java.util.HashSet;
import java.util.Set;

public class BaseNotifyClickActivity extends Activity {
    public static final String TAG = "Naccs.BaseNotifyClickActivity";
    public static Set<INotifyListener> notifyListeners;
    public AbstractC3196a baseNotifyClick = new AbstractC3196a() {
        /* class com.taobao.agoo.BaseNotifyClickActivity.C31951 */

        @Override // com.taobao.agoo.AbstractC3196a
        public void onMessage(Intent intent) {
            BaseNotifyClickActivity.this.onMessage(intent);
        }
    };

    public interface INotifyListener {
        String getMsgSource();

        String parseMsgFromIntent(Intent intent);
    }

    public static void addNotifyListener(INotifyListener iNotifyListener) {
        if (notifyListeners == null) {
            notifyListeners = new HashSet();
        }
        notifyListeners.add(iNotifyListener);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ALog.m7600i(TAG, "onCreate", new Object[0]);
        this.baseNotifyClick.onCreate(this, getIntent());
    }

    public void onMessage(Intent intent) {
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ALog.m7600i(TAG, "onNewIntent", new Object[0]);
        this.baseNotifyClick.onNewIntent(intent);
    }

    public void onStart() {
        super.onStart();
    }
}
