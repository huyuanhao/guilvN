package com.netease.nimlib.util.storage;

import com.p118pd.sdk.C8884ooO0oo0O;

public enum NimStorageType {
    TYPE_LOG(DirectoryName.LOG_DIRECTORY_NAME),
    TYPE_FILE(DirectoryName.FILE_DIRECTORY_NAME),
    TYPE_AUDIO(DirectoryName.AUDIO_DIRECTORY_NAME),
    TYPE_IMAGE(DirectoryName.IMAGE_DIRECTORY_NAME),
    TYPE_VIDEO(DirectoryName.VIDEO_DIRECTORY_NAME),
    TYPE_THUMB_IMAGE(DirectoryName.THUMB_DIRECTORY_NAME);
    
    public DirectoryName storageDirectoryName;
    public long storageMinSize;

    public enum DirectoryName {
        AUDIO_DIRECTORY_NAME("audio/"),
        FILE_DIRECTORY_NAME("file/"),
        LOG_DIRECTORY_NAME("log/"),
        IMAGE_DIRECTORY_NAME("image/"),
        THUMB_DIRECTORY_NAME("thumb/"),
        VIDEO_DIRECTORY_NAME("video/");
        
        public final String path;

        /* access modifiers changed from: public */
        DirectoryName(String str) {
            this.path = str;
        }

        public final String getPath() {
            return this.path;
        }
    }

    /* access modifiers changed from: public */
    NimStorageType(DirectoryName directoryName) {
        this(directoryName, C8884ooO0oo0O.OooO0Oo);
    }

    public long getStorageMinSize() {
        return this.storageMinSize;
    }

    public String getStoragePath() {
        return this.storageDirectoryName.getPath();
    }

    /* access modifiers changed from: public */
    NimStorageType(DirectoryName directoryName, long j) {
        this.storageDirectoryName = directoryName;
        this.storageMinSize = j;
    }
}
