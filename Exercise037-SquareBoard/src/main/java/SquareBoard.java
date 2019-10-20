
public class SquareBoard {

	public static void print(int size){
		for(int t=1;t<=size;t++){
			for(int s=1;s<size;s++){
				System.out.print("# ");
			}
			System.out.println("#");
		}
	}
}