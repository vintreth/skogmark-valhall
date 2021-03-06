package ru.skogmark.aggregator.prop;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.skogmark.aggregator.ApplicationContextAwareTest;

import static org.junit.Assert.assertEquals;

public class VkParserPropertiesTest extends ApplicationContextAwareTest {
    @Autowired
    private VkParserProperties properties;

    @Test
    public void should_return_values_from_test_config() {
        assertEquals("https://api.vk.com", properties.getApiUrl());
        assertEquals(3, properties.getUserIds().size());
        assertEquals(1, properties.getUserIds().get(0).longValue());
        assertEquals(2, properties.getUserIds().get(1).longValue());
        assertEquals(354, properties.getUserIds().get(2).longValue());
        assertEquals("5bb8683e5bb8683e5bb8683eff5befd53955bb85bb8683e07f8b50aec50395e60e88140",
                properties.getAccessToken());
        assertEquals("5.92", properties.getVersion());
    }
}