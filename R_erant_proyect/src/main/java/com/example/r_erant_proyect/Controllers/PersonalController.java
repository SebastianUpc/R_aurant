package com.example.r_erant_proyect.Controllers;

import com.example.r_erant_proyect.ServiceInterface.PersonalServiceInterface;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/personal")
public class PersonalController {
    @Autowired
    private PersonalServiceInterface Ps;
}
