package nl.yacht.holder;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
        private int day;

        public static void main(String[] args) {

            startShopping();
        }

        private static void startShopping() {
            Winkelwagen winkelwagen;

            // winkelwagen.wagenList.add();
            Product product = new Product();
            Supermarkt supermarkt = new Supermarkt();
            supermarkt.createProductList();
            System.out.println(product.product1.getName());

        }
        private static void addProduct(){


        }

        private static void goToRegister(){


        }

        private static void resetWinkelwagen(){

        }

}
