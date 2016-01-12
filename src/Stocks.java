/**
 * Created by Lexie Infantino on 1/11/2016.
 */
public class Stocks {
    public static void main(String[] args){
        if(args.length > 0){
            String file = args[0];
            String comp = args[0];
            Float low = null;
            Float high = null;
            Float currProf = 0.0f;
            int indexCurr = 0;
            int indexX = 0;
            for (String num : file.split(" ")){
                Float curr=Float.parseFloat(num);
                    for(String x : file.split(" ")){
                        if (Float.parseFloat(x) > curr && (indexCurr + 1) < indexX){
                            Float prof = Float.parseFloat(x) - curr;
                            if(prof > currProf){
                                currProf = prof;
                                low = curr;
                                high = Float.parseFloat(x);

                            }
                        }
                        indexX++;

                }
                indexCurr++;
            }
            System.out.println(low);
            System.out.println(high);
        }
    }
}
