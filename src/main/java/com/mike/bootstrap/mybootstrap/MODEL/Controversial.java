package com.mike.bootstrap.mybootstrap.MODEL;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Controversial")
public class Controversial implements Topic{

    public String getTopic(){
        return "Controversial";
    }


    // print my object when using toSting
    @Override
    public String toString() {
        return "Controversial";
    }


}
