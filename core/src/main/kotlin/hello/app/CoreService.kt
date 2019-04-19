package hello.app

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class CoreService {

    companion object {
        val log = LoggerFactory.getLogger(CoreService::class.java)
    }

    fun myLog(): String {
        log.trace("{}----------", "inner trace")
        log.debug("{}----------", "inner debug")
        log.info("{}----------", "inner info")
        log.warn("{}----------", "inner warn")
        log.error("{}----------", "inner error")
        return "core service"
    }
}