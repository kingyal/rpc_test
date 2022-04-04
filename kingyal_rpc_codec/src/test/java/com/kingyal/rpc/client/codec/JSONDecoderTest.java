package com.kingyal.rpc.client.codec;

import org.junit.Assert;
import org.junit.Test;

public class JSONDecoderTest {

    @Test
    public void decode() {
        JSONEncoder jsonEncoder = new JSONEncoder();
        TestBean testBean = new TestBean();
        testBean.setName("kingyal");
        testBean.setAge(18);

        byte[] bytes = jsonEncoder.encode(testBean);
        Assert.assertNotNull(bytes);

        JSONDecoder jsonDecoder = new JSONDecoder();
        TestBean testBean1 = jsonDecoder.decode(bytes, TestBean.class);
        Assert.assertEquals(testBean.getAge(), testBean1.getAge());
        Assert.assertEquals(testBean.getName(), testBean1.getName());
    }
}