package com.tan.meagent.process;

import com.squareup.javapoet.ClassName;

public class ElementInfo {
    String tag;
    ClassName className;

    ElementInfo(String tag, ClassName className) {
        this.tag = tag;
        this.className = className;
    }
}
