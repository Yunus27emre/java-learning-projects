
public class FalanFilan {
	public static void main(String[] args) {
		int w = 9;
        int h = 3;

        for (int r = 0; r < h; r++) {
            if (r == 0 || r == h - 1) {
                System.out.print('*');
                for (int c = 1; c < w - 1; c++) {
                    System.out.print(' ');
                }
                System.out.println('*');
            } else {

                for (int j = 1; j <= h; j++) { // 1st outer loop
                    for (int i = 1; i <= j; i++) { //  Printing - 2nd inner loop
                        if (i == 0 || i == j)
                            System.out.print("\\");
                        else
                            System.out.print(" ");
                    }
                    for (int i = h; i >= j; i--) { // Spaces
                        System.out.print("  ");
                    }
                    for (int i = 1; i <= j; i++) { // Printing - 2nd inner loop
                        if (i == 1 || i == 0)
                        	System.out.print("/");
                        else
                        	System.out.print(" ");
                    }
                    System.out.println('|');
                }

                {
                    for (int space = 0; space <= 2; space++) {
                    	System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int space = 0; space <= 3; space++) {
                    	System.out.print(" ");
                    }
                    System.out.println('|');
                }
                for (int j = 1; j <= h; j++) { // 2nd outer for loop
                    for (int i = h; i >= j; i--) { //  printing - 2nd inner for
                        if (i == 0 || i == j)
                        	System.out.print("/");
                        else
                        	System.out.print(" ");
                    }
                    for (int i = 0; i < j + 1; i++) { // Spaces
                    	System.out.print(" ");
                    }
                    for (int i = 1; i <= h; i++) { //  Printing - 2nd inner loop
                        if (i == 0 || i == j)
                        	System. out.print("\\");
                        else
                        	System.out.print(" ");
                    }
                    System. out.println('|');
                }

            }
        }	}
}
