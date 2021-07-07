package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMLogUtils;

/* renamed from: com.umeng.analytics.pro.h */
public class C3441h {

    /* renamed from: A */
    public static final String f8595A = "MobclickAgent.setSecret方法参数secretkey不能为null，也不能为空字符串。|secretkey参数必须是非空 字符串。";

    /* renamed from: B */
    public static final String f8596B = "统计SDK常见问题索引贴 详见链接 http://developer.umeng.com/docs/66650/cate/66650";

    /* renamed from: C */
    public static final String f8597C = ("MobclickAgent.onPageStart方法参数不能为null，也不能为空字符串。|参数viewName必须为非空字符串。详见链接 " + UMLogUtils.makeUrl("66975"));

    /* renamed from: D */
    public static final String f8598D = ("MobclickAgent.onPageEnd方法参数不能为null，也不能为空字符串。|参数viewName必须为非空 字符串。详见链接 " + UMLogUtils.makeUrl("66975"));

    /* renamed from: E */
    public static final String f8599E = ("对于页面@，onPageStart和onPageEnd调用对的参数不一致。|对于同一个页面，请先调用onPageStart，再调用onPageEnd。详见链接 " + UMLogUtils.makeUrl("66975"));

    /* renamed from: F */
    public static final String f8600F = ("对于页面@，请确保先依序成对调用onPageStart，onPageEnd接口，再调用onPageStart接口对其它页面进行统计。|对于任意一个页面，必须依序成对调用onPageStart以及onPageEnd，不能有遗漏。详见链接 " + UMLogUtils.makeUrl("66975"));

    /* renamed from: G */
    public static final String f8601G = ("对于页面@，请检查是否遗漏onPageStart接口调用。|对于任意一个页面，必须依序成对调用onPageStart以及onPageEnd，不能有遗漏。详见链接 " + UMLogUtils.makeUrl("66975"));

    /* renamed from: H */
    public static final String f8602H = "检测到进入页面生命周期时尚未完成SDK初始化，请检查是否未在Application.onCreate函数中执行SDK初始化函数。";

    /* renamed from: I */
    public static final String f8603I = ("当前发送策略为：启动时发送。详见链接 " + UMLogUtils.makeUrl("66976"));

    /* renamed from: J */
    public static final String f8604J = ("当前发送策略为: 间隔发送。间隔时间为：@秒。详见链接 " + UMLogUtils.makeUrl("66976"));

    /* renamed from: K */
    public static final String f8605K = ("当前发送策略为: 集成测试。但是SDK未切换到调试模式，所以后台设置未生效。|如想切换到集成测试发送策略，请调用UMConfigure.setLogEnabled(true)将SDK切换到调试模式。详见链接 " + UMLogUtils.makeUrl("66976"));

    /* renamed from: L */
    public static final String f8606L = ("当前发送策略为：集成测试。详见链接 " + UMLogUtils.makeUrl("66976"));

    /* renamed from: M */
    public static final String f8607M = ("当前发送策略为: 准实时发送。间隔时间为：@秒。详见链接 " + UMLogUtils.makeUrl("66976"));

    /* renamed from: N */
    public static final String f8608N = "MobclickAgent.onDeepLinkReceived方法Context参数不能为null。|参数Context需要指定ApplicationContext值。";

    /* renamed from: O */
    public static final String f8609O = "MobclickAgent.onDeepLinkReceived方法link参数不能为null，也不能为空字符串。|参数link必须为非空字符串。";

    /* renamed from: P */
    public static final String f8610P = "MobclickAgent.onDeepLinkReceived方法link参数长度超过限制。|参数link长度不能超过1024字符。";

    /* renamed from: Q */
    public static final String f8611Q = ("发送数据时发生java.net.UnknownHostException异常|友盟后端对设备端证书验证失败。请确保设备端没有运行抓包代理类程序。详见链接 " + UMLogUtils.makeUrl("66978"));

    /* renamed from: R */
    public static final String f8612R = ("发送数据时发生javax.net.sslHandshakeException异常|导致友盟后端域名解析失败。请检查系统DNS服务器配置是否正确。详见链接 " + UMLogUtils.makeUrl("66978"));

    /* renamed from: S */
    public static final String f8613S = ("track接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + UMLogUtils.makeUrl("67310"));

    /* renamed from: T */
    public static final String f8614T = ("registerSuperProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + UMLogUtils.makeUrl("67310"));

    /* renamed from: U */
    public static final String f8615U = ("unregisterSuperProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + UMLogUtils.makeUrl("67310"));

    /* renamed from: V */
    public static final String f8616V = ("getSuperProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接: " + UMLogUtils.makeUrl("67310"));

    /* renamed from: W */
    public static final String f8617W = ("getSuperProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + UMLogUtils.makeUrl("67310"));

    /* renamed from: X */
    public static final String f8618X = ("clearSuperProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + UMLogUtils.makeUrl("67310"));

    /* renamed from: Y */
    public static final String f8619Y = ("setFirstLaunchEvent接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + UMLogUtils.makeUrl("67310"));

    /* renamed from: Z */
    public static final String f8620Z = ("registerPreProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + UMLogUtils.makeUrl("67310"));

    /* renamed from: a */
    public static final String f8621a = ("事件属性集合参数为空|onEvent接口必须传入非空的属性集合。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: aA */
    public static final String f8622aA = ("onAppPause接口调用非法。|当前处于非Game场景中，不能使用Game相关接口，详见问题连接：" + UMLogUtils.makeUrl("67340"));

    /* renamed from: aB */
    public static final String f8623aB = ("level参数为空|level参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67341"));

    /* renamed from: aC */
    public static final String f8624aC = ("level参数超出64 chars|level参数不能超出64 chars，详见问题连接：" + UMLogUtils.makeUrl("67341"));

    /* renamed from: aD */
    public static final String f8625aD = ("level参数为空|level参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67341"));

    /* renamed from: aE */
    public static final String f8626aE = ("level参数超出64 chars|level参数不能超出64 chars，详见问题连接：" + UMLogUtils.makeUrl("67341"));

    /* renamed from: aF */
    public static final String f8627aF = ("level参数为空|level参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67341"));

    /* renamed from: aG */
    public static final String f8628aG = ("level参数超出64 chars|level参数不能超出64 chars，详见问题连接：" + UMLogUtils.makeUrl("67341"));

    /* renamed from: aH */
    public static final String f8629aH = ("money参数小于0或coin参数小于0|money参数不能小于0或coin参数不能小于0，详见问题链接：" + UMLogUtils.makeUrl("67342"));

    /* renamed from: aI */
    public static final String f8630aI = ("source参数小于等于0或source参数大于等于100|source参数不能小于等于0或source参数不能大于等于100，详见问题链接：" + UMLogUtils.makeUrl("67342"));

    /* renamed from: aJ */
    public static final String f8631aJ = ("source参数小于等于0或source参数大于等于100|source参数不能小于等于0或source参数不能大于等于100，详见问题链接：" + UMLogUtils.makeUrl("67342"));

    /* renamed from: aK */
    public static final String f8632aK = ("money参数小于0或number参数小于0或price参数小于0|money参数不能小于0或number参数不能小于0或price参数不能小于0，详见问题链接：" + UMLogUtils.makeUrl("67342"));

    /* renamed from: aL */
    public static final String f8633aL = ("item参数为空|item参数不能为空，详见问题链接：" + UMLogUtils.makeUrl("67342"));

    /* renamed from: aM */
    public static final String f8634aM = ("currencyAmount参数小于0或virtualAmount参数小于0|currencyAmount参数不能小于0或virtualAmount参数不能小于0，详见问题链接：" + UMLogUtils.makeUrl("67343"));

    /* renamed from: aN */
    public static final String f8635aN = ("channel参数小于0或channel参数大于等于100|channel参数不能小于0或channel参数不能大于等于100，详见问题链接：" + UMLogUtils.makeUrl("67343"));

    /* renamed from: aO */
    public static final String f8636aO = ("item参数为空|item参数不能为空，详见问题链接：" + UMLogUtils.makeUrl("67344"));

    /* renamed from: aP */
    public static final String f8637aP = ("number参数小于0或price参数小于0|number参数不能小于0或price参数不能小于0，详见问题链接：" + UMLogUtils.makeUrl("67344"));

    /* renamed from: aQ */
    public static final String f8638aQ = ("coin参数小于0|coin参数不能小于0，详见问题链接：" + UMLogUtils.makeUrl("67345"));

    /* renamed from: aR */
    public static final String f8639aR = ("source参数小于0或source参数大于等于100|source参数不能小于0或source参数不能大于等于100，详见问题链接：" + UMLogUtils.makeUrl("67345"));

    /* renamed from: aS */
    public static final String f8640aS = ("item参数为空|item参数不能为空，详见问题链接：" + UMLogUtils.makeUrl("67345"));

    /* renamed from: aT */
    public static final String f8641aT = ("number参数小于0或price参数小于0|number参数不能小于0或price参数不能小于0，详见问题链接：" + UMLogUtils.makeUrl("67345"));

    /* renamed from: aU */
    public static final String f8642aU = ("source参数小于0或source参数大于等于100|source参数不能小于0或source参数不能大于等于100，详见问题链接：" + UMLogUtils.makeUrl("67345"));

    /* renamed from: aV */
    public static final String f8643aV = ("item参数为空|item参数不能为空，详见问题链接：" + UMLogUtils.makeUrl("67346"));

    /* renamed from: aW */
    public static final String f8644aW = ("number参数小于0或price参数小于0|number参数不能小于0或price参数不能小于0，详见问题链接：" + UMLogUtils.makeUrl("67346"));

    /* renamed from: aa */
    public static final String f8645aa = ("unregisterPreProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + UMLogUtils.makeUrl("67310"));

    /* renamed from: ab */
    public static final String f8646ab = ("clearPreProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + UMLogUtils.makeUrl("67310"));

    /* renamed from: ac */
    public static final String f8647ac = ("getPreProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接：" + UMLogUtils.makeUrl("67310"));

    /* renamed from: ad */
    public static final String f8648ad = ("eventName为空，请检查|eventName参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67311"));

    /* renamed from: ae */
    public static final String f8649ae = ("请注意：map为空|track接口的参数说明，详见问题连接：" + UMLogUtils.makeUrl("67311"));

    /* renamed from: af */
    public static final String f8650af = ("context参数为空｜context参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67312"));

    /* renamed from: ag */
    public static final String f8651ag = ("propertyName参数或propertyValue参数为空｜propertyName、propertyValue参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67312"));

    /* renamed from: ah */
    public static final String f8652ah = ("context参数为空|context参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67313"));

    /* renamed from: ai */
    public static final String f8653ai = ("context参数为空|context参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67316"));

    /* renamed from: aj */
    public static final String f8654aj = ("context参数为空|context参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67318"));

    /* renamed from: ak */
    public static final String f8655ak = ("trackID参数为空|trackID参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67318"));

    /* renamed from: al */
    public static final String f8656al = ("context参数为空|context参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67319"));

    /* renamed from: am */
    public static final String f8657am = ("propertics参数为空|propertics参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67319"));

    /* renamed from: an */
    public static final String f8658an = ("context参数为空|context参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67320"));

    /* renamed from: ao */
    public static final String f8659ao = ("未匹配到您传入的property参数|property参数不能匹配，" + UMLogUtils.makeUrl("67320"));

    /* renamed from: ap */
    public static final String f8660ap = ("context参数为空|context参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67321"));

    /* renamed from: aq */
    public static final String f8661aq = ("context参数为空|context参数不能为空，详见问题连接：" + UMLogUtils.makeUrl("67322"));

    /* renamed from: ar */
    public static final String f8662ar = ("startLevel接口调用非法。|当前处于非Game场景中，不能使用Game相关接口，详见问题连接：" + UMLogUtils.makeUrl("67340"));

    /* renamed from: as */
    public static final String f8663as = ("finishLevel接口调用非法。|当前处于非Game场景中，不能使用Game相关接口，详见问题连接：" + UMLogUtils.makeUrl("67340"));

    /* renamed from: at */
    public static final String f8664at = ("failLevel接口调用非法。|当前处于非Game场景中，不能使用Game相关接口，详见问题连接：" + UMLogUtils.makeUrl("67340"));

    /* renamed from: au */
    public static final String f8665au = ("pay接口调用非法。|当前处于非Game场景中，不能使用Game相关接口，详见问题连接：" + UMLogUtils.makeUrl("67340"));

    /* renamed from: av */
    public static final String f8666av = ("exchange接口调用非法。|当前处于非Game场景中，不能使用Game相关接口，详见问题连接：" + UMLogUtils.makeUrl("67340"));

    /* renamed from: aw */
    public static final String f8667aw = ("buy接口调用非法。|当前处于非Game场景中，不能使用Game相关接口，详见问题连接：" + UMLogUtils.makeUrl("67340"));

    /* renamed from: ax */
    public static final String f8668ax = ("use接口调用非法。|当前处于非Game场景中，不能使用Game相关接口，详见问题连接：" + UMLogUtils.makeUrl("67340"));

    /* renamed from: ay */
    public static final String f8669ay = ("bonus接口调用非法。|当前处于非Game场景中，不能使用Game相关接口，详见问题连接：" + UMLogUtils.makeUrl("67340"));

    /* renamed from: az */
    public static final String f8670az = ("onAppResume接口调用非法。|当前处于非Game场景中，不能使用Game相关接口，详见问题连接：" + UMLogUtils.makeUrl("67340"));

    /* renamed from: b */
    public static final String f8671b = ("事件ID和保留字冲突|onEvent接口传入的事件ID不能和保留字冲突。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: c */
    public static final String f8672c = ("事件ID为null或者为空字符串|onEvent接口传入的事件ID不能为null，也不能为空字符串。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: d */
    public static final String f8673d = ("事件属性集合map没有加入K-V值|事件属性集合参数map必须添加K-V值。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: e */
    public static final String f8674e = ("事件属性集合map中key值和保留字冲突|事件属性集合map中key值不能和保留字冲突。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: f */
    public static final String f8675f = ("事件ID为null或者长度超过限制|事件ID不能为null、空串，且长度不能超过128个字符。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: g */
    public static final String f8676g = ("事件属性集合参数为空或者事件属性集合map没有加入K-V值|事件属性集合参数map必须添加K-V值。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: h */
    public static final String f8677h = ("事件属性集合map中key非法|事件属性集合参数map中key不能为非法的。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: i */
    public static final String f8678i = ("事件属性集合map中value为null|事件属性集合参数map中value不能为null。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: j */
    public static final String f8679j = ("事件属性集合map中value长度超过限制|事件属性集合参数map中value如果为字符串时，其长度不能超过256个字符。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: k */
    public static final String f8680k = ("事件标签为null或者为空字符串|onEvent接口传入的事件标签不能为null，也不能为空字符串。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: l */
    public static final String f8681l = ("事件ID为null或者长度超过限制，或事件标签长度超过限制|事件ID不能为null、空串，且长度不能超过128个字符。事件标签长度不能超过256个字符。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: m */
    public static final String f8682m = ("事件ID和保留字冲突|onEvent接口传入的事件ID不能和保留字冲突。详见问题链接 " + UMLogUtils.makeUrl("66946"));

    /* renamed from: n */
    public static final String f8683n = ("MobclickAgent.onResume接口参数不能为null|MobclickAgent.onResume接口参数应该传入当前Activity的上下文。详见问题链接 " + UMLogUtils.makeUrl("66948"));

    /* renamed from: o */
    public static final String f8684o = ("MobclickAgent.onResume接口参数不是Activity的上下文|MobclickAgent.onResume接口参数应该传入当前Activity的上下文。详见问题链接 " + UMLogUtils.makeUrl("66948"));

    /* renamed from: p */
    public static final String f8685p = ("MobclickAgent.onPause接口参数不能为null|MobclickAgent.onPause接口参数应该传入当前Activity的上下文。详见问题链接 " + UMLogUtils.makeUrl("66948"));

    /* renamed from: q */
    public static final String f8686q = ("MobclickAgent.onPause接口参数不是Activity的上下文|MobclickAgent.onPause接口参数应该传入当前Activity的上下文。详见问题链接 " + UMLogUtils.makeUrl("66948"));

    /* renamed from: r */
    public static final String f8687r = ("@ 遗漏了Mobclick.onResume函数调用|每个Activity的onResume中都必须调用MobclickAgent.onResume。详见问题链接 " + UMLogUtils.makeUrl("66948"));

    /* renamed from: s */
    public static final String f8688s = ("@ 遗漏了Mobclick.onPaused函数调用|每个Activity的onPaused中都必须调用MobclickAgent.onPaused。详见问题链接 " + UMLogUtils.makeUrl("66948"));

    /* renamed from: t */
    public static final String f8689t = ("MobclickAgent.onProfileSignIn接口参数 账号ID 不能为null|账号ID不能为空。详见问题链接 " + UMLogUtils.makeUrl("66951"));

    /* renamed from: u */
    public static final String f8690u = ("MobclickAgent.onProfileSignIn接口参数 账号ID 长度超过限制|账号ID 长度不能超过64个字符。详见问题链接 " + UMLogUtils.makeUrl("66951"));

    /* renamed from: v */
    public static final String f8691v = ("MobclickAgent.onProfileSignIn接口参数 账号来源 长度超过限制|账号来源 长度不能超过32个字符。详见问题链接 " + UMLogUtils.makeUrl("66951"));

    /* renamed from: w */
    public static final String f8692w = ("MobclickAgent.reportError方法参数context不能为null|参数Context需要指定ApplicationContext值。详见问题链接 " + UMLogUtils.makeUrl("66971"));

    /* renamed from: x */
    public static final String f8693x = ("MobclickAgent.reportError方法参数error不能为null，也不能为空字符串。|error参数必须是非空字符串。详见问题链接 " + UMLogUtils.makeUrl("66971"));

    /* renamed from: y */
    public static final String f8694y = ("MobclickAgent.reportError方法 Context和Throwable参数都不能为空。|参数Context需要指定ApplicationContext值，Throwable参数传入捕获到的异常对象。详见问题链接 " + UMLogUtils.makeUrl("66971"));

    /* renamed from: z */
    public static final String f8695z = "MobclickAgent.setSecret方法参数context不能为null|参数Context需要指定ApplicationContext值。";
}
