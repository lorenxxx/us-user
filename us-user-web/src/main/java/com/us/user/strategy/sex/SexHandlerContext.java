package com.us.user.strategy.sex;

import com.google.common.collect.Maps;
import com.us.user.annotation.SexHandleType;
import com.us.user.util.ClassScanner;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

/**
 * @ClassName GenderHandlerContext
 * @Desciption TODO
 * @Author loren
 * @Date 2019/5/24 3:22 PM
 * @Version 1.0
 **/
@Component
public class SexHandlerContext implements BeanFactoryPostProcessor {

    private static final String BASE_PACKAGE = "com.us.user";

    private Map<String, Class> handlerMap;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        handlerMap = Maps.newHashMap();
        Set<Class<?>> clazzSet = ClassScanner.scan(BASE_PACKAGE, SexHandleType.class);
        for (Class clazz : clazzSet) {
            String type = clazz.getAnnotation(SexHandleType.class);

        }
    }

    public SexHandler getHandler(String type) {
        Class clazz = handlerMap.get(type);
        if (clazz == null) {
            throw new IllegalArgumentException("handler not found, type: " + type);
        }

        return null;
    }

}
