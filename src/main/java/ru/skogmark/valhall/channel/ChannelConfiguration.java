package ru.skogmark.valhall.channel;

import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.skogmark.valhall.core.ChannelContext;
import ru.skogmark.valhall.core.Timetable;
import ru.skogmark.valhall.source.SourceContextImpl;

import java.time.LocalTime;
import java.util.Collections;

import static ru.skogmark.valhall.channel.Channel.MEMES;

@Configuration
public class ChannelConfiguration {
    @Bean
    ChannelContext memesChannel() {
        return ChannelContextImpl.builder()
                .channel(MEMES)
                .sources(Collections.singleton(SourceContextImpl.builder()
                        .parsingLimit(10) // todo hardcode
                        .timetable(Timetable.of(Sets.newHashSet(LocalTime.of(1, 0),
                                LocalTime.of(13, 0))))
                        .build()))
                .build();
    }
}