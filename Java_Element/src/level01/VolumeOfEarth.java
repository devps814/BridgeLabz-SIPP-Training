package level01;

public class VolumeOfEarth {
	public static void main(String[] args) {
		int r = 6378 ;
		double volofsphere = (4/3) * 3.14 * r*r*r;
		double earthkm = volofsphere;
		double earthmiles = 1.6 * earthkm;
		System.out.println("The volume of earth in cubic kilometers is " + earthkm + "and cubic miles is " + earthmiles);
	}
}
