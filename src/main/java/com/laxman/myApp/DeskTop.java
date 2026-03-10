package com.laxman.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DeskTop implements Computer {
    public void compile() {
        System.out.println("compilingg with 404 bugs");
    }
}
