package com.company;

public class IdentityCardTest {
    public static void main(String[] args) {
        IdentityCard clientCard = new IdentityCard();
        clientCard.number = 1234;
        clientCard.date = "08/11/1996";
        clientCard.gender = "Male";
        clientCard.name = "John Hawing";

        System.out.println("\nClient info:");
        System.out.println("ID number: " + clientCard.number);
        System.out.println("Date of Birth: " + clientCard.date);
        System.out.println("Gender: " + clientCard.gender);
        System.out.println("Name: " + clientCard.name);

        IdentityCard myCard = new IdentityCard();
        myCard.number = 1111;
        myCard.date = "11/02/2000";
        myCard.gender = "Male";
        myCard.name = "Vladislav Butok";

        System.out.println("\nMy info:");
        System.out.println("ID number: " + myCard.number);
        System.out.println("Date of Birth: " + myCard.date);
        System.out.println("Gender: " + myCard.gender);
        System.out.println("Name: " + myCard.name);

        IdentityCard customerCard = new IdentityCard();
        customerCard.number = 4444;
        customerCard.date = "16/04/1986";
        customerCard.gender = "Male";
        customerCard.name = "Tom Ford";

        System.out.println("\nCustomer info:");
        System.out.println("ID number: " + customerCard.number);
        System.out.println("Date of Birth: " + customerCard.date);
        System.out.println("Gender: " + customerCard.gender);
        System.out.println("Name: " + customerCard.name);

    }
}
