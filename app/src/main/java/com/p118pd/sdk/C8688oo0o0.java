package com.p118pd.sdk;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.jinhui365.router.core.RouteOptionVO;
import com.jinhui365.router.core.RouteRequest;
import com.jinhui365.router.core.RouteVO;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0o0  reason: case insensitive filesystem */
public class C8688oo0o0 {
    public static final String OooO00o = "RouteContextBuilder";

    /* renamed from: OooO00o  reason: collision with other field name */
    public RouteRequest f21840OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RouteVO f21841OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8705oo0o0O0o f21842OooO00o;

    public C8688oo0o0 OooO00o(Uri uri) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(C8701oo0o0O.m20317OooO00o(uri));
        hashMap.remove(null);
        hashMap.remove("");
        RouteRequest routeRequest = new RouteRequest(uri);
        this.f21840OooO00o = routeRequest;
        routeRequest.setParams(hashMap);
        return this;
    }

    public C8688oo0o0 OooO0O0(int i) {
        this.f21840OooO00o.setRequestCode(i);
        return this;
    }

    private void OooO0O0(Context context) {
        String str;
        if (TextUtils.isEmpty(this.f21840OooO00o.getUrl())) {
            this.f21842OooO00o = new C8705oo0o0O0o(404, "uri == null.", null);
            this.f21840OooO00o.getCallback().OooO0O0(this.f21842OooO00o);
            return;
        }
        if (this.f21840OooO00o.getParams() == null || this.f21840OooO00o.getParams().isEmpty()) {
            str = this.f21840OooO00o.getUrl();
        } else {
            this.f21840OooO00o.getParams().remove(C8713oo0o0o.f21884OooO00o);
            str = this.f21840OooO00o.getParams().isEmpty() ? this.f21840OooO00o.getUrl() : this.f21840OooO00o.getUrl() + C8932ooOOO0o.f22176OooO00o + C8701oo0o0O.OooO00o(this.f21840OooO00o.getParams());
        }
        this.f21840OooO00o.getParams().put(C8713oo0o0o.f21884OooO00o, str);
        RouteVO OooO00o2 = C8693oo0o000o.OooO00o().OooO00o(this.f21840OooO00o.getUrl(), this.f21840OooO00o.getParams());
        if (OooO00o2 == null) {
            this.f21840OooO00o.getCallback().OooO0O0(new C8705oo0o0O0o(C8713oo0o0o.OooO0o, this.f21840OooO00o.getUrl() + ": no fund url", null));
            return;
        }
        RouteVO routeVO = this.f21841OooO00o;
        if (routeVO != null) {
            if (routeVO.getTaskClass() != null) {
                OooO00o2.setTaskClass(this.f21841OooO00o.getTaskClass());
            }
            OooO00o2.getInterceptors().addAll(this.f21841OooO00o.getInterceptors());
            OooO00o2.getTaskOptions().putAll(this.f21841OooO00o.getTaskOptions());
            this.f21841OooO00o = null;
        }
        this.f21840OooO00o.getUrl();
        if (!TextUtils.isEmpty(OooO00o2.getRedirect())) {
            this.f21841OooO00o = OooO00o2;
            this.f21840OooO00o.setUri(Uri.parse(OooO00o2.getRedirect()));
            OooO0O0(context);
            return;
        }
        if (this.f21840OooO00o.isSkipInterceptors()) {
            this.f21840OooO00o.setInterceptors(null);
        } else {
            for (int i = 0; i < this.f21840OooO00o.getAddedInterceptors().size(); i++) {
                int intValue = this.f21840OooO00o.getAddInterceptorIndex().get(i).intValue();
                RouteOptionVO routeOptionVO = this.f21840OooO00o.getAddedInterceptors().get(i);
                if (intValue < 0 || OooO00o2.getInterceptors().size() <= intValue) {
                    OooO00o2.getInterceptors().add(routeOptionVO);
                } else {
                    OooO00o2.getInterceptors().add(intValue, routeOptionVO);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f21840OooO00o.getRemovedInterceptors().size(); i2++) {
                for (RouteOptionVO routeOptionVO2 : OooO00o2.getInterceptors()) {
                    if (routeOptionVO2.getClazz().equals(this.f21840OooO00o.getRemovedInterceptors().get(i2).getClazz())) {
                        arrayList.add(routeOptionVO2);
                    }
                }
            }
            OooO00o2.getInterceptors().removeAll(arrayList);
            try {
                this.f21840OooO00o.setInterceptors(C8693oo0o000o.OooO00o().OooO00o(OooO00o2.getInterceptors()));
            } catch (Exception e) {
                e.printStackTrace();
                this.f21842OooO00o = new C8705oo0o0O0o(C8713oo0o0o.OooO0oO, this.f21840OooO00o.getUrl() + ":interceptor.s list error;" + e.getMessage(), null);
                this.f21840OooO00o.getCallback().OooO0O0(this.f21842OooO00o);
                return;
            }
        }
        if (OooO00o2.getTaskClass() != null) {
            try {
                this.f21840OooO00o.setTask((AbstractC8698oo0o00o) OooO00o2.getTaskClass().newInstance());
            } catch (Exception e2) {
                e2.printStackTrace();
                this.f21842OooO00o = new C8705oo0o0O0o(C8713oo0o0o.OooO0oo, this.f21840OooO00o.getUrl() + ":get IRouteTask error;" + e2.getMessage(), null);
                this.f21840OooO00o.getCallback().OooO0O0(this.f21842OooO00o);
                return;
            }
        }
        this.f21840OooO00o.setTaskOptions(OooO00o2.getTaskOptions());
        if (this.f21840OooO00o.getParams() != null && !this.f21840OooO00o.getParams().isEmpty()) {
            for (String str2 : this.f21840OooO00o.getParams().keySet()) {
                Object obj = this.f21840OooO00o.getParams().get(str2);
                try {
                    if (obj instanceof String) {
                        String decode = URLDecoder.decode((String) obj, "utf-8");
                        if (!TextUtils.isEmpty(decode)) {
                            obj = decode;
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                this.f21840OooO00o.getParams().put(str2, obj);
            }
        }
        C8700oo0o00oo oo0o00oo = new C8700oo0o00oo(this.f21840OooO00o, context);
        C8700oo0o00oo OooO0O0 = C8703oo0o0O00.OooO00o().OooO0O0();
        oo0o00oo.OooO0O0(OooO0O0);
        if (OooO0O0 != null) {
            OooO0O0.OooO00o(oo0o00oo);
        }
        if (oo0o00oo.m20316OooO00o()) {
            C8703oo0o0O00.OooO00o().OooO0O0(oo0o00oo);
        }
        C8703oo0o0O00.OooO00o().OooO00o(oo0o00oo);
        oo0o00oo.OooO0O0();
    }

    public C8688oo0o0 OooO00o(AbstractC8695oo0o00O0 oo0o00o0) {
        this.f21840OooO00o.setCallback(oo0o00o0);
        return this;
    }

    public C8688oo0o0 OooO00o(String str, Object obj) {
        this.f21840OooO00o.getParams().put(str, obj);
        return this;
    }

    public C8688oo0o0 OooO00o(Map<String, Object> map) {
        Map<String, Object> params = this.f21840OooO00o.getParams();
        if (map != null && !map.isEmpty()) {
            params.putAll(map);
        }
        return this;
    }

    public C8688oo0o0 OooO00o(String str) throws JSONException {
        OooO00o(C8701oo0o0O.OooO00o(new JSONObject(str)));
        return this;
    }

    public C8688oo0o0 OooO00o(int i) {
        this.f21840OooO00o.addFlags(i);
        return this;
    }

    public C8688oo0o0 OooO00o(int i, int i2) {
        this.f21840OooO00o.setEnterAnim(i);
        this.f21840OooO00o.setExitAnim(i2);
        return this;
    }

    public C8688oo0o0 OooO00o() {
        this.f21840OooO00o.setSkipInterceptors(true);
        return this;
    }

    public C8688oo0o0 OooO00o(Class<?>... clsArr) {
        this.f21840OooO00o.removeInterceptors(clsArr);
        return this;
    }

    public C8688oo0o0 OooO00o(Class<?> cls) {
        OooO00o(cls, new HashMap());
        return this;
    }

    public C8688oo0o0 OooO00o(Class<?> cls, int i) {
        OooO00o(cls, new HashMap(), i);
        return this;
    }

    public C8688oo0o0 OooO00o(Class<?> cls, Map<String, Object> map) {
        OooO00o(cls, map, -1);
        return this;
    }

    public C8688oo0o0 OooO00o(Class<?> cls, String str, int i) throws JSONException {
        OooO00o(cls, C8701oo0o0O.OooO00o(new JSONObject(str)), i);
        return this;
    }

    public C8688oo0o0 OooO00o(Class<?> cls, Map<String, Object> map, int i) {
        this.f21840OooO00o.addInterceptors(cls, map, i);
        return this;
    }

    public void OooO00o(Context context, AbstractC8695oo0o00O0 oo0o00o0) {
        this.f21840OooO00o.setCallback(oo0o00o0);
        OooO00o(context);
    }

    public void OooO00o(Context context) {
        OooO0O0(context);
    }
}
