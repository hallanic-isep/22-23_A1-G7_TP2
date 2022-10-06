import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un exercice : \n\n1. Discriminant\n2. Parite d'un nombre\n3. Calcul d'extremum\n"
                + "4. Egalite entre chaines de caracteres\n5. Factorielle\n6. Compte a rebours\n7. Valeurs carres\n8. "
                + "Table de multiplication\n9. Division d'entiers\n10. Regle gradue\n11. Nombres permiers\n12. "
                + "Manipulations d'un tableau\n13. Inversion de tableau\n");

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

            case 13 :
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

        if (a>b) {
            System.out.println("Le maximum est "+a);
        }
        else if(a<b) {
            System.out.println("Le maximum est "+b);
        }

        else {
            System.out.println("Ils sont égaux !");
        }

        System.out.print("Entrez un premier entier : ");
        int c = scanner.nextInt();
        System.out.print("Entrez un second entier : ");
        int d = scanner.nextInt();
        if (c>d) {
            System.out.println("Le min est "+d);
        }
        else if(c<d) {
            System.out.println("Le min "+c);
        }

        else {
            System.out.println("Ils sont égaux !");
        }
    }

    public static void egaliteStr() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez deux chaines de caracteres : ");

        String Chaine1 = scanner.nextLine();
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
        System.out.println("Nombre de x au carre souhaite : ");

        int carre = scanner.nextInt();
        for (int i = 1; i<= carre; i++) {

            System.out.println("x = " +i + "	 x^2 = " + i*i);
        }
    }//end carres



    public static void tableMultipliction() {

        for (int i=1; i<= 10; i++) {
            System.out.print("\n");
            for (int j=1; j<=10; j++) {
                System.out.print(i*j+"\t");
            }

        }

    }//end tableMultiplication

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        float entier1;
        float entier2;
        do {
            System.out.print("Veuillez saisir un entier (numerateur) : ");
            entier1=scanner.nextFloat();
            System.out.print("Veuillez saisir un second entier (denominateur) : ");
            entier2=scanner.nextFloat();
        } while (entier2 == 0);
        float division = entier1/entier2;
        System.out.println("La division de "+entier1+" par "+entier2+" vaut "+division);
    }//end division

    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        int entier1;

        do {
            System.out.print("Saisir un entier strictement positif : ");
            entier1=scanner.nextInt();
        }while (entier1 <=0);

        for(int i=1; i<=entier1;i++) {
            System.out.print("|---------");
        }
        System.out.print("|");
    }//end regle

    public static void nombrePremier() {

        Scanner scanner = new Scanner(System.in);
        int nombre1;

        do {
            System.out.print("Choisir un nombre : ");
            nombre1=scanner.nextInt();

        }while (nombre1<=0);

        if (nombre1 == 0) {
            System.out.println(nombre1 + " n'est pas un nombre premier");
        }
        else if (nombre1 == 1) {
            System.out.println(nombre1 + " n'est pas un nombre premier");
        }
        else if (nombre1 == 2) {
            System.out.println(nombre1 + " est un nombre premier");
        }

        for (int i =2; i<nombre1;) {

            if ( nombre1 % i == 0) {

                System.out.println(nombre1+ " n'est pas un nombre premier");
                break;
            }

            else {

                System.out.println(nombre1 + " est un nombre premier");
                break;
            }
        }

    }//end nombrePremier

    public static void initialisationTableau () {

        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier : ");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }

        System.out.println("\nVotre tableau est le suivant : " +java.util.Arrays.toString(tableau) + "\n");

        int max = 0;

        for ( int i = 0 ; i < tableau.length ; i++) { // Boucle pour trouver le maximum du tableau

            if (max > tableau[i]) {

                max = max;

            }

            else if (max < tableau[i]) {

                max = tableau[i];
            }
        }
        System.out.println("Le maximum du tableau est "+max);

        int min = tableau [0];

        for ( int i = 0 ; i < tableau.length ; i++) { // Boucle pour trouver le maximum du tableau

            if (min > tableau[i]) {

                min = tableau [i];

            }

            else if (min < tableau[i]) {

                min = min;
            }
        }
        System.out.println("Le minimum du tableau est "+min+"\n");

        int somme=0;

        for (int i=0; i<tableau.length;i++) {
            somme = somme + tableau [i];
        }
        System.out.println("La somme des elements du tableau est "+somme+"\n");

        System.out.println("Liste des elements pairs du tableau :\n");

        for (int i=0; i<tableau.length; i++) {
            if (tableau [i]%2==0) {

                System.out.println("L'element "+tableau[i]+" est pair");

            }
        }

        System.out.println("\n");

        for (int i = 0 ; i < tableau.length ; i= i+2) {
            System.out.println("L'element d'indice pair " + i + " vaut " + tableau[i]);
        }
    }//end initialisationTableau
}//public class