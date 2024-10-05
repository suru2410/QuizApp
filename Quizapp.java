import java.util.Scanner;

public class Quizapp {
    public static void main(String[] args) {
        questions_answers questions = new questions_answers();
        questions_answers answers = new questions_answers();
        Scanner input = new Scanner(System.in);
        char ans;
        int correct = 0, wrong = 0;
        questions.question1();
        ans = input.next().charAt(0);
        if (ans == answers.answer1) {
            correct++;
        } else
            wrong++;
        questions.question2();
        ans = input.next().charAt(0);
        if (ans == answers.answer2) {
            correct++;
        } else
            wrong++;
        questions.question3();
        ans = input.next().charAt(0);
        if (ans == answers.answer3) {
            correct++;
        } else
            wrong++;
        questions.question4();
        ans = input.next().charAt(0);
        if (ans == answers.answer4) {
            correct++;
        } else
            wrong++;
        questions.question5();
        ans = input.next().charAt(0);
        if (ans == answers.answer5) {
            correct++;
        } else
            wrong++;
        questions.question6();
        ans = input.next().charAt(0);
        if (ans == answers.answer6) {
            correct++;
        } else
            wrong++;
        questions.question7();
        ans = input.next().charAt(0);
        if (ans == answers.answer7) {
            correct++;
        } else
            wrong++;
        questions.question8();
        ans = input.next().charAt(0);
        if (ans == answers.answer8) {
            correct++;
        } else
            wrong++;
        questions.question9();
        ans = input.next().charAt(0);
        if (ans == answers.answer9) {
            correct++;
        } else
            wrong++;
        questions.question10();
        ans = input.next().charAt(0);
        if (ans == answers.answer10) {
            correct++;
        } else
            wrong++;

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
        System.out.println("Q1 What is the orange part of an egg called?\r\n" + //
                "A) Yolk\r\n" + //
                "B) Shell\r\n" + //
                "C) Albumen\r\n" + //
                "D) Chalaza");
    }

    void question2() {
        System.out.println("Q2 How many legs do insects have?\r\n" + //
                "A) Four\r\n" + //
                "B) Six\r\n" + //
                "C) Eight\r\n" + //
                "D) Ten");
    }

    void question3() {
        System.out.println("Q3 What is a baby kangaroo called?\r\n" + //
                "A) Cub\r\n" + //
                "B) Pup\r\n" + //
                "C) Joey\r\n" + //
                "D) Calf");
    }

    void question4() {
        System.out.println("Q4 What is the closest planet to the Sun?\r\n" + //
                "A) Venus\r\n" + //
                "B) Mars\r\n" + //
                "C) Mercury\r\n" + //
                "D) Earth");
    }

    void question5() {
        System.out.println("Q5In which country can you find the Eiffel Tower?\r\n" + //
                "A) Italy\r\n" + //
                "B) Spain\r\n" + //
                "C) France\r\n" + //
                "D) Germany");
    }

    void question6() {
        System.out.println("Q6 How many days are there in a year?\r\n" + //
                "A) 365\r\n" + //
                "B) 366\r\n" + //
                "C) 360\r\n" + //
                "D) 364");
    }

    void question7() {
        System.out.println("Q7 How many players are in a soccer team?\r\n" + //
                "A) Nine\r\n" + //
                "B) Eleven\r\n" + //
                "C) Ten\r\n" + //
                "D) Twelve");
    }

    void question8() {
        System.out.println("Q8 Where do polar bears live?\r\n" + //
                "A) Antarctica\r\n" + //
                "B) The Arctic\r\n" + //
                "C) Greenland\r\n" + //
                "D) Iceland");
    }

    void question9() {
        System.out.println("Q9 Which is faster, light or sound?\r\n" + //
                "A) Light\r\n" + //
                "B) Sound");
    }

    void question10() {
        System.out.println("Q10 How many letters are in the English alphabet?\r\n" + //
                "A) Twenty-four\r\n" + //
                "B) Twenty-five\r\n" + //
                "C) Twenty-six\r\n" + //
                "D) Twenty-seven");
    }

    // key
    char answer1 = 'a';
    char answer2 = 'b';
    char answer3 = 'c';
    char answer4 = 'c';
    char answer5 = 'd';
    char answer6 = 'a';
    char answer7 = 'b';
    char answer8 = 'b';
    char answer9 = 'a';
    char answer10 = 'c';

}