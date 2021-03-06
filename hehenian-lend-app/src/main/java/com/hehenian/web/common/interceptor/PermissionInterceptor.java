/**  
 * @Project: hehenian-lend
 * @Package com.hehenian.web.common.interceptor
 * @Title: PermissionInterceptor.java
 * @Description: TODO
 * @author: liuzgmf
 * @date 2015年1月22日 上午11:53:50
 * @Copyright: HEHENIAN Co.,Ltd. All rights reserved.
 * @version V1.0  
 */
package com.hehenian.web.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 权限拦截器
 * 
 * @author: liuzgmf
 * @date 2015年1月22日 上午11:53:50
 */
public class PermissionInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

}
