package com.us.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liangliang
 * @date 2018/9/3 7:37 PM
 */
@ApiModel(value = "User", description = "User")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @ApiModelProperty("主键Id")
    private Integer id;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别：0，未知；1，男；2，女；")
    private Integer sex;

    @ApiModelProperty("年龄")
    private Integer age;

}
