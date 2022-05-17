package Main;

import SerialService.SerialService;

import java.util.Arrays;

public class SerialMain extends SerialService {
    public static void main(String[] args) {
        SerialService serialService = new SerialService();

        System.out.println(Arrays.toString(serialService.getserial()));
        serialService.findByName("Moon");
    }
}
