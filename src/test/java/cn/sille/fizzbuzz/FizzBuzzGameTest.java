package cn.sille.fizzbuzz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author: Sille_Cao
 * Date:2019/3/11 14:07
 * Description:
 */
public class FizzBuzzGameTest {

    @Test
    public void processStage1() {
        String[] args = new String[]{};
        FizzBuzzGame.processStage1(args);

        args = new String[]{"-1"};
        FizzBuzzGame.processStage1(args);

        args = new String[]{"a"};
        FizzBuzzGame.processStage1(args);

        args = new String[]{"a"};
        FizzBuzzGame.processStage1(args);

        args = new String[]{"1"};
        FizzBuzzGame.processStage1(args);

//        assertTrue(true);
    }

    @Test
    public void processStage2() {
        String[] args = new String[]{};
        FizzBuzzGame.processStage2(args);

        args = new String[]{"-1"};
        FizzBuzzGame.processStage2(args);

        args = new String[]{"a"};
        FizzBuzzGame.processStage2(args);

        args = new String[]{"a"};
        FizzBuzzGame.processStage2(args);

        args = new String[]{"1"};
        FizzBuzzGame.processStage2(args);

//        assertTrue(true);
    }
}