package org.sid.spring.kafka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AnalyticsController {
    @GetMapping("chart")
    public String analytics()
    {
        return "analytics";
    }

}

