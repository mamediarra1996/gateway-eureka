package com.groupeisi.ADMIN.Controller;

import com.groupeisi.ADMIN.Entity.Admin;
import com.groupeisi.ADMIN.Service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
@AllArgsConstructor
public class AdminController {
    private AdminService adminService;

    @GetMapping
    public List<Admin> getALL() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Admin>> responseEntity = restTemplate.exchange(
                "http://localhost:8889/ADMINS-SERVICES/user",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Admin>>() {
                });
        List<Admin> pojoObjList = responseEntity.getBody();

        return pojoObjList;
    }

    @GetMapping("/test")
    public String getAll(){
        String apivaluefromadminserviceurl = "http://localhost:8082/user";
        RestTemplate restTemplate = new RestTemplate();
        String val = restTemplate.getForObject(apivaluefromadminserviceurl, String.class);
        return val;
    }
    @RequestMapping(value = "/{id}")
    public  String getTest(@PathVariable Long id){
        String apivaluefromadminserviceurl = "http://localhost:8082/user"+id;
        RestTemplate restTemplate = new RestTemplate();
        String val = restTemplate.getForObject(apivaluefromadminserviceurl, String.class);
        return val;
    }

    @RequestMapping(value = "/test1/{id}")
    public  Admin getAdmin(@PathVariable Long id){
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Admin> responseEntity = restTemplate.exchange(
                "http://localhost:8889/ADMINS-SERVICES/user"+id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Admin>() {
                });
        Admin pojoObj = responseEntity.getBody();

        return pojoObj;
    }
}