package cn.shadow.myset;

import java.sql.ResultSet;

public interface RowMapper<T> {
	public T maprow(ResultSet rs,int rowNum)throws Exception;
}
