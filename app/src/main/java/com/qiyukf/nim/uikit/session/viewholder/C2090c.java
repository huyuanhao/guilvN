package com.qiyukf.nim.uikit.session.viewholder;

import com.qiyukf.nimlib.sdk.msg.attachment.NotificationAttachment;
import com.qiyukf.nimlib.sdk.msg.attachment.VideoAttachment;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.api.customization.msg_list.MessageHandlerFactory;
import com.qiyukf.unicorn.api.customization.msg_list.UnicornMessageHandler;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.attachment.AudioAttachment;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.qiyukf.unicorn.api.msg.attachment.ImageAttachment;
import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;
import java.util.HashMap;

/* renamed from: com.qiyukf.nim.uikit.session.viewholder.c */
public final class C2090c {

    /* renamed from: a */
    public static HashMap<Class<? extends MsgAttachment>, Class<? extends AbstractC2083b>> f4203a = new HashMap<>();

    /* renamed from: b */
    public static HashMap<Class<? extends MsgAttachment>, Class<? extends AbstractC2083b>> f4204b = new HashMap<>();

    /* renamed from: c */
    public static HashMap<MsgTypeEnum, Class<? extends AbstractC2083b>> f4205c = new HashMap<>();

    /* renamed from: d */
    public static MessageHandlerFactory f4206d;

    static {
        m4247a(ImageAttachment.class, C2094g.class, false);
        m4247a(AudioAttachment.class, C2080a.class, false);
        m4247a(NotificationAttachment.class, C2093f.class, false);
        m4247a(FileAttachment.class, C2091d.class, false);
        m4247a(VideoAttachment.class, C2101l.class, false);
    }

    /* renamed from: a */
    public static int m4242a() {
        return f4203a.size() + 3;
    }

    /* renamed from: a */
    public static Class<? extends AbstractC2083b> m4243a(IMMessage iMMessage) {
        HashMap<MsgTypeEnum, Class<? extends AbstractC2083b>> hashMap;
        MsgTypeEnum msgTypeEnum;
        MsgTypeEnum msgType = iMMessage.getMsgType();
        MsgTypeEnum msgTypeEnum2 = MsgTypeEnum.text;
        if (msgType == msgTypeEnum2) {
            if (f4205c.get(msgTypeEnum2) == null) {
                return C2096h.class;
            }
            hashMap = f4205c;
            msgTypeEnum = MsgTypeEnum.text;
        } else if (iMMessage.getMsgType() != MsgTypeEnum.tips && iMMessage.getMsgType() != MsgTypeEnum.notification) {
            Class<? extends AbstractC2083b> cls = null;
            if (iMMessage.getAttachment() != null) {
                Class<?> cls2 = iMMessage.getAttachment().getClass();
                Class<? extends AbstractC2083b> cls3 = null;
                while (cls3 == null && cls2 != null) {
                    cls3 = f4204b.get(cls2);
                    if (cls3 == null) {
                        cls3 = f4203a.get(cls2);
                    }
                    if (cls3 == null) {
                        Class<? super Object> superclass = cls2.getSuperclass();
                        if (superclass == null || !MsgAttachment.class.isAssignableFrom(superclass)) {
                            Class<?>[] interfaces = cls2.getInterfaces();
                            int length = interfaces.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    cls2 = null;
                                    break;
                                }
                                Class<?> cls4 = interfaces[i];
                                if (MsgAttachment.class.isAssignableFrom(cls4)) {
                                    cls2 = cls4;
                                    break;
                                }
                                i++;
                            }
                        } else {
                            cls2 = superclass;
                        }
                    }
                }
                cls = cls3;
            }
            return cls == null ? C2100k.class : cls;
        } else if (f4205c.get(MsgTypeEnum.tips) == null) {
            return C2099j.class;
        } else {
            hashMap = f4205c;
            msgTypeEnum = MsgTypeEnum.tips;
        }
        return hashMap.get(msgTypeEnum);
    }

    /* renamed from: a */
    public static void m4244a(MessageHandlerFactory messageHandlerFactory) {
        f4206d = messageHandlerFactory;
    }

    /* renamed from: a */
    public static void m4245a(MsgTypeEnum msgTypeEnum, Class<? extends AbstractC2083b> cls) {
        f4205c.put(msgTypeEnum, cls);
    }

    @Deprecated
    /* renamed from: a */
    public static void m4246a(Class<? extends MsgAttachment> cls, Class<? extends AbstractC2083b> cls2) {
        m4247a(cls, cls2, false);
    }

    /* renamed from: a */
    public static void m4247a(Class<? extends MsgAttachment> cls, Class<? extends AbstractC2083b> cls2, boolean z) {
        (z ? f4204b : f4203a).put(cls, cls2);
    }

    /* renamed from: b */
    public static UnicornMessageHandler m4248b(IMMessage iMMessage) {
        MessageHandlerFactory messageHandlerFactory;
        if (iMMessage.getAttachment() == null || (messageHandlerFactory = f4206d) == null) {
            return null;
        }
        return messageHandlerFactory.handlerOf(iMMessage);
    }
}
