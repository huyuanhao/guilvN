package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.p000v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* renamed from: com.pd.sdk.o00ooOo0  reason: case insensitive filesystem */
public class C7233o00ooOo0 {

    /* renamed from: com.pd.sdk.o00ooOo0$OooO00o */
    public static class OooO00o {
        public final Bundle OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f19762OooO00o;

        public OooO00o(String str, Bundle bundle) {
            this.f19762OooO00o = str;
            this.OooO00o = bundle;
        }
    }

    /* renamed from: com.pd.sdk.o00ooOo0$OooO0O0 */
    public static class OooO0O0 extends MediaBrowserService {
        public final AbstractC7234OooO0Oo OooO00o;

        public OooO0O0(Context context, AbstractC7234OooO0Oo oooO0Oo) {
            attachBaseContext(context);
            this.OooO00o = oooO0Oo;
        }

        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            OooO00o OooO00o2 = this.OooO00o.OooO00o(str, i, bundle == null ? null : new Bundle(bundle));
            if (OooO00o2 == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(OooO00o2.f19762OooO00o, OooO00o2.OooO00o);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.OooO00o.OooO00o(str, new OooO0OO<>(result));
        }
    }

    /* renamed from: com.pd.sdk.o00ooOo0$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC7234OooO0Oo {
        OooO00o OooO00o(String str, int i, Bundle bundle);

        void OooO00o(String str, OooO0OO<List<Parcel>> oooO0OO);
    }

    public static Object OooO00o(Context context, AbstractC7234OooO0Oo oooO0Oo) {
        return new OooO0O0(context, oooO0Oo);
    }

    public static void OooO00o(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    public static IBinder OooO00o(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    public static void OooO00o(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }

    public static void OooO00o(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }

    /* renamed from: com.pd.sdk.o00ooOo0$OooO0OO */
    public static class OooO0OO<T> {
        public MediaBrowserService.Result OooO00o;

        public OooO0OO(MediaBrowserService.Result result) {
            this.OooO00o = result;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: android.service.media.MediaBrowserService$Result */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: android.service.media.MediaBrowserService$Result */
        /* JADX WARN: Multi-variable type inference failed */
        public void OooO00o(T t) {
            if (t instanceof List) {
                this.OooO00o.sendResult(OooO00o((List<Parcel>) t));
            } else if (t instanceof Parcel) {
                T t2 = t;
                t2.setDataPosition(0);
                this.OooO00o.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(t2));
                t2.recycle();
            } else {
                this.OooO00o.sendResult(null);
            }
        }

        public void OooO00o() {
            this.OooO00o.detach();
        }

        public List<MediaBrowser.MediaItem> OooO00o(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }
    }
}
