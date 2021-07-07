package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c;
import com.umeng.commonsdk.proguard.C3617o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ViewHierarchyDumper {
    public static JSONObject toJSON(View view) throws JSONException {
        UiThreadUtil.assertOnUiThread();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, view.getClass().getName());
        jSONObject.put(C3617o.f9367au, System.identityHashCode(view));
        Object tag = view.getTag();
        if (tag != null && (tag instanceof String)) {
            jSONObject.put("t", tag);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    jSONArray.put(i, toJSON(viewGroup.getChildAt(i)));
                }
                jSONObject.put(C2756c.f5722a, jSONArray);
            }
        }
        return jSONObject;
    }
}
