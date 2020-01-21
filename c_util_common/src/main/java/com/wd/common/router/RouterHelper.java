package com.wd.common.router;

/**
 * author : 吴杜
 * date   : 2020/1/2111:38
 * version: 1.0.0
 * desc   : 统一的路由定向类，每当增加新的需要路由的类时，需要在这里增加
 */
public interface RouterHelper {
    /**
     * 组件名
     */
    String R_APP = "/app";
    String R_LOGIN = "/login";
    String R_GUA = "/gua";


    /**
     * 不同分组下各个Activity的标识
     */


    /**
     * 登录
     */
    String R_AC_LOGIN_MAIN = R_LOGIN + "/loginMain";


    /**
     * 刮奖
     */
    String R_AC_GUA_MAIN = R_GUA + "/guaMain";

}
