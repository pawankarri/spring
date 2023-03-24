package com.spring.costructorcollection2;

public class Answer {
private int id;
private String answer;
private String username;
public Answer(int id, String answer, String username) {
	super();
	this.id = id;
	this.answer = answer;
	this.username = username;
}
@Override
public String toString() {
	return "Answer [id=" + id + ", answer=" + answer + ", username=" + username + "]";
}


}
