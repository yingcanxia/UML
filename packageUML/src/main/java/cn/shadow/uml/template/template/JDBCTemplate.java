package cn.shadow.uml.template.template;

import cn.shadow.uml.template.myset.RowMapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


public class JDBCTemplate {
	// 得有一个数据库连接属性
	private DataSource dataSource;

	public JDBCTemplate(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public List executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
		// 第一步获取连接
		try {
			Connection conn = this.getconnection();
			// 创建语句集
			PreparedStatement prepareStatement = this.createPreparedStatement(conn, sql);
			// 执行语句集,获取结果集
			/* prepareStatement.set */
			ResultSet rs = this.executeQuery(prepareStatement, values);
			// 解析结果集,这里需要一个抽象的方法
			List<?> list = this.parseResultSet(rs, rowMapper);
			// 关闭结果集,语句集以及连接
			this.closeResultSet(rs);
			this.closeStatement(prepareStatement);
			this.closeConnection(conn);

			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	private Connection getconnection() throws Exception {
		return this.dataSource.getConnection();
	}

	private PreparedStatement createPreparedStatement(Connection conn, String sql) throws Exception {
		return conn.prepareStatement(sql);
	}

	private ResultSet executeQuery(PreparedStatement pstmt, Object[] values) throws Exception {
		for (int i = 0; i < values.length; i++) {
			pstmt.setObject(i, values[i]);
		}
		return pstmt.executeQuery();
	}

	private void closeStatement(Statement stmt) throws Exception {
		stmt.close();
	}

	private void closeResultSet(ResultSet rs) throws Exception {
		rs.close();
	}

	private void closeConnection(Connection conn) throws Exception {
		// 将连接放回到连接池中即可
		conn.close();
	}

	private List<?> parseResultSet(ResultSet rs, RowMapper rowMapper) throws Exception {
		List<Object> list = new ArrayList<Object>();
		int rownum = 1;
		while (rs.next()) {
			Object obj = rowMapper.maprow(rs, rownum);
			list.add(obj);
		}

		return list;
	}
	// public abstract Object processResult(ResultSet rs,int rownum);
}
