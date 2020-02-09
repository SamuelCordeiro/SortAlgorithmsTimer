package resources;

import java.util.Random;

public class VectorFactory {

	static Random generator = new Random();

	public static Integer[] integerVectorFactory(int size) {
		Integer integerVector[] = new Integer[size];
		for(int i = 0; i < integerVector.length; i++) {
			integerVector[i] = generator.nextInt();
		}
		return integerVector;
	}
	
	public static Double[] doubleVectorFactory(int size) {
		Double doubleVector[] = new Double[size];
		for(int i = 0; i < doubleVector.length; i++) {
			doubleVector[i] = generator.nextDouble();
		}
		return doubleVector;
	}
	
	public static String[] stringVectorFactory(int size) {
		String stringVector[] = new String[size];
		String letters = "0123456789ABCDEFGHIJKLMNOPQRSTUVYWXZ";
		for(int i = 0; i < stringVector.length; i++) {
			int parameter = generator.nextInt(35);
			stringVector[i] = letters.substring((parameter/ 2), parameter);
		}
		return stringVector;
	}
	
	public static Character[] characterVectorFactory(int size) {
		Character stringVector[] = new Character[size];
		String letters = "0123456789ABCDEFGHIJKLMNOPQRSTUVYWXZ";
		for(int i = 0; i < stringVector.length; i++) {
			stringVector[i] = letters.charAt(generator.nextInt(35));
		}
		return stringVector;
	}
}
