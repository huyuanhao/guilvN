package com.taobao.accs;

import androidx.annotation.Keep;
import com.taobao.accs.data.Message;
import com.taobao.aranger.annotation.method.oneway;
import com.taobao.aranger.annotation.type.ClassName;

@ClassName("com.taobao.accs.internal.ConnectionServiceImpl")
@Keep
/* renamed from: com.taobao.accs.d */
public interface AbstractC3107d {
    @oneway
    /* renamed from: a */
    void mo37536a();

    @oneway
    /* renamed from: a */
    void mo37537a(int i);

    /* renamed from: a */
    void mo37538a(AccsClientConfig accsClientConfig);

    @oneway
    /* renamed from: a */
    void mo37539a(Message message);

    @oneway
    /* renamed from: a */
    void mo37540a(Message message, int i);

    @oneway
    /* renamed from: a */
    void mo37541a(Message message, boolean z);

    /* renamed from: a */
    boolean mo37542a(String str);

    /* renamed from: a */
    boolean mo37543a(String str, String str2);

    /* renamed from: b */
    String mo37544b(String str);

    @oneway
    /* renamed from: b */
    void mo37545b();

    /* renamed from: c */
    String mo37546c();

    @oneway
    /* renamed from: c */
    void mo37547c(String str);

    /* renamed from: d */
    String mo37548d();

    @oneway
    /* renamed from: d */
    void mo37549d(String str);

    /* renamed from: e */
    String mo37550e();

    /* renamed from: e */
    boolean mo37551e(String str);

    /* renamed from: f */
    boolean mo37552f();

    /* renamed from: f */
    boolean mo37553f(String str);
}
