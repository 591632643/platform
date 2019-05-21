package org.hzero.tms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Tag;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger Api 描述配置
 */
@Configuration
public class SwaggerTags {

    public static final String HELLO = "Hello";
    public static final String TRANSPORTS = "transports";

    @Autowired
    public SwaggerTags(Docket docket) {
        docket.tags(
                new Tag(HELLO, "HELLO")
        );
        docket.tags(
                new Tag(TRANSPORTS, "运输管理")
        );
    }
}
