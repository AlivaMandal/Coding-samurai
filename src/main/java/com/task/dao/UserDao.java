package com.task.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import com.to.entity.user;
public class UserDao {
	
	private Connection con;

	public UserDao(Connection con) {
		super();
		this.con = con;
	}
	
	public boolean addtask(user us) {
		boolean f = false;
		try {
			String sql="insert into users(sub,chap,date,status) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, us.getSub());
			ps.setString(2, us.getChap());
			ps.setString(3, us.getDate());
			ps.setString(4, us.getStatus());
			int n = ps.executeUpdate();
			
			if(n==1) {
				f=true;
				
			}
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public List<user> getAll(){
		List<user> list=new ArrayList<user>();
		user s=null;
		try {
			String sql="select * from users";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				s=new user();
				s.setId(rs.getInt(1));
				s.setSub(rs.getString(2));
				s.setChap(rs.getString(3));
				s.setDate(rs.getString(4));
				s.setStatus(rs.getString(5));
				list.add(s);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public user getById(int id) {
		user s=null;
		try {
			String sql="selec * from users where no=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				s=new user();
				s.setId(rs.getInt(1));
				s.setSub(rs.getString(2));
				s.setChap(rs.getString(3));
				s.setDate(rs.getString(4));
				s.setStatus(rs.getString(5));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	public boolean delete(int id) {
		boolean f = false;
		try {
			String sql="delete from users where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int i= ps.executeUpdate();
			if(i == 1) {
				f = true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

}
