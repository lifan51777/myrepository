package org.fanfan.struts.actions;


import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.fanfan.struts.actionForms.UserRegistrationForm;
import org.fanfan.struts.utils.DatabaseConnection;

public class UserRegistrationAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if(isCancelled(request)){
			return mapping.findForward("welcome");
		}
		UserRegistrationForm userForm = (UserRegistrationForm) form;
		
		if(userForm.getUserName().equals("lifan")){
			throw new Exception("lifan");
		}
		
		DatabaseConnection instance = DatabaseConnection.getInstance();
		String sql = "insert into user(username, logname, password, email, phone, fax) values(?,?,?,?,?,?)";
		Connection con = instance.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, userForm.getUserName());
		ps.setString(2, userForm.getLogName());
		ps.setString(3, userForm.getPassword());
		ps.setString(4, userForm.getEmail());
		ps.setString(5, userForm.getPhone());
		ps.setString(6, userForm.getFax());
		ps.executeUpdate();
		instance.releaseConnection(con, ps, null);
		return mapping.findForward("success");
	}

}
