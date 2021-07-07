package anet.channel;

import anet.channel.util.HttpConstant;
import com.p118pd.sdk.AbstractC7346o0O0oOoO;
import com.umeng.commonsdk.UMConfigure;
import java.util.Map;

/* renamed from: anet.channel.i */
public class C0145i implements AbstractC7346o0O0oOoO {

    /* renamed from: a */
    public final /* synthetic */ RunnableC0142h f178a;

    public C0145i(RunnableC0142h hVar) {
        this.f178a = hVar;
    }

    @Override // com.p118pd.sdk.AbstractC7346o0O0oOoO
    public boolean handleCache(String str, Map<String, String> map) {
        return UMConfigure.WRAPER_TYPE_WEEX.equals(map.get(HttpConstant.F_REFER));
    }
}
