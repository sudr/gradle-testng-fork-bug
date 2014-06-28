package org.gradle;

import java.lang.management.ManagementFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnimalTest {
    
    //@Test // BUG: uncomment this to trigger the bug
    public void canConstructAPersonWithAName() throws InterruptedException {
        System.out.println("animal started: " +pid());
        Person person = new Person("Larry");
        Assert.assertEquals("Larry", person.getName());
        Thread.sleep(1000);
        System.out.println("animal passed: " + pid());
    }
    
    String pid() {
        return ManagementFactory.getRuntimeMXBean().getName();
    }
}
