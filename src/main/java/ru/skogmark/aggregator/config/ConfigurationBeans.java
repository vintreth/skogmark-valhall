package ru.skogmark.aggregator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.skogmark.common.config.ConfigurationLoader;

@Configuration
public class ConfigurationBeans {
    @Bean
    ApplicationConfiguration applicationConfiguration(ConfigurationLoader configurationLoader) {
        return configurationLoader.loadConfiguration(ApplicationConfiguration.class, "app.cfg.xml");
    }

    @Bean
    DataSourceConfiguration datasourceConfiguration(ConfigurationLoader configurationLoader) {
        return configurationLoader.loadConfiguration(DataSourceConfiguration.class, "data-source.cfg.xml");
    }
}