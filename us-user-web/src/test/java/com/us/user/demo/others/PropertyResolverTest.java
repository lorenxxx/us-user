package com.us.user.demo.others;

import com.us.claudine.test.AbstractCommonTest;
import com.us.user.demo.bind.DataSourceProperties;
import org.junit.Test;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import java.util.List;

/**
 * Created by Loren on 2018/10/9.
 */
public class PropertyResolverTest extends AbstractCommonTest implements EnvironmentAware {

    private Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Test
    public void getProertiesByPrefix() {
        Binder binder = Binder.get(environment);
        String configName = environment.getProperty("config.name");
        environment.containsProperty("spring");
        System.out.println(configName);
        List<DataSourceProperties> dataSourceProperties = binder.bind("claudine.datasource", Bindable.listOf(DataSourceProperties.class)).orElse(null);
        dataSourceProperties.forEach((dataSourceProperty) -> System.out.println(dataSourceProperty.getUrl()));
    }

}
