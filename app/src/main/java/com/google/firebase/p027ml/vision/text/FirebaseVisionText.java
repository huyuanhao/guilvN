package com.google.firebase.p027ml.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.vision.text.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText */
public class FirebaseVisionText {
    public final String text;
    public final List<TextBlock> zzazm;

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText$Element */
    public static class Element extends TextBase {
        public Element(@NonNull com.google.android.gms.vision.text.Element element) {
            super(element);
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        @Nullable
        public /* bridge */ /* synthetic */ Point[] getCornerPoints() {
            return super.getCornerPoints();
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        public Element(@NonNull String str, @Nullable Rect rect, @NonNull List<RecognizedLanguage> list, @Nullable Float f) {
            super(str, rect, list, f);
        }
    }

    public FirebaseVisionText(@NonNull SparseArray<com.google.android.gms.vision.text.TextBlock> sparseArray) {
        this.zzazm = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sparseArray.size(); i++) {
            com.google.android.gms.vision.text.TextBlock textBlock = sparseArray.get(sparseArray.keyAt(i));
            if (textBlock != null) {
                TextBlock textBlock2 = new TextBlock(textBlock);
                this.zzazm.add(textBlock2);
                if (sb.length() != 0) {
                    sb.append("\n");
                }
                if (textBlock.getValue() != null) {
                    sb.append(textBlock2.getText());
                }
            }
        }
        this.text = sb.toString();
    }

    public String getText() {
        return this.text;
    }

    public List<TextBlock> getTextBlocks() {
        return Collections.unmodifiableList(this.zzazm);
    }

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText$Line */
    public static class Line extends TextBase {
        @GuardedBy("this")
        public final List<Element> zzazn;

        public Line(@NonNull com.google.android.gms.vision.text.Line line) {
            super(line);
            this.zzazn = new ArrayList();
            for (Text text : line.getComponents()) {
                if (text instanceof com.google.android.gms.vision.text.Element) {
                    this.zzazn.add(new Element((com.google.android.gms.vision.text.Element) text));
                }
            }
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        @Nullable
        public /* bridge */ /* synthetic */ Point[] getCornerPoints() {
            return super.getCornerPoints();
        }

        public synchronized List<Element> getElements() {
            return this.zzazn;
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        public Line(@NonNull String str, @Nullable Rect rect, @NonNull List<RecognizedLanguage> list, @NonNull List<Element> list2, @Nullable Float f) {
            super(str, rect, list, f);
            this.zzazn = list2;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText$TextBlock */
    public static class TextBlock extends TextBase {
        @GuardedBy("this")
        public final List<Line> zzazo;

        public TextBlock(@NonNull com.google.android.gms.vision.text.TextBlock textBlock) {
            super(textBlock);
            this.zzazo = new ArrayList();
            for (Text text : textBlock.getComponents()) {
                if (text instanceof com.google.android.gms.vision.text.Line) {
                    this.zzazo.add(new Line((com.google.android.gms.vision.text.Line) text));
                }
            }
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        @Nullable
        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        @Nullable
        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        @Nullable
        public /* bridge */ /* synthetic */ Point[] getCornerPoints() {
            return super.getCornerPoints();
        }

        public synchronized List<Line> getLines() {
            return this.zzazo;
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        @Override // com.google.firebase.p027ml.vision.text.FirebaseVisionText.TextBase
        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        public TextBlock(@NonNull String str, @Nullable Rect rect, @NonNull List<RecognizedLanguage> list, @NonNull List<Line> list2, @Nullable Float f) {
            super(str, rect, list, f);
            this.zzazo = list2;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText$TextBase */
    public static class TextBase {
        public final Float confidence;
        public final Point[] cornerPoints;
        public final String text;
        public final Rect zzawz;
        public final List<RecognizedLanguage> zzaxs;

        public TextBase(@NonNull Text text2) {
            Preconditions.checkNotNull(text2, "Text to construct FirebaseVisionText classes can't be null");
            this.confidence = null;
            this.text = text2.getValue();
            this.zzawz = text2.getBoundingBox();
            this.cornerPoints = text2.getCornerPoints();
            this.zzaxs = Collections.emptyList();
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
        public Point[] getCornerPoints() {
            return this.cornerPoints;
        }

        public List<RecognizedLanguage> getRecognizedLanguages() {
            return this.zzaxs;
        }

        public String getText() {
            String str = this.text;
            return str == null ? "" : str;
        }

        public TextBase(@NonNull String str, @Nullable Rect rect, @NonNull List<RecognizedLanguage> list, @Nullable Float f) {
            Preconditions.checkNotNull(str, "Text string cannot be null");
            Preconditions.checkNotNull(list, "Text languages cannot be null");
            this.confidence = f;
            this.cornerPoints = null;
            this.text = str;
            this.zzawz = rect;
            this.zzaxs = list;
        }
    }

    public FirebaseVisionText(@NonNull String str, @NonNull List<TextBlock> list) {
        ArrayList arrayList = new ArrayList();
        this.zzazm = arrayList;
        this.text = str;
        arrayList.addAll(list);
    }
}
