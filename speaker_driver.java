package chapter_10;

public class speaker_driver {

	public static void main (String[] args)
	{
		
		Senator Senator = new Senator();
		
		preacher preacher = new preacher();
		
		Attorney Attorney = new Attorney();
		
		Senator.speak();
		
		Senator.announce("My announcement is I am the new US senator for the state of kentucky.");
		
		preacher.speak();
		
		preacher.announce("My announcement is that we have free bibles at church.");
		
		Attorney.speak();
		
		Attorney.announce("My announcement is I passed my bar exam I am now an attorney");
		
		
		
	}
}
