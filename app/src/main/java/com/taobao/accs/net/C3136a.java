package com.taobao.accs.net;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.util.Calendar;

/* renamed from: com.taobao.accs.net.a */
public class C3136a extends AbstractC3141f {

    /* renamed from: c */
    public PendingIntent f7006c;

    /* renamed from: d */
    public AlarmManager f7007d;

    public C3136a(Context context) {
        super(context);
        try {
            this.f7007d = (AlarmManager) this.f7032a.getSystemService("alarm");
        } catch (Throwable th) {
            ALog.m7598e("AlarmHeartBeatMgr", "AlarmHeartBeatMgr", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.AbstractC3141f
    /* renamed from: a */
    public void mo37644a(int i) {
        if (this.f7007d == null) {
            this.f7007d = (AlarmManager) this.f7032a.getSystemService("alarm");
        }
        if (this.f7007d == null) {
            ALog.m7599e("AlarmHeartBeatMgr", "setInner null", new Object[0]);
            return;
        }
        if (this.f7006c == null) {
            Intent intent = new Intent();
            intent.setPackage(this.f7032a.getPackageName());
            intent.addFlags(32);
            intent.setAction(Constants.ACTION_COMMAND);
            intent.putExtra("command", 201);
            this.f7006c = PendingIntent.getBroadcast(this.f7032a, 0, intent, 0);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.add(13, i);
        this.f7007d.set(0, instance.getTimeInMillis(), this.f7006c);
    }
}
