package iuh.edu.vn.vonguyenthanhtu_apigatewayspringboot_week2.controller;

import iuh.edu.vn.vonguyenthanhtu_apigatewayspringboot_week2.service.APIGatewatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class APIGatewayController {
    @Autowired
    private APIGatewatService apiGateWayService;

    @GetMapping("/listUser")
    public List<Map<String, Object>> getAllUsers(){
        List<Map<String, Object>> userList = apiGateWayService.getAllUser();
        return userList;
    }

    @GetMapping("/listProduct")
    public List<Map<String, Object>> getAllProduct(){
        List<Map<String, Object>> productList = apiGateWayService.getAllProduct();
        return productList;
    }

    @GetMapping("/listOrder")
    public List<Map<String, Object>> getAllOrders(){
        List<Map<String, Object>> orderList = apiGateWayService.getAllOrder();
        return orderList;
    }
}
