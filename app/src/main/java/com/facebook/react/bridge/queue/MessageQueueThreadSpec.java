package com.facebook.react.bridge.queue;

public class MessageQueueThreadSpec {
    public static final long DEFAULT_STACK_SIZE_BYTES = 0;
    public static final MessageQueueThreadSpec MAIN_UI_SPEC = new MessageQueueThreadSpec(ThreadType.MAIN_UI, "main_ui");
    public final String mName;
    public final long mStackSize;
    public final ThreadType mThreadType;

    public enum ThreadType {
        MAIN_UI,
        NEW_BACKGROUND
    }

    public MessageQueueThreadSpec(ThreadType threadType, String str) {
        this(threadType, str, 0);
    }

    public static MessageQueueThreadSpec mainThreadSpec() {
        return MAIN_UI_SPEC;
    }

    public static MessageQueueThreadSpec newBackgroundThreadSpec(String str) {
        return new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, str);
    }

    public static MessageQueueThreadSpec newUIBackgroundTreadSpec(String str) {
        return new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, str);
    }

    public String getName() {
        return this.mName;
    }

    public long getStackSize() {
        return this.mStackSize;
    }

    public ThreadType getThreadType() {
        return this.mThreadType;
    }

    public MessageQueueThreadSpec(ThreadType threadType, String str, long j) {
        this.mThreadType = threadType;
        this.mName = str;
        this.mStackSize = j;
    }

    public static MessageQueueThreadSpec newBackgroundThreadSpec(String str, long j) {
        return new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, str, j);
    }
}
