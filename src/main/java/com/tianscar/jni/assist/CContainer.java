package com.tianscar.jni.assist;

public abstract class CContainer {

    public final long address;

    protected CContainer(long address) {
        this.address = address;
    }

    protected CContainer() {
        this(0L);
    }

}
