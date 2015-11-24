package ctciArray;
public class test{
	public static void main(String[] args){
		/*******************
		 * 1.4
		 * 
		 * 
		 * 
		 *******************/
		String str = "abc def ghi   ";
		replayce r = new replayce();
		char[] arrayStr = str.toCharArray();
		System.out.println(r.replayceString(arrayStr,11));
		
		/**********************
		 * 1.7
		 * 
		 * 
		 * 
		 *********************/
		
		int[][] matrix = {{1,2},{3,4},{5,0}};
		setZeros z = new setZeros();
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++)
				if(j==matrix[0].length-1)
					System.out.println(matrix[i][j]);
				else
					System.out.print(matrix[i][j]+",");
		
		}
		z.zero(matrix);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++)
				if(j==matrix[0].length-1)
					System.out.println(matrix[i][j]);
				else
					System.out.print(matrix[i][j]+",");
		
		}
		//System.out.println(matrix[0]);
		
		
	}
}