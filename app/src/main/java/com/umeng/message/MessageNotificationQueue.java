package com.umeng.message;

import android.annotation.TargetApi;
import com.umeng.message.entity.UNotificationItem;
import java.util.LinkedList;

public class MessageNotificationQueue {

    /* renamed from: b */
    public static MessageNotificationQueue f9870b;

    /* renamed from: a */
    public LinkedList<UNotificationItem> f9871a = new LinkedList<>();

    public static synchronized MessageNotificationQueue getInstance() {
        MessageNotificationQueue messageNotificationQueue;
        synchronized (MessageNotificationQueue.class) {
            if (f9870b == null) {
                f9870b = new MessageNotificationQueue();
            }
            messageNotificationQueue = f9870b;
        }
        return messageNotificationQueue;
    }

    public void addLast(UNotificationItem uNotificationItem) {
        this.f9871a.addLast(uNotificationItem);
    }

    public LinkedList<UNotificationItem> getQueue() {
        return this.f9871a;
    }

    @TargetApi(9)
    public UNotificationItem pollFirst() {
        return this.f9871a.pollFirst();
    }

    public void remove(UNotificationItem uNotificationItem) {
        this.f9871a.remove(uNotificationItem);
    }

    public int size() {
        return this.f9871a.size();
    }
}
