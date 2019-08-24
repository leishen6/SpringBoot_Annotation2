package com.coderv.springbootweb.config;

import com.coderv.springbootweb.interceptor.TokenInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    //将tokenInterceptor放入到spring容器中管理
    @Autowired
    public TokenInterceptor tokenInterceptor;

    /*实现此方法添加拦截器
    * addPathPatterns  拦截路径
    * excludePathPatterns() (不拦截的路径数组) 我这个demo没有使用
    * */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截路径
        String[] addPathPatterns = {
          "/token/*"
        };
        registry.addInterceptor(tokenInterceptor).addPathPatterns(addPathPatterns);
    }
}
