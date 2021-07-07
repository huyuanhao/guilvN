package com.facebook.react.bridge.queue;

import android.os.Build;
import com.facebook.infer.annotation.Assertions;
import javax.annotation.Nullable;

public class ReactQueueConfigurationSpec {
    public static final long LEGACY_STACK_SIZE_BYTES = 2000000;
    public final MessageQueueThreadSpec mJSQueueThreadSpec;
    public final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;

    public static class Builder {
        @Nullable
        public MessageQueueThreadSpec mJSQueueSpec;
        @Nullable
        public MessageQueueThreadSpec mNativeModulesQueueSpec;

        public ReactQueueConfigurationSpec build() {
            return new ReactQueueConfigurationSpec((MessageQueueThreadSpec) Assertions.assertNotNull(this.mNativeModulesQueueSpec), (MessageQueueThreadSpec) Assertions.assertNotNull(this.mJSQueueSpec));
        }

        public Builder setJSQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            Assertions.assertCondition(this.mJSQueueSpec == null, "Setting JS queue multiple times!");
            this.mJSQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            Assertions.assertCondition(this.mNativeModulesQueueSpec == null, "Setting native modules queue spec multiple times!");
            this.mNativeModulesQueueSpec = messageQueueThreadSpec;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReactQueueConfigurationSpec createDefault() {
        MessageQueueThreadSpec messageQueueThreadSpec;
        if (Build.VERSION.SDK_INT < 21) {
            messageQueueThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules", LEGACY_STACK_SIZE_BYTES);
        } else {
            messageQueueThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules");
        }
        return builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("js")).setNativeModulesQueueThreadSpec(messageQueueThreadSpec).build();
    }

    public MessageQueueThreadSpec getJSQueueThreadSpec() {
        return this.mJSQueueThreadSpec;
    }

    public MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
        return this.mNativeModulesQueueThreadSpec;
    }

    public ReactQueueConfigurationSpec(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2) {
        this.mNativeModulesQueueThreadSpec = messageQueueThreadSpec;
        this.mJSQueueThreadSpec = messageQueueThreadSpec2;
    }
}
