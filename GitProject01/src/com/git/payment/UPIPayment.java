package com.git.payment;

public class UPIPayment
{
   public String doPaymentUsingPhonePe(long number,double amount)
   {
	   return amount+"amount payment has been done through"+number+"using PhonePe ";
   }
   public String doPaymentUsingGPay(long number,double amount)
   {
	   return amount+"amount payment has been done through"+number+"using GPay ";
   }
   public String doPaymentUsingAmazonPay(long number,double amount)
   {
	   return amount+" Amount payment has been done through "+number+"Using Amazon Pay";
   }
   
  
}

