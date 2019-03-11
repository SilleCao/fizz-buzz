package cn.sille.fizzbuzz;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: Sille_Cao
 * Date:2019/3/11 11:32
 * Description:
 */
@Slf4j
public class FizzBuzzGame {
    public static final int FUN_NUM_THREE = 3;
    public static final int FUN_NUM_FIVE = 5;
    public static final int FUN_NUM_TARGET = 100;

    /**
     * Check whether the input parameters are valid
     * @param args
     * @return
     */
    public static Boolean valid(String... args){
        if(args.length < 1){
            log.error("Please pass in the startup parameters.");
            return false;
        }
        try {
            Integer number = Integer.parseInt(args[0]);
            if(number < 0){
                log.error(number + " is not a positive integer.");
                throw new NumberFormatException(number + " is not a positive integer.");
            }
        } catch (NumberFormatException e) {
            log.error("Please pass in a positive integer.");
            return false;
        }
        return true;
    }

    /**
     * A number is Fizz if it is divisible by 3
     * A number is Buzz if it is divisible by 5
     * A number is FizzBuzz if it is divisible by 3
     * @param args
     */
    public static void processStage1(String... args){
        if(FizzBuzzGame.valid(args)){
            int number = Integer.parseInt(args[0]);
            do{
                if(number % FUN_NUM_THREE == 0){
                    if(number % FUN_NUM_FIVE == 0){
                        log.info("FizzBuzz");
                    }else{
                        log.info("Fizz");
                    }
                }else if(number % FUN_NUM_FIVE == 0){
                    log.info("Buzz");
                }else{
                    log.info(String.valueOf(number));
                }
                number ++;
            }while(number <= FUN_NUM_TARGET);
        }
    }

    /**
     * A number is Fizz if it is divisible by 3 or if it has a 3 in it
     * A number is Buzz if it is divisible by 5 or if it has a 5 in it
     * A number is FizzBuzz if it is divisible by 3 or 5 or if it has a 5 in it
     * @param args
     */
    public static void processStage2(String... args){
        if(FizzBuzzGame.valid(args)){
            int number = Integer.parseInt(args[0]);
            do{
                if(number % FUN_NUM_THREE == 0 || String.valueOf(number).contains(String.valueOf(FUN_NUM_THREE))){
                    if(number % FUN_NUM_FIVE == 0){
                        log.info("FizzBuzz");
                    }else{
                        log.info("Fizz");
                    }
                }else if(number % FUN_NUM_FIVE == 0 || String.valueOf(number).contains(String.valueOf(FUN_NUM_FIVE))){
                    log.info("Buzz");
                }else{
                    log.info(String.valueOf(number));
                }
                number ++;
            }while(number <= FUN_NUM_TARGET);
        }
    }

    public static void main(String[] args) {
        //test parameters
        args = new String[]{"1"};
        FizzBuzzGame.processStage1(args);
        log.info("===============================================================");
        args = new String[]{"10"};
        FizzBuzzGame.processStage1(args);
        log.info("===============================================================");
        args = new String[]{"1"};
        FizzBuzzGame.processStage2(args);
        log.info("===============================================================");
        args = new String[]{"10"};
        FizzBuzzGame.processStage2(args);
    }
}
