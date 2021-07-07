package com.netease.nimlib.sdk;

import java.io.Serializable;

public class NimStrings implements Serializable {
    public static final NimStrings DEFAULT = new NimStrings();
    public String status_bar_audio_message = "%1$s发来一条语音消息";
    public String status_bar_avchat_message = "%1$s: 音视频通话";
    public String status_bar_custom_message = "%1$s: 自定义消息";
    public String status_bar_file_message = "%1$s发来一条文件消息";
    public String status_bar_hidden_message_content = "你收到一条新消息";
    public String status_bar_image_message = "%1$s发来一条图片消息";
    public String status_bar_location_message = "%1$s分享了一个地理位置";
    public String status_bar_multi_messages_incoming = "%1$d位联系人有新消息";
    public String status_bar_notification_message = "%1$s: 通知消息";
    public String status_bar_ticker_text = "%1$s有新消息";
    public String status_bar_tip_message = "%1$s: 提醒消息";
    public String status_bar_unsupported_message = "%1$s: 无法显示该内容";
    public String status_bar_video_message = "%1$s发来一条视频消息";
}
