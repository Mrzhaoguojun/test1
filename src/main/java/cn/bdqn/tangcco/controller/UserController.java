package cn.bdqn.tangcco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lenovo on 2017/6/2.
 */

    @Controller
    @RequestMapping(value="/user")
    public class UserController {

        @RequestMapping(value="/list",method= RequestMethod.GET)
        public String queryAll(){
            return "user/listUser";
        }
    }

