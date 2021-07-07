package com.huawei.hms.api;

import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.Collections;
import java.util.List;

public class Api<O extends ApiOptions> {

    /* renamed from: a */
    public final String f1096a;

    /* renamed from: b */
    public final Options<O> f1097b;

    public interface ApiOptions {

        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    public static abstract class Options<O> {
        public List<PermissionInfo> getPermissionInfoList(O o) {
            return Collections.emptyList();
        }

        public List<Scope> getScopeList(O o) {
            return Collections.emptyList();
        }
    }

    public Api(String str) {
        this.f1096a = str;
        this.f1097b = null;
    }

    public String getApiName() {
        return this.f1096a;
    }

    public Options<O> getOptions() {
        return this.f1097b;
    }

    public Api(String str, Options<O> options) {
        this.f1096a = str;
        this.f1097b = options;
    }
}
