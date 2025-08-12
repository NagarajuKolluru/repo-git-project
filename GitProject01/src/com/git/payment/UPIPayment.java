package com.git.payment;

public class UPIPayment
{
   public String doPaymentUsingPhonePe(long number,double amount)
   {
	   return amount+"amount payment has been done through"+number+"using Phonepay ";
   }
   public String doPaymentUsingGooglePay(long number,double amount)
   {
	   return amount+"amount payment has been done through"+number+"using Googlepay ";
   }
}

