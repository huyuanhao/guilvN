package com.jinhui365.router.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RouteVO implements Serializable {
    public static final String o0ooOOo = "RouteVO";
    public List<RouteOptionVO> interceptors;
    public String redirect;
    public Map<String, RouteVO> subRoutes;
    public Class<?> taskClass;
    public Map<String, Object> taskOptions;

    public List<RouteOptionVO> getInterceptors() {
        if (this.interceptors == null) {
            this.interceptors = new ArrayList();
        }
        return this.interceptors;
    }

    public String getRedirect() {
        return this.redirect;
    }

    public Map<String, RouteVO> getSubRoutes() {
        return this.subRoutes;
    }

    public Class<?> getTaskClass() {
        return this.taskClass;
    }

    public Map<String, Object> getTaskOptions() {
        Map<String, Object> map = this.taskOptions;
        if (map == null || map.isEmpty()) {
            this.taskOptions = new HashMap();
        }
        return this.taskOptions;
    }

    public void setInterceptors(List<RouteOptionVO> list) {
        this.interceptors = list;
    }

    public void setRedirect(String str) {
        this.redirect = str;
    }

    public void setSubRoutes(Map<String, RouteVO> map) {
        this.subRoutes = map;
    }

    public void setTaskClass(Class<?> cls) {
        this.taskClass = cls;
    }

    public void setTaskOptions(Map<String, Object> map) {
        this.taskOptions = map;
    }

    public String toString() {
        return "RouteVO{interceptors=" + this.interceptors + ", subRoutes=" + this.subRoutes + ", taskClass=" + this.taskClass + ", taskOptions=" + this.taskOptions + ", redirect='" + this.redirect + '\'' + '}';
    }
}
