package com.jinhui365.hotsources.bean;

import com.google.gson.annotations.SerializedName;
import com.p118pd.sdk.C9044ooOoOO0O;
import java.io.Serializable;
import java.util.List;

public class StringHotVO implements Serializable {
    public List<ArgsBean> args;
    public String format;

    public static class ArgsBean implements Serializable {
        public FuncsBean funcs;
        public String key;

        public static class FuncsBean implements Serializable {
            @SerializedName("class")
            public String clazz;
            public String method;
            public List<String> params;

            public String getClazz() {
                return this.clazz;
            }

            public String getMethod() {
                return this.method;
            }

            public List<String> getParams() {
                return this.params;
            }

            public boolean isHasParams() {
                return C9044ooOoOO0O.OooO0O0(this.params);
            }

            public void setClazz(String str) {
                this.clazz = str;
            }

            public void setMethod(String str) {
                this.method = str;
            }

            public void setParams(List<String> list) {
                this.params = list;
            }

            public String toString() {
                return "FuncsBean{clazz='" + this.clazz + '\'' + ", method='" + this.method + '\'' + ", params=" + this.params + '}';
            }
        }

        public FuncsBean getFuncs() {
            return this.funcs;
        }

        public String getKey() {
            return this.key;
        }

        public boolean isHasFuncs() {
            return this.funcs != null;
        }

        public void setFuncs(FuncsBean funcsBean) {
            this.funcs = funcsBean;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public String toString() {
            return "ArgsBean{key='" + this.key + '\'' + ", funcs=" + this.funcs + '}';
        }
    }

    public List<ArgsBean> getArgs() {
        return this.args;
    }

    public String getFormat() {
        return this.format;
    }

    public boolean isHasArgs() {
        return C9044ooOoOO0O.OooO0O0(getArgs());
    }

    public void setArgs(List<ArgsBean> list) {
        this.args = list;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public String toString() {
        return "StringHotVO{format='" + this.format + '\'' + ", args=" + this.args + '}';
    }
}
