package com.mycompany.myproject.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mycompany.myproject.jdbc.MySqlConnection;
import com.mycompany.myproject.model.Customer;

public class CustomerFactoryImpl implements CustomerFactory {
	
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private Statement statement=null;
	static Scanner sc=new Scanner(System.in);
	Customer tempCustomer=null;
	public CustomerFactoryImpl() {
		super();
		
		try {
			connection=MySqlConnection.getMyConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Customer createCustomer(int id, String name, String email) {
		// TODO Auto-generated method stub
		
		try {
			tempCustomer=new Customer(id,name,email);
	
			pStatement=connection.prepareStatement("insert into customer values(?,?,?)");
			pStatement.setInt(1, tempCustomer.getId());
			pStatement.setString(2, tempCustomer.getName().toString());
			pStatement.setString(3, tempCustomer.getEmail().toString());
			int count=pStatement.executeUpdate();
			System.out.println(count+" row(s) inserted...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return tempCustomer;
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		
		
		List<Customer> list=new ArrayList<Customer>();
		try {
			statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from customer");
			while(rs.next())
			{
				Customer c=new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
				list.add(c);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		return list;
	}

	public void findById(int id) {
		// TODO Auto-generated method stub
		try {
			int count=-1;
			pStatement=connection.prepareStatement("select * from customer where id=?");
			pStatement.setInt(1, id);
			ResultSet rs=pStatement.executeQuery();
			System.out.println(rs);
			while(rs.next())
			{
				count++;
			}
			if(count<0)
			{
				System.out.println("no such record found...");
			}
			else
			{
				rs.beforeFirst();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3));
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateCustomer(int id) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("updated name: ");
			String name=sc.next();
			System.out.print("updated email: ");
			String email=sc.next();
			pStatement=connection.prepareStatement("update customer set name=? , email=? where id=?");
			pStatement.setString(1,name );
			pStatement.setString(2, email);
			pStatement.setInt(3, id);
			int i=pStatement.executeUpdate();
			if(i<=0)
			{
				System.out.println("no such id.");
			}
			else
			{
				System.out.println("updated sucessfully..");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
