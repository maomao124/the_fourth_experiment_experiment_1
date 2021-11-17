/**
 * Project name(项目名称)：第四次实验 实验1
 * Package(包名): PACKAGE_NAME
 * Class(类名): TryTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/17
 * Time(创建时间)： 13:11
 * Version(版本): 1.0
 * Description(描述)：
 * 1、了解异常处理模块中各个语句块的功能
 * 1．编写TryTest.java 程序文件，源代码如下。
 * 2．编译、运行
 * 3．根据运行结果，将程序的运行结果写在实验报告中。
 * 4. 请在实验报告中指出程序中的语句System.out.println("After handling exception return here?"); 有没有被执行？
 */

public class TryTest
{
    public TryTest()
    {
        try
        {
            int[] a = new int[2];
            a[4] = 3;
            System.out.println("After handling exception return here?");    //没有执行
        }
        catch (IndexOutOfBoundsException e)
        {
            System.err.println("exception msg:" + e.getMessage());
            System.err.println("exception string:" + e.toString());
            e.printStackTrace();
        }
        finally
        {
            System.out.println("-------------------");
            System.out.println("finally");
        }
        System.out.println("No exception?");
    }

    public static void main(String[] args)
    {
        new TryTest();
    }

}
