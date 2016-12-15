public class PrimeFactors {
	public String primeFactors(int n) {
		
		int temp = n;
		String toReturn = "";
		int deminator = 2;
		while(temp!=0 && deminator<=temp){
			if(temp%deminator == 0){
				if(toReturn != ""){
					toReturn += ",";
				}
				toReturn += deminator;
				temp/=deminator;
			}else{
				deminator++;
			}
		}
		
		return toReturn;
	}
}