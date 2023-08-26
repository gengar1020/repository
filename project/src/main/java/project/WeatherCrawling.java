package project;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WeatherCrawling {

	public static void main(String[] args) {
	    try {
	    	Document doc = Jsoup.connect("http://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109").get();
	    	Elements eles1 = doc.select("location");	    	
	    	for(Element ele1 : eles1){
	    		Elements area = ele1.select("city");
	    		Elements eles2 = ele1.select("data");
	    		for(Element ele2 : eles2){
	    			System.out.println(ele2.select("tmEf"));
	    			System.out.println(ele2.select("wf"));
	    			System.out.println(ele2.select("tmn"));
	    			System.out.println(ele2.select("tmx"));
	    			System.out.println(ele2.select("rnSt"));
	    		}
	    	}
	    }catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}