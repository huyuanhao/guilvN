package com.google.firebase.p027ml.vision.document;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_ml.zziu;
import com.google.android.gms.internal.firebase_ml.zziz;
import com.google.android.gms.internal.firebase_ml.zzjl;
import com.google.android.gms.internal.firebase_ml.zzjm;
import com.google.android.gms.internal.firebase_ml.zzjr;
import com.google.android.gms.internal.firebase_ml.zzjs;
import com.google.android.gms.internal.firebase_ml.zzjt;
import com.google.android.gms.internal.firebase_ml.zzjx;
import com.google.android.gms.internal.firebase_ml.zzpm;
import com.google.android.gms.internal.firebase_ml.zzql;
import com.google.firebase.p027ml.vision.text.RecognizedLanguage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText */
public class FirebaseVisionDocumentText {
    public final List<Block> blocks;
    public final String text;

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$Block */
    public static class Block extends DocumentTextBase {
        public final List<Paragraph> paragraphs;

        public Block(@NonNull List<RecognizedLanguage> list, @Nullable RecognizedBreak recognizedBreak, @Nullable Rect rect, @NonNull List<Paragraph> list2, @NonNull String str, Float f) {
            super(list, recognizedBreak, rect, str, f);
            this.paragraphs = list2;
        }

        public static Block zza(@NonNull zziu zziu, float f) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            List<RecognizedLanguage> zze = zzql.zze(zziu.zzhr());
            if (zziu.getParagraphs() != null) {
                for (zzjm zzjm : zziu.getParagraphs()) {
                    if (zzjm != null) {
                        Paragraph zza = Paragraph.zza(zzjm, f);
                        if (sb.length() != 0) {
                            sb.append("\n");
                        }
                        sb.append(zza.getText());
                        arrayList.add(zza);
                    }
                }
            }
            return new Block(zze, new RecognizedBreak(), zzpm.zza(zziu.zzhq(), f), arrayList, sb.toString(), zziu.getConfidence());
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        public List<Paragraph> getParagraphs() {
            return this.paragraphs;
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        @Nullable
        public /* bridge */ /* synthetic */ RecognizedBreak getRecognizedBreak() {
            return super.getRecognizedBreak();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }
    }

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$DocumentTextBase */
    public static class DocumentTextBase {
        public final Float confidence;
        public final String text;
        public final Rect zzawz;
        public final List<RecognizedLanguage> zzaxs;
        public final RecognizedBreak zzaxt;

        public DocumentTextBase(@NonNull List<RecognizedLanguage> list, @Nullable RecognizedBreak recognizedBreak, @Nullable Rect rect, @NonNull String str, @Nullable Float f) {
            this.text = str;
            this.zzaxs = list;
            this.zzaxt = recognizedBreak;
            this.zzawz = rect;
            this.confidence = f;
        }

        @Nullable
        public Rect getBoundingBox() {
            return this.zzawz;
        }

        @Nullable
        public Float getConfidence() {
            return this.confidence;
        }

        @Nullable
        public RecognizedBreak getRecognizedBreak() {
            return this.zzaxt;
        }

        public List<RecognizedLanguage> getRecognizedLanguages() {
            return this.zzaxs;
        }

        public String getText() {
            return this.text;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$Paragraph */
    public static class Paragraph extends DocumentTextBase {
        public final List<Word> words;

        public Paragraph(@NonNull List<RecognizedLanguage> list, @Nullable RecognizedBreak recognizedBreak, @Nullable Rect rect, @NonNull List<Word> list2, @NonNull String str, @Nullable Float f) {
            super(list, recognizedBreak, rect, str, f);
            this.words = list2;
        }

        public static Paragraph zza(@NonNull zzjm zzjm, float f) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            List<RecognizedLanguage> zze = zzql.zze(zzjm.zzhr());
            if (zzjm.getWords() != null) {
                for (zzjx zzjx : zzjm.getWords()) {
                    if (zzjx != null) {
                        Word zza = Word.zza(zzjx, f);
                        sb.append(zza.getText());
                        sb.append(FirebaseVisionDocumentText.zza(zza.getRecognizedBreak()));
                        arrayList.add(zza);
                    }
                }
            }
            return new Paragraph(zze, new RecognizedBreak(), zzpm.zza(zzjm.zzhq(), f), arrayList, sb.toString(), zzjm.getConfidence());
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        @Nullable
        public /* bridge */ /* synthetic */ RecognizedBreak getRecognizedBreak() {
            return super.getRecognizedBreak();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        public List<Word> getWords() {
            return this.words;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$RecognizedBreak */
    public static class RecognizedBreak {
        public static final int EOL_SURE_SPACE = 3;
        public static final int HYPHEN = 4;
        public static final int LINE_BREAK = 5;
        public static final int SPACE = 1;
        public static final int SURE_SPACE = 2;
        public static final int UNKNOWN = 0;
        public final int type;
        public final boolean zzaxu;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$RecognizedBreak$BreakType */
        public @interface BreakType {
        }

        public RecognizedBreak(int i, boolean z) {
            this.type = i;
            this.zzaxu = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
        @androidx.annotation.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.RecognizedBreak zzc(@androidx.annotation.Nullable com.google.android.gms.internal.firebase_ml.zzjt r8) {
            /*
            // Method dump skipped, instructions count: 164
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.RecognizedBreak.zzc(com.google.android.gms.internal.firebase_ml.zzjt):com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$RecognizedBreak");
        }

        public int getDetectedBreakType() {
            return this.type;
        }

        public boolean getIsPrefix() {
            return this.zzaxu;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$Symbol */
    public static class Symbol extends DocumentTextBase {
        public Symbol(@NonNull List<RecognizedLanguage> list, @Nullable RecognizedBreak recognizedBreak, @Nullable Rect rect, @NonNull String str, Float f) {
            super(list, recognizedBreak, rect, str, f);
        }

        public static Symbol zza(@NonNull zzjr zzjr, float f) {
            return new Symbol(FirebaseVisionDocumentText.zza(zzjr.zzhr()), RecognizedBreak.zzc(zzjr.zzhr()), zzpm.zza(zzjr.zzhq(), f), zzpm.zzch(zzjr.getText()), zzjr.getConfidence());
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        @Nullable
        public /* bridge */ /* synthetic */ RecognizedBreak getRecognizedBreak() {
            return super.getRecognizedBreak();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }
    }

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentText$Word */
    public static class Word extends DocumentTextBase {
        public final List<Symbol> symbols;

        public Word(@NonNull List<RecognizedLanguage> list, @Nullable RecognizedBreak recognizedBreak, @Nullable Rect rect, @NonNull List<Symbol> list2, @NonNull String str, @Nullable Float f) {
            super(list, recognizedBreak, rect, str, f);
            this.symbols = list2;
        }

        public static Word zza(@NonNull zzjx zzjx, float f) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            List<RecognizedLanguage> zze = zzql.zze(zzjx.zzhr());
            RecognizedBreak recognizedBreak = null;
            if (zzjx.getSymbols() != null) {
                for (zzjr zzjr : zzjx.getSymbols()) {
                    if (zzjr != null) {
                        Symbol zza = Symbol.zza(zzjr, f);
                        RecognizedBreak recognizedBreak2 = zza.getRecognizedBreak();
                        sb.append(zza.getText());
                        arrayList.add(Symbol.zza(zzjr, f));
                        recognizedBreak = recognizedBreak2;
                    }
                }
            }
            return new Word(zze, recognizedBreak, zzpm.zza(zzjx.zzhq(), f), arrayList, sb.toString(), zzjx.getConfidence());
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        @Nullable
        public /* bridge */ /* synthetic */ RecognizedBreak getRecognizedBreak() {
            return super.getRecognizedBreak();
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        public List<Symbol> getSymbols() {
            return this.symbols;
        }

        @Override // com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentText.DocumentTextBase
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }
    }

    public FirebaseVisionDocumentText(@NonNull String str, @NonNull List<Block> list) {
        this.text = str;
        this.blocks = list;
    }

    @Nullable
    public static FirebaseVisionDocumentText zza(@Nullable zzjs zzjs, float f) {
        if (zzjs == null) {
            return null;
        }
        String zzch = zzpm.zzch(zzjs.getText());
        ArrayList arrayList = new ArrayList();
        if (zzjs.getPages() != null) {
            for (zzjl zzjl : zzjs.getPages()) {
                if (zzjl != null) {
                    for (zziu zziu : zzjl.getBlocks()) {
                        if (zziu != null) {
                            arrayList.add(Block.zza(zziu, f));
                        }
                    }
                }
            }
        }
        return new FirebaseVisionDocumentText(zzch, arrayList);
    }

    public List<Block> getBlocks() {
        return this.blocks;
    }

    public String getText() {
        String str = this.text;
        return str != null ? str : "";
    }

    public static List<RecognizedLanguage> zza(@Nullable zzjt zzjt) {
        if (zzjt == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (zzjt.zzia() != null) {
            for (zziz zziz : zzjt.zzia()) {
                RecognizedLanguage zza = RecognizedLanguage.zza(zziz);
                if (zza != null) {
                    arrayList.add(zza);
                }
            }
        }
        return arrayList;
    }

    public static String zza(@Nullable RecognizedBreak recognizedBreak) {
        if (recognizedBreak == null) {
            return "";
        }
        int detectedBreakType = recognizedBreak.getDetectedBreakType();
        if (detectedBreakType == 1 || detectedBreakType == 2) {
            return " ";
        }
        if (detectedBreakType != 3) {
            if (detectedBreakType == 4) {
                return "-\n";
            }
            if (detectedBreakType != 5) {
                return "";
            }
        }
        return "\n";
    }
}
