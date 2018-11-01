package Test;

/*
 * To crawl data from "http://jiuye.fdzcxy.com"
 * 		Jsoup.connect(url).timeout(5000).get()
 * 		get method to download html, timeout 5s.
 */


import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Spider {
	//public static String sourceUrl = "http://jiuye.fdzcxy.com";
	public static String sourceUrl = "https://m.douban.com/time/column/99/?dt_time_source=douban-web_anonymous";
	public static String source = "福州大学至诚学院就业信息网";
	public static String filePath = "E://Data_3.csv";
	
	public static void main(String[] args) throws InterruptedException{
		
		initFile();
		//for(int i=1;i<2;i++) {
			//String url = sourceUrl + "/jobs/" + i;
			String url = sourceUrl;
			try {
				run(url);
			} catch (IOException e) {
				e.printStackTrace();
			}
			Thread.sleep(2);
		//}
	};
	
	public static void run(String url) throws IOException{
		
		Document doc = null;
		doc = Jsoup.connect(url).timeout(3000).get();
		
		Element newsList = null;
		//newsList = doc.getElementsByClass("newslist").get(0);
		newsList = doc.getElementsByClass("TalionNav-primary").get(0);
		
		Elements aList = null;
		aList = newsList.getElementsByTag("a");
		
		String[] rows = new String[0];
		int cursor = 0;
		for(Element a : aList) {
			
			Element span = a.getElementsByClass("am-fr").get(0);
			String postTime = span.text();
			String company = a.attr("title");
			String title = a.text();
			String href = sourceUrl + a.attr("href");
			
			Document detailDoc = null;
			detailDoc = Jsoup.connect(href).timeout(5000).get();
			//Element newsContent = detailDoc.getElementsByClass("newscontent").get(0);
			
			//String content = newsContent.text().replace(',', '，');
			//String content = newsContent.text().replace(",", "，");
			
			String item = source + "," + company + "," + postTime + "," + title ;
			//System.out.println(content);
			System.out.println(company+title+postTime);
			rows[cursor] = item;
			cursor ++;
			//writeData(item);
		}
		writeData(rows);
	}
	
	
	public static void initFile() {
		
		File file = new File(filePath);
        if (file.exists()) {
            System.out.println("file exists");
        } else {
            System.out.println("file not exists, create it ...");
            try {
                file.createNewFile();
                String[] rows = {"source,company,postTime,title"};
                writeData(rows);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	};
	
	public	static void writeData(String[] rows) throws IOException {
		
		for(String row : rows) {
			if(row != null){
			File f = new File(filePath);
			FileOutputStream fop = new FileOutputStream(f, true);
			OutputStreamWriter writer = new OutputStreamWriter(fop, "gbk");
			//writer.append(row.replace("\n", " ")+"\r\n");
			//writer.append(row.replace(oldChar, newChar));
			writer.close();
			fop.close();
			}
		}
	};

}

