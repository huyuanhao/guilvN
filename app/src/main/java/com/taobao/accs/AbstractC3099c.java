package com.taobao.accs;

import android.content.Context;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import java.net.URL;
import java.util.Map;

/* renamed from: com.taobao.accs.c */
public interface AbstractC3099c {
    /* renamed from: a */
    String mo37459a(Context context, ACCSManager.AccsRequest accsRequest);

    /* renamed from: a */
    String mo37460a(Context context, ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo);

    /* renamed from: a */
    String mo37461a(Context context, ACCSManager.AccsRequest accsRequest, String str, boolean z);

    /* renamed from: a */
    String mo37462a(Context context, String str, String str2, byte[] bArr, String str3);

    /* renamed from: a */
    String mo37463a(Context context, String str, String str2, byte[] bArr, String str3, String str4);

    /* renamed from: a */
    String mo37464a(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url);

    /* renamed from: a */
    void mo37465a(Context context);

    @Deprecated
    /* renamed from: a */
    void mo37466a(Context context, int i);

    /* renamed from: a */
    void mo37467a(Context context, ILoginInfo iLoginInfo);

    /* renamed from: a */
    void mo37468a(Context context, String str);

    /* renamed from: a */
    void mo37469a(Context context, String str, int i);

    /* renamed from: a */
    void mo37470a(Context context, String str, AccsAbstractDataListener accsAbstractDataListener);

    /* renamed from: a */
    void mo37471a(Context context, String str, String str2);

    /* renamed from: a */
    void mo37472a(Context context, String str, String str2, IAppReceiver iAppReceiver);

    /* renamed from: a */
    void mo37473a(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver);

    /* renamed from: a */
    void mo37474a(Context context, String str, boolean z);

    /* renamed from: a */
    void mo37475a(AccsClientConfig accsClientConfig);

    /* renamed from: a */
    void mo37476a(String str, String str2, String str3, short s, String str4, Map<Integer, String> map);

    /* renamed from: a */
    boolean mo37477a();

    /* renamed from: a */
    boolean mo37478a(int i);

    /* renamed from: a */
    boolean mo37479a(String str);

    /* renamed from: b */
    String mo37480b(Context context, ACCSManager.AccsRequest accsRequest);

    /* renamed from: b */
    String mo37481b(Context context, String str, String str2, byte[] bArr, String str3, String str4);

    /* renamed from: b */
    String mo37482b(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url);

    /* renamed from: b */
    Map<String, Boolean> mo37483b() throws Exception;

    /* renamed from: b */
    void mo37484b(Context context, String str);

    /* renamed from: b */
    boolean mo37485b(Context context);

    /* renamed from: c */
    Map<String, Boolean> mo37486c() throws Exception;

    /* renamed from: c */
    void mo37487c(Context context);

    /* renamed from: c */
    void mo37488c(Context context, String str);

    /* renamed from: d */
    void mo37489d(Context context);

    /* renamed from: d */
    void mo37490d(Context context, String str);

    /* renamed from: e */
    void mo37491e(Context context);

    /* renamed from: e */
    void mo37492e(Context context, String str);
}
