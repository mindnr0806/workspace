package com.kh.practice;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest {

	public static void main(String[] args) {
		//Date : 날짜 시간 관련 클래스
		Date date = new Date(0);
		System.out.println(date.getMonth()+1 	//getMonth() : int =>0~11까지 
								+"/"+date.getDate());
		//LocalDateTime  (jave.time.LocalDateTime)
		/*[객체생성]
		 * -현재 날짜시간 기준으로 생성 : LocalDateTime.now()
		 * -년,월,일 입력하여 생성 : LocalDateTime.of(LocalDate,of(int year, int month, int daypfMonth))
		 * 
		 * 
		 * [날짜정보 조화]
		 *-월(month) : 변수명.getmonth() //영어로 월 정보를반환
		 *				변수명. getmonthValue // 숫자
		 * 
		 */
								
		LocalDateTime date2 = LocalDateTime.now();
		
		System.out.println(date2.getMonth());
		System.out.println(date2.getMonthValue() + "/" + date2.getDayOfMonth());
		
		LocalDateTime birth = LocalDateTime.of(LocalDate.of(2005,9,23),
												LocalTime.of(16,0));
		System.out.println(birth.getMonth() + ", " + birth.getDayOfMonth() + ", " +birth.getDayOfMonth());
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	System.out.println(sdf.format(date));
	
	//1) LocalDateTime -> Date 변경 후 포멧 적용
	Timestamp dateOfBirth = java.sql.Timestamp.valueOf(birth);
	System.out.println(sdf.format(dateOfBirth));
	
	System.out.println(birth.format(DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm:ss")));
	//------------------------
	//올해 며칠 남았는 지?
	//오늘 퇴근까지 몇시간 남았는지?(getDayOfYerar()아용)
	LocalDateTime today = LocalDateTime.now();
	System.out.println("올해는 " + (366 - today.getDayOfYear()) + "일 남았구나...");
	
	System.out.println("오늘 퇴근까지 " + (18 - today.getHour()) + "시간 남았구나");
	
	
	
	}

}
