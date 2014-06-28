package org.gradle;

import java.lang.management.ManagementFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {
    
    @Test
    public void canConstructAPersonWithAName() throws InterruptedException {
        System.out.println("person started: " +pid());
        Person person = new Person("Larry");
        Assert.assertEquals("Larry", person.getName());
        Thread.sleep(2000);
        System.out.println("person passed: " + pid());
    }
    
    String pid() {
        return ManagementFactory.getRuntimeMXBean().getName();
    }
}
