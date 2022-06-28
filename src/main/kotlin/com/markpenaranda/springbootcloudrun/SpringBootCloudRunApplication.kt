package com.markpenaranda.springbootcloudrun

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootCloudRunApplication

fun main(args: Array<String>) {
    runApplication<SpringBootCloudRunApplication>(*args)
}
