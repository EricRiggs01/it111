public class litersToGallons {
    public static void main(String[] args) {

        float gal, lit;
        for(gal = 1; gal <= 100; gal = gal +4) {
            lit = (gal * 3.78f);

            System.out.printf("%.2f", lit);
            if (gal == 1) {
                System.out.print(" Liter = " + gal + " Gallon\n");
            } else {
                System.out.print(" Liters = " + gal + " Gallons\n");
            }

            if (gal % 20 == 17) {
                System.out.println();
                // Print a blank line
            }

        } // end for loop
        System.out.println("We are done!!!");
    }
}

