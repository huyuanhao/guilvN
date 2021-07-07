package com.qiyukf.nimlib.p195h;

import android.util.SparseArray;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.sdk.msg.attachment.LocationAttachment;
import com.qiyukf.nimlib.sdk.msg.attachment.MsgAttachmentParser;
import com.qiyukf.nimlib.sdk.msg.attachment.VideoAttachment;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.attachment.AudioAttachment;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.qiyukf.unicorn.api.msg.attachment.ImageAttachment;
import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;

/* renamed from: com.qiyukf.nimlib.h.e */
public final class C2321e {

    /* renamed from: a */
    public SparseArray<MsgAttachmentParser> f4651a = new SparseArray<>();

    /* renamed from: com.qiyukf.nimlib.h.e$a */
    public static class C2322a implements MsgAttachmentParser {

        /* renamed from: a */
        public int f4652a;

        public C2322a(int i) {
            this.f4652a = i;
        }

        @Override // com.qiyukf.nimlib.sdk.msg.attachment.MsgAttachmentParser
        public final MsgAttachment parse(String str) {
            int i = this.f4652a;
            if (i == 1) {
                return new ImageAttachment(str);
            }
            if (i == 2) {
                return new AudioAttachment(str);
            }
            if (i == 3) {
                return new VideoAttachment(str);
            }
            if (i == 4) {
                return new LocationAttachment(str);
            }
            if (i != 6) {
                return null;
            }
            return new FileAttachment(str);
        }
    }

    public C2321e() {
        m5015a(MsgTypeEnum.image.getValue());
        m5015a(MsgTypeEnum.audio.getValue());
        m5015a(MsgTypeEnum.video.getValue());
        m5015a(MsgTypeEnum.location.getValue());
        m5015a(MsgTypeEnum.file.getValue());
    }

    /* renamed from: a */
    private void m5015a(int i) {
        mo35048a(i, new C2322a(i));
    }

    /* renamed from: a */
    public final MsgAttachment mo35047a(int i, String str) {
        MsgAttachmentParser msgAttachmentParser;
        synchronized (this.f4651a) {
            msgAttachmentParser = this.f4651a.get(i);
        }
        if (msgAttachmentParser == null) {
            return null;
        }
        try {
            return msgAttachmentParser.parse(str);
        } catch (Exception e) {
            C1709a.m3015b("MsgAttachmentCreator", "create is error", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo35048a(int i, MsgAttachmentParser msgAttachmentParser) {
        synchronized (this.f4651a) {
            this.f4651a.put(i, msgAttachmentParser);
        }
    }
}
