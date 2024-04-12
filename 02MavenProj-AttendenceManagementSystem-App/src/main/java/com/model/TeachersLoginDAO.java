package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeachersLoginDAO
{
	private TeachersLoginBean tlb = null;
	
	public TeachersLoginBean login(String rollNo, String pWord)
	{
		try
		{
			Connection con = DBConnection.getInstance();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM AMSTEACHERSLOGIN WHERE ROLLNO=? AND PWORD=?");
			ps.setString(1, rollNo);
			ps.setString(2, pWord);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				tlb = new TeachersLoginBean();
				tlb.setName(rs.getString(1));
				tlb.setpWord(rs.getString(2));
				tlb.setRollNo(rs.getString(3));
				tlb.setSubject(rs.getString(4));
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return tlb;
	}
}
