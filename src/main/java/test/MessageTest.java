package test;

import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class MessageTest {

    public static void main(String[] args) {
        MultiValueMap map = new LinkedMultiValueMap();
        map.add("code", "wzcg");
        map.add("mobileList", "15666248331");
        map.add("content", "测试短信流程信息");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity responseEntity = restTemplate.postForEntity("http://10.204.111.45:9102/messageCenter/sendShortMessageByMobile", map, String.class);
        Object body = responseEntity.getBody();
    }
}
