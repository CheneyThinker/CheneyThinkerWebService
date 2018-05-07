package com.cheney.thinker.webservice.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.cheney.thinker.webservice.service.CheneyThinkerWebService;
import com.cheney.thinker.webservice.service.entity.User;

@WebService(endpointInterface="com.cheney.thinker.webservice.service.CheneyThinkerWebService", serviceName="CheneyThinkerWebServiceImpl", targetNamespace="http://www.clxuanye.cn")
public class CheneyThinkerWebServiceImpl implements CheneyThinkerWebService {

	public String index() {
		return "Welcome to CheneyThinkerWebService Application!";
	}

	public Map<String, String> getMap() {
		Map<String, String> map = new HashMap<>();
		map.put("cheney", "CheneyThinker");
		map.put("czmwy", "wy");
		map.put("wxy", "wxy");
		map.put("lena", "cr");
		return map;
	}

	public List<User> getAllUser() {
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "CheneyThinker"));
		users.add(new User(2, "wy"));
		users.add(new User(3, "wxy"));
		users.add(new User(4, "cr"));
		return users;
	}

}
