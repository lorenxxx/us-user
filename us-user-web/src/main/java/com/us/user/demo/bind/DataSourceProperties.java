package com.us.user.demo.bind;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Loren on 2018/10/9.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DataSourceProperties {

    private String url;

    private String username;

    private String password;

}
