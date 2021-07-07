package anet.channel;

import android.content.Context;
import anet.channel.Config;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.appmonitor.C0110a;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.p005a.C0108a;
import anet.channel.p007c.C0119a;
import anet.channel.p009e.C0130a;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.p118pd.sdk.C7337o0O0oO;
import com.p118pd.sdk.C7348o0O0oo;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.AgooConstants;

public class TaobaoNetworkAdapter implements Serializable {
    public static AtomicBoolean isInited = new AtomicBoolean();

    /* renamed from: a */
    public static void m41a(String str, String str2, ConnProtocol connProtocol, boolean z) {
        StrategyTemplate.getInstance().registerConnProtocol(str, connProtocol);
        if (z) {
            SessionCenter.getInstance(new Config.Builder().setAppkey(str2).setEnv(ENV.ONLINE).build()).registerSessionInfo(SessionInfo.create(str, z, false, null, null, null));
        }
    }

    public static void init(Context context, HashMap<String, Object> hashMap) {
        if (isInited.compareAndSet(false, true)) {
            ALog.setLog(new C0130a());
            C7348o0O0oo.OooO00o(new C0119a());
            AppMonitor.setInstance(new C0110a());
            NetworkAnalysis.setInstance(new C0108a());
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0142h(), ThreadPoolExecutorFactory.Priority.NORMAL);
            if (hashMap != null) {
                try {
                    Integer num = (Integer) hashMap.get("outline");
                    if (num != null && num.intValue() == -1) {
                        ALog.m289e("awcn.TaobaoNetworkAdapter", "taobao speed mode enable.", null, new Object[0]);
                        GlobalAppRuntimeInfo.addBucketInfo("tbspeed", "speed");
                        if (C7348o0O0oo.OooO0o()) {
                            C7337o0O0oO.OooO00o(context, false);
                        }
                        AwcnConfig.setAsyncLoadStrategyEnable(true);
                    }
                } catch (Exception unused) {
                }
            }
            if (hashMap != null) {
                try {
                    if (AgooConstants.TAOBAO_PACKAGE.equals((String) hashMap.get(UMModuleRegister.PROCESS))) {
                        String str = (String) hashMap.get("onlineAppKey");
                        m41a("guide-acs.m.taobao.com", str, ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, ConnType.PK_ACS), true);
                        ConnProtocol valueOf = ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, ConnType.PK_CDN);
                        m41a("gw.alicdn.com", str, valueOf, false);
                        m41a("dorangesource.alicdn.com", str, valueOf, false);
                        m41a("ossgw.alicdn.com", str, valueOf, false);
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }
}
