package com.huawei.hms.support.api.push;

import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;

public class HuaweiPush {
    public static final HuaweiPushApi HuaweiPushApi = new HuaweiPushApiImp();
    public static final Api<Api.ApiOptions.NoOptions> PUSH_API = new Api<>(HuaweiApiAvailability.HMS_API_NAME_PUSH);
}
