package HW4;
import java.util.*;
public class Player {
 private String name;
 private int chips;
 private int bet=0;
 private ArrayList<Card> oneRoundCard=new ArrayList();
 
 public Player(String name,int chips){
 this.name=name;
 this.chips=chips;
 }
 public String get_name(){
	 return name;
 }
 public int make_bet(){
	 if(bet>chips){
		 System.out.print("You don't have enough money to use");
		 return bet;
	 }
	 else
		 bet=1;
	 return bet;
 }
 public void setOneRoundCard(ArrayList<Card>cards){
	 oneRoundCard=cards;
 }
 public boolean hit_me(){
	 if(getTotalValue()<17){
		 return true;
	 }
	 else
		 return false;
 }
 public int getTotalValue(){
	 int all=0,a=0,personhead=10;
	 for(int i=0;i<oneRoundCard.size();i++){
		 if(oneRoundCard.get(i).getRank()==1)
			 a++;
		 if(oneRoundCard.get(i).getRank()>10){
			all+=personhead;
		}
		 else 
			 all+=oneRoundCard.get(i).getRank();
	 } 
	 if(a==1){
		 if(all<11){
			 a=11;
			 all+=a;
		 }
		 else if(a>1){
			 a=a-1;
			 all=all+a;
			 if(all<11){
				 all+=11;				 
			 }
			 else
				 all+=1;
		 }
			 
		 }
	 return all;
 }
 public int get_current_chips(){
	 return chips;
 }
 public void increase_chips(int change){
	 chips+=change;
 }
 public void say_hello(){
	 System.out.println("Hello, I am " + name + "."); 
	 System.out.println("I have"+chips+"chips");
 }
}
