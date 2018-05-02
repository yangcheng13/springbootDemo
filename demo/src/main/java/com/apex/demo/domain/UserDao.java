/*  
 * Copyright @ 2018 com.apexsoft  
 * demo 下午2:57:09  
 * All right reserved.  
 */      
package com.apex.demo.domain;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**  
 * @desc: demo  
 * @author: yangcheng  
 * @createTime: 2018年5月2日 下午2:41:15    
 * @version: v1.0    
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
    List<User> findAll();
    

}
  
   