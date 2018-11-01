package Test;

/*
 *  To index keyWord from data csv file
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Index {
	
	public static String filePath = "E://data_3.csv";

	public static void main(String[] args) {
		
		String keyWord = "Èí¼þ";
		String[] result = indexData(keyWord);
		System.out.println(result[0]);
		
	}
	
	public static String[] indexData(String keyWord) {
		
		String[] result = new String[5000];
		String[] data;
		data = readData();
		
		int cursor = 0;
		for(String row : data) {
			if(row == null) {
				continue;
			}
			int flag = row.indexOf(keyWord);
			if(flag != -1) {
				
				System.out.println(keyWord+":"+row);
				result[cursor] = row;
				cursor++;
			}
		}
		
		return result;
	}
	
	public static String[] readData() {
		
		File file = new File(filePath);
		String[] data = new String[5000];
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            int cursor = 0;
            String item;
			while((item = br.readLine())!=null){
                data[cursor] = item;
                cursor++;
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return data;
	}
}

