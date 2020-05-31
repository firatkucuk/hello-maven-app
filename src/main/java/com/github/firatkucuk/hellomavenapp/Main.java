package com.github.firatkucuk.hellomavenapp;

import com.github.firatkucuk.hellomavenlib.Hello;

public class Main {

    public static void main(final String[] args) {

        final String text;

        if (args.length > 0) {
            text = Hello.sayHello(args[0]);
        } else {
            text = Hello.sayHello("maven");
        }

        System.out.println(text);
    }
}
