package in.cdac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
public class UserDao {
	private JdbcTemplate jdbcTemplate;
	
	boolean adduser(User u)
	{
		String sql="insert into puser values(?,?)";
		int result =jdbcTemplate.update(sql,u.getName(),u.getPass());
		if(result>0)
		return true;
		else
			return false;
	}

}
