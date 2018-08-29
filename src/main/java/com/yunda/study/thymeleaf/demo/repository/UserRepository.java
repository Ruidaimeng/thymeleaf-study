package com.yunda.study.thymeleaf.demo.repository;

import com.yunda.study.thymeleaf.demo.model.User;

import java.util.List;



/**
 * User Repository 接口.
 * 
 * @since 1.0.0 2017年4月29日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface UserRepository {
	/**
	 * 创建或者修改用户
	 * @param user
	 * @return
	 */
	User saveOrUpdateUser(User user);
	
	/**
	 * 删除用户
	 * @param id
	 */
	void deleteUser(Long id);
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	User getUserById(Long id);
	/**
	 * 获取用户列表
	 * @return
	 */
	List<User> listUsers();
}
