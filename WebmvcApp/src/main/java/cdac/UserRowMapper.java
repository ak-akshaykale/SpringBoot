package cdac;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User>
{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUname(rs.getString("uname"));
		user.setEmail(rs.getString("email"));
		user.setUpass(rs.getString("upass"));
		user.setId(rs.getInt("id"));
		return user;
	}

}
