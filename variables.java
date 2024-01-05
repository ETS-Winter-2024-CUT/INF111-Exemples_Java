public class variables {

        public static void main(String[] args){

            int x = 123;
            double y = 3.14;
            boolean z = true;
            char symbol = '@';
            String name = "Hugh";

            System.out.println("Hello " + name); 
            System.out.println(symbol);
            /*
             * Une difference entre "c" et "java":
             * En C, simplement printf();
             * En Java, System.out.printf();
             * 
             * Ici le System.out.println(); (print line), est utiliser pour affichier une
             * ligne suivie d'un saut de ligne
             * Il permet aussi le formatage " +variable", ou println(variable) qui peux simplifier l'ecriture,
             * quoi que l'ecriture habituelle du C est tout aussi valable
             */ 
        } 
}

             /* int x;      declariation
             *  x = 123;    initialization
             * 
             * int y = 123; declaration + initialization
             * 
             * int age = 21;            interger
             * float gpa = 2.05;        floating point number
             * char grade = 'C';        single character
             * char name[] = "Jhon";    array of characters
             * 
             * printf("Hello %s\n",name);
             * printf("You are %d years old\n", age);
             * printf("Your average grade is %c\n", grade);
             * printf("Your gpa is %f\n",gpa);
             * 
             * char a = 'C';        single charachter %c
             * char b[] = "Jhon";   array of charachters %s
             * 
             * float c = 3.141592;             4 bytes (32 bits of precision) 6-7 digits   %f
             * double d = 3.141592653589793;   8 bytes (64 bits of precision) 15-16 digits %lf
             * 
             * bool e = true;                  1 byte (true or false) %d
             * 
             * char f = 100;                   1 byte (-128 to +127) %d or %c
             * unsigned char g = 255;          1 byte (0 to +255) %d or %c
             *
             * short h = 32767;                2 bytes (-32,768 to _32,767) %d
             * unsigned short i = 65535;       2 bytes (0 to +65,535) %d
             * 
             * int j = 2147483647;             4 bytes (-2,147,438,648 to + +2,147,438,647) %d
             * unsigned int k = 4294967295;    4 bytes (0 to +4,294,967,295) %u
             * 
             * long long int l = 9223372036854775807;             8 bytes (-9 quintillion to +9 quintillions) %lld
             * unsigned long long int m = 18446744073709551615U;  8 bytes (0 to +18 quintillion) %llu
             */