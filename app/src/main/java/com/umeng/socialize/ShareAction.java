package com.umeng.socialize;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMEmoji;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMMin;
import com.umeng.socialize.media.UMVideo;
import com.umeng.socialize.media.UMWeb;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.media.UMusic;
import com.umeng.socialize.shareboard.ShareBoard;
import com.umeng.socialize.shareboard.ShareBoardConfig;
import com.umeng.socialize.shareboard.SnsPlatform;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.ShareBoardlistener;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ShareAction {

    /* renamed from: a */
    public ShareContent f10617a = new ShareContent();

    /* renamed from: b */
    public SHARE_MEDIA f10618b = null;

    /* renamed from: c */
    public UMShareListener f10619c = null;

    /* renamed from: d */
    public ShareBoardlistener f10620d = null;

    /* renamed from: e */
    public Activity f10621e;

    /* renamed from: f */
    public List<SHARE_MEDIA> f10622f = null;

    /* renamed from: g */
    public List<SnsPlatform> f10623g = new ArrayList();

    /* renamed from: h */
    public List<ShareContent> f10624h = new ArrayList();

    /* renamed from: i */
    public List<UMShareListener> f10625i = new ArrayList();

    /* renamed from: j */
    public int f10626j = 80;

    /* renamed from: k */
    public View f10627k = null;

    /* renamed from: l */
    public ShareBoard f10628l;

    /* renamed from: m */
    public ShareBoardlistener f10629m = new ShareBoardlistener() {
        /* class com.umeng.socialize.ShareAction.C38961 */

        @Override // com.umeng.socialize.utils.ShareBoardlistener
        public void onclick(SnsPlatform snsPlatform, SHARE_MEDIA share_media) {
            ShareAction.this.setPlatform(share_media);
            ShareAction.this.share();
        }
    };

    /* renamed from: n */
    public ShareBoardlistener f10630n = new ShareBoardlistener() {
        /* class com.umeng.socialize.ShareAction.C38972 */

        @Override // com.umeng.socialize.utils.ShareBoardlistener
        public void onclick(SnsPlatform snsPlatform, SHARE_MEDIA share_media) {
            ShareContent shareContent;
            int indexOf = ShareAction.this.f10622f.indexOf(share_media);
            int size = ShareAction.this.f10624h.size();
            if (size != 0) {
                if (indexOf < size) {
                    shareContent = (ShareContent) ShareAction.this.f10624h.get(indexOf);
                } else {
                    shareContent = (ShareContent) ShareAction.this.f10624h.get(size - 1);
                }
                ShareAction.this.f10617a = shareContent;
            }
            int size2 = ShareAction.this.f10625i.size();
            if (size2 != 0) {
                if (indexOf < size2) {
                    ShareAction shareAction = ShareAction.this;
                    shareAction.f10619c = (UMShareListener) shareAction.f10625i.get(indexOf);
                } else {
                    ShareAction shareAction2 = ShareAction.this;
                    shareAction2.f10619c = (UMShareListener) shareAction2.f10625i.get(size2 - 1);
                }
            }
            ShareAction.this.setPlatform(share_media);
            ShareAction.this.share();
        }
    };

    public ShareAction(Activity activity) {
        if (activity != null) {
            this.f10621e = (Activity) new WeakReference(activity).get();
        }
    }

    public static Rect locateView(View view) {
        int[] iArr = new int[2];
        if (view == null) {
            return null;
        }
        try {
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            int i = iArr[0];
            rect.left = i;
            rect.top = iArr[1];
            rect.right = i + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
            return rect;
        } catch (NullPointerException e) {
            SLog.error(e);
            return null;
        }
    }

    public ShareAction addButton(String str, String str2, String str3, String str4) {
        this.f10623g.add(SHARE_MEDIA.createSnsPlatform(str, str2, str3, str4, 0));
        return this;
    }

    public void close() {
        ShareBoard shareBoard = this.f10628l;
        if (shareBoard != null) {
            shareBoard.dismiss();
            this.f10628l = null;
        }
    }

    public SHARE_MEDIA getPlatform() {
        return this.f10618b;
    }

    public ShareContent getShareContent() {
        return this.f10617a;
    }

    public boolean getUrlValid() {
        UMediaObject uMediaObject;
        ShareContent shareContent = this.f10617a;
        return shareContent == null || (uMediaObject = shareContent.mMedia) == null || !(uMediaObject instanceof UMWeb) || uMediaObject.toUrl() == null || this.f10617a.mMedia.toUrl().startsWith("http");
    }

    public void open(ShareBoardConfig shareBoardConfig) {
        if (this.f10623g.size() != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, this.f10619c);
            hashMap.put("content", this.f10617a);
            try {
                ShareBoard shareBoard = new ShareBoard(this.f10621e, this.f10623g, shareBoardConfig);
                this.f10628l = shareBoard;
                if (this.f10620d == null) {
                    shareBoard.setShareBoardlistener(this.f10630n);
                } else {
                    shareBoard.setShareBoardlistener(this.f10620d);
                }
                this.f10628l.setFocusable(true);
                this.f10628l.setBackgroundDrawable(new BitmapDrawable());
                if (this.f10627k == null) {
                    this.f10627k = this.f10621e.getWindow().getDecorView();
                }
                this.f10628l.showAtLocation(this.f10627k, this.f10626j, 0, 0);
            } catch (Exception e) {
                SLog.error(e);
            }
        } else {
            this.f10623g.add(SHARE_MEDIA.WEIXIN.toSnsPlatform());
            this.f10623g.add(SHARE_MEDIA.WEIXIN_CIRCLE.toSnsPlatform());
            this.f10623g.add(SHARE_MEDIA.SINA.toSnsPlatform());
            this.f10623g.add(SHARE_MEDIA.QQ.toSnsPlatform());
            HashMap hashMap2 = new HashMap();
            hashMap2.put(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, this.f10619c);
            hashMap2.put("content", this.f10617a);
            ShareBoard shareBoard2 = new ShareBoard(this.f10621e, this.f10623g, shareBoardConfig);
            this.f10628l = shareBoard2;
            ShareBoardlistener shareBoardlistener = this.f10620d;
            if (shareBoardlistener == null) {
                shareBoard2.setShareBoardlistener(this.f10629m);
            } else {
                shareBoard2.setShareBoardlistener(shareBoardlistener);
            }
            this.f10628l.setFocusable(true);
            this.f10628l.setBackgroundDrawable(new BitmapDrawable());
            if (this.f10627k == null) {
                this.f10627k = this.f10621e.getWindow().getDecorView();
            }
            this.f10628l.showAtLocation(this.f10627k, 80, 0, 0);
        }
    }

    public ShareAction setCallback(UMShareListener uMShareListener) {
        this.f10619c = uMShareListener;
        return this;
    }

    @Deprecated
    public ShareAction setContentList(ShareContent... shareContentArr) {
        if (shareContentArr == null || Arrays.asList(shareContentArr).size() == 0) {
            ShareContent shareContent = new ShareContent();
            shareContent.mText = "empty";
            this.f10624h.add(shareContent);
        } else {
            this.f10624h = Arrays.asList(shareContentArr);
        }
        return this;
    }

    public ShareAction setDisplayList(SHARE_MEDIA... share_mediaArr) {
        this.f10622f = Arrays.asList(share_mediaArr);
        this.f10623g.clear();
        for (SHARE_MEDIA share_media : this.f10622f) {
            this.f10623g.add(share_media.toSnsPlatform());
        }
        return this;
    }

    @Deprecated
    public ShareAction setListenerList(UMShareListener... uMShareListenerArr) {
        this.f10625i = Arrays.asList(uMShareListenerArr);
        return this;
    }

    public ShareAction setPlatform(SHARE_MEDIA share_media) {
        this.f10618b = share_media;
        return this;
    }

    public ShareAction setShareContent(ShareContent shareContent) {
        this.f10617a = shareContent;
        return this;
    }

    public ShareAction setShareboardclickCallback(ShareBoardlistener shareBoardlistener) {
        this.f10620d = shareBoardlistener;
        return this;
    }

    public void share() {
        UMShareAPI.get(this.f10621e).doShare(this.f10621e, this, this.f10619c);
    }

    public ShareAction withApp(File file) {
        this.f10617a.app = file;
        return this;
    }

    public ShareAction withExtra(UMImage uMImage) {
        this.f10617a.mExtra = uMImage;
        return this;
    }

    public ShareAction withFile(File file) {
        this.f10617a.file = file;
        return this;
    }

    public ShareAction withFollow(String str) {
        this.f10617a.mFollow = str;
        return this;
    }

    public ShareAction withMedia(UMImage uMImage) {
        this.f10617a.mMedia = uMImage;
        return this;
    }

    public ShareAction withMedias(UMImage... uMImageArr) {
        if (uMImageArr != null && uMImageArr.length > 0) {
            this.f10617a.mMedia = uMImageArr[0];
        }
        this.f10617a.mMedias = uMImageArr;
        return this;
    }

    public ShareAction withShareBoardDirection(View view, int i) {
        this.f10626j = i;
        this.f10627k = view;
        return this;
    }

    public ShareAction withSubject(String str) {
        this.f10617a.subject = str;
        return this;
    }

    public ShareAction withText(String str) {
        this.f10617a.mText = str;
        return this;
    }

    public ShareAction withMedia(UMMin uMMin) {
        this.f10617a.mMedia = uMMin;
        return this;
    }

    public ShareAction withMedia(UMEmoji uMEmoji) {
        this.f10617a.mMedia = uMEmoji;
        return this;
    }

    public ShareAction withMedia(UMWeb uMWeb) {
        this.f10617a.mMedia = uMWeb;
        return this;
    }

    public ShareAction withMedia(UMusic uMusic) {
        this.f10617a.mMedia = uMusic;
        return this;
    }

    public ShareAction withMedia(UMVideo uMVideo) {
        this.f10617a.mMedia = uMVideo;
        return this;
    }

    public void open() {
        open(null);
    }
}
