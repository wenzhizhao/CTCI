package ctciArray;
public class replayce{
	public char[] replayceString(char[] resource,int length){
		int newLength=0,count=0;
//		String str = "";
//		String newStr=str+1;
		for(int i=0;i<length;i++){
			if(resource[i]==' '){
				count++;
			}
		}
		newLength=length+2*count;
		char[] newArray = new char[newLength];
		for(int j=length-1;j>=0;j--){
			if(resource[j]==' '){
				newArray[newLength-1]='0';
				newArray[newLength-2]='2';
				newArray[newLength-3]='%';
				newLength-=3;
			}
			else{
				newArray[newLength-1]=resource[j];
				newLength-=1;
			}
		}
		return newArray;
	}

	
}