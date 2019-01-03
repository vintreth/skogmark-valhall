package ru.skogmark.valhall.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@Configuration
public class CoreContext {
    @Bean
    ScheduledExecutorService subjectWorkerExecutor() {
        return Executors.newSingleThreadScheduledExecutor(runnable -> new Thread(runnable, "subject-worker"));
    }
}
