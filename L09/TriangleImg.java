import java.util.Scanner;
public class TriangleImg {
        public static void main(String[] args) {
		// Initialize a new scanner
		Scanner sc = new Scanner(System.in);	

		// Obtains width value from user input
		System.out.print("Input width\n>> ");
		int w = sc.nextInt();

		// Checks if the input width is valid
		if (w < 100 || w > 200) {
			System.out.println("Invalid width. Must be in range 100 to 200.");
			System.exit(0);
		}
	
		// Obtains height value from user input
		System.out.print("Input height\n>> ");
		int h = sc.nextInt();

		// Checks if the input height is valid
		if (h < 100 || h > 200) {
                        System.out.println("Invalid height. Must be in range 100 to 200.");
                        System.exit(0);
                }

		// Declare 3D-array img
        	int[][][] img = new int[w][h][3];
	
		// Declare divider variable
		double div;		

		// Assigns values to the img array
		for(int i = 0; i < img.length; i++) {

			// Checks if the x-position of the pixel is below half
			// Assigns the divider as a ratio of the position times height
			if(i <= w/2) div = h - (double) i/(w/2) * h;
			else div = h - (double) (w-i)/(w/2) * h;
            
                	for(int j = 0; j < img[i].length; j++) {
		     		
				// Checks if y-position is below divider
				if(j >= div) img[i][j] = new int[] {0, 0, 255}; 
			}
		}

		// Calls showViewer on the 3D-array with title "triangle image"
	        Java101ImageUtil.showViewer(img, "triangle image");

      }
}

