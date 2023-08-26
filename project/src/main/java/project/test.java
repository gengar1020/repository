package project;

import java.io.IOException;
import java.text.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class test {
	public static void main(String[] args) throws ParseException {
		
		String URL = "http://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109";
		Document doc;

		try {
			doc = Jsoup.connect(URL).get();
			Elements elem = doc.select(".date");
			String[] str = elem.text().split(" ");

			Elements todaylist =doc.select(".new_totalinfo dl>dd");
			
			String juga = todaylist.get(3).text().split(" ")[1];
			String DungRakrate = todaylist.get(3).text().split(" ")[6];
			String siga =  todaylist.get(5).text().split(" ")[1];
			String goga = todaylist.get(6).text().split(" ")[1];
			String zeoga = todaylist.get(8).text().split(" ")[1];
			String georaeryang = todaylist.get(10).text().split(" ")[1];

			String stype = todaylist.get(3).text().split(" ")[3]; //���Ѱ�,���,����,���Ѱ�,�϶� ����

			String vsyesterday = todaylist.get(3).text().split(" ")[4];
			
			System.out.println("�Ｚ���� �ְ�------------------");
			System.out.println("�ְ�:"+juga);
			System.out.println("�����:"+DungRakrate);
			System.out.println("�ð�:"+siga);
			System.out.println("��:"+goga);
			System.out.println("����:"+zeoga);
			System.out.println("�ŷ���:"+georaeryang);
			System.out.println("Ÿ��:"+stype);
			System.out.println("���ϴ��:"+vsyesterday);
			System.out.println("�������� �ð�:"+str[0]+str[1]);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
