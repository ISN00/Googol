package googol;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random in = new Random();
        //count for the index of the array
        int random, count = 0;
        //array for not repeating the random number
        int[] singlearray = new int[9];
        int[] multiarray = new int[9];
        //variable for continue the game
        String ans = "Y";
        //gamekey
        char key = 'x', key2 = 'o', win = 'a';
        //check for multiplayer mode
        int num = 0, check = 0;

        System.out.println("                Welcome to Tic Tac Toe");
        while (ans.equalsIgnoreCase("Y")) {
            System.out.println("         (Mode 1: Single)    (Mode 2: Multiplayer)");
            System.out.println("Select the game mode(Click 1 for Mode 1) or (Click 2 for Mode 2): ");
            int gamemode = sc.nextInt();
            while (gamemode != 1 && gamemode != 2) {
                System.err.println("Please enter a valid gamemode");
                System.out.println("Select the game mode(Click 1 for Mode 1) or (Click 2 for Mode 2):");
                gamemode = sc.nextInt();
            }

            //for displaying the number at the position in the gameboard
            char[][] array = {{'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}};

            //code for single player
            if (gamemode == 1) {
                System.out.println("Enter Player's name: ");
                String singlename = sc.next();

                //choosing key
                System.out.println(singlename + " please select X or O: ");
                key = sc.next().charAt(0);

                if (key == 'X' || key == 'x') {
                    key = 'X';

                } else if (key == 'O' || key == 'o') {
                    key = 'O';
                }
                //displaying the game board
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        System.out.print(array[i][j] + "    ");
                    }
                    System.out.println("");
                }
                //       line1                                                       // line2                                                         //line3                                                      // column1                                                         //column2                                                //column3                                                   //diagonal1                                               //diagonal2                                     

                while ((array[0][0] != array[0][1] || array[0][1] != array[0][2]) && (array[1][0] != array[1][1] || array[1][1] != array[1][2]) && (array[2][0] != array[2][1] || array[2][1] != array[2][2]) && (array[0][0] != array[1][0] || array[1][0] != array[2][0]) && (array[0][1] != array[1][1] || array[1][1] != array[2][1]) && (array[0][2] != array[1][2] || array[1][2] != array[2][2]) && (array[0][0] != array[1][1] || array[1][1] != array[2][2]) && (array[2][0] != array[1][1] || array[1][1] != array[0][2])) {
                    System.out.println("\n\n" + singlename + "'s turn\n");
                    System.out.println("Press a number from 1 to 9 to draw your " + key);
                    num = sc.nextInt();

                    while (true) {

                        boolean isInArray = false;
                        for (int i = 0; i < singlearray.length; i++) {
                            if (num == singlearray[i]) {
                                isInArray = true;
                                break;
                            }
                        }
                        if (isInArray) {
                            System.err.println("The number you entered is already been taken");
                            System.out.println("Please enter other number: ");
                            num = sc.nextInt();
                            continue;
                        } else {
                            singlearray[count] = num;
                            count++;
                            break;
                        }
                    }

                    //drawing the key at position selected by user
                    if (key == 'X') {
                        switch (num) {
                            case 1:
                                array[0][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        //to identify the winner
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'X';
                            break;
                        }
                        //COMPUTER'S TURN
                        System.out.println("\n\n Computer's turn\n");

                        //for not repeating the same number
                        while (true) {
                            random = in.nextInt(9);

                            boolean isInArray = false;
                            for (int i = 0; i < singlearray.length; i++) {
                                if (random == singlearray[i]) {
                                    isInArray = true;
                                    break;
                                }
                            }
                            if (isInArray) {
                                continue;
                            } else {
                                singlearray[count] = random;
                                count++;
                                break;
                            }
                        }
                        //drawing key at random position generated by computer
                        switch (random) {
                            case 1:
                                array[0][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        //to identiy winner
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'O';
                            break;

                        }
                        //vice versa if key is O
                    } else if (key == 'O') {
                        switch (num) {
                            case 1:
                                array[0][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'O';
                            break;

                        }
                        //COMPUTER'S TURN
                        System.out.println("\n\n Computer's turn\n");
                        random = in.nextInt(9);
                        //for not repeating the same number
                        while (true) {
                            random = in.nextInt(9);

                            boolean isInArray = false;
                            for (int i = 0; i < singlearray.length; i++) {
                                if (random == singlearray[i]) {
                                    isInArray = true;
                                    break;
                                }
                            }
                            if (isInArray) {
                                continue;
                            } else {
                                singlearray[count] = random;
                                count++;
                                break;
                            }
                        }

                        switch (random) {
                            case 1:
                                array[0][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'X';
                            break;
                        }
                    }
                }
                //to identify the winner
                if (win == key) {
                    System.out.println("Congratulation " + singlename + ". U won");
                } else {
                    System.out.println("Computer won\nBetter luck next time");
                }
            }
            //code for multiplayer mode
            if (gamemode == 2) {
                count = 0;
                System.out.println("Enter Player 1's Name: ");
                String name = sc.next();
                System.out.println("Enter Player 2's Name: ");
                String name2 = sc.next();

                //randomly generating the turn of players
                int dice = in.nextInt(2);

                if (dice == 0) {
                    //asking the player with first turn to select first
                    System.out.println(name + " please select X or O: ");
                    key = sc.next().charAt(0);

                    if (key == 'X' || key == 'x') {
                        key = 'X';
                        key2 = 'O';
                        check = 1;
                    } else if (key == 'O' || key2 == 'o') {
                        key = 'O';
                        key2 = 'X';
                        check = 2;
                    }

                } else if (dice == 1) {
                    //asking the player with first turn to select first
                    System.out.println(name2 + " please select X  or O");
                    key2 = sc.next().charAt(0);

                    if (key2 == 'X' || key2 == 'x') {
                        key2 = 'X';
                        key = 'O';
                        check = 1;
                    } else if (key2 == 'O' || key2 == 'o') {
                        key2 = 'O';
                        key = 'X';
                        check = 2;
                    }
                }

                //displaying the gameboard
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        System.out.print(array[i][j] + "    ");
                    }
                    System.out.println("");
                }
                //       line1                                                       // line2                                                         //line3                                                      // column1                                                         //column2                                                //column3                                                   //diagonal1                                               //diagonal2                                     
                while ((array[0][0] != array[0][1] || array[0][1] != array[0][2]) && (array[1][0] != array[1][1] || array[1][1] != array[1][2]) && (array[2][0] != array[2][1] || array[2][1] != array[2][2]) && (array[0][0] != array[1][0] || array[1][0] != array[2][0]) && (array[0][1] != array[1][1] || array[1][1] != array[2][1]) && (array[0][2] != array[1][2] || array[1][2] != array[2][2]) && (array[0][0] != array[1][1] || array[1][1] != array[2][2]) && (array[2][0] != array[1][1] || array[1][1] != array[0][2])) {
                    //POSIBILITY1 (if first player select x)
                    if (check == 1) {
                        //if player1 start first(to display their name first)
                        if (dice == 0) {
                            System.out.println("\n\n" + name + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your " + key);
                            num = sc.nextInt();

                            while (true) {

                                boolean isInArray = false;
                                for (int i = 0; i < multiarray.length; i++) {
                                    if (num == multiarray[i]) {
                                        isInArray = true;
                                        break;
                                    }
                                }
                                if (isInArray) {
                                    System.err.println("The number you entered is already been taken");
                                    System.out.println("Please enter other number: ");
                                    num = sc.nextInt();
                                    continue;
                                } else {
                                    multiarray[count] = num;
                                    count++;
                                    break;
                                }
                            }
                            //if player2 start first(to display their anme first)
                        } else if (dice == 1) {
                            System.out.println("\n\n" + name2 + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your " + key2);
                            num = sc.nextInt();
                            while (true) {

                                boolean isInArray = false;
                                for (int i = 0; i < multiarray.length; i++) {
                                    if (num == multiarray[i]) {
                                        isInArray = true;
                                        break;
                                    }
                                }
                                if (isInArray) {
                                    System.err.println("The number you entered is already been taken");
                                    System.out.println("Please enter other number: ");
                                    num = sc.nextInt();
                                    continue;
                                } else {
                                    multiarray[count] = num;
                                    count++;
                                    break;
                                }
                            }
                        }
                        //drawing the key
                        switch (num) {
                            case 1:
                                array[0][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        //to identify the winner & stop the game
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'X';
                            break;
                        }
                        //if player2 start first(to display player2's name first)
                        if (dice == 0) {
                            System.out.println("\n\n" + name2 + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your " + key2);
                            num = sc.nextInt();
                            while (true) {

                                boolean isInArray = false;
                                for (int i = 0; i < multiarray.length; i++) {
                                    if (num == multiarray[i]) {
                                        isInArray = true;
                                        break;
                                    }
                                }
                                if (isInArray) {
                                    System.err.println("The number you entered is already been taken");
                                    System.out.println("Please enter other number: ");
                                    num = sc.nextInt();
                                    continue;
                                } else {
                                    multiarray[count] = num;
                                    count++;
                                    break;
                                }
                            }
                        } else if (dice == 1) {
                            System.out.println("\n\n" + name + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your " + key);
                            num = sc.nextInt();
                             while (true) {
                           

                            boolean isInArray = false;
                            for (int i = 0; i < multiarray.length; i++) {
                                if (num == multiarray[i]) {
                                    isInArray = true;
                                    break;
                                }
                            }
                            if (isInArray) {
                                System.err.println("The number you entered is already been taken");
                                System.out.println("Please enter other number: ");
                                num=sc.nextInt();
                                continue;
                            } else {
                                multiarray[count] = num;
                                count++;
                                break;
                            }
                        }
                        }

                        //drawing the key
                        switch (num) {
                            case 1:
                                array[0][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        //to identify the winner & stop the game
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'O';
                            break;

                        }//POSIBILITY2(if first player select o)  
                    } else if (check == 2) {
                        if (dice == 0) {
                            System.out.println("\n\n" + name + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your " + key);
                            num = sc.nextInt();
                            //if player2 start first(to display the name of player2) 
                        } else if (dice == 1) {
                            System.out.println("\n\n" + name2 + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your " + key2);
                            num = sc.nextInt();

                        }
                        //drawing the key on board
                        switch (num) {
                            case 1:
                                array[0][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        //to identify winner & stop the game
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {

                            win = 'O';
                            break;
                        }
                        if (dice == 0) {
                            //to display the name of next player
                            System.out.println("\n\n" + name2 + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your");
                            num = sc.nextInt();
                        } else if (dice == 1) {
                            System.out.println("\n\n" + name + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your");
                            num = sc.nextInt();

                        }
                        //to draw key on board
                        switch (num) {
                            case 1:
                                array[0][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        //to identify winner & stop the game
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'X';
                            break;
                        }
                    }
                }
                //declaring the winner
                if (win == key) {
                    System.out.println(name + " won the game");
                } else if (win == key2) {
                    System.out.println(name2 + " won the game");
                }
            }
            //asking to continue
            System.out.println("Do you want to continue the game?(Y for Yes or N for No): ");
            ans = sc.next();
            //if user enter invalid answer
            while (!ans.equalsIgnoreCase("Y") && !ans.equalsIgnoreCase("N")) {

                System.err.println("Please enter a valid answer");

                System.out.println("Do you want to continue the game?(Y for Yes or N for No): ");
                ans = sc.next();
            }
        }
        System.out.println("Game Over");
    }
}
