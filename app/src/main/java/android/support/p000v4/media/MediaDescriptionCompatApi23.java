package android.support.p000v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: android.support.v4.media.MediaDescriptionCompatApi23 */
public class MediaDescriptionCompatApi23 {

    /* renamed from: android.support.v4.media.MediaDescriptionCompatApi23$Builder */
    public static class Builder {
        public static void setMediaUri(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    public static Uri getMediaUri(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
