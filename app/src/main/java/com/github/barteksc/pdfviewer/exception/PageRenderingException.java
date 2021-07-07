package com.github.barteksc.pdfviewer.exception;

public class PageRenderingException extends Exception {
    public final int page;

    public PageRenderingException(int i, Throwable th) {
        super(th);
        this.page = i;
    }

    public int getPage() {
        return this.page;
    }
}
