package org.fanfan.struts.actions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.fanfan.struts.beans.User;
import org.fanfan.struts.utils.DatabaseConnection;

public class DisplayAllUserAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Connection con = DatabaseConnection.getInstance().getConnection();
		Statement st = null;
		ResultSet rs = null;
		String sql = "select username, logname, email, phone, fax from user";
		List<User> users = new ArrayList<>();
		st = con.createStatement();
		rs = st.executeQuery(sql);
		while(rs.next()){
			User user = new User();
			user.setUserName(rs.getString("username"));
			user.setLogName(rs.getString("logname"));
			user.setEmail(rs.getString("email"));
			user.setPhone(rs.getString("phone"));
			user.setFax(rs.getString("fax"));
			users.add(user);
		}

		request.setAttribute("users", users);
		DatabaseConnection.getInstance().releaseConnection(con, st, rs);
		return mapping.findForward("display");
	}

}
