package com;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Main {
    public static void main(String[] args) {
        JavaCompiler compiler= ToolProvider.getSystemJavaCompiler();
        int result= compiler.run(null,null,null,"Test.java");
        System.out.println(result);
    }
}




























































