package com.swopsolutions.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.net.ntp.TimeStamp;

import com.swopsolutions.beans.Reimbursements;
import com.swopsolutions.beans.User;
import com.swopsolutions.util.ConnectionUtil;

public class ReimbursementsDaoImpl implements MasterDAO {
	// Create
	public int insertReimbursements(String r_description, double amount, Blob picture, int u_id, int r_type) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "Insert into reimbursements(r_description,amount, picture, u_id,r_type) values(?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, r_description);
			ps.setDouble(2, amount);
			ps.setBlob(3, picture);
			ps.setInt(4, u_id);
			ps.setInt(5, r_type);
			return ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return 0;
	}

	// Retrieve
	public List<Reimbursements> retrieveSeys() {
		List seys = new ArrayList<>();
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "select * from reimbursements";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Reimbursements r = new Reimbursements(rs.getInt("r_id"), rs.getString("r_description"),
						rs.getDouble("amount"), rs.getBlob("picture"), rs.getInt("u_id"), rs.getInt("status_id"),
						rs.getTimestamp("create_date"), rs.getTimestamp("resolve_date"), rs.getInt("resolver_id"),
						rs.getInt("r_type"));
				System.out.println(rs.getString("r_description"));
				seys.add(r);
				System.out.println(r);
			}
		} catch (SQLException s) {

		} catch (IOException e) {

		}
		return seys;

	}

	// Retrieve
	public List<Reimbursements> retrieveUserSeys(int u_id) {
		List<Reimbursements> seys = new ArrayList<>();
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "select * from reimbursements where u_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, u_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Reimbursements r = new Reimbursements(rs.getInt("r_id"), rs.getString("r_description"),
						rs.getDouble("amount"), rs.getBlob("picture"), rs.getInt("u_id"), rs.getInt("status_id"),
						rs.getTimestamp("create_date"), rs.getTimestamp("resolve_date"), rs.getInt("resolver_id"),
						rs.getInt("r_type"));
				System.out.println(rs.getString("r_description"));
				seys.add(r);
				System.out.println(r);
			}
		} catch (SQLException s) {

		} catch (IOException e) {

		}
		return seys;

	}

	public List<Reimbursements> mylist = retrieveSeys();

	// you could have this here but your daos should only contain
	public void getSpecificSey(int R_id) {
		for (Reimbursements u : mylist) {
			if (u.getR_id() == R_id) {
				System.out.println("r_id exists already my Reimbursements");

			}
		}
	}

	// to use this method you need to put in the id of the reimbursement (r_id)
	public int updateReimbursements(int r_id, int s_id, int resolver_id) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "Update reimbursements status_id= ? resolver_id = ? resolve_date= ? where r_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, s_id);
			ps.setInt(4, r_id);
			ps.setInt(2, resolver_id);
			ps.setDate(3, (java.sql.Date) new Date());
			return ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println();
		} catch (IOException i) {
		}
		return 0;
	}

////	@Override
//	public void uploadPhoto(int picture) {
//		try (Connection con = ConnectionUtil.getConnection(filename)) {
//			String sql = "update recipt = ? where picture = ?";
//			PreparedStatement ps = con.prepareStatement(sql);
//			File blob = new File("C:\Users\swopa_ytg47c0\ShropshireJ\PROJECT_1") {
//				FileInputStream in = new FileInputStream("blob");
//				ps.setBinaryStream(1, in);
//				ps.setInt(2, picture);
//				ps.executeUpdate();
//			} catch(SQLException e) {
//				e.printStackTrace();
//			} catch(IOException e) {
//				e.printStackTrace();
//					
//			}
////		}
//}}
}