package iuh.edu.vn.vonguyenthanhtu_kttpm_productspringboot_week1.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    private final String urlApi = "http://localhost:8081/users";
    RestTemplate restTemplate = new RestTemplate();
    public List<Map<String, Object>> getAllUser(){
        String url = urlApi;
        ResponseEntity<List<Map<String, Object>>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Map<String,Object>>>() {}
        );
        return responseEntity.getBody();
    }
}
