package me.sombrero;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Moja moja = new MagicMoja();
        System.out.println(moja.pullOut());

        MyMoja myMoja = new MagicMyMoja();
        System.out.println(myMoja.pullOut());
    }
}
