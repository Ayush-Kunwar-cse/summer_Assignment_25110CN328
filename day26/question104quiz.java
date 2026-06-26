import java.util.Scanner;

public class question104quiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;
        int ans;

        System.out.println("===== QUIZ APPLICATION =====");

        // Question 1
        System.out.println("\n1. Which language is platform independent?");
        System.out.println("1. Java\n2. C\n3. Assembly\n4. HTML");
        ans = sc.nextInt();
        if (ans == 1)
            score++;

        // Question 2
        System.out.println("\n2. Which keyword is used to create an object?");
        System.out.println("1. class\n2. new\n3. this\n4. static");
        ans = sc.nextInt();
        if (ans == 2)
            score++;

        // Question 3
        System.out.println("\n3. Which symbol is used to end a statement in Java?");
        System.out.println("1. :\n2. ;\n3. ,\n4. .");
        ans = sc.nextInt();
        if (ans == 2)
            score++;

        // Question 4
        System.out.println("\n4. Which package contains Scanner class?");
        System.out.println("1. java.io\n2. java.util\n3. java.lang\n4. java.net");
        ans = sc.nextInt();
        if (ans == 2)
            score++;

        // Question 5
        System.out.println("\n5. Which loop executes at least once?");
        System.out.println("1. for\n2. while\n3. do-while\n4. foreach");
        ans = sc.nextInt();
        if (ans == 3)
            score++;

        // Question 6
        System.out.println("\n6. Which method returns the length of a String?");
        System.out.println("1. size()\n2. length()\n3. getLength()\n4. count()");
        ans = sc.nextInt();
        if (ans == 2)
            score++;

        // Question 7
        System.out.println("\n7. Which operator is used for comparison?");
        System.out.println("1. =\n2. ==\n3. +=\n4. :");
        ans = sc.nextInt();
        if (ans == 2)
            score++;

        // Question 8
        System.out.println("\n8. Which class is used to generate random numbers?");
        System.out.println("1. Scanner\n2. Random\n3. Math\n4. String");
        ans = sc.nextInt();
        if (ans == 2)
            score++;

        System.out.println("\n=========================");
        System.out.println("Your Score = " + score + "/8");

        if (score == 8)
            System.out.println("Excellent!");
        else if (score >= 6)
            System.out.println("Very Good!");
        else if (score >= 4)
            System.out.println("Good!");
        else
            System.out.println("Better Luck Next Time!");

        sc.close();
    }
}