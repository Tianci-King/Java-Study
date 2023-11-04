import java.util.Scanner;

/**
 * @author tiancy
 * 众数(Mode)查找问题：给定含有n个元素的集合S，每个元素在S中出现的次数称为该元素的重数，
 * S中重数最大的元素称为众数。参考程序JScannerTest.java(P58)，
 */
public class ModeFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = 10;
        int[] array = new int[len+1];
        for(int i = 1; i <= len; i++) {
            array[i] = 0;
        }
        for(int i = 1; i <= len; i++) {
            if(input.hasNextInt()) {
                array[input.nextInt()] += 1;
            }
        }
        int max = -1;
        int zhongshu = -1;
        int chongshu = -1;
        for(int i = 1; i <= len; i++) {
            if(array[i] > max) {
                max = array[i];
                chongshu = max;
            }
        }
        for(int i = 1; i <= len; i++) {
            if(array[i] == chongshu) {
                zhongshu = i;
            }
        }
        System.out.println("众数是：" + zhongshu);
        System.out.println("重数是：" + chongshu);
    }
}
