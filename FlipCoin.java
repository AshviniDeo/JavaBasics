
public class FlipCoin {

	public static void main(String[] args) {
		int head = 0;
		int tail = 0;
	for (int i = 0; i<=10; i++) {
	int check =(int)Math.floor(Math.random() * 2);
	if (check == 0 ) {
		head = head + 1;
	}
	else
	{
		tail = tail + 1 ;
	}
	
	}
	System.out.println("Percentage of Head :" + head);
	System.out.println("Percentage of Tail :" + tail);
	}

}
