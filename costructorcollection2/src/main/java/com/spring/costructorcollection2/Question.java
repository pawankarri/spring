package com.spring.costructorcollection2;

import java.util.Iterator;
import java.util.List;

public class Question {
private int qno;
private String qname;
private List<Answer> ans;
public Question(int qno, String qname, List<Answer> ans) {
	super();
	this.qno = qno;
	this.qname = qname;
	this.ans = ans;
}
public void display()
{
	System.out.println(qno+" "+qname);
Iterator<Answer> itr=ans.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}
}
