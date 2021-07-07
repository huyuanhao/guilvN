package com.google.android.gms.internal.firebase_ml;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.p027ml.vision.text.FirebaseVisionText;
import com.google.firebase.p027ml.vision.text.RecognizedLanguage;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class zzql {
    public static final GmsLogger zzaoz = new GmsLogger("TextAnnotationConverter", "");

    @Nullable
    @VisibleForTesting
    public static String zza(@NonNull zzjx zzjx) {
        Preconditions.checkNotNull(zzjx, "Input Word can not be null");
        if (zzjx.getSymbols() == null || zzjx.getSymbols().size() <= 0) {
            return null;
        }
        zzjr zzjr = zzjx.getSymbols().get(zzjx.getSymbols().size() - 1);
        if (zzjr.zzhr() == null || zzjr.zzhr().zzhz() == null) {
            return null;
        }
        return zzjx.getSymbols().get(zzjx.getSymbols().size() - 1).zzhr().zzhz().getType();
    }

    @Nullable
    public static FirebaseVisionText zzb(@NonNull zzjs zzjs, float f) {
        Iterator<zziu> it;
        Iterator<zzjl> it2;
        FirebaseVisionText.TextBlock textBlock;
        Iterator<zzjm> it3;
        Iterator<zziu> it4;
        Iterator<zzjl> it5;
        String str;
        FirebaseVisionText.Element element;
        Preconditions.checkNotNull(zzjs, "The input TextAnnotation can not be null");
        FirebaseVisionText.TextBlock textBlock2 = null;
        if (zzjs.getPages().size() <= 0) {
            zzaoz.mo10801d("TextAnnotationConverter", "Text Annotation is null, return null");
            return null;
        }
        if (zzjs.getPages().size() > 1) {
            zzaoz.mo10801d("TextAnnotationConverter", "Text Annotation has more than one page, which should not happen");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zzjl> it6 = zzjs.getPages().iterator();
        while (it6.hasNext()) {
            Iterator<zziu> it7 = it6.next().getBlocks().iterator();
            while (it7.hasNext()) {
                zziu next = it7.next();
                Preconditions.checkNotNull(next, "Input block can not be null");
                ArrayList arrayList2 = new ArrayList();
                if (next.getParagraphs() == null) {
                    it2 = it6;
                    textBlock = textBlock2;
                    it = it7;
                } else {
                    Iterator<zzjm> it8 = next.getParagraphs().iterator();
                    while (it8.hasNext()) {
                        zzjm next2 = it8.next();
                        if (next2 != null) {
                            Preconditions.checkNotNull(next2, "Input Paragraph can not be null");
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            HashSet<RecognizedLanguage> hashSet = new HashSet();
                            StringBuilder sb = new StringBuilder();
                            int i = 0;
                            float f2 = 0.0f;
                            while (i < next2.getWords().size()) {
                                zzjx zzjx = next2.getWords().get(i);
                                if (zzjx != null) {
                                    Preconditions.checkNotNull(zzjx, "Input Word can not be null");
                                    Rect zza = zzpm.zza(zzjx.zzhq(), f);
                                    it5 = it6;
                                    List<RecognizedLanguage> zze = zze(zzjx.zzhr());
                                    Preconditions.checkNotNull(zzjx, "Input Word can not be null");
                                    String str2 = "";
                                    if (zzjx.getSymbols() == null) {
                                        it4 = it7;
                                        str = str2;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        for (zzjr zzjr : zzjx.getSymbols()) {
                                            sb2.append(zzjr.getText());
                                            it7 = it7;
                                        }
                                        it4 = it7;
                                        str = sb2.toString();
                                    }
                                    if (str.isEmpty()) {
                                        it3 = it8;
                                        element = null;
                                    } else {
                                        it3 = it8;
                                        element = new FirebaseVisionText.Element(str, zza, zze, zzjx.getConfidence());
                                    }
                                    if (element != null) {
                                        arrayList4.add(element);
                                        float zza2 = f2 + zzpm.zza(element.getConfidence());
                                        hashSet.addAll(element.getRecognizedLanguages());
                                        sb.append(element.getText());
                                        Preconditions.checkNotNull(zzjx, "Input word can not be null");
                                        String zza3 = zza(zzjx);
                                        if (zza3 != null) {
                                            if (zza3.equals("SPACE") || zza3.equals("SURE_SPACE")) {
                                                str2 = " ";
                                            } else if (zza3.equals("HYPHEN")) {
                                                str2 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
                                            }
                                        }
                                        sb.append(str2);
                                        Preconditions.checkNotNull(zzjx, "Input word can not be null");
                                        String zza4 = zza(zzjx);
                                        if (!(zza4 != null && (zza4.equals("EOL_SURE_SPACE") || zza4.equals("LINE_BREAK") || zza4.equals("HYPHEN")))) {
                                            if (i != next2.getWords().size() - 1) {
                                                f2 = zza2;
                                            }
                                        }
                                        Preconditions.checkNotNull(arrayList4, "Input elements can not be null");
                                        int size = arrayList4.size();
                                        int i2 = 0;
                                        Rect rect = null;
                                        while (i2 < size) {
                                            Object obj = arrayList4.get(i2);
                                            i2++;
                                            FirebaseVisionText.Element element2 = (FirebaseVisionText.Element) obj;
                                            if (element2.getBoundingBox() != null) {
                                                Rect rect2 = rect == null ? new Rect() : rect;
                                                rect2.union(element2.getBoundingBox());
                                                rect = rect2;
                                            }
                                        }
                                        String sb3 = sb.toString();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (RecognizedLanguage recognizedLanguage : hashSet) {
                                            if (!(recognizedLanguage == null || recognizedLanguage.getLanguageCode() == null || recognizedLanguage.getLanguageCode().isEmpty())) {
                                                arrayList5.add(recognizedLanguage);
                                            }
                                        }
                                        arrayList3.add(new FirebaseVisionText.Line(sb3, rect, arrayList5, arrayList4, Float.compare(zza2, 0.0f) > 0 ? Float.valueOf(zza2 / ((float) arrayList4.size())) : null));
                                        ArrayList arrayList6 = new ArrayList();
                                        hashSet.clear();
                                        arrayList4 = arrayList6;
                                        sb = new StringBuilder();
                                        f2 = 0.0f;
                                        i++;
                                        it6 = it5;
                                        it7 = it4;
                                        it8 = it3;
                                    }
                                } else {
                                    it5 = it6;
                                    it4 = it7;
                                    it3 = it8;
                                }
                                i++;
                                it6 = it5;
                                it7 = it4;
                                it8 = it3;
                            }
                            arrayList2.addAll(arrayList3);
                        }
                    }
                    it2 = it6;
                    it = it7;
                    if (arrayList2.isEmpty()) {
                        textBlock = null;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        int size2 = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList2.get(i3);
                            i3++;
                            sb4.append(((FirebaseVisionText.Line) obj2).getText());
                            sb4.append("\n");
                        }
                        textBlock = new FirebaseVisionText.TextBlock(sb4.toString(), zzpm.zza(next.zzhq(), f), zze(next.zzhr()), arrayList2, next.getConfidence());
                    }
                }
                if (textBlock != null) {
                    arrayList.add(textBlock);
                }
                textBlock2 = null;
                it6 = it2;
                it7 = it;
            }
            textBlock2 = null;
        }
        return new FirebaseVisionText(zzjs.getText(), arrayList);
    }

    public static List<RecognizedLanguage> zze(@Nullable zzjt zzjt) {
        ArrayList arrayList = new ArrayList();
        if (!(zzjt == null || zzjt.zzia() == null)) {
            for (zziz zziz : zzjt.zzia()) {
                RecognizedLanguage zza = RecognizedLanguage.zza(zziz);
                if (zza != null) {
                    arrayList.add(zza);
                }
            }
        }
        return arrayList;
    }
}
