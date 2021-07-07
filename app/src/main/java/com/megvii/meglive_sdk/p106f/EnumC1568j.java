package com.megvii.meglive_sdk.p106f;

/* renamed from: com.megvii.meglive_sdk.f.j */
public enum EnumC1568j {
    LIVENESS_FINISH(1001, 1000, "LIVENESS_FINISH", "流程成功"),
    ILLEGAL_PARAMETER(6003, 4200, "ILLEGAL_PARAMETER", "传入参数不合法"),
    REQUEST_FREQUENTLY(4300, 4300, "REQUEST_FREQUENTLY", "请求过于频繁"),
    BIZ_TOKEN_DENIED(4201, 4200, "BIZ_TOKEN_DENIED", "传入的 biz_token 不符合要求；"),
    AUTHENTICATION_FAIL(4203, 4200, "AUTHENTICATION_FAIL", "鉴权失败；"),
    MOBILE_PHONE_NOT_SUPPORT(4204, 4200, "MOBILE_PHONE_NOT_SUPPORT", "手机在不支持列表里；"),
    GET_CONFIG_FAIL(4206, 4200, "GET_CONFIG_FAIL", "读取配置失败；"),
    LIVENESS_UNKNOWN_ERROR(4300, 4300, "LIVENESS_UNKNOWN_ERROR", "未知错误"),
    API_KEY_BE_DISCONTINUED(5000, 5000, "API_KEY_BE_DISCONTINUED", "api_key被停用"),
    IP_NOT_ALLOWED(5000, 5000, "IP_NOT_ALLOWED", "不允许访问的IP"),
    BALANCE_NOT_ENOUGH(5000, 5000, "BALANCE_NOT_ENOUGH", "余额不足"),
    MORE_RETRY_TIMES(5000, 5000, "MORE_RETRY_TIMES", "获取服务器配置时超过重试次数"),
    ACCOUNT_DISCONTINUED(5000, 5000, "ACCOUNT_DISCONTINUED", "用户帐号已停用"),
    EXPIRED_SIGN(5000, 5000, "EXPIRED_SIGN", "签名过期"),
    INVALID_SIGN(5000, 5000, "INVALID_SIGN", "无效的签名"),
    CONCURRENCY_LIMIT_EXCEEDED(5000, 5000, "CONCURRENCY_LIMIT_EXCEEDED", "并发数超过限制"),
    INTERNAL_ERROR(5000, 5000, "INTERNAL_ERROR", "服务器内部错误，当此类错误发生时请再次请求，如果持续出现此类错误，请及时联系 FaceID 客服或商务"),
    NETWORK_CONFIG_ERROR(5000, 5000, "NETWORK_CONFIG_ERROR", "网络配置错误，当此类错误发生时请再次请求，如果持续出现此类错误，请及时联系 FaceID 客服或商务"),
    INVALID_BUNDLE_ID(6005, 6000, "INVALID_BUNDLE_ID", "信息验证失败，请重启程序或设备后重试"),
    NETWORK_ERROR(6006, 6000, "NETWORK_ERROR", "连不上互联网，请连接上互联网后重试"),
    USER_CANCEL(6001, 6000, "USER_CANCEL", "用户取消"),
    GO_TO_BACKGROUND(6001, 6000, "GO_TO_BACKGROUND", "切到后台"),
    NO_CAMERA_PERMISSION(6002, 6000, "NO_CAMERA_PERMISSION", "没有打开相机的权限，请开启权限后重试"),
    DEVICE_NOT_SUPPORT(6004, 6000, "DEVICE_NOT_SUPPORT", "无法启动相机，请确认摄像头功能完好"),
    FACE_INIT_FAIL(6007, 6000, "FACE_INIT_FAIL", "无法启动人脸识别，请稍后重试"),
    NO_WRITE_EXTERNAL_STORAGE_PERMISSION(6009, 6000, "NO_WRITE_EXTERNAL_STORAGE_PERMISSION", "无法读取写SD卡的权限，请开启权限后重试"),
    LIVENESS_FAILURE(6000, 6000, "LIVENESS_FAILURE", "操作失败"),
    ERROR_UNKNOWN(6200, 6200, "ERROR_UNKNOWN", "未知错误"),
    LIVENESS_TIME_OUT(9003, 9000, "LIVENESS_TIME_OUT", "操作超时，由于用户在长时间没有进行操作");
    

    /* renamed from: D */
    public int f2598D;

    /* renamed from: E */
    public int f2599E;

    /* renamed from: F */
    public String f2600F;

    /* renamed from: G */
    public String f2601G;

    /* access modifiers changed from: public */
    EnumC1568j(int i, int i2, String str, String str2) {
        this.f2598D = i;
        this.f2599E = i2;
        this.f2600F = str;
        this.f2601G = str2;
    }
}
