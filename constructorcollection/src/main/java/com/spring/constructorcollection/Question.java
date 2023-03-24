package com.spring.constructorcollection;

import java.util.Iterator;
import java.util.List;

public class Question {
private int no;
private String ques;
private List<String> answer;
public Question(int no, String ques, List<String> answer) {
	super();
	this.no = no;
	this.ques = ques;
	this.answer = answer;
}
public void display()
{
	System.out.println(no+" "+ques);
	Iterator<String> itr=answer.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
