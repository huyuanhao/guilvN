package com.p118pd.sdk;

import android.text.TextUtils;
import com.jinhui365.router.core.RouteOptionVO;
import com.jinhui365.router.core.RouteVO;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0o000o  reason: case insensitive filesystem */
public class C8693oo0o000o {
    public static C8693oo0o000o OooO00o = new C8693oo0o000o();
    public static final String OooO0O0 = "ConfigManager";

    /* renamed from: OooO00o  reason: collision with other field name */
    public RouteVO f21847OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21848OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21849OooO00o = true;

    public static C8693oo0o000o OooO00o() {
        return OooO00o;
    }

    public void OooO0O0(String str) throws JSONException, ClassNotFoundException {
        if (TextUtils.isEmpty(str)) {
            this.f21847OooO00o = OooO00o(this.f21848OooO00o);
            return;
        }
        RouteVO OooO00o2 = OooO00o(str);
        if (OooO00o2 == null) {
            this.f21847OooO00o = OooO00o(this.f21848OooO00o);
            return;
        }
        this.f21848OooO00o = str;
        this.f21847OooO00o = OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20309OooO00o(String str) throws JSONException, ClassNotFoundException {
        this.f21848OooO00o = str;
        RouteVO OooO00o2 = OooO00o(str);
        this.f21847OooO00o = OooO00o2;
        OooO00o2.toString();
    }

    private RouteVO OooO00o(String str) throws JSONException, ClassNotFoundException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return OooO00o(new JSONObject(str));
    }

    private Map<String, Object> OooO0O0(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Object obj = jSONObject.get("taskOptions");
        if (!(obj instanceof String)) {
            return C8701oo0o0O.OooO00o((JSONObject) obj);
        }
        hashMap.put("clazz", obj);
        return hashMap;
    }

    private RouteVO OooO00o(JSONObject jSONObject) throws JSONException, ClassNotFoundException {
        RouteVO routeVO = new RouteVO();
        if (jSONObject.has("interceptors")) {
            routeVO.getInterceptors().addAll(m20307OooO00o(jSONObject));
            jSONObject.remove("interceptors");
        }
        if (jSONObject.has("taskClass")) {
            routeVO.setTaskClass(m20305OooO00o(jSONObject));
            jSONObject.remove("taskClass");
        }
        if (jSONObject.has("taskOptions")) {
            routeVO.setTaskOptions(OooO0O0(jSONObject));
            jSONObject.remove("taskOptions");
        }
        if (jSONObject.has("redirect")) {
            routeVO.setRedirect(m20306OooO00o(jSONObject));
            jSONObject.remove("redirect");
        }
        if (jSONObject.has("subRoutes")) {
            routeVO.setSubRoutes(m20308OooO00o(jSONObject.getJSONObject("subRoutes")));
            jSONObject.remove("subRoutes");
        }
        if (!(jSONObject == null || jSONObject.length() == 0)) {
            routeVO.setSubRoutes(m20308OooO00o(jSONObject));
        }
        return routeVO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Map<String, RouteVO> m20308OooO00o(JSONObject jSONObject) throws JSONException, ClassNotFoundException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String OooO00o2 = C8701oo0o0O.OooO00o(keys.next());
            Object obj = jSONObject.get(OooO00o2);
            RouteVO routeVO = new RouteVO();
            if (obj instanceof String) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("clazz", obj);
                routeVO.setTaskOptions(hashMap2);
            } else {
                routeVO = OooO00o((JSONObject) obj);
            }
            hashMap.put(OooO00o2, routeVO);
        }
        return hashMap;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private List<RouteOptionVO> m20307OooO00o(JSONObject jSONObject) throws JSONException, ClassNotFoundException {
        JSONArray jSONArray = jSONObject.getJSONArray("interceptors");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            RouteOptionVO routeOptionVO = new RouteOptionVO();
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                routeOptionVO.setClazz(Class.forName((String) obj));
            } else {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2.has("clazz")) {
                    routeOptionVO.setClazz(Class.forName(jSONObject2.getString("clazz")));
                }
                if (jSONObject2.has("options")) {
                    routeOptionVO.setOptions(C8701oo0o0O.OooO00o(jSONObject2.getJSONObject("options")));
                }
            }
            arrayList.add(routeOptionVO);
        }
        return arrayList;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Class<?> m20305OooO00o(JSONObject jSONObject) throws JSONException, ClassNotFoundException {
        return Class.forName(jSONObject.getString("taskClass"));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private String m20306OooO00o(JSONObject jSONObject) throws JSONException, ClassNotFoundException {
        return jSONObject.getString("redirect");
    }

    public RouteVO OooO00o(String str, Map<String, Object> map) {
        if (this.f21847OooO00o == null && !TextUtils.isEmpty(this.f21848OooO00o)) {
            try {
                this.f21847OooO00o = OooO00o(this.f21848OooO00o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f21847OooO00o == null) {
            return null;
        }
        RouteVO routeVO = new RouteVO();
        routeVO.getInterceptors().addAll(this.f21847OooO00o.getInterceptors());
        if (this.f21847OooO00o.getTaskClass() != null) {
            routeVO.setTaskClass(this.f21847OooO00o.getTaskClass());
        }
        String[] split = C8701oo0o0O.OooO00o(str).substring(1).split(C8932ooOOO0o.OooO0OO);
        this.f21849OooO00o = true;
        OooO00o(split, 0, this.f21847OooO00o.getSubRoutes(), routeVO, map);
        if (!this.f21849OooO00o) {
            return null;
        }
        routeVO.toString();
        return routeVO;
    }

    private RouteVO OooO00o(String[] strArr, int i, Map<String, RouteVO> map, RouteVO routeVO, Map<String, Object> map2) {
        Exception e;
        RouteVO routeVO2 = routeVO;
        try {
            if (strArr.length == 0) {
                return OooO00o(true, routeVO2, map.get(C8932ooOOO0o.OooO0OO));
            }
            if (i < strArr.length) {
                RouteVO routeVO3 = map.get(C8932ooOOO0o.OooO0OO + strArr[i]);
                Iterator<String> it = map.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    String substring = next.contains(C8932ooOOO0o.f22176OooO00o) ? next.substring(0, next.indexOf(C8932ooOOO0o.f22176OooO00o)) : next;
                    if (substring.startsWith("/:")) {
                        routeVO3 = map.get(substring);
                        map2.put(substring.replace("/:", ""), strArr[i]);
                        substring = C8932ooOOO0o.OooO0OO + strArr[i];
                    }
                    if (substring.equals(C8932ooOOO0o.OooO0OO + strArr[i])) {
                        Map<String, Object> OooO00o2 = C8701oo0o0O.m20318OooO00o(next);
                        Iterator<String> it2 = OooO00o2.keySet().iterator();
                        boolean z = false;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String next2 = it2.next();
                            if (!map2.containsKey(next2) || !String.valueOf(map2.get(next2)).equals(OooO00o2.get(next2))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        z = false;
                        if (z) {
                            routeVO3 = map.get(next);
                            break;
                        }
                    }
                }
                if (routeVO3 == null) {
                    this.f21849OooO00o = false;
                    return null;
                }
                int i2 = i + 1;
                RouteVO OooO00o3 = OooO00o(i2 == strArr.length, routeVO2, routeVO3);
                try {
                    OooO00o(strArr, i2, routeVO3.getSubRoutes(), OooO00o3, map2);
                    return OooO00o3;
                } catch (Exception e2) {
                    e = e2;
                    routeVO2 = OooO00o3;
                    e.printStackTrace();
                    return routeVO2;
                }
            }
            return routeVO2;
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return routeVO2;
        }
    }

    private RouteVO OooO00o(boolean z, RouteVO routeVO, RouteVO routeVO2) {
        routeVO.getInterceptors().addAll(routeVO2.getInterceptors());
        if (routeVO2.getTaskClass() != null) {
            routeVO.setTaskClass(routeVO2.getTaskClass());
        }
        if (!TextUtils.isEmpty(routeVO2.getRedirect()) && z) {
            routeVO.setRedirect(routeVO2.getRedirect());
        }
        routeVO.setTaskOptions(routeVO2.getTaskOptions());
        return routeVO;
    }

    public List<AbstractC8692oo0o000O> OooO00o(List<RouteOptionVO> list) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                RouteOptionVO routeOptionVO = list.get(i);
                arrayList.add((AbstractC8692oo0o000O) routeOptionVO.getClazz().getConstructor(Map.class).newInstance(routeOptionVO.getOptions()));
            }
        }
        return arrayList;
    }
}
