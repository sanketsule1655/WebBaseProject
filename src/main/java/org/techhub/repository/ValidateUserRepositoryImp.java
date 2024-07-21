package org.techhub.repository;

import java.util.List;

import org.techhub.model.LoginModel;
import org.techhub.model.VendorModel;

public class ValidateUserRepositoryImp extends DBParent implements ValidateUserRepository
{
	public LoginModel isValidate(LoginModel model)
	{
		try
		{
			stmt = conn.prepareStatement(" select *from login where username=? and password=?;");
			stmt.setString(1, model.getUsername());
			stmt.setString(2, model.getPassword());
			rs=stmt.executeQuery();
			if(rs.next())
			{
				model.setLoginType(rs.getString("logintype"));
				model.setUserId(rs.getInt("userid"));
			}
			return model;
		}
		catch(Exception ex)
		{
			System.out.println("Error is:"+ex);
			return null;
		}
	}

public static void main(String x[])
{
	ValidateUserRepositoryImp vrepoimp = new ValidateUserRepositoryImp();
	LoginModel model = new LoginModel();
	model.setUsername("abc");
	model.setPassword("abc");
	model = vrepoimp.isValidate(model);
	System.out.println(model);
}

@Override
public List<VendorModel> getVendorList() {
	// TODO Auto-generated method stub
	return null;
}
}
