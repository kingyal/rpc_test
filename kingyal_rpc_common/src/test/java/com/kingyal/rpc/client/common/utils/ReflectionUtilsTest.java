package com.kingyal.rpc.client.common.utils;

import com.kingyal.rpc.common.utils.ReflectionUtils;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

public class ReflectionUtilsTest {
    @Test
    public void newInstance() {
        TestClass testClass = ReflectionUtils.newInstance(TestClass.class);
        Assert.assertNotNull(testClass);

    }

    @Test
    public void getPublicMethods() {
        Method[] publicMethods = ReflectionUtils.getPublicMethods(TestClass.class);
        Assert.assertEquals(1, publicMethods.length);
        Assert.assertEquals("b", publicMethods[0].getName());
    }

    @Test
    public void invoke() {
        Method[] publicMethods = ReflectionUtils.getPublicMethods(TestClass.class);
        Method b = publicMethods[0];
        TestClass t = new TestClass();
        Assert.assertEquals("b", ReflectionUtils.invoke(t, b));
    }
}