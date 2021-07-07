package com.megvii.apo;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.megvii.apo.util.C1493c;
import com.megvii.apo.util.C1495e;
import com.megvii.apo.util.C1500j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.megvii.apo.f */
public final class C1479f extends AbstractC1486m {
    public C1479f(Context context) {
        super(context);
    }

    /* renamed from: b */
    public static String m2205b(String str) {
        return m2206b().contains(str) ? "1" : "0";
    }

    @Override // com.megvii.apo.AbstractC1486m
    /* renamed from: a */
    public final void mo16948a(Map<String, Object> map) {
        if (C1500j.f2043N == 1) {
            try {
                map.put("101101001", m2205b(C1493c.m2253a("u5hTnYI7soskAg14WypO3IGhKCIVZob4cfCBx37anVs=")));
                map.put("101101002", m2205b(C1493c.m2253a("lOXLieygp4YR1jA5trYx1yOqRDNx1Nked1RLsKF27fQ=")));
                map.put("101101003", m2205b(C1493c.m2253a("ePRJr2mrsZRBUpIJx4BjOv6si9w09+arixbmf2glnFw=")));
                map.put("101101004", m2205b(C1493c.m2253a("P9XzvZY8Z2/05Nt6t5Ng8Yj/cDWPMU/aKCBmVnwiUvM=")));
                map.put("101101005", m2205b(C1493c.m2253a("A+7lKC/2j0a4L22Es3P45+m+i2BU5GkkzQxtwQTPTU8=")));
                map.put("101101006", m2205b(C1493c.m2253a("A+7lKC/2j0a4L22Es3P45yksskOaGE/q4pv/UtRrhoc=")));
                map.put("101101007", m2205b(C1493c.m2253a("9Bh8DIKEumM/+56wE2u5GLj0lssZZVpVKZGxNpTR/40=")));
                map.put("101101008", m2205b(C1493c.m2253a("2OhTUPcGhfsAJ/xVkXdnc8drqNeS6kVh5otvVYnRMiM=")));
                map.put("101101009", m2205b(C1493c.m2253a("WnmNktfJaMdo53DrcpbyM/9SEYqRaEFGPdHp1jAmuMA=")));
                map.put("101111005", m2205b(C1493c.m2253a("64aBUmTnX/xQUcE2+w3AQ/gByLIZnwm9LoGcdhjvnbI=")));
                map.put("101111006", m2205b(C1493c.m2253a("lOXLieygp4YR1jA5trYx1wRdC4IUgfNMi9Dbc5aw0qI=")));
                map.put("101111007", m2205b(C1493c.m2253a("ePRJr2mrsZRBUpIJx4BjOuHQtFCR2rHwzeNUE+u/PCE=")));
                map.put("101111008", m2205b(C1493c.m2253a("lmOMdvJ8ZXmSGG1EnCc8zex/WD6nfHSka5BcbAjGJfo=")));
                map.put("101101010", m2205b(C1493c.m2253a("C2jq9d2zbMdj/hBeMftVqMGJeUFyQwpvQ2hULJJ4Y4w=")));
                map.put("101112001", m2205b(C1493c.m2253a("X3YMA/SuLhLhFFiBEyVww4l3UGqGtGikeHHshFawit8=")));
                map.put("101102001", m2205b(C1493c.m2253a("XIz+N97ySdVghg2dS6hTxQJD7TANSwZjW21aBTo6ydc=")));
                map.put("101102002", m2205b(C1493c.m2253a("XIz+N97ySdVghg2dS6hTxa9FRgaaEpOv2A981kwUU7Y=")));
                map.put("101102003", m2205b(C1493c.m2253a("XIz+N97ySdVghg2dS6hTxdzmeIFKFtU5ssyom+SfeLo=")));
                map.put("101102004", m2205b(C1493c.m2253a("XIz+N97ySdVghg2dS6hTxQcX/REyUkjhrQJerLeg+hY=")));
                map.put("101102005", m2205b(C1493c.m2253a("XIz+N97ySdVghg2dS6hTxXHSt9nOPvSTHtEvztWlb/0=")));
                map.put("101102006", m2205b(C1493c.m2253a("XIz+N97ySdVghg2dS6hTxR0zBgJnmeMP30wuHaiSZ0M=")));
                map.put("101102007", m2205b(C1493c.m2253a("3UmTlQzUa4DRi4W95/MHjqO7YDdcsKDyzMESh7z1ng8=")));
                map.put("101103001", m2205b(C1493c.m2253a("Pi+r/TmNUYKSw4WWAQs5PJa7nZqckueESM+I/eu5pp4=")));
                map.put("101101011", m2205b(C1493c.m2253a("Thkn/2XwLyK3RmH7f65Wvrl584FpfS6VUbg9WnKlbVQ=")));
                map.put("101101012", m2205b(C1493c.m2253a("QorE+dAbomVhigTy4krIIURizQl6STDVo3lMtyTKrQs=")));
                map.put("101101013", m2205b(C1493c.m2253a("gMyMv8jc4ccCQcK9Gl/jyXMLcW9TOCrEgGwR7FedfBI=")));
                map.put("101101014", m2205b(C1493c.m2253a("gg29Vp9SbfFwOAcPX7IeU1NdcznH0/eNSDgfqIzb2zQ=")));
                map.put("101101015", m2205b(C1493c.m2253a("wzxx3gFVepzkoDFx+mnrJ1ja02RlN6T4zPky9OAckmY=")));
                map.put("101101016", m2205b(C1493c.m2253a("P4MomXF9exgVSB9U6hhMmMJTelnLQsvjgpBm+R4A4wE=")));
                map.put("101111001", m2205b(C1493c.m2253a("QorE+dAbomVhigTy4krIIf7asb7PrYecX7GaR53CPYw=")));
                map.put("101111002", m2205b(C1493c.m2253a("gMyMv8jc4ccCQcK9Gl/jyb6jCWYG+PMh9B2exroYzDM=")));
                map.put("101111003", m2205b(C1493c.m2253a("Thkn/2XwLyK3RmH7f65WviGeAMDBHvWMZ/FLteETJRE=")));
                map.put("101111004", m2205b(C1493c.m2253a("GHdlpn7ilgkS40eK9DIHTgLwPO8aIm3qoO2j9H38d2E=")));
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    public static List<String> m2206b() {
        MediaCodecInfo[] codecInfos;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                arrayList.add(mediaCodecInfo.getName());
            }
        }
        return arrayList;
    }
}
