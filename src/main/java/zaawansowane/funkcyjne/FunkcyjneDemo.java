package zaawansowane.funkcyjne;

interface ActionListener{
    void clickAction();
}

 class Button{

    private String text;
    private ActionListener action;

    public Button(String text) {
        this.text = text;
    }

    public  void click(){
        action.clickAction();
    }

    public void setAction(ActionListener action) {
        this.action = action;
    }
}



public class FunkcyjneDemo {

    public static void main(String[] args) {

        Button button1 = new Button("Start");
        Button button2 = new Button("Koniec");
        ActionListener akcja1 = new ActionListener(){
            @Override
            public void clickAction() {
                System.out.println("startuj");
            }
        };

        ActionListener akcja2 = new ActionListener(){
            @Override
            public void clickAction() {
                System.out.println("Zamknij");
            }
        };
        button1.setAction(akcja1);
        button2.setAction(akcja2);
        button1.click();
        button2.click();




     /*   //Sposób III - stworzenie interfejsu jako nośniku dla kodu - ma jedną metodę abstrakcyjną
        Button button1 = new Button("Start");
        Button button2 = new Button("Koniec");
        ActionListener akcja1 = new ActionListener(){
            @Override
            public void clickAction() {
                System.out.println("startuj");
            }
        };

        ActionListener akcja2 = new ActionListener(){
            @Override
            public void clickAction() {
                System.out.println("Zamknij");
            }
        };
        button1.setAction(akcja1);
        button2.setAction(akcja2);
        button1.click();
        button2.click();*/

//        button1.akcja(System.out.println("startujemy"));
//        button2.akcja(System.out.println("Konczymy"));

        //sposób II - anonimowe klasy
        /*
        *     Button button1 = new Button("Start"){
            @Override
            public void click() {
                System.out.println("Startujemy");
            }
        };
        Button button2 = new Button("Koniec"){
            @Override
            public void click() {
                System.out.println("Kończtymy");
            }
        };*/

    }
}




/*  -- rozne klasy konkretnych przycisków różnie zdefiniują akcje kliknięcia
//Sposób I - zwykłe dziedziczenie abstrakcyjnmychj metod
abstract class Button{

    private String text;


    public Button(String text) {
        this.text = text;
    }

    public abstract void click();
}

* abstract class Button{

    private String text;

    public Button(String text) {
        this.text = text;
    }

    public abstract void click();
}

class ButtonStart extends  Button{
    public ButtonStart(String text) {
        super(text);
    }

    @Override
    public void click() {
        System.out.println("Startujemy");
    }
}
*
* */