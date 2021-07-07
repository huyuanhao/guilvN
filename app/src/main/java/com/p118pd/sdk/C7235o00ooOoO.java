package com.p118pd.sdk;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.p000v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import com.p118pd.sdk.C7232o00ooOo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(26)
/* renamed from: com.pd.sdk.o00ooOoO  reason: case insensitive filesystem */
public class C7235o00ooOoO {
    public static final String OooO00o = "MBSCompatApi26";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Field f19763OooO00o;

    /* renamed from: com.pd.sdk.o00ooOoO$OooO00o */
    public static class OooO00o extends C7232o00ooOo.OooO00o {
        public OooO00o(Context context, OooO0OO oooO0OO) {
            super(context, oooO0OO);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((OooO0OO) this.OooO00o).OooO00o(str, new OooO0O0(result), bundle);
        }
    }

    /* renamed from: com.pd.sdk.o00ooOoO$OooO0OO */
    public interface OooO0OO extends C7232o00ooOo.OooO0O0 {
        void OooO00o(String str, OooO0O0 oooO0O0, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f19763OooO00o = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    public static Object OooO00o(Context context, OooO0OO oooO0OO) {
        return new OooO00o(context, oooO0OO);
    }

    /* renamed from: com.pd.sdk.o00ooOoO$OooO0O0 */
    public static class OooO0O0 {
        public MediaBrowserService.Result OooO00o;

        public OooO0O0(MediaBrowserService.Result result) {
            this.OooO00o = result;
        }

        public void OooO00o(List<Parcel> list, int i) {
            try {
                C7235o00ooOoO.f19763OooO00o.setInt(this.OooO00o, i);
            } catch (IllegalAccessException unused) {
            }
            this.OooO00o.sendResult(OooO00o(list));
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

    public static void OooO00o(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }

    public static Bundle OooO00o(Object obj) {
        return ((MediaBrowserService) obj).getBrowserRootHints();
    }
}
