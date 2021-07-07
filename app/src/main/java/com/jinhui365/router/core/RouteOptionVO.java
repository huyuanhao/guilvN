package com.jinhui365.router.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class RouteOptionVO implements Serializable {
    public static final String o0ooOOo = "RouteOptionVO";
    public Class<?> clazz;
    public Map<String, Object> options;

    public Class<?> getClazz() {
        return this.clazz;
    }

    public Map<String, Object> getOptions() {
        Map<String, Object> map = this.options;
        if (map == null || map.isEmpty()) {
            this.options = new HashMap();
        }
        return this.options;
    }

    public void setClazz(Class<?> cls) {
        this.clazz = cls;
    }

    public void setOptions(Map<String, Object> map) {
        this.options = map;
    }

    public String toString() {
        return "RouteOptionVO{clazz=" + this.clazz + ", options=" + this.options + '}';
    }
}
