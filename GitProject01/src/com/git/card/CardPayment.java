package com.git.card;

public class CardPayment
{
	public String paymentUsingCreditCard(long cardno,double amount)
	{
		return amount+"amount payment done using Credit card";
	}
	public String paymentUsingDebitCard(long cardno,double amount)
	{
		return amount+"amount payment done using Debit card";
	}
	public String paymentUsingGiftCard(long cardno,double amount)
	{
		return amount+"amount payment done using Gift card";
	}
}
