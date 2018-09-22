package java_dome07;

import java_dome06.Generator;

public class CountingGenerator {
	
	public static class Boolean implements Generator<java.lang.Boolean>{
		private java.lang.Boolean value = false;
		public java.lang.Boolean next(){
			value = !value;
			return value;
		}
	}
	
	public static class Byte implements Generator<java.lang.Byte>{

		private java.lang.Byte value = 0 ;
		@Override
		public java.lang.Byte next() {
			// TODO Auto-generated method stub
			return value;
		}
	}
	
	static char[] chars= ("qwertyuiop").toCharArray();
	
	public static class Character implements Generator<java.lang.Character>{
		int index = - 1 ;
		public java.lang.Character next() {
			index = (index + 1) % chars.length;
			return chars[index];
		}
	}
	
	public static class String implements Generator<java.lang.String> {

		private int length = 7 ;
		Generator<java.lang.Character> cg = new Character();
		public String() {}
		public String(int length) {
			this.length = length;
		}
		@Override
		public java.lang.String next() {
			// TODO Auto-generated method stub
			char[] buf = new char[length];
			for(int i = 0 ; i < length ; i++)
				buf[i] = cg.next();
			return new java.lang.String(buf);
		}
	
	}
	
	public static class Short implements Generator<java.lang.Short> {
		private short vlaue = 0;
		public java.lang.Short next() {
			return vlaue++;
		}
	}
	
	public static class Integer implements Generator<java.lang.Integer> {
		private int vlaue = 0 ;
		public java.lang.Integer next() {
			return vlaue++ ;
		}
	}
	
	public static class Long implements Generator<java.lang.Long> {
		private long vlaue = 0 ;
		public java.lang.Long next() {
			return vlaue++;
		}
	}
	
	public static class Float implements Generator<java.lang.Float> {
		private float value = 0 ;
		public java.lang.Float next() {
			float value1 = value;
			value += 1.0;
			return value1;
		}
	}
	
	public static class Double implements Generator<java.lang.Double> {
		private double value = 0 ;
		public java.lang.Double next() {
			double value1 = value;
			value += 1.0;
			return value1;
		}
		
	}

}





