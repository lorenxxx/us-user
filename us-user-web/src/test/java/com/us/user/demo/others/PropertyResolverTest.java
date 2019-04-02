package com.us.user.demo.others;

import com.us.claudine.test.AbstractCommonTest;
import org.junit.Test;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import java.util.Map;
import java.util.Set;

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
    public void test() {
        Binder binder = Binder.get(environment);
        Map dataSourceMap = binder.bind("claudine.datasource", Map.class).get();
        //System.out.println(dataSourceMap);

        Set<Map.Entry> dataSourceEntries = dataSourceMap.entrySet();
        for (Map.Entry dataSourceEntry : dataSourceEntries) {
            String dataSourceKey = (String) dataSourceEntry.getKey();
            Map dataSourceValue = (Map) dataSourceEntry.getValue();

            System.out.println("数据源: [" + dataSourceKey + "] ----------------------------------");
            System.out.println();

            Map masterNodeMap = (Map) dataSourceValue.get("master");
            System.out.println("主库节点: ");
            for (Object node : masterNodeMap.values()) {
                Map nodeProperties = (Map) node;
                System.out.println(nodeProperties.get("url"));
            }

            System.out.println("从库节点: ");
            Map slaveNodeMap = (Map) dataSourceValue.get("slave");
            for (Object node : slaveNodeMap.values()) {
                Map nodeProperties = (Map) node;
                System.out.println(nodeProperties.get("url"));
            }

            System.out.println("-------------------------------------------------");

        }



    }

}
