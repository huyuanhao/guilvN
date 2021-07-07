package com.qiyukf.nimlib.sdk.msg.model;

import java.io.Serializable;

public class AttachmentProgress implements Serializable {
    public final long total;
    public final long transferred;
    public final String uuid;

    public AttachmentProgress(String str, long j, long j2) {
        this.uuid = str;
        this.transferred = j;
        this.total = j2;
    }

    public long getTotal() {
        return this.total;
    }

    public long getTransferred() {
        return this.transferred;
    }

    public String getUuid() {
        return this.uuid;
    }
}
