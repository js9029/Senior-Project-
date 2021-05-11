package com.example.myapplication;

import android.graphics.Typeface;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Locale;

public class Subscriptions {

    private String Name;
    private String Description;
    private BigDecimal Amount;
    private String AmountString;
    private int Billing;
    private long BillingDate;
    private int ReminderID;
    private int SubscriptionType;

    public enum BillingCycle{
        WEEKLY(0), MONTHLY(1), QUARTERLY(2), YEARLY(3);
        public int value;
        BillingCycle(int value){
            this.value = value;
        }
    }

    public enum Reminder{
        NEVER(0), ONE_DAY(1), TWO_DAYS(2), ONE_WEEK(3), TWO_WEEKS(4), ONE_MONTH(5);
        public int value;
        Reminder(int value){
            this.value = value;
        }
    }

    public Subscriptions(String name, String description, BigDecimal amount, String amountString, int billing, long billingDate, int reminderID, int subscriptionType, BillingCycle billingCycle, Reminder reminder) {
        Name = name;
        Description = description;
        Amount = amount;
        AmountString = amountString;
        Billing = billingCycle.value;
        BillingDate = billingDate;
        ReminderID  = reminder.value;
        SubscriptionType = subscriptionType;
    }

    public String getName(){
        return Name;
    }

    public String getDescription(){
        return Description;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public String getAmountString() {
        return AmountString;
    }

    public int getBilling() {
        return Billing;
    }

    public long getBillingDate() {
        return BillingDate;
    }

    public int getReminderID() {
        return ReminderID;
    }

    public int getSubscriptionType() {
        return SubscriptionType;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setAmount(BigDecimal amount) {
        Amount = amount;
    }

    public void setBilling(int billing) {
        Billing = billing;
    }

    public void setBillingDate(long billingDate) {
        BillingDate = billingDate;
    }

    public void setReminderID(int reminderID) {
        ReminderID = reminderID;
    }
}
