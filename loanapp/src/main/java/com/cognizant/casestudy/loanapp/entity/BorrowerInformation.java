package com.cognizant.casestudy.loanapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="borrower_info")
public class BorrowerInformation {

	// define fields
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="borrower_id")
	private int id;
	
	@Column(name="borrower_name")
	private String borrowerName;
	
	// mapping to loan info
	@OneToMany(mappedBy="borrower" , cascade= CascadeType.ALL)
	private List<LoanInformation> loans;

	// define getters/ setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public List<LoanInformation> getLoans() {
		return loans;
	}

	public void setLoans(List<LoanInformation> loans) {
		this.loans = loans;
	}


	// method to add/get the loans from the borrower and vice-versa

	public void addLoan(LoanInformation loan) {
		
		if(loans== null) {
			loans = new ArrayList<>();
		}
		
		loans.add(loan);
		
		loan.setBorrower(this);
	}
	
	// constructors
	public BorrowerInformation() {
		
	}

	public BorrowerInformation(String borrowerName, List<LoanInformation> loans) {
		super();
		this.borrowerName = borrowerName;
		this.loans = loans;
	}
	
	
	
	
}
