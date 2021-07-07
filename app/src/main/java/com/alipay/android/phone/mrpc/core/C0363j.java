package com.alipay.android.phone.mrpc.core;

import com.umeng.commonsdk.statistics.idtracking.C3692t;
import com.umeng.message.util.HttpRequest;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* renamed from: com.alipay.android.phone.mrpc.core.j */
public final class C0363j extends AbstractC0342a {

    /* renamed from: g */
    public AbstractC0360g f802g;

    public C0363j(AbstractC0360g gVar, Method method, int i, String str, byte[] bArr, boolean z) {
        super(method, i, str, bArr, HttpRequest.CONTENT_TYPE_FORM, z);
        this.f802g = gVar;
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC0376v
    /* renamed from: a */
    public final Object mo4148a() {
        C0369o oVar = new C0369o(this.f802g.mo4143a());
        oVar.mo4160a(this.f771b);
        oVar.mo4156a(this.f774e);
        oVar.mo4159a(this.f775f);
        oVar.mo4157a("id", String.valueOf(this.f773d));
        oVar.mo4157a("operationType", this.f772c);
        oVar.mo4157a("gzip", String.valueOf(this.f802g.mo4146d()));
        oVar.mo4158a((Header) new BasicHeader(C3692t.f9678a, UUID.randomUUID().toString()));
        List<Header> b = this.f802g.mo4145c().mo4120b();
        if (b != null && !b.isEmpty()) {
            for (Header header : b) {
                oVar.mo4158a(header);
            }
        }
        StringBuilder sb = new StringBuilder("threadid = ");
        sb.append(Thread.currentThread().getId());
        sb.append("; ");
        sb.append(oVar.toString());
        try {
            C0375u uVar = this.f802g.mo4144b().mo4122a(oVar).get();
            if (uVar != null) {
                return uVar.mo4179b();
            }
            throw new RpcException((Integer) 9, "response is null");
        } catch (InterruptedException e) {
            throw new RpcException(13, "", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause == null || !(cause instanceof HttpException)) {
                throw new RpcException(9, "", e2);
            }
            HttpException httpException = (HttpException) cause;
            int code = httpException.getCode();
            switch (code) {
                case 1:
                    code = 2;
                    break;
                case 2:
                    code = 3;
                    break;
                case 3:
                    code = 4;
                    break;
                case 4:
                    code = 5;
                    break;
                case 5:
                    code = 6;
                    break;
                case 6:
                    code = 7;
                    break;
                case 7:
                    code = 8;
                    break;
                case 8:
                    code = 15;
                    break;
                case 9:
                    code = 16;
                    break;
            }
            throw new RpcException(Integer.valueOf(code), httpException.getMsg());
        } catch (CancellationException e3) {
            throw new RpcException(13, "", e3);
        }
    }
}
