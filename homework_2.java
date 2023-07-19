package Homework2;

public class homework_2 {
    public static void main(String[] args) {
        String dogName="Bugsy";
        String ownerName="Silviya";
        System.out.println(dogName);
                System.out.println(ownerName);
                int result= dogName.compareTo(ownerName);
                if (result<0)
                    System.out.println( dogName +" " + "is less than" +" " + ownerName);
                    else if(result==0)
                        System.out.println(dogName +" "+ "is equal to" +" " + ownerName);
                    else
                        System.out.println( dogName + " " + "is greater than" + " " + ownerName);


        String words = "Yorkies are the best breed for a family!";
        int countWords = words.split( "\\s").length;
        System.out.println("This string has " + countWords +" "+ "words");
        System.out.println(words + " " + " And the name of my yorkie is " + " " + dogName);






    }
}
