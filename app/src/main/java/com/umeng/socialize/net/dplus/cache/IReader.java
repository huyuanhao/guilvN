package com.umeng.socialize.net.dplus.cache;

public abstract class IReader<T> {

    /* renamed from: a */
    public String f10858a;
    public T result;

    public IReader(String str) {
        this.f10858a = str;
    }

    public static double formatSize(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return (d / 1024.0d) / 1024.0d;
    }

    public abstract void create(String str);

    public String getLogFileName() {
        return this.f10858a;
    }
}
