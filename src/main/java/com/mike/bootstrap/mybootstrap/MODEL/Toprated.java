package com.mike.bootstrap.mybootstrap.MODEL;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Toprated")
public class Toprated implements Topic {

    public String getTopic(){
        return "Toprated";
    }


    // print my object when using toSting
    @Override
    public String toString() {
        return "Toprated";
    }




}
