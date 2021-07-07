package com.jinhui365.router.core;

import android.net.Uri;
import com.p118pd.sdk.AbstractC8692oo0o000O;
import com.p118pd.sdk.AbstractC8695oo0o00O0;
import com.p118pd.sdk.AbstractC8698oo0o00o;
import com.p118pd.sdk.C8701oo0o0O;
import com.p118pd.sdk.C8703oo0o0O00;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RouteRequest implements Serializable {
    public static final int o00oO0O = -1;
    public List<Integer> addInterceptorIndex;
    public List<RouteOptionVO> addedInterceptors;
    public AbstractC8695oo0o00O0 callback;
    public int enterAnim;
    public int exitAnim;
    public int flags;
    public List<AbstractC8692oo0o000O> interceptors;
    public Map<String, Object> params;
    public List<RouteOptionVO> removedInterceptors;
    public int requestCode = -1;
    public boolean skipInterceptors;
    public AbstractC8698oo0o00o task;
    public Map<String, Object> taskOptions;
    public Uri url;

    public RouteRequest(Uri uri) {
        this.url = uri;
    }

    public void addFlags(int i) {
        this.flags = i | this.flags;
    }

    public void addInterceptors(Class<?> cls, Map<String, Object> map, int i) {
        if (this.addedInterceptors == null) {
            this.addedInterceptors = new ArrayList();
            this.addInterceptorIndex = new ArrayList();
        }
        RouteOptionVO routeOptionVO = new RouteOptionVO();
        routeOptionVO.setClazz(cls);
        routeOptionVO.setOptions(map);
        this.addedInterceptors.add(routeOptionVO);
        this.addInterceptorIndex.add(Integer.valueOf(i));
    }

    public List<Integer> getAddInterceptorIndex() {
        return this.addInterceptorIndex;
    }

    public List<RouteOptionVO> getAddedInterceptors() {
        if (this.addedInterceptors == null) {
            this.addedInterceptors = new ArrayList();
        }
        return this.addedInterceptors;
    }

    public AbstractC8695oo0o00O0 getCallback() {
        AbstractC8695oo0o00O0 oo0o00o0 = this.callback;
        return oo0o00o0 == null ? C8703oo0o0O00.OooO00o().m20319OooO00o() : oo0o00o0;
    }

    public int getEnterAnim() {
        return this.enterAnim;
    }

    public int getExitAnim() {
        return this.exitAnim;
    }

    public int getFlags() {
        return this.flags;
    }

    public List<AbstractC8692oo0o000O> getInterceptors() {
        if (this.interceptors == null) {
            this.interceptors = new ArrayList();
        }
        return this.interceptors;
    }

    public Map<String, Object> getParams() {
        Map<String, Object> map = this.params;
        if (map == null || map.isEmpty()) {
            this.params = new HashMap();
        }
        return this.params;
    }

    public List<RouteOptionVO> getRemovedInterceptors() {
        if (this.removedInterceptors == null) {
            this.removedInterceptors = new ArrayList();
        }
        return this.removedInterceptors;
    }

    public int getRequestCode() {
        return this.requestCode;
    }

    public AbstractC8698oo0o00o getTask() {
        AbstractC8698oo0o00o oo0o00o = this.task;
        return oo0o00o == null ? C8703oo0o0O00.OooO00o().m20320OooO00o() : oo0o00o;
    }

    public Map<String, Object> getTaskOptions() {
        return this.taskOptions;
    }

    public String getUrl() {
        return C8701oo0o0O.OooO00o(this.url);
    }

    public boolean isSkipInterceptors() {
        return this.skipInterceptors;
    }

    public void removeInterceptors(Class<?>... clsArr) {
        if (this.removedInterceptors == null) {
            this.removedInterceptors = new ArrayList();
        }
        RouteOptionVO routeOptionVO = new RouteOptionVO();
        for (Class<?> cls : clsArr) {
            routeOptionVO.setClazz(cls);
            this.removedInterceptors.add(routeOptionVO);
        }
    }

    public void setCallback(AbstractC8695oo0o00O0 oo0o00o0) {
        this.callback = oo0o00o0;
    }

    public void setEnterAnim(int i) {
        this.enterAnim = i;
    }

    public void setExitAnim(int i) {
        this.exitAnim = i;
    }

    public void setInterceptors(List<AbstractC8692oo0o000O> list) {
        this.interceptors = list;
    }

    public void setParams(Map<String, Object> map) {
        this.params = map;
    }

    public void setRequestCode(int i) {
        if (i < 0) {
            this.requestCode = -1;
        } else {
            this.requestCode = i;
        }
    }

    public void setSkipInterceptors(boolean z) {
        this.skipInterceptors = z;
    }

    public void setTask(AbstractC8698oo0o00o oo0o00o) {
        this.task = oo0o00o;
    }

    public void setTaskOptions(Map<String, Object> map) {
        this.taskOptions = map;
    }

    public void setUri(Uri uri) {
        this.url = uri;
    }
}
