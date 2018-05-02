/*  
 * Copyright @ 2018 com.apexsoft  
 * demo 下午2:40:03  
 * All right reserved.  
 */      
package com.apex.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.apex.demo.domain.User;
import com.apex.demo.service.DomainService;

/**  
 * @desc: demo  
 * @author: yangcheng  
 * @createTime: 2018年5月2日 下午2:40:03    
 * @version: v1.0    
 */
@RestController
public class IndexController {
    @Autowired
    DomainService domainService;
    @RequestMapping("/users")
    public List<User> getAll() {
        return domainService.findAll();
    }
    
    @RequestMapping("/getByName")
    public User getByName(@RequestParam String userName) {
        return domainService.findByUserName(userName);
    }



}
  
    