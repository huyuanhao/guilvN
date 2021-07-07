package com.jinhui365.router.task;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.jinhui365.router.core.RouteRequest;
import com.p118pd.sdk.AbstractC8698oo0o00o;
import com.p118pd.sdk.C8700oo0o00oo;
import com.p118pd.sdk.C8701oo0o0O;
import com.p118pd.sdk.C8705oo0o0O0o;
import com.p118pd.sdk.C8713oo0o0o;
import java.util.Map;
import org.json.JSONObject;

public class ActivityTask implements AbstractC8698oo0o00o {
    public static final String TAG = "ActivityTask";
    public Class<?> activityClass = null;
    public Context context;
    public Map<String, Object> options;
    public C8705oo0o0O0o response;
    public C8700oo0o00oo routeContext;
    public RouteRequest routeRequest;

    private Intent getIntent() {
        if (this.activityClass == null) {
            this.response = new C8705oo0o0O0o(C8713oo0o0o.OooOO0O, this.routeRequest.getUrl() + ":ActivityClass no fund", this.routeContext);
            this.routeRequest.getCallback().OooO0O0(this.response);
            return null;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        if (this.routeRequest.getParams() != null && !this.routeRequest.getParams().isEmpty()) {
            for (String str : this.routeRequest.getParams().keySet()) {
                bundle.putAll(C8701oo0o0O.OooO00o(bundle, str, this.routeRequest.getParams().get(str)));
            }
        }
        intent.putExtras(bundle);
        intent.setClass(this.context, this.activityClass);
        return intent;
    }

    public void assembleAnim() {
        if (this.routeRequest.getEnterAnim() != 0 && this.routeRequest.getExitAnim() != 0) {
            ((Activity) this.context).overridePendingTransition(this.routeRequest.getEnterAnim(), this.routeRequest.getExitAnim());
        }
    }

    public Intent assembleFlagsIntent() {
        Intent intent = getIntent();
        if (intent != null) {
            intent.setFlags(this.routeRequest.getFlags());
        }
        return intent;
    }

    @Override // com.p118pd.sdk.AbstractC8698oo0o00o
    public void execute(C8700oo0o00oo oo0o00oo) {
        Intent assembleFlagsIntent;
        this.context = oo0o00oo.m20310OooO00o();
        this.routeContext = oo0o00oo;
        this.routeRequest = oo0o00oo.m20311OooO00o();
        if (initTaskData() && (this.context instanceof Activity) && (assembleFlagsIntent = assembleFlagsIntent()) != null) {
            if (this.routeRequest.getRequestCode() > 0) {
                ((Activity) this.context).startActivityForResult(assembleFlagsIntent, this.routeRequest.getRequestCode());
            } else {
                ((Activity) this.context).startActivity(assembleFlagsIntent);
            }
            assembleAnim();
            this.response = new C8705oo0o0O0o(200, this.routeRequest.getUrl() + "to success", oo0o00oo);
            this.routeRequest.getCallback().OooO00o(this.response);
        }
    }

    public Class<?> getActivityClass(String str) {
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public Context getContext() {
        return this.context;
    }

    public Map<String, Object> getOptions() {
        return this.options;
    }

    public C8705oo0o0O0o getResponse() {
        return this.response;
    }

    public C8700oo0o00oo getRouteContext() {
        return this.routeContext;
    }

    public RouteRequest getRouteRequest() {
        return this.routeRequest;
    }

    public boolean initTaskData() {
        if (this.routeRequest.getTaskOptions() == null || this.routeRequest.getTaskOptions().isEmpty()) {
            this.response = new C8705oo0o0O0o(C8713oo0o0o.OooO, this.routeRequest.getUrl() + ":taskOptions is  null ", this.routeContext);
            this.routeRequest.getCallback().OooO0O0(this.response);
            return false;
        }
        if (this.routeRequest.getTaskOptions().containsKey("clazz")) {
            this.activityClass = getActivityClass((String) this.routeRequest.getTaskOptions().get("clazz"));
        }
        if (!this.routeRequest.getTaskOptions().containsKey("options")) {
            return true;
        }
        try {
            this.options = C8701oo0o0O.OooO00o((JSONObject) this.routeRequest.getTaskOptions().get("options"));
            this.routeRequest.getParams().putAll(this.options);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            this.response = new C8705oo0o0O0o(C8713oo0o0o.OooOO0, this.routeRequest.getUrl() + ":taskOptions's options error;" + e.getMessage(), this.routeContext);
            this.routeRequest.getCallback().OooO0O0(this.response);
            return false;
        }
    }
}
