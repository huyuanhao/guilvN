package com.shockwave.pdfium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.util.Size;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class PdfiumCore {
    public static final Class FD_CLASS = FileDescriptor.class;
    public static final String FD_FIELD_NAME = "descriptor";
    public static final String TAG = "com.shockwave.pdfium.PdfiumCore";
    public static final Object lock = new Object();
    public static Field mFdField = null;
    public int mCurrentDpi;

    static {
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("modpng");
            System.loadLibrary("modft2");
            System.loadLibrary("modpdfium");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e) {
            String str = "Native libraries failed to load - " + e;
        }
    }

    public PdfiumCore(Context context) {
        this.mCurrentDpi = context.getResources().getDisplayMetrics().densityDpi;
    }

    public static int getNumFd(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            if (mFdField == null) {
                Field declaredField = FD_CLASS.getDeclaredField(FD_FIELD_NAME);
                mFdField = declaredField;
                declaredField.setAccessible(true);
            }
            return mFdField.getInt(parcelFileDescriptor.getFileDescriptor());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return -1;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    private native void nativeCloseDocument(long j);

    private native void nativeClosePage(long j);

    private native void nativeClosePages(long[] jArr);

    private native long nativeGetBookmarkDestIndex(long j, long j2);

    private native String nativeGetBookmarkTitle(long j);

    private native Integer nativeGetDestPageIndex(long j, long j2);

    private native String nativeGetDocumentMetaText(long j, String str);

    private native Long nativeGetFirstChildBookmark(long j, Long l);

    private native RectF nativeGetLinkRect(long j);

    private native String nativeGetLinkURI(long j, long j2);

    private native int nativeGetPageCount(long j);

    private native int nativeGetPageHeightPixel(long j, int i);

    private native int nativeGetPageHeightPoint(long j);

    private native long[] nativeGetPageLinks(long j);

    private native Size nativeGetPageSizeByIndex(long j, int i, int i2);

    private native int nativeGetPageWidthPixel(long j, int i);

    private native int nativeGetPageWidthPoint(long j);

    private native Long nativeGetSiblingBookmark(long j, long j2);

    private native long nativeLoadPage(long j, int i);

    private native long[] nativeLoadPages(long j, int i, int i2);

    private native long nativeOpenDocument(int i, String str);

    private native long nativeOpenMemDocument(byte[] bArr, String str);

    private native Point nativePageCoordsToDevice(long j, int i, int i2, int i3, int i4, int i5, double d, double d2);

    private native void nativeRenderPage(long j, Surface surface, int i, int i2, int i3, int i4, int i5, boolean z);

    private native void nativeRenderPageBitmap(long j, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, boolean z);

    private void recursiveGetBookmark(List<PdfDocument.Bookmark> list, PdfDocument pdfDocument, long j) {
        PdfDocument.Bookmark bookmark = new PdfDocument.Bookmark();
        bookmark.mNativePtr = j;
        bookmark.title = nativeGetBookmarkTitle(j);
        bookmark.pageIdx = nativeGetBookmarkDestIndex(pdfDocument.mNativeDocPtr, j);
        list.add(bookmark);
        Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.mNativeDocPtr, Long.valueOf(j));
        if (nativeGetFirstChildBookmark != null) {
            recursiveGetBookmark(bookmark.getChildren(), pdfDocument, nativeGetFirstChildBookmark.longValue());
        }
        Long nativeGetSiblingBookmark = nativeGetSiblingBookmark(pdfDocument.mNativeDocPtr, j);
        if (nativeGetSiblingBookmark != null) {
            recursiveGetBookmark(list, pdfDocument, nativeGetSiblingBookmark.longValue());
        }
    }

    public void closeDocument(PdfDocument pdfDocument) {
        synchronized (lock) {
            for (Integer num : pdfDocument.mNativePagesPtr.keySet()) {
                nativeClosePage(pdfDocument.mNativePagesPtr.get(num).longValue());
            }
            pdfDocument.mNativePagesPtr.clear();
            nativeCloseDocument(pdfDocument.mNativeDocPtr);
            if (pdfDocument.parcelFileDescriptor != null) {
                try {
                    pdfDocument.parcelFileDescriptor.close();
                } catch (IOException unused) {
                }
                pdfDocument.parcelFileDescriptor = null;
            }
        }
    }

    public PdfDocument.Meta getDocumentMeta(PdfDocument pdfDocument) {
        PdfDocument.Meta meta;
        synchronized (lock) {
            meta = new PdfDocument.Meta();
            meta.title = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "Title");
            meta.author = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "Author");
            meta.subject = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "Subject");
            meta.keywords = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "Keywords");
            meta.creator = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "Creator");
            meta.producer = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "Producer");
            meta.creationDate = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "CreationDate");
            meta.modDate = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "ModDate");
        }
        return meta;
    }

    public int getPageCount(PdfDocument pdfDocument) {
        int nativeGetPageCount;
        synchronized (lock) {
            nativeGetPageCount = nativeGetPageCount(pdfDocument.mNativeDocPtr);
        }
        return nativeGetPageCount;
    }

    public int getPageHeight(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
            if (l == null) {
                return 0;
            }
            return nativeGetPageHeightPixel(l.longValue(), this.mCurrentDpi);
        }
    }

    public int getPageHeightPoint(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
            if (l == null) {
                return 0;
            }
            return nativeGetPageHeightPoint(l.longValue());
        }
    }

    public List<PdfDocument.Link> getPageLinks(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            ArrayList arrayList = new ArrayList();
            Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
            if (l == null) {
                return arrayList;
            }
            long[] nativeGetPageLinks = nativeGetPageLinks(l.longValue());
            for (long j : nativeGetPageLinks) {
                Integer nativeGetDestPageIndex = nativeGetDestPageIndex(pdfDocument.mNativeDocPtr, j);
                String nativeGetLinkURI = nativeGetLinkURI(pdfDocument.mNativeDocPtr, j);
                RectF nativeGetLinkRect = nativeGetLinkRect(j);
                if (!(nativeGetLinkRect == null || (nativeGetDestPageIndex == null && nativeGetLinkURI == null))) {
                    arrayList.add(new PdfDocument.Link(nativeGetLinkRect, nativeGetDestPageIndex, nativeGetLinkURI));
                }
            }
            return arrayList;
        }
    }

    public Size getPageSize(PdfDocument pdfDocument, int i) {
        Size nativeGetPageSizeByIndex;
        synchronized (lock) {
            nativeGetPageSizeByIndex = nativeGetPageSizeByIndex(pdfDocument.mNativeDocPtr, i, this.mCurrentDpi);
        }
        return nativeGetPageSizeByIndex;
    }

    public int getPageWidth(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
            if (l == null) {
                return 0;
            }
            return nativeGetPageWidthPixel(l.longValue(), this.mCurrentDpi);
        }
    }

    public int getPageWidthPoint(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
            if (l == null) {
                return 0;
            }
            return nativeGetPageWidthPoint(l.longValue());
        }
    }

    public List<PdfDocument.Bookmark> getTableOfContents(PdfDocument pdfDocument) {
        ArrayList arrayList;
        synchronized (lock) {
            arrayList = new ArrayList();
            Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.mNativeDocPtr, null);
            if (nativeGetFirstChildBookmark != null) {
                recursiveGetBookmark(arrayList, pdfDocument, nativeGetFirstChildBookmark.longValue());
            }
        }
        return arrayList;
    }

    public Point mapPageCoordsToDevice(PdfDocument pdfDocument, int i, int i2, int i3, int i4, int i5, int i6, double d, double d2) {
        return nativePageCoordsToDevice(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue(), i2, i3, i4, i5, i6, d, d2);
    }

    public RectF mapRectToDevice(PdfDocument pdfDocument, int i, int i2, int i3, int i4, int i5, int i6, RectF rectF) {
        Point mapPageCoordsToDevice = mapPageCoordsToDevice(pdfDocument, i, i2, i3, i4, i5, i6, (double) rectF.left, (double) rectF.top);
        Point mapPageCoordsToDevice2 = mapPageCoordsToDevice(pdfDocument, i, i2, i3, i4, i5, i6, (double) rectF.right, (double) rectF.bottom);
        return new RectF((float) mapPageCoordsToDevice.x, (float) mapPageCoordsToDevice.y, (float) mapPageCoordsToDevice2.x, (float) mapPageCoordsToDevice2.y);
    }

    public PdfDocument newDocument(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        return newDocument(parcelFileDescriptor, (String) null);
    }

    public long openPage(PdfDocument pdfDocument, int i) {
        long nativeLoadPage;
        synchronized (lock) {
            nativeLoadPage = nativeLoadPage(pdfDocument.mNativeDocPtr, i);
            pdfDocument.mNativePagesPtr.put(Integer.valueOf(i), Long.valueOf(nativeLoadPage));
        }
        return nativeLoadPage;
    }

    public void renderPage(PdfDocument pdfDocument, Surface surface, int i, int i2, int i3, int i4, int i5) {
        renderPage(pdfDocument, surface, i, i2, i3, i4, i5, false);
    }

    public void renderPageBitmap(PdfDocument pdfDocument, Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        renderPageBitmap(pdfDocument, bitmap, i, i2, i3, i4, i5, false);
    }

    public PdfDocument newDocument(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
        PdfDocument pdfDocument = new PdfDocument();
        pdfDocument.parcelFileDescriptor = parcelFileDescriptor;
        synchronized (lock) {
            pdfDocument.mNativeDocPtr = nativeOpenDocument(getNumFd(parcelFileDescriptor), str);
        }
        return pdfDocument;
    }

    public void renderPage(PdfDocument pdfDocument, Surface surface, int i, int i2, int i3, int i4, int i5, boolean z) {
        NullPointerException e;
        Exception e2;
        synchronized (lock) {
            try {
                try {
                    nativeRenderPage(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue(), surface, this.mCurrentDpi, i2, i3, i4, i5, z);
                } catch (NullPointerException e3) {
                    e = e3;
                } catch (Exception e4) {
                    e2 = e4;
                    e2.printStackTrace();
                }
            } catch (NullPointerException e5) {
                e = e5;
                e.printStackTrace();
            } catch (Exception e6) {
                e2 = e6;
                e2.printStackTrace();
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public void renderPageBitmap(PdfDocument pdfDocument, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, boolean z) {
        NullPointerException e;
        Exception e2;
        synchronized (lock) {
            try {
                try {
                    nativeRenderPageBitmap(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue(), bitmap, this.mCurrentDpi, i2, i3, i4, i5, z);
                } catch (NullPointerException e3) {
                    e = e3;
                } catch (Exception e4) {
                    e2 = e4;
                    e2.printStackTrace();
                }
            } catch (NullPointerException e5) {
                e = e5;
                e.printStackTrace();
            } catch (Exception e6) {
                e2 = e6;
                e2.printStackTrace();
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public long[] openPage(PdfDocument pdfDocument, int i, int i2) {
        long[] nativeLoadPages;
        synchronized (lock) {
            nativeLoadPages = nativeLoadPages(pdfDocument.mNativeDocPtr, i, i2);
            int length = nativeLoadPages.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                long j = nativeLoadPages[i3];
                if (i > i2) {
                    break;
                }
                pdfDocument.mNativePagesPtr.put(Integer.valueOf(i), Long.valueOf(j));
                i++;
                i3++;
            }
        }
        return nativeLoadPages;
    }

    public PdfDocument newDocument(byte[] bArr) throws IOException {
        return newDocument(bArr, (String) null);
    }

    public PdfDocument newDocument(byte[] bArr, String str) throws IOException {
        PdfDocument pdfDocument = new PdfDocument();
        synchronized (lock) {
            pdfDocument.mNativeDocPtr = nativeOpenMemDocument(bArr, str);
        }
        return pdfDocument;
    }
}
