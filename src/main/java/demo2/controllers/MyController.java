package demo2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Front Page";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }

    //A parameter is provided by localhost:8080?[name of RequestParam]=[Parameter]
    //E.g: localhost:8080?param=HiWorld
    //Should yield the result HiWorld
    @GetMapping("/echo")
    @ResponseBody
    public String echo(@RequestParam String param) {
        return param;
    }

    //More parameters are provided by
    // localhost:8080?[name of RequestParam]=[Parameter]&[name of RequestParam]=[Parameter]
    //E.g: localhost:8080?param1=Hi&param2=World
    //Should yield the result Hi World
    @GetMapping("/echo2")
    @ResponseBody
    public String echo2Things(@RequestParam String param1, String param2) {
        return param1 + " " + param2;
    }

}
