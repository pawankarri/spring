package com.spring.setterdependent;

public class Address {
private String dno;
private String village;
private String city;

public String getDno() {
	return dno;
}
public void setDno(String dno) {
	this.dno = dno;
}
public String getVillage() {
	return village;
}
public void setVillage(String village) {
	this.village = village;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [dno=" + dno + ", village=" + village + ", city=" + city + "]";
}

}
