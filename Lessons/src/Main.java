import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("press anything");
        String str = scanner.nextLine();
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String text = words[i];
            char[] word = text.toCharArray();


            //Variable to be used when exchanging elements
            char revers;

            char[] massivLetter = new char[]{'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m','Q','W',
                    'E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
            int n = word.length;

            for (int j = 0; j <= n / 2; j++) {

                for (int u = 0; u < massivLetter.length; u++) {
                    int score1 = 0;
                    if (word[j] != massivLetter[u]) {
                        System.out.println("1");
                        continue;
                    } else if (word[j] == massivLetter[u]) {
                        System.out.println("2");
                        continue;
                    }else if (score1 == 104) {

                        System.out.println(score1);
                        j++;
                        break;
                    }
                }
                for (int y = 0; y < massivLetter.length; y++) {
                    if (word[n - j - 1] != massivLetter[y]) {
                        n--;
                        System.out.println("3");
                        continue;
                    } else if (word[n - j - 1] == massivLetter[y]) {
                        System.out.println("4");
                        break;
                    }
                }
                revers = word[n - j - 1];
                word[n - j - 1] = word[j];
                word[j] = revers;
            }
            text = text.copyValueOf(word);
            System.out.println(text);
        }
    }


}
/*

          System.out.println("press anything");
            String str = scanner.nextLine();
            String[] words = str.split(" ");

                for (int i = 0; i < words.length; i++) {
                    String text = words[i];
                    char[] word = text.toCharArray();
                    int n = word.length;

                    //Variable to be used when exchanging elements
                    char revers;
                    for (int j = 0; j <= n / 2; j++) {
for (int u = 0; u < massivLetter.length; u++) {
                    if(word[j] == massivLetter[u] & word[n - j - 1] == massivLetter[u]){
                        break;
                    }else if (word[j] != massivLetter[u]) {
                        j++;
                    }else if (word[n - j - 1] != massivLetter[u]) {
                        n--;
                    }

                        revers = word[n - j - 1];
                        word[n - j - 1] = word[j];
                        word[j] = revers;
                    }
                    text = text.copyValueOf(word);
                    System.out.println(text);
                }
            }
        }
*/









// public static int getInt(){
//   System.out.println("Введите число:");
          /*  int num;
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                scanner.next();//рекурсия
                num = getInt();
            }
            return num;
        }

    Scanner scanner = new Scanner(System.in);
    text = scanner.nextLine();
    char[] word = text.toCharArray();
    int n = word.length;
        for (int i = n-1; i >=0 ; i--) {

    }
}


}



static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
        }

public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
        num = scanner.nextInt();
        } else {
        System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
        scanner.next();//рекурсия
        num = getInt();
        }
        return num;
        }

public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
        operation = scanner.next().charAt(0);
        } else {
        System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
        scanner.next();//рекурсия
        operation = getOperation();
        }
        return operation;\
        }
    }
}*/
