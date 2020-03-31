public class DesaturateIt{
	public static void main(String [] args){
		int [][][] rgb = Java101ImageUtil.getRGBArrayFromFile();
		if(rgb==null){return;}
		Java101ImageUtil.showViewer(rgb, "Colored");
		int [][][] gray = desaturate(rgb);
		Java101ImageUtil.showViewer(rgb,gray,"Desaturate It!");
	}
	public static int [][][] desaturate(int [][][] rgb){
		// Declare new 3D-array called gray 
		int [][][] gray = new int[rgb.length][rgb[0].length][3];
		
		// Assign values to gray based on grayscale formula
		for(int i = 0; i < gray.length; i++) {
			for(int j = 0; j < gray[i].length; j++) {
				int total = 0;
				for(int k = 0; k < 3; k++) total += rgb[i][j][k];				
				for(int k = 0; k < 3; k++) gray[i][j][k] = total/3;
			}
		}

		// Return the grayscale version
		return gray;
	}
}
