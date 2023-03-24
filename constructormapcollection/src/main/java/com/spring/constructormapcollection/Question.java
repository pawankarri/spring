package com.spring.constructormapcollection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
private int id;
private String qname;
private Map<String,String> ans;
public Question(int id, String qname, Map<String, String> ans) {
	super();
	this.id = id;
	this.qname = qname;
	this.ans = ans;
}
public void display() {
System.out.println(id + " "+ qname);
Set <Entry<String,String>> set=ans.entrySet();
Iterator<Entry<String,String>> itr=set.iterator();
while(itr.hasNext())
{
	Entry<String,String> entry=itr.next();
	System.out.println(entry.getKey()+" "+ entry.getValue());
}
}
}
