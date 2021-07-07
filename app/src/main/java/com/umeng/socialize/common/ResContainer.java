package com.umeng.socialize.common;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import com.umeng.socialize.utils.UmengText;
import com.umeng.socialize.utils.UrlUtil;
import java.util.HashMap;
import java.util.Map;

public final class ResContainer {

    /* renamed from: R */
    public static ResContainer f10718R = null;
    public static String mPackageName = "";
    public Context context = null;
    public Map<String, SocializeResource> mResources;
    public Map<String, Integer> map = new HashMap();

    public static class SocializeResource {
        public int mId;
        public boolean mIsCompleted = false;
        public String mName;
        public String mType;

        public SocializeResource(String str, String str2) {
            this.mType = str;
            this.mName = str2;
        }
    }

    public ResContainer(Context context2) {
        this.context = context2.getApplicationContext();
    }

    public static synchronized ResContainer get(Context context2) {
        ResContainer resContainer;
        synchronized (ResContainer.class) {
            if (f10718R == null) {
                f10718R = new ResContainer(context2);
            }
            resContainer = f10718R;
        }
        return resContainer;
    }

    public static int getResourceId(Context context2, String str, String str2) {
        Resources resources = context2.getResources();
        if (TextUtils.isEmpty(mPackageName)) {
            mPackageName = context2.getPackageName();
        }
        int identifier = resources.getIdentifier(str2, str, mPackageName);
        if (identifier > 0) {
            return identifier;
        }
        throw new RuntimeException(UmengText.errorWithUrl(UmengText.resError(mPackageName, str, str2), UrlUtil.ALL_NO_RES));
    }

    public static String getString(Context context2, String str) {
        return context2.getString(getResourceId(context2, "string", str));
    }

    public int anim(String str) {
        return getResourceId(this.context, "anim", str);
    }

    public synchronized Map<String, SocializeResource> batch() {
        if (this.mResources == null) {
            return this.mResources;
        }
        for (String str : this.mResources.keySet()) {
            SocializeResource socializeResource = this.mResources.get(str);
            socializeResource.mId = getResourceId(this.context, socializeResource.mType, socializeResource.mName);
            socializeResource.mIsCompleted = true;
        }
        return this.mResources;
    }

    public int color(String str) {
        return getResourceId(this.context, ViewProps.COLOR, str);
    }

    public int dimen(String str) {
        return getResourceId(this.context, "dimen", str);
    }

    public int drawable(String str) {
        return getResourceId(this.context, "drawable", str);
    }

    /* renamed from: id */
    public int mo40288id(String str) {
        return getResourceId(this.context, "id", str);
    }

    public int layout(String str) {
        return getResourceId(this.context, "layout", str);
    }

    public int raw(String str) {
        return getResourceId(this.context, "raw", str);
    }

    public int string(String str) {
        return getResourceId(this.context, "string", str);
    }

    public int style(String str) {
        return getResourceId(this.context, "style", str);
    }

    public int styleable(String str) {
        return getResourceId(this.context, "styleable", str);
    }

    public ResContainer(Context context2, Map<String, SocializeResource> map2) {
        this.mResources = map2;
        this.context = context2;
    }
}
