package com.mike.bootstrap.mybootstrap.REST;
import com.mike.bootstrap.mybootstrap.MODEL.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

        // 2 beans created

        @Autowired
        @Qualifier("Toprated")
        Topic Toprated;


        @Autowired
        @Qualifier("Controversial")
        Topic Controversial;

    // get is default method
    @RequestMapping("/")
    public String sayHi(){
        return Toprated.getTopic();
    }

    @RequestMapping("/Controversial")
    public String sayHi2(){
        // polymorphism prevent tightly coupled classes
        return Controversial.getTopic();
    }

}
