package myProject;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int user = getUser();
		int pc = getPc();
		
		String result = judgeGame(user, pc);
		String userLetter = convert(user);
		String pcLetter = convert(pc);
		
		
		System.out.println("あなたの手は" + userLetter);
		System.out.println("PCの手は" + pcLetter);
		System.out.println(result);
	}


public static int getUser() {
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("じゃんけんをしましょう");
		System.out.println("(0 : グー ,  1 : チョキ , 2 : パー)");
		System.out.println("入力してEnterを押してください。: ");
		int num = sc.nextInt();
		
		if(num < 0 || num > 3) {
			System.out.println("入力できるのは0~3の数字です。");
			continue;
		} else {
			return num;
		}
	}

	}

public static int getPc() {
	Random rand = new Random();
	return rand.nextInt(3);
 
}	

public static String judgeGame(int user, int pc) {
	String result;
	
	if((user == 0 && pc == 1) || (user == 1 && pc == 2) || (user == 2 && pc == 0)) {
		result = "おめでとうございます！あなたの勝利です!";
	} else if ((user == 0 && pc == 2) || (user == 1 && pc == 0) || (user == 2 && pc == 1)) {
		result = "残念！　あなたの負けです！";
	} else {
		result = "あいこです！";
	}
	
	return result;
}

public static String convert(int num) {
	String numLetter = "";
	
	switch(num) {
	case 0:
		numLetter = "グー";
		break;
	case 1:
		numLetter = "チョキ";
		break;
	case 2:
		numLetter = "パー";
	}
	return numLetter;
	
}
}