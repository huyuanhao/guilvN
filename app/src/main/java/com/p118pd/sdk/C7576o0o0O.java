package com.p118pd.sdk;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* renamed from: com.pd.sdk.o0o0O  reason: case insensitive filesystem */
public class C7576o0o0O {
    public final Properties OooO00o;

    public C7576o0o0O() throws IOException {
        Properties properties = new Properties();
        this.OooO00o = properties;
        properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
    }

    public boolean OooO00o(Object obj) {
        return this.OooO00o.containsKey(obj);
    }

    public boolean OooO0O0(Object obj) {
        return this.OooO00o.containsValue(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<Map.Entry<Object, Object>> m19220OooO00o() {
        return this.OooO00o.entrySet();
    }

    public Set<Object> OooO0O0() {
        return this.OooO00o.keySet();
    }

    public String OooO00o(String str) {
        return this.OooO00o.getProperty(str);
    }

    public String OooO00o(String str, String str2) {
        return this.OooO00o.getProperty(str, str2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19221OooO00o() {
        return this.OooO00o.isEmpty();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Enumeration<Object> m19219OooO00o() {
        return this.OooO00o.keys();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19217OooO00o() {
        return this.OooO00o.size();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection<Object> m19218OooO00o() {
        return this.OooO00o.values();
    }

    public static C7576o0o0O OooO00o() throws IOException {
        return new C7576o0o0O();
    }
}
