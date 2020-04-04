package cn.shadow.uml.template.dao;

import cn.shadow.uml.template.entity.Member;
import cn.shadow.uml.template.myset.RowMapper;
import cn.shadow.uml.template.template.JDBCTemplate;

import java.sql.ResultSet;
import java.util.List;


public class MemberDAO {
	// 是本类不用集成jdbcTemplate
	// 策略模式只有选择权
	// 模板模式没有的选择但是可以设置某一部分内容自定义
	private JDBCTemplate jdbcTemplate = new JDBCTemplate(null);
	
	public List<?> query() {
		String sql = "select * from t_member";
		return jdbcTemplate.executeQuery(sql, new RowMapper<Member>() {
			//这里就是RowMapper的具体实现，不需要再另加实现
			@Override
			public Member maprow(ResultSet rs, int rowNum) throws Exception {
				Member member = new Member();
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
				member.setNickName(rs.getString("nickname"));
				member.setAge(rs.getInt("age"));
				member.setAddr(rs.getString("addr"));
				return member;
			}
		}, null);
	}
	

}
