package com.tianscar.jni.assist;

public abstract class CStruct extends CContainer {

    protected CStruct(long address) {
        super(address);
    }

    protected CStruct() {
        super();
    }

}
