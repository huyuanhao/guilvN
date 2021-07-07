package com.netease.nimlib.sdk;

import android.app.Activity;
import java.io.Serializable;

public class StatusBarNotificationConfig implements Serializable {
    public String customTitleWhenTeamNameEmpty;
    public String downTimeBegin;
    public String downTimeEnd;
    public boolean downTimeToggle = false;
    public boolean hideContent = false;
    public int ledARGB = -1;
    public int ledOffMs = -1;
    public int ledOnMs = -1;
    public int notificationColor;
    public Class<? extends Activity> notificationEntrance;
    public boolean notificationFolded = true;
    public int notificationSmallIconId;
    public String notificationSound;
    public boolean ring = true;
    public boolean showBadge = false;
    public boolean titleOnlyShowAppName = false;
    public boolean vibrate = true;
}
