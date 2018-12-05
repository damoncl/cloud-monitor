package com.damon.cloudmonitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
@RefreshScope
public class CloudMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudMonitorApplication.class, args);
    }
}
