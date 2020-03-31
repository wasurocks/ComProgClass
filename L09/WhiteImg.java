public class WhiteImg {
	public static void main(String[] args) {
		// Declaring a 3D array called white
		int[][][] white = new int[64][128][3];
		
		// Assigning all-white pixels for the white array 
		for(int i = 0; i < white.length; i++) {
			for(int j = 0; j < white[i].length; j++) {
				
				// Sets each R,G,B value to 255 
				for(int k = 0; k < 3; k++) white[i][j][k] = 255;
			}
		}
	
		// Calls showViewer on the 3D-array with title "white image"
		Java101ImageUtil.showViewer(white, "white image");
	}
}

