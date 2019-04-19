package hello.service

import org.slf4j.LoggerFactory
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.stereotype.Service

@Service
@EnableConfigurationProperties(ServiceProperties::class)
class CliService(private val serviceProperties: ServiceProperties) {

    companion object {
        val log = LoggerFactory.getLogger(CliService::class.java)
    }

    fun message(): String {
        log.trace("{}----------", "trace")
        log.debug("{}----------", "debug")
        log.info("{}----------", "info")
        log.warn("{}----------", "warn")
        log.error("{}----------", "error")
        return serviceProperties.message
    }
}