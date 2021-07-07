package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.p000v4.media.MediaBrowserCompat;
import android.support.p000v4.media.session.IMediaSession;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.support.p000v4.p001os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.C6971o0000oO0;
import com.p118pd.sdk.C6990o000O0oo;
import com.p118pd.sdk.C7085o00OO0O0;
import com.p118pd.sdk.C7229o00ooOO;
import com.p118pd.sdk.C7231o00ooOOo;
import com.p118pd.sdk.C7232o00ooOo;
import com.p118pd.sdk.C7233o00ooOo0;
import com.p118pd.sdk.C7235o00ooOoO;
import com.p118pd.sdk.C7236o00ooOoo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {
    public static final boolean OooO0O0 = Log.isLoggable(f14420o0ooOOo, 3);
    public static final float OooO0Oo = 1.0E-5f;
    public static final int o00oO0O = 1;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int o0OOO0o = 0;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public static final String f14418o0OOO0o = "media_item";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int o0Oo0oo = 1;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public static final String f14419o0Oo0oo = "search_results";
    public static final int o0ooOO0 = 2;
    public static final int o0ooOOo = 4;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f14420o0ooOOo = "MBServiceCompat";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int o0ooOoO = -1;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public static final String f14421o0ooOoO = "android.media.browse.MediaBrowserService";
    public MediaSessionCompat.Token OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0o f14422OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5053OooO0oO f14423OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final HandlerC5062OooOOo0 f14424OooO00o = new HandlerC5062OooOOo0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6971o0000oO0<IBinder, OooO0o> f14425OooO00o = new C6971o0000oO0<>();

    @RequiresApi(23)
    public class OooO extends C5054OooO0oo implements C7232o00ooOo.OooO0O0 {

        public class OooO00o extends OooOOO0<MediaBrowserCompat.MediaItem> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C7233o00ooOo0.OooO0OO f14426OooO00o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OooO00o(Object obj, C7233o00ooOo0.OooO0OO oooO0OO) {
                super(obj);
                this.f14426OooO00o = oooO0OO;
            }

            public void OooO00o(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f14426OooO00o.OooO00o((Object) null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f14426OooO00o.OooO00o(obtain);
            }

            @Override // androidx.media.MediaBrowserServiceCompat.OooOOO0, androidx.media.MediaBrowserServiceCompat.OooOOO0, androidx.media.MediaBrowserServiceCompat.OooOOO0
            public void OooO00o() {
                this.f14426OooO00o.OooO00o();
            }
        }

        public OooO() {
            super();
        }

        @Override // com.p118pd.sdk.C7232o00ooOo.OooO0O0
        public void OooO0O0(String str, C7233o00ooOo0.OooO0OO<Parcel> oooO0OO) {
            MediaBrowserServiceCompat.this.OooO0O0(str, new OooO00o(str, oooO0OO));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C5054OooO0oo, androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public void onCreate() {
            Object OooO00o2 = C7232o00ooOo.OooO00o(MediaBrowserServiceCompat.this, this);
            ((C5054OooO0oo) this).f14442OooO00o = OooO00o2;
            C7233o00ooOo0.OooO00o(OooO00o2);
        }
    }

    public class OooO00o extends OooOOO0<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ Bundle OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ OooO0o f14427OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f14429OooO00o;
        public final /* synthetic */ Bundle OooO0O0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(Object obj, OooO0o oooO0o, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f14427OooO00o = oooO0o;
            this.f14429OooO00o = str;
            this.OooO00o = bundle;
            this.OooO0O0 = bundle2;
        }

        public void OooO00o(List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.f14425OooO00o.get(this.f14427OooO00o.f14435OooO00o.asBinder()) == this.f14427OooO00o) {
                if ((OooO00o() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.OooO00o(list, this.OooO00o);
                }
                try {
                    this.f14427OooO00o.f14435OooO00o.OooO00o(this.f14429OooO00o, list, this.OooO00o, this.OooO0O0);
                } catch (RemoteException unused) {
                    String str = "Calling onLoadChildren() failed for id=" + this.f14429OooO00o + " package=" + this.f14427OooO00o.f14438OooO00o;
                }
            } else if (MediaBrowserServiceCompat.OooO0O0) {
                String str2 = "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f14427OooO00o.f14438OooO00o + " id=" + this.f14429OooO00o;
            }
        }
    }

    public class OooO0O0 extends OooOOO0<MediaBrowserCompat.MediaItem> {
        public final /* synthetic */ ResultReceiver OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.OooO00o = resultReceiver;
        }

        public void OooO00o(MediaBrowserCompat.MediaItem mediaItem) {
            if ((OooO00o() & 2) != 0) {
                this.OooO00o.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaBrowserServiceCompat.f14418o0OOO0o, mediaItem);
            this.OooO00o.send(0, bundle);
        }
    }

    public class OooO0OO extends OooOOO0<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ ResultReceiver OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0OO(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.OooO00o = resultReceiver;
        }

        public void OooO00o(List<MediaBrowserCompat.MediaItem> list) {
            if ((OooO00o() & 4) != 0 || list == null) {
                this.OooO00o.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(MediaBrowserServiceCompat.f14419o0Oo0oo, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.OooO00o.send(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$OooO0Oo  reason: case insensitive filesystem */
    public class C5051OooO0Oo extends OooOOO0<Bundle> {
        public final /* synthetic */ ResultReceiver OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5051OooO0Oo(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.OooO00o = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooOOO0
        public void OooO0O0(Bundle bundle) {
            this.OooO00o.send(1, bundle);
        }

        /* renamed from: OooO0o */
        public void OooO00o(Bundle bundle) {
            this.OooO00o.send(0, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooOOO0
        public void OooO00o(Bundle bundle) {
            this.OooO00o.send(-1, bundle);
        }
    }

    public class OooO0o implements IBinder.DeathRecipient {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Bundle f14433OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5052OooO0o0 f14434OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooOOOO f14435OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C7236o00ooOoo.OooO0O0 f14437OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f14438OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final HashMap<String, List<C7085o00OO0O0<IBinder, Bundle>>> f14439OooO00o = new HashMap<>();
        public final int OooO0O0;

        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            public void run() {
                OooO0o oooO0o = OooO0o.this;
                MediaBrowserServiceCompat.this.f14425OooO00o.remove(oooO0o.f14435OooO00o.asBinder());
            }
        }

        public OooO0o(String str, int i, int i2, Bundle bundle, OooOOOO oooOOOO) {
            this.f14438OooO00o = str;
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.f14437OooO00o = new C7236o00ooOoo.OooO0O0(str, i, i2);
            this.f14433OooO00o = bundle;
            this.f14435OooO00o = oooOOOO;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.f14424OooO00o.post(new OooO00o());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$OooO0o0  reason: case insensitive filesystem */
    public static final class C5052OooO0o0 {
        public static final String OooO0O0 = "android.service.media.extra.RECENT";
        public static final String OooO0OO = "android.service.media.extra.OFFLINE";
        public static final String OooO0Oo = "android.service.media.extra.SUGGESTED";
        @Deprecated
        public static final String OooO0o0 = "android.service.media.extra.SUGGESTION_KEYWORDS";
        public final Bundle OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f14440OooO00o;

        public C5052OooO0o0(@NonNull String str, @Nullable Bundle bundle) {
            if (str != null) {
                this.f14440OooO00o = str;
                this.OooO00o = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m14686OooO00o() {
            return this.f14440OooO00o;
        }

        public Bundle OooO00o() {
            return this.OooO00o;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$OooO0oO  reason: case insensitive filesystem */
    public interface AbstractC5053OooO0oO {
        Bundle OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        C7236o00ooOoo.OooO0O0 m14687OooO00o();

        void OooO00o(MediaSessionCompat.Token token);

        void OooO00o(C7236o00ooOoo.OooO0O0 oooO0O0, String str, Bundle bundle);

        void OooO00o(String str, Bundle bundle);

        IBinder onBind(Intent intent);

        void onCreate();
    }

    @RequiresApi(21)
    /* renamed from: androidx.media.MediaBrowserServiceCompat$OooO0oo  reason: case insensitive filesystem */
    public class C5054OooO0oo implements AbstractC5053OooO0oO, C7233o00ooOo0.AbstractC7234OooO0Oo {
        public Messenger OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object f14442OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<Bundle> f14443OooO00o = new ArrayList();

        /* renamed from: androidx.media.MediaBrowserServiceCompat$OooO0oo$OooO00o */
        public class OooO00o implements Runnable {
            public final /* synthetic */ MediaSessionCompat.Token OooO00o;

            public OooO00o(MediaSessionCompat.Token token) {
                this.OooO00o = token;
            }

            public void run() {
                if (!C5054OooO0oo.this.f14443OooO00o.isEmpty()) {
                    IMediaSession extraBinder = this.OooO00o.getExtraBinder();
                    if (extraBinder != null) {
                        for (Bundle bundle : C5054OooO0oo.this.f14443OooO00o) {
                            C6990o000O0oo.OooO00o(bundle, C7231o00ooOOo.OooOOoo, extraBinder.asBinder());
                        }
                    }
                    C5054OooO0oo.this.f14443OooO00o.clear();
                }
                C7233o00ooOo0.OooO00o(C5054OooO0oo.this.f14442OooO00o, this.OooO00o.getToken());
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$OooO0oo$OooO0O0 */
        public class OooO0O0 extends OooOOO0<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C7233o00ooOo0.OooO0OO f14445OooO00o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OooO0O0(Object obj, C7233o00ooOo0.OooO0OO oooO0OO) {
                super(obj);
                this.f14445OooO00o = oooO0OO;
            }

            public void OooO00o(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f14445OooO00o.OooO00o((Object) arrayList);
            }

            @Override // androidx.media.MediaBrowserServiceCompat.OooOOO0, androidx.media.MediaBrowserServiceCompat.OooOOO0, androidx.media.MediaBrowserServiceCompat.OooOOO0
            public void OooO00o() {
                this.f14445OooO00o.OooO00o();
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$OooO0oo$OooO0OO */
        public class OooO0OO implements Runnable {
            public final /* synthetic */ Bundle OooO00o;
            public final /* synthetic */ String o0ooOOo;

            public OooO0OO(String str, Bundle bundle) {
                this.o0ooOOo = str;
                this.OooO00o = bundle;
            }

            public void run() {
                for (IBinder iBinder : MediaBrowserServiceCompat.this.f14425OooO00o.keySet()) {
                    C6971o0000oO0<IBinder, OooO0o> o0000oo0 = MediaBrowserServiceCompat.this.f14425OooO00o;
                    C5054OooO0oo.this.OooO00o(o0000oo0.get(iBinder), this.o0ooOOo, this.OooO00o);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$OooO0oo$OooO0Oo  reason: case insensitive filesystem */
        public class RunnableC5055OooO0Oo implements Runnable {
            public final /* synthetic */ Bundle OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C7236o00ooOoo.OooO0O0 f14448OooO00o;
            public final /* synthetic */ String o0ooOOo;

            public RunnableC5055OooO0Oo(C7236o00ooOoo.OooO0O0 oooO0O0, String str, Bundle bundle) {
                this.f14448OooO00o = oooO0O0;
                this.o0ooOOo = str;
                this.OooO00o = bundle;
            }

            public void run() {
                for (int i = 0; i < MediaBrowserServiceCompat.this.f14425OooO00o.size(); i++) {
                    OooO0o OooO0OO = MediaBrowserServiceCompat.this.f14425OooO00o.OooO0OO(i);
                    if (OooO0OO.f14437OooO00o.equals(this.f14448OooO00o)) {
                        C5054OooO0oo.this.OooO00o(OooO0OO, this.o0ooOOo, this.OooO00o);
                    }
                }
            }
        }

        public C5054OooO0oo() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public void OooO00o(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f14424OooO00o.OooO00o(new OooO00o(token));
        }

        public void OooO0O0(String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f14424OooO00o.post(new OooO0OO(str, bundle));
        }

        public void OooO0OO(String str, Bundle bundle) {
            C7233o00ooOo0.OooO00o(this.f14442OooO00o, str);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public IBinder onBind(Intent intent) {
            return C7233o00ooOo0.OooO00o(this.f14442OooO00o, intent);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public void onCreate() {
            Object OooO00o2 = C7233o00ooOo0.OooO00o((Context) MediaBrowserServiceCompat.this, (C7233o00ooOo0.AbstractC7234OooO0Oo) this);
            this.f14442OooO00o = OooO00o2;
            C7233o00ooOo0.OooO00o(OooO00o2);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public void OooO00o(String str, Bundle bundle) {
            OooO0OO(str, bundle);
            OooO0O0(str, bundle);
        }

        public void OooO0O0(C7236o00ooOoo.OooO0O0 oooO0O0, String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f14424OooO00o.post(new RunnableC5055OooO0Oo(oooO0O0, str, bundle));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public void OooO00o(C7236o00ooOoo.OooO0O0 oooO0O0, String str, Bundle bundle) {
            OooO0O0(oooO0O0, str, bundle);
        }

        @Override // com.p118pd.sdk.C7233o00ooOo0.AbstractC7234OooO0Oo
        public C7233o00ooOo0.OooO00o OooO00o(String str, int i, Bundle bundle) {
            Bundle bundle2;
            IBinder iBinder;
            if (bundle == null || bundle.getInt(C7231o00ooOOo.f19760OooOOOo, 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove(C7231o00ooOOo.f19760OooOOOo);
                this.OooO00o = new Messenger(MediaBrowserServiceCompat.this.f14424OooO00o);
                bundle2 = new Bundle();
                bundle2.putInt(C7231o00ooOOo.f19761OooOOo0, 2);
                C6990o000O0oo.OooO00o(bundle2, C7231o00ooOOo.OooOOo, this.OooO00o.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.OooO00o;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    if (extraBinder == null) {
                        iBinder = null;
                    } else {
                        iBinder = extraBinder.asBinder();
                    }
                    C6990o000O0oo.OooO00o(bundle2, C7231o00ooOOo.OooOOoo, iBinder);
                } else {
                    this.f14443OooO00o.add(bundle2);
                }
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f14422OooO00o = new OooO0o(str, -1, i, bundle, null);
            C5052OooO0o0 OooO00o2 = MediaBrowserServiceCompat.this.OooO00o(str, i, bundle);
            MediaBrowserServiceCompat.this.f14422OooO00o = null;
            if (OooO00o2 == null) {
                return null;
            }
            if (bundle2 == null) {
                bundle2 = OooO00o2.OooO00o();
            } else if (OooO00o2.OooO00o() != null) {
                bundle2.putAll(OooO00o2.OooO00o());
            }
            return new C7233o00ooOo0.OooO00o(OooO00o2.m14686OooO00o(), bundle2);
        }

        @Override // com.p118pd.sdk.C7233o00ooOo0.AbstractC7234OooO0Oo
        public void OooO00o(String str, C7233o00ooOo0.OooO0OO<List<Parcel>> oooO0OO) {
            MediaBrowserServiceCompat.this.OooO00o(str, new OooO0O0(str, oooO0OO));
        }

        public void OooO00o(OooO0o oooO0o, String str, Bundle bundle) {
            List<C7085o00OO0O0<IBinder, Bundle>> list = oooO0o.f14439OooO00o.get(str);
            if (list != null) {
                for (C7085o00OO0O0<IBinder, Bundle> o00oo0o0 : list) {
                    if (C7229o00ooOO.OooO0O0(bundle, o00oo0o0.OooO0O0)) {
                        MediaBrowserServiceCompat.this.OooO00o(str, oooO0o, (Bundle) o00oo0o0.OooO0O0, bundle);
                    }
                }
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO, androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public Bundle OooO00o() {
            if (this.OooO00o == null) {
                return null;
            }
            OooO0o oooO0o = MediaBrowserServiceCompat.this.f14422OooO00o;
            if (oooO0o == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            } else if (oooO0o.f14433OooO00o == null) {
                return null;
            } else {
                return new Bundle(MediaBrowserServiceCompat.this.f14422OooO00o.f14433OooO00o);
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO, androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C7236o00ooOoo.OooO0O0 m14688OooO00o() {
            OooO0o oooO0o = MediaBrowserServiceCompat.this.f14422OooO00o;
            if (oooO0o != null) {
                return oooO0o.f14437OooO00o;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    @RequiresApi(28)
    public class OooOO0O extends OooOO0 {
        public OooOO0O() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C5054OooO0oo, androidx.media.MediaBrowserServiceCompat.C5054OooO0oo, androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO, androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO, androidx.media.MediaBrowserServiceCompat.OooOO0
        public C7236o00ooOoo.OooO0O0 OooO00o() {
            OooO0o oooO0o = MediaBrowserServiceCompat.this.f14422OooO00o;
            if (oooO0o != null) {
                return oooO0o.f14437OooO00o;
            }
            return new C7236o00ooOoo.OooO0O0(((MediaBrowserService) ((C5054OooO0oo) this).f14442OooO00o).getCurrentBrowserInfo());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$OooOO0o  reason: case insensitive filesystem */
    public class C5056OooOO0o implements AbstractC5053OooO0oO {
        public Messenger OooO00o;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$OooOO0o$OooO00o */
        public class OooO00o implements Runnable {
            public final /* synthetic */ MediaSessionCompat.Token OooO00o;

            public OooO00o(MediaSessionCompat.Token token) {
                this.OooO00o = token;
            }

            public void run() {
                Iterator<OooO0o> it = MediaBrowserServiceCompat.this.f14425OooO00o.values().iterator();
                while (it.hasNext()) {
                    OooO0o next = it.next();
                    try {
                        next.f14435OooO00o.OooO00o(next.f14434OooO00o.m14686OooO00o(), this.OooO00o, next.f14434OooO00o.OooO00o());
                    } catch (RemoteException unused) {
                        String str = "Connection for " + next.f14438OooO00o + " is no longer valid.";
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$OooOO0o$OooO0O0 */
        public class OooO0O0 implements Runnable {
            public final /* synthetic */ Bundle OooO00o;
            public final /* synthetic */ String o0ooOOo;

            public OooO0O0(String str, Bundle bundle) {
                this.o0ooOOo = str;
                this.OooO00o = bundle;
            }

            public void run() {
                for (IBinder iBinder : MediaBrowserServiceCompat.this.f14425OooO00o.keySet()) {
                    C6971o0000oO0<IBinder, OooO0o> o0000oo0 = MediaBrowserServiceCompat.this.f14425OooO00o;
                    C5056OooOO0o.this.OooO00o(o0000oo0.get(iBinder), this.o0ooOOo, this.OooO00o);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$OooOO0o$OooO0OO */
        public class OooO0OO implements Runnable {
            public final /* synthetic */ Bundle OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C7236o00ooOoo.OooO0O0 f14454OooO00o;
            public final /* synthetic */ String o0ooOOo;

            public OooO0OO(C7236o00ooOoo.OooO0O0 oooO0O0, String str, Bundle bundle) {
                this.f14454OooO00o = oooO0O0;
                this.o0ooOOo = str;
                this.OooO00o = bundle;
            }

            public void run() {
                for (int i = 0; i < MediaBrowserServiceCompat.this.f14425OooO00o.size(); i++) {
                    OooO0o OooO0OO = MediaBrowserServiceCompat.this.f14425OooO00o.OooO0OO(i);
                    if (OooO0OO.f14437OooO00o.equals(this.f14454OooO00o)) {
                        C5056OooOO0o.this.OooO00o(OooO0OO, this.o0ooOOo, this.OooO00o);
                        return;
                    }
                }
            }
        }

        public C5056OooOO0o() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public void OooO00o(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f14424OooO00o.post(new OooO00o(token));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public IBinder onBind(Intent intent) {
            if (MediaBrowserServiceCompat.f14421o0ooOoO.equals(intent.getAction())) {
                return this.OooO00o.getBinder();
            }
            return null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public void onCreate() {
            this.OooO00o = new Messenger(MediaBrowserServiceCompat.this.f14424OooO00o);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public void OooO00o(@NonNull String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f14424OooO00o.post(new OooO0O0(str, bundle));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public void OooO00o(@NonNull C7236o00ooOoo.OooO0O0 oooO0O0, @NonNull String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f14424OooO00o.post(new OooO0OO(oooO0O0, str, bundle));
        }

        public void OooO00o(OooO0o oooO0o, String str, Bundle bundle) {
            List<C7085o00OO0O0<IBinder, Bundle>> list = oooO0o.f14439OooO00o.get(str);
            if (list != null) {
                for (C7085o00OO0O0<IBinder, Bundle> o00oo0o0 : list) {
                    if (C7229o00ooOO.OooO0O0(bundle, o00oo0o0.OooO0O0)) {
                        MediaBrowserServiceCompat.this.OooO00o(str, oooO0o, (Bundle) o00oo0o0.OooO0O0, bundle);
                    }
                }
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO, androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public Bundle OooO00o() {
            OooO0o oooO0o = MediaBrowserServiceCompat.this.f14422OooO00o;
            if (oooO0o == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            } else if (oooO0o.f14433OooO00o == null) {
                return null;
            } else {
                return new Bundle(MediaBrowserServiceCompat.this.f14422OooO00o.f14433OooO00o);
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO, androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C7236o00ooOoo.OooO0O0 m14689OooO00o() {
            OooO0o oooO0o = MediaBrowserServiceCompat.this.f14422OooO00o;
            if (oooO0o != null) {
                return oooO0o.f14437OooO00o;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    public class OooOOO {

        public class OooO implements Runnable {
            public final /* synthetic */ Bundle OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ ResultReceiver f14455OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooOOOO f14457OooO00o;
            public final /* synthetic */ String o0ooOOo;

            public OooO(OooOOOO oooOOOO, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f14457OooO00o = oooOOOO;
                this.o0ooOOo = str;
                this.OooO00o = bundle;
                this.f14455OooO00o = resultReceiver;
            }

            public void run() {
                OooO0o oooO0o = MediaBrowserServiceCompat.this.f14425OooO00o.get(this.f14457OooO00o.asBinder());
                if (oooO0o == null) {
                    String str = "sendCustomAction for callback that isn't registered action=" + this.o0ooOOo + ", extras=" + this.OooO00o;
                    return;
                }
                MediaBrowserServiceCompat.this.OooO00o(this.o0ooOOo, this.OooO00o, oooO0o, this.f14455OooO00o);
            }
        }

        public class OooO00o implements Runnable {
            public final /* synthetic */ Bundle OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooOOOO f14459OooO00o;
            public final /* synthetic */ int o00oO0O;
            public final /* synthetic */ int o0ooOO0;
            public final /* synthetic */ String o0ooOOo;

            public OooO00o(OooOOOO oooOOOO, String str, int i, int i2, Bundle bundle) {
                this.f14459OooO00o = oooOOOO;
                this.o0ooOOo = str;
                this.o00oO0O = i;
                this.o0ooOO0 = i2;
                this.OooO00o = bundle;
            }

            public void run() {
                IBinder asBinder = this.f14459OooO00o.asBinder();
                MediaBrowserServiceCompat.this.f14425OooO00o.remove(asBinder);
                OooO0o oooO0o = new OooO0o(this.o0ooOOo, this.o00oO0O, this.o0ooOO0, this.OooO00o, this.f14459OooO00o);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f14422OooO00o = oooO0o;
                C5052OooO0o0 OooO00o2 = mediaBrowserServiceCompat.OooO00o(this.o0ooOOo, this.o0ooOO0, this.OooO00o);
                oooO0o.f14434OooO00o = OooO00o2;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f14422OooO00o = null;
                if (OooO00o2 == null) {
                    Log.i(MediaBrowserServiceCompat.f14420o0ooOOo, "No root for client " + this.o0ooOOo + " from service " + OooO00o.class.getName());
                    try {
                        this.f14459OooO00o.OooO00o();
                    } catch (RemoteException unused) {
                        String str = "Calling onConnectFailed() failed. Ignoring. pkg=" + this.o0ooOOo;
                    }
                } else {
                    try {
                        mediaBrowserServiceCompat2.f14425OooO00o.put(asBinder, oooO0o);
                        asBinder.linkToDeath(oooO0o, 0);
                        if (MediaBrowserServiceCompat.this.OooO00o != null) {
                            this.f14459OooO00o.OooO00o(oooO0o.f14434OooO00o.m14686OooO00o(), MediaBrowserServiceCompat.this.OooO00o, oooO0o.f14434OooO00o.OooO00o());
                        }
                    } catch (RemoteException unused2) {
                        String str2 = "Calling onConnect() failed. Dropping client. pkg=" + this.o0ooOOo;
                        MediaBrowserServiceCompat.this.f14425OooO00o.remove(asBinder);
                    }
                }
            }
        }

        public class OooO0O0 implements Runnable {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooOOOO f14460OooO00o;

            public OooO0O0(OooOOOO oooOOOO) {
                this.f14460OooO00o = oooOOOO;
            }

            public void run() {
                OooO0o remove = MediaBrowserServiceCompat.this.f14425OooO00o.remove(this.f14460OooO00o.asBinder());
                if (remove != null) {
                    remove.f14435OooO00o.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        public class OooO0OO implements Runnable {
            public final /* synthetic */ Bundle OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ IBinder f14461OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooOOOO f14463OooO00o;
            public final /* synthetic */ String o0ooOOo;

            public OooO0OO(OooOOOO oooOOOO, String str, IBinder iBinder, Bundle bundle) {
                this.f14463OooO00o = oooOOOO;
                this.o0ooOOo = str;
                this.f14461OooO00o = iBinder;
                this.OooO00o = bundle;
            }

            public void run() {
                OooO0o oooO0o = MediaBrowserServiceCompat.this.f14425OooO00o.get(this.f14463OooO00o.asBinder());
                if (oooO0o == null) {
                    String str = "addSubscription for callback that isn't registered id=" + this.o0ooOOo;
                    return;
                }
                MediaBrowserServiceCompat.this.OooO00o(this.o0ooOOo, oooO0o, this.f14461OooO00o, this.OooO00o);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$OooOOO$OooO0Oo  reason: case insensitive filesystem */
        public class RunnableC5057OooO0Oo implements Runnable {
            public final /* synthetic */ IBinder OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooOOOO f14465OooO00o;
            public final /* synthetic */ String o0ooOOo;

            public RunnableC5057OooO0Oo(OooOOOO oooOOOO, String str, IBinder iBinder) {
                this.f14465OooO00o = oooOOOO;
                this.o0ooOOo = str;
                this.OooO00o = iBinder;
            }

            public void run() {
                OooO0o oooO0o = MediaBrowserServiceCompat.this.f14425OooO00o.get(this.f14465OooO00o.asBinder());
                if (oooO0o == null) {
                    String str = "removeSubscription for callback that isn't registered id=" + this.o0ooOOo;
                } else if (!MediaBrowserServiceCompat.this.OooO00o(this.o0ooOOo, oooO0o, this.OooO00o)) {
                    String str2 = "removeSubscription called for " + this.o0ooOOo + " which is not subscribed";
                }
            }
        }

        public class OooO0o implements Runnable {
            public final /* synthetic */ Bundle OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooOOOO f14467OooO00o;
            public final /* synthetic */ int o00oO0O;
            public final /* synthetic */ int o0ooOO0;
            public final /* synthetic */ String o0ooOOo;

            public OooO0o(OooOOOO oooOOOO, String str, int i, int i2, Bundle bundle) {
                this.f14467OooO00o = oooOOOO;
                this.o0ooOOo = str;
                this.o00oO0O = i;
                this.o0ooOO0 = i2;
                this.OooO00o = bundle;
            }

            public void run() {
                IBinder asBinder = this.f14467OooO00o.asBinder();
                MediaBrowserServiceCompat.this.f14425OooO00o.remove(asBinder);
                OooO0o oooO0o = new OooO0o(this.o0ooOOo, this.o00oO0O, this.o0ooOO0, this.OooO00o, this.f14467OooO00o);
                MediaBrowserServiceCompat.this.f14425OooO00o.put(asBinder, oooO0o);
                try {
                    asBinder.linkToDeath(oooO0o, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$OooOOO$OooO0o0  reason: case insensitive filesystem */
        public class RunnableC5058OooO0o0 implements Runnable {
            public final /* synthetic */ ResultReceiver OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooOOOO f14469OooO00o;
            public final /* synthetic */ String o0ooOOo;

            public RunnableC5058OooO0o0(OooOOOO oooOOOO, String str, ResultReceiver resultReceiver) {
                this.f14469OooO00o = oooOOOO;
                this.o0ooOOo = str;
                this.OooO00o = resultReceiver;
            }

            public void run() {
                OooO0o oooO0o = MediaBrowserServiceCompat.this.f14425OooO00o.get(this.f14469OooO00o.asBinder());
                if (oooO0o == null) {
                    String str = "getMediaItem for callback that isn't registered id=" + this.o0ooOOo;
                    return;
                }
                MediaBrowserServiceCompat.this.OooO00o(this.o0ooOOo, oooO0o, this.OooO00o);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$OooOOO$OooO0oO  reason: case insensitive filesystem */
        public class RunnableC5059OooO0oO implements Runnable {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooOOOO f14470OooO00o;

            public RunnableC5059OooO0oO(OooOOOO oooOOOO) {
                this.f14470OooO00o = oooOOOO;
            }

            public void run() {
                IBinder asBinder = this.f14470OooO00o.asBinder();
                OooO0o remove = MediaBrowserServiceCompat.this.f14425OooO00o.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$OooOOO$OooO0oo  reason: case insensitive filesystem */
        public class RunnableC5060OooO0oo implements Runnable {
            public final /* synthetic */ Bundle OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ ResultReceiver f14471OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooOOOO f14473OooO00o;
            public final /* synthetic */ String o0ooOOo;

            public RunnableC5060OooO0oo(OooOOOO oooOOOO, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f14473OooO00o = oooOOOO;
                this.o0ooOOo = str;
                this.OooO00o = bundle;
                this.f14471OooO00o = resultReceiver;
            }

            public void run() {
                OooO0o oooO0o = MediaBrowserServiceCompat.this.f14425OooO00o.get(this.f14473OooO00o.asBinder());
                if (oooO0o == null) {
                    String str = "search for callback that isn't registered query=" + this.o0ooOOo;
                    return;
                }
                MediaBrowserServiceCompat.this.OooO0O0(this.o0ooOOo, this.OooO00o, oooO0o, this.f14471OooO00o);
            }
        }

        public OooOOO() {
        }

        public void OooO00o(String str, int i, int i2, Bundle bundle, OooOOOO oooOOOO) {
            if (MediaBrowserServiceCompat.this.OooO00o(str, i2)) {
                MediaBrowserServiceCompat.this.f14424OooO00o.OooO00o(new OooO00o(oooOOOO, str, i, i2, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }

        public void OooO0O0(OooOOOO oooOOOO) {
            MediaBrowserServiceCompat.this.f14424OooO00o.OooO00o(new RunnableC5059OooO0oO(oooOOOO));
        }

        public void OooO0O0(String str, Bundle bundle, ResultReceiver resultReceiver, OooOOOO oooOOOO) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f14424OooO00o.OooO00o(new OooO(oooOOOO, str, bundle, resultReceiver));
            }
        }

        public void OooO00o(OooOOOO oooOOOO) {
            MediaBrowserServiceCompat.this.f14424OooO00o.OooO00o(new OooO0O0(oooOOOO));
        }

        public void OooO00o(String str, IBinder iBinder, Bundle bundle, OooOOOO oooOOOO) {
            MediaBrowserServiceCompat.this.f14424OooO00o.OooO00o(new OooO0OO(oooOOOO, str, iBinder, bundle));
        }

        public void OooO00o(String str, IBinder iBinder, OooOOOO oooOOOO) {
            MediaBrowserServiceCompat.this.f14424OooO00o.OooO00o(new RunnableC5057OooO0Oo(oooOOOO, str, iBinder));
        }

        public void OooO00o(String str, ResultReceiver resultReceiver, OooOOOO oooOOOO) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f14424OooO00o.OooO00o(new RunnableC5058OooO0o0(oooOOOO, str, resultReceiver));
            }
        }

        public void OooO00o(OooOOOO oooOOOO, String str, int i, int i2, Bundle bundle) {
            MediaBrowserServiceCompat.this.f14424OooO00o.OooO00o(new OooO0o(oooOOOO, str, i, i2, bundle));
        }

        public void OooO00o(String str, Bundle bundle, ResultReceiver resultReceiver, OooOOOO oooOOOO) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f14424OooO00o.OooO00o(new RunnableC5060OooO0oo(oooOOOO, str, bundle, resultReceiver));
            }
        }
    }

    public interface OooOOOO {
        void OooO00o() throws RemoteException;

        void OooO00o(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;

        void OooO00o(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$OooOOo0  reason: case insensitive filesystem */
    public final class HandlerC5062OooOOo0 extends Handler {
        public final OooOOO OooO00o = new OooOOO();

        public HandlerC5062OooOOo0() {
        }

        public void OooO00o(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle(C7231o00ooOOo.f19755OooOO0O);
                    MediaSessionCompat.ensureClassLoader(bundle);
                    this.OooO00o.OooO00o(data.getString(C7231o00ooOOo.f19745OooO), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C5061OooOOOo(message.replyTo));
                    return;
                case 2:
                    this.OooO00o.OooO00o(new C5061OooOOOo(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle(C7231o00ooOOo.f19752OooO0oO);
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    this.OooO00o.OooO00o(data.getString(C7231o00ooOOo.f19749OooO0Oo), C6990o000O0oo.OooO00o(data, C7231o00ooOOo.f19746OooO00o), bundle2, new C5061OooOOOo(message.replyTo));
                    return;
                case 4:
                    this.OooO00o.OooO00o(data.getString(C7231o00ooOOo.f19749OooO0Oo), C6990o000O0oo.OooO00o(data, C7231o00ooOOo.f19746OooO00o), new C5061OooOOOo(message.replyTo));
                    return;
                case 5:
                    this.OooO00o.OooO00o(data.getString(C7231o00ooOOo.f19749OooO0Oo), (ResultReceiver) data.getParcelable(C7231o00ooOOo.f19754OooOO0), new C5061OooOOOo(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(C7231o00ooOOo.f19755OooOO0O);
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    this.OooO00o.OooO00o(new C5061OooOOOo(message.replyTo), data.getString(C7231o00ooOOo.f19745OooO), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.OooO00o.OooO0O0(new C5061OooOOOo(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle(C7231o00ooOOo.f19756OooOO0o);
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    this.OooO00o.OooO00o(data.getString(C7231o00ooOOo.f19758OooOOO0), bundle4, (ResultReceiver) data.getParcelable(C7231o00ooOOo.f19754OooOO0), new C5061OooOOOo(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle(C7231o00ooOOo.f19759OooOOOO);
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    this.OooO00o.OooO0O0(data.getString(C7231o00ooOOo.f19757OooOOO), bundle5, (ResultReceiver) data.getParcelable(C7231o00ooOOo.f19754OooOO0), new C5061OooOOOo(message.replyTo));
                    return;
                default:
                    String str = "Unhandled message: " + message + "\n  Service version: " + 2 + "\n  Client version: " + message.arg1;
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    @Nullable
    public abstract C5052OooO0o0 OooO00o(@NonNull String str, int i, @Nullable Bundle bundle);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void OooO00o(Context context) {
        attachBaseContext(context);
    }

    public abstract void OooO00o(@NonNull String str, @NonNull OooOOO0<List<MediaBrowserCompat.MediaItem>> oooOOO0);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO0O0(String str) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO0O0(String str, Bundle bundle) {
    }

    public void OooO0O0(String str, @NonNull OooOOO0<MediaBrowserCompat.MediaItem> oooOOO0) {
        oooOOO0.OooO00o(2);
        oooOOO0.OooO0O0((MediaBrowserCompat.MediaItem) null);
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public IBinder onBind(Intent intent) {
        return this.f14423OooO00o.onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f14423OooO00o = new OooOO0O();
        } else if (i >= 26) {
            this.f14423OooO00o = new OooOO0();
        } else if (i >= 23) {
            this.f14423OooO00o = new OooO();
        } else if (i >= 21) {
            this.f14423OooO00o = new C5054OooO0oo();
        } else {
            this.f14423OooO00o = new C5056OooOO0o();
        }
        this.f14423OooO00o.onCreate();
    }

    @RequiresApi(26)
    public class OooOO0 extends OooO implements C7235o00ooOoO.OooO0OO {

        public class OooO00o extends OooOOO0<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C7235o00ooOoO.OooO0O0 f14449OooO00o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OooO00o(Object obj, C7235o00ooOoO.OooO0O0 oooO0O0) {
                super(obj);
                this.f14449OooO00o = oooO0O0;
            }

            public void OooO00o(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f14449OooO00o.OooO00o(arrayList, OooO00o());
            }

            @Override // androidx.media.MediaBrowserServiceCompat.OooOOO0, androidx.media.MediaBrowserServiceCompat.OooOOO0, androidx.media.MediaBrowserServiceCompat.OooOOO0
            public void OooO00o() {
                this.f14449OooO00o.OooO00o();
            }
        }

        public OooOO0() {
            super();
        }

        @Override // com.p118pd.sdk.C7235o00ooOoO.OooO0OO
        public void OooO00o(String str, C7235o00ooOoO.OooO0O0 oooO0O0, Bundle bundle) {
            MediaBrowserServiceCompat.this.OooO00o(str, new OooO00o(str, oooO0O0), bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C5054OooO0oo
        public void OooO0OO(String str, Bundle bundle) {
            if (bundle != null) {
                C7235o00ooOoO.OooO00o(((C5054OooO0oo) this).f14442OooO00o, str, bundle);
            } else {
                super.OooO0OO(str, bundle);
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C5054OooO0oo, androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO, androidx.media.MediaBrowserServiceCompat.OooO
        public void onCreate() {
            Object OooO00o2 = C7235o00ooOoO.OooO00o(MediaBrowserServiceCompat.this, this);
            ((C5054OooO0oo) this).f14442OooO00o = OooO00o2;
            C7233o00ooOo0.OooO00o(OooO00o2);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C5054OooO0oo, androidx.media.MediaBrowserServiceCompat.C5054OooO0oo, androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO, androidx.media.MediaBrowserServiceCompat.AbstractC5053OooO0oO
        public Bundle OooO00o() {
            OooO0o oooO0o = MediaBrowserServiceCompat.this.f14422OooO00o;
            if (oooO0o == null) {
                return C7235o00ooOoO.OooO00o(((C5054OooO0oo) this).f14442OooO00o);
            }
            if (oooO0o.f14433OooO00o == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.f14422OooO00o.f14433OooO00o);
        }
    }

    public void OooO00o(@NonNull String str, @NonNull OooOOO0<List<MediaBrowserCompat.MediaItem>> oooOOO0, @NonNull Bundle bundle) {
        oooOOO0.OooO00o(1);
        OooO00o(str, oooOOO0);
    }

    public void OooO0O0(@NonNull String str, Bundle bundle, @NonNull OooOOO0<List<MediaBrowserCompat.MediaItem>> oooOOO0) {
        oooOOO0.OooO00o(4);
        oooOOO0.OooO0O0((List<MediaBrowserCompat.MediaItem>) null);
    }

    public static class OooOOO0<T> {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object f14474OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14475OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;
        public boolean OooO0Oo;

        public OooOOO0(Object obj) {
            this.f14474OooO00o = obj;
        }

        private void OooO0o0(Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS)) {
                float f = bundle.getFloat(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS);
                if (f < -1.0E-5f || f > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
                }
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14690OooO00o() {
            if (this.f14475OooO00o) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f14474OooO00o);
            } else if (this.OooO0O0) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f14474OooO00o);
            } else if (!this.OooO0Oo) {
                this.f14475OooO00o = true;
            } else {
                throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f14474OooO00o);
            }
        }

        public void OooO00o(T t) {
        }

        public void OooO0O0(T t) {
            if (this.OooO0O0 || this.OooO0Oo) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f14474OooO00o);
            }
            this.OooO0O0 = true;
            OooO00o((Object) t);
        }

        public void OooO0OO(Bundle bundle) {
            if (this.OooO0O0 || this.OooO0Oo) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f14474OooO00o);
            }
            this.OooO0Oo = true;
            OooO00o(bundle);
        }

        public void OooO0Oo(Bundle bundle) {
            if (this.OooO0O0 || this.OooO0Oo) {
                throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.f14474OooO00o);
            }
            OooO0o0(bundle);
            this.OooO0OO = true;
            OooO0O0(bundle);
        }

        public void OooO0O0(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.f14474OooO00o);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14691OooO00o() {
            return this.f14475OooO00o || this.OooO0O0 || this.OooO0Oo;
        }

        public void OooO00o(int i) {
            this.OooO00o = i;
        }

        public int OooO00o() {
            return this.OooO00o;
        }

        public void OooO00o(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f14474OooO00o);
        }
    }

    public void OooO00o(@NonNull String str, Bundle bundle, @NonNull OooOOO0<Bundle> oooOOO0) {
        oooOOO0.OooO0OO(null);
    }

    public void OooO00o(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        } else if (this.OooO00o == null) {
            this.OooO00o = token;
            this.f14423OooO00o.OooO00o(token);
        } else {
            throw new IllegalStateException("The session token has already been set.");
        }
    }

    public void OooO0O0(String str, Bundle bundle, OooO0o oooO0o, ResultReceiver resultReceiver) {
        OooO0OO oooO0OO = new OooO0OO(str, resultReceiver);
        this.f14422OooO00o = oooO0o;
        OooO0O0(str, bundle, oooO0OO);
        this.f14422OooO00o = null;
        if (!oooO0OO.m14691OooO00o()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$OooOOOo  reason: case insensitive filesystem */
    public static class C5061OooOOOo implements OooOOOO {
        public final Messenger OooO00o;

        public C5061OooOOOo(Messenger messenger) {
            this.OooO00o = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooOOOO
        public void OooO00o(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(C7231o00ooOOo.f19761OooOOo0, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(C7231o00ooOOo.f19749OooO0Oo, str);
            bundle2.putParcelable(C7231o00ooOOo.f19750OooO0o, token);
            bundle2.putBundle(C7231o00ooOOo.f19755OooOO0O, bundle);
            OooO00o(1, bundle2);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooOOOO
        public IBinder asBinder() {
            return this.OooO00o.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooOOOO
        public void OooO00o() throws RemoteException {
            OooO00o(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooOOOO
        public void OooO00o(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString(C7231o00ooOOo.f19749OooO0Oo, str);
            bundle3.putBundle(C7231o00ooOOo.f19752OooO0oO, bundle);
            bundle3.putBundle(C7231o00ooOOo.f19753OooO0oo, bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList(C7231o00ooOOo.f19751OooO0o0, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            OooO00o(3, bundle3);
        }

        private void OooO00o(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.OooO00o.send(obtain);
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public MediaSessionCompat.Token m14684OooO00o() {
        return this.OooO00o;
    }

    public final Bundle OooO00o() {
        return this.f14423OooO00o.OooO00o();
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C7236o00ooOoo.OooO0O0 m14685OooO00o() {
        return this.f14423OooO00o.m14687OooO00o();
    }

    public void OooO00o(@NonNull String str) {
        if (str != null) {
            this.f14423OooO00o.OooO00o(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void OooO00o(@NonNull String str, @NonNull Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.f14423OooO00o.OooO00o(str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(@NonNull C7236o00ooOoo.OooO0O0 oooO0O0, @NonNull String str, @NonNull Bundle bundle) {
        if (oooO0O0 == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        } else if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.f14423OooO00o.OooO00o(oooO0O0, str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    public boolean OooO00o(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void OooO00o(String str, OooO0o oooO0o, IBinder iBinder, Bundle bundle) {
        List<C7085o00OO0O0<IBinder, Bundle>> list = oooO0o.f14439OooO00o.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C7085o00OO0O0<IBinder, Bundle> o00oo0o0 : list) {
            if (iBinder == o00oo0o0.OooO00o && C7229o00ooOO.OooO00o(bundle, o00oo0o0.OooO0O0)) {
                return;
            }
        }
        list.add(new C7085o00OO0O0<>(iBinder, bundle));
        oooO0o.f14439OooO00o.put(str, list);
        OooO00o(str, oooO0o, bundle, (Bundle) null);
        this.f14422OooO00o = oooO0o;
        OooO0O0(str, bundle);
        this.f14422OooO00o = null;
    }

    public boolean OooO00o(String str, OooO0o oooO0o, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (oooO0o.f14439OooO00o.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.f14422OooO00o = oooO0o;
                OooO0O0(str);
                this.f14422OooO00o = null;
            }
        } else {
            List<C7085o00OO0O0<IBinder, Bundle>> list = oooO0o.f14439OooO00o.get(str);
            if (list != null) {
                Iterator<C7085o00OO0O0<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().OooO00o) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    oooO0o.f14439OooO00o.remove(str);
                }
            }
            this.f14422OooO00o = oooO0o;
            OooO0O0(str);
            this.f14422OooO00o = null;
            return z2;
        }
    }

    public void OooO00o(String str, OooO0o oooO0o, Bundle bundle, Bundle bundle2) {
        OooO00o oooO00o = new OooO00o(str, oooO0o, str, bundle, bundle2);
        this.f14422OooO00o = oooO0o;
        if (bundle == null) {
            OooO00o(str, oooO00o);
        } else {
            OooO00o(str, oooO00o, bundle);
        }
        this.f14422OooO00o = null;
        if (!oooO00o.m14691OooO00o()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + oooO0o.f14438OooO00o + " id=" + str);
        }
    }

    public List<MediaBrowserCompat.MediaItem> OooO00o(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    public void OooO00o(String str, OooO0o oooO0o, ResultReceiver resultReceiver) {
        OooO0O0 oooO0O0 = new OooO0O0(str, resultReceiver);
        this.f14422OooO00o = oooO0o;
        OooO0O0(str, oooO0O0);
        this.f14422OooO00o = null;
        if (!oooO0O0.m14691OooO00o()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    public void OooO00o(String str, Bundle bundle, OooO0o oooO0o, ResultReceiver resultReceiver) {
        C5051OooO0Oo oooO0Oo = new C5051OooO0Oo(str, resultReceiver);
        this.f14422OooO00o = oooO0o;
        OooO00o(str, bundle, oooO0Oo);
        this.f14422OooO00o = null;
        if (!oooO0Oo.m14691OooO00o()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }
}
