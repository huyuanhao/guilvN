package com.umeng.socialize.media;

import android.text.TextUtils;
import com.tencent.p269mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.p269mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p269mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p269mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p269mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p269mm.opensdk.modelmsg.WXTextObject;
import com.tencent.p269mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.p269mm.opensdk.modelmsg.WXWebpageObject;
import com.umeng.socialize.Config;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.utils.SocializeUtils;

public class WeiXinShareContent extends SimpleShareContent {
    public WeiXinShareContent(ShareContent shareContent) {
        super(shareContent);
    }

    private WXMediaMessage buildEmojiParams() {
        UMEmoji umEmoji = getUmEmoji();
        String file = (umEmoji == null || umEmoji.asFileImage() == null) ? "" : umEmoji.asFileImage().toString();
        WXEmojiObject wXEmojiObject = new WXEmojiObject();
        wXEmojiObject.emojiPath = file;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXEmojiObject;
        wXMediaMessage.thumbData = objectSetThumb(umEmoji);
        return wXMediaMessage;
    }

    private WXMediaMessage buildFileParams() {
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.fileData = SocializeUtils.File2byte(getFile());
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXFileObject;
        wXMediaMessage.description = getText();
        wXMediaMessage.title = getSubject();
        return wXMediaMessage;
    }

    private WXMediaMessage buildImageParams() {
        UMImage image = getImage();
        WXImageObject wXImageObject = new WXImageObject();
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXImageObject.imageData = image.asBinImage();
        if (canFileValid(image)) {
            wXImageObject.imagePath = image.asFileImage().toString();
            wXImageObject.imageData = null;
        } else {
            wXImageObject.imageData = getStrictImageData(image);
        }
        wXMediaMessage.thumbData = getImageThumb(image);
        wXMediaMessage.mediaObject = wXImageObject;
        return wXMediaMessage;
    }

    private WXMediaMessage buildMinApp() {
        UMMin umMin = getUmMin();
        WXMiniProgramObject wXMiniProgramObject = new WXMiniProgramObject();
        wXMiniProgramObject.webpageUrl = umMin.toUrl();
        wXMiniProgramObject.userName = umMin.getUserName();
        wXMiniProgramObject.path = umMin.getPath();
        wXMiniProgramObject.miniprogramType = Config.getMINITYPE();
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = objectSetTitle(umMin);
        wXMediaMessage.description = objectSetDescription(umMin);
        wXMediaMessage.thumbData = objectSetMInAppThumb(umMin);
        wXMediaMessage.mediaObject = wXMiniProgramObject;
        return wXMediaMessage;
    }

    private WXMediaMessage buildMusicParams() {
        UMusic music = getMusic();
        WXMusicObject wXMusicObject = new WXMusicObject();
        wXMusicObject.musicUrl = getMusicTargetUrl(music);
        wXMusicObject.musicDataUrl = music.toUrl();
        if (!TextUtils.isEmpty(music.getLowBandDataUrl())) {
            wXMusicObject.musicLowBandDataUrl = music.getLowBandDataUrl();
        }
        if (!TextUtils.isEmpty(music.getLowBandUrl())) {
            wXMusicObject.musicLowBandUrl = music.getLowBandUrl();
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.title = objectSetTitle(music);
        wXMediaMessage.description = objectSetDescription(music);
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.thumbData = objectSetThumb(music);
        return wXMediaMessage;
    }

    private WXMediaMessage buildTextParams() {
        WXTextObject wXTextObject = new WXTextObject();
        wXTextObject.text = objectSetText(getText());
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXTextObject;
        wXMediaMessage.description = objectSetText(getText(), 1024);
        return wXMediaMessage;
    }

    private WXMediaMessage buildUrlParams() {
        UMWeb umWeb = getUmWeb();
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = umWeb.toUrl();
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = objectSetTitle(umWeb);
        wXMediaMessage.description = objectSetDescription(umWeb);
        wXMediaMessage.mediaObject = wXWebpageObject;
        wXMediaMessage.thumbData = objectSetThumb(umWeb);
        return wXMediaMessage;
    }

    private WXMediaMessage buildVideoParams() {
        UMVideo video = getVideo();
        WXVideoObject wXVideoObject = new WXVideoObject();
        wXVideoObject.videoUrl = video.toUrl();
        if (!TextUtils.isEmpty(video.getLowBandUrl())) {
            wXVideoObject.videoLowBandUrl = video.getLowBandUrl();
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXVideoObject;
        wXMediaMessage.title = objectSetTitle(video);
        wXMediaMessage.description = objectSetDescription(video);
        wXMediaMessage.thumbData = objectSetThumb(video);
        return wXMediaMessage;
    }

    public WXMediaMessage getWxMediaMessage() {
        if (getmStyle() == 2 || getmStyle() == 3) {
            return buildImageParams();
        }
        if (getmStyle() == 4) {
            return buildMusicParams();
        }
        if (getmStyle() == 16) {
            return buildUrlParams();
        }
        if (getmStyle() == 8) {
            return buildVideoParams();
        }
        if (getmStyle() == 64) {
            return buildEmojiParams();
        }
        if (getmStyle() == 32) {
            return buildFileParams();
        }
        if (getmStyle() == 128) {
            return buildMinApp();
        }
        return buildTextParams();
    }
}
