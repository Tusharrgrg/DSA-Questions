import java.util.Scanner;

public class weirdAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        long n = sc.nextLong();

        while (n > 1) {
            sb.append(n + " ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
        }
        sc.close();
        sb.append(1);
        System.out.println(sb.toString());
    }
}

//n = 138367

// 138367 415102 207551 622654 311327 933982 466991 1400974 700487 2101462
// 1050731 3152194 1576097 4728292 2364146 1182073 3546220 1773110 886555
// 2659666 1329833 3989500 1994750 997375 2992126 1496063 4488190 2244095
// 6732286 3366143 10098430 5049215 15147646 7573823 22721470 11360735 34082206
// 17041103 51123310 25561655 76684966 38342483 115027450 57513725 172541176
// 86270588 43135294 21567647 64702942 32351471 97054414 48527207 145581622
// 72790811 218372434 109186217 327558652 163779326 81889663 245668990 122834495
// 368503486 184251743 552755230 276377615 829132846 414566423 1243699270
// 621849635 1865548906 932774453 2798323360 1399161680 699580840 349790420
// 174895210 87447605 262342816 131171408 65585704 32792852 16396426 8198213
// 24594640 12297320 6148660 3074330 1537165 4611496 2305748 1152874 576437
// 1729312 864656 432328 216164 108082 54041 162124 81062 40531 121594 60797
// 182392 91196 45598 22799 68398 34199 102598 51299 153898 76949 230848 115424
// 57712 28856 14428 7214 3607 10822 5411 16234 8117 24352 12176 6088 3044 1522
// 761 2284 1142 571 1714 857 2572 1286 643 1930 965 2896 1448 724 362 181 544
// 272 136 68 34 17 52 26 13 40 20 10 5 16 8 4 2 1