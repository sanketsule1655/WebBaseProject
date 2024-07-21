package org.techhub.repository;

import org.techhub.model.SubAdminModel;

import com.mysql.cj.jdbc.CallableStatement;

public class SubAdminRepositoryImp extends DBParent implements SubAdminRepository
{

	@Override
	public boolean isAddNewSubAdmin(SubAdminModel model) {
		try
		{
			cstmt=(CallableStatement) conn.prepareCall("{call addsubadmin(?,?,?,?,?)}");
			cstmt.setString(1, model.getName());
			cstmt.setString(2, model.getEmail());
			cstmt.setString(3, model.getContact());
			cstmt.setString(4, model.getUsername());
			cstmt.setString(5, model.getPassword());
			boolean b=cstmt.execute();
			return !b;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}	
}
