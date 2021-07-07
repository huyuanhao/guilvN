package anet.channel.p007c;

import anet.channel.util.ALog;
import com.p118pd.sdk.AbstractC7349o0O0oo0;
import com.taobao.orange.OrangeConfig;

/* renamed from: anet.channel.c.a */
public class C0119a implements AbstractC7349o0O0oo0 {

    /* renamed from: a */
    public static boolean f123a;

    static {
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            f123a = true;
        } catch (Exception unused) {
            f123a = false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7349o0O0oo0
    public String getConfig(String... strArr) {
        if (!f123a) {
            ALog.m292w("awcn.OrangeConfigImpl", "no orange sdk", null, new Object[0]);
            return null;
        }
        try {
            return OrangeConfig.getInstance().getConfig(strArr[0], strArr[1], strArr[2]);
        } catch (Exception e) {
            ALog.m288e("awcn.OrangeConfigImpl", "get config failed!", null, e, new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(61:2|3|4|5|6|7|8|9|10|(1:12)|13|14|15|16|17|18|19|20|(1:22)|23|24|25|26|(1:28)|29|30|31|32|33|34|(1:36)|37|38|39|40|(1:42)|43|44|(3:46|(1:48)|49)|50|51|(1:53)|54|55|(1:57)|58|59|(1:61)|62|63|(1:65)|66|67|(1:69)|70|71|(1:73)|74|75|(1:77)|(3:78|79|(2:81|83)(1:86))) */
    /* JADX WARNING: Can't wrap try/catch for region: R(63:2|3|4|5|6|7|8|9|10|(1:12)|13|14|15|16|17|18|19|20|(1:22)|23|24|25|26|(1:28)|29|30|31|32|33|34|(1:36)|37|38|39|40|(1:42)|43|44|(3:46|(1:48)|49)|50|51|(1:53)|54|55|(1:57)|58|59|(1:61)|62|63|(1:65)|66|67|(1:69)|70|71|(1:73)|74|75|(1:77)|78|79|(2:81|83)(1:86)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0086 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x009f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00d3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00f2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0103 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x011a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0133 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x014c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x016b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0184 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x01a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x01c5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x01e4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0203 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x021a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0231 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0250 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x026f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0286 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x006b */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x007b A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e7 A[Catch:{ Exception -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0117 A[Catch:{ Exception -> 0x011a }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0160 A[Catch:{ Exception -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0198 A[Catch:{ Exception -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01b7 A[Catch:{ Exception -> 0x01c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01d9 A[Catch:{ Exception -> 0x01e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01f8 A[Catch:{ Exception -> 0x0203 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0217 A[Catch:{ Exception -> 0x021a }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x022e A[Catch:{ Exception -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0245 A[Catch:{ Exception -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0264 A[Catch:{ Exception -> 0x026f }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0283 A[Catch:{ Exception -> 0x0286 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x029a A[Catch:{ Exception -> 0x02a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // com.p118pd.sdk.AbstractC7349o0O0oo0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigUpdate(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 678
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.p007c.C0119a.onConfigUpdate(java.lang.String):void");
    }

    @Override // com.p118pd.sdk.AbstractC7349o0O0oo0
    public void register() {
        if (!f123a) {
            ALog.m292w("awcn.OrangeConfigImpl", "no orange sdk", null, new Object[0]);
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"networkSdk"}, new C0120b(this));
            getConfig("networkSdk", "network_empty_scheme_https_switch", "true");
        } catch (Exception e) {
            ALog.m288e("awcn.OrangeConfigImpl", "register fail", null, e, new Object[0]);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7349o0O0oo0
    public void unRegister() {
        if (!f123a) {
            ALog.m292w("awcn.OrangeConfigImpl", "no orange sdk", null, new Object[0]);
            return;
        }
        OrangeConfig.getInstance().unregisterListener(new String[]{"networkSdk"});
    }
}
