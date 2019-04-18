package hello.service

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("service")
class ServiceProperties {
    var message: String = ""
}