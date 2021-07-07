package anet.channel;

import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.security.C0159c;
import anet.channel.security.ISecurity;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

public final class Config {
    public static final Config DEFAULT_CONFIG = new Builder().setTag("[default]").setAppkey("[default]").setEnv(ENV.ONLINE).build();

    /* renamed from: a */
    public static Map<String, Config> f17a = new HashMap();

    /* renamed from: b */
    public String f18b;

    /* renamed from: c */
    public String f19c;

    /* renamed from: d */
    public ENV f20d = ENV.ONLINE;

    /* renamed from: e */
    public ISecurity f21e;

    public static class Builder {

        /* renamed from: a */
        public String f22a;

        /* renamed from: b */
        public String f23b;

        /* renamed from: c */
        public ENV f24c = ENV.ONLINE;

        /* renamed from: d */
        public String f25d;

        /* renamed from: e */
        public String f26e;

        public Config build() {
            if (!TextUtils.isEmpty(this.f23b)) {
                for (Config config : Config.f17a.values()) {
                    if (config.f20d == this.f24c && config.f19c.equals(this.f23b)) {
                        ALog.m292w("awcn.Config", "duplicated config exist!", null, "appkey", this.f23b, "env", this.f24c);
                        if (!TextUtils.isEmpty(this.f22a)) {
                            synchronized (Config.f17a) {
                                Config.f17a.put(this.f22a, config);
                            }
                        }
                        return config;
                    }
                }
                Config config2 = new Config();
                config2.f19c = this.f23b;
                config2.f20d = this.f24c;
                if (TextUtils.isEmpty(this.f22a)) {
                    config2.f18b = StringUtils.concatString(this.f23b, "$", this.f24c.toString());
                } else {
                    config2.f18b = this.f22a;
                }
                if (!TextUtils.isEmpty(this.f26e)) {
                    config2.f21e = C0159c.m153a().createNonSecurity(this.f26e);
                } else {
                    config2.f21e = C0159c.m153a().createSecurity(this.f25d);
                }
                synchronized (Config.f17a) {
                    Config.f17a.put(config2.f18b, config2);
                }
                return config2;
            }
            throw new RuntimeException("appkey can not be null or empty!");
        }

        public Builder setAppSecret(String str) {
            this.f26e = str;
            return this;
        }

        public Builder setAppkey(String str) {
            this.f23b = str;
            return this;
        }

        public Builder setAuthCode(String str) {
            this.f25d = str;
            return this;
        }

        public Builder setEnv(ENV env) {
            this.f24c = env;
            return this;
        }

        public Builder setTag(String str) {
            this.f22a = str;
            return this;
        }
    }

    public static Config getConfig(String str, ENV env) {
        synchronized (f17a) {
            for (Config config : f17a.values()) {
                if (config.f20d == env && config.f19c.equals(str)) {
                    return config;
                }
            }
            return null;
        }
    }

    public static Config getConfigByTag(String str) {
        Config config;
        synchronized (f17a) {
            config = f17a.get(str);
        }
        return config;
    }

    public String getAppkey() {
        return this.f19c;
    }

    public ENV getEnv() {
        return this.f20d;
    }

    public ISecurity getSecurity() {
        return this.f21e;
    }

    public String getTag() {
        return this.f18b;
    }

    public String toString() {
        return this.f18b;
    }
}
