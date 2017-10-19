import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Сергей on 19.10.2017.
 */
public class Main {

    public static void main(String[] args) {

            try(FileWriter writer = new FileWriter("src/resource/log.txt ",true))
            {
                String text = "SomeText";
                for(int i = 0;i<20;i++){
                    writer.write(text + " "+i);
                    writer.append('\n');
                }
                writer.flush();
            }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}
