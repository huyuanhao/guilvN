package com.p118pd.sdk;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.p118pd.sdk.AbstractC7221o00oo0o;
import com.umeng.message.proguard.C3848l;
import com.yongchun.library.C4695R;
import com.yongchun.library.model.LocalMedia;
import com.yongchun.library.model.LocalMediaFolder;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.pd.sdk.oooO0O0o  reason: case insensitive filesystem */
public class C9128oooO0O0o {
    public static final String[] OooO00o = {"_data", "_display_name", "date_added", C3848l.f10389g};
    public static final int OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String[] f22603OooO0O0 = {"_data", "_display_name", "date_added", C3848l.f10389g, "duration"};
    public static final int OooO0OO = 2;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f22604OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public FragmentActivity f22605OooO00o;

    /* renamed from: com.pd.sdk.oooO0O0o$OooO00o */
    public class OooO00o implements AbstractC7221o00oo0o.OooO00o<Cursor> {
        public final /* synthetic */ OooO0OO OooO00o;

        public OooO00o(OooO0OO oooO0OO) {
            this.OooO00o = oooO0OO;
        }

        /* renamed from: OooO00o */
        public void onLoadFinished(C7226o00ooO00<Cursor> o00ooo00, Cursor cursor) {
            ArrayList arrayList = new ArrayList();
            LocalMediaFolder localMediaFolder = new LocalMediaFolder();
            ArrayList arrayList2 = new ArrayList();
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                do {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow(C9128oooO0O0o.OooO00o[0]));
                    if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                        cursor.getString(cursor.getColumnIndexOrThrow(C9128oooO0O0o.OooO00o[1]));
                        LocalMedia localMedia = new LocalMedia(string, cursor.getLong(cursor.getColumnIndexOrThrow(C9128oooO0O0o.OooO00o[2])), (long) (C9128oooO0O0o.this.f22604OooO00o == 2 ? cursor.getInt(cursor.getColumnIndexOrThrow(C9128oooO0O0o.f22603OooO0O0[4])) : 0));
                        LocalMediaFolder OooO00o2 = C9128oooO0O0o.this.OooO00o((C9128oooO0O0o) string, (String) arrayList);
                        Log.i("FolderName", OooO00o2.getName());
                        OooO00o2.getImages().add(localMedia);
                        OooO00o2.setImageNum(OooO00o2.getImageNum() + 1);
                        arrayList2.add(localMedia);
                        localMediaFolder.setImageNum(localMediaFolder.getImageNum() + 1);
                    }
                } while (cursor.moveToNext());
                localMediaFolder.setFirstImagePath(arrayList2.get(0).getPath());
                localMediaFolder.setName(C9128oooO0O0o.this.f22605OooO00o.getString(C4695R.string.all_image));
                localMediaFolder.setImages(arrayList2);
                arrayList.add(localMediaFolder);
                C9128oooO0O0o.this.OooO00o((C9128oooO0O0o) arrayList);
                this.OooO00o.OooO00o(arrayList);
            }
        }

        @Override // com.p118pd.sdk.AbstractC7221o00oo0o.OooO00o
        public C7226o00ooO00<Cursor> onCreateLoader(int i, Bundle bundle) {
            if (i == 1) {
                FragmentActivity fragmentActivity = C9128oooO0O0o.this.f22605OooO00o;
                Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                String[] strArr = C9128oooO0O0o.OooO00o;
                String[] strArr2 = {"image/jpeg", "image/png"};
                return new C7213o00oo(fragmentActivity, uri, strArr, "mime_type=? or mime_type=?", strArr2, C9128oooO0O0o.OooO00o[2] + " DESC");
            } else if (i != 2) {
                return null;
            } else {
                FragmentActivity fragmentActivity2 = C9128oooO0O0o.this.f22605OooO00o;
                Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                String[] strArr3 = C9128oooO0O0o.f22603OooO0O0;
                return new C7213o00oo(fragmentActivity2, uri2, strArr3, null, null, C9128oooO0O0o.f22603OooO0O0[2] + " DESC");
            }
        }

        @Override // com.p118pd.sdk.AbstractC7221o00oo0o.OooO00o
        public void onLoaderReset(C7226o00ooO00<Cursor> o00ooo00) {
        }
    }

    /* renamed from: com.pd.sdk.oooO0O0o$OooO0O0 */
    public class OooO0O0 implements Comparator<LocalMediaFolder> {
        public OooO0O0() {
        }

        /* renamed from: OooO00o */
        public int compare(LocalMediaFolder localMediaFolder, LocalMediaFolder localMediaFolder2) {
            int imageNum;
            int imageNum2;
            if (localMediaFolder.getImages() == null || localMediaFolder2.getImages() == null || (imageNum = localMediaFolder.getImageNum()) == (imageNum2 = localMediaFolder2.getImageNum())) {
                return 0;
            }
            return imageNum < imageNum2 ? 1 : -1;
        }
    }

    /* renamed from: com.pd.sdk.oooO0O0o$OooO0OO */
    public interface OooO0OO {
        void OooO00o(List<LocalMediaFolder> list);
    }

    public C9128oooO0O0o(FragmentActivity fragmentActivity, int i) {
        this.f22605OooO00o = fragmentActivity;
        this.f22604OooO00o = i;
    }

    public void OooO00o(OooO0OO oooO0OO) {
        this.f22605OooO00o.getSupportLoaderManager().OooO00o(this.f22604OooO00o, null, new OooO00o(oooO0OO));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(List<LocalMediaFolder> list) {
        Collections.sort(list, new OooO0O0());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private LocalMediaFolder OooO00o(String str, List<LocalMediaFolder> list) {
        File parentFile = new File(str).getParentFile();
        for (LocalMediaFolder localMediaFolder : list) {
            if (localMediaFolder.getName().equals(parentFile.getName())) {
                return localMediaFolder;
            }
        }
        LocalMediaFolder localMediaFolder2 = new LocalMediaFolder();
        localMediaFolder2.setName(parentFile.getName());
        localMediaFolder2.setPath(parentFile.getAbsolutePath());
        localMediaFolder2.setFirstImagePath(str);
        list.add(localMediaFolder2);
        return localMediaFolder2;
    }
}
