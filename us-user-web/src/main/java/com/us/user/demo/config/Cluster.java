package com.us.user.demo.config;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Cluster
 * @Desciption TODO
 * @Author loren
 * @Date 2019/4/2 7:44 PM
 * @Version 1.0
 **/
@Data
public class Cluster {

    private List<Node> nodes;

}
