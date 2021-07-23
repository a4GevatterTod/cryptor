package com.gevatter.cryptor.cryptor;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.util.StringUtils;

@SpringBootApplication
public class CryptorApplication {

    public static void main(String[] args) {
        String[] disabledCommands = {"--spring.shell.command.script.enabled=false"};
        String[] fullArgs = StringUtils.concatenateStringArrays(args, disabledCommands);
        SpringApplication.run(CryptorApplication.class, fullArgs);
    }

    @Bean
    public PromptProvider myPromptProvider() {
        return () -> new AttributedString("¯\\\\_(ツ)_/¯ >>", AttributedStyle.DEFAULT.foreground(AttributedStyle.YELLOW));
    }


}
