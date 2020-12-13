package hello.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CoreApplication.class, args);
		Scanner scan = new Scanner(System.in);
		System.out.println("endNum을 작성해주세요");
		int endNum = scan.nextInt();
		System.out.println("입력값 : " + endNum);

		String changeI;
		int count = 0;

		for(int i = 1; i <= endNum; i++)
		{
			changeI = Integer.toString(i);
			System.out.println(changeI.getClass().getName() + "," + changeI);
			for(int j = 0; j < changeI.length(); j++)
			{
				if(changeI.charAt(j) == '3' || changeI.charAt(j) == '6' || changeI.charAt(j) == '9')
				{
					count++;
				}
			}
		}
		System.out.println("count = " + count);

	}

}
