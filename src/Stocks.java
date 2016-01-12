/**
 * Created by Lexie Infantino on 1/11/2016.
 */
public class Stocks {
    public static void main(String[] args){
        if(args.length > 0){
            String[] file = args[0].split(" ");
            Float low = null;
            Float high = null;
            Float currProf = 0.0f;
            int indexCurr = 0;
            for (String num : file){
                Float curr=Float.parseFloat(num);
                    for(int i = indexCurr+1; i < file.length; i++){
                        if (Float.parseFloat(file[i]) > curr){
                            Float prof = Float.parseFloat(file[i]) - curr;
                            if(prof > currProf){
                                currProf = prof;
                                low = curr;
                                high = Float.parseFloat(file[i]);

                            }
                        }
                }
                indexCurr++;
            }
            System.out.println(low);
            System.out.println(high);
        }
    }
}
