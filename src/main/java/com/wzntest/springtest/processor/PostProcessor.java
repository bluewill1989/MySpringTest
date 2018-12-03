package com.wzntest.springtest.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * DESCRIPTION:
 *
 * @author will
 * @create 2018-12-03 10:36
 */
public class PostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        System.out.println("后置处理器处理bean=【"+beanName+"】开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean,
                                                 String beanName) throws BeansException {
        System.out.println("后置处理器处理bean=【"+beanName+"】完毕!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return bean;
    }
}