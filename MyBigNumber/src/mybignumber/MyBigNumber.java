/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dao Vinh Phat
 * MyBigNumber là hàm để thực hiện phép cộng 2 chuỗi số
 */
public class MyBigNumber {

    /**
     * @param args the command line arguments
     */
    private IReceiver ireceiver;
    
    public MyBigNumber(final IReceiver ireceiver){
        this.ireceiver = ireceiver;
    }

    
    /**
     * Để thực hiện phép cộng, ta cần 2 chuỗi làm tham số trong đó:
     * 2 tham số này đều chỉ chứa các kí số từ '0' đến '9'.
     * <br/>
     *
     * @param s1 chuỗi số thứ nhất.
     * @param s2 chuỗi số thứ hai.
     * @return chuỗi có giá trị là tổng của hai số s1 và s2.
    */
    
    public String sum(final String s1, final String s2){
        int lengths1 = s1.length();
        int lengths2 = s2.length();
        int poss1 = 0;
        int poss2 = 0;
        int remember = 0;
        char c1, c2;
        int sum2s = 0;
        String result = "";
        String instruction = "";
        
        for(int i = 0; i < ((lengths1 > lengths2) ? lengths1 : lengths2); i++){
            /* cập nhật lại vị trí 2 chuỗi */
            poss1 = lengths1 - i - 1;
            poss2 = lengths2 - i - 1;
            
            /* kiểm tra 2 ký tự có lớn hơn hoặc bằng 0 hay không */
            c1 = (poss1 >= 0) ? s1.charAt(poss1) : '0';
            c2 = (poss2 >= 0) ? s2.charAt(poss2) : '0';
            
            sum2s = (c1 - '0') + (c2 - '0') + remember;
            result = (sum2s % 10) + result;
            remember = sum2s / 10;
            instruction = "Step " + (i + 1) + ": " + c1 + " + " + c2 + " = " + (sum2s - remember) + " + "
                    + remember + " = " + sum2s + ".Get " + sum2s % 10 + " remember " + remember + ".\n";
            this.ireceiver.print(instruction); 
        }
        
        if(remember > 0)
            result = 1 + result;
        
        return result;
    }
}
