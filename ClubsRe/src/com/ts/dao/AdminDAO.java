package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

import com.ts.db.MyConnection;
import com.ts.dto.AdminT;

public class AdminDAO {
	public AdminT getAdmin(String mail, String pass) {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
		AdminT admint = null;
		final String SELECT_QUERY="select * from adminT where mail= ? and password = ?";
		con = MyConnection.getConnection();
		try {
			pst = con.prepareStatement(SELECT_QUERY);
			pst.setString(1, mail);
			pst.setString(2, pass);
			rs = pst.executeQuery();
			if(rs.next()) {
				admint = new AdminT();
				admint.setMail(rs.getString(1));
				admint.setPassword(rs.getString(2));
				
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		return admint;		
	}

}
