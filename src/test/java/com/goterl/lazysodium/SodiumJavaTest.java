package com.goterl.lazysodium;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SodiumJavaTest {

    @Test
    @Disabled("Reason for disabling the test")
    public void canLoadWithSystemLibrary() {
        SodiumJava sodium = new SodiumJava("sodium");
        int initResult = sodium.sodium_init();
        assertNotEquals(-1, initResult);
    }
}
