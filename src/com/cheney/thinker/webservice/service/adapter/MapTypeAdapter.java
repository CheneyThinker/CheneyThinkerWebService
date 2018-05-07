package com.cheney.thinker.webservice.service.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MapTypeAdapter<K, V> extends XmlAdapter<MapTypeAdapter.Result<K, V>, Map<K, V>> {
	
	public Map<K, V> unmarshal(Result<K, V> result) throws Exception {
		Map<K, V> map = new HashMap<K, V>();
		for (Result.Entry<K, V> entry : result.getEntries()) {
			map.put(entry.getKey(), entry.getValue());
		}
		return map;
	}
	
	public Result<K, V> marshal(Map<K, V> map) throws Exception {
		Result<K, V> result = new Result<K, V>();
		for (Map.Entry<K, V> entry : map.entrySet()) {
			result.addEntry(entry.getKey(), entry.getValue());
		}
		return result;
	}
	
	public static class Result<K, V> {
		private List<Entry<K, V>> entries = new ArrayList<Entry<K, V>>();
		public void addEntry(K fieldName, V fieldValue) {
			Entry<K, V> entry = new Entry<K, V>();
			entry.setKey(fieldName);
			entry.setValue(fieldValue);
			entries.add(entry);
		}
		public List<Entry<K, V>> getEntries() {
			return entries;
		}
		public void setEntries(List<Entry<K, V>> entries) {
			this.entries = entries;
		}
		public static class Entry<K, V> {
			private K key;
			private V value;
			public K getKey() {
				return key;
			}
			public void setKey(K key) {
				this.key = key;
			}
			public V getValue() {
				return value;
			}
			public void setValue(V value) {
				this.value = value;
			}
		}
	}
	
}
