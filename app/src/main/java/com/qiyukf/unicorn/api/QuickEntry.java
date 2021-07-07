package com.qiyukf.unicorn.api;

import com.qiyukf.unicorn.p212e.AbstractC2471f;

public class QuickEntry implements AbstractC2471f {
    public String iconUrl;

    /* renamed from: id */
    public long f4772id;
    public String name;

    public QuickEntry(long j, String str, String str2) {
        this.f4772id = j;
        this.name = str;
        this.iconUrl = str2;
    }

    @Override // com.qiyukf.unicorn.p212e.AbstractC2471f
    public String getIconUrl() {
        return this.iconUrl;
    }

    public long getId() {
        return this.f4772id;
    }

    @Override // com.qiyukf.unicorn.p212e.AbstractC2471f
    public String getName() {
        return this.name;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(long j) {
        this.f4772id = j;
    }

    public void setName(String str) {
        this.name = str;
    }
}
