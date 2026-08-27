package com.tnsif.Abstraction;

abstract class hairstyle
{
	abstract void bridal(String accessories);
}
class frenchbride extends hairstyle
{

	@Override
	void bridal(String accessories) {
		// TODO Auto-generated method stub
		String extension="Mid-width";
		System.out.println("extension:"+ extension);
	}
	
}

class OpenHair extends hairstyle{

	@Override
	void bridal(String accessories) {
		// TODO Auto-generated method stub
		String chips="u-pins";
		System.out.println("chips:"+chips);
	}
	
}
public class CompressionApp {
	public static void main(String[] args) {
		System.out.println("accessories are :");
		frenchbride f= new frenchbride();
		f.bridal("setting spray");
		OpenHair o= new OpenHair();
		o.bridal("setting spray");
	}

}
