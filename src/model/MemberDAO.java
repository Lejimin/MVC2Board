package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	
	public void getCon() {
		try {
			
			Context initctx = new InitialContext();
			DataSource ds = (DataSource)initctx.lookup("java:comp/env/jdbc/mysql");
			con = ds.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public void joinmember(MemberBean bean) {
		getCon();
		
		try {
			String sql = "insert into mymember values (?,?,?,?,now(),?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPw());
			pstmt.setString(3, bean.getName());
			pstmt.setString(4, bean.geteMail());
			pstmt.setString(5, bean.getAddress());
			
			pstmt.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public Vector<MemberBean> getAllMember(){
		getCon();
		
		Vector<MemberBean> v = new Vector<>();
		try {
			String sql = "select * from mymember";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberBean bean = new MemberBean();
				bean.setId(rs.getString("id"));
				bean.setPw(rs.getString("pw"));
				bean.setName(rs.getString("name"));
				bean.seteMail(rs.getString("email"));
				bean.setrDate(rs.getTimestamp("rDate"));
				bean.setAddress(rs.getString("address"));
				v.add(bean);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;
	}


	public void updatemember(MemberBean bean) {
		getCon();
		
		try {
			String sql = "update mymember set pw=?, name=?, rDate=now(), address=? where id=? AND eMail=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getPw());
			pstmt.setString(2, bean.getName());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getId());
			pstmt.setString(5, bean.geteMail());
			
			pstmt.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public void deletemember(MemberBean bean) {
		getCon();
		
		try {
			String sql = "delete from mymember where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getId());
			pstmt.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




}
