package com.cai.module.a.protocol;

import com.cai.annotation.apt.Protocol;

@Protocol("AModule2App")
public class AModule2AppImp {
    public String testProtocol(int a) {
        return "AModule2AppStub" + a;
    }
}
