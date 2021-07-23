package com.gevatter.cryptor.cryptor.model;

import java.util.Base64;
import lombok.Data;
import org.springframework.shell.Availability;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Data
@Component
public class CryptOperation {

    private String text;

    public String encode() {
        byte[] bytes = text.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) ~bytes[i];
        }
        return Base64.getEncoder().encodeToString(bytes);
    }

    public String decode() {
        byte[] bytes = Base64.getDecoder().decode(text);
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) ~bytes[i];
        }
        return  new String(bytes);
    }

    public Availability isAvailable() {
        if (!isTextSet()) {
            return Availability.unavailable("Text is not set. Please use setText()");
        }
        return Availability.available();
    }

    private boolean isTextSet() {
        return StringUtils.hasText(this.text);
    }
}
