//3) Вивести елементи масиву (масив String) в прямому та зворотньому порядках
public class Test3 {

    public static void main(String[] args){
        String[] myText = { "С++ "," Java "," JavaScript "," Python "," Rubi "," C "," C# ","PHP"};

        for (int i=0; i<myText.length; i++){
            System.out.print(myText[i]);
        }
        System.out.println();
        int n = myText.length;
        String exchange;

        for (int i = 0; i < n/2; i++) {
            exchange = myText[n-i-1];
            myText[n-i-1] = myText[i];
            myText[i] = exchange;
        }
        for (int i=0; i<myText.length; i++){
            System.out.print(myText[i]);
        }
    }
}