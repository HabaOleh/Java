package Classwork2.Task2;

public class Main {
    public static void main(String[] args) {

        Gitara gitara1 = new Gitara(4);
        Baraban baraban1 = new Baraban(55);
        Truba truba1 = new Truba(5);
        Gitara gitara2 = new Gitara(6);
        Baraban baraban2 = new Baraban(60);

        Instrument[] arr = new Instrument[5];
        arr[0]=gitara1;
        arr[1]=truba1;
        arr[2]=baraban2;
        arr[3]=gitara2;
        arr[4]=baraban1;

        for(Instrument ones: arr){
            ones.play();
        }

    }
}
