package com.mustafazorbaz;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Muhendis {

	List<?> muhendisList;
	Set<?> muhendisSet;
	Map<?, ?> muhendisMap;
	Properties muhendisProperties;

	public List<?> getMuhendisList() {
		return muhendisList;
	}

	public void setMuhendisList(List<?> muhendisList) {
		this.muhendisList = muhendisList;
	}

	public Set<?> getMuhendisSet() {
		return muhendisSet;
	}

	public void setMuhendisSet(Set<?> muhendisSet) {
		this.muhendisSet = muhendisSet;
	}

	public Map<?, ?> getMuhendisMap() {
		return muhendisMap;
	}

	public void setMuhendisMap(Map<?, ?> muhendisMap) {
		this.muhendisMap = muhendisMap;
	}

	public Properties getMuhendisProperties() {
		return muhendisProperties;
	}

	public void setMuhendisProperties(Properties muhendisProperties) {
		this.muhendisProperties = muhendisProperties;
	}

	@Override
	public String toString() {
		return "Muhendis [muhendisList=" + muhendisList + 
				"\n muhendisSet=" + muhendisSet + 
				"\n muhendisMap="+ muhendisMap + 
				"\n muhendisProperties=" + muhendisProperties + "]";
	}

}
