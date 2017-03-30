
public class Predst {

	public static void main(String[] args) {
	  int[][] graphNeorint = new int[][] {
			  new int[] {3, 4},
			  new int[] {5},
			  new int[] {1,5},
			  new int[] {1},
			  new int[] {2,3}  }
;
	
		int[][] toMake = graphNeorint;
		int[][] res = new int[5][5];
		
		System.out.print("\t  Матриця суміжності");
		
		for(int i=0; i<toMake.length; i++){
			for(int j=0; j<toMake[i].length; j++){
					int numb = toMake[i][j];
					res[i][numb-1]=1;
			}
		}
		
		for(int i=0; i<toMake.length; i++){
			System.out.println();
			for(int j=0; j<5; j++){
					System.out.print(res[i][j]+"\t");
			}
		}
	}

}

