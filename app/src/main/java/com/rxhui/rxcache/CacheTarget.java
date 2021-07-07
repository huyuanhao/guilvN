package com.rxhui.rxcache;

public enum CacheTarget {
    Memory,
    Disk,
    MemoryAndDisk;

    public boolean supportDisk() {
        return this == Disk || this == MemoryAndDisk;
    }

    public boolean supportMemory() {
        return this == Memory || this == MemoryAndDisk;
    }
}
