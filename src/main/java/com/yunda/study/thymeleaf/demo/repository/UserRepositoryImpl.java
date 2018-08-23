package com.yunda.study.thymeleaf.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import com.yunda.study.thymeleaf.demo.model.User;
import org.springframework.stereotype.Repository;



/**
 * User Repository.
 * @since 1.0.0 2017年4月29日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
	private static AtomicLong counter = new AtomicLong();
	private final ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<>();
	
	@Override
	public User saveOrUpdateUser(User user) {
		Long id = user.getId();
		if (id == null) { // 新建
			id = counter.incrementAndGet();
			user.setId(id);
		}
		this.userMap.put(id, user);
		return user;
	}

	@Override
	public void deleteUser(Long id) {
		this.userMap.remove(id);
	}

	@Override
	public User getUserById(Long id) {
		return this.userMap.get(id);
	}

	@Override
	public List<User> listUsers() {
		return new ArrayList<User>(this.userMap.values());
	}

}
