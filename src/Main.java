import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Exercices : \n\n" +
                " 1. Discriminant\n" +
                " 2. Parite d'un nombre\n" +
                " 3. Calcul d'extremum\n" +
                " 4. Egalite entre chaines de caracteres\n" +
                " 5. Factorielle\n" +
                " 6. Compte a rebours\n" +
                " 7. Valeurs carres\n" +
                " 8. Table de multiplication\n" +
                " 9. Division d'entiers\n" +
                "10. Regle gradue\n" +
                "11. Nombres permiers\n" +
                "12. Manipulations d'un tableau\n\n" +
                "Votre choix : ");

        int i = scanner.nextInt();

        switch (i) {

            case 1 :
                discriminant ();
                break;

            case 2 :
                parite();
                break;

            case 3 :
                max();
                min();
                break;

            case 4 :
                egaliteStr();
                break;

            case 5 :
                factorielle();
                break;

            case 6 :
                countdown();
                break;

            case 7 :
                carres();
                break;

            case 8 :
                tableMultipliction();
                break;

            case 9 :
                division();
                break;

            case 10 :
                regle();
                break;

            case 11 :
                nombrePremier();
                break;

            case 12 :
                initialisationTableau();
                break;
        }


    }//end main

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        float a = scanner.nextFloat();
        System.out.println("Quelle est la valeur de b ?");
        float b = scanner.nextFloat();
        System.out.println("Quelle est la valeur de c ?");
        float c = scanner.nextFloat();

        float delta = (float) (Math.pow(b,2) - 4 * a * c);

        if (delta < 0) {
            double g = (-b/(2*a));
            double h = (Math.sqrt(-delta))/(2*a);
            double i = -(Math.sqrt(-delta))/(2*a);
            System.out.println("Ce polynome a deux racines complexe, x1 = "+g+" + ("+h+" i) et x2 = "+g+" + ("+i+" i)");
        }
        else if (delta == 0) {
            float d = -b/(2*a);
            System.out.println("Ce polynome a une racine double x = "+d);
        }
        else {
            double e = (-b + Math.sqrt(delta))/(2*a);
            double f = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Ce polynome a deux racines, x1 = "+e+" et x2 = "+f);
        }
    }//end discriminant

    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un entier : ");
        int a = scanner.nextInt();

        if (a%2==0) {
            System.out.println("C'est pair !");
        }
        else {
            System.out.println("C'est impair !");
        }

    }//end parite

    public static void max () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un premier entier : ");
        int a = scanner.nextInt();
        System.out.print("Entrez un second entier : ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Le maximum est " + a);
        } else if (a < b) {
            System.out.println("Le maximum est " + b);
        } else {
            System.out.println("Ils sont égaux !");
        }
    }

    public static void min () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un premier entier : ");
        int c = scanner.nextInt();
        System.out.print("Entrez un second entier : ");
        int d = scanner.nextInt();
        if (c>d) {
            System.out.println("Le minimum est "+d);
        }
        else if(c<d) {
            System.out.println("Le minimum "+c);
        }

        else {
            System.out.println("Ils sont égaux !");
        }
    }

    public static void egaliteStr() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez deux chaines de caracteres :");
        System.out.print("Chaine 1 = ");
        String Chaine1 = scanner.nextLine();
        System.out.print("Chaine 2 = ");
        String Chaine2 = scanner.nextLine();

        boolean test1 = Chaine1.equals(Chaine2);

        if (test1 == true) {

            System.out.println("Les chaines de caracteres sont egales ! ");
        }

        if (test1 == false) {

            System.out.println("Les chaines de caracteres ne sont pas egales ! ");
        }


    }//end egaliteStr

    public static void factorielle() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un entier positif ou nul : ");

        int factorielle = 1;
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);

    }//end factorielle

    public static void countdown() {

        for (int i = 10; i >=0; i=i-1) {
            System.out.println(i);
        }

        System.out.println("BOOM !");
    }//end countdown

    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("valeur de x : ");

        int x = scanner.nextInt();
        System.out.println("x = " + x + "\tx^2 = " + x*x);
    }//end carres



    public static void tableMultipliction() {

        for (int i=1; i<= 10; i++) {
            System.out.print("\n");
            for (int j=1; j<=10; j++) {
                System.out.print(i*j+"\t");
                // avec "printf" (affichage formaté) : System.out.printf("%3d\t", i*j);
            }
        }

    }//end tableMultiplication

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        int entier1;
        int entier2;
        do {
            System.out.print("Veuillez saisir un entier (numerateur) : ");
            entier1=scanner.nextInt();
            System.out.print("Veuillez saisir un second entier (denominateur) : ");
            entier2=scanner.nextInt();
        } while (entier2 == 0);
        int division = entier1/entier2;
        System.out.println("La division de "+entier1+" par "+entier2+" vaut "+division);
    }//end division

    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        int entier;

        do {
            System.out.print("Saisir un entier strictement positif : ");
            entier=scanner.nextInt();
        }while (entier <=0);

        for(int i=0; i<=entier; i++) {
            if (i % 10 == 0) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
    }//end regle

    public static void nombrePremier() {

        Scanner scanner = new Scanner(System.in);
        int nombre;

        do {
            System.out.print("Choisir un nombre : ");
            nombre=scanner.nextInt();

        }while (nombre<=0);

        if (nombre <= 2) {
            System.out.println(nombre + " est un nombre premier");
        } else {
            for (int i = 2; i < nombre; i++) {

                if (nombre % i == 0) {

                    System.out.println(nombre + " n'est pas un nombre premier");
                    return;
                }
            }
            System.out.println(nombre + " est un nombre premier");
        }

    }//end nombrePremier

    public static void initialisationTableau () {

        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("[" + i + "] Saisir un entier : ");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }

        System.out.println("\nVotre tableau est le suivant : " +java.util.Arrays.toString(tableau) + "\n");

        int max = 0;

        // Boucle pour trouver le maximum du tableau
        for ( int i = 0 ; i < tableau.length ; i++) {

            if (max < tableau[i]) {

                max = tableau[i];
            }
        }
        System.out.println("Le maximum du tableau est "+max);

        int min = tableau [0];

        // Boucle pour trouver le minimum du tableau
        for ( int i = 0 ; i < tableau.length ; i++) {

            if (min > tableau[i]) {

                min = tableau [i];

            }
        }
        System.out.println("Le minimum du tableau est "+min+"\n");

        int somme=0;

        for (int i=0; i<tableau.length;i++) {
            somme = somme + tableau [i];
        }
        System.out.println("La somme des elements du tableau est "+somme+"\n");

        System.out.println("Liste des elements pairs du tableau :");

        for (int i=0; i<tableau.length; i++) {
            if (tableau [i]%2==0) {

                System.out.print(tableau[i]+" ");

            }
        }

        System.out.println("\n");

        for (int i = 0 ; i < tableau.length ; i= i+2) {
            System.out.println("L'element d'indice pair " + i + " vaut " + tableau[i]);
        }

        inverseTableau(tableau);
        System.out.println("\nLe tableau inverse : " +java.util.Arrays.toString(tableau) + "\n");
    }//end initialisationTableau

    public static void inverseTableau(int[] tab) {
        for (int i=0; i < tab.length / 2; i++) {
            int swap = tab[i];
            tab[i] = tab[ tab.length - i - 1 ];
            tab[ tab.length - i - 1 ] = swap;
        }
    }
}//public class