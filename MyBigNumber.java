public class MyBigNumber{
	public static void main(String args[]){
		System.out.print(sumString("555","666"));
	}
	
	private static String sumString(String str1,String str2){
        String result = "";	//biến lưu kết quả của 2 chuỗi
        int i = 1;	//biến đếm cho vòng lặp
        int remember = 0;	//biến nhớ
        int sum = 0;		//biến lưu kết quả của 2 kí số
        
		if (str1.length() < str2.length()){		//so sánh độ dài 2 chuỗi
            String swap = str2;
            str2 = str1;
            str1 = swap;
        } 
        
        while (str1.length() - i >= 0){		//chạy vòng lặp để tham chiếu đến từng kí tự của chuổi
            if (sum >= 10)		//lưu biến nhớ là 1 nếu kết quả cộng 2 kí số lớn hơn 10 
                remember = 1;	
            else
                remember = 0;
			
			if (str2.length() - i >= 0)		//kiểm tra xem đã xét hết chuỗi chưa
				sum = str1.charAt(str1.length() - i)-'0' + str2.charAt(str2.length() - i)-'0' + remember;	//công từng kí số của chuỗi 1 và chuỗi 2 và phần nhớ nếu có
            else
				sum = str1.charAt(str1.length() - i)-'0' + remember;
            
            result = Integer.toString(sum % 10) + result;	//ghi kết quả cộng vào biến kết quả
            i++ ;
        }
        
        if (remember == 1)			// ghi phần nhớ vào nếu phép cộng vượt số
            result = Integer.toString(remember) + result;
		
        return result;
    }
}