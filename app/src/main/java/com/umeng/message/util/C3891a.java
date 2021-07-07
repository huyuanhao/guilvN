package com.umeng.message.util;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* renamed from: com.umeng.message.util.a */
public class C3891a {

    /* renamed from: a */
    public Properties f10595a = new Properties();

    public C3891a() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
        this.f10595a.load(fileInputStream);
        fileInputStream.close();
    }

    /* renamed from: g */
    public static C3891a m10687g() throws IOException {
        return new C3891a();
    }

    /* renamed from: a */
    public boolean mo40146a(Object obj) {
        return this.f10595a.containsKey(obj);
    }

    /* renamed from: b */
    public boolean mo40148b(Object obj) {
        return this.f10595a.containsValue(obj);
    }

    /* renamed from: c */
    public Enumeration<Object> mo40149c() {
        return this.f10595a.keys();
    }

    /* renamed from: d */
    public Set<Object> mo40150d() {
        return this.f10595a.keySet();
    }

    /* renamed from: e */
    public int mo40151e() {
        return this.f10595a.size();
    }

    /* renamed from: f */
    public Collection<Object> mo40152f() {
        return this.f10595a.values();
    }

    /* renamed from: a */
    public Set<Map.Entry<Object, Object>> mo40145a() {
        return this.f10595a.entrySet();
    }

    /* renamed from: b */
    public boolean mo40147b() {
        return this.f10595a.isEmpty();
    }

    /* renamed from: a */
    public String mo40143a(String str) {
        return this.f10595a.getProperty(str);
    }

    /* renamed from: a */
    public String mo40144a(String str, String str2) {
        return this.f10595a.getProperty(str, str2);
    }
}
