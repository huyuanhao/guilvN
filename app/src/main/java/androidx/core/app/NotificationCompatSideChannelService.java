package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.p000v4.app.INotificationSideChannel;
import com.p118pd.sdk.C6996o000OOo0;

public abstract class NotificationCompatSideChannelService extends Service {

    public class OooO00o extends INotificationSideChannel.Stub {
        public OooO00o() {
        }

        @Override // android.support.p000v4.app.INotificationSideChannel
        public void cancel(String str, int i, String str2) throws RemoteException {
            NotificationCompatSideChannelService.this.OooO00o(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.OooO00o(str, i, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.p000v4.app.INotificationSideChannel
        public void cancelAll(String str) {
            NotificationCompatSideChannelService.this.OooO00o(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.OooO00o(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.p000v4.app.INotificationSideChannel
        public void notify(String str, int i, String str2, Notification notification) throws RemoteException {
            NotificationCompatSideChannelService.this.OooO00o(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.OooO00o(str, i, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public void OooO00o(int i, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i + " is not authorized for package " + str);
    }

    public abstract void OooO00o(String str);

    public abstract void OooO00o(String str, int i, String str2);

    public abstract void OooO00o(String str, int i, String str2, Notification notification);

    public IBinder onBind(Intent intent) {
        if (!intent.getAction().equals(C6996o000OOo0.f19227OooO0o0) || Build.VERSION.SDK_INT > 19) {
            return null;
        }
        return new OooO00o();
    }
}
