public class TableTennisScore {
	public String whoWon(String score) {
		String toReturn = "";
		
		String first = "";
		String second = "";
		
		int firstScore = 0;
		int secoundScore = 0;
		
		String [] arrayOfScore = score.split(" ");
		if(arrayOfScore.length > 2){
			first = arrayOfScore[0];
			second = arrayOfScore[1];
			
			for (int i = 2; i < arrayOfScore.length; i++) {
				String tmp = arrayOfScore[i];
				String [] scores = tmp.split(":");
				int firstScoreTmp = Integer.parseInt(scores[0]);
				int secoundScoreTmp = Integer.parseInt(scores[1]);
				
				if(firstScoreTmp > secoundScoreTmp){
					firstScore++ ;
				}else{
					secoundScore++;
				}
			}
			
			if(firstScore > secoundScore){
				return first + " " + firstScore + ":" + secoundScore;
			}else if(secoundScore > firstScore){
				return second + " " + secoundScore + ":" + firstScore;
			}else{
				return "equals";
			}
		}
		
		
		return "";
	}
}