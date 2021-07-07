package com.shockwave.pdfium;

import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import com.p118pd.sdk.C6971o0000oO0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PdfDocument {
    public long mNativeDocPtr;
    public final Map<Integer, Long> mNativePagesPtr = new C6971o0000oO0();
    public ParcelFileDescriptor parcelFileDescriptor;

    public static class Bookmark {
        public List<Bookmark> children = new ArrayList();
        public long mNativePtr;
        public long pageIdx;
        public String title;

        public List<Bookmark> getChildren() {
            return this.children;
        }

        public long getPageIdx() {
            return this.pageIdx;
        }

        public String getTitle() {
            return this.title;
        }

        public boolean hasChildren() {
            return !this.children.isEmpty();
        }
    }

    public static class Link {
        public RectF bounds;
        public Integer destPageIdx;
        public String uri;

        public Link(RectF rectF, Integer num, String str) {
            this.bounds = rectF;
            this.destPageIdx = num;
            this.uri = str;
        }

        public RectF getBounds() {
            return this.bounds;
        }

        public Integer getDestPageIdx() {
            return this.destPageIdx;
        }

        public String getUri() {
            return this.uri;
        }
    }

    public static class Meta {
        public String author;
        public String creationDate;
        public String creator;
        public String keywords;
        public String modDate;
        public String producer;
        public String subject;
        public String title;

        public String getAuthor() {
            return this.author;
        }

        public String getCreationDate() {
            return this.creationDate;
        }

        public String getCreator() {
            return this.creator;
        }

        public String getKeywords() {
            return this.keywords;
        }

        public String getModDate() {
            return this.modDate;
        }

        public String getProducer() {
            return this.producer;
        }

        public String getSubject() {
            return this.subject;
        }

        public String getTitle() {
            return this.title;
        }
    }

    public boolean hasPage(int i) {
        return this.mNativePagesPtr.containsKey(Integer.valueOf(i));
    }
}
