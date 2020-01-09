package com.itcast.sentinel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2019/8/11.
 */
public class Bootstrap {
    public static void main( String[] args ) throws IOException {
        ApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(ProviderConfig.class);
        ((AnnotationConfigApplicationContext) applicationContext).start();
        System.in.read();
    }

}
