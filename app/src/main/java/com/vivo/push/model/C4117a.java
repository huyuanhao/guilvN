package com.vivo.push.model;

/* renamed from: com.vivo.push.model.a */
public final class C4117a {

    /* renamed from: a */
    public String f11026a;

    /* renamed from: b */
    public String f11027b;

    public C4117a(String str, String str2) {
        this.f11026a = str;
        this.f11027b = str2;
    }

    /* renamed from: a */
    public final String mo41076a() {
        return this.f11026a;
    }

    /* renamed from: b */
    public final String mo41077b() {
        return this.f11027b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4117a.class != obj.getClass()) {
            return false;
        }
        C4117a aVar = (C4117a) obj;
        String str = this.f11026a;
        if (str == null) {
            if (aVar.f11026a != null) {
                return false;
            }
        } else if (!str.equals(aVar.f11026a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f11026a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        return "ConfigItem{mKey='" + this.f11026a + '\'' + ", mValue='" + this.f11027b + '\'' + '}';
    }
}
