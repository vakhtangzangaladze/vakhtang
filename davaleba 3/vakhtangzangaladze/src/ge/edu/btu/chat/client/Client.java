package ge.edu.btu.chat.client;

import java.io.ObjectInputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws  Exception{
        Socket socket = new Socket("localhost" , 1616);
        System.out.println("კლიენტი");

        ObjectInputStream objectInputStream= new ObjectInputStream(socket.getOutputStream());
        //writeObject უცბათ ვერმივხვდი რით შეიძლება შეცვლა არვიცი რატომაა შეცდომა ...
        objectInputStream.writeObject("გამარჯობა")
        System.out.println("მოგესალმებით რით შემიძლია დაგეხმაროთ ?");


        ObjectInputStream objectInputStream= new ObjectInputStream(socket.getOutputStream());
        //writeObject უცბათ ვერმივხვდი რით შეიძლება შეცვლა არვიცი რატომაა შეცდომა ...
        objectInputStream.writeObject("მითხარი ეროვნული ვალუტის კურსი")
        System.out.println("1 usd= 3.6 ლარის , " + " ძაან გაუბერა კურსმა ");


        ObjectInputStream objectInputStream= new ObjectInputStream(socket.getOutputStream());
        //writeObject უცბათ ვერმივხვდი რით შეიძლება შეცვლა არვიცი რატომაა შეცდომა ...
        objectInputStream.writeObject("მაჩვენე ფილიალები")
        System.out.println("სადაა ფილიალები და კარგი ცხოვრება ");

        ObjectInputStream objectInputStream= new ObjectInputStream(socket.getOutputStream());
        //writeObject უცბათ ვერმივხვდი რით შეიძლება შეცვლა არვიცი რატომაა შეცდომა ...
        objectInputStream.writeObject("რა ერქვა სტალინის დიდ ბაბუას ?")
        System.out.println(" სამწუხაროდ ამ თემაზე ინფორმაციას არ ვფლობ ");


        objectInputStream.close();
        socket.close();
    }
}
