package com.xzy.springmvc.demo.web;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class UserControllerTest {
    
    @Test
    public void testhandle91() {
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> form = new LinkedMultiValueMap<String, String>();
        form.add("name", "tom");
        String html = restTemplate.postForObject(
                "http://localhost:8080/user/handle91", form, String.class);
        Assert.assertNotNull(html);
        Assert.assertTrue(html.equals("ok"));
    }
    
}
