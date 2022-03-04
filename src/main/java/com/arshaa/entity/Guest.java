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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getSecondaryPhone() {
		return secondaryPhone;
	}

	public void setSecondaryPhone(int secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getFatherPhone() {
		return fatherPhone;
	}

	public void setFatherPhone(int fatherPhone) {
		this.fatherPhone = fatherPhone;
	}

	public String getLocalGaurdianName() {
		return localGaurdianName;
	}

	public void setLocalGaurdianName(String localGaurdianName) {
		this.localGaurdianName = localGaurdianName;
	}

	public int getLocalGaurdianPhone() {
		return localGaurdianPhone;
	}

	public void setLocalGaurdianPhone(int localGaurdianPhone) {
		this.localGaurdianPhone = localGaurdianPhone;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
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
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Long getAadharCard() {
		return AadharCard;
	}

	public void setAadharCard(Long aadharCard) {
		AadharCard = aadharCard;
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
		return BuildingName;
	}

	public void setBuildingName(String buildingName) {
		BuildingName = buildingName;
	}

	public int getFloorNumber() {
		return FloorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		FloorNumber = floorNumber;
	}

	public int getRoomNumber() {
		return RoomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		RoomNumber = roomNumber;
	}

	public int getBedId() {
		return BedId;
	}

	public void setBedId(int bedId) {
		BedId = bedId;
	}

	public String getPaymentId() {
		return PaymentId;
	}

	public void setPaymentId(String paymentId) {
		PaymentId = paymentId;
	}

	public String getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}

	public String getDue() {
		return Due;
	}

	public void setDue(String due) {
		Due = due;
	}

	public String getPaymentPurpose() {
		return PaymentPurpose;
	}

	public void setPaymentPurpose(String paymentPurpose) {
		PaymentPurpose = paymentPurpose;
	}

	public int getRoomRent() {
		return RoomRent;
	}

	public void setRoomRent(int roomRent) {
		RoomRent = roomRent;
	}

	public int getSecurityDeposit() {
		return SecurityDeposit;
	}

	public void setSecurityDeposit(int securityDeposit) {
		SecurityDeposit = securityDeposit;
	}

	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}

	public Date getTransactionDate() {
		return TransactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		TransactionDate = transactionDate;
	}

	public Date getNoticeDate() {
		return NoticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		NoticeDate = noticeDate;
	}

	public Date getCheckOutDate() {
		return CheckOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		CheckOutDate = checkOutDate;
	}

	private String firstName;
	
	public Guest(int guestId, String firstName, String lastName, String email, Date dateOfBirth, int phone,
			int secondaryPhone, String fatherName, int fatherPhone, String localGaurdianName, int localGaurdianPhone,
			String bloodGroup, String addressLine1, String addressLine2, int pincode, String city, String state,
			String country, Long aadharCard , Date checkinDate, String workAddressLine1,
			String workAddressLine2, int workNumber, String buildingName, int floorNumber, int roomNumber, int bedId,
			String paymentId, String transactionId, String due, String paymentPurpose, int roomRent,
			int securityDeposit, String paymentMethod, Date transactionDate, Date noticeDate, Date checkOutDate) {
		super();
		this.guestId = guestId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.secondaryPhone = secondaryPhone;
		this.fatherName = fatherName;
		this.fatherPhone = fatherPhone;
		this.localGaurdianName = localGaurdianName;
		this.localGaurdianPhone = localGaurdianPhone;
		this.bloodGroup = bloodGroup;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		Pincode = pincode;
		this.city = city;
		State = state;
		Country = country;
		AadharCard = aadharCard;
	
		this.checkinDate = checkinDate;
		this.workAddressLine1 = workAddressLine1;
		this.workAddressLine2 = workAddressLine2;
		this.workNumber = workNumber;
		BuildingName = buildingName;
		FloorNumber = floorNumber;
		RoomNumber = roomNumber;
		BedId = bedId;
		PaymentId = paymentId;
		TransactionId = transactionId;
		Due = due;
		PaymentPurpose = paymentPurpose;
		RoomRent = roomRent;
		SecurityDeposit = securityDeposit;
		PaymentMethod = paymentMethod;
		TransactionDate = transactionDate;
		NoticeDate = noticeDate;
		CheckOutDate = checkOutDate;
	}

	private String lastName;
	private String email;
	private Date dateOfBirth;
	private int phone;
	private int secondaryPhone;
	private String fatherName;
	private int fatherPhone;
	private String localGaurdianName;
	private int localGaurdianPhone;
	private String bloodGroup;
   public byte[] getGuestProfilePicture() {
		return GuestProfilePicture;
	}

	public void setGuestProfilePicture(byte [] guestProfilePicture) {
		GuestProfilePicture = guestProfilePicture;
	}

private byte [] GuestProfilePicture;
	public Guest(byte[] guestProfilePicture) {
	super();
	GuestProfilePicture = guestProfilePicture;
}

	private String addressLine1;
	private String addressLine2;
      private int  Pincode;
	private String city;
       private String State;
       private String Country;
       private Long   AadharCard;
      
    
     private Date checkinDate;

	
	private String workAddressLine1;
	private String workAddressLine2;
      private int workNumber;
       private String BuildingName;
	private int FloorNumber;
	private int RoomNumber;
	private int  BedId;
	private String PaymentId;
	private String TransactionId;
	private String Due;
	private String PaymentPurpose;
	private int RoomRent;
	private int SecurityDeposit;
     private String PaymentMethod;
private Date TransactionDate;
private Date NoticeDate;
private Date CheckOutDate;


	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public Guest() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Guest(int guestId) {
		super();
		this.guestId = guestId;
	}
	

	
	
}
