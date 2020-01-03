package com.gao.model.dao;

import java.util.List;

public interface IGenericDao <T, ID>{
	void create(T object);
	void update(T object);
	void delete(T object);
	List<T> getAll(final Class<T> type);
}
