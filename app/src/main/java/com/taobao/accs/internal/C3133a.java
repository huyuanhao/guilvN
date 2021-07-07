package com.taobao.accs.internal;

import androidx.annotation.Keep;
import com.taobao.accs.AbstractC3107d;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.AbstractC3137b;
import com.taobao.accs.net.C3145j;

@Keep
/* renamed from: com.taobao.accs.internal.a */
public class C3133a implements AbstractC3107d {

    /* renamed from: a */
    public static final String f6998a = "a";

    /* renamed from: b */
    public AbstractC3137b f6999b;

    public C3133a(AccsClientConfig accsClientConfig) {
        AccsClientConfig.setAccsConfig(accsClientConfig.getConfigEnv(), accsClientConfig);
        this.f6999b = AbstractC3134b.m7469a(GlobalClientInfo.f6858a, accsClientConfig.getTag(), true);
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: a */
    public void mo37536a() {
        this.f6999b.mo37646a();
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: b */
    public void mo37545b() {
        this.f6999b.mo37669k();
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: c */
    public String mo37546c() {
        return this.f6999b.mo37667i();
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: d */
    public String mo37548d() {
        return this.f6999b.f7017i.getAppSecret();
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: e */
    public boolean mo37551e(String str) {
        return this.f6999b.mo37668j().mo37531c(str);
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: f */
    public boolean mo37553f(String str) {
        return this.f6999b.mo37668j().mo37532d(str);
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: a */
    public boolean mo37542a(String str) {
        return this.f6999b.mo37653a(str);
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: b */
    public String mo37544b(String str) {
        return this.f6999b.mo37654b(str);
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: c */
    public void mo37547c(String str) {
        this.f6999b.f7009a = str;
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: d */
    public void mo37549d(String str) {
        this.f6999b.f7010b = str;
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: e */
    public String mo37550e() {
        return this.f6999b.f7017i.getStoreId();
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: f */
    public boolean mo37552f() {
        return this.f6999b.mo37671m();
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: a */
    public void mo37540a(Message message, int i) {
        this.f6999b.mo37657b(message, i);
    }

    public C3133a(String str) {
        this.f6999b = new C3145j(GlobalClientInfo.f6858a, 1, str);
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: a */
    public void mo37541a(Message message, boolean z) {
        this.f6999b.mo37658b(message, z);
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: a */
    public void mo37538a(AccsClientConfig accsClientConfig) {
        AbstractC3137b bVar = this.f6999b;
        if (bVar instanceof C3145j) {
            ((C3145j) bVar).mo37689a(accsClientConfig);
        }
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: a */
    public boolean mo37543a(String str, String str2) {
        return this.f6999b.mo37668j().mo37530b(str, str2);
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: a */
    public void mo37539a(Message message) {
        this.f6999b.mo37648a(message, true);
    }

    @Override // com.taobao.accs.AbstractC3107d
    /* renamed from: a */
    public void mo37537a(int i) {
        this.f6999b.mo37661c(i);
    }
}
