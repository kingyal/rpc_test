package com.kingyal.rpc.client.codec;

import org.junit.Assert;
import org.junit.Test;

public class JSONEncoderTest {

    @Test
    public void encode() {
        JSONEncoder jsonEncoder = new JSONEncoder();
        TestBean testBean = new TestBean();
        testBean.setName("kingyal");
        testBean.setAge(18);

        byte[] bytes = jsonEncoder.encode(testBean);
        Assert.assertNotNull(bytes);
    }
}