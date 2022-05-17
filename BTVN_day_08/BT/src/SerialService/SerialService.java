package SerialService;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SerialService extends Serial{


    public   Serial[] getserial(){
        Serial[] serials = {
                new Serial(1,"WandaVison","sitcom"," Matt Shakman",2021,9,40),
                new Serial(2,"The Falcon and the Winter Soldier","Superhero"," Kari Skogland",2021,6,40),
                new Serial(3,"Loki","superhero","Kate Herron",2021,6,40),
                new Serial(4,"What if ? ","superhero","Bryan Andrews",2021,9,27),
                new Serial(5,"Hawkeye","Action fiction","Bert and Bernie",2021,6,40),
                new Serial(6,"Moon Knight"," Action fiction"," Mohamed Diab",2022,6,40 ),
        };
       return serials;
    }
    public void findByName(String name){
        int count = 0 ;
        for (Serial serial: getserial()) {
           if (serial.getTitle().contains(name)){
               System.out.println(serial);
           }
           if (count == 0){
               System.out.println("Khong co phim phu hop voi ten : " + name );
           }
           break;
        }
    }


}
