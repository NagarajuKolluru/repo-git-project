package com.git.UPILitePayment;

public class UPILitePayment
{
public String doPaymentUsingPhonePe(long mobileno,double amount)
	{
		return amount+"Amount payment done through PhonePe";
	}
public String doPaymentUsingGpay(long mobileno,double amount)
{
	return amount+"Amount payment done through Gpay";
}
}
