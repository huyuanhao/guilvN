package com.qiyukf.unicorn.api.customization.title_bar;

import java.io.Serializable;

public class TitleBarConfig implements Serializable {
    public transient OnTitleBarRightBtnClickListener onTitleBarRightBtnClickListener;
    public int titleBarRightEvaluatorBtnBack;
    public int titleBarRightHumanBtnBack;
    public int titleBarRightImg;
    public int titleBarRightQuitBtnBack;
    public String titleBarRightText;
    public int titleBarRightTextColor;
}
