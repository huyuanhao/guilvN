package com.taobao.accs;

import android.app.Notification;
import com.taobao.accs.ChannelService;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.b */
public class RunnableC3088b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ChannelService.KernelService f6828a;

    public RunnableC3088b(ChannelService.KernelService kernelService) {
        this.f6828a = kernelService;
    }

    public void run() {
        try {
            ChannelService instance = ChannelService.getInstance();
            int i = ChannelService.KernelService.m7224a(this.f6828a).getPackageManager().getPackageInfo(this.f6828a.getPackageName(), 0).applicationInfo.icon;
            if (i != 0) {
                Notification.Builder builder = new Notification.Builder(ChannelService.KernelService.m7224a(this.f6828a));
                builder.setSmallIcon(i);
                builder.setContentText("正在运行…");
                instance.startForeground(ChannelService.NOTIFY_ID, builder.build());
                Notification.Builder builder2 = new Notification.Builder(ChannelService.KernelService.m7224a(this.f6828a));
                builder2.setSmallIcon(i);
                builder2.setContentText("正在运行…");
                ChannelService.KernelService.m7225a().startForeground(ChannelService.NOTIFY_ID, builder2.build());
                ChannelService.KernelService.m7225a().stopForeground(true);
            }
            ChannelService.KernelService.m7225a().stopSelf();
        } catch (Throwable th) {
            ALog.m7598e(ChannelService.TAG, " onStartCommand run", th, new Object[0]);
        }
    }
}
