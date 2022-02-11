package com.example.springbootthreesteptutorial;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHome()
    {
        return "index";
    }

    @RequestMapping("/preparation")
    public String showPreparationPage()
    {return "pages/preparation";
    }

    @RequestMapping("/interview-day")
    public String showInterviewPage()
    {return "pages/interview-day";
    }

    @RequestMapping("/follow-up")
    public String showFollowUpPage()
    {return "pages/follow-up";
    }
}
