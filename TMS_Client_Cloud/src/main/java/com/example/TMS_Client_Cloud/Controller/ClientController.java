package com.example.TMS_Client_Cloud.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Client")
public class ClientController {

    @Autowired
    RestTemplate restTemplate;

    Logger logger= LoggerFactory.getLogger(ClientController.class);

    @GetMapping("/getstring")
    public String getString()
    {
        logger.info("Client log");
        String sabari= restTemplate.getForObject("http://localhost:8081/user/getstring",String.class);
        return sabari;
    }

}
