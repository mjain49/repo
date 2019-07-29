package com.cg.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@NamedQueries(
		{
//			@NamedQuery(name="getNames", query="select acc.accHolderName from"
//					+ "Account acc where acc.balance between :b1 and :b2"),
			@NamedQuery(name="update", query="update Account acc set acc.balance=acc.balance*2")
		}
)
@Table(name="account_info")
public class Account {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO) // for auto generating accountNo 
 private int accountNo;
 @Column(name="acc_holder_name", length=25)
 private String accHolderName;
 @Column(length = 20)
 private String mobileNo;
 private double balance;
 public int getAccountNo() {
 return accountNo;
 }

 public void setAccountNo(int accountNo) {
 this.accountNo = accountNo;
 }
 
 public String getAccHolderName() {
 return accHolderName;
 }
 
 public void setAccHolderName(String accHolderName) {
 this.accHolderName = accHolderName;
 }
 
 public String getMobileNo() {
 return mobileNo;
 }
 
 public void setMobileNo(String mobileNo) {
 this.mobileNo = mobileNo;
 }
 
 public double getBalance() {
 return balance;
 }
 
 public void setBalance(double balance) {
 this.balance = balance;
 }

@Override
public String toString() {
	return "Account [accountNo=" + accountNo + ", accHolderName="
			+ accHolderName + ", mobileNo=" + mobileNo + ", balance=" + balance
			+ "]";
}
 
 
}

