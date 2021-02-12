package oslomet.webprog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {
    private final Integer[] tempArray = new Integer[]{-3,-2,2,7,12,16,18,17,12,7,3,-2};

    @GetMapping("/")

    public int returTemp(String innmaaned){

        int temp = 0;

        switch (innmaaned){
            case "januar":
                temp = tempArray[0];
                break;
            case "februar":
                temp = tempArray[1];
                break;
            case "mars":
                temp = tempArray[2];
                break;
            case "april":
                temp = tempArray[3];
                break;
            case "mai":
                temp = tempArray[4];
                break;
            case "juni":
                temp = tempArray[5];
                break;
            case "juli":
                temp = tempArray[6];
                break;
            case "august":
                temp = tempArray[7];
                break;
            case "september":
                temp = tempArray[8];
                break;
            case "oktober":
                temp = tempArray[9];
                break;
            case "november":
                temp = tempArray[10];
                break;
            case "desember":
                temp = tempArray[11];
                break;
        }
        return temp;
    }
}
