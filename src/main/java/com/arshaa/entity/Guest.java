package com.arshaa.entity;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GUEST")
public class Guest {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int guestId;
	private String firstName;
	private String lastName;
	private String email;
	private String occupation;
	private Date dateOfBirth;
	private int personalNumber;
	private int secondaryPhoneNumber;
	private String fatherName;
	private int fatherNumber;
	private String localGaurdianName;
	private int localGaurdianPhoneNumber;
	private String bloodGroup;
	private String gender;
	private String addressLine1;
	private String addressLine2;
	private int pincode;
	private String city;
	private String state;
	private String country;
	private Long aadharNumber;
	private Date checkinDate;
	private String workAddressLine1;
	private String workAddressLine2;
	private int workNumber;
	private String buildingName;
	private int floorNumber;
	private int roomNumber;
	private int bedId;
	private String paymentId;
	private String transactionId;
	private String dueAmount;
	private String paymentPurpose;
	private int roomRent;
	private int securityDeposit;
	private String paymentMethod;
	private Date transactionDate;
	private Date noticeDate;
	private Date checkOutDate;

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(int personalNumber) {
		this.personalNumber = personalNumber;
	}

	public int getSecondaryPhoneNumber() {
		return secondaryPhoneNumber;
	}

	public void setSecondaryPhoneNumber(int secondaryPhoneNumber) {
		this.secondaryPhoneNumber = secondaryPhoneNumber;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getFatherNumber() {
		return fatherNumber;
	}

	public void setFatherNumber(int fatherNumber) {
		this.fatherNumber = fatherNumber;
	}

	public String getLocalGaurdianName() {
		return localGaurdianName;
	}

	public void setLocalGaurdianName(String localGaurdianName) {
		this.localGaurdianName = localGaurdianName;
	}

	public int getLocalGaurdianPhoneNumber() {
		return localGaurdianPhoneNumber;
	}

	public void setLocalGaurdianPhoneNumber(int localGaurdianPhoneNumber) {
		this.localGaurdianPhoneNumber = localGaurdianPhoneNumber;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public Date getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	public String getWorkAddressLine1() {
		return workAddressLine1;
	}

	public void setWorkAddressLine1(String workAddressLine1) {
		this.workAddressLine1 = workAddressLine1;
	}

	public String getWorkAddressLine2() {
		return workAddressLine2;
	}

	public void setWorkAddressLine2(String workAddressLine2) {
		this.workAddressLine2 = workAddressLine2;
	}

	public int getWorkNumber() {
		return workNumber;
	}

	public void setWorkNumber(int workNumber) {
		this.workNumber = workNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getBedId() {
		return bedId;
	}

	public void setBedId(int bedId) {
		this.bedId = bedId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(String dueAmount) {
		this.dueAmount = dueAmount;
	}

	public String getPaymentPurpose() {
		return paymentPurpose;
	}

	public void setPaymentPurpose(String paymentPurpose) {
		this.paymentPurpose = paymentPurpose;
	}

	public int getRoomRent() {
		return roomRent;
	}

	public void setRoomRent(int roomRent) {
		this.roomRent = roomRent;
	}

	public int getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(int securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Guest(int guestId, String firstName, String lastName, String email, String occupation, Date dateOfBirth,
			int personalNumber, int secondaryPhoneNumber, String fatherName, int fatherNumber, String localGaurdianName,
			int localGaurdianPhoneNumber, String bloodGroup, String gender, String addressLine1, String addressLine2,
			int pincode, String city, String state, String country, Long aadharNumber, Date checkinDate,
			String workAddressLine1, String workAddressLine2, int workNumber, String buildingName, int floorNumber,
			int roomNumber, int bedId, String paymentId, String transactionId, String dueAmount, String paymentPurpose,
			int roomRent, int securityDeposit, String paymentMethod, Date transactionDate, Date noticeDate,
			Date checkOutDate) {
		super();
		this.guestId = guestId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.occupation = occupation;
		this.dateOfBirth = dateOfBirth;
		this.personalNumber = personalNumber;
		this.secondaryPhoneNumber = secondaryPhoneNumber;
		this.fatherName = fatherName;
		this.fatherNumber = fatherNumber;
		this.localGaurdianName = localGaurdianName;
		this.localGaurdianPhoneNumber = localGaurdianPhoneNumber;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
		this.aadharNumber = aadharNumber;
		this.checkinDate = checkinDate;
		this.workAddressLine1 = workAddressLine1;
		this.workAddressLine2 = workAddressLine2;
		this.workNumber = workNumber;
		this.buildingName = buildingName;
		this.floorNumber = floorNumber;
		this.roomNumber = roomNumber;
		this.bedId = bedId;
		this.paymentId = paymentId;
		this.transactionId = transactionId;
		this.dueAmount = dueAmount;
		this.paymentPurpose = paymentPurpose;
		this.roomRent = roomRent;
		this.securityDeposit = securityDeposit;
		this.paymentMethod = paymentMethod;
		this.transactionDate = transactionDate;
		this.noticeDate = noticeDate;
		this.checkOutDate = checkOutDate;
	}

	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}

}
