package com.example.springbootthreesteptutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

    @RequestMapping("/contents")
    public String contentDirect() {
        return "redirect:https://www.fastweb.com/career-planning/articles/three-steps-to-a-successful-job-interview";
    }

    @RequestMapping("/images")
    public String imageDirect()
    {
        return "redirect:https://pixabay.com";
    }

}
