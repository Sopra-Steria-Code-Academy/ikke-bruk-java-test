package com.soprasteria.demo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PussWithBootsTest {

    @Test
    public void goodGuyTest(){
        String goodGuy = "good guy";
        String badGuy = "bad guy";
        assertThat(badGuy).isNotEqualTo(goodGuy);
    }
}
