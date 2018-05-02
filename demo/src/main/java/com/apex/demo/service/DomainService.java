/*  
 * Copyright @ 2018 com.apexsoft  
 * demo 下午2:41:47  
 * All right reserved.  
 */      
package com.apex.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apex.demo.domain.User;
import com.apex.demo.domain.UserDao;

/**  
 * @desc: demo  
 * @author: yangcheng  
 * @createTime: 2018年5月2日 下午2:41:47    
 * @version: v1.0    
 */
@Service
public class DomainService {
    @Autowired
    UserDao userDao;
    
    public User findByUserName(String userName){
        return userDao.findByUserName(userName);
    }
    public User findByUserNameOrEmail(String username, String email){
        return userDao.findByUserNameOrEmail(username, email);
    }
    public List<User> findAll(){
        return userDao.findAll();
    }
}
  
    