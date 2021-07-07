package com.qiyukf.unicorn.api.customization.action;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import com.qiyukf.nim.uikit.session.helper.C2016f;
import com.qiyukf.unicorn.api.msg.MessageService;
import com.qiyukf.unicorn.api.msg.UnicornMessageBuilder;
import java.io.File;

public class TakeVideoAction extends BaseAction {
    public int actionFontColor = 0;
    public transient C2016f videoMsgHelper;

    public TakeVideoAction(int i, int i2) {
        super(i, i2);
    }

    public TakeVideoAction(int i, String str) {
        super(i, str);
    }

    public TakeVideoAction(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private MediaPlayer getVideoMediaPlayer(File file) {
        try {
            return MediaPlayer.create(getActivity(), Uri.fromFile(file));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void initVideoMessageHelper() {
        this.videoMsgHelper = new C2016f(getFragment(), new C2016f.AbstractC2019a() {
            /* class com.qiyukf.unicorn.api.customization.action.TakeVideoAction.C24131 */

            @Override // com.qiyukf.nim.uikit.session.helper.C2016f.AbstractC2019a
            public void onVideoPicked(File file, String str) {
                MediaPlayer videoMediaPlayer = TakeVideoAction.this.getVideoMediaPlayer(file);
                MessageService.sendMessage(UnicornMessageBuilder.buildVideoMessage(file, videoMediaPlayer == null ? 0 : (long) videoMediaPlayer.getDuration(), videoMediaPlayer == null ? 0 : videoMediaPlayer.getVideoWidth(), videoMediaPlayer == null ? 0 : videoMediaPlayer.getVideoHeight(), file.getName()));
            }
        });
    }

    private C2016f videoHelper() {
        if (this.videoMsgHelper == null) {
            initVideoMessageHelper();
        }
        return this.videoMsgHelper;
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public int getActionFontColor() {
        int i = this.actionFontColor;
        return i == 0 ? super.getActionFontColor() : i;
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 11) {
            videoHelper().mo34470a(intent);
        }
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onClick() {
        videoHelper().mo34469a(makeRequestCode(11));
    }

    public void setActionFontColor(int i) {
        this.actionFontColor = i;
    }
}
