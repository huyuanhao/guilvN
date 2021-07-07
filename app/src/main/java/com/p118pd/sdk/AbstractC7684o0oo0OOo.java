package com.p118pd.sdk;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: com.pd.sdk.o0oo0OOo  reason: case insensitive filesystem */
public abstract class AbstractC7684o0oo0OOo {
    public static final AbstractC7684o0oo0OOo OooO00o = new OooO00o();
    public static final AbstractC7684o0oo0OOo OooO0O0 = new OooO0O0();
    public static final AbstractC7684o0oo0OOo OooO0OO = new OooO0OO();
    public static final AbstractC7684o0oo0OOo OooO0Oo = new C7685OooO0Oo();
    public static final AbstractC7684o0oo0OOo OooO0o0 = new C7686OooO0o0();

    /* renamed from: com.pd.sdk.o0oo0OOo$OooO00o */
    public class OooO00o extends AbstractC7684o0oo0OOo {
        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o() {
            return true;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO0O0() {
            return true;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.pd.sdk.o0oo0OOo$OooO0O0 */
    public class OooO0O0 extends AbstractC7684o0oo0OOo {
        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o() {
            return false;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o(DataSource dataSource) {
            return false;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO0O0() {
            return false;
        }
    }

    /* renamed from: com.pd.sdk.o0oo0OOo$OooO0OO */
    public class OooO0OO extends AbstractC7684o0oo0OOo {
        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o() {
            return true;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO0O0() {
            return false;
        }
    }

    /* renamed from: com.pd.sdk.o0oo0OOo$OooO0Oo  reason: case insensitive filesystem */
    public class C7685OooO0Oo extends AbstractC7684o0oo0OOo {
        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o() {
            return false;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o(DataSource dataSource) {
            return false;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO0O0() {
            return true;
        }
    }

    /* renamed from: com.pd.sdk.o0oo0OOo$OooO0o0  reason: case insensitive filesystem */
    public class C7686OooO0o0 extends AbstractC7684o0oo0OOo {
        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o() {
            return true;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO0O0() {
            return true;
        }

        @Override // com.p118pd.sdk.AbstractC7684o0oo0OOo
        public boolean OooO00o(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    public abstract boolean OooO00o();

    public abstract boolean OooO00o(DataSource dataSource);

    public abstract boolean OooO00o(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);

    public abstract boolean OooO0O0();
}
