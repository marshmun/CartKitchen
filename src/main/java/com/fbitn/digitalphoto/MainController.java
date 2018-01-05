package com.fbitn.digitalphoto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Controller
public class MainController {

    private static final String API_URL ="https://grocery-checklist-api.azurewebsites.net/api/Categories";
    private static RestTemplate restTemplate = new RestTemplate();
    private static Random random = new Random();

    @RequestMapping(path="/", method = RequestMethod.GET)
    public String index(){
        return"index";
    }

    @RequestMapping(path="/home", method= RequestMethod.GET)
    public String home(){
        return "homepage";
    }

    @RequestMapping (path="/news", method = RequestMethod.GET)
        public String news(){
            return "news";
        }

    @RequestMapping ( path ="/recipe", method = RequestMethod.GET)
        public String recipe(){
            return "recipe";
    }

    @RequestMapping ( path = "/shoppinglist", method = RequestMethod.GET)
        public String shoppinglist(){
            return "shoppinglist.html";
    }
}
