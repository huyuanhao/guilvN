package com.qiyukf.unicorn.api.msg;

import android.content.Context;
import java.io.Serializable;

public interface ProductReslectOnclickListener extends Serializable {
    void onClick(Context context, String str);
}
