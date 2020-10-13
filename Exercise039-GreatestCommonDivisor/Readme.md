##  题目要求   
####  使用欧几里得算法求两个正整数的最大公约数。该算法依赖于以下两个等式：
> GCD(a, 0) = a

> GCD(a, b) = GCD(b, a mod b)

例如：
> GCD(3456,1233) = GCD(1233,990) = GCD(990,243) = GCD(243,18) = GCD(18,9) = GCD(9,0) = 9

####  题目输入为两个非负整数，输出为这两个非负整数的最大公约数。
####  请分别以递归和非递归两种方式实现求GCD的算法。

##  示例
>输入：

> 3456 1233

>输出：

>  9

