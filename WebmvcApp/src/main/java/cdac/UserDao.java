package cdac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class UserDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate; 
	public boolean createUser(User u)
	{
		String sql = "insert into spring_user values(?,?,?,?)";
		int result=jdbcTemplate.update(sql,u.getId(),u.getUname(),u.getUpass(),u.getEmail());
		if(result>0)
		return true;
		
		return false;
	}
	public boolean deleteUser(User u)
	{
		String sql = "delete from spring_user where id=?";
		int result=jdbcTemplate.update(sql,u);
		if(result>0)
		return true;
		
		return false;
	}
	public boolean updateUser(User u)
	{
		String sql = "update spring_user set uname=? where id=?";
		int result=jdbcTemplate.update(sql,u);
		if(result>0)
		return true;
		
		return false;
	}
	public User readUser(User u)
	{
		String sql = "select * from spring_user id=?";
		User user=jdbcTemplate.queryForObject(sql, new Object[] {u.getId()}, new UserRowMapper());
		if(user.getId()>0)
		return user;
		
		return null;
	}
	
	public List<User> readAllUsers()
	{
		String sql = "select * from spring_user";
		List<User> user=jdbcTemplate.query(sql, new UserRowMapper());
		if(user.size()>0)
		return user;
		
		return null;
	}
}
