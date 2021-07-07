package com.umeng.socialize.bean;

public enum RequestType {
    SOCIAL {
        public String toString() {
            return "0";
        }
    },
    ANALYTICS {
        public String toString() {
            return "1";
        }
    },
    API {
        public String toString() {
            return "2";
        }
    }
}
