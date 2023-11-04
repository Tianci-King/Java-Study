
/**
 * @author tiancy
 * 请编程TwinPrime.java找出10000以内的孪生素数对，并给出10000以内两个相邻素数之间的最大差值。
 */
public class TwinPrime {
    public static void main(String[] args) {
        findTwinPrime();
        findPrime();
    }

    /**
     * 查找孪生素数
     */
    public static void findTwinPrime() {
        // (p , p+2)是孪生素数对，那么所有的偶数均不可能是孪生素数对
        //循环遍历，输出孪生素数
        System.out.println("10000以内的孪生素数是：");
        for(int number = 3; number < 10000 - 2; number += 2) {
            if(checkPrime(number) && checkPrime(number+2)) {
                System.out.println(number + "和" + (number+2));
            }
        }
        System.out.println("-----------------");
    }

    /**
     * 查找10000相邻素数中最大的差值
     */
    public static void findPrime() {
        System.out.print("10000以内的素数差值最大为：");
        int result = 0;
        int primeBefore = 2;
        for(int number = 3; number < 10000; number += 2) {
            if(checkPrime(number)) {
                result = number - primeBefore;
                primeBefore = number;
            }
        }
        System.out.println(result);
        System.out.println("-----------------");
    }

    /**
     * 检查num 是否为素数
     */
    public static boolean checkPrime(int num) {
        int checkNum = 3;
        while(checkNum <= Math.sqrt(num)) {
            if(num % checkNum == 0) {
                return false;
            }
            checkNum += 2;
        }
        return true;
    }
}