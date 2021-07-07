package com.qiyukf.nimlib.p198j.p201c;

import com.p118pd.sdk.C8884ooO0oo0O;

/* renamed from: com.qiyukf.nimlib.j.c.c */
public enum EnumC2347c {
    TYPE_LOG(EnumC2348a.LOG_DIRECTORY_NAME),
    TYPE_TEMP(EnumC2348a.TEMP_DIRECTORY_NAME),
    TYPE_FILE(EnumC2348a.FILE_DIRECTORY_NAME),
    TYPE_AUDIO(EnumC2348a.AUDIO_DIRECTORY_NAME),
    TYPE_IMAGE(EnumC2348a.IMAGE_DIRECTORY_NAME),
    TYPE_VIDEO(EnumC2348a.VIDEO_DIRECTORY_NAME),
    TYPE_THUMB_IMAGE(EnumC2348a.THUMB_DIRECTORY_NAME);
    

    /* renamed from: h */
    public EnumC2348a f4706h;

    /* renamed from: i */
    public long f4707i;

    /* renamed from: com.qiyukf.nimlib.j.c.c$a */
    public enum EnumC2348a {
        AUDIO_DIRECTORY_NAME("audio/"),
        FILE_DIRECTORY_NAME("file/"),
        LOG_DIRECTORY_NAME("log/"),
        TEMP_DIRECTORY_NAME("temp/"),
        IMAGE_DIRECTORY_NAME("image/"),
        THUMB_DIRECTORY_NAME("thumb/"),
        VIDEO_DIRECTORY_NAME("video/");
        

        /* renamed from: h */
        public final String f4716h;

        /* access modifiers changed from: public */
        EnumC2348a(String str) {
            this.f4716h = str;
        }

        /* renamed from: a */
        public final String mo35096a() {
            return this.f4716h;
        }
    }

    /* access modifiers changed from: public */
    EnumC2347c(EnumC2348a aVar) {
        this(aVar, (byte) 0);
    }

    /* access modifiers changed from: public */
    EnumC2347c(EnumC2348a aVar, byte b) {
        this.f4706h = aVar;
        this.f4707i = C8884ooO0oo0O.OooO0Oo;
    }

    /* renamed from: a */
    public final String mo35094a() {
        return this.f4706h.mo35096a();
    }

    /* renamed from: b */
    public final long mo35095b() {
        return this.f4707i;
    }
}
