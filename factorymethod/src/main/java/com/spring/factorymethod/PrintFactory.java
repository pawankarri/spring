package com.spring.factorymethod;

public class PrintFactory {
public static Printable getPrintable()
{
	return new B();
}
}
