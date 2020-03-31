public class DesaturateIt{
	public static void main(String [] args){
		int [][][] rgb = Java101ImageUtil.getRGBArrayFromFile();
		if(rgb==null){return;}
		int [][][] gray = desaturate(rgb);
		Java101ImageUtil.showViewer(rgb,gray,"Desaturate It!");
	}
	public static int [][][] desaturate(int [][][] rgb){
		return null;
	}
}