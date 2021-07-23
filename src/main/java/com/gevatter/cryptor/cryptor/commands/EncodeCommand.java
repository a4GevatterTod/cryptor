package com.gevatter.cryptor.cryptor.commands;

import com.gevatter.cryptor.cryptor.model.CryptOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;

@ShellComponent
public class EncodeCommand {

    @Autowired
    private CryptOperation cryptOperation;

    @ShellMethod(value = "Encodes given text.", key = "encode")
    @ShellMethodAvailability("allSet")
    public String encode() {
        return cryptOperation.encode();
    }

    @ShellMethod(value = "Decodes given text.", key = "decode")
    @ShellMethodAvailability("allSet")
    public String decode() {
        return cryptOperation.decode();
    }

    @ShellMethod(value = "Set text to encode. Surround by quotes \" and escape quotes in text with \\", key = "setText")
    public String setText(String text) {
         cryptOperation.setText(text);
         return "Text is set to \"" + text + "\"";
    }

    private Availability allSet() {
        return cryptOperation.isAvailable();
    }
}
