import java.util.Scanner;

public class Quizapp {
    public static void main(String[] args) {
        System.out.println("Answer The Following Questions");

        questions_answers questions = new questions_answers();
        Scanner sc = new Scanner(System.in);
        char ans;
        int correct = 0;
        int wrong = 0;

        questions.question1();
        ans = sc.next().charAt(0);
        if (ans == questions.answer1) {
            correct++;
        } else {
            wrong++;
        }
        questions.question2();
        ans = sc.next().charAt(0);
        if (ans == questions.answer2) {
            correct++;
        } else {
            wrong++;
        }
        questions.question3();
        ans = sc.next().charAt(0);
        if (ans == questions.answer3) {
            correct++;
        } else {
            wrong++;
        }
        questions.question4();
        ans = sc.next().charAt(0);
        if (ans == questions.answer4) {
            correct++;
        } else {
            wrong++;
        }
        questions.question5();
        ans = sc.next().charAt(0);
        if (ans == questions.answer5) {
            correct++;
        } else {
            wrong++;
        }
        questions.question6();
        ans = sc.next().charAt(0);
        if (ans == questions.answer6) {
            correct++;
        } else {
            wrong++;
        }
        questions.question7();
        ans = sc.next().charAt(0);
        if (ans == questions.answer7) {
            correct++;
        } else {
            wrong++;
        }
        questions.question8();
        ans = sc.next().charAt(0);
        if (ans == questions.answer8) {
            correct++;
        } else {
            wrong++;
        }
        questions.question9();
        ans = sc.next().charAt(0);
        if (ans == questions.answer9) {
            correct++;
        } else {
            wrong++;
        }
        questions.question10();
        ans = sc.next().charAt(0);
        if (ans == questions.answer10) {
            correct++;
        } else {
            wrong++;
        }

        double correct_double = correct;
        double percentage = (correct_double / 10) * 100;

        System.out.println("The total marks are : 100");
        System.out.println("You marks are : " + correct * 10);
        System.out.println("Total questions are : 10");
        System.out.println("Your correct answers are : " + correct + "\nYour Wrong answers are : " + wrong);
        System.out.println("Your Percentage is : " + percentage + "%");
    }
}

class questions_answers {
    void question1() {
        System.out.println("Q1. Which of the following option leads to the portability and security of Java?\r\n" +
                "A) Bytecode is executed by JVM\r\n" +
                "B) The applet makes the Java code secure and portable\r\n" +
                "C) Use of exception handling\r\n" +
                "D) Dynamic binding between objects");
    }

    void question2() {
        System.out.println("Q2. Which of the following is not a Java features?\r\n" +
                "A) Dynamic\r\n" +
                "B) Architecture Neutral\r\n" +
                "C) Use of pointers\r\n" +
                "D) Object-oriented");
    }

    void question3() {
        System.out.println("Q3. _____ is used to find and fix bugs in the Java programs?\r\n" +
                "A) JVM\r\n" +
                "B) JRE\r\n" +
                "C) JDK\r\n" +
                "D) JDB");
    }

    void question4() {
        System.out.println("Q4. What is the return type of the hashCode() method in the Object class?\r\n" +
                "A) Object\r\n" +
                "B) int\r\n" +
                "C) long\r\n" +
                "D) void");
    }

    void question5() {
        System.out.println("Q5. What does the expression float a = 35 / 0 return?\r\n" +
                "A) 0\r\n" +
                "B) Not a Number\r\n" +
                "C) Infinity\r\n" +
                "D) Run time exception");
    }

    void question6() {
        System.out.println("Q6. Which of the following for loop declaration is not valid?\r\n" +
                "A) for ( int i = 99; i >= 0; i / 9 )\r\n" +
                "B) for ( int i = 7; i <= 77; i += 7 )\r\n" +
                "C) for ( int i = 20; i >= 2; - -i )\r\n" +
                "D) for ( int i = 2; i <= 20; i = 2* i )");
    }

    void question7() {
        System.out.println(
                "Q7. Which method of the Class.class is used to determine the name of a class represented by the class object as a String?\r\n"
                        +
                        "A) getClass()\r\n" +
                        "B) intern()\r\n" +
                        "C) getName()\r\n" +
                        "D) toString()");
    }

    void question8() {
        System.out.println(
                "Q8. In which process, a local variable has the same name as one of the instance variables?\r\n" +
                        "A) Serialization\r\n" +
                        "B) Variable Shadowing\r\n" +
                        "C) Abstraction\r\n" +
                        "D) Multi-threading");
    }

    void question9() {
        System.out.println("Q9. Which package contains the Random class?\r\n" +
                "A) java.util package\r\n" +
                "B) java.lang package\r\n" +
                "C) java.awt package\r\n" +
                "D) java.io package");
    }

    void question10() {
        System.out.println("Q10. An interface with no fields or methods is known as a ______?\r\n" +
                "A) Runnable Interface\r\n" +
                "B) Marker Interface\r\n" +
                "C) Abstract Interface\r\n" +
                "D) CharSequence Interface");
    }

    char answer1 = 'a';
    char answer2 = 'c';
    char answer3 = 'd';
    char answer4 = 'b';
    char answer5 = 'c';
    char answer6 = 'a';
    char answer7 = 'c';
    char answer8 = 'b';
    char answer9 = 'a';
    char answer10 = 'b';
}