package com.swopsolutions.beans;

import java.sql.Blob;
import java.sql.Timestamp;

public class Reimbursements {
	private int r_id;
	private String r_description;
	private double Amount;
	private Blob picture;
	private int u_id;
	private int status_id;
	private Timestamp created_date;
	private Timestamp resolve_date;
	private int resolver_id;
	private int r_type;

	public Reimbursements() {
	}

	public Reimbursements(int r_id, String r_description, double amount, Blob picture, int u_id, int status_id,
			Timestamp created_date, Timestamp resolve_date, int resolver_id, int r_type) {
		super();
		this.r_id = r_id;
		this.r_description = r_description;
		Amount = amount;
		this.picture = picture;
		this.u_id = u_id;
		this.status_id = status_id;
		this.created_date = created_date;
		this.resolve_date = resolve_date;
		this.resolver_id = resolver_id;
		this.r_type = r_type;
	}

	// Constructor without ID
	public Reimbursements(String r_description, double amount, Blob picture, int u_id, int status_id,
			Timestamp created_date, Timestamp resolve_date, int resolver_id, int r_type) {
		super();

		this.r_description = r_description;
		Amount = amount;
		this.picture = picture;
		this.u_id = u_id;
		this.status_id = status_id;
		this.created_date = created_date;
		this.resolve_date = resolve_date;
		this.resolver_id = resolver_id;
		this.r_type = r_type;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getR_description() {
		return r_description;
	}

	public void setR_description(String r_description) {
		this.r_description = r_description;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public Timestamp getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}

	public Timestamp getResolve_date() {
		return resolve_date;
	}

	public void setResolve_date(Timestamp resolve_date) {
		this.resolve_date = resolve_date;
	}

	public int getResolver_id() {
		return resolver_id;
	}

	public void setResolver_id(int resolver_id) {
		this.resolver_id = resolver_id;
	}

	public int getR_type() {
		return r_type;
	}

	public void setR_type(int r_type) {
		this.r_type = r_type;
	}

	@Override
	public String toString() {
		return "Reimbursements [r_id=" + r_id + ", r_description=" + r_description + ", Amount=" + Amount + ", picture="
				+ picture + ", u_id=" + u_id + ", status_id=" + status_id + ", created_date=" + created_date
				+ ", resolve_date=" + resolve_date + ", resolver_id=" + resolver_id + ", r_type=" + r_type + "]";
	}

}
