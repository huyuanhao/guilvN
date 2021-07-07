package com.facebook.react.shell;

import com.facebook.imagepipeline.core.ImagePipelineConfig;

public class MainPackageConfig {
    public ImagePipelineConfig mFrescoConfig;

    public static class Builder {
        public ImagePipelineConfig mFrescoConfig;

        public MainPackageConfig build() {
            return new MainPackageConfig(this);
        }

        public Builder setFrescoConfig(ImagePipelineConfig imagePipelineConfig) {
            this.mFrescoConfig = imagePipelineConfig;
            return this;
        }
    }

    public ImagePipelineConfig getFrescoConfig() {
        return this.mFrescoConfig;
    }

    public MainPackageConfig(Builder builder) {
        this.mFrescoConfig = builder.mFrescoConfig;
    }
}
