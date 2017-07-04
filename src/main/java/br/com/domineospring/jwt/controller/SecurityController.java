package br.com.domineospring.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nando on 03/06/17.
 */
@RestController
public class SecurityController {

    @GetMapping("/security")
    public String someData(){
        return "{'security': 'S_E_C_U_R_I_T_Y_'}";
    }

}
