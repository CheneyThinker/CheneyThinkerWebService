package com.cheney.thinker.webservice.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.cheney.thinker.webservice.service.adapter.MapTypeAdapter;
import com.cheney.thinker.webservice.service.entity.User;

@WebService(targetNamespace="http://www.clxuanye.cn")
public interface CheneyThinkerWebService {
	String index();
	@XmlJavaTypeAdapter(MapTypeAdapter.class)
	Map<String, String> getMap();
	List<User> getAllUser();
}
