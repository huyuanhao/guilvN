package com.qiyukf.unicorn.api.msg;

import java.io.Serializable;

public class PushMessageExtension implements Serializable {
    public Action action;
    public Sender sender;

    public static class Action implements Serializable {
        public String label;
        public String url;

        public String getLabel() {
            return this.label;
        }

        public String getUrl() {
            return this.url;
        }

        public void setLabel(String str) {
            this.label = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public static class Sender implements Serializable {
        public String avatar;

        /* renamed from: id */
        public String f4773id;
        public String name;

        public String getAvatar() {
            return this.avatar;
        }

        public String getId() {
            return this.f4773id;
        }

        public String getName() {
            return this.name;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(String str) {
            this.f4773id = str;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    public Action getAction() {
        return this.action;
    }

    public Sender getSender() {
        return this.sender;
    }

    public void setAction(Action action2) {
        this.action = action2;
    }

    public void setSender(Sender sender2) {
        this.sender = sender2;
    }
}
