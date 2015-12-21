package com.rayan.course.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.fest.assertions.api.Assertions.*;
/**
 * Created by saeed on 12/21/15.
 */
public class MessageManagerTest {

    @Test
    public void getHelloMessage_gettingHelloMessageValue_returnHelloMessage(){
        MessageManager messageManager = new MessageManager();

        assertThat(messageManager.getHelloMessage()).isEqualTo("Hello World");
    }

}
